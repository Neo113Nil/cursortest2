package xsna;

import android.os.Bundle;
import com.vkontakte.android.R;

/* compiled from: MessageViewsComponent.kt */
/* loaded from: classes2.dex */
public final class hc20 extends yj50<ic20, hd20, bd20, cd20, Object, oc20, sc20> {
    public final mo8 n;
    public final mc20 o;
    public final o0r0 p;

    public hc20(mo8 mo8Var, mc20 mc20Var, mc20 mc20Var2, o0r0 o0r0Var) {
        super(mc20Var, mc20Var2, bd20.class, false);
        this.n = mo8Var;
        this.o = mc20Var;
        this.p = o0r0Var;
    }

    @Override // xsna.yj50
    public final ic20 a(Bundle bundle) {
        return new ic20(bundle.getInt("arg_message_id", 0), bundle.getLong("arg_dialog_id", 0L), this.n);
    }

    @Override // xsna.yj50
    public final sc20 b() {
        return new sc20(this.o, this.p);
    }

    @Override // xsna.yj50
    public final cd20 d() {
        return new cd20(R.layout.im_message_views_users_list, null);
    }
}
