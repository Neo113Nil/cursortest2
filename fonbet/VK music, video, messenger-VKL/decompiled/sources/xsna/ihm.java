package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogMemberWritePermissionChangedLpTask.kt */
/* loaded from: classes2.dex */
public final class ihm extends e500 {
    public final w2w c;
    public final Peer d;
    public final Peer e;
    public final boolean f;

    public ihm(w2w w2wVar, Peer peer, Peer peer2, boolean z) {
        super("DialogMemberWritePermissionChangedLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = peer2;
        this.f = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        sn.c(this.c).E(this.d.b, this.e, this.f);
    }
}
