package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class ye {
    public final long a;
    public final w73 b;
    public final int c;
    public final zn1 d;
    public final long e;
    public final w73 f;
    public final int g;
    public final zn1 h;
    public final long i;
    public final long j;

    public ye(long j, w73 w73Var, int i, zn1 zn1Var, long j2, w73 w73Var2, int i2, zn1 zn1Var2, long j3, long j4) {
        this.a = j;
        this.b = w73Var;
        this.c = i;
        this.d = zn1Var;
        this.e = j2;
        this.f = w73Var2;
        this.g = i2;
        this.h = zn1Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye.class == obj.getClass()) {
            ye yeVar = (ye) obj;
            if (this.a == yeVar.a && this.c == yeVar.c && this.e == yeVar.e && this.g == yeVar.g && this.i == yeVar.i && this.j == yeVar.j && ma2.a(this.b, yeVar.b) && ma2.a(this.d, yeVar.d) && ma2.a(this.f, yeVar.f) && ma2.a(this.h, yeVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
