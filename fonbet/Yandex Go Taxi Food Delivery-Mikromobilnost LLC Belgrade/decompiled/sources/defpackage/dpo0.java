package defpackage;

import com.yandex.go.scooters.qr.ui.ScootersQrModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class dpo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersQrModalView b;

    public /* synthetic */ dpo0(ScootersQrModalView scootersQrModalView, int i) {
        this.a = i;
        this.b = scootersQrModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScootersQrModalView scootersQrModalView = this.b;
        switch (i) {
            case 0:
                ScootersQrModalView.setupListenersForPermissionsViews$lambda$0(scootersQrModalView);
                break;
            case 1:
                ScootersQrModalView.setupListenersForPermissionsViews$lambda$1(scootersQrModalView);
                break;
            default:
                ScootersQrModalView.leaveGrabbedQrRectRunnable$lambda$0(scootersQrModalView);
                break;
        }
    }
}
