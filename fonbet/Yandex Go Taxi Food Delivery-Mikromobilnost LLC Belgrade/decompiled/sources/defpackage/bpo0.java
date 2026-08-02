package defpackage;

import com.yandex.go.scooters.qr.ui.ScootersQrModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class bpo0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersQrModalView b;

    public /* synthetic */ bpo0(ScootersQrModalView scootersQrModalView, int i) {
        this.a = i;
        this.b = scootersQrModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 initCloseButton$lambda$0;
        zy11 zy11Var3;
        zy11 zy11Var4;
        n5o0 n5o0Var;
        int i = this.a;
        ScootersQrModalView scootersQrModalView = this.b;
        switch (i) {
            case 0:
                zy11Var = ScootersQrModalView.setupListenersForManualEnterViews$lambda$5(scootersQrModalView);
                return zy11Var;
            case 1:
                zy11Var2 = ScootersQrModalView.setupListenersForManualEnterViews$lambda$6(scootersQrModalView);
                return zy11Var2;
            case 2:
                initCloseButton$lambda$0 = ScootersQrModalView.initCloseButton$lambda$0(scootersQrModalView);
                return initCloseButton$lambda$0;
            case 3:
                zy11Var3 = ScootersQrModalView.setupListenersForCameraScanQrViews$lambda$0(scootersQrModalView);
                return zy11Var3;
            case 4:
                zy11Var4 = ScootersQrModalView.setupListenersForManualEnterViews$lambda$0(scootersQrModalView);
                return zy11Var4;
            default:
                n5o0Var = scootersQrModalView.scootersOneShotHistogramTimeReporter;
                n5o0Var.a("Perf.ScootersQrView.InitScan");
                return zy11.a;
        }
    }
}
