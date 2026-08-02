package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import defpackage.ar7;
import defpackage.br7;
import defpackage.d6z;
import defpackage.dyq0;
import defpackage.eav;
import defpackage.enw0;
import defpackage.eyq0;
import defpackage.geb1;
import defpackage.icv;
import defpackage.iiv;
import defpackage.j4n;
import defpackage.k6u;
import defpackage.lru0;
import defpackage.o84;
import defpackage.oxe0;
import defpackage.p8v;
import defpackage.pxe0;
import defpackage.qxe0;
import defpackage.r38;
import defpackage.rxe0;
import defpackage.sgb1;
import defpackage.szd;
import defpackage.tob1;
import defpackage.txe0;
import defpackage.wi21;
import defpackage.xi21;
import defpackage.yo90;
import defpackage.yp7;
import defpackage.yy40;
import defpackage.zi21;
import defpackage.znw0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class g extends j {
    public static final qxe0 x = new qxe0();
    public static final k6u y = geb1.f();
    public rxe0 q;
    public Executor r;
    public dyq0 s;
    public iiv t;
    public enw0 u;
    public znw0 v;
    public eyq0 w;

    @Override // androidx.camera.core.j
    public final lru0 A(lru0 lru0Var, lru0 lru0Var2) {
        Objects.toString(lru0Var);
        Objects.toString(lru0Var2);
        sgb1.g(3, "Preview");
        K((txe0) this.h, lru0Var);
        return lru0Var;
    }

    @Override // androidx.camera.core.j
    public final void B() {
        H();
    }

    @Override // androidx.camera.core.j
    public final void E(Rect rect) {
        this.k = rect;
        I();
    }

    public final void H() {
        eyq0 eyq0Var = this.w;
        if (eyq0Var != null) {
            eyq0Var.b();
            this.w = null;
        }
        iiv iivVar = this.t;
        if (iivVar != null) {
            iivVar.a();
            this.t = null;
        }
        enw0 enw0Var = this.u;
        if (enw0Var != null) {
            enw0Var.c();
            this.u = null;
        }
        znw0 znw0Var = this.v;
        if (znw0Var != null) {
            synchronized (znw0Var.a) {
                znw0Var.o = null;
                znw0Var.p = null;
            }
        }
        this.v = null;
    }

    public final void I() {
        br7 e = e();
        enw0 enw0Var = this.u;
        if (e == null || enw0Var == null) {
            return;
        }
        tob1.g(new yp7(enw0Var, j(e, p(e)), c(), 2));
    }

    public final void J(rxe0 rxe0Var) {
        tob1.b();
        if (rxe0Var == null) {
            this.q = null;
            this.d = UseCase$State.INACTIVE;
            t();
        } else {
            this.q = rxe0Var;
            this.r = y;
            if (d() != null) {
                K((txe0) this.h, this.i);
                s();
            }
            r();
        }
    }

    public final void K(txe0 txe0Var, lru0 lru0Var) {
        Rect rect;
        tob1.b();
        br7 e = e();
        Objects.requireNonNull(e);
        H();
        int i = 0;
        d6z.y(null, this.u == null);
        Matrix matrix = this.l;
        boolean q = e.q();
        Size f = lru0Var.f();
        Rect rect2 = this.k;
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = f != null ? new Rect(0, 0, f.getWidth(), f.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        enw0 enw0Var = new enw0(1, 34, lru0Var, matrix, q, rect, j(e, p(e)), c(), e.q() && p(e));
        this.u = enw0Var;
        enw0Var.a(new oxe0(i, this));
        znw0 d = this.u.d(e, true);
        this.v = d;
        this.t = d.m;
        if (this.q != null) {
            I();
            rxe0 rxe0Var = this.q;
            rxe0Var.getClass();
            znw0 znw0Var = this.v;
            znw0Var.getClass();
            this.r.execute(new yo90(17, rxe0Var, znw0Var));
        }
        dyq0 e2 = dyq0.e(txe0Var, lru0Var.f());
        e2.h = lru0Var.g();
        a(e2, lru0Var);
        int m = txe0Var.m();
        if (m != 0) {
            r38 r38Var = e2.b;
            r38Var.getClass();
            if (m != 0) {
                r38Var.b.w(xi21.u4, Integer.valueOf(m));
            }
        }
        if (lru0Var.d() != null) {
            e2.b(lru0Var.d());
        }
        if (this.q != null) {
            e2.c(this.t, lru0Var.b(), ((Integer) ((icv) this.h).g(icv.q2, -1)).intValue());
        }
        eyq0 eyq0Var = this.w;
        if (eyq0Var != null) {
            eyq0Var.b();
        }
        eyq0 eyq0Var2 = new eyq0(new p8v(2, this));
        this.w = eyq0Var2;
        e2.f = eyq0Var2;
        this.s = e2;
        Object[] objArr = {e2.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
    }

    @Override // androidx.camera.core.j
    public final xi21 h(boolean z, zi21 zi21Var) {
        x.getClass();
        txe0 txe0Var = qxe0.a;
        szd a = zi21Var.a(txe0Var.y(), 1);
        if (z) {
            a = szd.q(a, txe0Var);
        }
        if (a == null) {
            return null;
        }
        return ((pxe0) o(a)).e();
    }

    @Override // androidx.camera.core.j
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // androidx.camera.core.j
    public final wi21 o(szd szdVar) {
        return new pxe0(yy40.p(szdVar));
    }

    public final String toString() {
        return "Preview:".concat(i());
    }

    @Override // androidx.camera.core.j
    public final xi21 w(ar7 ar7Var, wi21 wi21Var) {
        wi21Var.d().w(eav.j2, 34);
        return wi21Var.e();
    }

    @Override // androidx.camera.core.j
    public final o84 z(szd szdVar) {
        this.s.b.c(szdVar);
        Object[] objArr = {this.s.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        j4n i = this.i.i();
        i.z = szdVar;
        return i.k();
    }
}
