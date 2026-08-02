package defpackage;

import android.view.View;
import com.yandex.go.transfer_requirement.mvp.TransferRequirementModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class gp01 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransferRequirementModalView b;

    public /* synthetic */ gp01(TransferRequirementModalView transferRequirementModalView, int i) {
        this.a = i;
        this.b = transferRequirementModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int shadowMargin_delegate$lambda$0;
        View insetsType$lambda$0;
        zy11 zy11Var;
        zy11 signInputOnFocusChange$lambda$0$0;
        int i = this.a;
        TransferRequirementModalView transferRequirementModalView = this.b;
        switch (i) {
            case 0:
                shadowMargin_delegate$lambda$0 = TransferRequirementModalView.shadowMargin_delegate$lambda$0(transferRequirementModalView);
                return Integer.valueOf(shadowMargin_delegate$lambda$0);
            case 1:
                insetsType$lambda$0 = TransferRequirementModalView.insetsType$lambda$0(transferRequirementModalView);
                return insetsType$lambda$0;
            case 2:
                zy11Var = TransferRequirementModalView.setupListeners$lambda$0$2(transferRequirementModalView);
                return zy11Var;
            default:
                signInputOnFocusChange$lambda$0$0 = TransferRequirementModalView.signInputOnFocusChange$lambda$0$0(transferRequirementModalView);
                return signInputOnFocusChange$lambda$0$0;
        }
    }
}
