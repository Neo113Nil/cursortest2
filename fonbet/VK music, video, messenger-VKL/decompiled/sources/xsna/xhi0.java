package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: TextView.kt */
/* loaded from: classes7.dex */
public final class xhi0 implements TextWatcher {
    public final /* synthetic */ AppCompatTextView b;

    public xhi0(AppCompatTextView appCompatTextView) {
        this.b = appCompatTextView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.setEnabled(editable != null ? !drm0.N(editable) : false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
