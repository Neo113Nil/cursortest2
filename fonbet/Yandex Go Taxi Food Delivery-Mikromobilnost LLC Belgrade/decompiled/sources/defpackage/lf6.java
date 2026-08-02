package defpackage;

import android.view.View;
import com.ybsdk.core.design.coordinator.AnchorBottomSheetBehavior;
import com.ybsdk.core.design.widget.SlideableModalView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public final class lf6 implements uns0 {
    public final /* synthetic */ BottomSheetDialogView a;

    public lf6(BottomSheetDialogView bottomSheetDialogView) {
        this.a = bottomSheetDialogView;
    }

    @Override // defpackage.uns0
    public final boolean canSlideFrom(float f, float f2) {
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        View view;
        BottomSheetDialogView bottomSheetDialogView = this.a;
        anchorBottomSheetBehavior = ((SlideableModalView) bottomSheetDialogView).bottomSheetBehavior;
        if (anchorBottomSheetBehavior.E == 4) {
            return false;
        }
        view = ((SlideableModalView) bottomSheetDialogView).cardContentView;
        return f2 >= ((float) view.getTop()) && f2 <= ((float) bottomSheetDialogView.root.getHeight());
    }
}
