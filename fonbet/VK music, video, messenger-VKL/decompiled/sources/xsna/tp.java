package xsna;

/* compiled from: AccountPhoneVerify.kt */
/* loaded from: classes18.dex */
public final class tp {
    public final String a;
    public final String b;
    public final int c;

    public tp() {
        String str = new String();
        String str2 = new String();
        this.a = str;
        this.b = str2;
        this.c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return epx.f(this.a, tpVar.a) && epx.f(this.b, tpVar.b) && this.c == tpVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPhoneVerify(phoneMask=");
        sb.append(this.a);
        sb.append(", phoneVerifySid=");
        sb.append(this.b);
        sb.append(", phoneVerifyDelaySec=");
        return vu5.b(sb, this.c, ')');
    }
}
