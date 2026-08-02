package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class f extends BottomSheetBehavior.a {
    public final /* synthetic */ BottomSheetDragHandleView a;

    public f(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.a = bottomSheetDragHandleView;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        this.a.onBottomSheetStateChanged(i);
    }
}
