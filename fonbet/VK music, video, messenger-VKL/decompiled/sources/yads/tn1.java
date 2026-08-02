package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes10.dex */
public final class tn1 {
    public final zn1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public tn1(zn1 zn1Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        ni.a(!z4 || z2);
        ni.a(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        ni.a(z5);
        this.a = zn1Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tn1.class == obj.getClass()) {
            tn1 tn1Var = (tn1) obj;
            if (this.b == tn1Var.b && this.c == tn1Var.c && this.d == tn1Var.d && this.e == tn1Var.e && this.f == tn1Var.f && this.g == tn1Var.g && this.h == tn1Var.h && this.i == tn1Var.i && mc3.a(this.a, tn1Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
