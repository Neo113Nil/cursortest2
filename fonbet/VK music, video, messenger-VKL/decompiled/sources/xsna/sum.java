package xsna;

import com.vk.im.engine.models.dialogs.DialogsFilter;

/* compiled from: DialogsMetaInteractor.kt */
/* loaded from: classes2.dex */
public final class sum {
    public final xgl0 a;

    public sum(xgl0 xgl0Var) {
        this.a = xgl0Var;
    }

    public final void a(com.vk.im.engine.models.dialogs.b bVar) {
        boolean z = bVar.R;
        xgl0 xgl0Var = this.a;
        if (z) {
            xgl0Var.u(new ync(DialogsFilter.ARCHIVE, bVar, this, 2));
            return;
        }
        xgl0Var.u(new ync(DialogsFilter.MAIN, bVar, this, 2));
        if (bVar.c()) {
            xgl0Var.u(new ync(DialogsFilter.UNREAD, bVar, this, 2));
        }
    }
}
