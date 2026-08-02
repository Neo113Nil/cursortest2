package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class e531 extends d531 {
    public final float A;
    public final int B;
    public final int C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final String a;
    public final List b;
    public final int c;
    public final ml6 w;
    public final float x;
    public final ml6 y;
    public final float z;

    public e531(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, int i3, ml6 ml6Var, ml6 ml6Var2, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.w = ml6Var;
        this.x = f;
        this.y = ml6Var2;
        this.z = f2;
        this.A = f3;
        this.B = i2;
        this.C = i3;
        this.D = f4;
        this.E = f5;
        this.F = f6;
        this.G = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e531.class != obj.getClass()) {
            return false;
        }
        e531 e531Var = (e531) obj;
        return this.a.equals(e531Var.a) && jl40.l(this.w, e531Var.w) && this.x == e531Var.x && jl40.l(this.y, e531Var.y) && this.z == e531Var.z && this.A == e531Var.A && this.B == e531Var.B && this.C == e531Var.C && this.D == e531Var.D && this.E == e531Var.E && this.F == e531Var.F && this.G == e531Var.G && this.c == e531Var.c && jl40.l(this.b, e531Var.b);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        ml6 ml6Var = this.w;
        int c2 = g8e.c(this.x, (c + (ml6Var != null ? ml6Var.hashCode() : 0)) * 31, 31);
        ml6 ml6Var2 = this.y;
        return Integer.hashCode(this.c) + g8e.c(this.G, g8e.c(this.F, g8e.c(this.E, g8e.c(this.D, oyr.b(this.C, oyr.b(this.B, g8e.c(this.A, g8e.c(this.z, (c2 + (ml6Var2 != null ? ml6Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
