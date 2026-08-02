package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class of2 implements xq {
    public final Object b;
    public final int c;
    public final gn1 d;
    public final Object e;
    public final int f;
    public final long g;
    public final long h;
    public final int i;
    public final int j;

    public of2(Object obj, int i, gn1 gn1Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.b = obj;
        this.c = i;
        this.d = gn1Var;
        this.e = obj2;
        this.f = i2;
        this.g = j;
        this.h = j2;
        this.i = i3;
        this.j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && of2.class == obj.getClass()) {
            of2 of2Var = (of2) obj;
            if (this.c == of2Var.c && this.f == of2Var.f && this.g == of2Var.g && this.h == of2Var.h && this.i == of2Var.i && this.j == of2Var.j && ma2.a(this.b, of2Var.b) && ma2.a(this.e, of2Var.e) && ma2.a(this.d, of2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j)});
    }
}
