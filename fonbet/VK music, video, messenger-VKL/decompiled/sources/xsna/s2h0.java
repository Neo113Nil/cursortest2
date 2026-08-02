package xsna;

/* compiled from: SbpLaunchInfo.kt */
/* loaded from: classes4.dex */
public final class s2h0 implements q2h0 {
    public final String a;
    public final String b;

    public s2h0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2h0)) {
            return false;
        }
        s2h0 s2h0Var = (s2h0) obj;
        return epx.f(this.a, s2h0Var.a) && epx.f(this.b, s2h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SbpAppLaunchInfoIntent(packageName=");
        sb.append(this.a);
        sb.append(", activityName=");
        return ho8.a(sb, this.b, ')');
    }
}
