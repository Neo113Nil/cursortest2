package xsna;

import android.text.Editable;

/* compiled from: AndroidVkUiEditText.kt */
/* loaded from: classes4.dex */
public final class oe2 extends rno0 {
    public final /* synthetic */ le2 b;

    public oe2(le2 le2Var) {
        this.b = le2Var;
    }

    @Override // xsna.rno0, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ucp ucpVar = ucp.a;
        this.b.invoke(ucp.i(editable).toString());
    }
}
