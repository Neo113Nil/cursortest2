package com.yandex.go.scooters.design.coordinator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/scooters/design/coordinator/BottomSheetBottomStickyContainerWithOffsetBehavior;", "Lcom/yandex/go/scooters/design/coordinator/BottomSheetBottomStickyContainerBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomSheetBottomStickyContainerWithOffsetBehavior extends BottomSheetBottomStickyContainerBehavior {
    public BottomSheetBottomStickyContainerWithOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.yandex.go.scooters.design.coordinator.BottomSheetBottomStickyContainerBehavior
    public final int v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, View view4) {
        coordinatorLayout.getHeight();
        view2.getTop();
        return super.v(coordinatorLayout, view, view2, view3, view4);
    }
}
