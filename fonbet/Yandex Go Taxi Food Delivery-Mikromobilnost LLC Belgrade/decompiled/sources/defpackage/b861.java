package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final class b861 implements zo31 {
    public final FrameLayout a;
    public final BottomSheetDialogView b;

    public b861(FrameLayout frameLayout, BottomSheetDialogView bottomSheetDialogView) {
        this.a = frameLayout;
        this.b = bottomSheetDialogView;
    }

    public static b861 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(doh0.ybsdk_screen_savings_diff_rate_calendar, viewGroup, false);
        int i = tbh0.diff_rate_calendar_sheet;
        BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) cma1.O(i, inflate);
        if (bottomSheetDialogView != null) {
            return new b861((FrameLayout) inflate, bottomSheetDialogView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
