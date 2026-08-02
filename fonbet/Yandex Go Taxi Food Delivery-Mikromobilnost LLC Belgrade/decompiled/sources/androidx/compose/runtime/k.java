package androidx.compose.runtime;

import defpackage.dmw0;
import defpackage.lid;
import defpackage.o13;
import defpackage.qgd;
import defpackage.vx40;
import defpackage.wls;
import defpackage.xy40;
import defpackage.ym11;
import defpackage.zti0;

/* loaded from: classes10.dex */
public final class k implements o13 {
    public final vx40 a = new vx40((Object) null);
    public final xy40 b = new xy40((Object) null);
    public final Object c;

    public k(Object obj) {
        this.c = obj;
    }

    @Override // defpackage.o13
    public final void a(int i, int i2) {
        vx40 vx40Var = this.a;
        vx40Var.c(2);
        vx40Var.c(i);
        vx40Var.c(i2);
    }

    public final void b() {
        this.a.c(9);
    }

    public final void c(dmw0 dmw0Var, zti0 zti0Var) {
        Exception exc;
        vx40 vx40Var = this.a;
        int i = vx40Var.b;
        xy40 xy40Var = new xy40((Object) null);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            xy40 xy40Var2 = this.b;
            if (i2 >= i) {
                if (i3 != xy40Var2.b) {
                    lid.a("Applier operation size mismatch");
                }
                xy40Var2.j();
                vx40Var.b = 0;
                dmw0Var.d();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (vx40Var.a(i2)) {
                        case 0:
                            dmw0Var.p();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            dmw0Var.n(xy40Var2.b(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            dmw0Var.a(vx40Var.a(i4), vx40Var.a(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    dmw0Var.i(vx40Var.a(i4), vx40Var.a(i7), vx40Var.a(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            dmw0Var.b();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            dmw0Var.m(vx40Var.a(i4), xy40Var2.b(i3));
                            i3 = i9;
                        case 6:
                            i2 += 2;
                            try {
                                vx40Var.a(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i11 = i3 + 1;
                            Object b = xy40Var2.b(i3);
                            ym11.e(2, b);
                            i3 += 2;
                            dmw0Var.g(xy40Var2.b(i11), (wls) b);
                            i2 = i4;
                        case 8:
                            Object obj = dmw0Var.c;
                            if (obj instanceof qgd) {
                                qgd qgdVar = (qgd) obj;
                                if (zti0Var.f.j(qgdVar)) {
                                    qgdVar.onDeactivate();
                                }
                            }
                            xy40Var.g(obj);
                            dmw0Var.f();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Throwable th) {
                    dmw0Var.d();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new ComposePausableCompositionException(xy40Var2, xy40Var, vx40Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.o13
    public final void f() {
        this.a.c(8);
    }

    @Override // defpackage.o13
    public final void g(Object obj, wls wlsVar) {
        this.a.c(7);
        xy40 xy40Var = this.b;
        xy40Var.g(wlsVar);
        xy40Var.g(obj);
    }

    @Override // defpackage.o13
    public final void i(int i, int i2, int i3) {
        vx40 vx40Var = this.a;
        vx40Var.c(3);
        vx40Var.c(i);
        vx40Var.c(i2);
        vx40Var.c(i3);
    }

    @Override // defpackage.o13
    public final void k(int i, Object obj) {
        vx40 vx40Var = this.a;
        vx40Var.c(6);
        vx40Var.c(i);
        this.b.g(obj);
    }

    @Override // defpackage.o13
    public final Object l() {
        return this.c;
    }

    @Override // defpackage.o13
    public final void m(int i, Object obj) {
        vx40 vx40Var = this.a;
        vx40Var.c(5);
        vx40Var.c(i);
        this.b.g(obj);
    }

    @Override // defpackage.o13
    public final void n(Object obj) {
        this.a.c(1);
        this.b.g(obj);
    }

    @Override // defpackage.o13
    public final void p() {
        this.a.c(0);
    }
}
