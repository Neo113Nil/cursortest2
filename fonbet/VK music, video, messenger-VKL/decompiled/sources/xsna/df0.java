package xsna;

/* compiled from: AdEnvironment.kt */
/* loaded from: classes6.dex */
public final class df0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public df0(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = str2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df0)) {
            return false;
        }
        df0 df0Var = (df0) obj;
        return epx.f(this.a, df0Var.a) && this.b == df0Var.b && this.c == df0Var.c && epx.f(this.d, df0Var.d) && this.e == df0Var.e && this.f == df0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.f) + qoy.b(urd0.a(shy.a(this.c, qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdEnvironment(vkId=");
        sb.append(this.a);
        sb.append(", isUserFemale=");
        sb.append(this.b);
        sb.append(", userAge=");
        sb.append(this.c);
        sb.append(", appId=");
        sb.append(this.d);
        sb.append(", testModeEnabled=");
        sb.append(this.e);
        sb.append(", isWhiteListInternetEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
