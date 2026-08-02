package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.z0;

/* loaded from: classes11.dex */
public final class eh11 extends z0 {
    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, 0, false));
    }
}
