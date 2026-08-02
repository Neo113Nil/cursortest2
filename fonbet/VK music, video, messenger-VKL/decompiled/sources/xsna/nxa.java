package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelDeleteApiCmd.kt */
/* loaded from: classes2.dex */
public final class nxa extends nx2<Boolean> {
    public final Peer b;
    public final boolean c = true;

    public nxa(Peer peer) {
        this.b = peer;
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final Boolean f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("channels.delete", new pn(10), new mr(10));
        tfx.n(tfxVar, "channel_id", b, 0L, -1L, 4);
        return Boolean.valueOf(((BaseBoolIntDto) bz2.l(tfxVar, this.c)) == BaseBoolIntDto.YES);
    }
}
