package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* loaded from: classes.dex */
public final class a0z0 {
    public final int a;
    public final zb4 b;
    public final w04 c;
    public a0z0 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ b0z0 h;

    public a0z0(b0z0 b0z0Var, int i, zb4 zb4Var, w04 w04Var) {
        this.h = b0z0Var;
        this.a = i;
        this.b = zb4Var;
        this.c = w04Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        qsi0 j5 = uob1.j(j, j2, j3, j4, this.h.f, this.b, fArr);
        if (j5 == null) {
            return;
        }
        this.c.invoke(j5);
    }

    public final void b() {
        b0z0 b0z0Var = this.h;
        wx40 wx40Var = b0z0Var.a;
        int i = this.a;
        a0z0 a0z0Var = (a0z0) wx40Var.g(i);
        if (a0z0Var != null) {
            if (a0z0Var == this) {
                a0z0 a0z0Var2 = this.d;
                this.d = null;
                if (a0z0Var2 == null) {
                    LayoutNode P = qje.P(this.b.getNode());
                    if (P.z) {
                        d1y.a(P).getRectManager().b.c(P.b, false);
                        return;
                    }
                    return;
                }
                int d = wx40Var.d(i);
                Object[] objArr = wx40Var.c;
                Object obj = objArr[d];
                wx40Var.b[d] = i;
                objArr[d] = a0z0Var2;
                return;
            }
            int d2 = wx40Var.d(i);
            Object[] objArr2 = wx40Var.c;
            Object obj2 = objArr2[d2];
            wx40Var.b[d2] = i;
            objArr2[d2] = a0z0Var;
            while (true) {
                a0z0 a0z0Var3 = a0z0Var.d;
                if (a0z0Var3 == null) {
                    break;
                }
                if (a0z0Var3 == this) {
                    a0z0Var.d = this.d;
                    this.d = null;
                    return;
                }
                a0z0Var = a0z0Var3;
            }
        }
        a0z0 a0z0Var4 = b0z0Var.b;
        if (a0z0Var4 == this) {
            b0z0Var.b = a0z0Var4.d;
            this.d = null;
            return;
        }
        a0z0 a0z0Var5 = a0z0Var4 != null ? a0z0Var4.d : null;
        while (true) {
            a0z0 a0z0Var6 = a0z0Var4;
            a0z0Var4 = a0z0Var5;
            if (a0z0Var4 == null) {
                return;
            }
            if (a0z0Var4 == this) {
                if (a0z0Var6 != null) {
                    a0z0Var6.d = a0z0Var4.d;
                }
                this.d = null;
                return;
            }
            a0z0Var5 = a0z0Var4.d;
        }
    }
}
