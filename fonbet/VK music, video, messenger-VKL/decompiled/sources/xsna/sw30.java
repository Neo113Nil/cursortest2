package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import xsna.rw30;
import xsna.xx30;

/* compiled from: MsgSearchComponent.kt */
/* loaded from: classes2.dex */
public final class sw30 implements xx30.a {
    public final /* synthetic */ rw30 a;

    public sw30(rw30 rw30Var) {
        this.a = rw30Var;
    }

    @Override // xsna.xx30.a
    public final boolean a(Dialog dialog) {
        rw30.a aVar = this.a.w;
        if (aVar != null) {
            return aVar.a(dialog);
        }
        return false;
    }

    @Override // xsna.xx30.a
    public final boolean b(Dialog dialog) {
        rw30.a aVar = this.a.w;
        if (aVar != null) {
            return aVar.b(dialog);
        }
        return false;
    }
}
