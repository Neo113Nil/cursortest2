package androidx.compose.material3;

import androidx.activity.ComponentDialog;
import defpackage.mx60;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes10.dex */
public final /* synthetic */ class q implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentDialog b;

    public /* synthetic */ q(ComponentDialog componentDialog, int i) {
        this.a = i;
        this.b = componentDialog;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 _init_$lambda$2;
        int i = this.a;
        ComponentDialog componentDialog = this.b;
        switch (i) {
            case 0:
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = (ModalBottomSheetDialogWrapper) componentDialog;
                modalBottomSheetDialogWrapper.show();
                return new s(modalBottomSheetDialogWrapper);
            default:
                _init_$lambda$2 = ModalWideNavigationRailDialogWrapper._init_$lambda$2((ModalWideNavigationRailDialogWrapper) componentDialog, (mx60) obj);
                return _init_$lambda$2;
        }
    }
}
