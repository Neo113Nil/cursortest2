package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: NotifySessionRoomsNotAvailableDialog.kt */
/* loaded from: classes7.dex */
public final class fl70 extends lwi0 {
    public static final /* synthetic */ int f1 = 0;

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_inform_rooms_not_available_dialog, (ViewGroup) null, false);
        bwt0.i0(inflate.findViewById(R.id.close_inform_dialog_button), new rj60(this, 3));
        return inflate;
    }
}
