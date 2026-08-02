package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelMembersCountChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class p1b extends e500 {
    public final w2w c;
    public final int d;
    public final long e;

    public p1b(w2w w2wVar, Peer peer, int i) {
        super("ChannelMembersCountChangeLpTask");
        this.c = w2wVar;
        this.d = i;
        this.e = peer.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.e);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().a().n(this.d, this.e);
    }
}
