package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;

/* loaded from: classes3.dex */
public final class mx21 extends RecyclerView.g {
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = 0;
        while (true) {
            if (!(i3 < recyclerView.getChildCount())) {
                return;
            }
            int i4 = i3 + 1;
            View childAt = recyclerView.getChildAt(i3);
            if (childAt == null) {
                ny61.s();
                return;
            }
            YbDivView ybDivView = childAt instanceof YbDivView ? (YbDivView) childAt : null;
            if (ybDivView != null) {
                ybDivView.tryLogVisibility();
            }
            i3 = i4;
        }
    }
}
