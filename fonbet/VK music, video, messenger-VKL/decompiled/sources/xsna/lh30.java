package xsna;

import com.vk.dto.common.id.UserId;
import xsna.t28;

/* compiled from: MsgBotBtnSendEventApiCmd.kt */
/* loaded from: classes2.dex */
public final class lh30 extends nx2<String> {
    public final t28 b;

    public lh30(t28 t28Var) {
        this.b = t28Var;
    }

    @Override // xsna.nx2
    public final String f(l7r0 l7r0Var) {
        t28 t28Var = this.b;
        String str = t28Var.b;
        UserId userId = new UserId(t28Var.a.b);
        UserId b = t28Var instanceof t28.a ? com.vk.dto.common.a.b(((t28.a) t28Var).c) : null;
        Integer valueOf = t28Var instanceof t28.b ? Integer.valueOf(((t28.b) t28Var).c) : null;
        tfx tfxVar = new tfx("messages.sendMessageEvent", new lq(23), new tq(18));
        tfx.n(tfxVar, "peer_id", userId, 0L, 0L, 12);
        if (b != null) {
            tfx.n(tfxVar, "author_id", b, 0L, 0L, 12);
        }
        if (valueOf != null) {
            tfx.l(tfxVar, "cmid", valueOf.intValue(), 0, 0, 8);
        }
        if (str != null) {
            tfx.o(tfxVar, "payload", str, 0, 1000, 4);
            tfxVar = tfxVar;
        }
        return (String) bz2.l(tfxVar, false);
    }
}
