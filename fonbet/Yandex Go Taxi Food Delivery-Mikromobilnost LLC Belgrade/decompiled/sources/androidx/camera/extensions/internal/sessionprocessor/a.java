package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.media.Image;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.s;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceConfigurationImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import defpackage.a3c;
import defpackage.ao7;
import defpackage.azo;
import defpackage.b48;
import defpackage.c94;
import defpackage.dy40;
import defpackage.h2r;
import defpackage.hdv;
import defpackage.k8j0;
import defpackage.l0r0;
import defpackage.ld1;
import defpackage.o0r0;
import defpackage.o3;
import defpackage.p0r0;
import defpackage.q6x0;
import defpackage.q74;
import defpackage.q7j0;
import defpackage.rdv;
import defpackage.sgb1;
import defpackage.sy80;
import defpackage.v5c0;
import defpackage.wn7;
import defpackage.x34;
import defpackage.yn7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class a extends p0r0 {
    public final SessionProcessorImpl i;
    public final ld1 j;
    public final Context k;
    public final int l;
    public final dy40 m;
    public boolean n;
    public final dy40 o;
    public final AdvancedSessionProcessor$ExtensionMetadataMonitor p;
    public final boolean q;

    public a(SessionProcessorImpl sessionProcessorImpl, List list, ld1 ld1Var, Context context, int i) {
        super(list);
        boolean z;
        CaptureRequest.Key key;
        CaptureResult.Key key2;
        boolean z2 = false;
        this.n = false;
        new HashMap();
        this.i = sessionProcessorImpl;
        this.j = ld1Var;
        this.k = context;
        this.q = ld1Var.r();
        this.l = i;
        c94 c94Var = c94.B;
        if (a3c.b(c94Var) && azo.f(c94Var) && Build.VERSION.SDK_INT >= 34) {
            List g = ld1Var.g();
            key2 = CaptureResult.EXTENSION_CURRENT_TYPE;
            z = g.contains(key2);
        } else {
            z = false;
        }
        dy40 dy40Var = z ? new dy40(Integer.valueOf(i)) : null;
        this.m = dy40Var;
        c94 c94Var2 = c94.B;
        if (a3c.b(c94Var2) && azo.f(c94Var2) && Build.VERSION.SDK_INT >= 34) {
            List c = ld1Var.c();
            key = CaptureRequest.EXTENSION_STRENGTH;
            z2 = c.contains(key);
        }
        dy40 dy40Var2 = z2 ? new dy40(100) : null;
        this.o = dy40Var2;
        if (dy40Var == null && dy40Var2 == null) {
            this.p = null;
        } else {
            this.p = new AdvancedSessionProcessor$ExtensionMetadataMonitor(dy40Var, dy40Var2);
        }
    }

    public static HashMap r(b48 b48Var) {
        HashMap hashMap = new HashMap();
        q7j0 q7j0Var = new q7j0();
        b48Var.j(new h2r(29, q7j0Var, b48Var));
        v5c0 a = q7j0Var.a();
        for (x34 x34Var : a.h()) {
            hashMap.put((CaptureRequest.Key) x34Var.c, a.f(x34Var));
        }
        return hashMap;
    }

    public static ao7 s(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            arrayList.add(yn7.a((Camera2OutputConfigImpl) it.next()));
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            hashMap.put(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        int sessionTemplateId = camera2SessionConfigImpl.getSessionTemplateId();
        c94 c94Var = c94.B;
        int i = 0;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            try {
                int sessionType = camera2SessionConfigImpl.getSessionType();
                if (sessionType != -1) {
                    i = sessionType;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return new ao7(sessionTemplateId, i, arrayList, hashMap);
    }

    @Override // defpackage.m0r0
    public final void a(final k8j0 k8j0Var) {
        this.i.onCaptureSessionStart(new RequestProcessorImpl(k8j0Var) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$RequestProcessorImplAdapter
            private final k8j0 mRequestProcessor;

            {
                this.mRequestProcessor = k8j0Var;
            }

            public void abortCaptures() {
                s sVar;
                o oVar = (o) this.mRequestProcessor;
                synchronized (oVar.a) {
                    try {
                        if (!oVar.d && (sVar = oVar.b) != null) {
                            sVar.i();
                        }
                    } finally {
                    }
                }
            }

            public void setImageProcessor(int i, ImageProcessorImpl imageProcessorImpl) {
                a.this.q(i, new hdv(imageProcessorImpl) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageProcessorAdapter
                    private final ImageProcessorImpl mImpl;

                    {
                        this.mImpl = imageProcessorImpl;
                    }

                    @Override // defpackage.hdv
                    public void onNextImageAvailable(int i2, long j, final rdv rdvVar, String str) {
                        this.mImpl.onNextImageAvailable(i2, j, new ImageReferenceImpl(rdvVar) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$ImageReferenceImplAdapter
                            private final rdv mImageReference;

                            {
                                this.mImageReference = rdvVar;
                            }

                            public boolean decrement() {
                                return ((o0r0) this.mImageReference).a();
                            }

                            public Image get() {
                                return ((o0r0) this.mImageReference).b;
                            }

                            public boolean increment() {
                                o0r0 o0r0Var = (o0r0) this.mImageReference;
                                synchronized (o0r0Var.c) {
                                    try {
                                        int i3 = o0r0Var.a;
                                        if (i3 <= 0) {
                                            return false;
                                        }
                                        o0r0Var.a = i3 + 1;
                                        return true;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }, str);
                    }
                });
            }

            public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
                return ((o) this.mRequestProcessor).c(new AdvancedSessionProcessor$RequestAdapter(request), new AdvancedSessionProcessor$CallbackAdapter(callback));
            }

            public void stopRepeating() {
                ((o) this.mRequestProcessor).d();
            }

            public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
                ArrayList arrayList = new ArrayList();
                Iterator<RequestProcessorImpl.Request> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AdvancedSessionProcessor$RequestAdapter(it.next()));
                }
                return ((o) this.mRequestProcessor).e(arrayList, new AdvancedSessionProcessor$CallbackAdapter(callback));
            }

            public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
                k8j0 k8j0Var2 = this.mRequestProcessor;
                AdvancedSessionProcessor$RequestAdapter advancedSessionProcessor$RequestAdapter = new AdvancedSessionProcessor$RequestAdapter(request);
                AdvancedSessionProcessor$CallbackAdapter advancedSessionProcessor$CallbackAdapter = new AdvancedSessionProcessor$CallbackAdapter(callback);
                o oVar = (o) k8j0Var2;
                oVar.getClass();
                return oVar.e(Arrays.asList(advancedSessionProcessor$RequestAdapter), advancedSessionProcessor$CallbackAdapter);
            }
        });
    }

    @Override // defpackage.m0r0
    public final void b() {
        this.i.onCaptureSessionEnd();
    }

    @Override // defpackage.m0r0
    public final Map d(Size size) {
        return this.j.d(size);
    }

    @Override // defpackage.m0r0
    public final int e(q6x0 q6x0Var, l0r0 l0r0Var) {
        AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter;
        synchronized (this.e) {
            advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter = new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(l0r0Var, q6x0Var, this.p, this.q);
        }
        return this.i.startRepeating(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // defpackage.m0r0
    public final void f(wn7 wn7Var) {
        HashMap r;
        CaptureRequest.Key key;
        synchronized (this.e) {
            try {
                r = r(wn7Var);
                if (this.h != -1 && Build.VERSION.SDK_INT >= 34) {
                    key = CaptureRequest.EXTENSION_STRENGTH;
                    r.put(key, Integer.valueOf(this.h));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i.setParameters(r);
    }

    @Override // defpackage.m0r0
    public final void g() {
        this.i.stopRepeating();
        synchronized (this.e) {
        }
    }

    @Override // defpackage.m0r0
    public final void h(b48 b48Var, q6x0 q6x0Var, o3 o3Var) {
        HashMap r = r(b48Var);
        c94 c94Var = c94.A;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            this.i.startTrigger(r, new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(o3Var, q6x0Var, this.q));
        }
    }

    @Override // defpackage.m0r0
    public final int k(boolean z, q6x0 q6x0Var, o3 o3Var) {
        sgb1.g(3, "AdvancedSessionProcessor");
        AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter = new AdvancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter(o3Var, q6x0Var, this.q);
        c94 c94Var = c94.B;
        return (a3c.b(c94Var) && azo.f(c94Var) && this.n && z && this.j.s()) ? this.i.startCaptureWithPostview(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter) : this.i.startCapture(advancedSessionProcessor$SessionProcessorImplCaptureCallbackAdapter);
    }

    @Override // defpackage.m0r0
    public final List l() {
        return this.j.b();
    }

    @Override // defpackage.p0r0
    public final void o() {
        synchronized (this.e) {
            new HashMap();
        }
        this.i.deInitSession();
    }

    @Override // defpackage.p0r0
    public final ao7 p(String str, LinkedHashMap linkedHashMap, final q74 q74Var) {
        sy80 sy80Var = q74Var.c;
        c94 c94Var = c94.B;
        Camera2SessionConfigImpl initSession = (a3c.b(c94Var) && azo.f(c94Var)) ? this.i.initSession(str, linkedHashMap, this.k, new OutputSurfaceConfigurationImpl(q74Var) { // from class: androidx.camera.extensions.internal.sessionprocessor.AdvancedSessionProcessor$OutputSurfaceConfigurationImplAdapter
            private final OutputSurfaceImpl mAnalysisOutputSurface;
            private final OutputSurfaceImpl mCaptureOutputSurface;
            private final OutputSurfaceImpl mPostviewOutputSurface;
            private final OutputSurfaceImpl mPreviewOutputSurface;

            {
                this.mPreviewOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.d());
                this.mCaptureOutputSurface = new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.b());
                this.mAnalysisOutputSurface = q74Var.a() != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.a()) : null;
                this.mPostviewOutputSurface = q74Var.c() != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.c()) : null;
            }

            public OutputSurfaceImpl getImageAnalysisOutputSurface() {
                return this.mAnalysisOutputSurface;
            }

            public OutputSurfaceImpl getImageCaptureOutputSurface() {
                return this.mCaptureOutputSurface;
            }

            public OutputSurfaceImpl getPostviewOutputSurface() {
                return this.mPostviewOutputSurface;
            }

            public OutputSurfaceImpl getPreviewOutputSurface() {
                return this.mPreviewOutputSurface;
            }
        }) : null;
        if (initSession == null) {
            initSession = this.i.initSession(str, linkedHashMap, this.k, new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.a), new AdvancedSessionProcessor$OutputSurfaceImplAdapter(q74Var.b), sy80Var != null ? new AdvancedSessionProcessor$OutputSurfaceImplAdapter(sy80Var) : null);
        }
        this.n = q74Var.d != null;
        dy40 dy40Var = this.m;
        if (dy40Var != null) {
            dy40Var.m(Integer.valueOf(this.l));
        }
        dy40 dy40Var2 = this.o;
        if (dy40Var2 != null) {
            dy40Var2.m(100);
        }
        return s(initSession);
    }
}
