package defpackage;

/* loaded from: classes6.dex */
public final class gmu0 {
    public final Double a;
    public final Double b;
    public final Integer c;
    public final String d;

    public gmu0(Double d, Double d2, Integer num, String str) {
        this.a = d;
        this.b = d2;
        this.c = num;
        this.d = str;
    }

    public final Integer a() {
        return this.c;
    }

    public final Double b() {
        return this.a;
    }

    public final Double c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmu0)) {
            return false;
        }
        gmu0 gmu0Var = (gmu0) obj;
        return jl40.l(this.a, gmu0Var.a) && jl40.l(this.b, gmu0Var.b) && jl40.l(this.c, gmu0Var.c) && jl40.l(this.d, gmu0Var.d);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.c;
        return unr0.b((hashCode2 + (num != null ? num.hashCode() : 0)) * 961, 31, this.d);
    }

    public final String toString() {
        return "StoriesDownloadRequest(lat=" + this.a + ", lon=" + this.b + ", accuracy=" + this.c + ", tariffClassName=null, screenName=" + this.d + ", plusSubscriptionId=null)";
    }
}
