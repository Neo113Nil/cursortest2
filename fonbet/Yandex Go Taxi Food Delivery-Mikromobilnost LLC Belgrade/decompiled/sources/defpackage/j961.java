package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes2.dex */
public final class j961 implements zo31 {
    public final FrameLayout a;
    public final BottomSheetDialogView b;

    public j961(FrameLayout frameLayout, BottomSheetDialogView bottomSheetDialogView) {
        this.a = frameLayout;
        this.b = bottomSheetDialogView;
    }

    public static j961 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(qmh0.ybsdk_topup_notice_deprecated, (ViewGroup) null, false);
        int i = jah0.topupNoticeDeprecatedBottomSheet;
        BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) cma1.O(i, inflate);
        if (bottomSheetDialogView != null) {
            return new j961((FrameLayout) inflate, bottomSheetDialogView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
