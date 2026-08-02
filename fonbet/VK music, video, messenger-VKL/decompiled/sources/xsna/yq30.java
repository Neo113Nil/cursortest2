package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgPartHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class yq30 implements View.OnLongClickListener {
    public final /* synthetic */ wq30 b;
    public final /* synthetic */ br30 c;
    public final /* synthetic */ br30 d;
    public final /* synthetic */ br30 e;

    public yq30(wq30 wq30Var, br30 br30Var, br30 br30Var2, br30 br30Var3) {
        this.b = wq30Var;
        this.c = br30Var;
        this.d = br30Var2;
        this.e = br30Var3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        pk30 pk30Var = this.b.u;
        Boolean bool = null;
        bool = null;
        bool = null;
        br30 br30Var = this.c;
        Msg msg = br30Var != null ? br30Var.l : null;
        br30 br30Var2 = this.d;
        Attach attach = br30Var2 != null ? br30Var2.n : null;
        if (pk30Var != null && msg != null && attach != null) {
            br30 br30Var3 = this.e;
            pk30Var.X(attach, msg, br30Var3 != null ? br30Var3.m : null);
            bool = Boolean.TRUE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
