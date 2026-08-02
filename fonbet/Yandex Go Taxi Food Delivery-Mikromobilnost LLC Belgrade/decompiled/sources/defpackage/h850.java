package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import com.google.android.material.internal.NavigationMenuPresenter;

/* loaded from: classes11.dex */
public final class h850 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ i850 c;

    public h850(i850 i850Var, int i, boolean z) {
        this.c = i850Var;
        this.a = i;
        this.b = z;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        NavigationMenuPresenter navigationMenuPresenter = this.c.w;
        int i = this.a;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (navigationMenuPresenter.x.getItemViewType(i3) == 2 || navigationMenuPresenter.x.getItemViewType(i3) == 3) {
                i2--;
            }
        }
        whVar.s(uh.a(i2, 1, 1, 1, this.b, view.isSelected()));
    }
}
