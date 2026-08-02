package ru.ok.android.webrtc.opengl;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import defpackage.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okcalls.b0;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.opengl.CallOpenGLContext;
import ru.ok.android.webrtc.opengl.CallOpenGLDrawer;
import ru.ok.android.webrtc.opengl.CallOpenGLRenderer;
import ru.ok.android.webrtc.opengl.CallRendererFrameTransform;
import xsna.go9;
import xsna.gzs;
import xsna.izs;
import xsna.ku1;
import xsna.lq5;
import xsna.mu1;
import xsna.mz;
import xsna.ri0;
import xsna.s3q0;
import xsna.zcl;
import xsna.zo8;

/* loaded from: classes9.dex */
public final class CallOpenGLRenderer {
    public static final Companion Companion = new Companion(null);
    public static final long STAT_LOG_INTERVAL = 5000;
    public static final String THREAD_NAME = "VoipGLRenderer";
    public final RTCLog a;
    public final EglBase.Context b;
    public final int[] c;
    public final AnonymousClass1 d;
    public final String e;
    public final CallOpenGLContext f;
    public final Matrix g;
    public final VideoFrameDrawer h;
    public final GlRectDrawer i;
    public final ArrayList j;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Runnable, ru.ok.android.webrtc.opengl.CallOpenGLRenderer$1] */
    public CallOpenGLRenderer(RTCLog rTCLog, EglBase.Context context, int[] iArr, String str) {
        this.a = rTCLog;
        this.b = context;
        this.c = iArr;
        this.e = go9.b("CallOpenGL_renderer_", str);
        this.f = new CallOpenGLContext(rTCLog, ((EglBase14.Context) context).getRawContext(), iArr, new b0(1, this, CallOpenGLRenderer.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0), str);
        this.g = new Matrix();
        this.h = new VideoFrameDrawer();
        this.i = new GlRectDrawer();
        this.j = new ArrayList();
        ?? r13 = new Runnable() { // from class: ru.ok.android.webrtc.opengl.CallOpenGLRenderer.1
            @Override // java.lang.Runnable
            public void run() {
                List list = CallOpenGLRenderer.this.j;
                CallOpenGLRenderer callOpenGLRenderer = CallOpenGLRenderer.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((CallOpenGLDrawer) it.next()).getStatistics$webrtc_android_sdk_release().log(callOpenGLRenderer.getLogger$webrtc_android_sdk_release());
                }
                CallOpenGLRenderer.this.postDelayed$webrtc_android_sdk_release(this, 5000L);
            }
        };
        postDelayed$webrtc_android_sdk_release(r13, 5000L);
        this.d = r13;
    }

    public static final s3q0 a(CallOpenGLDrawer callOpenGLDrawer, CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        callOpenGLDrawer.render$webrtc_android_sdk_release(callOpenGLRenderer, callOpenGLContext);
        return s3q0.a;
    }

    public static final void access$onReleaseContext(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        callOpenGLContext.cancel(callOpenGLRenderer.d);
        callOpenGLRenderer.a.log(callOpenGLRenderer.e, "Statistics report task cancelled");
        callOpenGLRenderer.a(callOpenGLContext);
        callOpenGLRenderer.i.release();
        callOpenGLRenderer.a.log(callOpenGLRenderer.e, "Shared holder released");
        callOpenGLRenderer.h.release();
        callOpenGLRenderer.a.log(callOpenGLRenderer.e, "Frame drawer released");
    }

    public static final s3q0 b(CallOpenGLDrawer callOpenGLDrawer, CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        callOpenGLDrawer.render$webrtc_android_sdk_release(callOpenGLRenderer, callOpenGLContext);
        return s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void releaseSurface$default(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLDrawer callOpenGLDrawer, gzs gzsVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        callOpenGLRenderer.releaseSurface(callOpenGLDrawer, gzsVar);
    }

    public final void clearImage(CallVideoFrameDrawer callVideoFrameDrawer) {
        this.f.postAtFrontOfQueue("clearImage", new mz(callVideoFrameDrawer, 14));
    }

    public final void createPBufferSurface(final CallOpenGLDrawer callOpenGLDrawer, final int i, final int i2) {
        this.f.postAtFrontOfQueue("createPBufferSurface", new izs() { // from class: xsna.v69
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return CallOpenGLRenderer.a(CallOpenGLDrawer.this, i, i2, (CallOpenGLContext) obj);
            }
        });
    }

    public final void createSurface(CallOpenGLDrawer callOpenGLDrawer, Surface surface) {
        this.f.postAtFrontOfQueue("createSurface", new mu1(3, callOpenGLDrawer, surface));
    }

    public final int[] getConfigAttributes() {
        return this.c;
    }

    public final RTCLog getLogger$webrtc_android_sdk_release() {
        return this.a;
    }

    public final EglBase.Context getSharedContext() {
        return this.b;
    }

    public final void initDrawer$webrtc_android_sdk_release(CallOpenGLDrawer callOpenGLDrawer, Object obj) {
        this.f.postAtFrontOfQueue("initDrawer", new zo8(callOpenGLDrawer, obj, this, 1));
    }

    public final boolean post$webrtc_android_sdk_release(izs<? super CallOpenGLContext, s3q0> izsVar) {
        return this.f.post("post", izsVar);
    }

    public final boolean postAtFrontOfQueue$webrtc_android_sdk_release(izs<? super CallOpenGLContext, s3q0> izsVar) {
        return this.f.postAtFrontOfQueue("postAtFrontOfQueue", izsVar);
    }

    public final boolean postDelayed$webrtc_android_sdk_release(Runnable runnable, long j) {
        return this.f.postDelayed(runnable, j);
    }

    public final void release() {
        ThreadUtils.awaitUninterruptibly(this.f.release());
    }

    public final void releaseDrawer$webrtc_android_sdk_release(CallOpenGLDrawer callOpenGLDrawer) {
        this.f.postAtFrontOfQueue("releaseDrawer", new ri0(5, this, callOpenGLDrawer));
    }

    public final void releaseSurface(CallOpenGLDrawer callOpenGLDrawer, gzs<s3q0> gzsVar) {
        if (this.f.postAtFrontOfQueue("releaseSurface", new lq5(this, callOpenGLDrawer, gzsVar, 1)) || gzsVar == null) {
            return;
        }
        gzsVar.invoke();
    }

    public final void render$webrtc_android_sdk_release(CallOpenGLDrawer callOpenGLDrawer) {
        this.f.post("render", new m(4, callOpenGLDrawer, this));
    }

    public final void renderLater$webrtc_android_sdk_release(CallOpenGLDrawer callOpenGLDrawer, long j) {
        this.f.postDelayed("renderLater", new ku1(5, callOpenGLDrawer, this), j);
    }

    public final void render$webrtc_android_sdk_release(CallOpenGLContext callOpenGLContext, CallVideoFrameDrawer callVideoFrameDrawer, VideoFrame videoFrame, CallRendererFrameTransform.Modifiers modifiers) {
        EGLSurface surface$webrtc_android_sdk_release = callVideoFrameDrawer.getSurface$webrtc_android_sdk_release();
        if (surface$webrtc_android_sdk_release == null || surface$webrtc_android_sdk_release.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        long nanoTime = System.nanoTime();
        callOpenGLContext.makeCurrent(surface$webrtc_android_sdk_release);
        callOpenGLContext.checkForErrors("makeCurrent()");
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        GLES20.glClear(16384);
        this.g.reset();
        this.g.preTranslate(0.5f, 0.5f);
        modifiers.apply(this.g);
        this.g.preTranslate(-0.5f, -0.5f);
        VideoFrameDrawer videoFrameDrawer = this.h;
        RendererCommon.GlDrawer drawer$webrtc_android_sdk_release = callVideoFrameDrawer.getDrawer$webrtc_android_sdk_release();
        if (drawer$webrtc_android_sdk_release == null) {
            drawer$webrtc_android_sdk_release = this.i;
        }
        videoFrameDrawer.drawFrame(videoFrame, drawer$webrtc_android_sdk_release, this.g, 0, 0, callOpenGLContext.getSurfaceWidth(surface$webrtc_android_sdk_release), callOpenGLContext.getSurfaceHeight(surface$webrtc_android_sdk_release));
        callOpenGLContext.checkForErrors("drawFrame()");
        long nanoTime2 = System.nanoTime();
        callOpenGLContext.swapBuffers(surface$webrtc_android_sdk_release);
        long nanoTime3 = System.nanoTime();
        callVideoFrameDrawer.getStatistics$webrtc_android_sdk_release().trackDurations(nanoTime3 - nanoTime, nanoTime3 - nanoTime2);
        callOpenGLContext.checkForErrors("swapBuffers()");
    }

    public static final s3q0 a(CallVideoFrameDrawer callVideoFrameDrawer, CallOpenGLContext callOpenGLContext) {
        EGLSurface surface$webrtc_android_sdk_release = callVideoFrameDrawer.getSurface$webrtc_android_sdk_release();
        if (surface$webrtc_android_sdk_release == null) {
            return s3q0.a;
        }
        callOpenGLContext.clearImage(surface$webrtc_android_sdk_release);
        return s3q0.a;
    }

    public static final s3q0 a(CallOpenGLDrawer callOpenGLDrawer, Surface surface, CallOpenGLContext callOpenGLContext) {
        callOpenGLContext.releaseSurface(callOpenGLDrawer.getSurface$webrtc_android_sdk_release());
        callOpenGLDrawer.setSurface$webrtc_android_sdk_release(callOpenGLContext.createSurface(surface));
        return s3q0.a;
    }

    public static final s3q0 a(CallOpenGLDrawer callOpenGLDrawer, int i, int i2, CallOpenGLContext callOpenGLContext) {
        callOpenGLContext.releaseSurface(callOpenGLDrawer.getSurface$webrtc_android_sdk_release());
        callOpenGLDrawer.setSurface$webrtc_android_sdk_release(callOpenGLContext.createPBufferSurface(i, i2));
        return s3q0.a;
    }

    public static final s3q0 a(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLDrawer callOpenGLDrawer, gzs gzsVar, CallOpenGLContext callOpenGLContext) {
        try {
            callOpenGLRenderer.getClass();
            EGLSurface surface$webrtc_android_sdk_release = callOpenGLDrawer.getSurface$webrtc_android_sdk_release();
            callOpenGLDrawer.setSurface$webrtc_android_sdk_release(null);
            callOpenGLContext.releaseSurface(surface$webrtc_android_sdk_release);
            return s3q0.a;
        } finally {
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    public static final s3q0 a(CallOpenGLDrawer callOpenGLDrawer, Object obj, CallOpenGLRenderer callOpenGLRenderer, CallOpenGLContext callOpenGLContext) {
        callOpenGLDrawer.onInitialize$webrtc_android_sdk_release(callOpenGLContext, obj);
        callOpenGLRenderer.j.add(callOpenGLDrawer);
        return s3q0.a;
    }

    public static final s3q0 a(CallOpenGLRenderer callOpenGLRenderer, CallOpenGLDrawer callOpenGLDrawer, CallOpenGLContext callOpenGLContext) {
        if (!callOpenGLRenderer.j.remove(callOpenGLDrawer)) {
            return s3q0.a;
        }
        EGLSurface surface$webrtc_android_sdk_release = callOpenGLDrawer.getSurface$webrtc_android_sdk_release();
        callOpenGLDrawer.setSurface$webrtc_android_sdk_release(null);
        callOpenGLContext.releaseSurface(surface$webrtc_android_sdk_release);
        callOpenGLDrawer.onRelease$webrtc_android_sdk_release(callOpenGLContext);
        return s3q0.a;
    }

    public /* synthetic */ CallOpenGLRenderer(RTCLog rTCLog, EglBase.Context context, int[] iArr, String str, int i, zcl zclVar) {
        this(rTCLog, context, iArr, (i & 8) != 0 ? null : str);
    }

    public final void a(CallOpenGLContext callOpenGLContext) {
        this.a.log(this.e, "Will now release " + this.j.size() + " registered drawers");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CallOpenGLDrawer callOpenGLDrawer = (CallOpenGLDrawer) obj;
            EGLSurface surface$webrtc_android_sdk_release = callOpenGLDrawer.getSurface$webrtc_android_sdk_release();
            callOpenGLDrawer.setSurface$webrtc_android_sdk_release(null);
            callOpenGLContext.releaseSurface(surface$webrtc_android_sdk_release);
            callOpenGLDrawer.onRelease$webrtc_android_sdk_release(callOpenGLContext);
        }
        this.a.log(this.e, this.j.size() + " drawers were released");
        this.j.clear();
    }
}
