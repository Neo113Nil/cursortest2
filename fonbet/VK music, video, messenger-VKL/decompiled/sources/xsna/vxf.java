package xsna;

import com.vk.dto.common.Peer;

/* compiled from: CnvMsgIsListenedChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class vxf extends e500 {
    public final w2w c;
    public final Peer d;
    public final int e;
    public final boolean f;

    public vxf(w2w w2wVar, Peer peer, int i, boolean z) {
        super("CnvMsgIsListenedChangeLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = i;
        this.f = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        d040 o = this.c.I0().o();
        Peer peer = this.d;
        Integer a0 = o.a0(this.e, peer.b);
        if (a0 != null) {
            z300Var.j(a0.intValue(), peer.b);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().o().K0(this.e, this.d.b, this.f);
    }
}
