package defpackage;

import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$OrganizationPreviewPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$SocialPinDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectItemDto$UniversalPinDto;
import com.yandex.go.places.models.data.entities.network.map.d;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class mn00 extends xqt {
    public static final mn00 e = new mn00();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, d.INSTANCE.serializer(), qoi0.a(d.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("organization_pin", MapObjectItemDto$OrganizationPreviewPinDto.Companion.serializer(), qoi0.a(MapObjectItemDto$OrganizationPreviewPinDto.class)), new f9("social_pin", MapObjectItemDto$SocialPinDto.Companion.serializer(), qoi0.a(MapObjectItemDto$SocialPinDto.class)), new f9("universal_pin", MapObjectItemDto$UniversalPinDto.Companion.serializer(), qoi0.a(MapObjectItemDto$UniversalPinDto.class)));
    }
}
