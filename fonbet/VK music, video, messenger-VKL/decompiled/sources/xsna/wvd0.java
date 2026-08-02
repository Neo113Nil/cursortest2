package xsna;

/* compiled from: ProfileDonutInfo.kt */
/* loaded from: classes7.dex */
public final class wvd0 {
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;

    public wvd0(boolean z, Boolean bool, Boolean bool2, Boolean bool3) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvd0)) {
            return false;
        }
        wvd0 wvd0Var = (wvd0) obj;
        return this.a == wvd0Var.a && epx.f(this.b, wvd0Var.b) && epx.f(this.c, wvd0Var.c) && epx.f(this.d, wvd0Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        return hashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileDonutInfo(isAvailable=");
        sb.append(this.a);
        sb.append(", isRegularEnabled=");
        sb.append(this.b);
        sb.append(", isOneTimeEnabled=");
        sb.append(this.c);
        sb.append(", isGoalsEnabled=");
        return tn.a(sb, this.d, ')');
    }
}
