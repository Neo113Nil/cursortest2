package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChannelSortIdChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class xcb extends e500 {
    public final w2w c;
    public final Integer d;
    public final Integer e;
    public final hhb f;
    public final long g;

    public xcb(w2w w2wVar, Peer peer, Integer num, Integer num2) {
        super("ChannelSortIdChangeLpTask");
        this.c = w2wVar;
        this.d = num;
        this.e = num2;
        this.f = new hhb(w2wVar, peer);
        this.g = peer.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        this.f.a(c400Var, f400Var);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.c(this.g);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        g60 g60Var = new g60(this, 22);
        hhb hhbVar = this.f;
        hhbVar.a.I0().u(new w95(hhbVar, g60Var, c400Var, 2));
    }
}
