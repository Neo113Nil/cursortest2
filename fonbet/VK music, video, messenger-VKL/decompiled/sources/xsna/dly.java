package xsna;

/* compiled from: MarketItemModalApproveInfoModel.kt */
/* loaded from: classes18.dex */
public final class dly {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public dly(String str, String str2, Integer num, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dly)) {
            return false;
        }
        dly dlyVar = (dly) obj;
        return epx.f(this.a, dlyVar.a) && epx.f(this.b, dlyVar.b) && epx.f(this.c, dlyVar.c) && epx.f(this.d, dlyVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelIcon(lightUrl=");
        sb.append(this.a);
        sb.append(", darkUrl=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        return uqi.b(sb, this.d, ')');
    }
}
