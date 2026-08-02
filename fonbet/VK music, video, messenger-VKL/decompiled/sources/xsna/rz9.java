package xsna;

/* compiled from: CastConfigData.kt */
/* loaded from: classes11.dex */
public final class rz9 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final boolean d;

    public rz9() {
        this(null, null, null, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz9)) {
            return false;
        }
        rz9 rz9Var = (rz9) obj;
        return epx.f(this.a, rz9Var.a) && epx.f(this.b, rz9Var.b) && epx.f(this.c, rz9Var.c) && this.d == rz9Var.d;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder a = wr.a(this.a, "CastConfigData(expandedControlsCastDrawableResId=", this.b, ", expandedControlsCastDrawableTintResId=", ", expandedControlsCastThemeId=");
        a.append(this.c);
        a.append(", isExpandedControlsActivityEnabled=");
        a.append(this.d);
        a.append(")");
        return a.toString();
    }

    public rz9(Integer num, Integer num2, Integer num3, boolean z) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = z;
    }
}
