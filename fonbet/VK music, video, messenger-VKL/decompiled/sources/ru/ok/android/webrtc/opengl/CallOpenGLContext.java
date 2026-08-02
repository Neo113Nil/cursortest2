package ru.ok.android.webrtc.opengl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import okcalls.z;
import org.webrtc.EglBase;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.gpu.SharedEglContext;
import xsna.a9y0;
import xsna.e0;
import xsna.epx;
import xsna.f0;
import xsna.izs;
import xsna.li0;
import xsna.pzl;
import xsna.s3q0;
import xsna.u69;
import xsna.xu6;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class CallOpenGLContext {

    @Deprecated
    public static final int EXECUTION_TIME_LOG_INTERVAL = 10000;
    public static final AtomicInteger l = new AtomicInteger(0);
    public final RTCLog a;
    public final izs b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final a9y0 k;

    public static class CallOpenGLContextException extends RuntimeException {
        public CallOpenGLContextException(String str) {
            super(str);
        }
    }

    public static final class CallOpenGLContextGLException extends CallOpenGLContextException {
        public CallOpenGLContextGLException(int i, String str) {
            super(pzl.b(str, ": 0x", Integer.toHexString(i)));
        }
    }

    public static final class CallOpenGLContextNotInitialized extends CallOpenGLContextException {
        public CallOpenGLContextNotInitialized() {
            super("VoipGLRenderer not initialized");
        }
    }

    public CallOpenGLContext(RTCLog rTCLog, EGLContext eGLContext, int[] iArr, izs<? super CallOpenGLContext, s3q0> izsVar, String str) {
        this.a = rTCLog;
        this.b = izsVar;
        HandlerThread handlerThread = new HandlerThread((str == null ? CallOpenGLRenderer.THREAD_NAME : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        this.h = new Object();
        str = str == null ? CallOpenGL.LOG_TAG : str;
        this.j = str;
        handlerThread.start();
        this.k = new a9y0(handlerThread.getLooper(), rTCLog, str.concat("_timings"), new z(1, this, CallOpenGLContext.class, "processError", "processError(Ljava/lang/Throwable;)V", 0));
        a(eGLContext, iArr);
    }

    public static final void a(izs izsVar, CallOpenGLContext callOpenGLContext) {
        izsVar.invoke(callOpenGLContext);
    }

    public static final void b(izs izsVar, CallOpenGLContext callOpenGLContext) {
        izsVar.invoke(callOpenGLContext);
    }

    public static final void c(izs izsVar, CallOpenGLContext callOpenGLContext) {
        izsVar.invoke(callOpenGLContext);
    }

    public final void cancel(Runnable runnable) {
        this.k.removeCallbacks(runnable);
    }

    public final void checkForErrors(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new CallOpenGLContextGLException(eglGetError, str);
        }
    }

    public final void clearImage(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        makeCurrent(eGLSurface);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glClear(16384);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        checkForErrors("clearImage()");
    }

    public final EGLSurface createPBufferSurface(int i, int i2) {
        EGLConfig eGLConfig;
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null || (eGLConfig = this.f) == null) {
            return null;
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        if (eglCreatePbufferSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContextGLException(EGL14.eglGetError(), "createPBufferSurface()");
        }
        int incrementAndGet = l.incrementAndGet();
        this.a.log(this.j, "PBuffer surface created, total count is " + incrementAndGet);
        return eglCreatePbufferSurface;
    }

    public final EGLSurface createSurface(Surface surface) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        if (!surface.isValid() || (eGLDisplay = this.e) == null || (eGLConfig = this.f) == null) {
            return null;
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
        }
        makeCurrent(eglCreateWindowSurface);
        GLES20.glPixelStorei(3317, 1);
        int incrementAndGet = l.incrementAndGet();
        this.a.log(this.j, "Surface created, total count is " + incrementAndGet);
        return eglCreateWindowSurface;
    }

    public final Handler getHandler() {
        return this.k;
    }

    public final izs<CallOpenGLContext, s3q0> getOnBeforeRelease() {
        return this.b;
    }

    public final int getSurfaceHeight(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final int getSurfaceWidth(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void makeCurrent(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContextException("Wrong surface in makeCurrent()");
        }
        EGLContext eGLContext = this.d;
        if (eGLContext == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        if (epx.f(EGL14.eglGetCurrentContext(), this.d) && epx.f(this.g, eGLSurface)) {
            return;
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
        }
        this.g = eGLSurface;
    }

    public final boolean post(String str, izs<? super CallOpenGLContext, s3q0> izsVar) {
        try {
            return this.k.post(new f0(2, izsVar, this));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final boolean postAtFrontOfQueue(String str, izs<? super CallOpenGLContext, s3q0> izsVar) {
        try {
            return this.k.postAtFrontOfQueue(new u69(0, izsVar, this));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final boolean postDelayed(String str, izs<? super CallOpenGLContext, s3q0> izsVar, long j) {
        try {
            return this.k.postDelayed(new e0(3, izsVar, this), j);
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final CountDownLatch release() {
        this.a.log(this.j, "Release requested");
        int i = 1;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.h) {
            if (!this.i) {
                this.a.log(this.j, "Already released, ignore");
                countDownLatch.countDown();
                return countDownLatch;
            }
            this.i = false;
            s3q0 s3q0Var = s3q0.a;
            this.k.postAtFrontOfQueue(new li0(i, this, countDownLatch));
            this.a.log(this.j, "Release action submitted");
            return countDownLatch;
        }
    }

    public final void releaseSurface(EGLSurface eGLSurface) {
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        int decrementAndGet = l.decrementAndGet();
        this.a.log(this.j, "Surface destroyed, total count is " + decrementAndGet);
    }

    public final void swapBuffers(EGLSurface eGLSurface) {
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContextNotInitialized();
        }
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        checkForErrors("swapBuffers()");
    }

    public final void a(EGLContext eGLContext, int[] iArr) {
        this.a.log(this.j, "OpenGL context initialization requested");
        synchronized (this.h) {
            if (this.i) {
                this.a.log(this.j, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            this.k.postAtFrontOfQueue(new xu6(this, iArr, eGLContext, 1));
            this.a.log(this.j, "OpenGL context initialization task submitted");
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void post(Runnable runnable) {
        this.k.post(runnable);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        try {
            return this.k.postDelayed(runnable, j);
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public static final void a(CallOpenGLContext callOpenGLContext, int[] iArr, EGLContext eGLContext) {
        callOpenGLContext.a.log(callOpenGLContext.j, "Initialize OpenGL context on openGL thread");
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            callOpenGLContext.a.log(callOpenGLContext.j, "No default display found, will not initialize");
            return;
        }
        int[] iArr2 = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr3 = new int[1];
            if (EGL14.eglChooseConfig(eglGetDisplay, iArr, 0, eGLConfigArr, 0, 1, iArr3, 0)) {
                if (iArr3[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (eGLConfig != null) {
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, eGLContext, new int[]{SharedEglContext.EGL_CONTEXT_CLIENT_VERSION, EglBase.getOpenGlesVersionFromConfig(EglBase.CONFIG_PLAIN), 12344}, 0);
                        if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                            callOpenGLContext.d = eglCreateContext;
                            callOpenGLContext.e = eglGetDisplay;
                            callOpenGLContext.f = eGLConfig;
                            return;
                        }
                        throw new CallOpenGLContextGLException(EGL14.eglGetError(), "Failed to create EGL context");
                    }
                    throw new CallOpenGLContextException("Returned matching OpenGL context is null");
                }
                throw new CallOpenGLContextException("No valid OpenGL context present, can not continue");
            }
            throw new CallOpenGLContextGLException(EGL14.eglGetError(), "getEglConfig()");
        }
        throw new CallOpenGLContextGLException(EGL14.eglGetError(), "Unable to initialize EGL14");
    }

    public /* synthetic */ CallOpenGLContext(RTCLog rTCLog, EGLContext eGLContext, int[] iArr, izs izsVar, String str, int i, zcl zclVar) {
        this(rTCLog, eGLContext, iArr, izsVar, (i & 16) != 0 ? null : str);
    }

    public static /* synthetic */ void getOnBeforeRelease$annotations() {
    }

    public static final void a(CallOpenGLContext callOpenGLContext, CountDownLatch countDownLatch) {
        try {
            callOpenGLContext.a.log(callOpenGLContext.j, "Starting release process");
            EGLContext eGLContext = callOpenGLContext.d;
            if (eGLContext == null) {
                return;
            }
            callOpenGLContext.a.log(callOpenGLContext.j, "Not yet released, continue");
            EGLDisplay eGLDisplay = callOpenGLContext.e;
            if (eGLDisplay != null) {
                GLES20.glUseProgram(0);
                try {
                    callOpenGLContext.b.invoke(callOpenGLContext);
                } catch (Throwable th) {
                    callOpenGLContext.a.reportException(callOpenGLContext.j, "Error on call dependent release callback", th);
                }
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                callOpenGLContext.g = eGLSurface;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(eGLDisplay);
                callOpenGLContext.d = null;
                callOpenGLContext.e = null;
                callOpenGLContext.f = null;
                callOpenGLContext.a.log(callOpenGLContext.j, "Quitting handler thread");
                callOpenGLContext.c.quit();
                return;
            }
            throw new CallOpenGLContextNotInitialized();
        } finally {
            callOpenGLContext.a.log(callOpenGLContext.j, "Released, notify awaiting...");
            countDownLatch.countDown();
        }
    }
}
