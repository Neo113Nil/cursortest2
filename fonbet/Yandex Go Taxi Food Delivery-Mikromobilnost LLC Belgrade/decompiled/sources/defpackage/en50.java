package defpackage;

import androidx.compose.runtime.snapshots.a;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class en50 extends mz40 {
    public final mz40 o;
    public boolean p;

    public en50(long j, a aVar, tls tlsVar, tls tlsVar2, mz40 mz40Var) {
        super(j, aVar, tlsVar, tlsVar2);
        this.o = mz40Var;
        mz40Var.k();
    }

    @Override // defpackage.mz40, defpackage.i2t0
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

    @Override // defpackage.mz40
    public final qke w() {
        en50 en50Var;
        mz40 mz40Var = this.o;
        if (mz40Var.m || mz40Var.c) {
            return new j2t0(this);
        }
        iz40 iz40Var = this.h;
        long j = this.b;
        HashMap b = iz40Var != null ? q2t0.b(mz40Var.g(), this, this.o.d()) : null;
        Object obj = q2t0.c;
        synchronized (obj) {
            try {
                q2t0.c(this);
                if (iz40Var == null || iz40Var.d == 0) {
                    en50Var = this;
                    en50Var.a();
                } else {
                    en50Var = this;
                    qke z = en50Var.z(this.o.g(), iz40Var, b, this.o.d());
                    if (!z.equals(k2t0.t)) {
                        return z;
                    }
                    iz40 x = en50Var.o.x();
                    if (x != null) {
                        x.j(iz40Var);
                    } else {
                        en50Var.o.B(iz40Var);
                        en50Var.h = null;
                    }
                }
                if (jl40.r(en50Var.o.g(), j) < 0) {
                    en50Var.o.v();
                }
                mz40 mz40Var2 = en50Var.o;
                mz40Var2.r(mz40Var2.d().b(j).a(en50Var.j));
                en50Var.o.A(j);
                mz40 mz40Var3 = en50Var.o;
                int i = en50Var.d;
                en50Var.d = -1;
                if (i >= 0) {
                    int[] iArr = mz40Var3.k;
                    int length = iArr.length;
                    int[] copyOf = Arrays.copyOf(iArr, length + 1);
                    copyOf[length] = i;
                    mz40Var3.k = copyOf;
                } else {
                    mz40Var3.getClass();
                }
                mz40 mz40Var4 = en50Var.o;
                a aVar = en50Var.j;
                mz40Var4.getClass();
                synchronized (obj) {
                    mz40Var4.j = mz40Var4.j.e(aVar);
                    mz40 mz40Var5 = en50Var.o;
                    int[] iArr2 = en50Var.k;
                    mz40Var5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = mz40Var5.k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                            iArr2 = copyOf2;
                        }
                        mz40Var5.k = iArr2;
                    }
                }
                en50Var.m = true;
                if (!en50Var.p) {
                    en50Var.p = true;
                    en50Var.o.l();
                }
                return k2t0.t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
