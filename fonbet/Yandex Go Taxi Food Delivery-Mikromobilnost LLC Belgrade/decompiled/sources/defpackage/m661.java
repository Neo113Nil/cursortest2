package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final class m661 implements zo31 {
    public final FrameLayout a;
    public final BottomSheetDialogView b;
    public final ToolbarView c;
    public final LinearLayout d;

    public m661(FrameLayout frameLayout, BottomSheetDialogView bottomSheetDialogView, ToolbarView toolbarView, LinearLayout linearLayout) {
        this.a = frameLayout;
        this.b = bottomSheetDialogView;
        this.c = toolbarView;
        this.d = linearLayout;
    }

    public static m661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(cnh0.ybsdk_screen_change_payment_method, viewGroup, false);
        int i = uah0.change_payment_method_sheet;
        BottomSheetDialogView bottomSheetDialogView = (BottomSheetDialogView) cma1.O(i, inflate);
        if (bottomSheetDialogView != null) {
            i = uah0.web3dsToolbar;
            ToolbarView toolbarView = (ToolbarView) cma1.O(i, inflate);
            if (toolbarView != null) {
                i = uah0.web3dsViewContainer;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    return new m661((FrameLayout) inflate, bottomSheetDialogView, toolbarView, linearLayout);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
