package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.LinkedHashMap;

/* compiled from: DialogUnarchiveLpTask.kt */
/* loaded from: classes2.dex */
public final class bmm extends e500 {
    public final w2w c;
    public final Peer d;

    public bmm(w2w w2wVar, Peer peer) {
        super("DialogUnarchiveLpTask");
        this.c = w2wVar;
        this.d = peer;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        if (this.c.getExperiments().n()) {
            LinkedHashMap linkedHashMap = c400Var.d;
            Peer peer = this.d;
            if (linkedHashMap.get(Long.valueOf(peer.b)) == null) {
                f400Var.c.add(Long.valueOf(peer.b));
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.g(this.d.b);
        z300Var.f(DialogsCounters.Type.ARCHIVE_TOTAL, -1);
        Boolean bool = Boolean.TRUE;
        z300Var.a = bool;
        z300Var.d = bool;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        this.c.I0().u(new zf1(11, this, c400Var));
    }
}
