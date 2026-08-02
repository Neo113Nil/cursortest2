package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/i;", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto extends i {
    public static final g Companion = new g();
    public final FormattedText a;
    public final String b;
    public final ImageDto c;

    public OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto(int i, FormattedText formattedText, String str, ImageDto imageDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto)) {
            return false;
        }
        OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto organizationGalleryContentItemDto$OrganizationImagePlaceholderDto = (OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto) obj;
        return jl40.l(this.a, organizationGalleryContentItemDto$OrganizationImagePlaceholderDto.a) && jl40.l(this.b, organizationGalleryContentItemDto$OrganizationImagePlaceholderDto.b) && jl40.l(this.c, organizationGalleryContentItemDto$OrganizationImagePlaceholderDto.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.a.hashCode() * 31, 31, this.b);
        ImageDto imageDto = this.c;
        return b + (imageDto == null ? 0 : imageDto.hashCode());
    }

    public final String toString() {
        return "OrganizationImagePlaceholderDto(title=" + this.a + ", backgroundColor=" + this.b + ", image=" + this.c + Extension.C_BRAKE;
    }

    public OrganizationGalleryContentItemDto$OrganizationImagePlaceholderDto() {
        this.a = FormattedText.c;
        this.b = "";
        this.c = null;
    }
}
