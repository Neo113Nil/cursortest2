package xsna;

/* compiled from: BannerCompanionState.kt */
/* loaded from: classes17.dex */
public final class o16 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public o16(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o16)) {
            return false;
        }
        o16 o16Var = (o16) obj;
        return epx.f(this.a, o16Var.a) && epx.f(this.b, o16Var.b) && epx.f(this.c, o16Var.c) && epx.f(this.d, o16Var.d) && epx.f(this.e, o16Var.e) && this.f == o16Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerCompanionData(imageUrl=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", age=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", buttonText=");
        sb.append(this.e);
        sb.append(", timerEnded=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
