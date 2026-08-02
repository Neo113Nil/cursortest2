package ru.ok.android.webrtc.animoji.render;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.os.SystemClock;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.schedulers.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.TextureBufferImpl;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper;
import ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapperImpl;
import ru.ok.android.webrtc.animoji.render.api.AnimojiRenderInterface;
import ru.ok.android.webrtc.animoji.render.api.AnimojiSvgResource;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.es2;
import xsna.fb;
import xsna.fs2;
import xsna.g60;
import xsna.gs2;
import xsna.iiy0;
import xsna.izs;
import xsna.s3q0;
import xsna.tm0;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiRenderWrapperImpl extends CallOpenGLDrawer implements AnimojiRenderWrapper {
    public static final String LOG_TAG = "AnimojiRenderWrapper";
    public final AnimojiRenderDispatch b;
    public final CallParticipant.ParticipantId c;
    public final RTCLog d;
    public final CallOpenGLRenderer e;
    public final String f;
    public final AnimojiSvgResource g;
    public final AnimojiStatHandle h;
    public volatile AnimojiRenderInterface i;
    public YuvConverter j;
    public long k;
    public long l;
    public volatile Integer p;
    public boolean x;
    public final AnimojiRendererStatistics z;
    public static final Companion Companion = new Companion(null);
    public static final AtomicInteger A = new AtomicInteger(0);
    public final iiy0 m = new iiy0();
    public final iiy0 n = new iiy0();
    public final AtomicReference o = new AtomicReference(null);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicReference s = new AtomicReference(null);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final Matrix w = new Matrix();
    public final Runnable y = new fs2(this, 0);
    public final Runnable r = new gs2(this, 0);

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public AnimojiRenderWrapperImpl(AnimojiRenderDispatch animojiRenderDispatch, CallParticipant.ParticipantId participantId, RTCLog rTCLog, CallOpenGLRenderer callOpenGLRenderer, izs<? super izs<? super AnimojiRenderInterface, s3q0>, s3q0> izsVar, String str, AnimojiSvgResource animojiSvgResource, AnimojiStatHandle animojiStatHandle) {
        this.b = animojiRenderDispatch;
        this.c = participantId;
        this.d = rTCLog;
        this.e = callOpenGLRenderer;
        this.f = str;
        this.g = animojiSvgResource;
        this.h = animojiStatHandle;
        this.z = new AnimojiRendererStatistics(participantId.toStringValue());
        izsVar.invoke(new fb(this, 1));
    }

    public static final void a(AnimojiRenderWrapperImpl animojiRenderWrapperImpl) {
        animojiRenderWrapperImpl.a();
    }

    public static final void b(AnimojiRenderWrapperImpl animojiRenderWrapperImpl) {
        animojiRenderWrapperImpl.e.post$webrtc_android_sdk_release(new tm0(animojiRenderWrapperImpl, 4));
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void notifyAnimojiChanged() {
        a(0L);
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void onBgColor(int i) {
        if (this.v.get()) {
            return;
        }
        this.p = Integer.valueOf(i);
        this.e.post$webrtc_android_sdk_release(new es2(this, i, 0));
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void onInitialize$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext, Object obj) {
        EGLSurface eGLSurface = null;
        AnimojiRenderInterface animojiRenderInterface = obj instanceof AnimojiRenderInterface ? (AnimojiRenderInterface) obj : null;
        if (animojiRenderInterface == null || this.v.get()) {
            return;
        }
        EGLSurface createPBufferSurface = callOpenGLContext.createPBufferSurface(1, 1);
        if (createPBufferSurface != null) {
            callOpenGLContext.makeCurrent(createPBufferSurface);
            eGLSurface = createPBufferSurface;
        }
        setSurface$webrtc_android_sdk_release(eGLSurface);
        this.j = new YuvConverter();
        animojiRenderInterface.init(callOpenGLContext.getHandler(), this.f);
        animojiRenderInterface.acceptLandmarks(new float[0]);
        this.i = animojiRenderInterface;
        a(0L);
        getStatistics$webrtc_android_sdk_release().reset(System.nanoTime());
        int incrementAndGet = A.incrementAndGet();
        this.d.log(LOG_TAG, "renderer initialized " + this.c + ", total count is " + incrementAndGet);
        if (this.x) {
            this.x = false;
            this.d.log(LOG_TAG, "torn render chain detected. restart");
            a(false);
        }
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void onLandmarks(float[] fArr) {
        if (fArr.length == 0 || this.v.get()) {
            return;
        }
        this.o.set(fArr);
        if (this.q.compareAndSet(false, true)) {
            this.e.post$webrtc_android_sdk_release(new g60(this, 2));
        } else {
            this.d.log(LOG_TAG, "landmark contention");
        }
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void onRelease$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext) {
        if (this.v.compareAndSet(false, true)) {
            stopDrawing();
            c cVar = (c) this.s.getAndSet(null);
            if (cVar != null) {
                cVar.dispose();
            }
            AnimojiRenderInterface animojiRenderInterface = this.i;
            if (animojiRenderInterface != null) {
                animojiRenderInterface.close();
            }
            this.i = null;
            YuvConverter yuvConverter = this.j;
            if (yuvConverter != null) {
                yuvConverter.release();
            }
            this.j = null;
            callOpenGLContext.releaseSurface(getSurface$webrtc_android_sdk_release());
            setSurface$webrtc_android_sdk_release(null);
            this.g.close();
            int decrementAndGet = A.decrementAndGet();
            this.d.log(LOG_TAG, "renderer released " + this.c + ", remaining count is " + decrementAndGet);
        }
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void onSetFrameSize(int i, int i2, AnimojiRenderWrapper.AntiAlias antiAlias) {
        int scale = (int) (antiAlias.getScale() * i);
        int scale2 = (int) (antiAlias.getScale() * i2);
        if (scale < 256 || scale2 < 256) {
            double min = 256.0d / Integer.min(scale, scale2);
            scale = (int) (scale * min);
            scale2 = (int) (scale2 * min);
        }
        iiy0 iiy0Var = this.m;
        synchronized (iiy0Var) {
            iiy0Var.a = scale;
            iiy0Var.b = scale2;
        }
        this.h.onRenderResolutionChanged(this.c, scale2, scale);
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void release() {
        if (this.v.get()) {
            return;
        }
        this.e.releaseDrawer$webrtc_android_sdk_release(this);
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public void render$webrtc_android_sdk_release(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        if (this.v.get()) {
            return;
        }
        if (this.u.compareAndSet(false, true)) {
            EGLSurface surface$webrtc_android_sdk_release = getSurface$webrtc_android_sdk_release();
            if (surface$webrtc_android_sdk_release == null || surface$webrtc_android_sdk_release == EGL14.EGL_NO_SURFACE) {
                this.d.log(LOG_TAG, this.c + ": No surface present while render requested. Did you call initialize()?");
                this.x = true;
                return;
            }
            AnimojiRenderInterface animojiRenderInterface = this.i;
            if (animojiRenderInterface == null) {
                this.d.log(LOG_TAG, this.c + ": No render interface present while render requested. Did you call initialize()?");
                this.x = true;
                return;
            }
            iiy0 iiy0Var = this.n;
            iiy0 iiy0Var2 = this.m;
            synchronized (iiy0Var) {
                iiy0Var.a = iiy0Var2.a;
                iiy0Var.b = iiy0Var2.b;
            }
            long nanoTime = System.nanoTime();
            this.k = SystemClock.elapsedRealtime();
            try {
                callOpenGLContext.makeCurrent(surface$webrtc_android_sdk_release);
                iiy0 iiy0Var3 = this.n;
                animojiRenderInterface.draw(iiy0Var3.a, iiy0Var3.b);
                callOpenGLContext.swapBuffers(surface$webrtc_android_sdk_release);
                AnimojiRenderInterface.DrawResult result = animojiRenderInterface.getResult();
                if (result != null) {
                    long nanoTime2 = System.nanoTime();
                    VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(result.getWidth(), result.getHeight(), VideoFrame.TextureBuffer.Type.RGB, result.getTextureId(), this.w, callOpenGLContext.getHandler(), this.j, this.y), 0, System.nanoTime());
                    try {
                        this.l = System.nanoTime();
                        this.b.dispatchFrame(this.c, videoFrame);
                    } finally {
                        try {
                            videoFrame.release();
                            getStatistics$webrtc_android_sdk_release().frameRendered(nanoTime2 - nanoTime);
                            this.h.onRenderFrameDrawn(this.c);
                        } catch (Throwable th) {
                        }
                    }
                    videoFrame.release();
                    getStatistics$webrtc_android_sdk_release().frameRendered(nanoTime2 - nanoTime);
                    this.h.onRenderFrameDrawn(this.c);
                }
            } finally {
                a(false);
            }
        }
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void startDrawing() {
        if (this.v.get()) {
            this.d.log(LOG_TAG, "Already released, ignore start drawing request");
        } else if (this.t.compareAndSet(false, true)) {
            this.e.render$webrtc_android_sdk_release(this);
        } else {
            this.d.log(LOG_TAG, "Drawing is already started, ignore");
        }
    }

    @Override // ru.ok.android.webrtc.animoji.render.AnimojiRenderWrapper
    public void stopDrawing() {
        if (this.t.compareAndSet(true, false)) {
            return;
        }
        this.d.log(LOG_TAG, "Drawing is already stopped, ignore");
    }

    public String toString() {
        return "AnimojiRenderWrapper-" + this.c;
    }

    public static final s3q0 a(AnimojiRenderWrapperImpl animojiRenderWrapperImpl, AnimojiRenderInterface animojiRenderInterface) {
        animojiRenderWrapperImpl.e.initDrawer$webrtc_android_sdk_release(animojiRenderWrapperImpl, animojiRenderInterface);
        return s3q0.a;
    }

    public static final s3q0 b(AnimojiRenderWrapperImpl animojiRenderWrapperImpl, CallOpenGLContext callOpenGLContext) {
        animojiRenderWrapperImpl.a(true);
        return s3q0.a;
    }

    @Override // ru.ok.android.webrtc.opengl.CallOpenGLDrawer
    public AnimojiRendererStatistics getStatistics$webrtc_android_sdk_release() {
        return this.z;
    }

    public static final s3q0 a(AnimojiRenderWrapperImpl animojiRenderWrapperImpl, CallOpenGLContext callOpenGLContext) {
        AnimojiRenderInterface animojiRenderInterface;
        float[] fArr = (float[]) animojiRenderWrapperImpl.o.getAndSet(null);
        animojiRenderWrapperImpl.q.set(false);
        if (fArr != null && (animojiRenderInterface = animojiRenderWrapperImpl.i) != null) {
            animojiRenderInterface.acceptLandmarks(fArr);
        }
        return s3q0.a;
    }

    public static final s3q0 a(AnimojiRenderWrapperImpl animojiRenderWrapperImpl, int i, CallOpenGLContext callOpenGLContext) {
        AnimojiRenderInterface animojiRenderInterface = animojiRenderWrapperImpl.i;
        if (animojiRenderInterface != null) {
            animojiRenderInterface.acceptBgColor(i);
        }
        return s3q0.a;
    }

    public final void a(boolean z) {
        this.u.set(false);
        if (z) {
            getStatistics$webrtc_android_sdk_release().frameDispatched(System.nanoTime() - this.l);
        }
        if (!this.t.get() || this.v.get()) {
            return;
        }
        this.e.renderLater$webrtc_android_sdk_release(this, Math.max(4L, 33 - (SystemClock.elapsedRealtime() - this.k)));
    }

    public final void a() {
        if (this.v.get()) {
            return;
        }
        if (this.i == null) {
            RTCLog rTCLog = this.d;
            CallParticipant.ParticipantId participantId = this.c;
            AnimojiRenderWrapper.Companion companion = AnimojiRenderWrapper.Companion;
            rTCLog.log(LOG_TAG, "GLEffects is not ready for " + participantId + ", retrying in " + companion.getSvgRetryIntervalMs() + " ms");
            a(companion.getSvgRetryIntervalMs());
            return;
        }
        try {
            this.g.prepare();
            final byte[] asData = this.g.asData();
            final int bgColorRGB = this.g.bgColorRGB();
            Integer num = this.p;
            if (num != null) {
                bgColorRGB = num.intValue();
            }
            this.b.dispatchLoadedSvg(this.c, this.g);
            this.e.post$webrtc_android_sdk_release(new izs() { // from class: xsna.hs2
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    return AnimojiRenderWrapperImpl.a(AnimojiRenderWrapperImpl.this, asData, bgColorRGB, (CallOpenGLContext) obj);
                }
            });
            this.d.log(LOG_TAG, "Svg loaded for " + this.c);
        } catch (Throwable unused) {
            RTCLog rTCLog2 = this.d;
            CallParticipant.ParticipantId participantId2 = this.c;
            AnimojiRenderWrapper.Companion companion2 = AnimojiRenderWrapper.Companion;
            rTCLog2.log(LOG_TAG, "svg failed for " + participantId2 + ", retrying in " + companion2.getSvgRetryIntervalMs() + " ms");
            a(companion2.getSvgRetryIntervalMs());
        }
    }

    public static final s3q0 a(AnimojiRenderWrapperImpl animojiRenderWrapperImpl, byte[] bArr, int i, CallOpenGLContext callOpenGLContext) {
        AnimojiRenderInterface animojiRenderInterface = animojiRenderWrapperImpl.i;
        if (animojiRenderInterface != null) {
            animojiRenderInterface.acceptSvg(bArr, i);
        }
        return s3q0.a;
    }

    public final void a(long j) {
        c cVar;
        if (this.v.get() || (cVar = (c) this.s.getAndSet(a.b().d(this.r, j, TimeUnit.MILLISECONDS))) == null) {
            return;
        }
        cVar.dispose();
    }
}
