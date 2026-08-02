package xsna;

import com.vk.inappreview.InAppReviewConditionKey;

/* compiled from: SetMsgMyReactionCmd.kt */
/* loaded from: classes2.dex */
public final class uyi0 extends xl6<s3q0> {
    public final long b;
    public final int c;
    public final int d;
    public final Integer e;
    public final String f;

    public uyi0(long j, int i, int i2, Integer num, String str) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = num;
        this.f = str;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-reactions-send";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        w2wVar.J0(this, new vyi0(this.b, this.c, this.d, this.e, (Integer) ((it80) w2wVar.b1(this, new wyi0(this.b, this.c, this.d, this.e))).a, this.f));
        if (this.e != null && !o25.b(o25.a())) {
            itg0.j(fsk.c.b(InAppReviewConditionKey.SEND_IM_REACTIONS, jgp.b), null, 3);
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyi0)) {
            return false;
        }
        uyi0 uyi0Var = (uyi0) obj;
        return this.b == uyi0Var.b && this.c == uyi0Var.c && this.d == uyi0Var.d && epx.f(this.e, uyi0Var.e) && epx.f(this.f, uyi0Var.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        return this.f.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetMsgMyReactionCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", reactionId=");
        sb.append(this.e);
        sb.append(", source=");
        return ho8.a(sb, this.f, ')');
    }
}
