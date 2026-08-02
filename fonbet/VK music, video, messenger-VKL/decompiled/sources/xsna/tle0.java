package xsna;

/* compiled from: PushTokenTuple.kt */
/* loaded from: classes5.dex */
public final class tle0 {
    public final String a;
    public final String b;
    public final Long c;

    public tle0(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tle0)) {
            return false;
        }
        tle0 tle0Var = (tle0) obj;
        return epx.f(this.a, tle0Var.a) && epx.f(this.b, tle0Var.b) && epx.f(this.c, tle0Var.c);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return a + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushTokenTuple(projectId=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", invalidatedAt=");
        return iq.b(sb, this.c, ')');
    }
}
