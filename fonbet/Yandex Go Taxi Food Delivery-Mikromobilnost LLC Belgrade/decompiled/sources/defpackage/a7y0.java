package defpackage;

import com.yandex.go.taxi.order.ui.recenter.TaxiOrderTrackingRecenterButton;
import ru.yandex.taxi.map.overlay.RecenterType;

/* loaded from: classes14.dex */
public final class a7y0 implements b7y0 {
    public final /* synthetic */ TaxiOrderTrackingRecenterButton a;

    public a7y0(TaxiOrderTrackingRecenterButton taxiOrderTrackingRecenterButton) {
        this.a = taxiOrderTrackingRecenterButton;
    }

    @Override // defpackage.b7y0
    public final void h8(boolean z) {
        this.a.setAutoRecenter(z);
    }

    @Override // defpackage.b7y0
    public final void setNextRecenterType(RecenterType recenterType) {
        this.a.nextRecenterType = recenterType;
    }
}
