package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import ru.yandex.taxi.summary.requirements.list.ui.RequirementCheckComponent;

/* loaded from: classes6.dex */
public final class pdj0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ RequirementCheckComponent a;

    public pdj0(RequirementCheckComponent requirementCheckComponent) {
        this.a = requirementCheckComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        z = this.a.isChecked;
        accessibilityEvent.setChecked(z);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.m(true);
        z = this.a.isChecked;
        whVar.n(z ? 1 : 0);
        whVar.p("android.widget.CheckBox");
    }
}
