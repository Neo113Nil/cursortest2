package defpackage;

import com.yandex.go.scooters.discovery.ScootersDiscoveryModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class jin0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ScootersDiscoveryModalView b;

    public /* synthetic */ jin0(ScootersDiscoveryModalView scootersDiscoveryModalView, int i) {
        this.a = i;
        this.b = scootersDiscoveryModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ScootersDiscoveryModalView scootersDiscoveryModalView = this.b;
        switch (i) {
            case 0:
                ScootersDiscoveryModalView.onAttachedToWindow$lambda$1(scootersDiscoveryModalView);
                break;
            case 1:
                ScootersDiscoveryModalView.onAttachedToWindow$lambda$2(scootersDiscoveryModalView);
                break;
            case 2:
                scootersDiscoveryModalView.collapse();
                break;
            case 3:
                ScootersDiscoveryModalView.onAttachedToWindow$lambda$4(scootersDiscoveryModalView);
                break;
            case 4:
                ScootersDiscoveryModalView.onAttachedToWindow$lambda$5(scootersDiscoveryModalView);
                break;
            default:
                scootersDiscoveryModalView.updatePeekHeight();
                break;
        }
    }
}
