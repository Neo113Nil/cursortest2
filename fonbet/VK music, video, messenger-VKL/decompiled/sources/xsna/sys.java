package xsna;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: FullscreenPasswordFragment.kt */
/* loaded from: classes15.dex */
public class sys extends mly<qys<? super rys>> implements rys {
    public final b A = new b();
    public e68 B;
    public View t;
    public TextView u;
    public VkAuthPasswordView v;
    public EditText w;
    public TextView x;
    public TextView y;
    public View z;

    /* compiled from: FullscreenPasswordFragment.kt */
    public static final class a {
        public static Bundle a(FullscreenPasswordData fullscreenPasswordData) {
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("FULLSCREEN_PASSWORD_DATA", fullscreenPasswordData);
            return bundle;
        }
    }

    /* compiled from: FullscreenPasswordFragment.kt */
    public static final class b extends xsj0 {
        public b() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = sys.this.o;
            if (obj == null) {
                obj = null;
            }
            ((qys) obj).G1(editable.toString());
        }
    }

    @Override // xsna.rys
    public final void F3(String str, boolean z) {
        String string = getString(R.string.vk_auth_fullscreen_password_subtitle, z ? getString(R.string.vk_auth_fullscreen_password_subtitle_suffix_phone) : getString(R.string.vk_auth_fullscreen_password_subtitle_suffix_email), str);
        int K = drm0.K(0, 6, string, str, false);
        int length = str.length() + K;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, requireContext())), K, length, 33);
        TextView textView = this.u;
        if (textView == null) {
            textView = null;
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // xsna.rys
    public final void G1(String str) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setText(str);
    }

    @Override // xsna.rys
    public final void H2() {
        VkAuthPasswordView vkAuthPasswordView = this.v;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_ui_auth_bg_edittext_stated));
        TextView textView = this.x;
        f4m.j(textView != null ? textView : null);
    }

    @Override // xsna.rys
    public final void J1() {
        VkAuthPasswordView vkAuthPasswordView = this.v;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_ui_auth_bg_edittext_error));
        TextView textView = this.x;
        (textView != null ? textView : null).setVisibility(0);
    }

    @Override // xsna.rys
    public final void Rh() {
        View view = this.z;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        TextView textView = this.y;
        (textView != null ? textView : null).setText(R.string.vk_auth_forgot_pass);
    }

    @Override // xsna.rys
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.rys
    public final void i3(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(!z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_fullscreen_password, layoutInflater, null);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e68 e68Var = this.B;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.removeTextChangedListener(this.A);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.t = view.findViewById(R.id.fullscreen_password_root_contrainer);
        this.u = (TextView) view.findViewById(R.id.sub_title);
        this.v = (VkAuthPasswordView) view.findViewById(R.id.password_container);
        TextView textView = (TextView) view.findViewById(R.id.fullscreen_password_forget_password);
        this.y = textView;
        textView.setOnClickListener(new sa6(this, 6));
        EditText editText = (EditText) view.findViewById(R.id.vk_password);
        this.w = editText;
        editText.addTextChangedListener(this.A);
        this.x = (TextView) view.findViewById(R.id.error_message);
        View findViewById = view.findViewById(R.id.verify_by_phone);
        this.z = findViewById;
        findViewById.setOnClickListener(new f9(this, 9));
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setOnClickListener(new dd6(this, 3));
        }
        View view2 = this.t;
        if (view2 == null) {
            view2 = null;
        }
        e68 e68Var = new e68(view2);
        efy.a(e68Var);
        this.B = e68Var;
        bpn0 bpn0Var = t65.a;
        EditText editText2 = this.w;
        if (editText2 == null) {
            editText2 = null;
        }
        t65.a(editText2);
        View findViewById2 = view.findViewById(R.id.help_button);
        if (findViewById2 != null) {
            un().getClass();
            findViewById2.setVisibility(otu0.a() ? 0 : 8);
            findViewById2.setOnClickListener(new p01(this, 7));
        }
        Object obj = this.o;
        ((qys) (obj != null ? obj : null)).y0(this);
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        return new tys((FullscreenPasswordData) requireArguments().getParcelable("FULLSCREEN_PASSWORD_DATA"));
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.AUTH_PASSWORD;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        boolean z2;
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            if (!z) {
                Object obj = this.o;
                if (obj == null) {
                    obj = null;
                }
                if (((qys) obj).I1()) {
                    z2 = true;
                    vkLoadingButton.setEnabled(z2);
                }
            }
            z2 = false;
            vkLoadingButton.setEnabled(z2);
        }
        View view = this.z;
        (view != null ? view : null).setEnabled(!z);
    }
}
