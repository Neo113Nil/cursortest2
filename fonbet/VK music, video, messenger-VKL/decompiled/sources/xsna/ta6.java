package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkAuthExtendedEditText;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.common.ImageSizeKey;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.registration.funnels.TrackingElement;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import xsna.bs8;
import xsna.l0c;
import xsna.utj;

/* compiled from: BaseCheckFragment.kt */
/* loaded from: classes15.dex */
public abstract class ta6<P extends l0c<?>> extends a66<P> implements com.vk.auth.verification.base.c {
    public TextView A;
    public VkAuthErrorStatedEditText B;
    public VkAuthExtendedEditText C;
    public View D;
    public fzf E;
    public a0p0 F;
    public bs8 G;
    public w1p H;
    public final boolean I;
    public ykx0 J;
    public final mo10 K;
    public final sa6 L;
    public final f9 M;
    public final lz0 N;
    public final com.vk.registration.funnels.d O;
    public SchemeStatSak$EventScreen P;
    public boolean Q;
    public String s;
    public String t;
    public String u;
    public CheckPresenterInfo v;
    public CodeState w;
    public String x;
    public boolean y;
    public TextView z;

    /* compiled from: BaseCheckFragment.kt */
    public static final class a {
        public static Bundle a(String str, String str2, CheckPresenterInfo checkPresenterInfo, CodeState codeState, String str3, String str4, int i, boolean z, String str5, boolean z2, f1j f1jVar, int i2) {
            if ((i2 & 8) != 0) {
                codeState = null;
            }
            if ((i2 & 16) != 0) {
                str3 = "";
            }
            if ((i2 & 32) != 0) {
                str4 = null;
            }
            if ((i2 & 64) != 0) {
                i = 0;
            }
            if ((i2 & 128) != 0) {
                z = false;
            }
            if ((i2 & 256) != 0) {
                str5 = null;
            }
            if ((i2 & 512) != 0) {
                z2 = false;
            }
            izs izsVar = f1jVar;
            if ((i2 & 1024) != 0) {
                izsVar = new d40(3);
            }
            Bundle bundle = new Bundle(i + 7);
            bundle.putString("phoneMask", str);
            bundle.putString("deviceName", str3);
            bundle.putString("validationSid", str2);
            bundle.putParcelable("presenterInfo", checkPresenterInfo);
            bundle.putParcelable("initialCodeState", codeState);
            bundle.putString("login", str4);
            bundle.putBoolean("anotherPhone", z);
            bundle.putString("satToken", str5);
            bundle.putBoolean("requestAccessFactor", z2);
            izsVar.invoke(bundle);
            return bundle;
        }
    }

    public ta6() {
        Boolean bool = null;
        try {
            q55 q55Var = q55.a;
            Bundle bundle = q55.c().a.K;
            if (bundle != null) {
                bool = Boolean.valueOf(m63.g(bundle));
            }
        } catch (Throwable unused) {
        }
        this.I = bool != null ? bool.booleanValue() : false;
        r55 r55Var = r55.a;
        this.K = new mo10(((SakAnalyticsComponent) m7m.d(this).a(fpf0.a(SakAnalyticsComponent.class))).Q9(), r55.a(), this);
        this.L = new sa6(this, 0);
        this.M = new f9(this, 1);
        this.N = new lz0(this, 5);
        TrackingElement.Registration registration = TrackingElement.Registration.SMS_CODE;
        RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
        this.O = new com.vk.registration.funnels.d(registration);
    }

    @Override // com.vk.auth.verification.base.c
    public final void E1(String str, boolean z, boolean z2) {
        if (z) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                Context a2 = hnj.a(mo2getContext);
                utj.a aVar = new utj.a(a2);
                aVar.n = str;
                aVar.g(R.drawable.vk_icon_error_circle_24);
                aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_icon_negative, a2));
                aVar.i = true;
                aVar.m();
                return;
            }
            return;
        }
        if (!z2) {
            fzf fzfVar = this.E;
            if ((fzfVar != null ? fzfVar : null).e) {
                (fzfVar != null ? fzfVar : null).c.h(str);
                return;
            } else {
                wa(str, null, null);
                return;
            }
        }
        fzf fzfVar2 = this.E;
        if (fzfVar2 == null) {
            fzfVar2 = null;
        }
        fzfVar2.c();
        bs8 bs8Var = this.G;
        (bs8Var != null ? bs8Var : null).c(true);
        ykx0 ykx0Var = this.J;
        if (ykx0Var != null) {
            ykx0Var.e = true;
            TextView textView = ykx0Var.c;
            if (textView != null) {
                f4m.j(textView);
            }
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void O1() {
        fzf fzfVar = this.E;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.d();
    }

    @Override // com.vk.auth.verification.base.c
    public final void O2(String str) {
        fzf fzfVar = this.E;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.a(str);
    }

    @Override // com.vk.auth.verification.base.c
    public final io.reactivex.rxjava3.core.q<pno0> Pb() {
        fzf fzfVar = this.E;
        if (fzfVar == null) {
            fzfVar = null;
        }
        return io.reactivex.rxjava3.core.q.X(new qno0(fzfVar.a), new qno0(fzfVar.c.c));
    }

    public void Ud(CodeState codeState, int i) {
        CharSequence string;
        CharSequence b;
        CharSequence string2;
        CharSequence spannableString;
        CharSequence string3;
        CharSequence string4;
        CharSequence t;
        CharSequence quantityString;
        CharSequence string5;
        CharSequence string6;
        CharSequence b2;
        ta6<P> ta6Var = this;
        a0p0 a0p0Var = ta6Var.F;
        if (a0p0Var == null) {
            a0p0Var = null;
        }
        VkSpinner vkSpinner = a0p0Var.e;
        Resources resources = a0p0Var.l;
        FrameLayout frameLayout = a0p0Var.f;
        String str = a0p0Var.a;
        int i2 = a0p0Var.n;
        TextView textView = a0p0Var.j;
        TextView textView2 = a0p0Var.g;
        TextView textView3 = a0p0Var.i;
        TextView textView4 = a0p0Var.h;
        Context context = a0p0Var.k;
        ImageView imageView = a0p0Var.d;
        imageView.setVisibility(8);
        if (!(codeState instanceof CodeState.MessengerLoading)) {
            if (vkSpinner != null) {
                vkSpinner.setVisibility(8);
            }
            frameLayout.setVisibility(8);
        }
        textView2.setVisibility(0);
        textView4.setVisibility(0);
        textView3.setVisibility(0);
        CodeState e = codeState.e();
        if (e instanceof CodeState.SmsWait) {
            pou0 a2 = a0p0Var.a();
            if (a2 == null || (string5 = a2.g()) == null) {
                string5 = context.getString(i2);
            }
            textView2.setText(string5);
            String replace = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
            if (replace == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String replace2 = replace.replace(' ', (char) 160);
            CharSequence t2 = jgz.t(context, context.getString(R.string.vk_auth_sms_was_sent, replace2), replace2);
            pou0 a3 = a0p0Var.a();
            if (a3 != null && (b2 = a3.b()) != null) {
                t2 = b2;
            }
            textView4.setText(t2);
            textView3.setVisibility(8);
            pou0 a4 = a0p0Var.a();
            if (a4 == null || (string6 = a4.c()) == null) {
                string6 = context.getString(R.string.vk_auth_sms_code);
            }
            textView.setHint(string6);
        } else if (e instanceof CodeState.CallResetWithPhoneWait) {
            textView4.setText(R.string.vk_auth_call_reset_subtitle_phone);
            textView3.setVisibility(0);
            textView3.setText(((CodeState.CallResetWithPhoneWait) e).h.replace('-', ' ').replace('X', (char) 8226));
            textView.setHint("");
        } else {
            if (e instanceof CodeState.CallResetWait) {
                int i3 = ((CodeState.CallResetWait) e).g;
                pou0 a5 = a0p0Var.a();
                if (a5 == null || (string4 = a5.g()) == null) {
                    string4 = context.getString(i2);
                }
                textView2.setText(string4);
                pou0 a6 = a0p0Var.a();
                if (a6 == null || (t = a6.b()) == null) {
                    String quantityString2 = resources.getQuantityString(R.plurals.vk_auth_call_reset_title, i3, Integer.valueOf(i3));
                    t = jgz.t(context, resources.getString(R.string.vk_auth_robot_will_call_last_digits, quantityString2), quantityString2);
                }
                textView4.setText(t);
                f4m.j(textView3);
                pou0 a7 = a0p0Var.a();
                if (a7 == null || (quantityString = a7.c()) == null) {
                    quantityString = resources.getQuantityString(R.plurals.vk_auth_call_reset_hint, i3, Integer.valueOf(i3));
                }
                textView.setHint(quantityString);
            } else if (e instanceof CodeState.CallResetPreview) {
                textView2.setText(R.string.vk_auth_callreset_preview_title);
                String str2 = ((CodeState.CallResetPreview) e).e;
                String replace3 = str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                if (replace3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String replace4 = replace3.replace(' ', (char) 160);
                textView4.setText(jgz.t(context, context.getResources().getString(R.string.vk_auth_callreset_preview_subtitle_format, replace4), replace4));
                f4m.j(textView3);
            } else if (e instanceof CodeState.AppWait) {
                textView2.setText(context.getString(i2));
                textView4.setText(R.string.vk_auth_code_was_sent_by_app);
                f4m.j(textView3);
                textView.setHint(R.string.vk_auth_code_by_app);
            } else if (e instanceof CodeState.PushWait) {
                pou0 a8 = a0p0Var.a();
                if (a8 == null || (string2 = a8.g()) == null) {
                    string2 = context.getString(i2);
                }
                textView2.setText(string2);
                pou0 a9 = a0p0Var.a();
                if (a9 == null || (spannableString = a9.b()) == null) {
                    String str3 = a0p0Var.b;
                    spannableString = drm0.N(str3) ? new SpannableString(resources.getString(R.string.vk_otp_method_selection_code_entering_push_subtitle)) : jgz.t(context, resources.getString(R.string.vk_auth_code_was_sent_by_push_to_device, str3), str3);
                }
                textView4.setText(spannableString);
                f4m.j(textView3);
                pou0 a10 = a0p0Var.a();
                if (a10 == null || (string3 = a10.c()) == null) {
                    string3 = context.getString(R.string.vk_auth_code_by_push);
                }
                textView.setHint(string3);
            } else if (e instanceof CodeState.VoiceCallWait) {
                textView4.setText(R.string.vk_auth_robot_will_call);
                f4m.j(textView3);
                textView.setHint("");
            } else if (e instanceof CodeState.EmailWait) {
                textView2.setText(context.getString(i2));
                String str4 = ((CodeState.EmailWait) e).h;
                String replace5 = str4 != null ? str4.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 8226) : null;
                if (replace5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                textView4.setText(jgz.t(context, context.getString(R.string.vk_auth_email_was_sent, replace5), replace5));
                textView3.setVisibility(8);
                textView.setHint(R.string.vk_auth_code_by_email);
            } else if (e instanceof CodeState.CheckAccess) {
                textView4.setText(R.string.vk_auth_sms_was_sent_no_phone);
                textView3.setVisibility(0);
                textView.setHint(R.string.vk_auth_sms_code);
            } else if (e instanceof CodeState.LibverifyMobileId) {
                a0p0Var.b();
            } else if (e instanceof CodeState.CallInWait) {
                pou0 a11 = a0p0Var.a();
                if (a11 == null || (string = a11.g()) == null) {
                    string = context.getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_title);
                }
                textView2.setText(string);
                CharSequence string7 = context.getResources().getString(R.string.vk_otp_method_selection_verification_methods_libverify_callin_reg_subtitle);
                pou0 a12 = a0p0Var.a();
                if (a12 != null && (b = a12.b()) != null) {
                    string7 = b;
                }
                textView4.setText(string7);
            } else if (e instanceof CodeState.LibverifyMessengersPushWait) {
                CodeState.LibverifyMessengersPushWait libverifyMessengersPushWait = (CodeState.LibverifyMessengersPushWait) e;
                Integer num = libverifyMessengersPushWait.f;
                String str5 = libverifyMessengersPushWait.e;
                if (num == null || num.intValue() == -1) {
                    num = null;
                }
                awt0.u(imageView, num != null);
                awt0.u(frameLayout, num != null);
                if (num != null) {
                    imageView.setImageResource(num.intValue());
                    imageView.setContentDescription(str5);
                }
                boolean h = SakFeatures.Type.SAK_MESSENGER_SKIP_SMS_ANDROID.h();
                textView2.setText(context.getString(h ? R.string.vk_messengers_verification_title_format_skip_sms : R.string.vk_messengers_verification_title_format, str5));
                String replace6 = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                if (replace6 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String replace7 = replace6.replace(' ', (char) 160);
                textView4.setText(jgz.t(context, h ? context.getString(R.string.vk_messengers_verification_subtitle_format_skip_sms, str5, replace7) : context.getString(R.string.vk_messengers_verification_subtitle_format, replace7), replace7));
                f4m.j(textView3);
                textView.setHint(context.getString(R.string.vk_messengers_verification_code_input_hint));
            } else if (e instanceof CodeState.MessengerLoading) {
                String str6 = ((CodeState.MessengerLoading) e).e;
                imageView.setVisibility(8);
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(0);
                }
                frameLayout.setVisibility(0);
                textView2.setText(context.getString(R.string.vk_messengers_verification_loading_title_format, str6));
                String replace8 = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                if (replace8 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String replace9 = replace8.replace(' ', (char) 160);
                textView4.setText(jgz.t(context, context.getString(R.string.vk_messengers_verification_loading_subtitle_format, str6, replace9), replace9));
                f4m.j(textView3);
            } else if (e instanceof CodeState.MessengerRegistration) {
                a0p0Var.b();
            } else if (e instanceof CodeState.MaxMessengerWait) {
                a0p0Var.b();
            } else if (e instanceof CodeState.MaxCodeWait) {
                CodeState.MaxCodeWait maxCodeWait = (CodeState.MaxCodeWait) e;
                boolean z = maxCodeWait.i;
                String replace10 = str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null;
                if (replace10 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String replace11 = replace10.replace(' ', (char) 160);
                String string8 = context.getString(R.string.vk_max_otp_code_subtitle_hyperlink_part);
                textView4.setText(jgz.t(context, context.getString(R.string.vk_max_otp_code_subtitle_format, string8, replace11), replace11));
                textView2.setText(z ? R.string.vk_max_otp_code_title_for_new_users : R.string.vk_max_otp_code_title);
                f4m.j(textView3);
                textView.setHint("");
                if (!z) {
                    his0.n(textView4, string8, Integer.valueOf(krv0.m(R.attr.vk_ui_text_accent, context)), new k4(16, a0p0Var, maxCodeWait));
                }
            }
            ta6Var = this;
        }
        bs8 bs8Var = ta6Var.G;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.d(codeState);
        w1p w1pVar = ta6Var.H;
        (w1pVar != null ? w1pVar : null).a(codeState, i);
        ykx0 ykx0Var = ta6Var.J;
        if (ykx0Var != null) {
            ykx0Var.a(codeState);
        }
        ta6Var.P = codeState instanceof CodeState.CallResetPreview ? SchemeStatSak$EventScreen.CALLRESET_WARNING : SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY;
    }

    @Override // com.vk.auth.verification.base.c
    public final void Xj(String str) {
        if (str != null) {
            this.t = str;
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void aj() {
        fzf fzfVar = this.E;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.a.setErrorState(false);
        f4m.j(fzfVar.b);
        bs8 bs8Var = this.G;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.c(false);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.B;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(false);
        ykx0 ykx0Var = this.J;
        if (ykx0Var != null) {
            ykx0Var.e = false;
            TextView textView = ykx0Var.c;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
        TextView textView2 = this.A;
        f4m.j(textView2 != null ? textView2 : null);
    }

    @Override // com.vk.auth.verification.base.c
    public final void d2() {
        bs8 bs8Var = this.G;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, false, null, false, false, false, 251));
    }

    @Override // com.vk.auth.verification.base.c
    public final void da(boolean z) {
        View view = this.D;
        if (view == null) {
            view = null;
        }
        String str = this.s;
        if (str == null) {
            str = null;
        }
        String str2 = this.t;
        if (str2 == null) {
            str2 = null;
        }
        CheckPresenterInfo checkPresenterInfo = this.v;
        this.F = new a0p0(view, str, str2, checkPresenterInfo != null ? checkPresenterInfo : null, z, new l5(this, 7));
    }

    @Override // com.vk.auth.verification.base.c
    public final void id() {
        bs8 bs8Var = this.G;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, false, null, false, false, false, 239));
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

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((l0c) obj).e();
        super.onDestroyView();
        this.J = null;
        osg0 osg0Var = (osg0) this.K.h.getValue();
        osg0Var.a();
        osg0Var.d = null;
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.Q) {
            View view = getView();
            if (view != null) {
                view.post(new vb(this, 1));
            }
            this.Q = false;
        }
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onStop() {
        this.Q = true;
        super.onStop();
    }

    @Override // xsna.a66, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        super.onViewCreated(view, bundle);
        this.D = view;
        TextView textView = (TextView) view.findViewById(R.id.title);
        umu0 umu0Var = r55.g;
        if (umu0Var == null) {
            umu0Var = null;
        }
        umu0Var.getClass();
        if (this.w instanceof CodeState.EmailWait) {
            textView.setText(R.string.vk_auth_confirm_email);
        }
        this.z = (TextView) view.findViewById(R.id.change_number);
        this.B = (VkAuthErrorStatedEditText) view.findViewById(R.id.code_edit_text);
        this.C = (VkAuthExtendedEditText) view.findViewById(R.id.code_edit_text_container);
        this.A = (TextView) view.findViewById(R.id.error_subtitle);
        VkCheckEditText vkCheckEditText = (VkCheckEditText) view.findViewById(R.id.new_code_edit_text);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.B;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        TextView textView2 = this.A;
        if (textView2 == null) {
            textView2 = null;
        }
        fzf fzfVar = new fzf(vkAuthErrorStatedEditText, textView2, vkCheckEditText, this.C);
        this.E = fzfVar;
        this.H = new w1p(fzfVar);
        if (this.I) {
            this.J = new ykx0(view, new h9(this, 4));
            fzf fzfVar2 = this.E;
            if (fzfVar2 == null) {
                fzfVar2 = null;
            }
            VkAuthExtendedEditText vkAuthExtendedEditText = fzfVar2.d;
            if (vkAuthExtendedEditText != null) {
                ViewGroup.LayoutParams layoutParams = vkAuthExtendedEditText.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                float f = 16;
                marginLayoutParams.setMarginStart(iah0.a(f));
                marginLayoutParams.leftMargin = iah0.a(f);
                marginLayoutParams.setMarginEnd(iah0.a(f));
                marginLayoutParams.rightMargin = iah0.a(f);
                vkAuthExtendedEditText.setLayoutParams(marginLayoutParams);
            }
            fzfVar2.a.setGravity(8388627);
        }
        try {
            q55 q55Var = q55.a;
            bundle2 = q55.c().a.K;
        } catch (Throwable unused) {
            bundle2 = null;
        }
        int i = 0;
        if (bundle2 != null) {
            VkEmailForwardingConfig d = m63.d(bundle2);
            boolean z = d != null && d.b;
            MailAuthFlowConfig e = m63.e(bundle2);
            if ((e != null && e.c) || z) {
                Button button = (Button) view.findViewById(R.id.vk_enter_by_mail);
                sp.t(button);
                button.setVisibility(0);
                jjc.g(button, new e5(this, r0));
            }
        }
        CheckPresenterInfo checkPresenterInfo = this.v;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            fzf fzfVar3 = this.E;
            if (fzfVar3 == null) {
                fzfVar3 = null;
            }
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText2 = fzfVar3.a;
            com.vk.registration.funnels.d dVar = this.O;
            vkAuthErrorStatedEditText2.addTextChangedListener(dVar);
            fzfVar3.c.c.addTextChangedListener(dVar);
        }
        this.G = new bs8((ConstraintLayout) view.findViewById(R.id.base_check_container), this.L, this.N, this.M, this.x, new pz(this, 5));
        VkLoadingButton vkLoadingButton = this.k;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new ec(this, r0));
        }
        if (this.y) {
            TextView textView3 = this.z;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            TextView textView4 = this.z;
            (textView4 != null ? textView4 : null).setOnClickListener(new qa6(this, i));
        }
        View findViewById = view.findViewById(R.id.help_button);
        if (findViewById != null) {
            un().getClass();
            findViewById.setVisibility(otu0.a() ? 0 : 8);
            findViewById.setOnClickListener(new ra6(this, i));
        }
        yn();
    }

    @Override // com.vk.auth.verification.base.c
    public final void s0() {
        bs8 bs8Var = this.G;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, true, null, false, false, false, 251));
    }

    @Override // xsna.a66, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.P;
        return schemeStatSak$EventScreen == null ? SchemeStatSak$EventScreen.VERIFICATION_PHONE_VERIFY : schemeStatSak$EventScreen;
    }

    @Override // xsna.x65
    public final void wm(boolean z) {
        fzf fzfVar = this.E;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.b(!z);
    }

    @Override // xsna.a66
    public final void xn() {
        CheckPresenterInfo checkPresenterInfo = this.v;
        if (checkPresenterInfo == null) {
            checkPresenterInfo = null;
        }
        if (checkPresenterInfo instanceof CheckPresenterInfo.SignUp) {
            fzf fzfVar = this.E;
            fzf fzfVar2 = fzfVar != null ? fzfVar : null;
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = fzfVar2.a;
            com.vk.registration.funnels.d dVar = this.O;
            vkAuthErrorStatedEditText.removeTextChangedListener(dVar);
            fzfVar2.c.c.removeTextChangedListener(dVar);
        }
    }

    public abstract void yn();

    public void zn() {
        Bundle arguments = getArguments();
        this.s = arguments != null ? arguments.getString("phoneMask") : null;
        Bundle arguments2 = getArguments();
        this.t = arguments2 != null ? arguments2.getString("deviceName") : null;
        Bundle arguments3 = getArguments();
        this.u = arguments3 != null ? arguments3.getString("validationSid") : null;
        Bundle arguments4 = getArguments();
        this.v = arguments4 != null ? (CheckPresenterInfo) arguments4.getParcelable("presenterInfo") : null;
        Bundle arguments5 = getArguments();
        CodeState codeState = arguments5 != null ? (CodeState) arguments5.getParcelable("initialCodeState") : null;
        if (codeState == null) {
            codeState = null;
        }
        this.w = codeState;
        Bundle arguments6 = getArguments();
        this.x = arguments6 != null ? arguments6.getString("login") : null;
        Bundle arguments7 = getArguments();
        boolean z = false;
        if (arguments7 != null && arguments7.getBoolean("anotherPhone")) {
            z = true;
        }
        this.y = z;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            arguments8.getString("satToken");
        }
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            arguments9.getBoolean("requestAccessFactor");
        }
    }
}
