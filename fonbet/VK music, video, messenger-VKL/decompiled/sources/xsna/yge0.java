package xsna;

/* compiled from: PushAnalyticsEvent.kt */
/* loaded from: classes5.dex */
public final class yge0 {
    public final String a;
    public final String b;
    public final String c;

    public yge0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yge0)) {
            return false;
        }
        yge0 yge0Var = (yge0) obj;
        return epx.f(this.a, yge0Var.a) && epx.f(this.b, yge0Var.b) && epx.f(this.c, yge0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushAnalyticsEvent(source=");
        sb.append(this.a);
        sb.append(", instanceId=");
        sb.append(this.b);
        sb.append(", step=");
        return ho8.a(sb, this.c, ')');
    }
}
