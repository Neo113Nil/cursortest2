package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.auth.screendata.ConsciousRegistrationScreenData;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkConsciousRegistrationFragment.kt */
/* loaded from: classes15.dex */
public final class ymu0 extends mly<xmu0> {
    public oao0 t;
    public TextView u;
    public TextView v;

    /* compiled from: VkConsciousRegistrationFragment.kt */
    public static final class a {
        public static Bundle a(ConsciousRegistrationScreenData consciousRegistrationScreenData) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("conscious_registration_screen_data", consciousRegistrationScreenData);
            return bundle;
        }
    }

    /* compiled from: VkConsciousRegistrationFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            ((xmu0) this.receiver).v(str);
            return s3q0.a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_conscious_registration_layout, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        oao0 oao0Var = this.t;
        if (oao0Var == null) {
            oao0Var = null;
        }
        oao0Var.b();
    }

    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.vk_terms);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.vk_terms_more);
        VkAuthTextView vkAuthTextView = (VkAuthTextView) view.findViewById(R.id.use_alternative_auth_btn);
        this.u = (TextView) view.findViewById(R.id.conscious_title);
        this.v = (TextView) view.findViewById(R.id.conscious_subtitle);
        f4m.j(linearLayout);
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setText(getString(R.string.vk_conscious_registration_create_account));
            vkLoadingButton.setOnClickListener(new isk(this, 9));
        }
        vkAuthTextView.setOnClickListener(new jsk(this, 14));
        sp.t(vkAuthTextView);
        int m = krv0.m(R.attr.vk_ui_text_subhead, requireContext());
        pao0 pao0Var = new pao0(R.string.vk_auth_sign_up_terms_new_custom, R.string.vk_auth_sign_up_terms_new_custom_single, R.string.vk_auth_sign_up_terms_new);
        Object obj = this.o;
        oao0 oao0Var = new oao0(m, krv0.m(R.attr.vk_ui_transparent_hover, requireContext()), new b(1, obj != null ? obj : null, xmu0.class, "onLegalInfoLinkClick", "onLegalInfoLinkClick(Ljava/lang/String;)V", 0), false);
        this.t = oao0Var;
        oao0Var.a(textView);
        oao0 oao0Var2 = this.t;
        if (oao0Var2 == null) {
            oao0Var2 = null;
        }
        Context requireContext = requireContext();
        VkLoadingButton vkLoadingButton2 = this.k;
        oao0Var2.d(pao0Var.a(requireContext, String.valueOf(vkLoadingButton2 != null ? vkLoadingButton2.getText() : null)));
        Bundle arguments = getArguments();
        ConsciousRegistrationScreenData consciousRegistrationScreenData = arguments != null ? (ConsciousRegistrationScreenData) arguments.getParcelable("conscious_registration_screen_data") : null;
        String string = consciousRegistrationScreenData != null ? consciousRegistrationScreenData.b : getString(R.string.vk_conscious_registration_title);
        String string2 = consciousRegistrationScreenData != null ? consciousRegistrationScreenData.c : getString(R.string.vk_conscious_registration_subtitle);
        TextView textView2 = this.u;
        if (textView2 != null) {
            textView2.setText(string);
        }
        TextView textView3 = this.v;
        if (textView3 != null) {
            textView3.setText(string2);
        }
        bpn0 bpn0Var = t65.a;
        mhy.b(view.getContext());
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new d27(this, 10));
        }
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        return new zmu0(new q1z(requireContext()));
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
