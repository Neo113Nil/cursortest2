package xsna;

/* compiled from: VoipIncomingCallInfo.kt */
/* loaded from: classes7.dex */
public final class fqw0 {
    public final zqk0 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;

    public fqw0(zqk0 zqk0Var, String str, String str2, boolean z, String str3, boolean z2, String str4) {
        this.a = zqk0Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqw0)) {
            return false;
        }
        fqw0 fqw0Var = (fqw0) obj;
        return epx.f(this.a, fqw0Var.a) && epx.f(this.b, fqw0Var.b) && epx.f(this.c, fqw0Var.c) && this.d == fqw0Var.d && epx.f(this.e, fqw0Var.e) && this.f == fqw0Var.f && epx.f(this.g, fqw0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + qoy.b(urd0.a(qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipIncomingCallInfo(info=");
        sb.append(this.a);
        sb.append(", ownId=");
        sb.append(this.b);
        sb.append(", opponentId=");
        sb.append(this.c);
        sb.append(", isVideo=");
        sb.append(this.d);
        sb.append(", conversationParams=");
        sb.append(this.e);
        sb.append(", p2pForbidden=");
        sb.append(this.f);
        sb.append(", answerFromAsContact=");
        return ho8.a(sb, this.g, ')');
    }
}
