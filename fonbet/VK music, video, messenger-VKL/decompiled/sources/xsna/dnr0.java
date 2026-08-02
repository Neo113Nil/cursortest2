package xsna;

/* compiled from: VerificationInfo.kt */
/* loaded from: classes5.dex */
public final class dnr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public dnr0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnr0)) {
            return false;
        }
        dnr0 dnr0Var = (dnr0) obj;
        return this.a == dnr0Var.a && this.b == dnr0Var.b && this.c == dnr0Var.c && this.d == dnr0Var.d && this.e == dnr0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerificationInfo(isVerified=");
        sb.append(this.a);
        sb.append(", isTrending=");
        sb.append(this.b);
        sb.append(", isOauthVerified=");
        sb.append(this.c);
        sb.append(", isPremiumBusiness=");
        sb.append(this.d);
        sb.append(", isConfirmedBusiness=");
        return defpackage.q0.a(sb, this.e, ')');
    }

    public /* synthetic */ dnr0(int i) {
        this(false, false, false, false, false);
    }

    public dnr0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }
}
