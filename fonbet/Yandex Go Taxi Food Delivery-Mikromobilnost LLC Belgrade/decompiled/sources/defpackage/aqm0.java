package defpackage;

import com.yandex.go.scooters.misc.action_dialog.ScootersActionDialogModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class aqm0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersActionDialogModalView b;

    public /* synthetic */ aqm0(ScootersActionDialogModalView scootersActionDialogModalView, int i) {
        this.a = i;
        this.b = scootersActionDialogModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 bindImage$lambda$0$0;
        zy11 bindIcon$lambda$0$0;
        int i = this.a;
        ScootersActionDialogModalView scootersActionDialogModalView = this.b;
        switch (i) {
            case 0:
                bindImage$lambda$0$0 = ScootersActionDialogModalView.bindImage$lambda$0$0(scootersActionDialogModalView);
                return bindImage$lambda$0$0;
            default:
                bindIcon$lambda$0$0 = ScootersActionDialogModalView.bindIcon$lambda$0$0(scootersActionDialogModalView);
                return bindIcon$lambda$0$0;
        }
    }
}
