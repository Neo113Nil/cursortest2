package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: SessionRoomParticipantMoveDialog.kt */
/* loaded from: classes7.dex */
public final class nvi0 extends lwi0 {
    public static final /* synthetic */ int k1 = 0;
    public s0j f1;
    public ParticipantId g1;
    public String h1;
    public SessionRoomId.Room i1;
    public io.reactivex.rxjava3.disposables.c j1 = EmptyDisposable.INSTANCE;

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_session_rooms_admin_move_participant_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.voip_participant_name);
        String str = this.h1;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        View findViewById = inflate.findViewById(R.id.voip_move_participant_to_call);
        View findViewById2 = inflate.findViewById(R.id.voip_move_participant_to_room);
        bwt0.i0(findViewById, new af50(this, 27));
        bwt0.i0(findViewById2, new r8a0(this, 19));
        com.vk.voip.ui.c.b.getClass();
        this.j1 = io.reactivex.rxjava3.kotlin.c.f(2, com.vk.voip.ui.c.B0.l().U(new je40(new mvi0(this), 9)).a0(asu0.a.d()), null, new td5(L.a, 15), new ra50(findViewById2, 2));
        return inflate;
    }

    @Override // xsna.lwi0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer d;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.i1 = (arguments == null || (d = bo8.d(arguments, SignalingProtocol.KEY_ROOM_ID)) == null) ? null : new SessionRoomId.Room(d.intValue());
        Bundle arguments2 = getArguments();
        this.g1 = arguments2 != null ? (ParticipantId) arguments2.getParcelable(SignalingProtocol.KEY_PARTICIPANT_ID) : null;
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("participantName") : null;
        this.h1 = string;
        if (this.f1 == null || this.g1 == null || string == null || this.i1 == null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.j1.dispose();
    }
}
