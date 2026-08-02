package xsna;

import com.vk.voip.OKVoipEngine;
import com.vk.voip.ui.sessionrooms.dialog.model.a;
import com.vkontakte.android.R;

/* compiled from: SessionRoomsDialog.kt */
/* loaded from: classes7.dex */
public final class kwi0 implements jwi0 {
    public final izs<lvi0, s3q0> a;
    public final izs<lvi0, Boolean> b;

    /* JADX WARN: Multi-variable type inference failed */
    public kwi0(izs<? super lvi0, s3q0> izsVar, izs<? super lvi0, Boolean> izsVar2) {
        this.a = izsVar;
        this.b = izsVar2;
    }

    @Override // xsna.jwi0
    public final Integer a() {
        return Integer.valueOf(R.string.voip_session_room_admin_participant_move_participant);
    }

    @Override // xsna.jwi0
    public final Integer b() {
        return Integer.valueOf(R.string.voip_session_room_admin_participant_move);
    }

    @Override // xsna.jwi0
    public final void c(lvi0 lvi0Var) {
        this.a.invoke(lvi0Var);
    }

    @Override // xsna.jwi0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 d() {
        return new com.vk.voip.ui.sessionrooms.dialog.model.a(OKVoipEngine.b).e(new a.C2077a(null, null, null, null, 63)).U(new n5e0(new per(24))).U(new wii0(new w910(this, 25), 1));
    }
}
