package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: classes11.dex */
public final /* synthetic */ class mhu implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ CoordinatorLayout.a c;

    public /* synthetic */ mhu(CoordinatorLayout.a aVar, View view, int i) {
        this.a = i;
        this.c = aVar;
        this.b = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        int i = this.a;
        View view = this.b;
        CoordinatorLayout.a aVar = this.c;
        switch (i) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) aVar;
                int i2 = HideBottomViewOnScrollBehavior.H;
                if (z && hideBottomViewOnScrollBehavior.C == 1) {
                    hideBottomViewOnScrollBehavior.v(view, true);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) aVar;
                if (hideViewOnScrollBehavior.w && z && hideViewOnScrollBehavior.D == 1) {
                    hideViewOnScrollBehavior.v(view);
                    break;
                }
                break;
        }
    }
}
