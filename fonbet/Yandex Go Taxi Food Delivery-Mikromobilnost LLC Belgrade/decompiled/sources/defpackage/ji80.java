package defpackage;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryContentItemDto$OrganizationImageDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.h;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes13.dex */
public final class ji80 extends xqt {
    public static final ji80 e = new ji80();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, h.INSTANCE.serializer(), qoi0.a(h.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("image", OrganizationGalleryContentItemDto$OrganizationImageDto.Companion.serializer(), qoi0.a(OrganizationGalleryContentItemDto$OrganizationImageDto.class)), new f9("placeholder", OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto.Companion.serializer(), qoi0.a(OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto.class)));
    }
}
