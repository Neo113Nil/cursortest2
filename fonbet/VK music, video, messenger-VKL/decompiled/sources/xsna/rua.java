package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import java.util.HashSet;

/* compiled from: ChannelBanInfoChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class rua extends e500 {
    public final w2w c;
    public final Peer d;
    public final ChannelBanInfo e;
    public final long f;

    public rua(w2w w2wVar, Peer peer, Peer peer2, ChannelBanInfo channelBanInfo) {
        super("ChannelBanInfoChangeLpTask");
        this.c = w2wVar;
        this.d = peer2;
        this.e = channelBanInfo;
        this.f = peer.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (epx.f(this.d, this.c.H0())) {
            z300Var.c(this.f);
            Long valueOf = Long.valueOf(this.f);
            if (z300Var.T == null) {
                z300Var.T = new HashSet();
            }
            z300Var.T.add(valueOf);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        if (epx.f(this.d, w2wVar.H0())) {
            w2wVar.I0().a().a0(this.f, this.e);
        }
    }
}
