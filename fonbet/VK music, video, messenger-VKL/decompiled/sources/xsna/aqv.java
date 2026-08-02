package xsna;

/* compiled from: TabbarSettingsMainItem.kt */
/* loaded from: classes6.dex */
public final class aqv {
    public final Integer a;
    public final String b;
    public final Integer c;

    public aqv() {
        this(7, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqv)) {
            return false;
        }
        aqv aqvVar = (aqv) obj;
        return epx.f(this.a, aqvVar.a) && epx.f(this.b, aqvVar.b) && epx.f(this.c, aqvVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconData(iconRes=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", counter=");
        return uqi.b(sb, this.c, ')');
    }

    public aqv(int i, Integer num, Integer num2, String str) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        num2 = (i & 4) != 0 ? null : num2;
        this.a = num;
        this.b = str;
        this.c = num2;
    }
}
