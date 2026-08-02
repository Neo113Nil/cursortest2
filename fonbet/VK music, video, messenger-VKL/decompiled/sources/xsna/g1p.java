package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: EditSessionRoomDialog.kt */
/* loaded from: classes7.dex */
public final class g1p extends lwi0 {
    public static final /* synthetic */ int j1 = 0;
    public a2j f1;
    public SessionRoomId.Room g1;
    public String h1 = "";
    public io.reactivex.rxjava3.disposables.c i1 = EmptyDisposable.INSTANCE;

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_session_rooms_admin_edit_room_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.voip_session_room_name);
        View findViewById = inflate.findViewById(R.id.voip_session_room_rename_button);
        View findViewById2 = inflate.findViewById(R.id.voip_session_room_remove_button);
        com.vk.voip.ui.c.b.getClass();
        this.i1 = io.reactivex.rxjava3.kotlin.c.e(com.vk.voip.ui.c.B0.l().K(), new bjk(this, 3), new f1p(this, textView));
        bwt0.i0(findViewById, new vfk(this, 7));
        bwt0.i0(findViewById2, new dxh(this, 9));
        return inflate;
    }

    @Override // xsna.lwi0, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer d;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        SessionRoomId.Room room = (arguments == null || (d = bo8.d(arguments, SignalingProtocol.KEY_ROOM_ID)) == null) ? null : new SessionRoomId.Room(d.intValue());
        this.g1 = room;
        if (this.f1 == null || room == null) {
            tn();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.i1.dispose();
    }
}
