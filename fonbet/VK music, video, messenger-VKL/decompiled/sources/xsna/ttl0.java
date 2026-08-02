package xsna;

/* compiled from: StoriesMyTargetAdData.kt */
/* loaded from: classes6.dex */
public final class ttl0 {
    public final zu50 a;
    public final i620 b;

    public ttl0(zu50 zu50Var, i620 i620Var) {
        this.a = zu50Var;
        this.b = i620Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttl0)) {
            return false;
        }
        ttl0 ttl0Var = (ttl0) obj;
        return epx.f(this.a, ttl0Var.a) && epx.f(this.b, ttl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StoriesMyTargetAdData(nativeAd=" + this.a + ", adChoicesController=" + this.b + ')';
    }
}
