package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelTitleChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class kdb extends e500 {
    public final w2w c;
    public final String d;
    public final long e;

    public kdb(w2w w2wVar, Peer peer, String str) {
        super("ChannelTitleChangeLpTask");
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
        this.c.I0().a().T(this.e, this.d);
    }
}
