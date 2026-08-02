package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMembersInvalidateLpTask.kt */
/* loaded from: classes2.dex */
public final class khm extends e500 {
    public final w2w c;
    public final long d;

    public khm(w2w w2wVar, Peer peer) {
        super("DialogMembersInvalidateLpTask");
        this.c = w2wVar;
        this.d = peer.b;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        sn.c(this.c).g0(this.d);
    }
}
