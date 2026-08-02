package defpackage;

import android.content.Context;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.g;
import androidx.camera.video.h;
import androidx.camera.video.i;
import androidx.camera.view.internal.ScreenFlashUiInfo$ProviderType;
import androidx.concurrent.futures.b;
import androidx.lifecycle.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class iq7 {
    public static final cq7 N = new cq7();
    public final boolean A;
    public tis0 B;
    public final bas C;
    public final bas D;
    public final dy40 E;
    public final aq80 F;
    public final aq80 G;
    public final aq80 H;
    public final HashSet I;
    public final Context J;
    public final o89 K;
    public final HashMap L;
    public final long M;
    public xs7 a;
    public int b;
    public g c;
    public bsj0 d;
    public w8v e;
    public hh5 f;
    public Executor g;
    public t7v h;
    public f i;
    public hh5 j;
    public bsj0 k;
    public i l;
    public h m;
    public final HashMap n;
    public qgg0 o;
    public final q8n p;
    public final q8n q;
    public final Range r;
    public ody s;
    public j5f0 t;
    public xt31 u;
    public rxe0 v;
    public final androidx.camera.view.g w;
    public final aq7 x;
    public int y;
    public final boolean z;

    public iq7(Context context) {
        i5f0 i5f0Var = i5f0.b;
        o89 c = v5a1.c(context);
        vm7 vm7Var = new vm7(6);
        o89 n = ni91.n(c, new gym(vm7Var), geb1.b());
        this.a = xs7.c;
        this.b = 3;
        this.m = null;
        this.n = new HashMap();
        this.o = androidx.camera.video.g.p0;
        q8n q8nVar = q8n.c;
        this.p = q8nVar;
        this.q = q8nVar;
        this.r = lru0.a;
        this.y = -1;
        this.z = true;
        this.A = true;
        this.C = new bas();
        this.D = new bas();
        dy40 dy40Var = new dy40(new w9x0(0));
        this.E = dy40Var;
        efb1.c(dy40Var, new vm7(7));
        this.F = new aq80();
        this.G = new aq80();
        this.H = new aq80();
        this.I = new HashSet();
        this.L = new HashMap();
        this.M = 5000000000L;
        Context b = grb1.b(context);
        this.J = b;
        pxe0 pxe0Var = new pxe0();
        c(pxe0Var, this.d, null);
        pxe0Var.a.w(eav.l2, q8nVar);
        this.c = pxe0Var.f();
        this.e = e(null);
        this.i = d(null, null, null);
        this.l = f();
        pdy pdyVar = (pdy) this;
        aq7 aq7Var = new aq7(pdyVar);
        this.K = ni91.n(n, new gym(aq7Var), geb1.f());
        this.w = new androidx.camera.view.g(b);
        this.x = new aq7(pdyVar);
    }

    public final void a(rxe0 rxe0Var, xt31 xt31Var) {
        tob1.b();
        if (this.v != rxe0Var) {
            this.v = rxe0Var;
            this.c.J(rxe0Var);
        }
        boolean z = true;
        if (this.u != null) {
            int i = i(xt31Var);
            s83 s83Var = i != -1 ? new s83(i, 1) : null;
            int i2 = i(this.u);
            if (s83Var == (i2 != -1 ? new s83(i2, 1) : null)) {
                z = false;
            }
        }
        this.u = xt31Var;
        androidx.camera.view.g gVar = this.w;
        k6u f = geb1.f();
        aq7 aq7Var = this.x;
        synchronized (gVar.a) {
            if (gVar.b.canDetectOrientation()) {
                gVar.c.put(aq7Var, new hxk0(aq7Var, f));
                gVar.b.enable();
            } else {
                sgb1.g(5, "CameraController");
            }
        }
        if (z) {
            u();
        }
        t(null);
    }

    public final void b() {
        tob1.b();
        j5f0 j5f0Var = this.t;
        if (j5f0Var != null) {
            j5f0Var.a(this.c, this.e, this.i, this.l);
        }
        this.c.J(null);
        this.s = null;
        this.v = null;
        this.u = null;
        androidx.camera.view.g gVar = this.w;
        aq7 aq7Var = this.x;
        synchronized (gVar.a) {
            try {
                hxk0 hxk0Var = (hxk0) gVar.c.get(aq7Var);
                if (hxk0Var != null) {
                    hxk0Var.c.set(false);
                    gVar.c.remove(aq7Var);
                }
                if (gVar.c.isEmpty()) {
                    gVar.b.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(hcv hcvVar, bsj0 bsj0Var, hh5 hh5Var) {
        if (bsj0Var != null) {
            hcvVar.b(bsj0Var);
            return;
        }
        if (hh5Var != null) {
            Size size = (Size) hh5Var.b;
            if (size != null) {
                hcvVar.c(size);
                return;
            }
            sgb1.d("CameraController", "Invalid target surface size. " + hh5Var);
            return;
        }
        xt31 xt31Var = this.u;
        if (xt31Var != null) {
            int i = i(xt31Var);
            s83 s83Var = i != -1 ? new s83(i, 1) : null;
            if (s83Var != null) {
                asj0 asj0Var = new asj0();
                asj0Var.a = s83Var;
                hcvVar.b(asj0Var.a());
            }
        }
    }

    public final f d(Integer num, Integer num2, Integer num3) {
        v7v v7vVar = new v7v();
        yy40 yy40Var = v7vVar.a;
        if (num != null) {
            yy40Var.w(b8v.b, num);
        }
        if (num2 != null) {
            yy40Var.w(b8v.c, num2);
        }
        if (num3 != null) {
            yy40Var.w(b8v.x, num3);
        }
        c(v7vVar, this.k, this.j);
        int i = this.y;
        if (i != -1) {
            yy40Var.w(icv.n2, Integer.valueOf(i));
        }
        return v7vVar.f();
    }

    public final w8v e(Integer num) {
        q8v q8vVar = new q8v();
        if (num != null) {
            q8vVar.a.w(x8v.b, num);
        }
        c(q8vVar, null, this.f);
        int i = this.y;
        if (i != -1) {
            q8vVar.i(i);
        }
        return q8vVar.f();
    }

    public final i f() {
        int i;
        jii0 jii0Var = new jii0();
        jii0Var.b(this.o);
        xt31 xt31Var = this.u;
        if (xt31Var != null && this.o == androidx.camera.video.g.p0 && (i = i(xt31Var)) != -1) {
            jii0Var.a(i);
        }
        al31 al31Var = new al31(new androidx.camera.video.g(jii0Var.a.f(), jii0Var.b, jii0Var.c, jii0Var.d, jii0Var.e));
        Range range = this.r;
        x34 x34Var = xi21.p4;
        yy40 yy40Var = al31Var.a;
        yy40Var.w(x34Var, range);
        yy40Var.w(icv.q2, 0);
        yy40Var.w(eav.l2, this.p);
        int i2 = this.y;
        if (i2 != -1) {
            yy40Var.w(icv.n2, Integer.valueOf(i2));
        }
        return new i(new el31(ug70.a(yy40Var)));
    }

    public final euy g(boolean z) {
        tob1.b();
        if (k()) {
            return ((e70) this.s.b()).f(z);
        }
        Boolean valueOf = Boolean.valueOf(z);
        aq80 aq80Var = this.F;
        aq80Var.getClass();
        tob1.b();
        return jx81.r(new h2r(24, aq80Var, valueOf));
    }

    public final rdp0 h() {
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType = ScreenFlashUiInfo$ProviderType.SCREEN_FLASH_VIEW;
        HashMap hashMap = this.L;
        if (hashMap.get(screenFlashUiInfo$ProviderType) != null) {
            return (rdp0) hashMap.get(screenFlashUiInfo$ProviderType);
        }
        ScreenFlashUiInfo$ProviderType screenFlashUiInfo$ProviderType2 = ScreenFlashUiInfo$ProviderType.PREVIEW_VIEW;
        if (hashMap.get(screenFlashUiInfo$ProviderType2) != null) {
            return (rdp0) hashMap.get(screenFlashUiInfo$ProviderType2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(xt31 xt31Var) {
        int i;
        boolean z;
        int c;
        Rational rational;
        j5f0 j5f0Var;
        int g = xt31Var == null ? 0 : xdb1.g(xt31Var.c);
        try {
            j5f0Var = this.t;
        } catch (IllegalArgumentException unused) {
            i = 0;
        }
        if (j5f0Var != null) {
            ar7 f = j5f0Var.a.a.f(this.a);
            i = ((x9s) f).a.m();
            try {
            } catch (IllegalArgumentException unused2) {
                xs7 xs7Var = this.a;
                if (xs7Var != null) {
                    xs7Var.b();
                }
                sgb1.g(5, "CameraController");
                z = true;
                c = xdb1.c(g, i, z);
                rational = xt31Var.b;
                if (c != 90) {
                }
                rational = new Rational(rational.getDenominator(), rational.getNumerator());
                if (rational.equals(x83.a)) {
                }
            }
            if (((x9s) f).a.d() != 1) {
                z = false;
                c = xdb1.c(g, i, z);
                rational = xt31Var.b;
                if (c != 90 || c == 270) {
                    rational = new Rational(rational.getDenominator(), rational.getNumerator());
                }
                if (rational.equals(x83.a)) {
                    return 0;
                }
                return rational.equals(x83.c) ? 1 : -1;
            }
        } else {
            i = 0;
        }
        z = true;
        c = xdb1.c(g, i, z);
        rational = xt31Var.b;
        if (c != 90) {
        }
        rational = new Rational(rational.getDenominator(), rational.getNumerator());
        if (rational.equals(x83.a)) {
        }
    }

    public final boolean j(xs7 xs7Var) {
        tob1.b();
        xs7Var.getClass();
        j5f0 j5f0Var = this.t;
        if (j5f0Var != null) {
            return j5f0Var.a.e(xs7Var);
        }
        ny61.r("Camera not initialized. Please wait for the initialization future to finish. See #getInitializationFuture().");
        return false;
    }

    public final boolean k() {
        return this.s != null;
    }

    public final boolean l() {
        return this.t != null;
    }

    public final boolean m() {
        tob1.b();
        h hVar = this.m;
        return (hVar == null || hVar.a.get()) ? false : true;
    }

    public final void n(t7v t7vVar, t7v t7vVar2) {
        if (Objects.equals(t7vVar == null ? null : t7vVar.b(), t7vVar2 == null ? null : t7vVar2.b())) {
            return;
        }
        v(Integer.valueOf(this.i.J()), Integer.valueOf(this.i.K()), Integer.valueOf(this.i.L()));
        t(null);
    }

    public final void o(xs7 xs7Var) {
        tob1.b();
        if (this.a == xs7Var) {
            return;
        }
        Integer b = xs7Var.b();
        if (this.e.J() == 3 && b != null && b.intValue() != 0) {
            ny61.r("Not a front camera despite setting FLASH_MODE_SCREEN");
            return;
        }
        xs7 xs7Var2 = this.a;
        this.a = xs7Var;
        j5f0 j5f0Var = this.t;
        if (j5f0Var == null) {
            return;
        }
        j5f0Var.a(this.c, this.e, this.i, this.l);
        t(new bq7(this, xs7Var2, 0));
    }

    public final void p(int i) {
        tob1.b();
        int i2 = this.b;
        if (i == i2) {
            return;
        }
        this.b = i;
        tob1.b();
        if ((this.b & 4) == 0 && m()) {
            tob1.b();
            h hVar = this.m;
            if (hVar != null) {
                hVar.close();
                this.m = null;
            }
        }
        t(new yp7(this, i2, i, 0));
    }

    public final void q() {
        tob1.b();
        if (this.i.J() == 0) {
            return;
        }
        v(0, Integer.valueOf(this.i.K()), Integer.valueOf(this.i.L()));
        t(null);
    }

    public final euy r(float f) {
        tob1.b();
        if (k()) {
            return ((e70) this.s.b()).d(f);
        }
        Float valueOf = Float.valueOf(f);
        aq80 aq80Var = this.H;
        aq80Var.getClass();
        tob1.b();
        return jx81.r(new h2r(24, aq80Var, valueOf));
    }

    public abstract ody s();

    public final void t(Runnable runnable) {
        euy b;
        bh10 bh10Var;
        bh10 bh10Var2;
        try {
            this.s = s();
            if (!k()) {
                sgb1.g(3, "CameraController");
                return;
            }
            v k = ((g70) this.s.c()).k();
            bas basVar = this.C;
            v vVar = basVar.m;
            if (vVar != null && (bh10Var2 = (bh10) basVar.l.b(vVar)) != null) {
                bh10Var2.a.j(bh10Var2);
            }
            basVar.m = k;
            int i = 2;
            basVar.n(k, new hs7(i, basVar));
            v u = ((g70) this.s.c()).u();
            bas basVar2 = this.D;
            v vVar2 = basVar2.m;
            if (vVar2 != null && (bh10Var = (bh10) basVar2.l.b(vVar2)) != null) {
                bh10Var.a.j(bh10Var);
            }
            basVar2.m = u;
            basVar2.n(u, new hs7(i, basVar2));
            aq80 aq80Var = this.F;
            aq80Var.getClass();
            tob1.b();
            sa90 sa90Var = (sa90) aq80Var.a;
            if (sa90Var != null) {
                euy g = g(((Boolean) sa90Var.b).booleanValue());
                b bVar = (b) ((sa90) aq80Var.a).a;
                Objects.requireNonNull(bVar);
                ni91.h(g, bVar);
                aq80Var.a = null;
            }
            aq80 aq80Var2 = this.G;
            aq80Var2.getClass();
            tob1.b();
            sa90 sa90Var2 = (sa90) aq80Var2.a;
            if (sa90Var2 != null) {
                Float f = (Float) sa90Var2.b;
                float floatValue = f.floatValue();
                tob1.b();
                if (k()) {
                    b = ((e70) this.s.b()).b(floatValue);
                } else {
                    tob1.b();
                    b = jx81.r(new h2r(24, aq80Var2, f));
                }
                b bVar2 = (b) ((sa90) aq80Var2.a).a;
                Objects.requireNonNull(bVar2);
                ni91.h(b, bVar2);
                aq80Var2.a = null;
            }
            aq80 aq80Var3 = this.H;
            aq80Var3.getClass();
            tob1.b();
            sa90 sa90Var3 = (sa90) aq80Var3.a;
            if (sa90Var3 != null) {
                euy r = r(((Float) sa90Var3.b).floatValue());
                b bVar3 = (b) ((sa90) aq80Var3.a).a;
                Objects.requireNonNull(bVar3);
                ni91.h(r, bVar3);
                aq80Var3.a = null;
            }
        } catch (RuntimeException e) {
            if (runnable != null) {
                runnable.run();
            }
            throw e;
        }
    }

    public final void u() {
        x();
        tob1.b();
        w(Integer.valueOf(this.e.q));
        v(Integer.valueOf(this.i.J()), Integer.valueOf(this.i.K()), Integer.valueOf(this.i.L()));
        if (l()) {
            this.t.a(this.l);
        }
        this.l = f();
    }

    public final void v(Integer num, Integer num2, Integer num3) {
        t7v t7vVar;
        tob1.b();
        if (l()) {
            this.t.a(this.i);
        }
        f d = d(num, num2, num3);
        this.i = d;
        Executor executor = this.g;
        if (executor == null || (t7vVar = this.h) == null) {
            return;
        }
        d.N(executor, t7vVar);
    }

    public final void w(Integer num) {
        if (l()) {
            this.t.a(this.e);
        }
        int J = this.e.J();
        this.e = e(num);
        tob1.b();
        if (J == 3) {
            Integer b = this.a.b();
            if (b != null && b.intValue() != 0) {
                ny61.g("Not a front camera despite setting FLASH_MODE_SCREEN");
                return;
            }
            y();
        }
        this.e.M(J);
    }

    public final void x() {
        if (l()) {
            this.t.a(this.c);
        }
        pxe0 pxe0Var = new pxe0();
        c(pxe0Var, this.d, null);
        pxe0Var.a.w(eav.l2, this.q);
        g f = pxe0Var.f();
        this.c = f;
        rxe0 rxe0Var = this.v;
        if (rxe0Var != null) {
            f.J(rxe0Var);
        }
    }

    public final void y() {
        rdp0 h = h();
        if (h == null) {
            sgb1.g(3, "CameraController");
            w8v w8vVar = this.e;
            w8vVar.getClass();
            tdp0 tdp0Var = new tdp0(N);
            w8vVar.v = tdp0Var;
            w8vVar.f().e(tdp0Var);
            return;
        }
        w8v w8vVar2 = this.e;
        v8v v8vVar = h.b;
        w8vVar2.getClass();
        tdp0 tdp0Var2 = new tdp0(v8vVar);
        w8vVar2.v = tdp0Var2;
        w8vVar2.f().e(tdp0Var2);
        h.a.name();
        sgb1.g(3, "CameraController");
    }
}
