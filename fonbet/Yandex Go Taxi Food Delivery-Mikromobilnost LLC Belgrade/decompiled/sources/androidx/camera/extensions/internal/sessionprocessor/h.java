package androidx.camera.extensions.internal.sessionprocessor;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.o;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.impl.RequestUpdateProcessorImpl;
import defpackage.a3c;
import defpackage.ao7;
import defpackage.azo;
import defpackage.b48;
import defpackage.bf5;
import defpackage.c94;
import defpackage.d6z;
import defpackage.gy60;
import defpackage.h0w;
import defpackage.h2r;
import defpackage.k8j0;
import defpackage.l0r0;
import defpackage.o3;
import defpackage.o5j0;
import defpackage.p0r0;
import defpackage.q501;
import defpackage.q6x0;
import defpackage.q74;
import defpackage.q7j0;
import defpackage.r84;
import defpackage.sgb1;
import defpackage.sy80;
import defpackage.v5c0;
import defpackage.wn7;
import defpackage.x34;
import defpackage.x64;
import defpackage.xn7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class h extends p0r0 {
    public static final AtomicInteger C = new AtomicInteger(0);
    public final bf5 A;
    public final boolean B;
    public final Context i;
    public final PreviewExtenderImpl j;
    public final ImageCaptureExtenderImpl k;
    public volatile StillCaptureProcessor l;
    public volatile PreviewProcessor m;
    public volatile RequestUpdateProcessorImpl n;
    public volatile xn7 o;
    public volatile xn7 p;
    public volatile r84 q;
    public volatile sy80 r;
    public volatile sy80 s;
    public volatile k8j0 t;
    public volatile boolean u;
    public final AtomicInteger v;
    public final LinkedHashMap w;
    public final HashMap x;
    public final gy60 y;
    public sy80 z;

    public h(PreviewExtenderImpl previewExtenderImpl, ImageCaptureExtenderImpl imageCaptureExtenderImpl, List list, bf5 bf5Var, Context context) {
        super(list);
        this.l = null;
        this.m = null;
        this.n = null;
        this.q = null;
        this.u = false;
        this.v = new AtomicInteger(0);
        this.w = new LinkedHashMap();
        this.x = new HashMap();
        this.y = new gy60();
        this.j = previewExtenderImpl;
        this.k = imageCaptureExtenderImpl;
        this.i = context;
        this.A = bf5Var;
        this.B = bf5Var.r();
    }

    public static HashMap t(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put((CaptureResult.Key) pair.first, pair.second);
        }
        return hashMap;
    }

    @Override // defpackage.m0r0
    public final void a(k8j0 k8j0Var) {
        this.t = k8j0Var;
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl onEnableSession = this.j.onEnableSession();
        Objects.toString(onEnableSession);
        sgb1.g(3, "BasicSessionProcessor");
        if (onEnableSession != null) {
            arrayList.add(onEnableSession);
        }
        CaptureStageImpl onEnableSession2 = this.k.onEnableSession();
        Objects.toString(onEnableSession2);
        sgb1.g(3, "BasicSessionProcessor");
        if (onEnableSession2 != null) {
            arrayList.add(onEnableSession2);
        }
        gy60 gy60Var = this.y;
        if (gy60Var.a) {
            gy60Var.b = SystemClock.elapsedRealtime();
        }
        if (!arrayList.isEmpty()) {
            u(k8j0Var, arrayList);
        }
        if (this.m != null) {
            this.m.resume();
            q(this.o.getId(), new c(this));
        }
    }

    @Override // defpackage.m0r0
    public final void b() {
        gy60 gy60Var = this.y;
        if (gy60Var.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = gy60Var.b;
            while (true) {
                long j2 = elapsedRealtime - j;
                if (j2 >= 100) {
                    break;
                }
                long j3 = 100 - j2;
                try {
                    sgb1.g(3, "OnEnableDisableSessionDurationCheck");
                    Thread.sleep(j3);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    j = gy60Var.b;
                } catch (InterruptedException unused) {
                    sgb1.d("OnEnableDisableSessionDurationCheck", "sleep interrupted");
                }
            }
        }
        if (this.m != null) {
            this.m.pause();
        }
        ArrayList arrayList = new ArrayList();
        CaptureStageImpl onDisableSession = this.j.onDisableSession();
        Objects.toString(onDisableSession);
        sgb1.g(3, "BasicSessionProcessor");
        if (onDisableSession != null) {
            arrayList.add(onDisableSession);
        }
        CaptureStageImpl onDisableSession2 = this.k.onDisableSession();
        Objects.toString(onDisableSession2);
        sgb1.g(3, "BasicSessionProcessor");
        if (onDisableSession2 != null) {
            arrayList.add(onDisableSession2);
        }
        if (!arrayList.isEmpty()) {
            u(this.t, arrayList);
        }
        this.t = null;
        this.u = false;
    }

    @Override // defpackage.m0r0
    public final Map d(Size size) {
        return this.A.c(size);
    }

    @Override // defpackage.m0r0
    public final int e(q6x0 q6x0Var, l0r0 l0r0Var) {
        int andIncrement = this.v.getAndIncrement();
        if (this.t == null) {
            l0r0Var.g();
            return andIncrement;
        }
        if (this.m != null) {
            this.m.start(new b(this, l0r0Var, andIncrement, q6x0Var));
        }
        v(andIncrement, l0r0Var);
        return andIncrement;
    }

    @Override // defpackage.m0r0
    public final void f(wn7 wn7Var) {
        synchronized (this.e) {
            try {
                HashMap hashMap = new HashMap();
                q7j0 q7j0Var = new q7j0();
                wn7Var.j(new h2r(29, q7j0Var, wn7Var));
                v5c0 a = q7j0Var.a();
                for (x34 x34Var : a.h()) {
                    hashMap.put((CaptureRequest.Key) x34Var.c, a.f(x34Var));
                }
                this.w.clear();
                this.w.putAll(hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m0r0
    public final void g() {
        ((o) this.t).d();
    }

    @Override // defpackage.m0r0
    public final void h(b48 b48Var, q6x0 q6x0Var, o3 o3Var) {
        sgb1.g(3, "BasicSessionProcessor");
        int andIncrement = this.v.getAndIncrement();
        ao7 ao7Var = new ao7();
        ao7Var.a(this.o.getId());
        if (this.q != null) {
            ao7Var.a(this.q.a);
        }
        ao7Var.c = 1;
        r(ao7Var);
        s(ao7Var);
        q7j0 q7j0Var = new q7j0();
        b48Var.j(new h2r(29, q7j0Var, b48Var));
        v5c0 a = q7j0Var.a();
        for (x34 x34Var : a.h()) {
            ao7Var.a.put((CaptureRequest.Key) x34Var.c, a.f(x34Var));
        }
        k8j0 k8j0Var = this.t;
        o5j0 o5j0Var = new o5j0(ao7Var.c, ao7Var.d, ao7Var.b, ao7Var.a);
        h0w h0wVar = new h0w(o3Var, andIncrement, q6x0Var);
        o oVar = (o) k8j0Var;
        oVar.getClass();
        oVar.e(Arrays.asList(o5j0Var), h0wVar);
    }

    @Override // defpackage.m0r0
    public final int k(boolean z, q6x0 q6x0Var, o3 o3Var) {
        sgb1.g(3, "BasicSessionProcessor");
        int andIncrement = this.v.getAndIncrement();
        if (this.t == null || this.u) {
            sgb1.g(3, "BasicSessionProcessor");
            o3Var.g();
            return andIncrement;
        }
        this.u = true;
        ArrayList arrayList = new ArrayList();
        List<CaptureStageImpl> captureStages = this.k.getCaptureStages();
        ArrayList arrayList2 = new ArrayList();
        for (CaptureStageImpl captureStageImpl : captureStages) {
            ao7 ao7Var = new ao7();
            ao7Var.a(this.p.getId());
            ao7Var.c = 2;
            ao7Var.d = captureStageImpl.getId();
            arrayList2.add(Integer.valueOf(captureStageImpl.getId()));
            r(ao7Var);
            s(ao7Var);
            for (Pair pair : captureStageImpl.getParameters()) {
                ao7Var.a.put((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList.add(new o5j0(ao7Var.c, ao7Var.d, ao7Var.b, ao7Var.a));
        }
        arrayList2.toString();
        sgb1.g(3, "BasicSessionProcessor");
        e eVar = new e(andIncrement, o3Var, q6x0Var, this);
        sgb1.g(3, "BasicSessionProcessor");
        if (this.l != null) {
            q(this.p.getId(), new f(this, o3Var, andIncrement));
            this.l.startCapture(z, arrayList2, new g(andIncrement, o3Var, q6x0Var, this));
        }
        ((o) this.t).e(arrayList, eVar);
        return andIncrement;
    }

    @Override // defpackage.p0r0
    public final void o() {
        if (this.m != null) {
            this.m.close();
            this.m = null;
        }
        if (this.l != null) {
            this.l.close();
            this.l = null;
        }
        sgb1.g(3, "BasicSessionProcessor");
        this.j.onDeInit();
        sgb1.g(3, "BasicSessionProcessor");
        this.k.onDeInit();
    }

    @Override // defpackage.p0r0
    public final ao7 p(String str, LinkedHashMap linkedHashMap, q74 q74Var) {
        sgb1.g(3, "BasicSessionProcessor");
        this.j.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.i);
        sgb1.g(3, "BasicSessionProcessor");
        this.k.onInit(str, (CameraCharacteristics) linkedHashMap.get(str), this.i);
        this.r = q74Var.a;
        this.s = q74Var.b;
        this.z = q74Var.d;
        PreviewExtenderImpl.ProcessorType processorType = this.j.getProcessorType();
        Objects.toString(processorType);
        sgb1.g(3, "BasicSessionProcessor");
        if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) {
            this.o = new x64(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, this.r.b(), 35, 2);
            this.m = new PreviewProcessor(this.j.getProcessor(), this.r.c(), this.r.b());
        } else if (processorType == PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY) {
            this.o = new r84(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, this.r.c());
            this.n = this.j.getProcessor();
        } else {
            this.o = new r84(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, this.r.c());
        }
        CaptureProcessorImpl captureProcessor = this.k.getCaptureProcessor();
        Objects.toString(captureProcessor);
        sgb1.g(3, "BasicSessionProcessor");
        if (captureProcessor != null) {
            this.p = new x64(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, this.s.b(), 35, this.k.getMaxCaptureStage());
            this.l = new StillCaptureProcessor(captureProcessor, this.s.c(), this.s.b(), this.z, !this.B);
        } else {
            this.p = new r84(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, this.s.c());
        }
        if (q74Var.c != null) {
            this.q = new r84(C.getAndIncrement(), -1, null, Collections.EMPTY_LIST, q74Var.c.c());
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.o);
        arrayList.add(this.p);
        c94 c94Var = c94.B;
        int i = 0;
        if (a3c.b(c94Var) && azo.f(c94Var)) {
            int onSessionType = this.j.onSessionType();
            d6z.m("Needs same session type in both PreviewExtenderImpl and ImageCaptureExtenderImpl", onSessionType == this.k.onSessionType());
            if (onSessionType != -1) {
                i = onSessionType;
            }
        }
        if (this.q != null) {
            arrayList.add(this.q);
        }
        CaptureStageImpl onPresetSession = this.j.onPresetSession();
        Objects.toString(onPresetSession);
        sgb1.g(3, "BasicSessionProcessor");
        CaptureStageImpl onPresetSession2 = this.k.onPresetSession();
        Objects.toString(onPresetSession2);
        sgb1.g(3, "BasicSessionProcessor");
        if (onPresetSession != null && onPresetSession.getParameters() != null) {
            for (Pair pair : onPresetSession.getParameters()) {
                hashMap.put((CaptureRequest.Key) pair.first, pair.second);
            }
        }
        if (onPresetSession2 != null && onPresetSession2.getParameters() != null) {
            for (Pair pair2 : onPresetSession2.getParameters()) {
                hashMap.put((CaptureRequest.Key) pair2.first, pair2.second);
            }
        }
        return new ao7(1, i, arrayList, hashMap);
    }

    public final void r(ao7 ao7Var) {
        synchronized (this.e) {
            try {
                for (CaptureRequest.Key key : this.w.keySet()) {
                    Object obj = this.w.get(key);
                    if (obj != null) {
                        ao7Var.a.put(key, obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(ao7 ao7Var) {
        CaptureStageImpl captureStage = this.j.getCaptureStage();
        if (captureStage != null) {
            for (Pair pair : captureStage.getParameters()) {
                ao7Var.a.put((CaptureRequest.Key) pair.first, pair.second);
            }
        }
    }

    public final void u(k8j0 k8j0Var, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CaptureStageImpl captureStageImpl = (CaptureStageImpl) it.next();
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap = new HashMap();
            arrayList3.add(Integer.valueOf(this.o.getId()));
            if (this.q != null) {
                arrayList3.add(Integer.valueOf(this.q.a));
            }
            for (Pair pair : captureStageImpl.getParameters()) {
                hashMap.put((CaptureRequest.Key) pair.first, pair.second);
            }
            arrayList2.add(new o5j0(1, 0, arrayList3, hashMap));
        }
        ((o) k8j0Var).e(arrayList2, new q501(8));
    }

    public final void v(int i, l0r0 l0r0Var) {
        if (this.t == null) {
            sgb1.g(3, "BasicSessionProcessor");
            return;
        }
        ao7 ao7Var = new ao7();
        ao7Var.a(this.o.getId());
        if (this.q != null) {
            ao7Var.a(this.q.a);
        }
        ao7Var.c = 1;
        r(ao7Var);
        s(ao7Var);
        d dVar = new d(this, l0r0Var, i);
        sgb1.g(3, "BasicSessionProcessor");
        k8j0 k8j0Var = this.t;
        o oVar = (o) k8j0Var;
        oVar.c(new o5j0(ao7Var.c, ao7Var.d, ao7Var.b, ao7Var.a), dVar);
    }
}
