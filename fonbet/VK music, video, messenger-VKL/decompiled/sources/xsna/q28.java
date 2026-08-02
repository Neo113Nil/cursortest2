package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.PinnedMsg;
import kotlin.NoWhenBranchMatchedException;
import xsna.pq8;
import xsna.t28;

/* compiled from: BotBtnEventSendCmd.kt */
/* loaded from: classes2.dex */
public final class q28 extends le6<s3q0> {
    public final pq8 b;

    public q28(pq8 pq8Var) {
        this.b = pq8Var;
    }

    public static t28 f(w2w w2wVar, pq8 pq8Var) {
        BotKeyboard botKeyboard;
        BotButton botButton;
        BotButton Ca;
        d040 o = w2wVar.I0().o();
        hpm c = sn.c(w2wVar);
        if (pq8Var instanceof pq8.c) {
            pq8.c cVar = (pq8.c) pq8Var;
            Peer peer = cVar.b;
            Peer peer2 = cVar.b;
            int i = cVar.c;
            com.vk.im.engine.models.dialogs.b c2 = c.c(peer.b);
            if (c2 != null) {
                gtx0 t0 = o.t0(i, peer2.b);
                com.vk.im.engine.models.messages.a aVar = t0 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) t0 : null;
                if (aVar == null) {
                    PinnedMsg pinnedMsg = c2.t;
                    if (pinnedMsg == null || pinnedMsg.Z5() != i) {
                        pinnedMsg = null;
                    }
                    aVar = pinnedMsg != null ? new PinnedMsg(pinnedMsg) : null;
                }
                if (aVar != null && (Ca = aVar.Ca(pq8Var)) != null) {
                    return new t28.b(i, peer2, Ca.Cb());
                }
            }
        } else {
            if (!(pq8Var instanceof pq8.b)) {
                throw new NoWhenBranchMatchedException();
            }
            pq8.b bVar = (pq8.b) pq8Var;
            com.vk.im.engine.models.dialogs.b c3 = c.c(bVar.b.b);
            if (c3 != null && (botKeyboard = c3.D) != null && (botButton = (BotButton) j5g.b0(pq8Var.a, botKeyboard.g)) != null) {
                return new t28.a(bVar.b, botButton.Cb(), botButton.Ab());
            }
        }
        return null;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        ls8 s = w2wVar.I0().s();
        pq8 pq8Var = this.b;
        w2wVar.J0(this, new s28(pq8Var, true, null, "2"));
        try {
            t28 f = f(w2wVar, pq8Var);
            if (f != null) {
                String str = (String) bz2.c(new lh30(f), null);
                s.b(str, pq8Var);
                w2wVar.O0().a(new r28(str, 60000L));
            }
            return s3q0.a;
        } catch (Throwable th) {
            w2wVar.S0().e(th);
            w2wVar.J0(this, new s28(pq8Var, false, null, "3"));
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q28) && epx.f(this.b, ((q28) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "BotBtnEventSendCmd(buttonInfo=" + this.b + ')';
    }
}
