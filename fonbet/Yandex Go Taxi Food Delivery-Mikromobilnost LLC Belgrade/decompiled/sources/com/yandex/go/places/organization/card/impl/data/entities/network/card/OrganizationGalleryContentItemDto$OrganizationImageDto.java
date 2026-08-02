package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationGalleryContentItemDto$OrganizationImageDto", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/i;", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationGalleryContentItemDto$OrganizationImageDto extends i {
    public static final f Companion = new f();
    public final ImageDto a;

    public OrganizationGalleryContentItemDto$OrganizationImageDto(int i, ImageDto imageDto) {
        if ((i & 1) == 0) {
            this.a = new ImageDto(0);
        } else {
            this.a = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrganizationGalleryContentItemDto$OrganizationImageDto) && jl40.l(this.a, ((OrganizationGalleryContentItemDto$OrganizationImageDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrganizationImageDto(image=" + this.a + Extension.C_BRAKE;
    }

    public OrganizationGalleryContentItemDto$OrganizationImageDto() {
        this.a = new ImageDto(0);
    }
}
