package xsna;

import android.text.Editable;
import android.widget.TextView;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkAuthExtendedEditText;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vkontakte.android.R;

/* compiled from: CodeViewDelegate.kt */
/* loaded from: classes15.dex */
public final class fzf {
    public final VkAuthErrorStatedEditText a;
    public final TextView b;
    public final VkCheckEditText c;
    public final VkAuthExtendedEditText d;
    public boolean e;

    public fzf(VkAuthErrorStatedEditText vkAuthErrorStatedEditText, TextView textView, VkCheckEditText vkCheckEditText, VkAuthExtendedEditText vkAuthExtendedEditText) {
        this.a = vkAuthErrorStatedEditText;
        this.b = textView;
        this.c = vkCheckEditText;
        this.d = vkAuthExtendedEditText;
    }

    public final void a(String str) {
        if (this.e) {
            VkCheckEditText vkCheckEditText = this.c;
            vkCheckEditText.setText(str);
            vkCheckEditText.setSelection(str.length());
        } else {
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.a;
            vkAuthErrorStatedEditText.setText(str);
            Editable text = vkAuthErrorStatedEditText.getText();
            vkAuthErrorStatedEditText.setSelection(text != null ? text.length() : 0);
        }
    }

    public final void b(boolean z) {
        this.a.setEnabled(z);
        this.c.setIsEnabled(z);
    }

    public final void c() {
        if (this.e) {
            VkCheckEditText vkCheckEditText = this.c;
            vkCheckEditText.h(vkCheckEditText.getContext().getString(R.string.vk_auth_wrong_code));
            d();
        } else {
            this.b.setVisibility(0);
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.a;
            vkAuthErrorStatedEditText.setErrorState(true);
            vkAuthErrorStatedEditText.postDelayed(new o1(this, 6), 150L);
        }
    }

    public final void d() {
        if (this.e) {
            this.c.postDelayed(new tv9(this, 1), 150L);
        } else {
            bpn0 bpn0Var = t65.a;
            t65.a(this.a);
        }
    }

    public final void e(boolean z, boolean z2) {
        TextView textView = this.b;
        VkCheckEditText vkCheckEditText = this.c;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.a;
        if (z && z2) {
            f4m.j(vkAuthErrorStatedEditText);
            f4m.j(textView);
            vkCheckEditText.setVisibility(0);
        } else if (!z && z2) {
            f4m.j(vkCheckEditText);
            vkCheckEditText.e();
            vkAuthErrorStatedEditText.setVisibility(0);
        } else {
            f4m.j(vkCheckEditText);
            vkCheckEditText.e();
            f4m.j(vkAuthErrorStatedEditText);
            f4m.j(textView);
        }
    }
}
