package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.Config$OptionPriority;
import androidx.camera.core.impl.DeferrableSurface;
import defpackage.a48;
import defpackage.a73;
import defpackage.aa3;
import defpackage.b48;
import defpackage.d6z;
import defpackage.e1x0;
import defpackage.euy;
import defpackage.f48;
import defpackage.f6f0;
import defpackage.geb1;
import defpackage.gym;
import defpackage.gyq0;
import defpackage.hiv;
import defpackage.hyq0;
import defpackage.iru0;
import defpackage.jqs;
import defpackage.jyq0;
import defpackage.k6u;
import defpackage.m0r0;
import defpackage.ni91;
import defpackage.o3;
import defpackage.oxe0;
import defpackage.p74;
import defpackage.q74;
import defpackage.r400;
import defpackage.rdb1;
import defpackage.rm7;
import defpackage.s38;
import defpackage.sgb1;
import defpackage.sue0;
import defpackage.ug70;
import defpackage.uo7;
import defpackage.vn7;
import defpackage.w8v;
import defpackage.wn7;
import defpackage.x34;
import defpackage.xbj;
import defpackage.yo90;
import defpackage.yy40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class x implements f48 {
    public static final ArrayList o = new ArrayList();
    public static int p = 0;
    public final m0r0 a;
    public final rm7 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final s e;
    public jyq0 g;
    public o h;
    public jyq0 i;
    public ProcessingCaptureSession$ProcessorState j;
    public final r400 l;
    public List f = new ArrayList();
    public volatile List k = null;
    public b48 m = new a48().a();
    public b48 n = new a48().a();

    public x(m0r0 m0r0Var, rm7 rm7Var, gym gymVar, androidx.camera.core.impl.utils.executor.b bVar, k6u k6uVar) {
        this.e = new s(gymVar, new a73(Collections.EMPTY_LIST), xbj.a.b(CaptureSessionShouldUseMrirQuirk.class) != null);
        this.a = m0r0Var;
        this.b = rm7Var;
        this.c = bVar;
        this.d = k6uVar;
        this.j = ProcessingCaptureSession$ProcessorState.UNINITIALIZED;
        this.l = new r400(7);
        p++;
        sgb1.g(3, "ProcessingCaptureSession");
    }

    public static void i(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s38 s38Var = (s38) it.next();
            Iterator it2 = s38Var.e.iterator();
            while (it2.hasNext()) {
                ((uo7) it2.next()).a(s38Var.b());
            }
        }
    }

    @Override // defpackage.f48
    public final void a(HashMap hashMap) {
    }

    @Override // defpackage.f48
    public final euy b(final jyq0 jyq0Var, final CameraDevice cameraDevice, final e1x0 e1x0Var) {
        d6z.m("Invalid state state:" + this.j, this.j == ProcessingCaptureSession$ProcessorState.UNINITIALIZED);
        d6z.m("SessionConfig contains no surfaces", jyq0Var.b().isEmpty() ^ true);
        sgb1.g(3, "ProcessingCaptureSession");
        List b = jyq0Var.b();
        this.f = b;
        ScheduledExecutorService scheduledExecutorService = this.d;
        Executor executor = this.c;
        return ni91.n(ni91.n(jqs.a(androidx.camera.core.impl.a.c(b, executor, scheduledExecutorService)), new aa3() { // from class: androidx.camera.camera2.internal.w
            @Override // defpackage.aa3
            public final euy apply(Object obj) {
                DeferrableSurface deferrableSurface;
                p74 p74Var;
                List list = (List) obj;
                x xVar = x.this;
                Executor executor2 = xVar.c;
                int i = 3;
                sgb1.g(3, "ProcessingCaptureSession");
                if (xVar.j == ProcessingCaptureSession$ProcessorState.DE_INITIALIZED) {
                    return new hiv(1, new IllegalStateException("SessionProcessorCaptureSession is closed."));
                }
                boolean contains = list.contains(null);
                jyq0 jyq0Var2 = jyq0Var;
                if (contains) {
                    return new hiv(1, new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) jyq0Var2.b().get(list.indexOf(null))));
                }
                int i2 = 0;
                p74 p74Var2 = null;
                p74 p74Var3 = null;
                p74 p74Var4 = null;
                for (int i3 = 0; i3 < jyq0Var2.b().size(); i3++) {
                    DeferrableSurface deferrableSurface2 = (DeferrableSurface) jyq0Var2.b().get(i3);
                    boolean equals = Objects.equals(deferrableSurface2.j, androidx.camera.core.g.class);
                    int i4 = deferrableSurface2.i;
                    Size size = deferrableSurface2.h;
                    if (equals || Objects.equals(deferrableSurface2.j, iru0.class)) {
                        p74Var2 = new p74((Surface) deferrableSurface2.c().get(), size, i4);
                    } else if (Objects.equals(deferrableSurface2.j, w8v.class)) {
                        p74Var3 = new p74((Surface) deferrableSurface2.c().get(), size, i4);
                    } else if (Objects.equals(deferrableSurface2.j, androidx.camera.core.f.class)) {
                        p74Var4 = new p74((Surface) deferrableSurface2.c().get(), size, i4);
                    }
                }
                gyq0 gyq0Var = jyq0Var2.b;
                if (gyq0Var != null) {
                    deferrableSurface = gyq0Var.f();
                    p74Var = new p74((Surface) deferrableSurface.c().get(), deferrableSurface.h, deferrableSurface.i);
                } else {
                    deferrableSurface = null;
                    p74Var = null;
                }
                xVar.j = ProcessingCaptureSession$ProcessorState.SESSION_INITIALIZED;
                try {
                    ArrayList arrayList = new ArrayList(xVar.f);
                    if (deferrableSurface != null) {
                        arrayList.add(deferrableSurface);
                    }
                    androidx.camera.core.impl.a.b(arrayList);
                    sgb1.g(5, "ProcessingCaptureSession");
                    try {
                        jyq0 i5 = xVar.a.i(xVar.b, new q74(p74Var2, p74Var3, p74Var4, p74Var));
                        xVar.i = i5;
                        ni91.g(((DeferrableSurface) i5.b().get(0)).e).c(new yo90(22, xVar, deferrableSurface), geb1.b());
                        for (DeferrableSurface deferrableSurface3 : xVar.i.b()) {
                            x.o.add(deferrableSurface3);
                            ni91.g(deferrableSurface3.e).c(new f6f0(deferrableSurface3, i2), executor2);
                        }
                        hyq0 hyq0Var = new hyq0();
                        hyq0Var.a(jyq0Var2);
                        hyq0Var.a.clear();
                        hyq0Var.b.a.clear();
                        hyq0Var.a(xVar.i);
                        d6z.m("Cannot transform the SessionConfig", hyq0Var.c());
                        jyq0 b2 = hyq0Var.b();
                        s sVar = xVar.e;
                        CameraDevice cameraDevice2 = cameraDevice;
                        cameraDevice2.getClass();
                        euy b3 = sVar.b(b2, cameraDevice2, e1x0Var);
                        ni91.a(b3, new sue0(i, xVar), executor2);
                        return b3;
                    } catch (Throwable th) {
                        sgb1.e("ProcessingCaptureSession", "initSession failed", th);
                        androidx.camera.core.impl.a.a(xVar.f);
                        if (deferrableSurface != null) {
                            deferrableSurface.b();
                        }
                        throw th;
                    }
                } catch (DeferrableSurface.SurfaceClosedException e) {
                    return new hiv(1, e);
                }
            }
        }, executor), new gym(new f(this)), executor);
    }

    @Override // defpackage.f48
    public final jyq0 c() {
        return this.g;
    }

    @Override // defpackage.f48
    public final void close() {
        Objects.toString(this.j);
        sgb1.g(3, "ProcessingCaptureSession");
        if (this.j == ProcessingCaptureSession$ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            sgb1.g(3, "ProcessingCaptureSession");
            this.a.b();
            o oVar = this.h;
            if (oVar != null) {
                synchronized (oVar.a) {
                    oVar.d = true;
                    oVar.b = null;
                    oVar.e = null;
                    oVar.c = null;
                }
            }
            this.j = ProcessingCaptureSession$ProcessorState.ON_CAPTURE_SESSION_ENDED;
        }
        this.e.close();
    }

    @Override // defpackage.f48
    public final void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        Objects.toString(this.j);
        sgb1.g(3, "ProcessingCaptureSession");
        int ordinal = this.j.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (this.k == null) {
                this.k = list;
                return;
            } else {
                i(list);
                sgb1.g(3, "ProcessingCaptureSession");
                return;
            }
        }
        if (ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                Objects.toString(this.j);
                sgb1.g(3, "ProcessingCaptureSession");
                i(list);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s38 s38Var = (s38) it.next();
            int i = s38Var.c;
            if (i == 2 || i == 4) {
                a48 b = a48.b(s38Var.b);
                ug70 ug70Var = s38Var.b;
                x34 x34Var = s38.i;
                if (ug70Var.a.containsKey(x34Var)) {
                    CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
                    Integer num = (Integer) ug70Var.f(x34Var);
                    b.a.w(wn7.a(key), num);
                }
                x34 x34Var2 = s38.j;
                if (ug70Var.a.containsKey(x34Var2)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
                    Byte valueOf = Byte.valueOf(((Integer) ug70Var.f(x34Var2)).byteValue());
                    b.a.w(wn7.a(key2), valueOf);
                }
                b48 a = b.a();
                this.n = a;
                b48 b48Var = this.m;
                vn7 vn7Var = new vn7();
                yy40 yy40Var = vn7Var.a;
                Config$OptionPriority config$OptionPriority = Config$OptionPriority.OPTIONAL;
                for (x34 x34Var3 : b48Var.h()) {
                    yy40Var.t(x34Var3, config$OptionPriority, b48Var.f(x34Var3));
                }
                Config$OptionPriority config$OptionPriority2 = Config$OptionPriority.OPTIONAL;
                for (x34 x34Var4 : a.h()) {
                    yy40Var.t(x34Var4, config$OptionPriority2, a.f(x34Var4));
                }
                this.a.f(vn7Var.a());
                this.a.k(s38Var.d, s38Var.g, new o3(s38Var.b(), s38Var.e));
            } else {
                sgb1.g(3, "ProcessingCaptureSession");
                b48 a2 = a48.b(s38Var.b).a();
                Iterator it2 = a2.h().iterator();
                while (it2.hasNext()) {
                    CaptureRequest.Key key3 = (CaptureRequest.Key) ((x34) it2.next()).c;
                    if (key3.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key3.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        this.a.h(a2, s38Var.g, new o3(s38Var.b(), s38Var.e));
                        break;
                    }
                }
                i(Arrays.asList(s38Var));
            }
        }
    }

    @Override // defpackage.f48
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.f48
    public final void f() {
        sgb1.g(3, "ProcessingCaptureSession");
        if (this.k != null) {
            for (s38 s38Var : this.k) {
                Iterator it = s38Var.e.iterator();
                while (it.hasNext()) {
                    ((uo7) it.next()).a(s38Var.b());
                }
            }
            this.k = null;
        }
    }

    @Override // defpackage.f48
    public final void g(jyq0 jyq0Var) {
        sgb1.g(3, "ProcessingCaptureSession");
        this.g = jyq0Var;
        if (jyq0Var == null) {
            return;
        }
        o oVar = this.h;
        if (oVar != null) {
            synchronized (oVar.a) {
                oVar.e = jyq0Var;
            }
        }
        if (this.j == ProcessingCaptureSession$ProcessorState.ON_CAPTURE_SESSION_STARTED) {
            a48 b = a48.b(jyq0Var.g.b);
            Integer g = rdb1.g(jyq0Var.g);
            if (g != null) {
                b.a.w(wn7.a(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE), g);
            }
            b48 a = b.a();
            this.m = a;
            b48 b48Var = this.n;
            vn7 vn7Var = new vn7();
            yy40 yy40Var = vn7Var.a;
            Config$OptionPriority config$OptionPriority = Config$OptionPriority.OPTIONAL;
            for (x34 x34Var : a.h()) {
                yy40Var.t(x34Var, config$OptionPriority, a.f(x34Var));
            }
            Config$OptionPriority config$OptionPriority2 = Config$OptionPriority.OPTIONAL;
            for (x34 x34Var2 : b48Var.h()) {
                yy40Var.t(x34Var2, config$OptionPriority2, b48Var.f(x34Var2));
            }
            this.a.f(vn7Var.a());
            for (DeferrableSurface deferrableSurface : Collections.unmodifiableList(jyq0Var.g.a)) {
                if (Objects.equals(deferrableSurface.j, androidx.camera.core.g.class) || Objects.equals(deferrableSurface.j, iru0.class)) {
                    this.a.e(jyq0Var.g.g, this.l);
                    return;
                }
            }
            this.a.g();
        }
    }

    @Override // defpackage.f48
    public final List h() {
        return this.k != null ? this.k : Collections.EMPTY_LIST;
    }

    @Override // defpackage.f48
    public final euy release() {
        Objects.toString(this.j);
        sgb1.g(3, "ProcessingCaptureSession");
        euy release = this.e.release();
        int ordinal = this.j.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            release.c(new oxe0(5, this), geb1.b());
        }
        this.j = ProcessingCaptureSession$ProcessorState.DE_INITIALIZED;
        return release;
    }
}
