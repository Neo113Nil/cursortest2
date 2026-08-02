package defpackage;

import com.yandex.go.chargers.qr.ChargersQrModalView;

/* loaded from: classes12.dex */
public final /* synthetic */ class foa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChargersQrModalView b;

    public /* synthetic */ foa(ChargersQrModalView chargersQrModalView, int i) {
        this.a = i;
        this.b = chargersQrModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ChargersQrModalView chargersQrModalView = this.b;
        switch (i) {
            case 0:
                ChargersQrModalView.leaveGrabbedQrRectRunnable$lambda$0(chargersQrModalView);
                break;
            case 1:
                ChargersQrModalView.setupListenersForManualEnterViews$lambda$0(chargersQrModalView);
                break;
            case 2:
                ChargersQrModalView.setupListenersForManualEnterViews$lambda$1(chargersQrModalView);
                break;
            case 3:
                ChargersQrModalView.setupListenersForManualEnterViews$lambda$4(chargersQrModalView);
                break;
            case 4:
                ChargersQrModalView.setupListenersForPermissionsViews$lambda$0(chargersQrModalView);
                break;
            default:
                ChargersQrModalView.setupListenersForPermissionsViews$lambda$1(chargersQrModalView);
                break;
        }
    }
}
