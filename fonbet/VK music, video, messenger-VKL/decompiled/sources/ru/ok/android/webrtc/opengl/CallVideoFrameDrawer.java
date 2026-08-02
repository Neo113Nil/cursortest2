package ru.ok.android.webrtc.opengl;

import android.view.Surface;
import com.vk.movika.sdk.base.logic.interactor.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.RTCLog;
import xsna.gzs;
import xsna.s3q0;
import xsna.zil0;

/* loaded from: classes9.dex */
public final class CallVideoFrameDrawer extends CallOpenGLDrawer {
    public static final AtomicInteger m = new AtomicInteger(0);
    public final String b;
    public CallOpenGLRenderer g;
    public Surface i;
    public final String j;
    public RendererCommon.GlDrawer k;
    public final CallVideoFrameDrawerStatistics l;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final AtomicReference d = new AtomicReference(null);
    public final CallRendererFpsControl e = new CallRendererFpsControl();
    public final CallRendererFrameTransform f = new CallRendererFrameTransform();
    public final Object h = new Object();

    public static final class CallVideoFrameDrawerError extends RuntimeException {
        public CallVideoFrameDrawerError(String str) {
            super(str);
        }
    }

    public interface FrameListener {
        void onFrame(int i, int i2);
    }

    public CallVideoFrameDrawer(String str) {
        this.b = str;
        this.j = "CallOpenGL_drawer_".concat(str);
        this.l = new CallVideoFrameDrawerStatistics(str, new h(this, 11));
    }

    public static final boolean a(CallVideoFrameDrawer callVideoFrameDrawer) {
        return callVideoFrameDrawer.e.isPaused();
    }

    public final void addFrameListener(FrameListener frameListener) {
        this.c.add(frameListener);
    }

    public final void clearImage() {
        synchronized (this.h) {
            CallOpenGLRenderer callOpenGLRenderer = this.g;
            if (callOpenGLRenderer != null) {
                callOpenGLRenderer.clearImage(this);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final void createEglSurface(Surface surface) {
        synchronized (this.h) {
            try {
                CallOpenGLRenderer callOpenGLRenderer = this.g;
                if (callOpenGLRenderer != null) {
                    callOpenGLRenderer.getLogger$webrtc_android_sdk_release().log(this.j, "External request for surface creation");
                    callOpenGLRenderer.createSurface(this, surface);
                } else {
                    this.i = surface;
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final RendererCommon.GlDrawer getDrawer$webrtc_android_sdk_release() {
        return this.k;
    }

    public final void init(CallOpenGLRenderer callOpenGLRenderer, RendererCommon.GlDrawer glDrawer) {
        synchronized (this.h) {
            try {
                if (this.g != null) {
                    return;
                }
                this.g = callOpenGLRenderer;
                callOpenGLRenderer.initDrawer$webrtc_android_sdk_release(this, glDrawer);
                Surface surface = this.i;
                if (surface != null) {
                    callOpenGLRenderer.getLogger$webrtc_android_sdk_release().log(this.j, "Got postponed surface request, process and reset reference");
                    callOpenGLRenderer.createSurface(this, surface);
                }
                this.i = null;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onFrame(VideoFrame videoFrame) {
        getStatistics$webrtc_android_sdk_release().frameReceived();
        synchronized (this.h) {
            try {
                CallOpenGLRenderer callOpenGLRenderer = this.g;
                if (callOpenGLRenderer == null) {
                    return;
                }
                AtomicReference atomicReference = this.d;
                videoFrame.retain();
                Object andSet = atomicReference.getAndSet(videoFrame);
                if (andSet == null) {
                    callOpenGLRenderer.render$webrtc_android_sdk_release(this);
                }
                s3q0 s3q0Var = s3q0.a;
                VideoFrame videoFrame2 = (VideoFrame) andSet;
                if (videoFrame2 != null) {
                    videoFrame2.release();
                    getStatistics$webrtc_android_sdk_release().frameDropped();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void onInitialize$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext, Object obj) {
        RTCLog logger$webrtc_android_sdk_release;
        this.k = (RendererCommon.GlDrawer) obj;
        getStatistics$webrtc_android_sdk_release().reset(System.nanoTime());
        CallOpenGLRenderer callOpenGLRenderer = this.g;
        if (callOpenGLRenderer == null || (logger$webrtc_android_sdk_release = callOpenGLRenderer.getLogger$webrtc_android_sdk_release()) == null) {
            throw new CallVideoFrameDrawerError("Render is missing inside onInitialize() callback");
        }
        logger$webrtc_android_sdk_release.log(this.j, zil0.a(m.incrementAndGet(), "Instance ", this.b, " initialized. Total count is "));
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void onRelease$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext) {
        RTCLog logger$webrtc_android_sdk_release;
        synchronized (this.h) {
            this.i = null;
            CallOpenGLRenderer callOpenGLRenderer = this.g;
            if (callOpenGLRenderer != null && (logger$webrtc_android_sdk_release = callOpenGLRenderer.getLogger$webrtc_android_sdk_release()) != null) {
                this.g = null;
                VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
                if (videoFrame != null) {
                    videoFrame.release();
                    s3q0 s3q0Var = s3q0.a;
                }
                RendererCommon.GlDrawer glDrawer = this.k;
                if (glDrawer != null) {
                    glDrawer.release();
                }
                this.k = null;
                logger$webrtc_android_sdk_release.log(this.j, zil0.a(m.decrementAndGet(), "Instance ", this.b, " released. Remaining count is "));
            }
        }
    }

    public final void release() {
        synchronized (this.h) {
            CallOpenGLRenderer callOpenGLRenderer = this.g;
            if (callOpenGLRenderer == null) {
                return;
            }
            callOpenGLRenderer.releaseDrawer$webrtc_android_sdk_release(this);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void releaseEglSurface(gzs<s3q0> gzsVar) {
        synchronized (this.h) {
            this.i = null;
            CallOpenGLRenderer callOpenGLRenderer = this.g;
            if (callOpenGLRenderer != null) {
                callOpenGLRenderer.getLogger$webrtc_android_sdk_release().log(this.j, "External request for surface release");
                callOpenGLRenderer.releaseSurface(this, gzsVar);
            } else {
                s3q0 s3q0Var = s3q0.a;
                gzsVar.invoke();
            }
        }
    }

    public final void removeFrameListener(FrameListener frameListener) {
        this.c.remove(frameListener);
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void render$webrtc_android_sdk_release(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        VideoFrame videoFrame = (VideoFrame) this.d.getAndSet(null);
        if (videoFrame == null) {
            return;
        }
        if (this.e.shouldRenderFrame()) {
            try {
                int rotatedWidth = videoFrame.getRotatedWidth();
                int rotatedHeight = videoFrame.getRotatedHeight();
                callOpenGLRenderer.render$webrtc_android_sdk_release(callOpenGLContext, this, videoFrame, this.f.getModifiers(rotatedWidth / rotatedHeight));
                getStatistics$webrtc_android_sdk_release().frameRendered();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((FrameListener) it.next()).onFrame(rotatedWidth, rotatedHeight);
                }
            } finally {
                videoFrame.release();
            }
        }
    }

    public final void setDrawer$webrtc_android_sdk_release(RendererCommon.GlDrawer glDrawer) {
        this.k = glDrawer;
    }

    public final void setFpsReduction(float f) {
        this.e.setFpsReduction(f);
    }

    public final void setLayoutAspectRatio(float f) {
        this.f.setLayoutAspectRatio(f);
    }

    public final void setMirror(boolean z) {
        this.f.setMirror(z);
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public CallVideoFrameDrawerStatistics getStatistics$webrtc_android_sdk_release() {
        return this.l;
    }

    public static /* synthetic */ void getDrawer$webrtc_android_sdk_release$annotations() {
    }
}
