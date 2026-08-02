package defpackage;

import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class l8y0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiPanoramaModalView b;

    public /* synthetic */ l8y0(TaxiPanoramaModalView taxiPanoramaModalView, int i) {
        this.a = i;
        this.b = taxiPanoramaModalView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showPanorama$lambda$3;
        zy11 showPanorama$lambda$4;
        zy11 initCloseButton$lambda$0;
        GoFrameLayout frameLayoutPickupPoint_delegate$lambda$0;
        int pickupPointSizePx_delegate$lambda$0;
        c8y0 bubbleHolder_delegate$lambda$0;
        zy11 onAttachedToWindow$lambda$0;
        zy11 showPanorama$lambda$0;
        zy11 showPanorama$lambda$1;
        zy11 showPanorama$lambda$2;
        int i = this.a;
        TaxiPanoramaModalView taxiPanoramaModalView = this.b;
        switch (i) {
            case 0:
                showPanorama$lambda$3 = TaxiPanoramaModalView.showPanorama$lambda$3(taxiPanoramaModalView);
                return showPanorama$lambda$3;
            case 1:
                showPanorama$lambda$4 = TaxiPanoramaModalView.showPanorama$lambda$4(taxiPanoramaModalView);
                return showPanorama$lambda$4;
            case 2:
                initCloseButton$lambda$0 = TaxiPanoramaModalView.initCloseButton$lambda$0(taxiPanoramaModalView);
                return initCloseButton$lambda$0;
            case 3:
                frameLayoutPickupPoint_delegate$lambda$0 = TaxiPanoramaModalView.frameLayoutPickupPoint_delegate$lambda$0(taxiPanoramaModalView);
                return frameLayoutPickupPoint_delegate$lambda$0;
            case 4:
                pickupPointSizePx_delegate$lambda$0 = TaxiPanoramaModalView.pickupPointSizePx_delegate$lambda$0(taxiPanoramaModalView);
                return Integer.valueOf(pickupPointSizePx_delegate$lambda$0);
            case 5:
                bubbleHolder_delegate$lambda$0 = TaxiPanoramaModalView.bubbleHolder_delegate$lambda$0(taxiPanoramaModalView);
                return bubbleHolder_delegate$lambda$0;
            case 6:
                onAttachedToWindow$lambda$0 = TaxiPanoramaModalView.onAttachedToWindow$lambda$0(taxiPanoramaModalView);
                return onAttachedToWindow$lambda$0;
            case 7:
                showPanorama$lambda$0 = TaxiPanoramaModalView.showPanorama$lambda$0(taxiPanoramaModalView);
                return showPanorama$lambda$0;
            case 8:
                showPanorama$lambda$1 = TaxiPanoramaModalView.showPanorama$lambda$1(taxiPanoramaModalView);
                return showPanorama$lambda$1;
            default:
                showPanorama$lambda$2 = TaxiPanoramaModalView.showPanorama$lambda$2(taxiPanoramaModalView);
                return showPanorama$lambda$2;
        }
    }
}
