package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public abstract class cj91 {
    public static final qir a = new qir(17);

    public static final void b(View view) {
        view.setEnabled(false);
        view.setClickable(false);
        view.setFocusable(true);
        view.setFocusableInTouchMode(false);
        view.setImportantForAccessibility(1);
        view.setAccessibilityLiveRegion(0);
        if (view instanceof ViewGroup) {
            h8 h8Var = new h8(3, (ViewGroup) view);
            while (h8Var.hasNext()) {
                b((View) h8Var.next());
            }
        }
    }
}
