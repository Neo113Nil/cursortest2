package xsna;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.core.view.components.button.VkButton;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PasswordMethodSelectorFragment.kt */
/* loaded from: classes15.dex */
public class mm90 extends cj6 {
    public final int B = R.layout.vk_auth_fullscreen_password;
    public final Object C = msy.a(LazyThreadSafetyMode.NONE, new ag20(this, 18));
    public final sj20 D = new sj20(new m1y(this, 23), new q130(this, 11));
    public final zj20 E = new zj20();
    public final boolean F = true;

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

    @Override // xsna.lm90
    public final void i2() {
        hg1.a(this.E.a(requireContext(), new x750(this, 8)), this);
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        Bundle requireArguments = requireArguments();
        return new nm90(requireArguments != null ? (FullscreenPasswordData) requireArguments.getParcelable("PASSWORD_METHOD_SELECTOR_DATA") : null);
    }

    @Override // xsna.a66
    public final boolean vn() {
        return this.F;
    }

    @Override // xsna.cj6
    public final int yn() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0.c == true) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 != false) goto L23;
     */
    @Override // xsna.cj6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zn(View view) {
        Bundle bundle;
        int i;
        VkButton vkButton = (VkButton) view.findViewById(R.id.vk_enter_by_mail);
        if (vkButton != null) {
            try {
                q55 q55Var = q55.a;
                bundle = q55.c().a.K;
            } catch (Throwable unused) {
                bundle = null;
            }
            if (bundle != null) {
                VkEmailForwardingConfig d = m63.d(bundle);
                i = 0;
                boolean z = d != null && d.b;
                MailAuthFlowConfig e = m63.e(bundle);
                if (e != null) {
                }
            }
            i = 8;
            vkButton.setVisibility(i);
            jjc.g(vkButton, new o010(this, 25));
        }
    }
}
