package defpackage;

import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok;
import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable;
import com.yandex.go.scooters.qr.data.model.f;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class l7p0 extends xqt {
    public static final l7p0 e = new l7p0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, f.INSTANCE.serializer(), qoi0.a(f.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9(WriteBlocks.OK, ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.Companion.serializer(), qoi0.a(ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.class)), new f9("unavailable", ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.Companion.serializer(), qoi0.a(ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.class)));
    }
}
