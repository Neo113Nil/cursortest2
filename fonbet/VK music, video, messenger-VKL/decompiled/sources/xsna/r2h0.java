package xsna;

/* compiled from: SbpLaunchInfo.kt */
/* loaded from: classes4.dex */
public final class r2h0 implements q2h0 {
    public final String a;
    public final String b;

    public r2h0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2h0)) {
            return false;
        }
        r2h0 r2h0Var = (r2h0) obj;
        return epx.f(this.a, r2h0Var.a) && epx.f(this.b, r2h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SbpAppLaunchInfoDeeplink(packageName=");
        sb.append(this.a);
        sb.append(", deeplinkScheme=");
        return ho8.a(sb, this.b, ')');
    }
}
