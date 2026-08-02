package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.impl.SessionConfig$SessionError;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.a8v;
import defpackage.ar7;
import defpackage.asj0;
import defpackage.b8v;
import defpackage.br7;
import defpackage.bsj0;
import defpackage.c5b1;
import defpackage.cdh;
import defpackage.csj0;
import defpackage.dyq0;
import defpackage.eyq0;
import defpackage.f8v;
import defpackage.fyq0;
import defpackage.geb1;
import defpackage.icv;
import defpackage.iiv;
import defpackage.j4n;
import defpackage.lru0;
import defpackage.mdl0;
import defpackage.ni91;
import defpackage.ny61;
import defpackage.o84;
import defpackage.r7v;
import defpackage.sgb1;
import defpackage.sxy0;
import defpackage.szd;
import defpackage.t7v;
import defpackage.tob1;
import defpackage.v7v;
import defpackage.w7v;
import defpackage.wi21;
import defpackage.x34;
import defpackage.xi21;
import defpackage.xp7;
import defpackage.yy40;
import defpackage.z7v;
import defpackage.zi21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class f extends j {
    public static final w7v z = new w7v();
    public final Object q;
    public z7v r;
    public Executor s;
    public t7v t;
    public Rect u;
    public Matrix v;
    public dyq0 w;
    public iiv x;
    public eyq0 y;

    public f(b8v b8vVar) {
        super(b8vVar);
        this.q = new Object();
    }

    @Override // androidx.camera.core.j
    public final lru0 A(lru0 lru0Var, lru0 lru0Var2) {
        Objects.toString(lru0Var);
        Objects.toString(lru0Var2);
        sgb1.g(3, "ImageAnalysis");
        b8v b8vVar = (b8v) this.h;
        g();
        dyq0 I = I(b8vVar, lru0Var);
        this.w = I;
        Object[] objArr = {I.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        return lru0Var;
    }

    @Override // androidx.camera.core.j
    public final void B() {
        tob1.b();
        eyq0 eyq0Var = this.y;
        if (eyq0Var != null) {
            eyq0Var.b();
            this.y = null;
        }
        iiv iivVar = this.x;
        if (iivVar != null) {
            iivVar.a();
            this.x = null;
        }
        synchronized (this.q) {
            z7v z7vVar = this.r;
            z7vVar.N = false;
            z7vVar.c();
            this.r = null;
        }
    }

    @Override // androidx.camera.core.j
    public final void C(Matrix matrix) {
        super.C(matrix);
        synchronized (this.q) {
            try {
                z7v z7vVar = this.r;
                if (z7vVar != null) {
                    z7vVar.i(matrix);
                }
                this.v = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.j
    public final void E(Rect rect) {
        this.k = rect;
        synchronized (this.q) {
            try {
                z7v z7vVar = this.r;
                if (z7vVar != null) {
                    z7vVar.j(rect);
                }
                this.u = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H() {
        synchronized (this.q) {
            try {
                z7v z7vVar = this.r;
                if (z7vVar != null) {
                    z7vVar.h(null, null);
                }
                if (this.t != null) {
                    this.d = UseCase$State.INACTIVE;
                    t();
                }
                this.s = null;
                this.t = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dyq0 I(b8v b8vVar, lru0 lru0Var) {
        final z7v z7vVar;
        boolean z2;
        int height;
        int width;
        int i;
        boolean z3;
        iiv iivVar;
        eyq0 eyq0Var;
        tob1.b();
        Size f = lru0Var.f();
        Executor executor = (Executor) b8vVar.g(sxy0.h4, geb1.c());
        executor.getClass();
        int K = J() == 1 ? K() : 4;
        mdl0 mdl0Var = null;
        if (b8vVar.g(b8v.w, null) != null) {
            ny61.u();
            return null;
        }
        mdl0 mdl0Var2 = new mdl0(c5b1.a(f.getWidth(), f.getHeight(), this.h.getInputFormat(), K));
        synchronized (this.q) {
            M();
            z7vVar = this.r;
        }
        int i2 = 0;
        if (e() != null) {
            br7 e = e();
            if (((Boolean) ((b8v) this.h).g(b8v.z, Boolean.FALSE)).booleanValue() && j(e, false) % SubsamplingScaleImageView.ORIENTATION_180 != 0) {
                z2 = true;
                height = !z2 ? f.getHeight() : f.getWidth();
                width = !z2 ? f.getWidth() : f.getHeight();
                i = L() != 2 ? 1 : 35;
                z3 = this.h.getInputFormat() != 35 && L() == 2;
                boolean z4 = this.h.getInputFormat() != 35 && L() == 3;
                boolean z5 = this.h.getInputFormat() != 35 && (!(e() == null || j(e(), false) == 0) || Boolean.TRUE.equals((Boolean) ((b8v) this.h).g(b8v.y, null)));
                if (!z3 || (z5 && !z4)) {
                    mdl0Var = new mdl0(c5b1.a(height, width, i, mdl0Var2.l()));
                }
                if (mdl0Var != null) {
                    synchronized (z7vVar.M) {
                        z7vVar.A = mdl0Var;
                    }
                }
                O();
                mdl0Var2.u(z7vVar, executor);
                dyq0 e2 = dyq0.e(b8vVar, lru0Var.f());
                if (lru0Var.d() != null) {
                    e2.b(lru0Var.d());
                }
                iivVar = this.x;
                if (iivVar != null) {
                    iivVar.a();
                }
                iiv iivVar2 = new iiv(mdl0Var2.getSurface(), f, this.h.getInputFormat());
                this.x = iivVar2;
                ni91.g(iivVar2.e).c(new r7v(i2, mdl0Var2, mdl0Var), geb1.f());
                e2.h = lru0Var.g();
                a(e2, lru0Var);
                e2.c(this.x, lru0Var.b(), -1);
                eyq0Var = this.y;
                if (eyq0Var != null) {
                    eyq0Var.b();
                }
                eyq0 eyq0Var2 = new eyq0(new fyq0() { // from class: s7v
                    @Override // defpackage.fyq0
                    public final void a(jyq0 jyq0Var, SessionConfig$SessionError sessionConfig$SessionError) {
                        f fVar = f.this;
                        if (fVar.e() == null) {
                            return;
                        }
                        tob1.b();
                        eyq0 eyq0Var3 = fVar.y;
                        if (eyq0Var3 != null) {
                            eyq0Var3.b();
                            fVar.y = null;
                        }
                        iiv iivVar3 = fVar.x;
                        if (iivVar3 != null) {
                            iivVar3.a();
                            fVar.x = null;
                        }
                        z7vVar.c();
                        fVar.g();
                        b8v b8vVar2 = (b8v) fVar.h;
                        lru0 lru0Var2 = fVar.i;
                        lru0Var2.getClass();
                        dyq0 I = fVar.I(b8vVar2, lru0Var2);
                        fVar.w = I;
                        Object[] objArr = {I.d()};
                        ArrayList arrayList = new ArrayList(1);
                        Object obj = objArr[0];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                        fVar.G(Collections.unmodifiableList(arrayList));
                        fVar.s();
                    }
                });
                this.y = eyq0Var2;
                e2.f = eyq0Var2;
                return e2;
            }
        }
        z2 = false;
        if (!z2) {
        }
        if (!z2) {
        }
        if (L() != 2) {
        }
        if (this.h.getInputFormat() != 35) {
        }
        if (this.h.getInputFormat() != 35) {
        }
        if (this.h.getInputFormat() != 35) {
        }
        if (!z3) {
        }
        mdl0Var = new mdl0(c5b1.a(height, width, i, mdl0Var2.l()));
        if (mdl0Var != null) {
        }
        O();
        mdl0Var2.u(z7vVar, executor);
        dyq0 e22 = dyq0.e(b8vVar, lru0Var.f());
        if (lru0Var.d() != null) {
        }
        iivVar = this.x;
        if (iivVar != null) {
        }
        iiv iivVar22 = new iiv(mdl0Var2.getSurface(), f, this.h.getInputFormat());
        this.x = iivVar22;
        ni91.g(iivVar22.e).c(new r7v(i2, mdl0Var2, mdl0Var), geb1.f());
        e22.h = lru0Var.g();
        a(e22, lru0Var);
        e22.c(this.x, lru0Var.b(), -1);
        eyq0Var = this.y;
        if (eyq0Var != null) {
        }
        eyq0 eyq0Var22 = new eyq0(new fyq0() { // from class: s7v
            @Override // defpackage.fyq0
            public final void a(jyq0 jyq0Var, SessionConfig$SessionError sessionConfig$SessionError) {
                f fVar = f.this;
                if (fVar.e() == null) {
                    return;
                }
                tob1.b();
                eyq0 eyq0Var3 = fVar.y;
                if (eyq0Var3 != null) {
                    eyq0Var3.b();
                    fVar.y = null;
                }
                iiv iivVar3 = fVar.x;
                if (iivVar3 != null) {
                    iivVar3.a();
                    fVar.x = null;
                }
                z7vVar.c();
                fVar.g();
                b8v b8vVar2 = (b8v) fVar.h;
                lru0 lru0Var2 = fVar.i;
                lru0Var2.getClass();
                dyq0 I = fVar.I(b8vVar2, lru0Var2);
                fVar.w = I;
                Object[] objArr = {I.d()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                fVar.G(Collections.unmodifiableList(arrayList));
                fVar.s();
            }
        });
        this.y = eyq0Var22;
        e22.f = eyq0Var22;
        return e22;
    }

    public final int J() {
        return ((Integer) ((b8v) this.h).g(b8v.b, 0)).intValue();
    }

    public final int K() {
        return ((Integer) ((b8v) this.h).g(b8v.c, 6)).intValue();
    }

    public final int L() {
        return ((Integer) ((b8v) this.h).g(b8v.x, 1)).intValue();
    }

    public final void M() {
        t7v t7vVar;
        synchronized (this.q) {
            try {
                b8v b8vVar = (b8v) this.h;
                if (((Integer) b8vVar.g(b8v.b, 0)).intValue() == 1) {
                    this.r = new a8v();
                } else {
                    this.r = new f8v((Executor) b8vVar.g(sxy0.h4, geb1.c()));
                }
                this.r.w = L();
                this.r.x = ((Boolean) ((b8v) this.h).g(b8v.z, Boolean.FALSE)).booleanValue();
                br7 e = e();
                Boolean bool = (Boolean) ((b8v) this.h).g(b8v.y, null);
                boolean a = e != null ? e.f().q().a(OnePixelShiftQuirk.class) : false;
                z7v z7vVar = this.r;
                if (bool != null) {
                    a = bool.booleanValue();
                }
                z7vVar.y = a;
                if (e != null) {
                    this.r.b = j(e, false);
                }
                Rect rect = this.u;
                if (rect != null) {
                    this.r.j(rect);
                }
                Matrix matrix = this.v;
                if (matrix != null) {
                    this.r.i(matrix);
                }
                Executor executor = this.s;
                if (executor != null && (t7vVar = this.t) != null) {
                    this.r.h(executor, t7vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void N(Executor executor, t7v t7vVar) {
        synchronized (this.q) {
            try {
                z7v z7vVar = this.r;
                if (z7vVar != null) {
                    z7vVar.h(executor, new xp7(1, t7vVar));
                }
                if (this.t == null) {
                    r();
                }
                this.s = executor;
                this.t = t7vVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void O() {
        synchronized (this.q) {
            try {
                br7 e = e();
                if (e != null) {
                    this.r.b = j(e, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.j
    public final xi21 h(boolean z2, zi21 zi21Var) {
        z.getClass();
        b8v b8vVar = w7v.a;
        szd a = zi21Var.a(b8vVar.y(), 1);
        if (z2) {
            a = szd.q(a, b8vVar);
        }
        if (a == null) {
            return null;
        }
        return ((v7v) o(a)).e();
    }

    @Override // androidx.camera.core.j
    public final wi21 o(szd szdVar) {
        return new v7v(yy40.p(szdVar));
    }

    public final String toString() {
        return "ImageAnalysis:".concat(i());
    }

    @Override // androidx.camera.core.j
    public final xi21 w(ar7 ar7Var, wi21 wi21Var) {
        Size b;
        synchronized (this.q) {
            try {
                t7v t7vVar = this.t;
                b = t7vVar != null ? t7vVar.b() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b == null) {
            return wi21Var.e();
        }
        if (ar7Var.i(((Integer) wi21Var.d().g(icv.n2, 0)).intValue()) % SubsamplingScaleImageView.ORIENTATION_180 == 90) {
            b = new Size(b.getHeight(), b.getWidth());
        }
        xi21 e = wi21Var.e();
        x34 x34Var = icv.r2;
        if (!e.d(x34Var)) {
            wi21Var.d().w(x34Var, b);
        }
        xi21 e2 = wi21Var.e();
        x34 x34Var2 = icv.w2;
        if (e2.d(x34Var2)) {
            bsj0 bsj0Var = (bsj0) this.f.g(x34Var2, null);
            asj0 asj0Var = bsj0Var == null ? new asj0() : asj0.b(bsj0Var);
            if (bsj0Var == null || bsj0Var.b == null) {
                asj0Var.b = new csj0(1, b);
            }
            if (bsj0Var == null) {
                asj0Var.c = new cdh(1, b);
            }
            wi21Var.d().w(x34Var2, asj0Var.a());
        }
        return wi21Var.e();
    }

    @Override // androidx.camera.core.j
    public final o84 z(szd szdVar) {
        this.w.b.c(szdVar);
        Object[] objArr = {this.w.d()};
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
