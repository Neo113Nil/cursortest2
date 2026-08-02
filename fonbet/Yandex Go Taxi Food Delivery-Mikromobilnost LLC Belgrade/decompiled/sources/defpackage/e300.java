package defpackage;

/* loaded from: classes2.dex */
public final class e300 {
    public final z200 a;

    public e300(z200 z200Var) {
        this.a = z200Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e300) && jl40.l(this.a, ((e300) obj).a);
    }

    public final int hashCode() {
        z200 z200Var = this.a;
        if (z200Var == null) {
            return 0;
        }
        return z200Var.hashCode();
    }

    public final String toString() {
        return "VoluntaryMailingAdsAgreement(agreement=" + this.a + ')';
    }
}
