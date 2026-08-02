package defpackage;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class a6f extends h {
    @Override // androidx.recyclerview.widget.h, androidx.recyclerview.widget.b1
    public final boolean o(x0 x0Var) {
        if ((x0Var instanceof ceu ? (ceu) x0Var : null) != null) {
            ceu ceuVar = (ceu) x0Var;
            ceuVar.s();
            EditText d = ceuVar.d();
            ((InputMethodManager) d.getContext().getSystemService("input_method")).showSoftInput(d, 1);
        }
        super.o(x0Var);
        return true;
    }
}
