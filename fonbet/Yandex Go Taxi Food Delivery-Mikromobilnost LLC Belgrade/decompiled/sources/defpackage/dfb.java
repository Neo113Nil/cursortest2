package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes9.dex */
public final class dfb extends AccessibilityDelegateCompat {
    public boolean a;
    public boolean b = true;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.v(this.b);
        whVar.n(this.a ? 1 : 0);
        whVar.p("android.widget.CheckBox");
    }
}
