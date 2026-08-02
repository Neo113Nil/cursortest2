package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelCanCommentChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class vua extends e500 {
    public final w2w c;
    public final boolean d;
    public final long e;

    public vua(w2w w2wVar, Peer peer, boolean z) {
        super("ChannelCanCommentChangeLpTask");
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
        this.c.I0().a().J(this.e, this.d);
    }
}
