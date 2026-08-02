package defpackage;

import android.view.View;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public final /* synthetic */ class hf6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnClickListener b;
    public final /* synthetic */ BottomSheetDialogView c;

    public /* synthetic */ hf6(int i, View.OnClickListener onClickListener, BottomSheetDialogView bottomSheetDialogView) {
        this.a = i;
        this.b = onClickListener;
        this.c = bottomSheetDialogView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 onPrimaryAction$lambda$5;
        zy11 onSecondaryAction$lambda$6;
        int i = this.a;
        BottomSheetDialogView bottomSheetDialogView = this.c;
        View.OnClickListener onClickListener = this.b;
        switch (i) {
            case 0:
                onPrimaryAction$lambda$5 = BottomSheetDialogView.onPrimaryAction$lambda$5(onClickListener, bottomSheetDialogView);
                return onPrimaryAction$lambda$5;
            default:
                onSecondaryAction$lambda$6 = BottomSheetDialogView.onSecondaryAction$lambda$6(onClickListener, bottomSheetDialogView);
                return onSecondaryAction$lambda$6;
        }
    }
}
