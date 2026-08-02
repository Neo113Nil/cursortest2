package ru.ok.android.externcalls.sdk.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import defpackage.k0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.GlRectDrawer;
import org.webrtc.Logging;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.an10;
import xsna.bd3;
import xsna.cyf0;
import xsna.fp;
import xsna.go9;
import xsna.izs;
import xsna.s3q0;
import xsna.tj0;
import xsna.tn9;
import xsna.tw3;
import xsna.wzs;
import xsna.xqc;
import xsna.z4d0;
import xsna.zcl;

/* compiled from: TextureViewRenderer.kt */
/* loaded from: classes11.dex */
public class TextureViewRenderer extends TextureView implements VideoSink, RendererView {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_SCALE_FACTOR = 2;
    private static final long POSTPONED_FRAME_SAFEGUARD_DELAY_MILLIS = 250;
    private static final long POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS = 20000;
    private static final String TAG = "TextureViewRenderer";
    private static long textureViewCounter;
    private final Point alternateLayoutOutPoint;
    private boolean clearImageOnSizeChange;
    private final Runnable deliverPostponedFrameRunnable;
    private volatile boolean doRender;
    private FrameDecorator frameDecorator;
    private volatile izs<? super VideoFrame, Boolean> frameSkipPredicate;
    private final AtomicBoolean isFirstFrameRendered;
    private boolean isInitialized;
    private boolean isReleased;
    private VideoRendererInterface.FrameSizeListener lastSizeListener;
    private final AtomicBoolean layoutReadyToRender;
    private final FrameSize measureFrameSize;
    private volatile boolean needsClearImage;
    private final AtomicReference<VideoFrame> postponedFrame;
    private final Runnable postponedFrameSafeguard;
    private final PostponedFrameStatistics postponedFrameStatistics;
    private RendererCommon.RendererEvents rendererEvents;
    private final String resourceName;
    private final FrameSize rotatedFrameSize;
    private SizeChangeListener sizeChangeListener;
    private Surface surface;
    private int textureHeight;
    private int textureWidth;
    private boolean useAlternateLayout;
    private final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private final VideoRendererInterface videoRenderer;

    /* compiled from: TextureViewRenderer.kt */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: TextureViewRenderer.kt */
    /* loaded from: classes9.dex */
    public static final class FrameSize {
        private int frameRotation;
        private int rotatedFrameHeight;
        private int rotatedFrameWidth;

        public FrameSize() {
            this(0, 0, 0, 7, null);
        }

        private final boolean unsafeSet(int i, int i2, int i3, boolean z) {
            if (this.rotatedFrameWidth == i && this.rotatedFrameHeight == i2 && this.frameRotation == i3) {
                return false;
            }
            if (z) {
                return true;
            }
            this.rotatedFrameWidth = i;
            this.rotatedFrameHeight = i2;
            this.frameRotation = i3;
            return true;
        }

        public final synchronized void get(FrameSize frameSize) {
            frameSize.unsafeSet(this.rotatedFrameWidth, this.rotatedFrameHeight, this.frameRotation, false);
        }

        public final int height() {
            return this.rotatedFrameHeight;
        }

        public final float ratio() {
            return this.rotatedFrameWidth / this.rotatedFrameHeight;
        }

        public final synchronized boolean set(int i, int i2, int i3, boolean z) {
            return unsafeSet(i, i2, i3, z);
        }

        public final int width() {
            return this.rotatedFrameWidth;
        }

        public FrameSize(int i, int i2, int i3) {
            this.rotatedFrameWidth = i;
            this.rotatedFrameHeight = i2;
            this.frameRotation = i3;
        }

        public /* synthetic */ FrameSize(int i, int i2, int i3, int i4, zcl zclVar) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    /* compiled from: TextureViewRenderer.kt */
    /* loaded from: classes9.dex */
    public static final class PostponedFrameStatistics {
        private long deliveredCount;
        private long droppedCount;
        private long lastLogTime;
        private final String name;
        private long postponedCount;
        private long rejectedCount;
        private long repostponedCount;

        public PostponedFrameStatistics(String str) {
            this.name = str;
        }

        private final void logStatisticsIfNeeded() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.lastLogTime < TextureViewRenderer.POSTPONED_FRAME_STAT_LOG_INTERVAL_MILLIS) {
                return;
            }
            long j = this.postponedCount;
            double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
            double percent = j > 0 ? toPercent(this.deliveredCount / j) : 0.0d;
            long j2 = this.postponedCount;
            double percent2 = j2 > 0 ? toPercent(this.rejectedCount / j2) : 0.0d;
            long j3 = this.postponedCount;
            if (j3 > 0) {
                d = toPercent(this.droppedCount / j3);
            }
            String b = go9.b("TextureViewRenderer_pfs_", this.name);
            long j4 = this.postponedCount;
            long j5 = this.repostponedCount;
            long j6 = this.droppedCount;
            long j7 = this.deliveredCount;
            double d2 = percent2;
            long j8 = this.rejectedCount;
            StringBuilder b2 = fp.b(j4, "postponed: ", ", re-postponed: ");
            b2.append(j5);
            tj0.d(b2, ", dropped: ", j6, " (");
            b2.append(d);
            tj0.d(b2, "%), delivered: ", j7, " (");
            b2.append(percent);
            tj0.d(b2, "%), rejected: ", j8, " (");
            b2.append(d2);
            b2.append("%)");
            Logging.d(b, b2.toString());
            this.repostponedCount = 0L;
            this.postponedCount = 0L;
            this.deliveredCount = 0L;
            this.rejectedCount = 0L;
            this.droppedCount = 0L;
            this.lastLogTime = elapsedRealtime;
        }

        private final double toPercent(double d) {
            return an10.c(d * 10000) / 100.0d;
        }

        public final void delivered() {
            this.deliveredCount++;
            logStatisticsIfNeeded();
        }

        public final void dropped() {
            this.droppedCount++;
            logStatisticsIfNeeded();
        }

        public final String getName() {
            return this.name;
        }

        public final void postponed(boolean z) {
            if (z) {
                this.repostponedCount++;
            } else {
                this.postponedCount++;
            }
            logStatisticsIfNeeded();
        }

        public final void rejected() {
            this.rejectedCount++;
            logStatisticsIfNeeded();
        }
    }

    /* compiled from: TextureViewRenderer.kt */
    /* loaded from: classes9.dex */
    public interface SizeChangeListener {
        void onFrameSizeChanged(int i, int i2);

        void onTextureSizeChanged(int i, int i2);
    }

    public TextureViewRenderer(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverPostponedFrame() {
        VideoFrame andSet = this.postponedFrame.getAndSet(null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            try {
                handleFrame(andSet, true);
            } finally {
                andSet.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropPostponedFrameIfExists() {
        VideoFrame andSet = this.postponedFrame.getAndSet(null);
        if (andSet != null) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.deliverPostponedFrameRunnable);
                handler.removeCallbacks(this.postponedFrameSafeguard);
            }
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
    }

    private final String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId()) + ": ";
        } catch (Resources.NotFoundException unused) {
            long j = textureViewCounter;
            textureViewCounter = 1 + j;
            return k0.a(j, "tvr");
        }
    }

    private final void handleFrame(VideoFrame videoFrame, boolean z) {
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        if (!updateFrameDimensionsAndReportEvents(buffer.getWidth(), buffer.getHeight(), videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), videoFrame.getRotation(), z)) {
            this.postponedFrameStatistics.rejected();
            return;
        }
        if (!this.layoutReadyToRender.get()) {
            logD("skipping frame");
            if (isAttachedToWindow() && isShown()) {
                postponeFrame(videoFrame, z);
                return;
            }
            return;
        }
        if (this.isFirstFrameRendered.compareAndSet(false, true)) {
            logD("Reporting first rendered frame.");
            RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
            if (rendererEvents != null) {
                rendererEvents.onFirstFrameRendered();
            }
        }
        if (this.needsClearImage) {
            this.needsClearImage = false;
            this.videoRenderer.clearImage();
        }
        this.videoRenderer.onFrame(videoFrame);
        dropPostponedFrameIfExists();
        if (z) {
            this.postponedFrameStatistics.delivered();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logD(String str) {
        Logging.d(TAG, this.resourceName + "  " + str);
    }

    private final void maybeReleaseLastSizeListener() {
        VideoRendererInterface.FrameSizeListener frameSizeListener = this.lastSizeListener;
        if (frameSizeListener != null) {
            this.videoRenderer.removeFrameSizeListener(frameSizeListener);
        }
        this.lastSizeListener = null;
    }

    private final void notifyTextureSizeChanged() {
        post(new tw3(this, 24));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyTextureSizeChanged$lambda$0(TextureViewRenderer textureViewRenderer) {
        SizeChangeListener sizeChangeListener = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener != null) {
            sizeChangeListener.onTextureSizeChanged(textureViewRenderer.textureWidth, textureViewRenderer.textureHeight);
        }
    }

    private final void postponeFrame(VideoFrame videoFrame, boolean z) {
        videoFrame.retain();
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.postponedFrameSafeguard);
        }
        VideoFrame andSet = this.postponedFrame.getAndSet(videoFrame);
        if (andSet != null) {
            andSet.release();
            this.postponedFrameStatistics.dropped();
        }
        Handler handler2 = getHandler();
        if (handler2 != null) {
            handler2.postDelayed(this.postponedFrameSafeguard, 250L);
        }
        this.postponedFrameStatistics.postponed(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFrameSizeListener$lambda$0(wzs wzsVar, int i, int i2) {
        wzsVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    private final boolean updateFrameDimensionsAndReportEvents(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (!this.rotatedFrameSize.set(i3, i4, i5, z)) {
            return true;
        }
        if (z) {
            return false;
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.deliverPostponedFrameRunnable);
        }
        this.layoutReadyToRender.set(false);
        StringBuilder sb = new StringBuilder("Reporting frame resolution changed to ");
        sb.append(i);
        sb.append("x");
        logD(bd3.b(" with rotation ", i2, i5, sb));
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFrameResolutionChanged(i, i2, i5);
        }
        post(new cyf0(i3, i4, 1, this));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateFrameDimensionsAndReportEvents$lambda$0(TextureViewRenderer textureViewRenderer, int i, int i2) {
        SizeChangeListener sizeChangeListener = textureViewRenderer.sizeChangeListener;
        if (sizeChangeListener != null) {
            sizeChangeListener.onFrameSizeChanged(i, i2);
        }
        textureViewRenderer.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTextureSize(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        notifyTextureSizeChanged();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void clearImage() {
        this.videoRenderer.clearImage();
        this.isFirstFrameRendered.set(false);
    }

    public final void disableFpsReduction() {
        this.videoRenderer.disableFpsReduction();
    }

    public final boolean getClearImageOnSizeChange() {
        return this.clearImageOnSizeChange;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean getHasImage() {
        return this.isFirstFrameRendered.get();
    }

    public final SizeChangeListener getSizeChangeListener() {
        return this.sizeChangeListener;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean getUseAlternateLayout() {
        return this.useAlternateLayout;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.RendererEvents rendererEvents, RendererCommon.GlDrawer glDrawer) {
        if (this.isInitialized) {
            return false;
        }
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameSize.set(0, 0, 0, false);
        this.videoRenderer.init(callOpenGLRenderer, glDrawer);
        this.isInitialized = true;
        return true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.doRender) {
            VideoFrame apply = this.frameDecorator.apply(videoFrame);
            izs<? super VideoFrame, Boolean> izsVar = this.frameSkipPredicate;
            if (izsVar == null || !izsVar.invoke(videoFrame).booleanValue()) {
                handleFrame(apply, false);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        logD("layout view");
        this.videoRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
        if (!this.layoutReadyToRender.compareAndSet(false, true) || getHandler() == null) {
            return;
        }
        removeCallbacks(this.deliverPostponedFrameRunnable);
        post(this.deliverPostponedFrameRunnable);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Point measure;
        ThreadUtils.checkIsOnMainThread();
        this.rotatedFrameSize.get(this.measureFrameSize);
        if (getUseAlternateLayout()) {
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            float ratio = this.measureFrameSize.ratio();
            int i3 = (int) (size * ratio);
            if (i3 <= size2) {
                size2 = i3;
            }
            if (size2 > View.MeasureSpec.getSize(i) * 2) {
                size2 = View.MeasureSpec.getSize(i) * 2;
            }
            this.alternateLayoutOutPoint.set(size2, (int) (size2 / ratio));
            measure = this.alternateLayoutOutPoint;
        } else {
            measure = this.videoLayoutMeasure.measure(i, i2, this.measureFrameSize.width(), this.measureFrameSize.height());
        }
        setMeasuredDimension(measure.x, measure.y);
    }

    public final void pauseVideo() {
        this.videoRenderer.pauseVideo();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void release() {
        if (this.isReleased) {
            return;
        }
        dropPostponedFrameIfExists();
        this.rendererEvents = null;
        maybeReleaseLastSizeListener();
        this.videoRenderer.release();
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.isFirstFrameRendered.set(false);
        this.isReleased = true;
    }

    public final void setClearImageOnSizeChange(boolean z) {
        this.clearImageOnSizeChange = z;
    }

    public final void setFpsReduction(float f) {
        this.videoRenderer.setFpsReduction(f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setFrameDecorator(FrameDecorator frameDecorator) {
        this.frameDecorator = frameDecorator;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setFrameSizeListener(final wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        maybeReleaseLastSizeListener();
        VideoRendererInterface videoRendererInterface = this.videoRenderer;
        VideoRendererInterface.FrameSizeListener frameSizeListener = new VideoRendererInterface.FrameSizeListener() { // from class: xsna.roo0
            @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface.FrameSizeListener
            public final void onFrame(int i, int i2) {
                TextureViewRenderer.setFrameSizeListener$lambda$0(wzs.this, i, i2);
            }
        };
        this.lastSizeListener = frameSizeListener;
        videoRendererInterface.addFrameSizeListener(frameSizeListener);
    }

    public final void setFrameSkipCondition(izs<? super VideoFrame, Boolean> izsVar) {
        this.frameSkipPredicate = izsVar;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setMirror(boolean z) {
        this.videoRenderer.setMirror(z);
    }

    public final void setRender(boolean z) {
        this.doRender = z;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setRenderEventsListener(RendererCommon.RendererEvents rendererEvents) {
        this.rendererEvents = rendererEvents;
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
    }

    public final void setSizeChangeListener(SizeChangeListener sizeChangeListener) {
        this.sizeChangeListener = sizeChangeListener;
        notifyTextureSizeChanged();
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setUseAlternateLayout(boolean z) {
        this.useAlternateLayout = z;
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TextureViewRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        this.videoRenderer = VideoRendererInterface.Companion.createRenderer(resourceName);
        this.isFirstFrameRendered = new AtomicBoolean(false);
        int i2 = 0;
        int i3 = 0;
        this.rotatedFrameSize = new FrameSize(0, i2, i3, 7, null);
        this.measureFrameSize = new FrameSize(i2, i3, 0, 7, null);
        this.doRender = true;
        this.layoutReadyToRender = new AtomicBoolean(false);
        this.postponedFrame = new AtomicReference<>(null);
        this.postponedFrameSafeguard = new tn9(this, 20);
        this.deliverPostponedFrameRunnable = new xqc(this, 13);
        this.frameDecorator = FrameDecorator.Companion.getEMPTY();
        this.alternateLayoutOutPoint = new Point();
        this.postponedFrameStatistics = new PostponedFrameStatistics(resourceName);
        this.clearImageOnSizeChange = true;
        setSurfaceTextureListener(new AnonymousClass1());
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.RendererView
    public boolean init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.RendererEvents rendererEvents, FrameDecorator frameDecorator) {
        this.frameDecorator = frameDecorator;
        return init(callOpenGLRenderer, rendererEvents, new GlRectDrawer());
    }

    public /* synthetic */ TextureViewRenderer(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* compiled from: TextureViewRenderer.kt */
    /* renamed from: ru.ok.android.externcalls.sdk.ui.TextureViewRenderer$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static final class AnonymousClass1 implements TextureView.SurfaceTextureListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s3q0 onSurfaceTextureDestroyed$lambda$1(CountDownLatch countDownLatch) {
            countDownLatch.countDown();
            return s3q0.a;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            ThreadUtils.checkIsOnMainThread();
            Surface surface = TextureViewRenderer.this.surface;
            if (surface != null) {
                surface.release();
            }
            TextureViewRenderer.this.surface = null;
            TextureViewRenderer textureViewRenderer = TextureViewRenderer.this;
            Surface surface2 = new Surface(surfaceTexture);
            TextureViewRenderer.this.videoRenderer.createEglSurface(surface2);
            textureViewRenderer.surface = surface2;
            TextureViewRenderer.this.updateTextureSize(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            ThreadUtils.checkIsOnMainThread();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            TextureViewRenderer.this.videoRenderer.releaseEglSurface(new z4d0(countDownLatch, 18));
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            Surface surface = TextureViewRenderer.this.surface;
            if (surface != null) {
                surface.release();
            }
            TextureViewRenderer.this.surface = null;
            TextureViewRenderer.this.updateTextureSize(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            ThreadUtils.checkIsOnMainThread();
            TextureViewRenderer.this.logD("surfaceChanged: size: " + i + "x" + i2);
            TextureViewRenderer.this.updateTextureSize(i, i2);
            if (TextureViewRenderer.this.getClearImageOnSizeChange()) {
                TextureViewRenderer.this.needsClearImage = true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
