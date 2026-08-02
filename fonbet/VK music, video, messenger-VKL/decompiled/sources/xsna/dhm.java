package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMemberMaxLpTask.kt */
/* loaded from: classes2.dex */
public final class dhm extends e500 {
    public final w2w c;
    public final Peer d;
    public final Peer e;

    public dhm(w2w w2wVar, Peer peer, Peer peer2) {
        super("DialogMemberMaxLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = peer2;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        hpm c = sn.c(this.c);
        long j = this.d.b;
        c.c.a(Long.valueOf(j), new u4e(this.e, 9), new yad(c, 20));
    }
}
