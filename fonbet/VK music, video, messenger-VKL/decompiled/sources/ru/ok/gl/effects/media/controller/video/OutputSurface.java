package ru.ok.gl.effects.media.controller.video;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.NonNull;
import xsna.lhg;

/* loaded from: classes9.dex */
public class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private static final String TAG = "OutputSurface";
    private static final boolean VERBOSE = false;
    private boolean mFrameAvailable;
    private Surface mSurface;
    private TextureRenderer mTextureRender;
    private Handler mainHandler;
    private final Object mFrameSyncObject = new Object();
    private volatile boolean isReleased = false;

    public static class TooManyObjectException extends UnsupportedOperationException {
        public TooManyObjectException(int i) {
            super(lhg.a(i, "supported quantity of active objects at once: "));
        }
    }

    public OutputSurface(@NonNull TextureRenderer textureRenderer) throws TooManyObjectException {
        this.mTextureRender = textureRenderer;
        setup();
    }

    private void setup() {
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.mTextureRender.init();
        SurfaceTexture surfaceTexture = this.mTextureRender.getSurfaceTexture();
        surfaceTexture.setOnFrameAvailableListener(this, this.mainHandler);
        this.mSurface = new Surface(surfaceTexture);
    }

    public void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            try {
                if (this.isReleased) {
                    return;
                }
                while (!this.mFrameAvailable) {
                    try {
                        if (this.isReleased) {
                            return;
                        } else {
                            this.mFrameSyncObject.wait(300L);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                this.mFrameAvailable = false;
                this.mTextureRender.updateFrame();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public TextureRenderer getRenderer() {
        return this.mTextureRender;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.mFrameSyncObject) {
            try {
                if (this.isReleased) {
                    return;
                }
                if (this.mFrameAvailable) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.mFrameAvailable = true;
                this.mFrameSyncObject.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void release() {
        Handler handler = this.mainHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        synchronized (this.mFrameSyncObject) {
            this.mSurface.release();
            this.mTextureRender.release();
            this.mTextureRender = null;
            this.mSurface = null;
            this.isReleased = true;
        }
    }

    public void releaseSafe() {
        this.isReleased = true;
        this.mTextureRender.getSurfaceTexture().setOnFrameAvailableListener(null);
        this.mainHandler.removeCallbacksAndMessages(null);
        this.mainHandler = null;
    }
}
