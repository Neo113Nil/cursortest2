package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes8.dex */
public final class m451 extends AccessibilityDelegateCompat {
    public final /* synthetic */ eg20 a;
    public final /* synthetic */ n451 b;

    public m451(eg20 eg20Var, n451 n451Var) {
        this.a = eg20Var;
        this.b = n451Var;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        eg20 eg20Var = this.a;
        if (eg20Var.getAction() == null) {
            whVar.p(this.b.a().getAccessibilityClassName());
        } else {
            whVar.p(g451.class.getName());
            whVar.b(new ph(16, eg20Var.getContentDescription().c));
        }
    }
}
