package xsna;

/* compiled from: CheckoutState.kt */
/* loaded from: classes18.dex */
public final class gbk {
    public final Integer a;
    public final String b;
    public final Long c;

    public gbk(String str, Integer num, Long l) {
        this.a = num;
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbk)) {
            return false;
        }
        gbk gbkVar = (gbk) obj;
        return epx.f(this.a, gbkVar.a) && epx.f(this.b, gbkVar.b) && epx.f(this.c, gbkVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreatedOrderContactInfo(orderId=");
        sb.append(this.a);
        sb.append(", displayOrderId=");
        sb.append(this.b);
        sb.append(", sellerContactId=");
        return iq.b(sb, this.c, ')');
    }
}
