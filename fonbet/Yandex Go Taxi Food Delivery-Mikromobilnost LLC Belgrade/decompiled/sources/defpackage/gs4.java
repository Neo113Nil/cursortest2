package defpackage;

/* loaded from: classes5.dex */
public final class gs4 extends s151 {
    public final Object a;
    public final String b;

    public gs4(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs4)) {
            return false;
        }
        gs4 gs4Var = (gs4) obj;
        return jl40.l(this.a, gs4Var.a) && jl40.l(this.b, gs4Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(false) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "BannerCarouselWidgetModel(meta=" + this.a + ", metricaLabel=" + this.b + ", showWhenSectionCollapsed=false)";
    }
}
