package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class hme0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ ime0 a;

    public hme0(ime0 ime0Var) {
        this.a = ime0Var;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        ime0 ime0Var = this.a;
        ime0Var.w.onInitializeAccessibilityNodeInfo(view, whVar);
        RecyclerView recyclerView = ime0Var.c;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter instanceof ame0) {
            ((ame0) adapter).h(childAdapterPosition);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.w.performAccessibilityAction(view, i, bundle);
    }
}
