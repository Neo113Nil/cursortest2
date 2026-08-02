package xsna;

import java.util.Arrays;
import java.util.HashMap;
import xsna.eak0;

/* compiled from: Snapshot.kt */
/* loaded from: classes11.dex */
public final class z060 extends uh50 {
    public final uh50 o;
    public boolean p;

    public z060(long j, kak0 kak0Var, izs<Object, s3q0> izsVar, izs<Object, s3q0> izsVar2, uh50 uh50Var) {
        super(j, kak0Var, izsVar, izsVar2);
        this.o = uh50Var;
        uh50Var.k();
    }

    @Override // xsna.uh50, xsna.dak0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // xsna.uh50
    public final eak0 w() {
        z060 z060Var;
        uh50 uh50Var = this.o;
        if (uh50Var.m || uh50Var.c) {
            return new eak0.a(this);
        }
        qh50<muk0> qh50Var = this.h;
        long j = this.b;
        HashMap b = qh50Var != null ? qak0.b(uh50Var.g(), this, this.o.d()) : null;
        Object obj = qak0.c;
        synchronized (obj) {
            try {
                qak0.c(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (qh50Var == null || qh50Var.d == 0) {
                    z060Var = this;
                    a();
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    z060Var = this;
                    eak0 z = z060Var.z(this.o.g(), qh50Var, b, this.o.d());
                    if (!epx.f(z, eak0.b.a)) {
                        return z;
                    }
                    qh50<muk0> x = z060Var.o.x();
                    if (x != null) {
                        x.l(qh50Var);
                    } else {
                        z060Var.o.B(qh50Var);
                        z060Var.h = null;
                    }
                }
                if (epx.h(z060Var.o.g(), j) < 0) {
                    z060Var.o.v();
                }
                uh50 uh50Var2 = z060Var.o;
                uh50Var2.r(uh50Var2.d().b(j).a(z060Var.j));
                z060Var.o.A(j);
                uh50 uh50Var3 = z060Var.o;
                int i = z060Var.d;
                z060Var.d = -1;
                if (i >= 0) {
                    int[] iArr = uh50Var3.k;
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    uh50Var3.k = copyOf;
                } else {
                    uh50Var3.getClass();
                }
                uh50 uh50Var4 = z060Var.o;
                kak0 kak0Var = z060Var.j;
                uh50Var4.getClass();
                synchronized (obj) {
                    uh50Var4.j = uh50Var4.j.d(kak0Var);
                    s3q0 s3q0Var2 = s3q0.a;
                    uh50 uh50Var5 = z060Var.o;
                    int[] iArr2 = z060Var.k;
                    uh50Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = uh50Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        uh50Var5.k = iArr2;
                    }
                }
                z060Var.m = true;
                if (!z060Var.p) {
                    z060Var.p = true;
                    z060Var.o.l();
                }
                return eak0.b.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
