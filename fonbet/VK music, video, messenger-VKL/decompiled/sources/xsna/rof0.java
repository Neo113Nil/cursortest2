package xsna;

/* compiled from: ReefSignalGsmDetails.kt */
/* loaded from: classes5.dex */
public final class rof0 {
    public final Integer a;
    public final Integer b;

    public rof0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rof0)) {
            return false;
        }
        rof0 rof0Var = (rof0) obj;
        return epx.f(this.a, rof0Var.a) && epx.f(this.b, rof0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ReefSignalGsmDetails(bitErrorRate=" + this.a + ", timingAdvance=" + this.b + ")";
    }

    public rof0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
