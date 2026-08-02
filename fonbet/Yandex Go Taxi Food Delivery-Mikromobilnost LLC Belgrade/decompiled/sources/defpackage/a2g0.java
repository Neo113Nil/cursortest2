package defpackage;

import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.yandex.delivery.utils.push.impl.PushPayloadDto$DeliveryStateChanged;
import com.yandex.delivery.utils.push.impl.PushPayloadDto$JournalUpdated;

/* loaded from: classes.dex */
public final class a2g0 implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        u2g0.Companion.getClass();
        return PolymorphicJsonAdapterFactory.of(u2g0.class, "type").withSubtype(PushPayloadDto$DeliveryStateChanged.class, "delivery-state-changed").withSubtype(PushPayloadDto$JournalUpdated.class, "journal-updated");
    }
}
