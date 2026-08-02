package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes10.dex */
public abstract class cdj extends AccessibilityDelegateCompat {
    public abstract void a();

    public abstract boolean b();

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        if (!b()) {
            whVar.u(false);
        } else {
            whVar.a(1048576);
            whVar.u(true);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i != 1048576 || !b()) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        a();
        return true;
    }
}
