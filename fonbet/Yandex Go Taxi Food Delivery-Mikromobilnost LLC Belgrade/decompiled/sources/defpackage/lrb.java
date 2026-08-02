package defpackage;

import com.yandex.messaging.ui.chatlist.organizations.ChooseOrganizationDialog;

/* loaded from: classes15.dex */
public final class lrb implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChooseOrganizationDialog b;

    public /* synthetic */ lrb(ChooseOrganizationDialog chooseOrganizationDialog, int i) {
        this.a = i;
        this.b = chooseOrganizationDialog;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1545147988);
                ChooseOrganizationDialog chooseOrganizationDialog = this.b;
                boolean e = btsVar2.e(chooseOrganizationDialog);
                Object Q = btsVar2.Q();
                if (e || Q == did.a) {
                    Q = new krb(chooseOrganizationDialog, 1);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                chooseOrganizationDialog.DialogRoot(null, (sls) Q, btsVar2, 0, 1);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                hlb1.a(wwg.S(1154798139, true, new lrb(this.b, i2), fidVar2), fidVar2, 6);
                break;
        }
        return zy11Var;
    }
}
