package xsna;

import android.view.View;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MsgPartHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class sn30 implements izs<View, s3q0> {
    public final /* synthetic */ un30 b;
    public final /* synthetic */ vn30 c;
    public final /* synthetic */ vn30 d;
    public final /* synthetic */ vn30 e;

    public sn30(un30 un30Var, vn30 vn30Var, vn30 vn30Var2, vn30 vn30Var3) {
        this.b = un30Var;
        this.c = vn30Var;
        this.d = vn30Var2;
        this.e = vn30Var3;
    }

    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        pk30 pk30Var = this.b.g;
        Msg msg = this.c.p;
        Attach attach = this.d.r;
        if (pk30Var != null && msg != null && attach != null) {
            pk30Var.R(attach, msg, this.e.q);
        }
        return s3q0.a;
    }
}
