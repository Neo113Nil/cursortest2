package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: CnvMsgUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class dyf implements e900 {
    public final Peer a;
    public final int b;
    public final Msg c;
    public final Integer d;
    public final Integer e;

    public dyf(Peer peer, int i, Msg msg, Integer num, Integer num2) {
        this.a = peer;
        this.b = i;
        this.c = msg;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyf)) {
            return false;
        }
        dyf dyfVar = (dyf) obj;
        return epx.f(this.a, dyfVar.a) && this.b == dyfVar.b && epx.f(this.c, dyfVar.c) && epx.f(this.d, dyfVar.d) && epx.f(this.e, dyfVar.e);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        Msg msg = this.c;
        int hashCode = (a + (msg == null ? 0 : msg.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgUpdateLpEvent(dialogPeer=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", msg=");
        sb.append(this.c);
        sb.append(", replyCnvMsgId=");
        sb.append(this.d);
        sb.append(", linkedCmid=");
        return uqi.b(sb, this.e, ')');
    }
}
