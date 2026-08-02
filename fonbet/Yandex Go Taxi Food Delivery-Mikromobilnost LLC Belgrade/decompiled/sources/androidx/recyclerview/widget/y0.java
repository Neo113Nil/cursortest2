package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import defpackage.wh;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class y0 extends AccessibilityDelegateCompat {
    public final z0 a;
    public final WeakHashMap b = new WeakHashMap();

    public y0(z0 z0Var) {
        this.a = z0Var;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        z0 z0Var = this.a;
        RecyclerView recyclerView = z0Var.a;
        RecyclerView recyclerView2 = z0Var.a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
            return;
        }
        recyclerView2.getLayoutManager().M0(view, whVar);
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, whVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(viewGroup);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        z0 z0Var = this.a;
        RecyclerView recyclerView = z0Var.a;
        RecyclerView recyclerView2 = z0Var.a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            if (accessibilityDelegateCompat.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        r0 r0Var = recyclerView2.getLayoutManager().b.mRecycler;
        return false;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEvent(View view, int i) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.b.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
