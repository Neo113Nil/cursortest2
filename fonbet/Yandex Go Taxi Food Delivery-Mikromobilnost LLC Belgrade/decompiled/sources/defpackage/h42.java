package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class h42 {
    public final long a;
    public final a9z0 b;
    public final int c;
    public final sf10 d;
    public final long e;
    public final a9z0 f;
    public final int g;
    public final sf10 h;
    public final long i;
    public final long j;

    public h42(long j, a9z0 a9z0Var, int i, sf10 sf10Var, long j2, a9z0 a9z0Var2, int i2, sf10 sf10Var2, long j3, long j4) {
        this.a = j;
        this.b = a9z0Var;
        this.c = i;
        this.d = sf10Var;
        this.e = j2;
        this.f = a9z0Var2;
        this.g = i2;
        this.h = sf10Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h42.class != obj.getClass()) {
            return false;
        }
        h42 h42Var = (h42) obj;
        return this.a == h42Var.a && this.c == h42Var.c && this.e == h42Var.e && this.g == h42Var.g && this.i == h42Var.i && this.j == h42Var.j && this.b.equals(h42Var.b) && Objects.equals(this.d, h42Var.d) && Objects.equals(this.f, h42Var.f) && Objects.equals(this.h, h42Var.h);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
    }
}
