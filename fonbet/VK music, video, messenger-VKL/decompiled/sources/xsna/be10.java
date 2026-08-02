package xsna;

/* compiled from: MarketSettingsModel.kt */
/* loaded from: classes18.dex */
public final class be10 {
    public final Integer a;
    public final Integer b;

    public be10(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be10)) {
            return false;
        }
        be10 be10Var = (be10) obj;
        return epx.f(this.a, be10Var.a) && epx.f(this.b, be10Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSettingsModel(albumsCount=");
        sb.append(this.a);
        sb.append(", albumsLimit=");
        return uqi.b(sb, this.b, ')');
    }
}
