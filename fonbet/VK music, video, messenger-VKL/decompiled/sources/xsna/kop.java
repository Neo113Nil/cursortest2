package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkExternalServiceLoginButton;
import com.vk.core.view.components.button.VkButton;
import com.vk.emailactualization.api.di.EmailActualizationComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.efy;
import xsna.xwu0;

/* compiled from: EnterLoginFragment.kt */
/* loaded from: classes.dex */
public class kop extends mly<bop> implements cop {
    public VkExternalServiceLoginButton A;
    public TextView B;
    public ValueAnimator C;
    public final a D = new a();
    public final b E = new b();
    public NestedScrollView t;
    public View u;
    public VkAuthErrorStatedEditText v;
    public VkButton w;
    public TextView x;
    public VkButton y;
    public View z;

    /* compiled from: EnterLoginFragment.kt */
    public static final class a implements efy.a {
        public a() {
        }

        @Override // xsna.efy.a
        public final void Y0() {
            kop.this.An();
        }

        @Override // xsna.efy.a
        public final void x0(int i) {
            kop.this.zn();
        }
    }

    public static void yn(View view, float f) {
        if (view != null) {
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                view.setVisibility(8);
            } else if (f4m.g(view)) {
                view.setVisibility(0);
            }
            view.setAlpha(f);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public void An() {
        VkButton vkButton = this.y;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setVisibility(0);
    }

    public vop Bn() {
        r55 r55Var = r55.a;
        oou0 oou0Var = (oou0) r55.c.getValue();
        xwu0.a a2 = oou0Var != null ? oou0Var.a(kn(), g5z.a(this)) : null;
        ycu0 ycu0Var = this.p;
        return new vop(a2, (ycu0Var != null ? ycu0Var : null).a(this));
    }

    public final void En(boolean z) {
        Pair pair;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (z) {
            pair = new Pair(valueOf2, valueOf);
        } else if (z) {
            return;
        } else {
            pair = new Pair(valueOf, valueOf2);
        }
        float floatValue = ((Number) pair.d()).floatValue();
        float floatValue2 = ((Number) pair.g()).floatValue();
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.C;
            floatValue = ((Float) (valueAnimator2 != null ? valueAnimator2.getAnimatedValue() : null)).floatValue();
        }
        ValueAnimator valueAnimator3 = this.C;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.jop
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                float floatValue3 = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                kop kopVar = kop.this;
                kop.yn(kopVar.B, floatValue3);
                kop.yn(kopVar.A, floatValue3);
            }
        });
        ofFloat.addListener(new c(z, this));
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
        this.C = ofFloat;
    }

    @Override // xsna.cop
    public final void Nd() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(false);
        TextView textView = this.x;
        f4m.j(textView != null ? textView : null);
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        super.S(z);
        VkButton vkButton = this.w;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setTextVisibility(!z);
        VkButton vkButton2 = this.w;
        (vkButton2 != null ? vkButton2 : null).setLoading(z);
    }

    @Override // xsna.cop
    public final void X2() {
        bpn0 bpn0Var = t65.a;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        t65.a(vkAuthErrorStatedEditText);
    }

    @Override // xsna.cop
    public final void c7() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(true);
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.x;
        (textView2 != null ? textView2 : null).setText(getString(R.string.vk_auth_enter_login_email_empty_error));
    }

    @Override // xsna.cop
    public final void m2(String str) {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(true);
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.x;
        (textView2 != null ? textView2 : null).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return layoutInflater.inflate(R.layout.vk_auth_enter_login, (ViewGroup) null, false);
        } catch (Exception e) {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("Exception on inflation in ");
            FragmentActivity activity = getActivity();
            sb.append(activity != null ? qjg.a(activity) : null);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.c(sb2, e);
            return layoutInflater.inflate(R.layout.vk_auth_enter_login, viewGroup, false);
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((bop) obj).e();
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.removeTextChangedListener(this.E);
        int i = efy.a;
        efy.b(this.D);
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = null;
        super.onDestroyView();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        NestedScrollView nestedScrollView = this.t;
        if (nestedScrollView == null) {
            nestedScrollView = null;
        }
        nestedScrollView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mly, xsna.a66, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((EmailActualizationComponent) m7m.d(this).a(fpf0.a(EmailActualizationComponent.class))).getEntryPoint().a(getActivity());
        this.t = (NestedScrollView) view.findViewById(R.id.scroll_view);
        this.u = view.findViewById(R.id.title_container);
        TextView textView = (TextView) view.findViewById(R.id.title);
        r55 r55Var = r55.a;
        r55.i();
        textView.setText(textView.getContext().getString(R.string.vk_auth_enter_login_title));
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = (VkAuthErrorStatedEditText) view.findViewById(R.id.email_or_phone);
        this.v = vkAuthErrorStatedEditText;
        vkAuthErrorStatedEditText.addTextChangedListener(this.E);
        this.x = (TextView) view.findViewById(R.id.error_message);
        this.w = (VkButton) view.findViewById(R.id.login_button);
        this.A = (VkExternalServiceLoginButton) view.findViewById(R.id.qr_btn_web_to_app);
        this.B = (TextView) view.findViewById(R.id.or_text);
        VkButton vkButton = this.w;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.dop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj = kop.this.o;
                if (obj == null) {
                    obj = null;
                }
                ((bop) obj).D();
            }
        });
        VkButton vkButton2 = (VkButton) view.findViewById(R.id.sign_up_button);
        this.y = vkButton2;
        vkButton2.setOnClickListener(new View.OnClickListener() { // from class: xsna.eop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj = kop.this.o;
                if (obj == null) {
                    obj = null;
                }
                ((bop) obj).G();
            }
        });
        this.z = view.findViewById(R.id.nav_button);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("WITH_CLOSE_BUTTON")) {
            View view2 = this.z;
            if (view2 == null) {
                view2 = null;
            }
            view2.setVisibility(4);
        } else {
            View view3 = this.z;
            if (view3 == null) {
                view3 = null;
            }
            view3.setVisibility(0);
            View view4 = this.z;
            if (view4 == null) {
                view4 = null;
            }
            view4.setOnClickListener(new View.OnClickListener() { // from class: xsna.fop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    bpn0 bpn0Var = t65.a;
                    mhy.b(view5.getContext());
                    kop.this.kn().onBackPressed();
                }
            });
        }
        ImageView imageView = this.s;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: xsna.gop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    Object obj = kop.this.o;
                    if (obj == null) {
                        obj = null;
                    }
                    ((bop) obj).k();
                }
            });
        }
        int i = efy.a;
        efy.a(this.D);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.addition_sign_up_button_stub);
        if (viewStub != null) {
            Cn(viewStub);
        }
        VkExternalServiceLoginButton vkExternalServiceLoginButton = this.A;
        if (vkExternalServiceLoginButton != null) {
            Drawable a2 = m33.a(R.drawable.vk_icon_qr_code_outline_28, requireContext());
            if (a2 != null) {
                sjo.b(a2, e3m.f(R.attr.vk_ui_text_primary, requireContext()), PorterDuff.Mode.SRC_IN);
            }
            vkExternalServiceLoginButton.setOnlyImage(false);
            vkExternalServiceLoginButton.setIconGravity(VkExternalServiceLoginButton.VkIconGravity.START);
            vkExternalServiceLoginButton.setText(getString(R.string.vk_auth_qr_web_to_app));
            vkExternalServiceLoginButton.setIcon(a2);
            vkExternalServiceLoginButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.iop
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    Object obj = kop.this.o;
                    if (obj == null) {
                        obj = null;
                    }
                    ((bop) obj).n();
                }
            });
        }
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.content_info_button);
        if (viewStub2 != null) {
            Dn(viewStub2);
        }
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new hop(this, 0));
        }
        Object obj = this.o;
        ((bop) (obj != null ? obj : null)).y0(this);
    }

    @Override // xsna.cop
    public final void setLogin(String str) {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setText(str);
    }

    @Override // xsna.a66
    public /* bridge */ /* synthetic */ z55 tn(Bundle bundle) {
        return Bn();
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.START_WITH_PHONE;
    }

    @Override // xsna.cop
    public final void ud() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(true);
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.x;
        (textView2 != null ? textView2 : null).setText(getString(R.string.vk_auth_sign_up_incorrect_phone));
    }

    @Override // xsna.cop
    public final void v4() {
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.v;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(true);
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        String string = getString(R.string.vk_auth_enter_login_email_error_title);
        String string2 = getString(R.string.vk_auth_enter_login_email_error_subtitle);
        TextView textView2 = this.x;
        TextView textView3 = textView2 != null ? textView2 : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        Typeface a2 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, requireContext());
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        spannableStringBuilder.setSpan(new pup0(a2), 0, string.length(), 33);
        spannableStringBuilder.append((CharSequence) string2);
        textView3.setText(spannableStringBuilder);
    }

    @Override // xsna.cop
    public final void w4(boolean z) {
        VkExternalServiceLoginButton vkExternalServiceLoginButton;
        TextView textView = this.B;
        if (textView == null || this.A == null) {
            return;
        }
        if ((textView != null && textView.getVisibility() == 0 && (vkExternalServiceLoginButton = this.A) != null && vkExternalServiceLoginButton.getVisibility() == 0) == z) {
            return;
        }
        if (z) {
            En(true);
        } else {
            En(false);
        }
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        VkButton vkButton = this.w;
        if (vkButton == null) {
            vkButton = null;
        }
        vkButton.setEnabled(!z);
        VkButton vkButton2 = this.y;
        (vkButton2 != null ? vkButton2 : null).setEnabled(!z);
    }

    @Override // xsna.cop
    public final void x1(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        new zfq0(requireContext()).a((fg1) gzsVar, (myh) gzsVar2);
    }

    public void zn() {
        VkButton vkButton = this.y;
        if (vkButton == null) {
            vkButton = null;
        }
        f4m.j(vkButton);
    }

    /* compiled from: Animator.kt */
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ kop c;

        public c(boolean z, kop kopVar) {
            this.b = z;
            this.c = kopVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            VkExternalServiceLoginButton vkExternalServiceLoginButton;
            boolean z = this.b;
            kop kopVar = this.c;
            if (z && (vkExternalServiceLoginButton = kopVar.A) != null && vkExternalServiceLoginButton.getVisibility() == 0) {
                Object obj = kopVar.o;
                if (obj == null) {
                    obj = null;
                }
                ((bop) obj).H();
            }
            kopVar.C = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public void Cn(ViewStub viewStub) {
    }

    public void Dn(ViewStub viewStub) {
    }

    /* compiled from: EnterLoginFragment.kt */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            Object obj = kop.this.o;
            if (obj == null) {
                obj = null;
            }
            ((bop) obj).setLogin(editable.toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
