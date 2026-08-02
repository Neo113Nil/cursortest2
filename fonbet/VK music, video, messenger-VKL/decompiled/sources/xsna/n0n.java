package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DisclaimerAccessibilityHoverHelper.kt */
/* loaded from: classes4.dex */
public final class n0n implements u3r {
    public static boolean b(View view, MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (isEnabled && isTouchExplorationEnabled) {
            if (c1n.a.contains((int) motionEvent.getX(), view.getTop() + ((int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.u3r
    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (isEnabled && isTouchExplorationEnabled && c1n.a.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            int childCount = recyclerView.getChildCount() - 1;
            while (true) {
                if (-1 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(childCount);
                if (childAt.getBottom() <= c1n.a.top) {
                    Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                    o0n o0nVar = childViewHolder instanceof o0n ? (o0n) childViewHolder : null;
                    if (o0nVar != null) {
                        o0nVar.a5();
                        return true;
                    }
                } else {
                    childCount--;
                }
            }
        }
        return false;
    }
}
