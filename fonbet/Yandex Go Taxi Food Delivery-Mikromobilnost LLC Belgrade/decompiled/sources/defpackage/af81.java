package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class af81 implements kq71 {
    public final int A;
    public final int B;
    public final Object a;
    public final int b;
    public final op81 c;
    public final Object w;
    public final int x;
    public final long y;
    public final long z;

    public af81(Object obj, int i, op81 op81Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = op81Var;
        this.w = obj2;
        this.x = i2;
        this.y = j;
        this.z = j2;
        this.A = i3;
        this.B = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af81.class == obj.getClass()) {
            af81 af81Var = (af81) obj;
            if (this.b == af81Var.b && this.x == af81Var.x && this.y == af81Var.y && this.z == af81Var.z && this.A == af81Var.A && this.B == af81Var.B && tja1.a(this.a, af81Var.a) && tja1.a(this.w, af81Var.w) && tja1.a(this.c, af81Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.w, Integer.valueOf(this.x), Long.valueOf(this.y), Long.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(this.B)});
    }
}
