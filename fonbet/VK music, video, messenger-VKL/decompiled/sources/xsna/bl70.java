package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: NotifyNoLeaveRoomPermissionDialog.kt */
/* loaded from: classes7.dex */
public final class bl70 extends lwi0 {
    public static final /* synthetic */ int f1 = 0;

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_inform_can_not_leave_room_dialog, (ViewGroup) null, false);
        bwt0.i0(inflate.findViewById(R.id.invite_admin_button), new d410(this, 15));
        bwt0.i0(inflate.findViewById(R.id.hangup_button), new w620(this, 8));
        return inflate;
    }
}
