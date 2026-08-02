package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;

/* loaded from: classes.dex */
public final class j5v {
    public static i5v a(DeliveryIconStrategyDto deliveryIconStrategyDto) {
        if (deliveryIconStrategyDto != null) {
            if (deliveryIconStrategyDto instanceof DeliveryIconStrategyDto.DeliveryIconStrategy_RemoteImageDto) {
                return new i5v(((DeliveryIconStrategyDto.DeliveryIconStrategy_RemoteImageDto) deliveryIconStrategyDto).b.getImageTag());
            }
            if (!(deliveryIconStrategyDto instanceof DeliveryIconStrategyDto.Unknown_DeliveryIconStrategyDto)) {
                w511.b();
                return null;
            }
        }
        return null;
    }
}
