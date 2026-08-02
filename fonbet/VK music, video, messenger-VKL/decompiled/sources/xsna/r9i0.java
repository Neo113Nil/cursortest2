package xsna;

import android.os.Bundle;
import android.view.View;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.dialog.SessionRoomsDialog;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vkontakte.android.R;
import xsna.gm50;
import xsna.mk50;

/* compiled from: SelectSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class r9i0 extends tl50<s9i0, w9i0, p9i0> implements SessionRoomsDialog {
    public static final /* synthetic */ int j1 = 0;
    public jwi0 i1;

    /* compiled from: SelectSessionRoomDialog.kt */
    public static final class a implements jwi0 {
        @Override // xsna.jwi0
        public final Integer a() {
            return null;
        }

        @Override // xsna.jwi0
        public final Integer b() {
            return null;
        }

        @Override // xsna.jwi0
        public final void c(lvi0 lvi0Var) {
            com.vk.voip.ui.c.b.getClass();
            com.vk.voip.ui.c.B0.e(lvi0Var.a);
        }

        @Override // xsna.jwi0
        public final io.reactivex.rxjava3.internal.operators.observable.j1 d() {
            return new com.vk.voip.ui.sessionrooms.dialog.model.a(OKVoipEngine.b).e(new a.C2077a(null, null, null, null, 61)).U(new hub0(new p2u(26), 3));
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_session_room_list_view);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        w9i0 w9i0Var = (w9i0) ao50Var;
        ixi0 ixi0Var = new ixi0(view, new po5(1, getFeature(), s9i0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
        gm50.a.b(this, w9i0Var.a, new b8e0(ixi0Var, 4));
        gm50.a.b(this, w9i0Var.b, new qm90(7, this, ixi0Var));
        gm50.a.b(this, w9i0Var.c, new q7a0(5, this, ixi0Var));
        gm50.a.b(this, w9i0Var.d, new j5b0(this, 8));
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(null);
        if (bundle != null) {
            tn();
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        jwi0 jwi0Var = this.i1;
        if (jwi0Var == null) {
            jwi0Var = new a();
        }
        return new s9i0(jwi0Var);
    }
}
