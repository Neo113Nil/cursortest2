package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextView.kt */
/* loaded from: classes17.dex */
public final class w0v0 implements TextWatcher {
    public final /* synthetic */ izs b;

    public w0v0(izs izsVar) {
        this.b = izsVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.b.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
