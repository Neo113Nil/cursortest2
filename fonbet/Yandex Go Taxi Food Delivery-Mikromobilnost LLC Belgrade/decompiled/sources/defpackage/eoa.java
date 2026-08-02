package defpackage;

import com.yandex.go.chargers.qr.ChargersQrModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class eoa implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersQrModalView b;

    public /* synthetic */ eoa(ChargersQrModalView chargersQrModalView, int i) {
        this.a = i;
        this.b = chargersQrModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 initCloseButton$lambda$0;
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = this.a;
        ChargersQrModalView chargersQrModalView = this.b;
        switch (i) {
            case 0:
                initCloseButton$lambda$0 = ChargersQrModalView.initCloseButton$lambda$0(chargersQrModalView);
                return initCloseButton$lambda$0;
            case 1:
                zy11Var = ChargersQrModalView.setupListeners$lambda$0(chargersQrModalView);
                return zy11Var;
            default:
                zy11Var2 = ChargersQrModalView.setupListeners$lambda$1(chargersQrModalView);
                return zy11Var2;
        }
    }
}
