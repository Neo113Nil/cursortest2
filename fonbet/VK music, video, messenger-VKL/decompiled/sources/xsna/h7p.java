package xsna;

import com.vk.dto.common.Peer;
import java.util.HashSet;

/* compiled from: EduScheduleUpdateLpTask.kt */
/* loaded from: classes2.dex */
public final class h7p extends e500 {
    public final w2w c;
    public final Peer d;

    public h7p(w2w w2wVar, Peer peer) {
        super("EduScheduleLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Peer peer = this.d;
        if (z300Var.V == null) {
            z300Var.V = new HashSet();
        }
        z300Var.V.add(peer);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().h().a(this.d.d);
    }
}
