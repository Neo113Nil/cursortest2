package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.MsgRequestStatus;

/* compiled from: DialogMsgRequestValueChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class yhm implements e900 {
    public final Peer a;
    public final MsgRequestStatus b;

    public yhm(Peer peer, MsgRequestStatus msgRequestStatus) {
        this.a = peer;
        this.b = msgRequestStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhm)) {
            return false;
        }
        yhm yhmVar = (yhm) obj;
        return epx.f(this.a, yhmVar.a) && this.b == yhmVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        return "DialogMsgRequestValueChangeLpEvent(dialog=" + this.a + ", status=" + this.b + ')';
    }
}
