package xsna;

import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* compiled from: PlatformAutofillManager.android.kt */
/* loaded from: classes11.dex */
public final class gta0 {
    public final AutofillManager a;

    public gta0(AutofillManager autofillManager) {
        this.a = autofillManager;
    }

    public final void a(p52 p52Var, int i, AutofillValue autofillValue) {
        this.a.notifyValueChanged(p52Var, i, autofillValue);
    }

    public final void b(View view, int i, boolean z) {
        this.a.notifyViewVisibilityChanged(view, i, z);
    }
}
