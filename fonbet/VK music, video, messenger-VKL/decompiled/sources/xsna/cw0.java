package xsna;

/* compiled from: AdsIntHideAdRequestParams.kt */
/* loaded from: classes4.dex */
public final class cw0 {
    public final String a;
    public final String b = "ad";
    public final Integer c;

    public cw0(String str, Integer num) {
        this.a = str;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw0)) {
            return false;
        }
        cw0 cw0Var = (cw0) obj;
        return epx.f(this.a, cw0Var.a) && epx.f(this.b, cw0Var.b) && epx.f(this.c, cw0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsIntHideAdRequestParams(adData=");
        sb.append(this.a);
        sb.append(", objectType=");
        sb.append(this.b);
        sb.append(", reasonId=");
        return uqi.b(sb, this.c, ')');
    }
}
