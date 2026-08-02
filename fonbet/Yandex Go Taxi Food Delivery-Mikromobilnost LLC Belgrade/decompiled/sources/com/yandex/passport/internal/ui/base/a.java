package com.yandex.passport.internal.ui.base;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends BottomSheetBehavior.a {
    public final /* synthetic */ BaseBottomSheetDialogFragment a;

    public a(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        this.a = baseBottomSheetDialogFragment;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onSlide(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
    public final void onStateChanged(View view, int i) {
        if (i == 4 || i == 5) {
            BaseBottomSheetDialogFragment baseBottomSheetDialogFragment = this.a;
            baseBottomSheetDialogFragment.onCancel(baseBottomSheetDialogFragment.getDialog());
        }
    }
}
