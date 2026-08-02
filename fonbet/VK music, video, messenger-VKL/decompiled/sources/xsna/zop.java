package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.vk.auth.enterpassword.EnterPasswordPresenter;
import com.vk.auth.enterpassword.VkEnterPasswordProgressBarView;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import xsna.utj;

/* compiled from: EnterPasswordFragment.kt */
/* loaded from: classes15.dex */
public class zop extends a66<EnterPasswordPresenter> implements yop {
    public e68 C;
    public boolean D;
    public final com.vk.registration.funnels.d G;
    public final com.vk.registration.funnels.d H;
    public View s;
    public TextView t;
    public VkAuthPasswordView u;
    public VkAuthPasswordView v;
    public EditText w;
    public EditText x;
    public VkEnterPasswordProgressBarView y;
    public jr80 z;
    public final f1j A = new f1j(this, 8);
    public final g1j B = new g1j(this, 5);
    public final b E = new b();
    public final c F = new c();

    /* compiled from: EnterPasswordFragment.kt */
    public static final class a {
        public static Bundle a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("isAdditionalSignUp", z);
            return bundle;
        }
    }

    public zop() {
        TrackingElement.Registration registration = TrackingElement.Registration.PASSWORD;
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.G = new com.vk.registration.funnels.d(registration);
        this.H = new com.vk.registration.funnels.d(TrackingElement.Registration.PASSWORD_VERIFY);
    }

    public static SpannableString yn(String str, String str2) {
        int K = drm0.K(0, 6, str, str2, false);
        int length = str2.length() + K;
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StyleSpan(1), K, length, 33);
        return spannableString;
    }

    @Override // xsna.yop
    public final void Oj(int i) {
        zn(getString(R.string.vk_auth_sign_up_enter_password_error_to_short, Integer.valueOf(i)));
    }

    @Override // xsna.yop
    public final void R6(boolean z) {
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            vkLoadingButton.setEnabled(z);
        }
    }

    @Override // xsna.yop
    public final void X8() {
        zn(getString(R.string.vk_auth_sign_up_enter_password_error_equality));
    }

    @Override // xsna.yop
    public final void Xi() {
        Resources resources = getResources();
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        String string = resources.getString(R.string.vk_auth_sign_up_enter_password_contents, Integer.valueOf(((EnterPasswordPresenter) obj).C));
        int f = e3m.f(R.attr.vk_ui_text_secondary, requireContext());
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
        if (vkEnterPasswordProgressBarView == null) {
            vkEnterPasswordProgressBarView = null;
        }
        vkEnterPasswordProgressBarView.setText(string);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView2 = this.y;
        if (vkEnterPasswordProgressBarView2 == null) {
            vkEnterPasswordProgressBarView2 = null;
        }
        vkEnterPasswordProgressBarView2.setTextColor(f);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView3 = this.y;
        (vkEnterPasswordProgressBarView3 != null ? vkEnterPasswordProgressBarView3 : null).setProgress(0);
    }

    @Override // xsna.yop
    public final void Zl(String str) {
        String string = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_normal_bold);
        String string2 = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_not_ok, string, str);
        int f = e3m.f(R.attr.vk_ui_accent_orange, requireContext());
        SpannableString yn = yn(string2, string);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
        if (vkEnterPasswordProgressBarView == null) {
            vkEnterPasswordProgressBarView = null;
        }
        vkEnterPasswordProgressBarView.a(yn, 65, f);
    }

    @Override // xsna.a66, com.vk.registration.funnels.c
    public final List<Pair<TrackingElement.Registration, gzs<String>>> aa() {
        return e43.l(new Pair(TrackingElement.Registration.PASSWORD, new q5f(this, 17)), new Pair(TrackingElement.Registration.PASSWORD_VERIFY, new enh(this, 12)));
    }

    @Override // xsna.yop
    public final void ag() {
        String string = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_ok_bold);
        String string2 = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_ok, string);
        int f = e3m.f(R.attr.vk_ui_accent_green, requireContext());
        SpannableString yn = yn(string2, string);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
        if (vkEnterPasswordProgressBarView == null) {
            vkEnterPasswordProgressBarView = null;
        }
        vkEnterPasswordProgressBarView.a(yn, 100, f);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        this.D = (arguments != null ? Boolean.valueOf(arguments.getBoolean("isAdditionalSignUp")) : null).booleanValue();
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_enter_password_fragment, layoutInflater, viewGroup);
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((EnterPasswordPresenter) obj).e();
        VkAuthPasswordView vkAuthPasswordView = this.u;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.b.remove(this.A);
        VkAuthPasswordView vkAuthPasswordView2 = this.v;
        if (vkAuthPasswordView2 == null) {
            vkAuthPasswordView2 = null;
        }
        vkAuthPasswordView2.b.remove(this.B);
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.removeTextChangedListener(this.E);
        EditText editText2 = this.w;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.removeTextChangedListener(this.G);
        EditText editText3 = this.x;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.removeTextChangedListener(this.F);
        EditText editText4 = this.x;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.removeTextChangedListener(this.H);
        int i = efy.a;
        jr80 jr80Var = this.z;
        efy.b(jr80Var != null ? jr80Var : null);
        e68 e68Var = this.C;
        if (e68Var != null) {
            efy.b(e68Var);
        }
        super.onDestroyView();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.s = view.findViewById(R.id.vk_auth_enter_password_container);
        this.t = (TextView) view.findViewById(R.id.error);
        this.u = (VkAuthPasswordView) view.findViewById(R.id.password_smart_layout);
        this.v = (VkAuthPasswordView) view.findViewById(R.id.repeat_password_smart_layout);
        this.w = (EditText) view.findViewById(R.id.vk_password);
        this.x = (EditText) view.findViewById(R.id.vk_repeat_password);
        VkAuthPasswordView vkAuthPasswordView = this.u;
        if (vkAuthPasswordView == null) {
            vkAuthPasswordView = null;
        }
        vkAuthPasswordView.b.add(this.A);
        VkAuthPasswordView vkAuthPasswordView2 = this.v;
        if (vkAuthPasswordView2 == null) {
            vkAuthPasswordView2 = null;
        }
        vkAuthPasswordView2.b.add(this.B);
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setBackgroundResource(R.drawable.vk_auth_bg_edittext_stated);
        EditText editText2 = this.x;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setBackgroundResource(R.drawable.vk_auth_bg_edittext_stated);
        EditText editText3 = this.w;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.addTextChangedListener(this.E);
        EditText editText4 = this.w;
        if (editText4 == null) {
            editText4 = null;
        }
        editText4.addTextChangedListener(this.G);
        EditText editText5 = this.x;
        if (editText5 == null) {
            editText5 = null;
        }
        editText5.addTextChangedListener(this.F);
        EditText editText6 = this.x;
        if (editText6 == null) {
            editText6 = null;
        }
        editText6.addTextChangedListener(this.H);
        this.y = (VkEnterPasswordProgressBarView) view.findViewById(R.id.progress_bar);
        Xi();
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new arf(this, 12));
        }
        if (bundle == null) {
            bpn0 bpn0Var = t65.a;
            EditText editText7 = this.w;
            if (editText7 == null) {
                editText7 = null;
            }
            t65.a(editText7);
        }
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) obj;
        enterPasswordPresenter.y0(this);
        yop yopVar = (yop) enterPasswordPresenter.a;
        if (yopVar != null) {
            yopVar.wc(enterPasswordPresenter.x, enterPasswordPresenter.y);
        }
        SignUpDataHolder signUpDataHolder = enterPasswordPresenter.p;
        if ((signUpDataHolder != null ? signUpDataHolder : null).o != null) {
            AuthStatSender authStatSender = enterPasswordPresenter.e;
            if (signUpDataHolder == null) {
                signUpDataHolder = null;
            }
            Uri uri = signUpDataHolder.h;
            authStatSender.getClass();
        }
        SakFeatures.Type type = SakFeatures.Type.FEATURE_STRONG_PASSWORD;
        if (type.h()) {
            EditText editText8 = this.w;
            if (editText8 == null) {
                editText8 = null;
            }
            io.reactivex.rxjava3.disposables.c subscribe = new qno0(editText8).y(300L, TimeUnit.MILLISECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new xn(new lbe(enterPasswordPresenter, 20), 17));
            io.reactivex.rxjava3.disposables.b bVar = enterPasswordPresenter.r;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(subscribe);
        }
        R6(false);
        Object obj2 = this.o;
        if (obj2 == null) {
            obj2 = null;
        }
        ((EnterPasswordPresenter) obj2).getClass();
        if (type.h()) {
            VkAuthPasswordView vkAuthPasswordView3 = this.v;
            if (vkAuthPasswordView3 == null) {
                vkAuthPasswordView3 = null;
            }
            f4m.j(vkAuthPasswordView3);
            VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
            if (vkEnterPasswordProgressBarView == null) {
                vkEnterPasswordProgressBarView = null;
            }
            vkEnterPasswordProgressBarView.setVisibility(0);
        } else {
            VkAuthPasswordView vkAuthPasswordView4 = this.v;
            if (vkAuthPasswordView4 == null) {
                vkAuthPasswordView4 = null;
            }
            vkAuthPasswordView4.setVisibility(0);
            VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView2 = this.y;
            if (vkEnterPasswordProgressBarView2 == null) {
                vkEnterPasswordProgressBarView2 = null;
            }
            f4m.j(vkEnterPasswordProgressBarView2);
        }
        View view2 = this.s;
        e68 e68Var = new e68(view2 != null ? view2 : null);
        efy.a(e68Var);
        this.C = e68Var;
        jr80 jr80Var = new jr80(this.m, new jpf(this, 15));
        this.z = jr80Var;
        efy.a(jr80Var);
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new ko3(this, 4));
        }
    }

    @Override // xsna.yop
    public final void s7(String str) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            Context a2 = hnj.a(mo2getContext);
            utj.a aVar = new utj.a(a2);
            aVar.n = str;
            aVar.g(R.drawable.vk_icon_error_circle_24);
            aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_background_negative, a2));
            aVar.i = true;
            aVar.m();
        }
    }

    @Override // xsna.yop
    public final void t4(String str) {
        String string = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_invalid_bold);
        String string2 = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_not_ok, string, str);
        int f = e3m.f(R.attr.vk_ui_accent_red, requireContext());
        SpannableString yn = yn(string2, string);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
        if (vkEnterPasswordProgressBarView == null) {
            vkEnterPasswordProgressBarView = null;
        }
        vkEnterPasswordProgressBarView.a(yn, 20, f);
    }

    @Override // xsna.a66
    public final EnterPasswordPresenter tn(Bundle bundle) {
        return new EnterPasswordPresenter();
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return this.D ? SchemeStatSak$EventScreen.REGISTRATION_PASSWORD_ADD : SchemeStatSak$EventScreen.REGISTRATION_PASSWORD;
    }

    @Override // xsna.yop
    public final void wc(String str, String str2) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setText(str);
        EditText editText2 = this.x;
        (editText2 != null ? editText2 : null).setText(str2);
    }

    @Override // xsna.yop
    public final void zi(String str) {
        String string = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_error_bold);
        String string2 = getResources().getString(R.string.vk_auth_sign_up_enter_password_complexity_not_ok, string, str);
        int f = e3m.f(R.attr.vk_ui_accent_red, requireContext());
        SpannableString yn = yn(string2, string);
        VkEnterPasswordProgressBarView vkEnterPasswordProgressBarView = this.y;
        if (vkEnterPasswordProgressBarView == null) {
            vkEnterPasswordProgressBarView = null;
        }
        vkEnterPasswordProgressBarView.a(yn, 20, f);
    }

    public final void zn(String str) {
        EditText editText = this.w;
        if (editText == null) {
            editText = null;
        }
        editText.setBackgroundResource(R.drawable.vk_auth_bg_edittext_error);
        EditText editText2 = this.x;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.setBackgroundResource(R.drawable.vk_auth_bg_edittext_error);
        TextView textView = this.t;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.t;
        (textView2 != null ? textView2 : null).setText(str);
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
    }

    /* compiled from: EnterPasswordFragment.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = zop.this.o;
            if (obj == null) {
                obj = null;
            }
            EnterPasswordPresenter enterPasswordPresenter = (EnterPasswordPresenter) obj;
            String obj2 = editable.toString();
            yop yopVar = (yop) enterPasswordPresenter.a;
            if (yopVar != null) {
                yopVar.R6((SakFeatures.Type.FEATURE_STRONG_PASSWORD.h() || drm0.N(obj2)) ? false : true);
            }
            enterPasswordPresenter.x = obj2;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: EnterPasswordFragment.kt */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = zop.this.o;
            if (obj == null) {
                obj = null;
            }
            ((EnterPasswordPresenter) obj).y = editable.toString();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
