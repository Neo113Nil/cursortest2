package xsna;

import android.text.Editable;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.id.UserId;

/* compiled from: PostingMentionEditTextHelper.kt */
/* loaded from: classes4.dex */
public final class dhc0 implements q320 {
    public final VkInputSelect b;
    public final mnc0 c;
    public final q420 d;

    public dhc0(VkInputSelect vkInputSelect, mnc0 mnc0Var, q420 q420Var) {
        this.b = vkInputSelect;
        this.c = mnc0Var;
        this.d = q420Var;
    }

    @Override // xsna.q320
    public final void Q(UserId userId, String str, boolean z) {
        this.d.Q(userId, str, z);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.d.afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = charSequence == null || charSequence.length() == 0;
        q420 q420Var = this.d;
        q420Var.k = z;
        mnc0 mnc0Var = this.c;
        if (charSequence == null || charSequence.length() == 0) {
            mnc0Var.Y0();
            return;
        }
        VkInputSelect vkInputSelect = this.b;
        String valueOf = String.valueOf(vkInputSelect.getText());
        int length = q420Var.k ? valueOf.length() : vkInputSelect.getSelectionEnd();
        q420Var.j = yjo0.g(length - 1, valueOf);
        int i4 = q420Var.j;
        if (i4 <= 0 || valueOf.charAt(i4 - 1) == ' ') {
            int i5 = q420Var.j;
            if (q420Var.c(i5 <= 0 ? i5 : i5 - 1, i5 + 2 < charSequence.length() ? q420Var.j + 2 : q420Var.j)) {
                return;
            }
            int i6 = q420Var.j;
            if (i6 < 0) {
                mnc0Var.Y0();
                return;
            }
            String substring = valueOf.substring(i6 + 1, length);
            for (int i7 = 0; i7 < substring.length(); i7++) {
                if (ro.j(substring.charAt(i7))) {
                    return;
                }
            }
            mnc0Var.x0(substring);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
