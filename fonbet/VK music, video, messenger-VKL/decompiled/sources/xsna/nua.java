package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelAvatarChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class nua extends e500 {
    public final w2w c;
    public final String d;
    public final long e;

    public nua(w2w w2wVar, Peer peer, String str) {
        super("ChannelAvatarChangeLpTask");
        this.c = w2wVar;
        this.d = str;
        this.e = peer.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.e);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().a().G(this.e, this.d);
    }
}
