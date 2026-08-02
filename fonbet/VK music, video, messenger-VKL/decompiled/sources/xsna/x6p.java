package xsna;

import com.vk.dto.common.Peer;
import java.util.HashSet;

/* compiled from: EduRolesUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class x6p extends e500 {
    public final w2w c;
    public final Peer d;

    public x6p(w2w w2wVar, Peer peer) {
        super("EduRolesUpdateLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        if (z300Var.W == null) {
            z300Var.W = new HashSet();
        }
        z300Var.W.add(peer);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().q().a(this.d.d);
    }
}
