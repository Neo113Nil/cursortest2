package xsna;

/* compiled from: ReefSimInfo.kt */
/* loaded from: classes5.dex */
public final class uof0 {
    public final Integer a;
    public final Integer b;

    public uof0(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uof0)) {
            return false;
        }
        uof0 uof0Var = (uof0) obj;
        return epx.f(this.a, uof0Var.a) && epx.f(this.b, uof0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "ReefSimInfo(mcc=" + this.a + ", mnc=" + this.b + ")";
    }
}
