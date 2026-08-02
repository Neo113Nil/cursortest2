package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import xsna.nd20;

/* compiled from: CreateCasperChatCmd.kt */
/* loaded from: classes2.dex */
public final class q6k extends le6<DialogExt> {
    public final Peer b;

    public q6k(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.le6
    public final DialogExt e(w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        Peer peer = this.b;
        long j = peer.b;
        com.vk.im.engine.models.dialogs.b c2 = c.c(j);
        ChatSettings chatSettings = c2 != null ? c2.z : null;
        if (c2 == null) {
            throw new IllegalArgumentException(qlb0.a(j, "Dialog ", " not found"));
        }
        long j2 = c2.b;
        if (chatSettings == null) {
            throw new IllegalArgumentException(qlb0.a(j, "Dialog ", " is not a chat"));
        }
        if (!chatSettings.t) {
            throw new IllegalArgumentException(qlb0.a(j, "Dialog ", " cannot be copied"));
        }
        Peer peer2 = ((nd20.b) bz2.c(new nd20(new nd20.a.C3397a(peer, chatSettings.b)), null)).a;
        c.c.a(Long.valueOf(j2), new y90(24), new bjk(c, 1));
        w2wVar.S0().V(j2);
        return ((ipm) w2wVar.J0(this, new uqm(new sqm(peer2, Source.ACTUAL, false, (Object) null, 24))).await()).a(peer2.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6k) && epx.f(this.b, ((q6k) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "CreateCasperChatCmd(peer=" + this.b + ", awaitNetwork=false)";
    }
}
