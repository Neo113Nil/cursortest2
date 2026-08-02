package xsna;

/* compiled from: EasterEggPositionAppearance.kt */
/* loaded from: classes18.dex */
public final class puo {
    public final Boolean a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public puo(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puo)) {
            return false;
        }
        puo puoVar = (puo) obj;
        return epx.f(this.a, puoVar.a) && epx.f(this.b, puoVar.b) && epx.f(this.c, puoVar.c) && epx.f(this.d, puoVar.d) && epx.f(this.e, puoVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasterEggPositionAppearance(fixed=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", left=");
        sb.append(this.c);
        sb.append(", right=");
        sb.append(this.d);
        sb.append(", bottom=");
        return uqi.b(sb, this.e, ')');
    }
}
