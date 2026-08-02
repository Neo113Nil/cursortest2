package xsna;

/* compiled from: ProductCardMainInfoState.kt */
/* loaded from: classes18.dex */
public final class uqd0 {
    public final Float a;
    public final Integer b;
    public final String c;

    public uqd0(Float f, Integer num, String str) {
        this.a = f;
        this.b = num;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqd0)) {
            return false;
        }
        uqd0 uqd0Var = (uqd0) obj;
        return epx.f(this.a, uqd0Var.a) && epx.f(this.b, uqd0Var.b) && epx.f(this.c, uqd0Var.c);
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductMarketItemRating(rating=");
        sb.append(this.a);
        sb.append(", reviewsCount=");
        sb.append(this.b);
        sb.append(", reviewsCountText=");
        return ho8.a(sb, this.c, ')');
    }
}
