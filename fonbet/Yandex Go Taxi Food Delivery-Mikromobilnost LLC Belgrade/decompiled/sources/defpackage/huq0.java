package defpackage;

/* loaded from: classes13.dex */
public final class huq0 {
    public final String a;
    public final String b;

    public huq0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huq0)) {
            return false;
        }
        huq0 huq0Var = (huq0) obj;
        return jl40.l(this.a, huq0Var.a) && jl40.l(this.b, huq0Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 221134492;
    }

    public final String toString() {
        return unr0.p("AnalyticsData(tooltipId=", this.a, ", viewId=", this.b, ", screen=PRODUCTS)");
    }
}
