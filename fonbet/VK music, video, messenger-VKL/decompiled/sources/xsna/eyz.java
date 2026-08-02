package xsna;

/* compiled from: LocationSearchCustomAction.kt */
/* loaded from: classes5.dex */
public final class eyz {
    public final boolean a;
    public final String b;
    public final Integer c;
    public final boolean d;
    public final Integer e;

    public eyz() {
        this(31, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyz)) {
            return false;
        }
        eyz eyzVar = (eyz) obj;
        return this.a == eyzVar.a && epx.f(this.b, eyzVar.b) && epx.f(this.c, eyzVar.c) && this.d == eyzVar.d && epx.f(this.e, eyzVar.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int b = qoy.b((hashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        Integer num2 = this.e;
        return b + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationSearchCustomAction(isInProgress=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", subtitleResId=");
        sb.append(this.c);
        sb.append(", isMultilineSubtitle=");
        sb.append(this.d);
        sb.append(", actionTitleResId=");
        return uqi.b(sb, this.e, ')');
    }

    public eyz(int i, Integer num, Integer num2, String str) {
        boolean z = (i & 1) == 0;
        str = (i & 2) != 0 ? null : str;
        num = (i & 4) != 0 ? null : num;
        boolean z2 = (i & 8) != 0;
        num2 = (i & 16) != 0 ? null : num2;
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = z2;
        this.e = num2;
    }
}
