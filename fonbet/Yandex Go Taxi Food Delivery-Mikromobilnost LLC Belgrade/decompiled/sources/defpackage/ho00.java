package defpackage;

import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SocialDefaultPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLOrgPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalMFallbackPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalLPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalMPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.MapObjectPinStyleDto$UniversalSelectedPinStyleDto;
import com.yandex.go.places.models.data.entities.network.map.t;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class ho00 extends xqt {
    public static final ho00 e = new ho00();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, t.INSTANCE.serializer(), qoi0.a(t.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("pin_war_default_icon_label", MapObjectPinStyleDto$PinWarDefaultPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$PinWarDefaultPinStyleDto.class)), new f9("pin_war_default_icon_label_selected", MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$PinWarDefaultSelectedPinStyleDto.class)), new f9("social_pin_default_style", MapObjectPinStyleDto$SocialDefaultPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SocialDefaultPinStyleDto.class)), new f9("universal_pin_dust_style", MapObjectPinStyleDto$UniversalSPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$UniversalSPinStyleDto.class)), new f9("universal_pin_icon_label_style", MapObjectPinStyleDto$UniversalMPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$UniversalMPinStyleDto.class)), new f9("universal_pin_media_style", MapObjectPinStyleDto$UniversalLPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$UniversalLPinStyleDto.class)), new f9("universal_pin_organization_media_style", MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$UniversalLPinOrganizationStyleDto.class)), new f9("universal_pin_selected_style", MapObjectPinStyleDto$UniversalSelectedPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$UniversalSelectedPinStyleDto.class)), new f9("universal_pin_fallback_default_supermap_style", MapObjectPinStyleDto$SupermapUniversalMFallbackPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalMFallbackPinStyleDto.class)), new f9("universal_pin_fallback_default_supermap_org_style", MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalMFallbackOrgPinStyleDto.class)), new f9("universal_pin_fallback_selected_supermap_style", MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalMFallbackSelectedPinStyleDto.class)), new f9("universal_pin_default_supermap_style", MapObjectPinStyleDto$SupermapUniversalLPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalLPinStyleDto.class)), new f9("universal_pin_default_supermap_org_style", MapObjectPinStyleDto$SupermapUniversalLOrgPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalLOrgPinStyleDto.class)), new f9("universal_pin_default_selected_supermap_style", MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto.Companion.serializer(), qoi0.a(MapObjectPinStyleDto$SupermapUniversalLSelectedPinStyleDto.class)));
    }
}
