package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogIsNewStateChangedLpTask.kt */
/* loaded from: classes2.dex */
public final class yfm extends e500 {
    public final w2w c;
    public final Peer d;
    public final boolean e;
    public boolean f;

    public yfm(w2w w2wVar, Peer peer, boolean z) {
        super("DialogIsNewStateChangedLpTask");
        this.c = w2wVar;
        this.d = peer;
        this.e = z;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        if (this.f) {
            z300Var.g(this.d.b);
        }
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        w2w w2wVar = this.c;
        hpm c = sn.c(w2wVar);
        Peer peer = this.d;
        if (c.c(peer.b) == null) {
            return;
        }
        final hpm c2 = sn.c(w2wVar);
        final long j = peer.b;
        dhl0<com.vk.im.engine.models.dialogs.b, Long> dhl0Var = c2.c;
        Long valueOf = Long.valueOf(j);
        final boolean z = this.e;
        dhl0Var.a(valueOf, new izs() { // from class: xsna.yom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, z, false, null, null, 0, null, 0, -1, 2096639);
            }
        }, new izs() { // from class: xsna.zom
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                c2.b.b().execSQL("UPDATE dialogs SET is_new = ? WHERE id = ?", new Object[]{Integer.valueOf(z ? 1 : 0), Long.valueOf(j)});
                return s3q0.a;
            }
        });
        this.f = true;
    }
}
