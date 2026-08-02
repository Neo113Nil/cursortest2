package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.im.ui.views.buttons.VkButtonWithSmallScreenSupport;

/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class zew implements TextWatcher {
    public final /* synthetic */ afw b;

    public zew(afw afwVar) {
        this.b = afwVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        VkButtonWithSmallScreenSupport vkButtonWithSmallScreenSupport = this.b.d;
        if (editable != null) {
            StringBuilder sb = new StringBuilder();
            int length = editable.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = editable.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            i = sb.length();
        } else {
            i = 0;
        }
        vkButtonWithSmallScreenSupport.setEnabled(i >= 11);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
