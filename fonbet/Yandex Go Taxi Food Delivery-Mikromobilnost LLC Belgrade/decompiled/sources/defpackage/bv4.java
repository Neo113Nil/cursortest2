package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z0;

/* loaded from: classes11.dex */
public final class bv4 extends z0 {
    public final RecyclerView c;

    public bv4(RecyclerView recyclerView) {
        super(recyclerView);
        this.c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.z0
    public final AccessibilityDelegateCompat a() {
        return new fh(this, 1);
    }

    public final int b() {
        RecyclerView.Adapter adapter = this.c.getAdapter();
        wo10 wo10Var = adapter instanceof wo10 ? (wo10) adapter : null;
        if (wo10Var != null) {
            return wo10Var.w.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        int b = b();
        if (b != 0) {
            accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex() % b);
            accessibilityEvent.setToIndex(accessibilityEvent.getToIndex() % b);
            accessibilityEvent.setItemCount(b);
        }
    }

    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = whVar.a.getCollectionInfo();
        th thVar = null;
        th thVar2 = collectionInfo != null ? new th(collectionInfo) : null;
        int b = b();
        if (b == 0) {
            thVar = thVar2;
        } else if (thVar2 != null) {
            AccessibilityNodeInfo.CollectionInfo collectionInfo2 = (AccessibilityNodeInfo.CollectionInfo) thVar2.a;
            thVar = th.a(Math.max(1, collectionInfo2.getRowCount() % b), Math.max(1, collectionInfo2.getColumnCount() % b), collectionInfo2.getSelectionMode(), collectionInfo2.isHierarchical());
        }
        whVar.r(thVar);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        int b = b();
        if (b != 0) {
            accessibilityEvent.setFromIndex(accessibilityEvent.getFromIndex() % b);
            accessibilityEvent.setToIndex(accessibilityEvent.getToIndex() % b);
            accessibilityEvent.setItemCount(b);
        }
    }
}
