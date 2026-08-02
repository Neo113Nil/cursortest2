package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cu5;

/* compiled from: ThrottledCallbacks.kt */
/* loaded from: classes11.dex */
public final class xro0 {
    public a b;
    public long f;
    public float[] g;
    public final pg50<a> a = g9x.a();
    public long c = -1;
    public long d = 0;
    public long e = 0;

    /* compiled from: ThrottledCallbacks.kt */
    public final class a {
        public final int a;
        public final cu5.a b;
        public final uf1 c;
        public a d;
        public long e;
        public long f;
        public long g = Long.MIN_VALUE;

        public a(int i, cu5.a aVar, uf1 uf1Var) {
            this.a = i;
            this.b = aVar;
            this.c = uf1Var;
        }

        public final void a(long j, long j2, long j3, long j4, float[] fArr) {
            zsf0 zsf0Var;
            zsf0 zsf0Var2;
            long j5 = xro0.this.f;
            cu5.a aVar = this.b;
            androidx.compose.ui.node.o d = itl.d(aVar, 2);
            LayoutNode f = itl.f(aVar);
            boolean g = f.g();
            u470 u470Var = f.G;
            if (g) {
                if (u470Var.d != d) {
                    long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                    d.getClass();
                    long j6 = d.d;
                    androidx.compose.ui.node.o oVar = u470Var.d;
                    oVar.getClass();
                    zsf0Var = new zsf0(n34.A(oVar.S(d, floatToRawIntBits)), (4294967295L & (((int) (r2 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r2 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, aVar);
                } else {
                    zsf0Var = new zsf0(j, j2, j3, j4, j5, fArr, aVar);
                }
                zsf0Var2 = zsf0Var;
            } else {
                zsf0Var2 = null;
            }
            if (zsf0Var2 == null) {
                return;
            }
            this.c.invoke(zsf0Var2);
        }

        public final void b() {
            xro0 xro0Var = xro0.this;
            pg50<a> pg50Var = xro0Var.a;
            int i = this.a;
            a i2 = pg50Var.i(i);
            if (i2 != null) {
                if (i2.equals(this)) {
                    a aVar = this.d;
                    this.d = null;
                    if (aVar != null) {
                        pg50Var.h(i, aVar);
                        return;
                    }
                    LayoutNode f = itl.f(this.b.b);
                    if (f.h) {
                        voy.a(f).getRectManager().b.c(f.c, false);
                        return;
                    }
                    return;
                }
                pg50Var.h(i, i2);
                while (true) {
                    a aVar2 = i2.d;
                    if (aVar2 == null) {
                        break;
                    }
                    if (aVar2 == this) {
                        i2.d = this.d;
                        this.d = null;
                        return;
                    }
                    i2 = aVar2;
                }
            }
            a aVar3 = xro0Var.b;
            if (aVar3 == this) {
                xro0Var.b = aVar3.d;
                this.d = null;
                return;
            }
            a aVar4 = aVar3 != null ? aVar3.d : null;
            while (true) {
                a aVar5 = aVar3;
                aVar3 = aVar4;
                if (aVar3 == null) {
                    return;
                }
                if (aVar3 == this) {
                    if (aVar5 != null) {
                        aVar5.d = aVar3.d;
                    }
                    this.d = null;
                    return;
                }
                aVar4 = aVar3.d;
            }
        }
    }

    public final void a(a aVar, long j, long j2, float[] fArr, long j3) {
        long j4 = aVar.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            aVar.g = j3;
            aVar.a(aVar.e, aVar.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (h9x.b(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!h9x.b(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (i << 32) | (i2 & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
