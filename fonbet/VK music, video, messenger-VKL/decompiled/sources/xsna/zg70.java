package xsna;

/* compiled from: NotificationSettingsPatch.kt */
/* loaded from: classes5.dex */
public final class zg70 implements ug70 {
    public final String b;
    public final int c;

    public zg70(String str, int i) {
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg70)) {
            return false;
        }
        zg70 zg70Var = (zg70) obj;
        return epx.f(this.b, zg70Var.b) && this.c == zg70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeSourcesCount(settingId=");
        sb.append(this.b);
        sb.append(", sourcesCount=");
        return vu5.b(sb, this.c, ')');
    }
}
