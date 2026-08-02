package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.gm50;
import xsna.mk50;
import xsna.v1j;

/* compiled from: ConfigureRoomParticipantsDialog.kt */
/* loaded from: classes7.dex */
public final class p0j extends tl50<s0j, m1j, j0j> {
    public static final /* synthetic */ int j1 = 0;
    public a2j i1;

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_session_rooms_admin_configure_room_participants_dialog);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        m1j m1jVar = (m1j) ao50Var;
        i1j i1jVar = new i1j(this, view, getFeature(), new i4e(this, 16));
        gm50.a.b(this, m1jVar.a, new gt(13));
        gm50.a.b(this, m1jVar.b, new l0j(1, i1jVar, i1j.class, "renderState", "renderState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$Loading;)V", 0));
        gm50.a.b(this, m1jVar.c, new m0j(1, i1jVar, i1j.class, "renderState", "renderState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$Ready;)V", 0));
        gm50.a.b(this, m1jVar.d, new n0j(1, i1jVar, i1j.class, "renderState", "renderState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$SavingChanges;)V", 0));
        gm50.a.b(this, m1jVar.e, new o0j(1, i1jVar, i1j.class, "renderState", "renderState(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$Failed;)V", 0));
        gm50.a.b(this, m1jVar.f, new n3i(this, 2));
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.i1 == null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a2j a2jVar = this.i1;
        if (a2jVar != null) {
            a2jVar.C(v1j.l.b);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        OKVoipEngine oKVoipEngine = OKVoipEngine.b;
        Bundle arguments = getArguments();
        return new s0j(oKVoipEngine, new SessionRoomId.Room(arguments != null ? arguments.getInt(SignalingProtocol.KEY_ROOM_ID, 0) : 0), new k0j(this, 0));
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            mhy.g(window);
        }
        return yn;
    }
}
