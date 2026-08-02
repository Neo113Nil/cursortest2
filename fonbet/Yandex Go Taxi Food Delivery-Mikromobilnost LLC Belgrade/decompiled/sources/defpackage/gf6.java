package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public final /* synthetic */ class gf6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogView b;

    public /* synthetic */ gf6(BottomSheetDialogView bottomSheetDialogView, int i) {
        this.a = i;
        this.b = bottomSheetDialogView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.b;
        switch (i) {
            case 0:
                BottomSheetDialogView.show$lambda$8(bottomSheetDialogView);
                break;
            case 1:
                BottomSheetDialogView.render$lambda$4$lambda$3(bottomSheetDialogView);
                break;
            default:
                BottomSheetDialogView.requestAccessibilityFocusIfNeeded$lambda$16(bottomSheetDialogView);
                break;
        }
    }
}
