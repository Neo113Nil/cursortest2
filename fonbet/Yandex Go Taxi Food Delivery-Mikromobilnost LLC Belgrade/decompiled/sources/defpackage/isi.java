package defpackage;

import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$C2CStub;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveryStub$MarketStub;

/* loaded from: classes9.dex */
public abstract class isi {
    public static final hsi Companion = new hsi();
    private static final PolymorphicJsonAdapterFactory<isi> jsonAdapterFactory = PolymorphicJsonAdapterFactory.of(isi.class, "type").withSubtype(DeliveryStub$C2CStub.class, "c2c").withSubtype(DeliveryStub$MarketStub.class, "market");

    public abstract long getTimestamp();
}
