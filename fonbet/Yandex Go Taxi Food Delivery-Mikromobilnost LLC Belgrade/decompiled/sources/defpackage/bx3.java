package defpackage;

import android.view.View;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class bx3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupRegularFragment b;
    public final /* synthetic */ BottomSheetDialogView c;

    public /* synthetic */ bx3(BottomSheetDialogView bottomSheetDialogView, AutoTopupRegularFragment autoTopupRegularFragment) {
        this.a = 2;
        this.c = bottomSheetDialogView;
        this.b = autoTopupRegularFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.c;
        AutoTopupRegularFragment autoTopupRegularFragment = this.b;
        switch (i) {
            case 0:
                AutoTopupRegularFragment.showExitConfirmationNotice$lambda$48$lambda$46(autoTopupRegularFragment, bottomSheetDialogView, view);
                break;
            case 1:
                AutoTopupRegularFragment.showExitConfirmationNotice$lambda$48$lambda$47(autoTopupRegularFragment, bottomSheetDialogView, view);
                break;
            case 2:
                AutoTopupRegularFragment.showNoticeBottomSheet$lambda$51$lambda$49(bottomSheetDialogView, autoTopupRegularFragment, view);
                break;
            default:
                AutoTopupRegularFragment.showNoticeBottomSheet$lambda$51$lambda$50(autoTopupRegularFragment, bottomSheetDialogView, view);
                break;
        }
    }

    public /* synthetic */ bx3(AutoTopupRegularFragment autoTopupRegularFragment, BottomSheetDialogView bottomSheetDialogView, int i) {
        this.a = i;
        this.b = autoTopupRegularFragment;
        this.c = bottomSheetDialogView;
    }
}
