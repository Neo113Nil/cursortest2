package xsna;

/* compiled from: OverlayVisibilityMappingData.kt */
/* loaded from: classes17.dex */
public final class o390 {
    public final jxk0 a;
    public final ixp0 b;

    public o390(jxk0 jxk0Var, ixp0 ixp0Var) {
        this.a = jxk0Var;
        this.b = ixp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o390)) {
            return false;
        }
        o390 o390Var = (o390) obj;
        return epx.f(this.a, o390Var.a) && epx.f(this.b, o390Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OverlayVisibilityMappingData(staticAdsState=" + this.a + ", uiVisibilityConfig=" + this.b + ')';
    }
}
