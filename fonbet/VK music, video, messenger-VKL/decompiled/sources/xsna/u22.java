package xsna;

import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: AndroidAutofill.android.kt */
/* loaded from: classes11.dex */
public final class u22 implements ho5 {
    public final p52 a;
    public final no5 b;
    public final AutofillManager c;
    public final AutofillId d;

    public u22(p52 p52Var, no5 no5Var) {
        this.a = p52Var;
        this.b = no5Var;
        AutofillManager autofillManager = (AutofillManager) p52Var.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManager;
        p52Var.setImportantForAutofill(1);
        AutofillId autofillId = p52Var.getAutofillId();
        if (autofillId == null) {
            throw pm0.f("Required value was null.");
        }
        this.d = autofillId;
    }
}
