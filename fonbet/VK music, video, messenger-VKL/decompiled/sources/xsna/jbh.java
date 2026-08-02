package xsna;

/* compiled from: OpenFunctions.kt */
/* loaded from: classes17.dex */
public final class jbh {
    public final long a;
    public final String b;

    public jbh(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbh)) {
            return false;
        }
        jbh jbhVar = (jbh) obj;
        return this.a == jbhVar.a && epx.f(this.b, jbhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityNotificationSettingsGroup(id=");
        sb.append(this.a);
        sb.append(", name=");
        return ho8.a(sb, this.b, ')');
    }
}
