package xsna;

/* compiled from: ReefError.kt */
/* loaded from: classes5.dex */
public final class jnf0 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public jnf0(String str, long j, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnf0)) {
            return false;
        }
        jnf0 jnf0Var = (jnf0) obj;
        return this.a.equals(jnf0Var.a) && this.b == jnf0Var.b && this.c.equals(jnf0Var.c) && epx.f(this.d, jnf0Var.d) && this.e == jnf0Var.e && epx.f(this.f, jnf0Var.f) && epx.f(this.g, jnf0Var.g) && epx.f(this.h, jnf0Var.h) && epx.f(this.i, jnf0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + urd0.a(urd0.a(urd0.a(shy.a(this.e, (((this.d.hashCode() + urd0.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31) + 1446786138) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder d = rqi.d(this.b, "ReefError(message=", this.a, ", timestamp=");
        n6j.b(d, ", userId=", this.c, ", deviceId=", this.d);
        d.append(", sdkVersion=1.0.21, osVersion=");
        d.append(this.e);
        d.append(", appId=");
        d.append(this.f);
        n6j.b(d, ", appVersionName=", this.g, ", appBuildNumber=", this.h);
        return tdj.a(d, ", buildType=", this.i, ")");
    }
}
