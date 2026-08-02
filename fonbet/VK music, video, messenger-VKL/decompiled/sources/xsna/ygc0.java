package xsna;

/* compiled from: PostingMarketPickerTechMetrics.kt */
/* loaded from: classes3.dex */
public final class ygc0 {
    public final Long a;
    public final Long b;

    public ygc0(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygc0)) {
            return false;
        }
        ygc0 ygc0Var = (ygc0) obj;
        return epx.f(this.a, ygc0Var.a) && epx.f(this.b, ygc0Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingMarketPickerTechMetrics(interactElapsedTime=");
        sb.append(this.a);
        sb.append(", pickElapsedTime=");
        return iq.b(sb, this.b, ')');
    }
}
