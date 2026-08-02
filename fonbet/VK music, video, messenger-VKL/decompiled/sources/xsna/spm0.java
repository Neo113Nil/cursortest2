package xsna;

import android.os.StrictMode;
import android.os.strictmode.Violation;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class spm0 implements StrictMode.OnThreadViolationListener {
    @Override // android.os.StrictMode.OnThreadViolationListener
    public final void onThreadViolation(Violation violation) {
        upm0.a.getClass();
        upm0.a(violation);
    }
}
