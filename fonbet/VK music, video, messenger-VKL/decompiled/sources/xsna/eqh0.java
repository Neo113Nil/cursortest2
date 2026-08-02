package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextView.kt */
/* loaded from: classes5.dex */
public final class eqh0 implements TextWatcher {
    public final /* synthetic */ bqh0 b;
    public final /* synthetic */ e5 c;

    public eqh0(bqh0 bqh0Var, e5 e5Var) {
        this.b = bqh0Var;
        this.c = e5Var;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.b.m) {
            return;
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        this.c.invoke(obj);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
