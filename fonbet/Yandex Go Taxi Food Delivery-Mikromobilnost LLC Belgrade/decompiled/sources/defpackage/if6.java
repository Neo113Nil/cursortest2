package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes3.dex */
public final /* synthetic */ class if6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetDialogView b;

    public /* synthetic */ if6(BottomSheetDialogView bottomSheetDialogView, int i) {
        this.a = i;
        this.b = bottomSheetDialogView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.b;
        switch (i) {
            case 0:
                BottomSheetDialogView.render$lambda$4$lambda$2(bottomSheetDialogView, view);
                break;
            case 1:
                bottomSheetDialogView.dismiss();
                break;
            case 2:
                bottomSheetDialogView.dismiss();
                break;
            case 3:
                bottomSheetDialogView.dismiss();
                break;
            case 4:
                bottomSheetDialogView.dismiss();
                break;
            case 5:
                bottomSheetDialogView.dismiss();
                break;
            default:
                bottomSheetDialogView.dismiss();
                break;
        }
    }
}
