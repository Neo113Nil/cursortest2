package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes11.dex */
public final class fi extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ fi(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.CheckBox");
                whVar.m(true);
                whVar.o(z);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(z ? ph.n : ph.m);
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.a) {
            case 1:
                if (i != ph.n.a() && i != ph.m.a()) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                view.performClick();
                return true;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
