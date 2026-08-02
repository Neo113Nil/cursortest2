package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;

/* compiled from: ChannelLeaveApiCmd.kt */
/* loaded from: classes2.dex */
public final class x0b extends nx2<BaseBoolIntDto> {
    public final Peer b;
    public final boolean c = true;

    public x0b(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.nx2
    public final BaseBoolIntDto f(l7r0 l7r0Var) {
        UserId b = com.vk.dto.common.a.b(this.b);
        tfx tfxVar = new tfx("channels.leave", new or(7), new pr(8));
        tfx.n(tfxVar, "channel_id", b, 0L, -1L, 4);
        return (BaseBoolIntDto) l7r0Var.e(bz2.n(tfxVar, new yx0(this, 20)));
    }
}
