package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z0;

/* loaded from: classes8.dex */
public final class n6q0 extends z0 {
    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        RecyclerView recyclerView;
        View childAt;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, 0, false));
        if ((view instanceof RecyclerView) && (childAt = (recyclerView = (RecyclerView) view).getChildAt(0)) != null && recyclerView.getChildAdapterPosition(childAt) == 0 && childAt.getTop() >= 0) {
            whVar.i(ph.l);
        }
    }
}
