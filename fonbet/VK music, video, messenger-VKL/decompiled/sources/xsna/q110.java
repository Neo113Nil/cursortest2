package xsna;

/* compiled from: MarketItemExtendedAnalyticModel.kt */
/* loaded from: classes18.dex */
public final class q110 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final Long e;
    public final Float f;
    public final Integer g;
    public final Float h;

    public q110() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q110)) {
            return false;
        }
        q110 q110Var = (q110) obj;
        return epx.f(this.a, q110Var.a) && epx.f(this.b, q110Var.b) && epx.f(this.c, q110Var.c) && epx.f(this.d, q110Var.d) && epx.f(this.e, q110Var.e) && epx.f(this.f, q110Var.f) && epx.f(this.g, q110Var.g) && epx.f(this.h, q110Var.h);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.f;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num4 = this.g;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f2 = this.h;
        return hashCode7 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemExtendedAnalyticModel(orderId=");
        sb.append(this.a);
        sb.append(", itemsInPopup=");
        sb.append(this.b);
        sb.append(", itemNumberInPopup=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", productId=");
        sb.append(this.e);
        sb.append(", rateValue=");
        sb.append(this.f);
        sb.append(", rateCount=");
        sb.append(this.g);
        sb.append(", rate=");
        return so.b(sb, this.h, ')');
    }

    public q110(Integer num, Integer num2, Integer num3, Long l, Long l2, Float f, Integer num4, Float f2, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        l = (i & 8) != 0 ? null : l;
        l2 = (i & 16) != 0 ? null : l2;
        f = (i & 32) != 0 ? null : f;
        num4 = (i & 64) != 0 ? null : num4;
        f2 = (i & 128) != 0 ? null : f2;
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = l;
        this.e = l2;
        this.f = f;
        this.g = num4;
        this.h = f2;
    }
}
