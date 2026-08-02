package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.wh;

/* loaded from: classes.dex */
public class z0 extends AccessibilityDelegateCompat {
    public final RecyclerView a;
    public final y0 b;

    public z0(RecyclerView recyclerView) {
        this.a = recyclerView;
        AccessibilityDelegateCompat a = a();
        if (a == null || !(a instanceof y0)) {
            this.b = new y0(this);
        } else {
            this.b = (y0) a;
        }
    }

    public AccessibilityDelegateCompat a() {
        return this.b;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.a.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        RecyclerView recyclerView = this.a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.e layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.L0(recyclerView2.mRecycler, recyclerView2.mState, whVar);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().Z0(i, bundle);
    }
}
