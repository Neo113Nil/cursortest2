package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class c extends BottomSheetBehavior.a {
    public final /* synthetic */ BottomSheetDialog a;

    public c(BottomSheetDialog bottomSheetDialog) {
        this.a = bottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 5) {
            this.a.cancel();
        }
    }
}
