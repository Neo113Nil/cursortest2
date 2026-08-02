package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Peer;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import kotlin.NoWhenBranchMatchedException;
import xsna.pq8;

/* compiled from: BotBtnLoadingUpdateCmd.kt */
/* loaded from: classes2.dex */
public final class s28 extends xl6<s3q0> {
    public final pq8 b;
    public final boolean c;
    public final String d;
    public final String e;

    public s28(pq8 pq8Var, boolean z, String str, String str2) {
        this.b = pq8Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-bot-buttons-update";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        pq8 pq8Var = this.b;
        try {
            if (pq8Var instanceof pq8.c) {
                g(w2wVar, (pq8.c) pq8Var);
            } else {
                if (!(pq8Var instanceof pq8.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f(w2wVar, (pq8.b) pq8Var);
            }
            ls8 s = w2wVar.I0().s();
            if (this.c) {
                s.c(pq8Var);
            } else {
                s.e(this.d, pq8Var);
            }
            return s3q0.a;
        } catch (IndexOutOfBoundsException e) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Button type: " + pq8Var.a() + ", tag: " + this.e, e));
            throw new ApiArgNotFoundException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s28)) {
            return false;
        }
        s28 s28Var = (s28) obj;
        return epx.f(this.b, s28Var.b) && this.c == s28Var.c && epx.f(this.d, s28Var.d) && epx.f(this.e, s28Var.e);
    }

    public final void f(w2w w2wVar, pq8.b bVar) {
        BotKeyboard botKeyboard;
        hpm c = sn.c(w2wVar);
        Peer peer = bVar.b;
        com.vk.im.engine.models.dialogs.b c2 = c.c(peer.b);
        if (c2 == null || (botKeyboard = c2.D) == null) {
            return;
        }
        BotKeyboard zb = botKeyboard.zb();
        Parcelable parcelable = (BotButton) j5g.b0(bVar.a, zb.g);
        BotButton.a aVar = parcelable instanceof BotButton.a ? (BotButton.a) parcelable : null;
        if (aVar == null) {
            return;
        }
        aVar.setLoading(this.c);
        c.l0(peer.b, zb);
        w2wVar.S0().v(peer.b, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.vk.im.engine.models.messages.a] */
    public final void g(w2w w2wVar, pq8.c cVar) {
        d040 o = w2wVar.I0().o();
        hpm c = sn.c(w2wVar);
        Peer peer = cVar.b;
        int i = cVar.c;
        com.vk.im.engine.models.dialogs.b c2 = c.c(peer.b);
        if (c2 == null) {
            return;
        }
        long j = peer.b;
        long j2 = peer.b;
        gtx0 t0 = o.t0(i, j);
        ?? r2 = t0 instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) t0 : 0;
        if (r2 == 0) {
            PinnedMsg pinnedMsg = c2.t;
            if (pinnedMsg == null || pinnedMsg.Z5() != i) {
                pinnedMsg = null;
            }
            r2 = pinnedMsg != null ? new PinnedMsg(pinnedMsg) : 0;
        }
        Object Ca = r2 != 0 ? r2.Ca(cVar) : null;
        BotButton.a aVar = Ca instanceof BotButton.a ? (BotButton.a) Ca : null;
        if (aVar == null) {
            return;
        }
        aVar.setLoading(this.c);
        if (r2 instanceof PinnedMsg) {
            c.w(j2, (PinnedMsg) r2, c2.u);
            w2wVar.S0().V(j2);
        } else if (r2 instanceof Msg) {
            Msg msg = (Msg) r2;
            o.m(msg);
            w2wVar.S0().s(msg.b, this);
        }
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("BotBtnLoadingUpdateCmd(buttonPositionInfo=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", eventId=");
        sb.append(this.d);
        sb.append(", tag=");
        return ho8.a(sb, this.e, ')');
    }
}
