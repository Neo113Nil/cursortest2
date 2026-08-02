package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.b;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.camera.core.impl.DeferrableSurface;
import defpackage.a48;
import defpackage.a73;
import defpackage.aa3;
import defpackage.ap7;
import defpackage.b64;
import defpackage.bo31;
import defpackage.c920;
import defpackage.cm7;
import defpackage.d82;
import defpackage.dm7;
import defpackage.dy40;
import defpackage.dyq0;
import defpackage.ep7;
import defpackage.euy;
import defpackage.fm7;
import defpackage.fur;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.gp51;
import defpackage.gvc;
import defpackage.hh5;
import defpackage.hiv;
import defpackage.hm7;
import defpackage.hsj0;
import defpackage.hvo;
import defpackage.iiv;
import defpackage.im7;
import defpackage.iur;
import defpackage.iy4;
import defpackage.jn7;
import defpackage.jqs;
import defpackage.jx81;
import defpackage.jy4;
import defpackage.jyq0;
import defpackage.k6u;
import defpackage.kcz0;
import defpackage.lf61;
import defpackage.m6;
import defpackage.mdl0;
import defpackage.mo31;
import defpackage.mur;
import defpackage.ni91;
import defpackage.no6;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.q38;
import defpackage.q6x0;
import defpackage.q8n;
import defpackage.qp7;
import defpackage.r38;
import defpackage.r4h;
import defpackage.rg3;
import defpackage.ryz0;
import defpackage.s38;
import defpackage.sf61;
import defpackage.sgb1;
import defpackage.suz;
import defpackage.szd;
import defpackage.tf61;
import defpackage.ti21;
import defpackage.tob1;
import defpackage.ui21;
import defpackage.uiv;
import defpackage.v8v;
import defpackage.vn7;
import defpackage.we61;
import defpackage.wn7;
import defpackage.wvb1;
import defpackage.x34;
import defpackage.x4e;
import defpackage.xi21;
import defpackage.y64;
import defpackage.ye61;
import defpackage.yy40;
import defpackage.zy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class b implements qp7 {
    public long A;
    public final hm7 B;
    public final Camera2CameraControlImpl$CameraControlSessionCallback b;
    public final androidx.camera.core.impl.utils.executor.b c;
    public final Object d = new Object();
    public final ep7 e;
    public final hh5 f;
    public final dyq0 g;
    public final mur h;
    public final no6 i;
    public final ryz0 j;
    public final wvb1 k;
    public final no6 l;
    public final tf61 m;
    public final dm7 n;
    public final jn7 o;
    public final kcz0 p;
    public int q;
    public v8v r;
    public volatile int s;
    public volatile int t;
    public volatile int u;
    public final zy2 v;
    public boolean w;
    public final AtomicLong x;
    public volatile euy y;
    public int z;

    public b(ep7 ep7Var, k6u k6uVar, androidx.camera.core.impl.utils.executor.b bVar, hh5 hh5Var, a73 a73Var) {
        dyq0 dyq0Var = new dyq0();
        this.g = dyq0Var;
        this.q = 0;
        this.s = 0;
        this.u = 2;
        this.w = true;
        this.x = new AtomicLong(0L);
        this.y = hiv.c;
        this.z = 1;
        this.A = 0L;
        hm7 hm7Var = new hm7();
        this.B = hm7Var;
        this.e = ep7Var;
        this.f = hh5Var;
        this.c = bVar;
        kcz0 kcz0Var = new kcz0();
        kcz0Var.a = bVar;
        kcz0Var.b = new AtomicInteger(0);
        this.p = kcz0Var;
        Camera2CameraControlImpl$CameraControlSessionCallback camera2CameraControlImpl$CameraControlSessionCallback = new Camera2CameraControlImpl$CameraControlSessionCallback(bVar);
        this.b = camera2CameraControlImpl$CameraControlSessionCallback;
        dyq0Var.b.c = this.z;
        dyq0Var.b.b(new q38(camera2CameraControlImpl$CameraControlSessionCallback));
        dyq0Var.b.b(hm7Var);
        this.l = new no6(this, ep7Var, bVar, 1);
        this.h = new mur(this, k6uVar, bVar, a73Var);
        this.i = new no6(this, ep7Var, bVar, 5);
        this.j = new ryz0(this, ep7Var, bVar);
        this.t = ep7Var.b();
        wvb1 wvb1Var = new wvb1();
        new AtomicInteger(-1);
        wvb1Var.b = new Object();
        boolean c = wvb1.c(ep7Var);
        new dy40(-1);
        suz suzVar = new suz();
        if (c) {
            r(suzVar);
        }
        this.k = wvb1Var;
        this.m = new tf61(ep7Var, bVar);
        this.v = new zy2(a73Var, 1);
        this.n = new dm7(this, bVar);
        this.o = new jn7(this, ep7Var, a73Var, bVar, k6uVar);
    }

    public static boolean A(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof q6x0) && (l = (Long) ((q6x0) tag).a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public static int v(ep7 ep7Var, int i) {
        int[] iArr = (int[]) ep7Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return y(i, iArr) ? i : y(1, iArr) ? 1 : 0;
    }

    public static boolean y(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public final void B(im7 im7Var) {
        this.b.removeListener(im7Var);
    }

    public final void C(boolean z) {
        y64 e;
        sgb1.g(3, "Camera2CameraControlImp");
        mur murVar = this.h;
        if (z != murVar.d) {
            murVar.d = z;
            if (!murVar.d) {
                murVar.b(null);
            }
        }
        no6 no6Var = this.i;
        if (no6Var.a != z) {
            no6Var.a = z;
            if (!z) {
                synchronized (((lf61) no6Var.w)) {
                    ((lf61) no6Var.w).f(1.0f);
                    e = uiv.e((lf61) no6Var.w);
                }
                no6Var.f(e);
                ((ye61) no6Var.y).i();
                ((b) no6Var.b).F();
            }
        }
        wvb1 wvb1Var = this.k;
        if (wvb1Var.a != z) {
            wvb1Var.a = z;
        }
        ryz0 ryz0Var = this.j;
        int i = ryz0Var.g;
        if (ryz0Var.f != z) {
            ryz0Var.f = z;
            if (!z) {
                if (ryz0Var.i) {
                    ryz0Var.i = false;
                    ryz0Var.a.t(0);
                    ryz0Var.b(0);
                    dy40 dy40Var = ryz0Var.c;
                    Integer valueOf = Integer.valueOf(i);
                    if (tob1.d()) {
                        dy40Var.l(valueOf);
                    } else {
                        dy40Var.m(valueOf);
                    }
                }
                androidx.concurrent.futures.b bVar = ryz0Var.h;
                if (bVar != null) {
                    bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    ryz0Var.h = null;
                }
            }
        }
        no6 no6Var2 = this.l;
        if (z != no6Var2.a) {
            no6Var2.a = z;
            if (!z) {
                hvo hvoVar = (hvo) no6Var2.c;
                synchronized (hvoVar.a) {
                    hvoVar.c = 0;
                }
                no6Var2.c();
            }
        }
        dm7 dm7Var = this.n;
        dm7Var.d.execute(new rg3(dm7Var, z, 4));
        if (z) {
            return;
        }
        this.r = null;
        ((AtomicInteger) this.p.b).set(0);
        sgb1.g(3, "VideoUsageControl");
    }

    public final void D(boolean z) {
        synchronized (this.k.b) {
            try {
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E(List list) {
        int d;
        int c;
        ap7 ap7Var;
        l lVar = (l) this.f.b;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s38 s38Var = (s38) it.next();
            r38 r38Var = new r38(s38Var);
            if (s38Var.c == 5 && (ap7Var = s38Var.h) != null) {
                r38Var.h = ap7Var;
            }
            if (Collections.unmodifiableList(s38Var.a).isEmpty() && s38Var.f) {
                HashSet hashSet = r38Var.a;
                if (hashSet.isEmpty()) {
                    ui21 ui21Var = lVar.a;
                    ui21Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : ui21Var.a.entrySet()) {
                        ti21 ti21Var = (ti21) entry.getValue();
                        if (ti21Var.f && ti21Var.e) {
                            arrayList2.add(((ti21) entry.getValue()).a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList2).iterator();
                    while (it2.hasNext()) {
                        s38 s38Var2 = ((jyq0) it2.next()).g;
                        List unmodifiableList = Collections.unmodifiableList(s38Var2.a);
                        if (!unmodifiableList.isEmpty()) {
                            if (s38Var2.c() != 0 && (c = s38Var2.c()) != 0) {
                                r38Var.b.w(xi21.u4, Integer.valueOf(c));
                            }
                            if (s38Var2.d() != 0 && (d = s38Var2.d()) != 0) {
                                r38Var.b.w(xi21.w4, Integer.valueOf(d));
                            }
                            Iterator it3 = unmodifiableList.iterator();
                            while (it3.hasNext()) {
                                r38Var.d((DeferrableSurface) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        sgb1.g(5, "Camera2CameraImpl");
                    }
                } else {
                    sgb1.g(5, "Camera2CameraImpl");
                }
            }
            arrayList.add(r38Var.e());
        }
        lVar.w("Issue capture request");
        lVar.F.d(arrayList);
    }

    public final long F() {
        this.A = this.x.getAndIncrement();
        ((l) this.f.b).M();
        return this.A;
    }

    @Override // defpackage.qp7
    public final void a() {
        kcz0 kcz0Var = this.p;
        ((androidx.camera.core.impl.utils.executor.b) kcz0Var.a).execute(new mo31(kcz0Var, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qp7
    public final euy b(float f) {
        hiv hivVar;
        y64 e;
        int i = 1;
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        no6 no6Var = this.i;
        synchronized (((lf61) no6Var.w)) {
            try {
                ((lf61) no6Var.w).e(f);
                e = uiv.e((lf61) no6Var.w);
            } catch (IllegalArgumentException e2) {
                hivVar = new hiv(1, e2);
            }
        }
        no6Var.f(e);
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            ((androidx.camera.core.impl.utils.executor.b) no6Var.c).execute(new we61(no6Var, bVar, e, i));
            bVar.a = "setLinearZoom";
            hivVar = gl7Var;
        } catch (Exception e3) {
            gl7Var.a(e3);
            hivVar = gl7Var;
        }
        return ni91.g(hivVar);
    }

    @Override // defpackage.qp7
    public final void c(szd szdVar) {
        this.n.a(a48.b(szdVar).a()).c(new d82(1), geb1.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qp7
    public final euy d(float f) {
        hiv hivVar;
        y64 e;
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        no6 no6Var = this.i;
        synchronized (((lf61) no6Var.w)) {
            try {
                ((lf61) no6Var.w).f(f);
                e = uiv.e((lf61) no6Var.w);
            } catch (IllegalArgumentException e2) {
                hivVar = new hiv(1, e2);
            }
        }
        no6Var.f(e);
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            ((androidx.camera.core.impl.utils.executor.b) no6Var.c).execute(new we61(no6Var, bVar, e, 0));
            bVar.a = "setZoomRatio";
            hivVar = gl7Var;
        } catch (Exception e3) {
            gl7Var.a(e3);
            hivVar = gl7Var;
        }
        return ni91.g(hivVar);
    }

    @Override // defpackage.qp7
    public final void e(v8v v8vVar) {
        this.r = v8vVar;
    }

    @Override // defpackage.qp7
    public final euy f(boolean z) {
        euy r;
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        ryz0 ryz0Var = this.j;
        int i = 3;
        if (ryz0Var.d) {
            ryz0Var.b(z ? 1 : 0);
            r = jx81.r(new r4h(z ? 1 : 0, i, ryz0Var, z));
        } else {
            sgb1.g(3, "TorchControl");
            r = new hiv(1, new IllegalStateException("No flash unit"));
        }
        return ni91.g(r);
    }

    @Override // defpackage.qp7
    public final euy g(final int i, final int i2, final ArrayList arrayList) {
        if (x()) {
            final int i3 = this.u;
            return ni91.n(jqs.a(ni91.g(this.y)), new aa3() { // from class: em7
                @Override // defpackage.aa3
                public final euy apply(Object obj) {
                    jn7 jn7Var = b.this.o;
                    int i4 = i;
                    int i5 = i3;
                    an7 a = jn7Var.a(i4, i5, i2);
                    jqs a2 = jqs.a(a.a(i5));
                    xm7 xm7Var = new xm7(a, arrayList, i5, 0);
                    Executor executor = a.b;
                    o89 n = ni91.n(a2, xm7Var, executor);
                    n.c(new js4(29, a), executor);
                    return ni91.g(n);
                }
            }, this.c);
        }
        sgb1.g(5, "Camera2CameraControlImp");
        return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
    }

    @Override // defpackage.qp7
    public final void h() {
        kcz0 kcz0Var = this.p;
        ((androidx.camera.core.impl.utils.executor.b) kcz0Var.a).execute(new mo31(kcz0Var, 1));
    }

    @Override // defpackage.qp7
    public final void i() {
        this.m.a();
    }

    @Override // defpackage.qp7
    public final euy j(fur furVar) {
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        if (!z()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        mur murVar = this.h;
        murVar.getClass();
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            murVar.b.execute(new p7h(15, murVar, bVar, furVar));
            bVar.a = "startFocusAndMetering";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return ni91.g(gl7Var);
    }

    @Override // defpackage.qp7
    public final euy k(int i) {
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        no6 no6Var = this.l;
        hvo hvoVar = (hvo) no6Var.c;
        if (!hvoVar.b()) {
            return new hiv(1, new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range c = hvoVar.c();
        if (c.contains((Range) Integer.valueOf(i))) {
            synchronized (hvoVar.a) {
                hvoVar.c = i;
            }
            return ni91.g(jx81.r(new jy4(no6Var, i, 6)));
        }
        StringBuilder t = b64.t(i, "Requested ExposureCompensation ", " is not within valid range [");
        t.append(c.getUpper());
        t.append("..");
        t.append(c.getLower());
        t.append("]");
        return new hiv(1, new IllegalArgumentException(t.toString()));
    }

    @Override // defpackage.qp7
    public final euy l() {
        if (!x()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        if (!z()) {
            return new hiv(1, new CameraControl$OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture."));
        }
        mur murVar = this.h;
        murVar.getClass();
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            murVar.b.execute(new iur(murVar, bVar, 1));
            bVar.a = "cancelFocusAndMetering";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return ni91.g(gl7Var);
    }

    @Override // defpackage.qp7
    public final void m(int i) {
        if (!x()) {
            sgb1.g(5, "Camera2CameraControlImp");
            return;
        }
        this.u = i;
        sgb1.g(3, "Camera2CameraControlImp");
        tf61 tf61Var = this.m;
        int i2 = 0;
        boolean z = true;
        if (this.u != 1 && this.u != 0) {
            z = false;
        }
        tf61Var.e = z;
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.c.execute(new fm7(this, bVar, i2));
            bVar.a = "updateSessionConfigAsync";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        this.y = ni91.g(gl7Var);
    }

    @Override // defpackage.qp7
    public final void n(dyq0 dyq0Var) {
        StreamConfigurationMap streamConfigurationMap;
        int i;
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        r38 r38Var = dyq0Var.b;
        final tf61 tf61Var = this.m;
        androidx.camera.core.impl.utils.executor.b bVar = tf61Var.b;
        ep7 ep7Var = tf61Var.a;
        tf61Var.a();
        if (tf61Var.d) {
            r38Var.c = 1;
            return;
        }
        if (tf61Var.g) {
            r38Var.c = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) ep7Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            sgb1.d("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            i = 0;
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
            for (int i2 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i2);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new gvc(true));
                    hashMap.put(Integer.valueOf(i2), inputSizes[0]);
                }
            }
            i = 0;
        }
        if (tf61Var.f && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) ep7Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i3 = i; i3 < length; i3++) {
                if (validOutputFormatsForInput[i3] == 256) {
                    Size size = (Size) hashMap.get(34);
                    c920 c920Var = new c920(size.getWidth(), size.getHeight(), 34, 9);
                    mdl0 mdl0Var = new mdl0(c920Var);
                    Surface surface = mdl0Var.getSurface();
                    Objects.requireNonNull(surface);
                    iiv iivVar = new iiv(surface, new Size(mdl0Var.getWidth(), mdl0Var.getHeight()), 34);
                    final sf61 sf61Var = new sf61(bVar);
                    tf61Var.h = mdl0Var;
                    tf61Var.i = iivVar;
                    tf61Var.j = sf61Var;
                    mdl0Var.u(new gp51(3, tf61Var), geb1.d());
                    ni91.g(iivVar.e).c(new bo31(16, mdl0Var, sf61Var), bVar);
                    dyq0Var.c(iivVar, q8n.d, -1);
                    dyq0Var.a(c920Var.b);
                    CameraCaptureSession.StateCallback stateCallback = new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.ZslControlImpl$1
                        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        }

                        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                            Surface inputSurface = cameraCaptureSession.getInputSurface();
                            if (inputSurface != null) {
                                sf61 sf61Var2 = sf61Var;
                                ImageWriter newInstance = ImageWriter.newInstance(inputSurface, 1);
                                if (sf61Var2.b.get()) {
                                    if (sf61Var2.a != null) {
                                        sgb1.g(5, "ZslControlImpl");
                                        sf61Var2.a.close();
                                    }
                                    sf61Var2.a = newInstance;
                                }
                            }
                        }
                    };
                    ArrayList arrayList = dyq0Var.d;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                    dyq0Var.g = new InputConfiguration(mdl0Var.getWidth(), mdl0Var.getHeight(), mdl0Var.h());
                    return;
                }
            }
        }
        r38Var.c = 1;
    }

    @Override // defpackage.qp7
    public final szd o() {
        wn7 a;
        dm7 dm7Var = this.n;
        synchronized (dm7Var.e) {
            a = dm7Var.f.a();
        }
        return a;
    }

    @Override // defpackage.qp7
    public final void p() {
        dm7 dm7Var = this.n;
        synchronized (dm7Var.e) {
            dm7Var.f = new vn7();
        }
        androidx.concurrent.futures.b bVar = new androidx.concurrent.futures.b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            dm7Var.d.execute(new cm7(dm7Var, bVar, 1));
            bVar.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        ni91.g(gl7Var).c(new d82(1), geb1.b());
    }

    @Override // defpackage.qp7
    public final euy q(int i) {
        if (x()) {
            return ni91.n(jqs.a(ni91.g(this.y)), new iy4(this, i, this.u), this.c);
        }
        sgb1.g(5, "Camera2CameraControlImp");
        return new hiv(1, new CameraControl$OperationCanceledException("Camera is not active."));
    }

    public final void r(im7 im7Var) {
        this.b.addListener(im7Var);
    }

    public final void s() {
        synchronized (this.d) {
            try {
                int i = this.q;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.q = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(int i) {
        this.s = i;
        if (i == 0) {
            r38 r38Var = new r38();
            r38Var.c = this.z;
            r38Var.f = true;
            vn7 vn7Var = new vn7();
            vn7Var.b(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(v(this.e, 1)));
            vn7Var.b(CaptureRequest.FLASH_MODE, 0);
            r38Var.c(vn7Var.a());
            E(Collections.singletonList(r38Var.e()));
        }
        F();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00aa, code lost:
    
        if (r4 != 2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jyq0 u() {
        int[] iArr;
        hvo hvoVar;
        int i;
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        dyq0 dyq0Var = this.g;
        dyq0Var.b.c = this.z;
        vn7 vn7Var = new vn7();
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_MODE;
        int i2 = 1;
        Config$OptionPriority config$OptionPriority = Config$OptionPriority.REQUIRED;
        vn7Var.c(key3, 1, config$OptionPriority);
        mur murVar = this.h;
        int i3 = 3;
        vn7Var.c(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(murVar.a.w(murVar.g ? 1 : murVar.n != 3 ? 4 : 3)), config$OptionPriority);
        MeteringRectangle[] meteringRectangleArr = murVar.q;
        if (meteringRectangleArr.length != 0) {
            vn7Var.c(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, config$OptionPriority);
        }
        MeteringRectangle[] meteringRectangleArr2 = murVar.r;
        if (meteringRectangleArr2.length != 0) {
            vn7Var.c(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, config$OptionPriority);
        }
        MeteringRectangle[] meteringRectangleArr3 = murVar.s;
        if (meteringRectangleArr3.length != 0) {
            vn7Var.c(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, config$OptionPriority);
        }
        ((ye61) this.i.y).f(vn7Var);
        int i4 = this.h.v ? 5 : 1;
        if (this.s == 0) {
            int i5 = this.u;
            if (i5 == 0) {
                zy2 zy2Var = this.v;
                if (!zy2Var.a && !zy2Var.b) {
                    i3 = 2;
                }
                i3 = 1;
            } else if (i5 != 1) {
            }
            vn7Var.c(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(v(this.e, i3)), config$OptionPriority);
            CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!y(1, iArr) && !y(1, iArr))) {
                i2 = 0;
            }
            vn7Var.c(key4, Integer.valueOf(i2), config$OptionPriority);
            no6 no6Var = this.l;
            no6Var.getClass();
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            hvoVar = (hvo) no6Var.c;
            synchronized (hvoVar.a) {
                i = hvoVar.c;
            }
            vn7Var.c(key5, Integer.valueOf(i), config$OptionPriority);
            dm7 dm7Var = this.n;
            synchronized (dm7Var.e) {
                yy40 yy40Var = dm7Var.f.a;
                Config$OptionPriority config$OptionPriority2 = Config$OptionPriority.ALWAYS_OVERRIDE;
                for (x34 x34Var : yy40Var.h()) {
                    vn7Var.a.t(x34Var, config$OptionPriority2, yy40Var.f(x34Var));
                }
            }
            wn7 a = vn7Var.a();
            r38 r38Var = dyq0Var.b;
            r38Var.getClass();
            r38Var.b = yy40.p(a);
            this.g.b.g.a.put("CameraControlSessionUpdateId", Long.valueOf(this.A));
            return this.g.d();
        }
        vn7Var.c(CaptureRequest.FLASH_MODE, 2, config$OptionPriority);
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.s == 1) {
                key2 = CaptureRequest.FLASH_STRENGTH_LEVEL;
                vn7Var.c(key2, Integer.valueOf(this.t), config$OptionPriority);
            } else if (this.s == 2) {
                key = CaptureRequest.FLASH_STRENGTH_LEVEL;
                vn7Var.c(key, Integer.valueOf(this.e.b()), config$OptionPriority);
            }
        }
        i3 = i4;
        vn7Var.c(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(v(this.e, i3)), config$OptionPriority);
        CaptureRequest.Key key42 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
        }
        i2 = 0;
        vn7Var.c(key42, Integer.valueOf(i2), config$OptionPriority);
        no6 no6Var2 = this.l;
        no6Var2.getClass();
        CaptureRequest.Key key52 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        hvoVar = (hvo) no6Var2.c;
        synchronized (hvoVar.a) {
        }
    }

    public final int w(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (y(i, iArr)) {
            return i;
        }
        if (y(4, iArr)) {
            return 4;
        }
        return y(1, iArr) ? 1 : 0;
    }

    public final boolean x() {
        int i;
        synchronized (this.d) {
            i = this.q;
        }
        return i > 0;
    }

    public final boolean z() {
        try {
            return ((Boolean) jx81.r(new m6(25, this)).b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException e) {
            ny61.n("Unable to check if repeating request is available.", e);
            return false;
        }
    }
}
