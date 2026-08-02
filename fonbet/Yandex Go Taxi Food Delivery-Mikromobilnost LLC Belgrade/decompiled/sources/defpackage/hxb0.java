package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinBubbleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PointPinDto;

/* loaded from: classes.dex */
public final class hxb0 {
    public static mm91 a(PointPinDto pointPinDto) {
        if (pointPinDto instanceof PointPinDto.PointPin_BubbleDto) {
            PointPinBubbleDto pointPinBubbleDto = ((PointPinDto.PointPin_BubbleDto) pointPinDto).b;
            return new fxb0(pointPinBubbleDto.getTitle(), pointPinBubbleDto.getSubtitle(), pointPinBubbleDto.getIconTag());
        }
        if ((pointPinDto instanceof PointPinDto.Unknown_PointPinDto) || pointPinDto == null) {
            return gxb0.b;
        }
        w511.b();
        return null;
    }
}
