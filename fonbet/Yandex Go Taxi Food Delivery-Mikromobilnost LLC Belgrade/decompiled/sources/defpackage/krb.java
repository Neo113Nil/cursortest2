package defpackage;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.yandex.messaging.ui.chatlist.organizations.ChooseOrganizationDialog;

/* loaded from: classes15.dex */
public final /* synthetic */ class krb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChooseOrganizationDialog b;

    public /* synthetic */ krb(ChooseOrganizationDialog chooseOrganizationDialog, int i) {
        this.a = i;
        this.b = chooseOrganizationDialog;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        BottomSheetDialog dialog_delegate$lambda$2;
        BottomSheetDialog dialog;
        int i = this.a;
        ChooseOrganizationDialog chooseOrganizationDialog = this.b;
        switch (i) {
            case 0:
                dialog_delegate$lambda$2 = ChooseOrganizationDialog.dialog_delegate$lambda$2(chooseOrganizationDialog);
                return dialog_delegate$lambda$2;
            default:
                if (ydz.a.a()) {
                    ydz.a();
                }
                dialog = chooseOrganizationDialog.getDialog();
                dialog.dismiss();
                return zy11.a;
        }
    }
}
