package defpackage;

import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class m8y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiPanoramaModalView b;

    public /* synthetic */ m8y0(TaxiPanoramaModalView taxiPanoramaModalView, int i) {
        this.a = i;
        this.b = taxiPanoramaModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        TaxiPanoramaModalView taxiPanoramaModalView = this.b;
        switch (i) {
            case 0:
                TaxiPanoramaModalView.renderPickupPoints$lambda$3$0$0$0(taxiPanoramaModalView);
                break;
            default:
                TaxiPanoramaModalView.onAttachedToWindow$lambda$1(taxiPanoramaModalView);
                break;
        }
    }
}
