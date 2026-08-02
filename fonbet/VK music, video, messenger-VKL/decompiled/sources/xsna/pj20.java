package xsna;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vk.superapp.ui.VkGradientButton;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: MethodSelectorButtonsController.kt */
/* loaded from: classes15.dex */
public final class pj20 {
    public final gzs<View.OnClickListener> a;
    public final View.OnClickListener b;
    public final w5 c;
    public final TextView d;
    public final TextView e;
    public final VkLoadingButton f;
    public final View g;
    public final VkGradientButton h;
    public final Button i;
    public final boolean j;
    public final a020 k;
    public CountDownTimer l;
    public a m;

    /* compiled from: MethodSelectorButtonsController.kt */
    public static final class a {
        public final MethodSelectorCodeState a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public a() {
            this(31);
        }

        public static a a(a aVar, MethodSelectorCodeState methodSelectorCodeState, boolean z, boolean z2, boolean z3, int i) {
            if ((i & 1) != 0) {
                methodSelectorCodeState = aVar.a;
            }
            MethodSelectorCodeState methodSelectorCodeState2 = methodSelectorCodeState;
            boolean z4 = (i & 2) != 0 ? aVar.b : true;
            if ((i & 4) != 0) {
                z = aVar.c;
            }
            boolean z5 = z;
            if ((i & 8) != 0) {
                z2 = aVar.d;
            }
            boolean z6 = z2;
            if ((i & 16) != 0) {
                z3 = aVar.e;
            }
            aVar.getClass();
            return new a(methodSelectorCodeState2, z4, z5, z6, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            MethodSelectorCodeState methodSelectorCodeState = this.a;
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b((methodSelectorCodeState == null ? 0 : methodSelectorCodeState.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ButtonContainerState(codeState=");
            sb.append(this.a);
            sb.append(", isConfirmAnotherWayVisible=");
            sb.append(this.b);
            sb.append(", isContinueVisible=");
            sb.append(this.c);
            sb.append(", isContinueEnable=");
            sb.append(this.d);
            sb.append(", isInErrorState=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        public /* synthetic */ a(int i) {
            this(null, (i & 2) == 0, false, false, false);
        }

        public a(MethodSelectorCodeState methodSelectorCodeState, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = methodSelectorCodeState;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }
    }

    public pj20(ConstraintLayout constraintLayout, com.vk.movika.sdk.base.ui.f fVar, y01 y01Var, w5 w5Var) {
        this.a = fVar;
        this.b = y01Var;
        this.c = w5Var;
        this.d = (TextView) constraintLayout.findViewById(R.id.retry_button);
        this.e = (TextView) constraintLayout.findViewById(R.id.info_text);
        this.f = (VkLoadingButton) constraintLayout.findViewById(R.id.continue_btn);
        this.g = constraintLayout.findViewById(R.id.login_by_password);
        this.h = (VkGradientButton) constraintLayout.findViewById(R.id.max_messenger_gradient_open_button);
        Button button = (Button) constraintLayout.findViewById(R.id.vk_enter_by_mail);
        sp.t(button);
        jjc.f(y01Var, button);
        this.i = button;
        this.j = SakFeatures.Type.SAK_MAX_AUTH_TIMER_ANDROID.h();
        this.k = new a020();
        this.m = new a(31);
        b(new a(16));
    }

    public final void a() {
        TextView textView = this.d;
        textView.setText(R.string.vk_auth_confirm_another_way);
        jjc.f(this.a.invoke(), textView);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_accent, textView.getContext()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(a aVar) {
        int i;
        boolean z;
        Bundle bundle;
        boolean z2 = aVar.d;
        VkLoadingButton vkLoadingButton = this.f;
        vkLoadingButton.setEnabled(z2);
        MethodSelectorCodeState methodSelectorCodeState = aVar.a;
        boolean z3 = methodSelectorCodeState instanceof MethodSelectorCodeState.MethodSelectorWithTimerCodeState;
        TextView textView = this.d;
        if (z3 && this.j) {
            Long e = ((MethodSelectorCodeState.MethodSelectorWithTimerCodeState) methodSelectorCodeState).e();
            if (e != null) {
                textView.setTextColor(e3m.f(R.attr.vk_ui_text_tertiary, textView.getContext()));
                if (e.longValue() <= System.currentTimeMillis()) {
                    a();
                } else {
                    long longValue = e.longValue();
                    CountDownTimer countDownTimer = this.l;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    this.l = null;
                    textView.setClickable(false);
                    textView.setEnabled(false);
                    long currentTimeMillis = longValue - System.currentTimeMillis();
                    if (currentTimeMillis <= 0) {
                        a();
                        textView.setClickable(true);
                        textView.setEnabled(true);
                    } else {
                        c(currentTimeMillis);
                        this.l = new qj20(currentTimeMillis, this).start();
                    }
                }
            } else {
                a();
            }
        } else {
            a();
        }
        f4m.j(this.g);
        f4m.j(this.e);
        boolean z4 = methodSelectorCodeState instanceof MethodSelectorCodeState.Loading;
        if (!z4 && !(methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) {
            try {
                bundle = q55.c().a.K;
            } catch (Throwable unused) {
                bundle = null;
            }
            if (bundle != null) {
                VkEmailForwardingConfig d = m63.d(bundle);
                boolean z5 = d != null && d.b;
                MailAuthFlowConfig e2 = m63.e(bundle);
                if ((e2 != null && e2.c) || z5) {
                    i = 0;
                    this.i.setVisibility(i);
                    vkLoadingButton.setVisibility(!aVar.c ? 0 : 8);
                    textView.setVisibility((!z4 || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) ? false : aVar.b ? 0 : 8);
                    z = methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode;
                    VkGradientButton vkGradientButton = this.h;
                    if (z) {
                        MethodSelectorCodeState.MaxOtpCode maxOtpCode = (MethodSelectorCodeState.MaxOtpCode) methodSelectorCodeState;
                        if (maxOtpCode.g) {
                            vkGradientButton.setVisibility(0);
                            jjc.g(vkGradientButton, new ut6(20, this, methodSelectorCodeState));
                            if (maxOtpCode.h) {
                                vkGradientButton.setTextColorful(true);
                                vkGradientButton.getBackgroundDrawable().setColors(null);
                                vkGradientButton.setBackgroundColorful(true);
                            } else {
                                vkGradientButton.setTextTint(R.attr.vk_ui_text_contrast);
                                int[] iArr = {n8g.l(6476543, 255), n8g.l(1191410, 255), n8g.l(11292359, 255)};
                                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TL_BR;
                                vkGradientButton.getBackgroundDrawable().setColors(iArr);
                                vkGradientButton.getBackgroundDrawable().setOrientation(orientation);
                                vkGradientButton.setBackgroundColorful(false);
                            }
                            this.m = aVar;
                        }
                    }
                    f4m.j(vkGradientButton);
                    this.m = aVar;
                }
            }
        }
        i = 8;
        this.i.setVisibility(i);
        vkLoadingButton.setVisibility(!aVar.c ? 0 : 8);
        textView.setVisibility((!z4 || (methodSelectorCodeState instanceof MethodSelectorCodeState.LibverifyMobileId)) ? false : aVar.b ? 0 : 8);
        z = methodSelectorCodeState instanceof MethodSelectorCodeState.MaxOtpCode;
        VkGradientButton vkGradientButton2 = this.h;
        if (z) {
        }
        f4m.j(vkGradientButton2);
        this.m = aVar;
    }

    public final void c(long j) {
        long j2 = j / 1000;
        long j3 = 60;
        this.d.setText(String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2 / j3), Long.valueOf(j2 % j3)}, 2)));
    }
}
