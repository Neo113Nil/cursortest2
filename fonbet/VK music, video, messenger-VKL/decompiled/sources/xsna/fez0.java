package xsna;

@vby
/* loaded from: classes9.dex */
public final class fez0 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof fez0) {
            return epx.f(this.a, ((fez0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return air.b(')', "MetricsEventUuid(value=", this.a);
    }
}
