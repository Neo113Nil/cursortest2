package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgScreenshot;
import java.util.Collections;
import java.util.List;

/* compiled from: MsgSendScreenshotNotifyCmd.kt */
/* loaded from: classes2.dex */
public final class yy30 extends le6<List<? extends Msg>> {
    public final Peer b;

    public yy30(Peer peer) {
        this.b = peer;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Illegal dialog value");
        }
    }

    @Override // xsna.le6
    public final List<? extends Msg> e(w2w w2wVar) {
        MsgScreenshot msgScreenshot = new MsgScreenshot();
        msgScreenshot.b = w2wVar.d1();
        msgScreenshot.d = 0;
        long j = this.b.b;
        msgScreenshot.c = j;
        msgScreenshot.f = w2wVar.R0();
        msgScreenshot.g = w2wVar.f1();
        msgScreenshot.h = w2wVar.H0();
        msgScreenshot.i = false;
        msgScreenshot.o = MsgSyncState.SENDING;
        msgScreenshot.u = cq.a(w2wVar);
        List<? extends Msg> list = (List) new oj30(Collections.singletonList(msgScreenshot), WeightStrategy.FORCE_LATEST, null).o(w2wVar);
        for (Msg msg : list) {
            w2wVar.O0().a(new zy30(msg.c, msg.b));
        }
        w2wVar.S0().x(j, list);
        w2wVar.S0().V(j);
        w2wVar.S0().o(this, "MsgSendScreenshotNotifyCmd", gkx0.e, 1);
        return list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yy30) && epx.f(this.b, ((yy30) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.b.b);
    }

    @Override // xsna.e1w
    public final String toString() {
        return eq.a(new StringBuilder("MsgSendScreenshotNotifyCmd(peer="), this.b, ')');
    }
}
