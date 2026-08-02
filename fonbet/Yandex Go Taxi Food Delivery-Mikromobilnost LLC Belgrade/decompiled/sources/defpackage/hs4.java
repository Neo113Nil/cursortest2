package defpackage;

/* loaded from: classes5.dex */
public final class hs4 extends n351 {
    public final Object c;
    public final String d;

    public hs4(Object obj, String str) {
        super("banner-carousel", false, 14);
        this.c = obj;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs4)) {
            return false;
        }
        hs4 hs4Var = (hs4) obj;
        return jl40.l(this.c, hs4Var.c) && jl40.l(this.d, hs4Var.d);
    }

    public final int hashCode() {
        Object obj = this.c;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.d;
        return Boolean.hashCode(false) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "BannerCarouselWidgetState(meta=" + this.c + ", metricaLabel=" + this.d + ", showWhenSectionCollapsed=false)";
    }
}
