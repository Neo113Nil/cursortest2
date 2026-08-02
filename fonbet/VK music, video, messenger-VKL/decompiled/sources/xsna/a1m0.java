package xsna;

import android.text.Editable;
import com.vk.core.view.components.formitem.VkInputSelect;

/* compiled from: StoryCreateQuestionDialog.kt */
/* loaded from: classes16.dex */
public final class a1m0 extends rno0 {
    public String b = "";
    public int c;
    public final /* synthetic */ b1m0 d;
    public final /* synthetic */ VkInputSelect e;

    public a1m0(b1m0 b1m0Var, VkInputSelect vkInputSelect) {
        this.d = b1m0Var;
        this.e = vkInputSelect;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ucp ucpVar = ucp.a;
        ucp.i(editable);
        VkInputSelect vkInputSelect = this.e;
        if (vkInputSelect.getLineCount() > 4) {
            this.c = vkInputSelect.getSelectionStart();
            vkInputSelect.setText(this.b);
            Editable text = vkInputSelect.getText();
            if (text == null) {
                return;
            }
            if (this.c <= text.length()) {
                vkInputSelect.setSelection(this.c - 1);
            } else {
                vkInputSelect.setSelection(text.length());
            }
        }
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b = charSequence.toString();
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        c1m0 c1m0Var = this.d.t;
        if (c1m0Var == null) {
            return;
        }
        vb7 vb7Var = c1m0Var.d;
        w0m0 w0m0Var = (w0m0) c1m0Var.b;
        w0m0Var.jb(charSequence.length() == 0 || myc0.f(drm0.p0(charSequence)));
        w0m0Var.D7(myc0.f(charSequence));
        if (charSequence.length() != 0) {
            w0m0Var.L6("");
            return;
        }
        xpk xpkVar = (xpk) vb7Var.b;
        int i4 = xpkVar.d;
        while (true) {
            int l = qz9.b(System.currentTimeMillis()).l(0, xpkVar.a.length);
            if (xpkVar.d != l) {
                xpkVar.a(l);
                if (i4 != xpkVar.d) {
                    w0m0Var.L6((String) vb7Var.c);
                    return;
                }
            }
        }
    }
}
