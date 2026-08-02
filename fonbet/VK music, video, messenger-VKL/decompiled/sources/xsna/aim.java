package xsna;

import com.vk.im.engine.models.dialogs.DialogsCounters;
import java.util.Collections;

/* compiled from: DialogMsgRequestsCountChangeLpTask.kt */
/* loaded from: classes2.dex */
public final class aim extends e500 {
    public final w2w c;
    public final int d;

    public aim(int i, w2w w2wVar) {
        super(uqi.a("DialogMsgRequestsCountChangeLpTask(c=", i, ')'));
        this.c = w2wVar;
        this.d = i;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        z300Var.G.addAll(Collections.singletonList(DialogsCounters.Type.REQUESTS));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        DialogsCounters.Type type = DialogsCounters.Type.REQUESTS;
        w2w w2wVar = this.c;
        w2wVar.I0().b().a().g(new com.vk.im.engine.models.dialogs.d(type, this.d, cq.a(w2wVar)));
    }
}
