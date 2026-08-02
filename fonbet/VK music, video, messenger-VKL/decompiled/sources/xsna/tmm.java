package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import kotlin.NoWhenBranchMatchedException;
import xsna.umm;

/* compiled from: DialogWriteRestrictionChangedLpTask.kt */
/* loaded from: classes2.dex */
public final class tmm extends e500 {
    public final w2w c;
    public final umm.a d;
    public final long e;

    public tmm(w2w w2wVar, Peer peer, umm.a aVar) {
        super("DialogWriteRestrictionChangedLpTask");
        this.c = w2wVar;
        this.d = aVar;
        this.e = peer.b;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        if (this.d instanceof umm.a.b) {
            p4g.a(Long.valueOf(this.e), f400Var.c, !c400Var.d.containsKey(Long.valueOf(r0)));
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.e);
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        umm.a aVar = this.d;
        boolean z = aVar instanceof umm.a.b;
        w2w w2wVar = this.c;
        long j = this.e;
        if (z) {
            new wfm((com.vk.im.engine.models.dialogs.a) pn00.h(Long.valueOf(j), c400Var.d), null).o(w2wVar);
        } else if (aVar instanceof umm.a.C3809a) {
            w2wVar.I0().b().e().o(j, new WritePermission(WritePermission.State.DISABLED_RESTRICTED, -1L));
        } else {
            if (!(aVar instanceof umm.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            w2wVar.I0().b().e().o(j, new WritePermission(WritePermission.State.ENABLED));
        }
    }
}
