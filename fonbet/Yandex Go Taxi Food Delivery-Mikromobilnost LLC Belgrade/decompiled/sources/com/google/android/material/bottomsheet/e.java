package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class e extends BottomSheetBehavior.a {
    public final /* synthetic */ BottomSheetDialogFragment a;

    public e(BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.a = bottomSheetDialogFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            this.a.dismissAfterAnimation();
        }
    }
}
