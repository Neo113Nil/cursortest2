package xsna;

/* compiled from: ReefNoGuaranteedSignalInfo.kt */
/* loaded from: classes5.dex */
public final class eof0 {
    public final Integer a;
    public final Integer b;

    public eof0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eof0)) {
            return false;
        }
        eof0 eof0Var = (eof0) obj;
        return epx.f(this.a, eof0Var.a) && epx.f(this.b, eof0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ReefNoGuaranteedSignalInfo(rssi=" + this.a + ", rscp=" + this.b + ")";
    }

    public eof0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }
}
