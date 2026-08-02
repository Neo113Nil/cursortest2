package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextView.kt */
/* loaded from: classes5.dex */
public final class efc implements TextWatcher {
    public final /* synthetic */ ffc b;
    public final /* synthetic */ l5 c;

    public efc(ffc ffcVar, l5 l5Var) {
        this.b = ffcVar;
        this.c = l5Var;
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
