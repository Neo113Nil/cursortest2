package defpackage;

/* loaded from: classes9.dex */
public final class k3f0 {
    public int a;
    public gb3[] b = new gb3[8];

    public final void a(int i, gb3 gb3Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            gb3 gb3Var2 = this.b[i2];
            if (jl40.r(0L, gb3Var.g - gb3Var2.g) <= 0) {
                break;
            }
            gb3Var2.f = i;
            this.b[i] = gb3Var2;
            i = i2;
        }
        this.b[i] = gb3Var;
        gb3Var.f = i;
    }

    public final void b(gb3 gb3Var) {
        gb3 gb3Var2;
        int i = gb3Var.f;
        if (i == -1) {
            ny61.g("Failed requirement.");
            return;
        }
        int i2 = this.a;
        gb3[] gb3VarArr = this.b;
        gb3 gb3Var3 = gb3VarArr[i2];
        gb3Var.f = -1;
        gb3VarArr[i2] = null;
        this.a = i2 - 1;
        if (gb3Var == gb3Var3) {
            return;
        }
        int r = jl40.r(0L, gb3Var3.g - gb3Var.g);
        if (r == 0) {
            this.b[i] = gb3Var3;
            gb3Var3.f = i;
            return;
        }
        if (r >= 0) {
            a(i, gb3Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.a;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                } else {
                    gb3Var2 = this.b[i3];
                }
            } else {
                gb3[] gb3VarArr2 = this.b;
                gb3Var2 = gb3VarArr2[i3];
                gb3 gb3Var4 = gb3VarArr2[i4];
                if (jl40.r(0L, gb3Var4.g - gb3Var2.g) >= 0) {
                    gb3Var2 = gb3Var4;
                }
            }
            if (jl40.r(0L, gb3Var2.g - gb3Var3.g) <= 0) {
                break;
            }
            int i6 = gb3Var2.f;
            gb3Var2.f = i;
            this.b[i] = gb3Var2;
            i = i6;
        }
        this.b[i] = gb3Var3;
        gb3Var3.f = i;
    }
}
