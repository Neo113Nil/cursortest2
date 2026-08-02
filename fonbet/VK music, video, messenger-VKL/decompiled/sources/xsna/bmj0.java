package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.auth.signupagreement.SignUpAgreementInfo;
import com.vk.auth.ui.VkLoadingButton;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SignUpAgreementFragment.kt */
/* loaded from: classes15.dex */
public final class bmj0 extends a66<amj0> {
    public boolean s;
    public final Object t = msy.a(LazyThreadSafetyMode.NONE, new ko60(6));
    public mg6 u;

    /* compiled from: SignUpAgreementFragment.kt */
    public static final class a {
        public static Bundle a(SignUpAgreementInfo signUpAgreementInfo) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isAccountExisting", signUpAgreementInfo.c);
            return bundle;
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.s = arguments != null ? arguments.getBoolean("isAccountExisting") : false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_sign_up_agreement_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mg6 mg6Var = this.u;
        if (mg6Var != null) {
            ((oao0) mg6Var.e).b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        CharSequence text;
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.sign_up_agreement_title)).setText(!this.s ? R.string.vk_sign_up_agreement_fragment_create_title : R.string.vk_sign_up_agreement_fragment_sign_in_title);
        ((TextView) view.findViewById(R.id.sign_up_agreement_subtitle)).setText(!this.s ? R.string.vk_sign_up_agreement_fragment_create_subtitle : R.string.vk_sign_up_agreement_fragment_sign_in_subtitle);
        TextView textView = (TextView) view.findViewById(R.id.sign_up_agreement_legal_notes);
        if (this.s) {
            f4m.j(textView);
        } else {
            Object obj = this.o;
            Object obj2 = obj;
            if (obj == null) {
                obj2 = null;
            }
            nao0 nao0Var = (nao0) obj2;
            VkLoadingButton vkLoadingButton = this.k;
            if (vkLoadingButton == null || (text = vkLoadingButton.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            this.u = new mg6(nao0Var, textView, str, krv0.m(R.attr.vk_ui_text_subhead, requireContext()), new rj60(this, 21), 32);
        }
        VkLoadingButton vkLoadingButton2 = this.k;
        if (vkLoadingButton2 != null) {
            jjc.g(vkLoadingButton2, new gj80(this, 14));
        }
        Object obj3 = this.o;
        ((amj0) (obj3 != null ? obj3 : null)).y0(this);
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new u01(this, 15));
        }
    }

    @Override // xsna.a66
    public final amj0 tn(Bundle bundle) {
        return new cmj0();
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }
}
