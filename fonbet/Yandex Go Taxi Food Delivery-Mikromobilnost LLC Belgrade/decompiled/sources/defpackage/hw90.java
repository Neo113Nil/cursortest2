package defpackage;

import com.yandex.go.zone.model.Zone;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes8.dex */
public final class hw90 implements gw90 {
    public final Zone a;

    public hw90(Zone zone) {
        this.a = zone;
    }

    @Override // defpackage.gw90
    public final bw90 a(PaymentMethod$Type paymentMethod$Type) {
        Zone zone = this.a;
        return (zone == null || !bb1.N(zone, paymentMethod$Type)) ? h2b1.K : xw91.C;
    }
}
