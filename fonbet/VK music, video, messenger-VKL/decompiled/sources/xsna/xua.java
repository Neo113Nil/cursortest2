package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelCanPostDonutChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class xua extends e500 {
    public final w2w c;
    public final boolean d;
    public final long e;

    public xua(w2w w2wVar, Peer peer, boolean z) {
        super("ChannelCanPostDonutChangeLpTask");
        this.c = w2wVar;
        this.d = z;
        this.e = peer.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.e);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().a().X(this.e, this.d);
    }
}
