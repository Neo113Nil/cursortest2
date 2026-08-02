package xsna;

import android.view.View;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker.MediaPickerBottomSheetBehavior;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class hnc0 extends hk {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ enc0 c;
    public final /* synthetic */ int d;

    public hnc0(boolean z, enc0 enc0Var, int i) {
        this.b = z;
        this.c = enc0Var;
        this.d = i;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        boolean z = this.b;
        int i = this.d;
        enc0 enc0Var = this.c;
        if (z) {
            MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior = enc0Var.A;
            if (mediaPickerBottomSheetBehavior == null || mediaPickerBottomSheetBehavior.k != i) {
                return;
            }
            super.onInitializeAccessibilityNodeInfo(view, amVar);
            return;
        }
        MediaPickerBottomSheetBehavior mediaPickerBottomSheetBehavior2 = enc0Var.A;
        if (mediaPickerBottomSheetBehavior2 == null || mediaPickerBottomSheetBehavior2.k != i) {
            super.onInitializeAccessibilityNodeInfo(view, amVar);
        }
    }
}
