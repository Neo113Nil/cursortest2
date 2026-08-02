package defpackage;

import com.yandex.go.delivery.tracking.DeliveryTrackingModalView;
import com.yandex.go.delivery.tracking.l;

/* loaded from: classes12.dex */
public final /* synthetic */ class eui implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ eui(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.Kg();
                break;
            case 1:
                lVar.Kg();
                break;
            case 2:
                lVar.Kg();
                break;
            case 3:
                lVar.Kg();
                break;
            case 4:
                lVar.Kg();
                break;
            default:
                DeliveryTrackingModalView.recenterFloatButton$onRecenterClicked(lVar);
                break;
        }
    }
}
