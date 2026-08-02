package xsna;

/* compiled from: MarketPickerTechMetrics.kt */
/* loaded from: classes18.dex */
public final class na10 {
    public final Long a;
    public final Long b;

    public na10(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na10)) {
            return false;
        }
        na10 na10Var = (na10) obj;
        return epx.f(this.a, na10Var.a) && epx.f(this.b, na10Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketPickerTechMetrics(interactElapsedTime=");
        sb.append(this.a);
        sb.append(", pickElapsedTime=");
        return iq.b(sb, this.b, ')');
    }
}
