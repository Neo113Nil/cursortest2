package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgPartHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class ar30 implements View.OnLongClickListener {
    public final /* synthetic */ wq30 b;
    public final /* synthetic */ br30 c;
    public final /* synthetic */ br30 d;
    public final /* synthetic */ br30 e;

    public ar30(wq30 wq30Var, br30 br30Var, br30 br30Var2, br30 br30Var3) {
        this.b = wq30Var;
        this.c = br30Var;
        this.d = br30Var2;
        this.e = br30Var3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Boolean bool;
        pk30 pk30Var = this.b.u;
        Msg msg = this.c.l;
        Attach attach = this.d.n;
        if (pk30Var == null || msg == null || attach == null) {
            bool = null;
        } else {
            pk30Var.X(attach, msg, this.e.m);
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
