package ru.ok.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.grafika.EncoderConfig;
import com.ironsource.InterfaceC4413l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicLong;
import javax.microedition.khronos.opengles.GL10;
import ru.ok.media.api.PublisherRenderer;
import ru.ok.media.api.PublisherRendererCallback;
import ru.ok.media.utils.FPSLogger;
import ru.ok.media.utils.RotationController;
import ru.ok.media.utils.TimeSamplerDummy;
import ru.ok.media.utils.TimeSamplerHelper;
import ru.ok.media.utils.TimeSamplerIface;
import ru.ok.media.utils.TimedEvent;
import ru.ok.media.utils.VideoAspect;
import ru.ok.media.utils.VideoSize;
import ru.ok.media.video.FrameBuffer;
import xsna.cgn;
import xsna.hoo0;
import xsna.ne7;
import xsna.ul9;
import xsna.vl9;
import xsna.xus;
import xsna.yis0;
import xsna.zds0;

/* loaded from: classes9.dex */
public class PublisherSurfaceRenderer implements PublisherRenderer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long BENCHMARK_MAX_TIME_MS = 20000;
    private static final String TAG = "PublisherSurfaceRenderer";
    private boolean cfgCrashOnDrawError;
    private EncoderConfig encoderConfig;
    private int fboRotation;
    private FrameBuffer frameBuffer;
    private int iframeIntervalSeconds;
    private boolean isExternalTexture;
    private int mBitrate;
    private boolean mCameraIsExternal;
    private Context mContext;
    private int mFrameRate;
    private final AtomicLong mFramesCaptured;
    private long mFramesRendered;
    private int mIncomingHeight;
    private int mIncomingWidth;
    private boolean mIsFront;
    private final hoo0 mVideoEncoder;
    private volatile VideoSize maxRenderSize;
    private yis0 overriddenEncoderTexture;
    private int previewOrientation;
    private VideoSize previewSize;
    private ul9 programBasic;
    private PublisherRendererCallback rendererCallback;
    private RotationController rotationController;
    private zds0 videoDataCallback;
    private int mEncoderRotation = -1;
    private boolean mEncoderRotationLocked = false;
    private int mRotation = -1;
    private final RenderParams renderParams = new RenderParams();
    private boolean prevFrameEncoded = false;
    private long groupFramesEncoded = 0;
    private long consecutiveFramesEncoded = 0;
    private volatile TimedEvent benchStartEvent = new TimedEvent();
    private final TimeSamplerIface drawSampler = new TimeSamplerDummy(20, "drawSampler");
    private final TimeSamplerIface encodeSampler = new TimeSamplerDummy(20, "encodeSampler");
    private FPSLogger fpsLogger = new FPSLogger();
    private yis0 textureInfo = null;

    public class RenderParams {
        public int fboHeight;
        public int fboWidth;
        private final float[] mSTMatrix;
        public VideoSize previewSize;

        public RenderParams() {
            float[] fArr = new float[16];
            this.mSTMatrix = fArr;
            Matrix.setIdentityM(fArr, 0);
        }

        public void update() {
            VideoSize videoSize;
            if (PublisherSurfaceRenderer.this.isExternalTexture) {
                SurfaceTexture inputSurfaceTexture = PublisherSurfaceRenderer.this.rendererCallback.getInputSurfaceTexture();
                if (inputSurfaceTexture != null) {
                    inputSurfaceTexture.getTransformMatrix(this.mSTMatrix);
                }
            } else {
                Matrix.setIdentityM(this.mSTMatrix, 0);
            }
            this.previewSize = PublisherSurfaceRenderer.this.previewSize;
            boolean z = (PublisherSurfaceRenderer.this.fboRotation + 360) % 180 == 90;
            if (z) {
                this.previewSize = this.previewSize.rotate(90);
            }
            VideoSize aspectAdjustedSize = VideoAspect.getAspectAdjustedSize(VideoSize.HD_VIDEO_SIZE, this.previewSize.getWidth(), this.previewSize.getHeight());
            VideoSize videoSize2 = PublisherSurfaceRenderer.this.maxRenderSize.getMax() < aspectAdjustedSize.getMax() ? PublisherSurfaceRenderer.this.maxRenderSize : aspectAdjustedSize;
            if (videoSize2.getMin() > 0) {
                int max = videoSize2.getMax();
                VideoSize videoSize3 = VideoSize.FASTEST_VIDEO_SIZE;
                if (max < videoSize3.getMax()) {
                    videoSize2 = videoSize3;
                }
                videoSize = new VideoSize(videoSize2.getMax(), videoSize2.getMin());
                if (aspectAdjustedSize.getHeight() > aspectAdjustedSize.getWidth()) {
                    videoSize = videoSize.rotate(90);
                }
            } else {
                videoSize = aspectAdjustedSize;
            }
            this.fboWidth = videoSize.getWidth();
            this.fboHeight = videoSize.getHeight();
            float width = aspectAdjustedSize.getWidth() / this.previewSize.getWidth();
            float height = aspectAdjustedSize.getHeight() / this.previewSize.getHeight();
            if (!z) {
                height = width;
                width = height;
            }
            if (width < 1.0f) {
                Matrix.translateM(this.mSTMatrix, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (1.0f - width) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            Matrix.scaleM(this.mSTMatrix, 0, height, width, 1.0f);
        }
    }

    public PublisherSurfaceRenderer(Context context, hoo0 hoo0Var, boolean z, AtomicLong atomicLong, RotationController rotationController) {
        this.mContext = context;
        this.mVideoEncoder = hoo0Var;
        this.cfgCrashOnDrawError = z;
        this.mFramesCaptured = atomicLong;
        this.rotationController = rotationController;
    }

    @NonNull
    private EncoderConfig createEncoderConfig() {
        int i;
        int i2;
        boolean z = this.mVideoEncoder.l;
        if (this.mEncoderRotation == -1 || !this.mEncoderRotationLocked) {
            if (z) {
                this.mEncoderRotation = this.mRotation;
            } else {
                this.mEncoderRotationLocked = true;
            }
        }
        int i3 = this.mIncomingWidth;
        int i4 = this.mIncomingHeight;
        if ((this.mEncoderRotation + 3600) % 180 == 90) {
            i2 = i3;
            i = i4;
        } else {
            i = i3;
            i2 = i4;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder("createEncoderConfig() - ");
        sb.append(this.mIsFront ? "front" : "back");
        sb.append(" incoming ");
        sb.append(this.mIncomingWidth);
        sb.append("x");
        sb.append(this.mIncomingHeight);
        sb.append("@");
        cgn.a(this.mRotation, i, " -> ", "x", sb);
        sb.append(i2);
        sb.append("@");
        sb.append(this.mEncoderRotation);
        ne7.m(str, sb.toString());
        int i5 = this.mEncoderRotation;
        int i6 = this.mBitrate;
        return new EncoderConfig(i, i2, i5, i6, i6, this.mFrameRate, this.iframeIntervalSeconds, EncoderConfig.CBRMode.DISABLED);
    }

    private boolean encodeFrame(GL10 gl10) {
        updateRecordingState();
        this.mVideoEncoder.d = this.encoderConfig;
        zds0 zds0Var = this.videoDataCallback;
        if (zds0Var != null && zds0Var.isBlocked()) {
            ne7.J(TAG, "encodeFrame() - Encoder buffers are full, discarding video frame");
            return false;
        }
        hoo0 hoo0Var = this.mVideoEncoder;
        hoo0Var.m = zds0Var;
        return hoo0Var.a(this.mContext, gl10);
    }

    private boolean isEncoderTextureOverridden() {
        yis0 yis0Var = this.overriddenEncoderTexture;
        return yis0Var != null && yis0Var.a();
    }

    private boolean renderToFBO(GL10 gl10) {
        boolean z;
        boolean z2;
        yis0 yis0Var;
        if (this.programBasic == null) {
            return false;
        }
        if (this.frameBuffer == null) {
            RenderParams renderParams = this.renderParams;
            this.frameBuffer = new FrameBuffer(renderParams.fboWidth, renderParams.fboHeight, true);
            ul9 ul9Var = this.programBasic;
            int width = this.previewSize.getWidth();
            int height = this.previewSize.getHeight();
            ul9Var.n = width;
            ul9Var.o = height;
            z = true;
        } else {
            z = false;
        }
        if (this.frameBuffer.getWidth() != this.renderParams.fboWidth || this.frameBuffer.getHeight() != this.renderParams.fboHeight) {
            this.frameBuffer.release();
            RenderParams renderParams2 = this.renderParams;
            this.frameBuffer = new FrameBuffer(renderParams2.fboWidth, renderParams2.fboHeight, true);
            ul9 ul9Var2 = this.programBasic;
            int width2 = this.previewSize.getWidth();
            int height2 = this.previewSize.getHeight();
            ul9Var2.n = width2;
            ul9Var2.o = height2;
            z = true;
        }
        if (z) {
            updateRecordingState();
        }
        boolean beforeRenderToFBO = this.rendererCallback.beforeRenderToFBO(gl10, this.frameBuffer, this.renderParams.mSTMatrix);
        if (beforeRenderToFBO || (yis0Var = this.textureInfo) == null || !yis0Var.a()) {
            z2 = false;
        } else {
            RenderParams renderParams3 = this.renderParams;
            gl10.glViewport(0, 0, renderParams3.fboWidth, renderParams3.fboHeight);
            PublisherRendererCallback publisherRendererCallback = this.rendererCallback;
            RenderParams renderParams4 = this.renderParams;
            int inputTextureId = publisherRendererCallback.getInputTextureId(gl10, renderParams4.fboWidth, renderParams4.fboHeight);
            this.frameBuffer.bind();
            float[] l = xus.l(this.isExternalTexture ? this.fboRotation : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
            this.programBasic.k = this.renderParams.mSTMatrix;
            ul9 ul9Var3 = this.programBasic;
            ul9Var3.j = l;
            RenderParams renderParams5 = this.renderParams;
            ul9Var3.s(inputTextureId, renderParams5.fboWidth, renderParams5.fboHeight);
            this.frameBuffer.unbind();
            z2 = true;
        }
        boolean z3 = z2 || beforeRenderToFBO;
        if (z3) {
            this.rendererCallback.afterRenderToFBO(gl10, this.frameBuffer);
        }
        this.fpsLogger.tick();
        return z3;
    }

    private void setTextureInfo(@Nullable yis0 yis0Var) {
        yis0 yis0Var2;
        hoo0 hoo0Var = this.mVideoEncoder;
        if (yis0Var != null) {
            hoo0Var.getClass();
            yis0Var2 = new yis0(yis0Var.a, yis0Var.d, yis0Var.b, yis0Var.c, yis0Var.e, yis0Var.f);
        } else {
            yis0Var2 = null;
        }
        hoo0Var.b = yis0Var2;
        this.textureInfo = yis0Var;
    }

    private void updateBenchmarkState() {
        TimedEvent timedEvent = this.benchStartEvent;
        boolean z = false;
        if (timedEvent == null || !this.mVideoEncoder.l) {
            this.benchStartEvent = null;
        } else {
            timedEvent.signalOnce();
            if (timedEvent.elapsed() <= BENCHMARK_MAX_TIME_MS) {
                z = true;
            }
        }
        hoo0 hoo0Var = this.mVideoEncoder;
        if (hoo0Var.h && !z) {
            hoo0Var.k = true;
        }
        hoo0Var.h = z;
    }

    private void updateFrame() {
        SurfaceTexture inputSurfaceTexture = this.rendererCallback.getInputSurfaceTexture();
        if (inputSurfaceTexture != null) {
            inputSurfaceTexture.updateTexImage();
        }
    }

    @Override // ru.ok.media.api.PublisherRenderer
    public void cleanupGl() {
        notifyPausing();
    }

    @Override // ru.ok.media.api.PublisherRenderer
    public int getFboRotation() {
        return this.fboRotation;
    }

    @Override // ru.ok.media.api.PublisherRenderer
    public void init(boolean z) {
        ul9 ul9Var = this.programBasic;
        if (ul9Var != null) {
            GLES20.glDeleteProgram(ul9Var.e);
            ul9Var.e = -1;
        }
        if (z) {
            this.programBasic = new vl9(this.mContext);
        } else {
            this.programBasic = new ul9(this.mContext);
        }
        this.isExternalTexture = z;
    }

    public void notifyPausing() {
        ul9 ul9Var = this.programBasic;
        if (ul9Var != null) {
            GLES20.glDeleteProgram(ul9Var.e);
            ul9Var.e = -1;
            this.programBasic = null;
        }
        FrameBuffer frameBuffer = this.frameBuffer;
        if (frameBuffer != null) {
            frameBuffer.release();
            this.frameBuffer = null;
            updateRecordingState();
        }
        this.mVideoEncoder.d();
        this.mVideoEncoder.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r2.switchTo(r10.encodeSampler);
        r1 = encodeFrame(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r1 == r10.prevFrameEncoded) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r1 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r10.consecutiveFramesEncoded = 1;
        maybeWriteFrameBufferToFile(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        r10.prevFrameEncoded = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r2.stop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        r10.consecutiveFramesEncoded = 0;
        r10.groupFramesEncoded++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r1 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r10.consecutiveFramesEncoded++;
        maybeWriteFrameBufferToFile(r11);
     */
    @Override // ru.ok.media.api.PublisherRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderFrame(GL10 gl10) {
        RuntimeException runtimeException;
        boolean z;
        boolean z2;
        try {
            long j = this.mFramesCaptured.get();
            long j2 = this.mFramesRendered;
            boolean z3 = true;
            if (j > j2) {
                this.mFramesRendered = j2 + 1;
                updateFrame();
                z = true;
            } else {
                z = false;
            }
            TimeSamplerHelper timeSamplerHelper = new TimeSamplerHelper();
            this.fboRotation = this.rotationController.getUserRotation(this.mRotation, this.mIsFront, this.mCameraIsExternal);
            PublisherRendererCallback publisherRendererCallback = this.rendererCallback;
            this.overriddenEncoderTexture = publisherRendererCallback != null ? publisherRendererCallback.getOverriddenEncoderTexture() : null;
            boolean isEncoderTextureOverridden = isEncoderTextureOverridden();
            if (z) {
                this.renderParams.update();
                if (!isEncoderTextureOverridden) {
                    timeSamplerHelper.switchTo(this.drawSampler);
                    z2 = renderToFBO(gl10);
                    timeSamplerHelper.stop();
                    if (this.frameBuffer == null) {
                        return;
                    }
                    if (!isEncoderTextureOverridden && !z2) {
                        z3 = false;
                    }
                    if (z || isEncoderTextureOverridden) {
                    }
                    this.rendererCallback.afterFrameEncode(gl10, this.frameBuffer);
                    return;
                }
                this.fpsLogger.tick();
            }
            z2 = false;
            if (!isEncoderTextureOverridden) {
                z3 = false;
            }
            if (z) {
            }
        } finally {
        }
    }

    public void setCallback(zds0 zds0Var) {
        if (this.videoDataCallback != zds0Var) {
            ne7.K(TAG, "setCallback() - " + zds0Var, new Exception());
        }
        this.videoDataCallback = zds0Var;
    }

    public void setMaxRenderSize(VideoSize videoSize) {
        this.maxRenderSize = videoSize;
    }

    public void setPreviewSize(VideoSize videoSize, int i) {
        this.previewSize = videoSize;
        this.previewOrientation = i;
    }

    public void setRendererListener(PublisherRendererCallback publisherRendererCallback) {
        this.rendererCallback = publisherRendererCallback;
    }

    public void setVideoSize(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6) {
        boolean z3 = (i == this.mIncomingWidth && i2 == this.mIncomingHeight) ? false : true;
        int i7 = (((i3 + InterfaceC4413l1.a.b.e) / 90) * 90) % 360;
        boolean z4 = i7 != this.mRotation;
        boolean z5 = z != this.mIsFront;
        boolean z6 = z2 != this.mCameraIsExternal;
        boolean z7 = i4 != this.mBitrate;
        boolean z8 = i5 != this.mFrameRate;
        boolean z9 = i6 != this.iframeIntervalSeconds;
        if (z3 || z4 || z5 || z6 || z7 || z8 || z9) {
            this.mFrameRate = i5;
            this.mRotation = i7;
            this.mIsFront = z;
            this.mCameraIsExternal = z2;
            this.mIncomingWidth = i;
            this.mIncomingHeight = i2;
            this.mBitrate = i4;
            this.iframeIntervalSeconds = i6;
            this.encoderConfig = createEncoderConfig();
            this.rendererCallback.onVideoSizeChanged(i, i2, i7, z, z2, i4, i5, i6);
        }
    }

    public void updateRecordingState() {
        FrameBuffer frameBuffer;
        yis0 yis0Var = this.overriddenEncoderTexture;
        if ((yis0Var == null || !yis0Var.a()) && (frameBuffer = this.frameBuffer) != null) {
            yis0Var = new yis0(frameBuffer.getTexId(), false, this.frameBuffer.getWidth(), this.frameBuffer.getHeight(), xus.l(this.mEncoderRotation - this.fboRotation, this.mIsFront), null);
        }
        setTextureInfo(yis0Var);
        updateBenchmarkState();
        this.mVideoEncoder.e();
    }

    public void setPreviewSize(VideoSize videoSize) {
        this.previewSize = videoSize;
    }

    private void maybeWriteFrameBufferToFile(GL10 gl10) {
    }
}
