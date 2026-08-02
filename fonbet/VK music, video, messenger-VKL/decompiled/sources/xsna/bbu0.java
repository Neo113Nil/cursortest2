package xsna;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.vk.auth.ui.password.askpassword.VkAskPasswordData;
import com.vk.auth.ui.password.askpassword.VkAskPasswordView;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;

/* compiled from: VkAskPasswordBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public final class bbu0 extends sbu0 {
    public VkAskPasswordData C;
    public final int D = R.layout.vk_ask_password_bottomsheet;

    @Override // xsna.oeu0
    public final int Gn() {
        return this.D;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        this.C = arguments != null ? (VkAskPasswordData) arguments.getParcelable("extra_extend_token_password_data") : null;
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(requireContext()));
        VkAskPasswordView vkAskPasswordView = (VkAskPasswordView) view.findViewById(R.id.vk_ask_pass_view);
        VkAskPasswordData vkAskPasswordData = this.C;
        vkAskPasswordView.setAskPasswordData(vkAskPasswordData != null ? vkAskPasswordData : null);
        vkAskPasswordView.requestFocus();
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.setOnShowListener(new abu0());
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkFastLoginBottomSheetTheme;
    }
}
