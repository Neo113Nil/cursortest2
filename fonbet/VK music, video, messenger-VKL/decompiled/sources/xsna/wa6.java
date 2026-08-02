package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.dto.common.ImageSizeKey;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.p0c;
import xsna.pj20;
import xsna.utj;
import xsna.wbu0;

/* compiled from: BaseCheckMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public abstract class wa6<P extends p0c<?>> extends a66<P> implements q0c {
    public fzf A;
    public wk20 B;
    public pj20 C;
    public vj20 D;
    public ProgressBar E;
    public final com.vk.registration.funnels.d H;
    public boolean I;
    public final Object J;
    public final sj20 K;
    public final zj20 L;
    public final boolean M;
    public ykx0 N;
    public boolean O;
    public SchemeStatSak$EventScreen P;
    public final mo10 Q;
    public String s;
    public String t;
    public CheckPresenterInfo u;
    public VerificationMethodState v;
    public TextView x;
    public VkAuthErrorStatedEditText y;
    public View z;
    public final boolean w = true;
    public final com.vk.movika.sdk.base.ui.f F = new com.vk.movika.sdk.base.ui.f(this, 9);
    public final y01 G = new y01(this, 3);

    public wa6() {
        TrackingElement.Registration registration = TrackingElement.Registration.SMS_CODE;
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.H = new com.vk.registration.funnels.d(registration);
        this.J = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.ui.g(this, 13));
        this.K = new sj20(new jd(this, 6), new p40(this, 10));
        this.L = new zj20();
        Boolean bool = null;
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                bool = Boolean.valueOf(m63.g(bundle));
            }
        } catch (Throwable unused) {
        }
        this.M = bool != null ? bool.booleanValue() : false;
        r55 r55Var = r55.a;
        this.Q = new mo10(((SakAnalyticsComponent) m7m.d(this).a(fpf0.a(SakAnalyticsComponent.class))).Q9(), r55.a(), this);
    }

    @Override // xsna.q0c
    public final void E1(String str, boolean z, boolean z2) {
        if (z) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                Context a = hnj.a(mo2getContext);
                utj.a aVar = new utj.a(a);
                aVar.n = str;
                aVar.g(R.drawable.vk_icon_error_circle_24);
                aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_background_negative, a));
                aVar.i = true;
                aVar.m();
                return;
            }
            return;
        }
        if (!z2) {
            fzf fzfVar = this.A;
            if ((fzfVar == null ? null : fzfVar).e) {
                (fzfVar != null ? fzfVar : null).c.h(str);
                return;
            } else {
                wa(str, null, null);
                return;
            }
        }
        fzf fzfVar2 = this.A;
        if (fzfVar2 == null) {
            fzfVar2 = null;
        }
        fzfVar2.c();
        pj20 pj20Var = this.C;
        pj20 pj20Var2 = pj20Var != null ? pj20Var : null;
        pj20Var2.b(pj20.a.a(pj20Var2.m, null, false, false, true, 15));
    }

    @Override // xsna.a66, xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext(), new ua6(this, 0));
    }

    @Override // xsna.q0c
    public final void O1() {
        fzf fzfVar = this.A;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.d();
    }

    @Override // xsna.q0c
    public final void O2(String str) {
        fzf fzfVar = this.A;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.a(str);
    }

    @Override // xsna.q0c
    public final void Rg(VerificationMethodTypes verificationMethodTypes) {
        hg1.a(this.L.a(requireContext(), new uh3(1, this, verificationMethodTypes)), this);
    }

    @Override // xsna.a66, xsna.x65
    public final void S(boolean z) {
        ProgressBar progressBar = this.E;
        if (progressBar == null) {
            progressBar = null;
        }
        progressBar.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a9(MethodSelectorCodeState methodSelectorCodeState) {
        Integer valueOf;
        int i;
        String str;
        boolean z;
        fzf fzfVar;
        boolean z2;
        int i2;
        int i3;
        MethodSelectorCodeState methodSelectorCodeState2;
        ykx0 ykx0Var;
        View view;
        View findViewById;
        wk20 wk20Var = this.B;
        if (wk20Var == null) {
            wk20Var = null;
        }
        ImageView imageView = wk20Var.c;
        Context context = wk20Var.b;
        TextView textView = wk20Var.d;
        textView.setVisibility(0);
        TextView textView2 = wk20Var.e;
        textView2.setVisibility(0);
        boolean z3 = methodSelectorCodeState instanceof MethodSelectorCodeState.AppGenerator;
        if (z3) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_code_gen_title);
        } else if ((methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset)) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_call_reset_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_email_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_push_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_official_messenger_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_reserve_codes_title);
        } else if ((methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms)) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_code_entering_sms_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) {
            valueOf = Integer.valueOf(((MethodSelectorCodeState.MaxOtpCode) methodSelectorCodeState).g ? R.string.vk_max_otp_code_title_for_new_users : R.string.vk_max_otp_code_title);
        } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) {
            valueOf = Integer.valueOf(R.string.vk_otp_method_selection_verification_methods_libverify_callin_title);
        } else {
            if (methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) {
                throw new IllegalArgumentException("Code entering doesn't support Passkey verification method.");
            }
            if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) && !epx.f(methodSelectorCodeState, MethodSelectorCodeState.Loading.b)) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = null;
        }
        textView.setText(valueOf != null ? context.getString(valueOf.intValue()) : null);
        imageView.setVisibility(8);
        if (z3) {
            textView2.setText(R.string.vk_otp_method_selection_code_entering_code_gen_subtitle);
            i = 8;
        } else {
            boolean z4 = methodSelectorCodeState instanceof MethodSelectorCodeState.Sms;
            if (z4) {
                i = 8;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) {
                i = 8;
            } else if ((methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset)) {
                i = 8;
                int d = methodSelectorCodeState.d();
                String quantityString = context.getResources().getQuantityString(R.plurals.vk_auth_call_reset_title, d, Integer.valueOf(d));
                textView2.setText(wk20Var.a(context.getResources().getString(R.string.vk_otp_method_selection_code_entering_call_reset_subtitle, quantityString), quantityString));
            } else {
                if (methodSelectorCodeState instanceof MethodSelectorCodeState.Push) {
                    String str2 = ((MethodSelectorCodeState.Push) methodSelectorCodeState).c;
                    Context context2 = textView2.getContext();
                    textView2.setText(drm0.N(str2) ? new SpannableString(context2.getString(R.string.vk_otp_method_selection_code_entering_push_subtitle)) : wk20Var.a(context2.getString(R.string.vk_otp_method_selection_code_entering_push_subtitle_with_device_name, str2), str2));
                } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Email) {
                    String str3 = ((MethodSelectorCodeState.Email) methodSelectorCodeState).c;
                    String replace = str3 != null ? str3.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 8226) : null;
                    if (replace == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    textView2.setText(wk20Var.a(context.getString(R.string.vk_otp_method_selection_code_entering_email_subtitle, replace), replace));
                } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) {
                    textView2.setText(context.getString(R.string.vk_otp_method_selection_code_entering_official_messenger_subtitle));
                } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) {
                    textView2.setText(R.string.vk_otp_method_selection_code_entering_reserve_codes_subtitle);
                } else if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey)) {
                    if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn) {
                        textView2.setText(context.getResources().getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_auth_subtitle));
                    } else if (methodSelectorCodeState.equals(MethodSelectorCodeState.Loading.b) || (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) {
                        i = 8;
                        textView.setVisibility(8);
                        textView2.setVisibility(8);
                    } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush) {
                        MethodSelectorCodeState.LibverifyMessengerPush libverifyMessengerPush = (MethodSelectorCodeState.LibverifyMessengerPush) methodSelectorCodeState;
                        Integer num = libverifyMessengerPush.d;
                        String str4 = libverifyMessengerPush.c;
                        if (num == null || num.intValue() == -1) {
                            num = null;
                        }
                        awt0.u(imageView, num != null);
                        if (num != null) {
                            imageView.setImageResource(num.intValue());
                            imageView.setContentDescription(str4);
                        }
                        textView.setText(context.getString(R.string.vk_messengers_verification_title_format, str4));
                        String str5 = libverifyMessengerPush.e;
                        String replace2 = str5 != null ? str5.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                        if (replace2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String replace3 = replace2.replace(' ', (char) 160);
                        String string = context.getString(R.string.vk_smartflow_messengers_verification_subtitle_format, str4, replace3);
                        List<String> l = e43.l(str4, replace3);
                        SpannableString spannableString = new SpannableString(string);
                        int i4 = 0;
                        for (String str6 : l) {
                            int K = drm0.K(i4, 4, string, str6, false);
                            if (K != -1) {
                                i4 = str6.length() + K;
                                spannableString.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, context)), K, i4, 33);
                            }
                        }
                        textView2.setText(spannableString);
                        f4m.j(wk20Var.f);
                    } else {
                        if (!(methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MethodSelectorCodeState.MaxOtpCode maxOtpCode = (MethodSelectorCodeState.MaxOtpCode) methodSelectorCodeState;
                        String str7 = maxOtpCode.e;
                        String replace4 = str7 != null ? str7.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                        if (replace4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        String replace5 = replace4.replace(' ', (char) 160);
                        String string2 = context.getString(R.string.vk_max_otp_code_subtitle_hyperlink_part);
                        textView2.setText(wk20Var.a(context.getString(R.string.vk_max_otp_code_subtitle_format, string2, replace5), replace5));
                        if (!maxOtpCode.g) {
                            his0.n(textView2, string2, Integer.valueOf(krv0.m(R.attr.vk_ui_text_accent, context)), new nh3(17, wk20Var, maxOtpCode));
                        }
                    }
                }
                i = 8;
            }
            if (z4) {
                str = ((MethodSelectorCodeState.Sms) methodSelectorCodeState).c;
            } else if (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) {
                str = ((MethodSelectorCodeState.LibverifySms) methodSelectorCodeState).c;
            }
            String replace6 = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
            if (replace6 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String replace7 = replace6.replace(' ', (char) 160);
            textView2.setText(wk20Var.a(context.getString(R.string.vk_otp_method_selection_code_entering_sms_subtitle, replace7), replace7));
        }
        pj20 pj20Var = this.C;
        pj20 pj20Var2 = pj20Var == null ? null : pj20Var;
        pj20.a aVar = pj20Var2.m;
        a020 a020Var = pj20Var2.k;
        boolean z5 = methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallIn;
        if (z5) {
            a020Var.getClass();
        } else {
            a020Var.getClass();
            if (!a020.t(methodSelectorCodeState)) {
                z = true;
                pj20Var2.b(pj20.a.a(aVar, methodSelectorCodeState, z, false, false, 26));
                vj20 vj20Var = this.D;
                vj20 vj20Var2 = vj20Var != null ? null : vj20Var;
                fzfVar = (fzf) vj20Var2.b;
                VkCheckEditText vkCheckEditText = fzfVar.c;
                z2 = methodSelectorCodeState instanceof MethodSelectorCodeState.Loading;
                if (!z2 || z5 || (methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) {
                    i2 = 1;
                    i3 = 0;
                    fzfVar.e(false, false);
                } else {
                    if (!z3 && !(methodSelectorCodeState instanceof MethodSelectorCodeState.CallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Email) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyCallReset) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifySms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Passkey) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Push) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Reserve) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.Sms) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.OfficialMessenger) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode) && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMessengerPush)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean t = a020.t(methodSelectorCodeState);
                    int d2 = methodSelectorCodeState.d();
                    fzfVar.e = t;
                    fzfVar.a.setErrorState(false);
                    f4m.j(fzfVar.b);
                    i2 = 1;
                    fzfVar.e(t, true);
                    if (t) {
                        vkCheckEditText.setDigitsNumber(d2);
                    }
                    fzfVar.b(true);
                    i3 = 0;
                }
                methodSelectorCodeState2 = (MethodSelectorCodeState) vj20Var2.c;
                if (methodSelectorCodeState2 != null && !methodSelectorCodeState2.equals(methodSelectorCodeState) && !z5) {
                    if (fzfVar.e) {
                        fzfVar.a("");
                    } else {
                        vkCheckEditText.postDelayed(new ep0(fzfVar, 4), 150L);
                    }
                    fzfVar.d();
                }
                vj20Var2.c = methodSelectorCodeState;
                ykx0Var = this.N;
                if (ykx0Var != null) {
                    ykx0Var.a(methodSelectorCodeState);
                }
                this.P = !z2 ? SchemeStatSak$EventScreen.VERIFICATION_LOADING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
                view = getView();
                if (view != null || (findViewById = view.findViewById(R.id.help_button)) == null) {
                }
                int i5 = ((methodSelectorCodeState instanceof MethodSelectorCodeState.MaxMessenger) || z2) ? i2 : i3;
                un().getClass();
                if (otu0.a() && i5 == 0) {
                    i = i3;
                }
                findViewById.setVisibility(i);
                return;
            }
        }
        z = false;
        pj20Var2.b(pj20.a.a(aVar, methodSelectorCodeState, z, false, false, 26));
        vj20 vj20Var3 = this.D;
        if (vj20Var3 != null) {
        }
        fzfVar = (fzf) vj20Var2.b;
        VkCheckEditText vkCheckEditText2 = fzfVar.c;
        z2 = methodSelectorCodeState instanceof MethodSelectorCodeState.Loading;
        if (z2) {
        }
        i2 = 1;
        i3 = 0;
        fzfVar.e(false, false);
        methodSelectorCodeState2 = (MethodSelectorCodeState) vj20Var2.c;
        if (methodSelectorCodeState2 != null) {
            if (fzfVar.e) {
            }
            fzfVar.d();
        }
        vj20Var2.c = methodSelectorCodeState;
        ykx0Var = this.N;
        if (ykx0Var != null) {
        }
        this.P = !z2 ? SchemeStatSak$EventScreen.VERIFICATION_LOADING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
        view = getView();
        if (view != null) {
        }
    }

    @Override // xsna.q0c
    public final void d2() {
        pj20 pj20Var = this.C;
        if (pj20Var == null) {
            pj20Var = null;
        }
        pj20Var.b(pj20.a.a(pj20Var.m, null, false, false, false, 23));
    }

    @Override // xsna.q0c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.q0c
    public final void kf(wbu0.a aVar, w4u w4uVar) {
        String str = aVar.a;
        if (aVar.c) {
            return;
        }
        wa(str, w4uVar, w4uVar);
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        zn();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wn(R.layout.vk_auth_check_fragment, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onDestroyView() {
        pj20 pj20Var = this.C;
        if (pj20Var == null) {
            pj20Var = null;
        }
        CountDownTimer countDownTimer = pj20Var.l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        pj20Var.l = null;
        osg0 osg0Var = (osg0) this.Q.h.getValue();
        osg0Var.a();
        osg0Var.d = null;
        Object obj = this.o;
        ((p0c) (obj != null ? obj : null)).e();
        super.onDestroyView();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        O1();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.I) {
            View view = getView();
            if (view != null) {
                view.post(new o93(this, 1));
            }
            this.I = false;
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onStop() {
        this.I = true;
        super.onStop();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.z = view;
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        this.y = (VkAuthErrorStatedEditText) view.findViewById(R.id.code_edit_text);
        this.x = (TextView) view.findViewById(R.id.error_subtitle);
        VkCheckEditText vkCheckEditText = (VkCheckEditText) view.findViewById(R.id.new_code_edit_text);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.y;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        TextView textView = this.x;
        if (textView == null) {
            textView = null;
        }
        fzf fzfVar = new fzf(vkAuthErrorStatedEditText, textView, vkCheckEditText, null);
        this.A = fzfVar;
        this.D = new vj20(fzfVar);
        this.E = (ProgressBar) view.findViewById(R.id.vk_auth_check_progress);
        CheckPresenterInfo checkPresenterInfo = this.u;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            fzf fzfVar2 = this.A;
            if (fzfVar2 == null) {
                fzfVar2 = null;
            }
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = fzfVar2.a;
            com.vk.registration.funnels.d dVar = this.H;
            vkAuthErrorStatedEditText2.addTextChangedListener(dVar);
            fzfVar2.c.c.addTextChangedListener(dVar);
        }
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText3 = this.y;
        if (vkAuthErrorStatedEditText3 == null) {
            vkAuthErrorStatedEditText3 = null;
        }
        vkAuthErrorStatedEditText3.setImportantForAccessibility(1);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText4 = this.y;
        iut0.q(vkAuthErrorStatedEditText4 != null ? vkAuthErrorStatedEditText4 : null, new va6(this));
        this.C = new pj20((ConstraintLayout) view.findViewById(R.id.base_check_container), this.F, this.G, new w5(this, 7));
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new on(this, 6));
        }
        if (this.M) {
            this.N = new ykx0(view, new t5(this, 8));
        }
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            findViewById.setOnClickListener(new k1(this, 4));
        }
        yn();
    }

    @Override // xsna.q0c
    public final void s0() {
        pj20 pj20Var = this.C;
        if (pj20Var == null) {
            pj20Var = null;
        }
        pj20Var.b(pj20.a.a(pj20Var.m, null, false, true, false, 23));
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.P;
        return schemeStatSak$EventScreen == null ? SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY : schemeStatSak$EventScreen;
    }

    @Override // xsna.a66
    public final boolean vn() {
        return this.w;
    }

    public void wm(boolean z) {
        fzf fzfVar = this.A;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.b(!z);
    }

    @Override // xsna.a66
    public final void xn() {
        CheckPresenterInfo checkPresenterInfo = this.u;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            fzf fzfVar = this.A;
            fzf fzfVar2 = fzfVar != null ? fzfVar : null;
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = fzfVar2.a;
            com.vk.registration.funnels.d dVar = this.H;
            vkAuthErrorStatedEditText.removeTextChangedListener(dVar);
            fzfVar2.c.c.removeTextChangedListener(dVar);
        }
    }

    public abstract void yn();

    public void zn() {
        z5k0 N = f9t.N(getArguments());
        this.t = N.b;
        this.u = N.c;
        this.v = N.e;
        this.s = N.d;
        this.O = N.i;
    }
}
