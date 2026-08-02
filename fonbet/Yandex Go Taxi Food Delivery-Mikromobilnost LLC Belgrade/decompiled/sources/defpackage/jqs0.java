package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes6.dex */
public final class jqs0 extends AccessibilityDelegateCompat {
    public boolean a;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        whVar.n(this.a ? 1 : 0);
        whVar.q(!this.a);
        whVar.v(true);
        whVar.p("android.widget.CheckBox");
        whVar.D(view.getContext().getString(this.a ? kyh0.content_description_selected : kyh0.content_description_unselected));
    }
}
