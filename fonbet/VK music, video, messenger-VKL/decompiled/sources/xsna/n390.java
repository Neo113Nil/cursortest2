package xsna;

/* compiled from: OverlayVisibilityMappingData.kt */
/* loaded from: classes17.dex */
public final class n390 {
    public final hr00 a;
    public final ixp0 b;

    public n390(hr00 hr00Var, ixp0 ixp0Var) {
        this.a = hr00Var;
        this.b = ixp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n390)) {
            return false;
        }
        n390 n390Var = (n390) obj;
        return epx.f(this.a, n390Var.a) && epx.f(this.b, n390Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OverlayVisibilityMappingData(marketAdsState=" + this.a + ", uiVisibilityConfig=" + this.b + ')';
    }
}
