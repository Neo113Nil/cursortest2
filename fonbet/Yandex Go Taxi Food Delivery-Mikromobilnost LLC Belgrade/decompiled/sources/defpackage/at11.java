package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes6.dex */
public final class at11 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ""));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
        }
    }
}
