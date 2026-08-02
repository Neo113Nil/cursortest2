package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: ConfirmAdminAssistanceRequestDialog.kt */
/* loaded from: classes7.dex */
public final class u2j extends lwi0 {
    public static final /* synthetic */ int f1 = 0;

    @Override // xsna.lwi0
    public final View Yn() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.voip_request_admin_assistance_dialog, (ViewGroup) null, false);
        bwt0.i0(inflate.findViewById(R.id.request_assistance_dialog_button), new com.vk.movika.sdk.base.logic.interactor.p(this, 29));
        return inflate;
    }
}
