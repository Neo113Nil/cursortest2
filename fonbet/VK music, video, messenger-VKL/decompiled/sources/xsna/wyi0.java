package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.MsgReaction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SetMsgMyReactionLocallyCmd.kt */
/* loaded from: classes2.dex */
public final class wyi0 extends xl6<it80<Integer>> {
    public final long b;
    public final int c;
    public final int d;
    public final Integer e;

    public wyi0(long j, int i, int i2, Integer num) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = num;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-reactions-send";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ArrayList y;
        d040 o = w2wVar.I0().o();
        int i = this.c;
        long j = this.b;
        bux0 D = o.D(i, j);
        if (D == null) {
            it80.b.getClass();
            return new it80(Integer.MIN_VALUE);
        }
        Integer num = D.c;
        Integer num2 = this.e;
        if (epx.f(num, num2)) {
            return new it80(D.c);
        }
        if (num2 != null) {
            List<? extends MsgReaction> list = D.b;
            Peer a = mq9.a(w2wVar);
            Integer num3 = D.c;
            y = p490.i(list, a, num3 != null ? num3.intValue() : -1, num2.intValue());
        } else {
            List<? extends MsgReaction> list2 = D.b;
            Peer a2 = mq9.a(w2wVar);
            Integer num4 = D.c;
            y = p490.y(list2, a2, Integer.valueOf(num4 != null ? num4.intValue() : -1));
        }
        w2wVar.I0().o().I(this.b, this.c, this.e, y);
        w2wVar.e1(this, new p980("SetMsgMyReactionLocallyCmd", j, this.d));
        return new it80(D.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyi0)) {
            return false;
        }
        wyi0 wyi0Var = (wyi0) obj;
        return this.b == wyi0Var.b && this.c == wyi0Var.c && this.d == wyi0Var.d && epx.f(this.e, wyi0Var.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.d, shy.a(this.c, Long.hashCode(this.b) * 31, 31), 31);
        Integer num = this.e;
        return a + (num == null ? 0 : num.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("SetMsgMyReactionLocallyCmd(dialogId=");
        sb.append(this.b);
        sb.append(", cnvMsgId=");
        sb.append(this.c);
        sb.append(", msgLocalId=");
        sb.append(this.d);
        sb.append(", reactionId=");
        return uqi.b(sb, this.e, ')');
    }
}
