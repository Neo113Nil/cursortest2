package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.z0;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;

/* loaded from: classes11.dex */
public final class n850 extends z0 {
    public final /* synthetic */ NavigationMenuPresenter c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n850(NavigationMenuPresenter navigationMenuPresenter, NavigationMenuView navigationMenuView) {
        super(navigationMenuView);
        this.c = navigationMenuPresenter;
    }

    @Override // androidx.recyclerview.widget.z0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        NavigationMenuPresenter navigationMenuPresenter = this.c.x.w;
        int i = 0;
        for (int i2 = 0; i2 < navigationMenuPresenter.x.a.size(); i2++) {
            int itemViewType = navigationMenuPresenter.x.getItemViewType(i2);
            if (itemViewType == 0 || itemViewType == 1) {
                i++;
            }
        }
        whVar.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false));
    }
}
