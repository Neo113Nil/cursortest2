package xsna;

/* compiled from: VoipAnonymousUserInfo.kt */
/* loaded from: classes7.dex */
public final class xdw0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public xdw0(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
    }

    public static xdw0 a(xdw0 xdw0Var, String str, String str2, int i) {
        String str3 = xdw0Var.a;
        String str4 = xdw0Var.b;
        if ((i & 4) != 0) {
            str = xdw0Var.c;
        }
        String str5 = str;
        String str6 = xdw0Var.d;
        String str7 = xdw0Var.e;
        String str8 = xdw0Var.f;
        if ((i & 64) != 0) {
            str2 = xdw0Var.g;
        }
        boolean z = xdw0Var.h;
        xdw0Var.getClass();
        return new xdw0(str3, str4, str5, z, str6, str7, str8, str2);
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdw0)) {
            return false;
        }
        xdw0 xdw0Var = (xdw0) obj;
        return epx.f(this.a, xdw0Var.a) && epx.f(this.b, xdw0Var.b) && epx.f(this.c, xdw0Var.c) && epx.f(this.d, xdw0Var.d) && epx.f(this.e, xdw0Var.e) && epx.f(this.f, xdw0Var.f) && epx.f(this.g, xdw0Var.g) && this.h == xdw0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipAnonymousUserInfo(okUserId=");
        sb.append(this.a);
        sb.append(", vkUserId=");
        sb.append(this.b);
        sb.append(", userName=");
        sb.append(this.c);
        sb.append(", joinLink=");
        sb.append(this.d);
        sb.append(", callToken=");
        sb.append(this.e);
        sb.append(", apiBaseUrl=");
        sb.append(this.f);
        sb.append(", secretHash=");
        sb.append(this.g);
        sb.append(", isEduAccount=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
