package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogsCounters;

/* compiled from: DialogArchiveLpTask.kt */
/* loaded from: classes2.dex */
public final class cam extends e500 {
    public final w2w c;
    public final Peer d;

    public cam(w2w w2wVar, Peer peer) {
        super("DialogArchiveLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
        z300Var.f(DialogsCounters.Type.ARCHIVE_TOTAL, 1);
        z300Var.a = Boolean.TRUE;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new ifg(this, 6));
    }
}
