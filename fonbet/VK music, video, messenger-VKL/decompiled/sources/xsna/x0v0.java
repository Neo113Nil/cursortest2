package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextView.kt */
/* loaded from: classes17.dex */
public final class x0v0 implements TextWatcher {
    public final /* synthetic */ e220 b;

    public x0v0(e220 e220Var) {
        this.b = e220Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.b.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
