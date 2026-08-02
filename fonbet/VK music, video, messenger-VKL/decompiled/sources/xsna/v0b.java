package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelJoinLpTask.kt */
/* loaded from: classes2.dex */
public final class v0b extends e500 {
    public final w2w c;
    public final long d;
    public final lkb e;

    public v0b(w2w w2wVar, Peer peer) {
        super("ChannelJoinLpTask");
        this.c = w2wVar;
        this.d = peer.b;
        this.e = new lkb(w2wVar, peer, true, false);
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        this.e.a(c400Var, f400Var);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.b = Boolean.TRUE;
        z300Var.c(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.e.b(c400Var, new i50(this, 9));
    }
}
