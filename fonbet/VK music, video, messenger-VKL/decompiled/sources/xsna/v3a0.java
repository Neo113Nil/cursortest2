package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.vk.auth.validation.internal.PhoneValidationContract$SkipBehaviour;
import com.vk.auth.validation.internal.PhoneValidationContract$ValidationDialogMetaInfo;
import com.vk.dto.common.ImageSizeKey;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.eeu0;

/* compiled from: PhoneValidationOfferFragment.kt */
/* loaded from: classes15.dex */
public final class v3a0 extends a66<x3a0> implements y3a0 {
    public xpu0 s;

    /* compiled from: PhoneValidationOfferFragment.kt */
    public static final class a {
        public static Bundle a(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
            return yfb.b(new Pair("meta_info", phoneValidationContract$ValidationDialogMetaInfo));
        }
    }

    @Override // xsna.y3a0
    public final void Cg(PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo) {
        String replace = phoneValidationContract$ValidationDialogMetaInfo.c.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183);
        if (replace == null) {
            replace = "";
        }
        eeu0.a aVar = new eeu0.a(hnj.a(kn()));
        aVar.setTitle(getString(R.string.vk_service_validation_confirmation_unlink_warning_title, replace));
        aVar.a.f = getString(R.string.vk_service_validation_confirmation_unlink_warning);
        aVar.setPositiveButton(R.string.vk_service_validation_confirmation_ok, new a240(this, 1));
        aVar.setNegativeButton(R.string.vk_service_validation_confirmation_cancel, new lad(this, 1));
        aVar.m();
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        if (this.s == null) {
            SuperappUiRouterBridge superappUiRouterBridge = e370.d;
            if (superappUiRouterBridge == null) {
                superappUiRouterBridge = null;
            }
            this.s = new xpu0(superappUiRouterBridge.u(kn(), false));
        }
        if (z) {
            xpu0 xpu0Var = this.s;
            if (xpu0Var != null) {
                xpu0Var.show();
                return;
            }
            return;
        }
        xpu0 xpu0Var2 = this.s;
        if (xpu0Var2 != null) {
            xpu0Var2.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = arguments != null ? (PhoneValidationContract$ValidationDialogMetaInfo) arguments.getParcelable("meta_info") : null;
        View inflate = LayoutInflater.from(mo2getContext()).inflate(R.layout.vk_auth_phone_validation_fragment, viewGroup, false);
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) inflate.findViewById(R.id.phone_validation_toolbar);
        r55 r55Var = r55.a;
        vkAuthToolbar.setPicture(r55.i().b(requireContext()));
        vkAuthToolbar.setNavigationOnClickListener(new hs00(this, 17));
        ((TextView) inflate.findViewById(R.id.phone_validation_title)).setText(getString(R.string.vk_service_validation_confirmation_title, phoneValidationContract$ValidationDialogMetaInfo.c.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183)));
        Button button = (Button) inflate.findViewById(R.id.phone_validation_action_button);
        jjc.g(button, new fju(this, 20));
        jjc.g((TextView) inflate.findViewById(R.id.phone_validation_primary_button), new or50(this, 7));
        Button button2 = (Button) inflate.findViewById(R.id.phone_validation_secondary_button);
        int i = 27;
        if (phoneValidationContract$ValidationDialogMetaInfo.e == PhoneValidationContract$SkipBehaviour.NOTHING) {
            f4m.j(button);
            button2.setText(getString(R.string.vk_service_validation_confirmation_change_number));
            jjc.g(button2, new o3w(this, i));
            return inflate;
        }
        awt0.u(button, true);
        button2.setText(getString(R.string.vk_service_validation_confirmation_unlink_action));
        jjc.g(button2, new j4x(this, i));
        vkAuthToolbar.setNavigationIconVisible(false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        xpu0 xpu0Var = this.s;
        if (xpu0Var != null) {
            xpu0Var.b();
        }
        this.s = null;
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((x3a0) obj).y0(this);
    }

    @Override // xsna.a66
    public final x3a0 tn(Bundle bundle) {
        Bundle arguments = getArguments();
        PhoneValidationContract$ValidationDialogMetaInfo phoneValidationContract$ValidationDialogMetaInfo = arguments != null ? (PhoneValidationContract$ValidationDialogMetaInfo) arguments.getParcelable("meta_info") : null;
        r55 r55Var = r55.a;
        umu0 umu0Var = r55.g;
        tmu0 tmu0Var = (umu0Var != null ? umu0Var : null).k;
        return new x3a0(phoneValidationContract$ValidationDialogMetaInfo, new com.vk.auth.validation.a(kn()));
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.VERIFICATION_ASK_NUMBER;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
