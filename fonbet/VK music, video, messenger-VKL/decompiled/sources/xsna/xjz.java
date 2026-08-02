package xsna;

/* compiled from: LiveNotificationButtonUi.kt */
/* loaded from: classes7.dex */
public final class xjz {
    public final String a;
    public final Integer b;
    public final boolean c;

    public xjz() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjz)) {
            return false;
        }
        xjz xjzVar = (xjz) obj;
        return epx.f(this.a, xjzVar.a) && epx.f(this.b, xjzVar.b) && this.c == xjzVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveNotificationButtonUi(title=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", isUpcomingNotificationEnabled=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public xjz(String str, Integer num, boolean z) {
        this.a = str;
        this.b = num;
        this.c = z;
    }
}
