package xsna;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: TextView.kt */
/* loaded from: classes4.dex */
public final class efo0 implements TextWatcher {
    public final /* synthetic */ ffo0 b;

    public efo0(ffo0 ffo0Var) {
        this.b = ffo0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ?? r0 = this.b.b;
        String obj = editable != null ? editable.toString() : null;
        if (obj == null) {
            obj = "";
        }
        r0.invoke(new ieo0(obj));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
