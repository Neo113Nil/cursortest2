package xsna;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.LazyThreadSafetyMode;

/* compiled from: InputMethodManager.android.kt */
/* loaded from: classes11.dex */
public final class j2x implements h2x {
    public final View a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new qbj(this, 17));

    public j2x(View view) {
        this.a = view;
    }

    @Override // xsna.h2x
    public final void a() {
        if (Build.VERSION.SDK_INT >= 34) {
            b().startStylusHandwriting(this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final InputMethodManager b() {
        return (InputMethodManager) this.b.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        b().updateSelection(this.a, i, i2, i3, i4);
    }
}
