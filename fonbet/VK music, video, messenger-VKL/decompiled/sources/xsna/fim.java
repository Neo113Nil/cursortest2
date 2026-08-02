package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogOwnerUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class fim extends e500 {
    public final w2w c;
    public final Peer d;
    public final Peer e;

    public fim(w2w w2wVar, Peer peer, Peer peer2) {
        super("DialogOwnerUpdateLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = peer2;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        new qs20(this.c).a(this.e, c400Var, f400Var);
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        hpm c = sn.c(w2wVar);
        long j = this.d.b;
        Peer H0 = w2wVar.H0();
        Peer peer = this.e;
        c.c.a(Long.valueOf(j), new b9d(peer, epx.f(H0, peer), 1), new lwh(c, 4));
    }
}
