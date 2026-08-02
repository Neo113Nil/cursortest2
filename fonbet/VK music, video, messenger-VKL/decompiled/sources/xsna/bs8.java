package xsna;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.superapp.ui.VkGradientButton;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: ButtonsController.kt */
/* loaded from: classes15.dex */
public final class bs8 {
    public final ConstraintLayout a;
    public final View.OnClickListener b;
    public final izs<Boolean, View.OnClickListener> c;
    public final String d;
    public final izs<String, s3q0> e;
    public final TextView f;
    public final TextView g;
    public final VkLoadingButton h;
    public final View i;
    public final VkGradientButton j;
    public final Resources k;
    public final bpn0 l;
    public a m;

    /* compiled from: ButtonsController.kt */
    public static final class a {
        public final CodeState a;
        public final boolean b;
        public final boolean c;
        public final CharSequence d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public a() {
            this(255);
        }

        public static a a(a aVar, CodeState codeState, boolean z, boolean z2, CharSequence charSequence, boolean z3, boolean z4, boolean z5, int i) {
            if ((i & 1) != 0) {
                codeState = aVar.a;
            }
            CodeState codeState2 = codeState;
            if ((i & 2) != 0) {
                z = aVar.b;
            }
            boolean z6 = z;
            if ((i & 4) != 0) {
                z2 = aVar.c;
            }
            boolean z7 = z2;
            if ((i & 8) != 0) {
                charSequence = aVar.d;
            }
            CharSequence charSequence2 = charSequence;
            boolean z8 = (i & 16) != 0 ? aVar.e : true;
            if ((i & 32) != 0) {
                z3 = aVar.f;
            }
            boolean z9 = z3;
            if ((i & 64) != 0) {
                z4 = aVar.g;
            }
            boolean z10 = z4;
            boolean z11 = (i & 128) != 0 ? aVar.h : z5;
            aVar.getClass();
            return new a(codeState2, z6, z7, charSequence2, z8, z9, z10, z11);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h;
        }

        public final int hashCode() {
            CodeState codeState = this.a;
            int b = qoy.b(qoy.b((codeState == null ? 0 : codeState.hashCode()) * 31, 31, this.b), 31, this.c);
            CharSequence charSequence = this.d;
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b((b + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonContainerState(codeState=");
            sb.append(this.a);
            sb.append(", isRetryVisible=");
            sb.append(this.b);
            sb.append(", isContinueEnable=");
            sb.append(this.c);
            sb.append(", continueButtonText=");
            sb.append((Object) this.d);
            sb.append(", isLoginByPasswordVisible=");
            sb.append(this.e);
            sb.append(", isForceHideLoginByPassword=");
            sb.append(this.f);
            sb.append(", isInErrorState=");
            sb.append(this.g);
            sb.append(", isInfoTextVisible=");
            return defpackage.q0.a(sb, this.h, ')');
        }

        public /* synthetic */ a(int i) {
            this(null, false, false, null, false, false, false, false);
        }

        public a(CodeState codeState, boolean z, boolean z2, CharSequence charSequence, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.a = codeState;
            this.b = z;
            this.c = z2;
            this.d = charSequence;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
        }
    }

    public bs8(ConstraintLayout constraintLayout, View.OnClickListener onClickListener, izs izsVar, View.OnClickListener onClickListener2, String str, pz pzVar) {
        this.a = constraintLayout;
        this.b = onClickListener;
        this.c = izsVar;
        this.d = str;
        this.e = pzVar;
        this.f = (TextView) constraintLayout.findViewById(R.id.retry_button);
        this.g = (TextView) constraintLayout.findViewById(R.id.info_text);
        this.h = (VkLoadingButton) constraintLayout.findViewById(R.id.continue_btn);
        View findViewById = constraintLayout.findViewById(R.id.login_by_password);
        this.i = findViewById;
        this.j = (VkGradientButton) constraintLayout.findViewById(R.id.max_messenger_gradient_open_button);
        this.k = constraintLayout.getResources();
        this.l = new bpn0(new jb(4));
        this.m = new a(255);
        b(new a(248));
        findViewById.setOnClickListener(onClickListener2);
    }

    public final pou0 a() {
        return (pou0) this.l.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r8 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        if (r8 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a aVar) {
        CharSequence string;
        CharSequence string2;
        boolean z = aVar.e;
        boolean z2 = aVar.c;
        VkLoadingButton vkLoadingButton = this.h;
        vkLoadingButton.setEnabled(z2);
        CodeState codeState = aVar.a;
        TextView textView = this.f;
        Resources resources = this.k;
        ConstraintLayout constraintLayout = this.a;
        if (codeState != null) {
            boolean z3 = codeState instanceof CodeState.AppWait;
            izs<Boolean, View.OnClickListener> izsVar = this.c;
            if (z3 || (codeState instanceof CodeState.PushWait)) {
                pou0 a2 = a();
                if (a2 != null) {
                    constraintLayout.getContext();
                    string = a2.d();
                }
                string = resources.getString(R.string.vk_auth_confirm_another_way);
                textView.setText(string);
                if (TextUtils.isEmpty(this.d)) {
                    textView.setOnClickListener(izsVar.invoke(Boolean.FALSE));
                } else {
                    textView.setOnClickListener(this.b);
                }
            } else {
                CodeState codeState2 = codeState.b;
                CodeState codeState3 = codeState.c;
                if (codeState3 == null) {
                    codeState3 = codeState.f();
                    codeState3.b = codeState;
                }
                boolean f = epx.f(codeState2, codeState3);
                boolean z4 = !f;
                if (codeState.b instanceof CodeState.CheckAccess) {
                    string2 = resources.getString(R.string.vk_auth_phone_verify_sms_action);
                } else if (f) {
                    pou0 a3 = a();
                    if (a3 != null) {
                        constraintLayout.getContext();
                        string2 = a3.a();
                    }
                    string2 = resources.getString(R.string.vk_auth_confirm_again);
                } else {
                    pou0 a4 = a();
                    if (a4 != null) {
                        constraintLayout.getContext();
                        string2 = a4.d();
                    }
                    string2 = resources.getString(R.string.vk_auth_confirm_another_way);
                }
                textView.setText(string2);
                textView.setOnClickListener(izsVar.invoke(Boolean.valueOf(z4)));
            }
        }
        TextView textView2 = this.g;
        if (codeState != null) {
            if (codeState instanceof CodeState.WithTime) {
                textView2.setTextAppearance(textView2.getContext(), R.style.VkUiTypography_SubheadNormal);
                textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView2.getContext()));
                CodeState.WithTime withTime = (CodeState.WithTime) codeState;
                long max = Math.max(0L, (withTime.e + withTime.f) - System.currentTimeMillis());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                CharSequence format = simpleDateFormat.format(new Date(max));
                if (withTime instanceof CodeState.SmsWait) {
                    pou0 a5 = a();
                    if (a5 != null) {
                        constraintLayout.getContext();
                        CharSequence e = a5.e();
                        if (e != null) {
                            format = e;
                        }
                    }
                    format = resources.getString(R.string.vk_auth_sms_will_be_received_during, format);
                } else if (withTime instanceof CodeState.EmailWait) {
                    format = resources.getString(R.string.vk_auth_email_will_be_received_during, format);
                } else if (!(withTime instanceof CodeState.MaxCodeWait)) {
                    String string3 = resources.getString(R.string.vk_auth_confirm_via_sms);
                    resources.getString(R.string.vk_auth_confirm_in, string3, format);
                    pou0 a6 = a();
                    if (a6 != null) {
                        constraintLayout.getContext();
                        CharSequence e2 = a6.e();
                        if (e2 != null) {
                            format = e2;
                        }
                    }
                    format = resources.getString(R.string.vk_auth_confirm_in, string3, format);
                }
                textView2.setText(format);
            } else if (codeState instanceof CodeState.LibverifyMessengersPushWait) {
                String string4 = resources.getString(R.string.vk_messengers_verification_info_text);
                textView2.setTextAppearance(textView2.getContext(), R.style.VkUiTypography_Caption2Normal);
                textView2.setTextColor(e3m.f(R.attr.vk_ui_text_tertiary, textView2.getContext()));
                textView2.setText(string4);
            } else {
                textView2.setTextAppearance(textView2.getContext(), R.style.VkUiTypography_SubheadNormal);
                textView2.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, textView2.getContext()));
            }
        }
        CharSequence charSequence = aVar.d;
        awt0.v(vkLoadingButton, charSequence != null);
        vkLoadingButton.setText(charSequence);
        awt0.v(this.i, z && !aVar.f);
        awt0.v(textView, aVar.b);
        awt0.v(textView2, aVar.h);
        boolean z5 = aVar.g;
        a aVar2 = this.m;
        if (aVar2.e != z || aVar2.g != z5) {
            androidx.constraintlayout.widget.b a7 = pq.a(constraintLayout);
            Iterator it = e43.l(Integer.valueOf(R.id.continue_btn), Integer.valueOf(R.id.info_text), Integer.valueOf(R.id.retry_button)).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                a7.h(intValue, 3);
                a7.h(intValue, 4);
            }
            int a8 = iah0.a(12);
            if (z) {
                a7.l(R.id.continue_btn, 3, R.id.info_buttons_bottom_barrier, 4, a8);
                a7.l(R.id.continue_btn, 4, R.id.login_by_password, 3, a8);
                int i = z5 ? R.id.error_subtitle : R.id.code_container;
                a7.l(R.id.info_text, 3, i, 4, a8);
                a7.l(R.id.retry_button, 3, i, 4, a8);
                textView.setTextAppearance(textView.getContext(), R.style.VkAuth_Button_Landing_Tertiary_Medium);
            } else {
                a7.l(R.id.continue_btn, 3, R.id.code_container, 4, a8);
                a7.l(R.id.continue_btn, 4, R.id.info_buttons_top_barrier, 3, a8);
                a7.l(R.id.info_text, 4, R.id.login_by_password, 3, a8);
                a7.l(R.id.retry_button, 4, R.id.login_by_password, 3, a8);
                textView.setTextAppearance(textView.getContext(), R.style.VkAuth_Button_Landing_Tertiary);
            }
            a7.b(constraintLayout);
        }
        CodeState e3 = codeState != null ? codeState.e() : null;
        CodeState.MaxCodeWait maxCodeWait = e3 instanceof CodeState.MaxCodeWait ? (CodeState.MaxCodeWait) e3 : null;
        VkGradientButton vkGradientButton = this.j;
        if (maxCodeWait != null && maxCodeWait.i) {
            if (vkGradientButton != null) {
                vkGradientButton.setVisibility(0);
            }
            if (vkGradientButton != null) {
                jjc.g(vkGradientButton, new zf1(1, this, maxCodeWait));
            }
            if (maxCodeWait.j) {
                if (vkGradientButton != null) {
                    vkGradientButton.setTextColorful(true);
                }
                if (vkGradientButton != null) {
                    vkGradientButton.getBackgroundDrawable().setColors(null);
                    vkGradientButton.setBackgroundColorful(true);
                }
            } else {
                if (vkGradientButton != null) {
                    vkGradientButton.setTextTint(R.attr.vk_ui_text_contrast);
                }
                int[] iArr = {n8g.l(6476543, 255), n8g.l(1191410, 255), n8g.l(11292359, 255)};
                if (vkGradientButton != null) {
                    GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                    vkGradientButton.getBackgroundDrawable().setColors(iArr);
                    vkGradientButton.getBackgroundDrawable().setOrientation(orientation);
                    vkGradientButton.setBackgroundColorful(false);
                }
            }
        } else if (vkGradientButton != null) {
            f4m.j(vkGradientButton);
        }
        this.m = aVar;
    }

    public final void c(boolean z) {
        b(a.a(this.m, null, false, false, null, false, z, false, 191));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(CodeState codeState) {
        boolean z;
        CodeState e;
        boolean z2;
        CharSequence string;
        boolean z3 = codeState instanceof CodeState.LibverifyMobileId;
        if (!z3 && !(codeState instanceof CodeState.MessengerLoading) && !(codeState instanceof CodeState.MessengerRegistration) && (codeState instanceof CodeState.NotReceive)) {
            CodeState codeState2 = codeState.b;
            if (!(codeState2 instanceof CodeState.LibverifyMessengersPushWait) || !((CodeState.LibverifyMessengersPushWait) codeState2).g) {
                z = true;
                e = codeState.e();
                CharSequence charSequence = null;
                if (!(e instanceof CodeState.LibverifyMobileId) && !(e instanceof CodeState.CallInWait) && !(e instanceof CodeState.MaxMessengerWait) && !(e instanceof CodeState.MessengerLoading)) {
                    z2 = e instanceof CodeState.MessengerRegistration;
                    Resources resources = this.k;
                    if (z2) {
                        boolean z4 = e instanceof CodeState.MaxCodeWait;
                        ConstraintLayout constraintLayout = this.a;
                        if (z4) {
                            if (!((CodeState.MaxCodeWait) e).i) {
                                pou0 a2 = a();
                                if (a2 != null) {
                                    constraintLayout.getContext();
                                    string = a2.f();
                                }
                                string = resources.getString(R.string.vk_auth_continue);
                                charSequence = string;
                            }
                        } else if (e instanceof CodeState.CallResetPreview) {
                            charSequence = resources.getString(R.string.vk_auth_callreset_preview_button_text);
                        } else {
                            pou0 a3 = a();
                            if (a3 != null) {
                                constraintLayout.getContext();
                                string = a3.f();
                            }
                            string = resources.getString(R.string.vk_auth_continue);
                            charSequence = string;
                        }
                    } else {
                        charSequence = resources.getString(R.string.vk_auth_continue);
                    }
                }
                b(a.a(this.m, codeState, z, false, charSequence, !z3 || (codeState instanceof CodeState.MessengerLoading) || (codeState instanceof CodeState.MessengerRegistration), false, (!z3 || (codeState instanceof CodeState.CallResetPreview) || (codeState instanceof CodeState.CallInWait) || (codeState instanceof CodeState.MessengerLoading) || (codeState instanceof CodeState.MessengerRegistration) || (!(codeState instanceof CodeState.LibverifyMessengersPushWait) ? !z : !(((CodeState.LibverifyMessengersPushWait) codeState).g || z))) ? false : true, 84));
            }
        }
        z = false;
        e = codeState.e();
        CharSequence charSequence2 = null;
        if (!(e instanceof CodeState.LibverifyMobileId)) {
            z2 = e instanceof CodeState.MessengerRegistration;
            Resources resources2 = this.k;
            if (z2) {
            }
        }
        if (!z3) {
        }
        b(a.a(this.m, codeState, z, false, charSequence2, !z3 || (codeState instanceof CodeState.MessengerLoading) || (codeState instanceof CodeState.MessengerRegistration), false, (!z3 || (codeState instanceof CodeState.CallResetPreview) || (codeState instanceof CodeState.CallInWait) || (codeState instanceof CodeState.MessengerLoading) || (codeState instanceof CodeState.MessengerRegistration) || (!(codeState instanceof CodeState.LibverifyMessengersPushWait) ? !z : !(((CodeState.LibverifyMessengersPushWait) codeState).g || z))) ? false : true, 84));
    }
}
