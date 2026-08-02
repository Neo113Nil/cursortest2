package ru.ok.media.video;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.settings.VideoDecoderSettings;
import ru.ok.media.utils.DecoderBase;
import ru.ok.media.video.H264Util;
import xsna.iq10;
import xsna.ne7;

/* loaded from: classes9.dex */
public class H264Decoder extends DecoderBase {
    private static final String TAG = "H264Decoder";
    private final iq10 loggerHelper;
    private final VideoDecoderSettings settings;

    @Nullable
    private Surface surface;

    @Nullable
    private SurfaceTextureListener surfaceTextureListener;
    private int videoHeight;

    @Nullable
    private TextureView videoView;
    private int videoWidth;

    public final class SurfaceTextureListener implements TextureView.SurfaceTextureListener {
        public /* synthetic */ SurfaceTextureListener(H264Decoder h264Decoder, int i) {
            this();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            H264Decoder.this.releaseSurface();
            H264Decoder.this.surface = new Surface(surfaceTexture);
            H264Decoder.this.reconfigure();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            H264Decoder.this.releaseSurface();
            H264Decoder.this.reconfigure();
            return true;
        }

        private SurfaceTextureListener() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        }
    }

    public H264Decoder(String str, LoggerInterface loggerInterface) {
        this.loggerHelper = new iq10("vdec", loggerInterface);
        this.settings = new VideoDecoderSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseSurface() {
        Surface surface = this.surface;
        this.surface = null;
        if (surface != null) {
            surface.release();
        }
    }

    private void releaseVideoView() {
        SurfaceTextureListener surfaceTextureListener = this.surfaceTextureListener;
        TextureView textureView = this.videoView;
        this.surfaceTextureListener = null;
        this.videoView = null;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == surfaceTextureListener) {
                textureView.setSurfaceTextureListener(null);
                return;
            }
            ne7.J(TAG, "Unexpected listener in " + textureView + ", " + textureView.getSurfaceTextureListener());
        }
    }

    @Override // ru.ok.media.utils.DecoderBase, ru.ok.media.utils.DecoderInterface
    public void close() {
        this.loggerHelper.b();
        releaseVideoView();
        releaseSurface();
        super.close();
    }

    @Override // ru.ok.media.utils.DecoderBase
    public MediaCodec createDecoder() {
        H264Util.VideoHeadersInfo videoSize = H264Util.getVideoSize(getCodecHeaders());
        this.videoWidth = videoSize.getFrameWidth();
        this.videoHeight = videoSize.getFrameHeight();
        handleOutputFormatUpdate();
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", videoSize.getFrameWidth(), videoSize.getFrameHeight());
        ByteBuffer wrap = ByteBuffer.wrap(getCodecHeaders());
        createVideoFormat.setByteBuffer("csd-0", H264Util.getAllNalus(wrap, 7));
        wrap.rewind();
        createVideoFormat.setByteBuffer("csd-1", H264Util.getAllNalus(wrap, 8));
        try {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType("video/avc");
            int frameWidth = videoSize.getFrameWidth() * videoSize.getFrameHeight();
            String name = createDecoderByType.getName();
            this.loggerHelper.a(Math.min(videoSize.getFrameWidth(), videoSize.getFrameHeight()), name);
            Integer maxInput = this.settings.getMaxInput(name, frameWidth);
            if (maxInput != null) {
                createVideoFormat.setInteger("max-input-size", maxInput.intValue());
            }
            createDecoderByType.configure(createVideoFormat, this.surface, (MediaCrypto) null, 0);
            this.render = this.surface != null;
            ne7.m(TAG, "MediaCodec started for AVC: " + this.videoWidth + "x" + this.videoHeight);
            return createDecoderByType;
        } catch (IOException e) {
            ne7.n(TAG, "Failed to create AVC decoder: " + e);
            return null;
        }
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    @Nullable
    public TextureView getView() {
        return this.videoView;
    }

    public void setSurface(Surface surface) {
        this.surface = surface;
        releaseVideoView();
        reconfigure();
    }

    public void setView(@Nullable TextureView textureView) {
        if (textureView == this.videoView) {
            return;
        }
        releaseVideoView();
        releaseSurface();
        this.videoView = textureView;
        if (textureView != null) {
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.surface = new Surface(surfaceTexture);
                ne7.m(TAG, "Surface created=" + this.surface);
            }
            SurfaceTextureListener surfaceTextureListener = new SurfaceTextureListener(this, 0);
            this.surfaceTextureListener = surfaceTextureListener;
            textureView.setSurfaceTextureListener(surfaceTextureListener);
        }
        reconfigure();
    }

    public void handleOutputFormatUpdate() {
    }
}
