package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* compiled from: TextView.kt */
/* loaded from: classes2.dex */
public final class y4w implements TextWatcher {
    public final /* synthetic */ z4w b;

    public y4w(z4w z4wVar) {
        this.b = z4wVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        Button button = this.b.d;
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
        button.setEnabled(i >= 11);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
