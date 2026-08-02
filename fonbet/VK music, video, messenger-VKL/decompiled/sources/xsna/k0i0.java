package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: SearchViewWrapper.java */
/* loaded from: classes7.dex */
public final class k0i0 implements TextWatcher {
    public final /* synthetic */ l0i0 b;

    public k0i0(l0i0 l0i0Var) {
        this.b = l0i0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z = editable.length() > 0;
        l0i0 l0i0Var = this.b;
        if (!z) {
            l0i0Var.a.b(null);
        }
        l0i0Var.a.a(editable.toString());
        z zVar = l0i0Var.b;
        if (zVar != null) {
            l0i0Var.h.removeCallbacks(zVar);
        }
        if (z) {
            z zVar2 = new z(6, this, editable);
            l0i0Var.b = zVar2;
            l0i0Var.h.postDelayed(zVar2, 400);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
