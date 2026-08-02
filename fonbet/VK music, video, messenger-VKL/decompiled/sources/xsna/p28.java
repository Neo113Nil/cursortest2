package xsna;

/* compiled from: BotBtnDisableCmd.kt */
/* loaded from: classes2.dex */
public final class p28 extends xl6<s3q0> {
    public final String b;
    public final String c;

    public p28(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-bot-buttons-update";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ls8 s = w2wVar.I0().s();
        String str = this.b;
        pq8 d = s.d(str);
        if (d != null) {
            w2wVar.b1(this, new s28(d, false, str, this.c));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p28)) {
            return false;
        }
        p28 p28Var = (p28) obj;
        return epx.f(this.b, p28Var.b) && epx.f(this.c, p28Var.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("BotBtnDisableCmd(eventId=");
        sb.append(this.b);
        sb.append(", tag=");
        return ho8.a(sb, this.c, ')');
    }
}
