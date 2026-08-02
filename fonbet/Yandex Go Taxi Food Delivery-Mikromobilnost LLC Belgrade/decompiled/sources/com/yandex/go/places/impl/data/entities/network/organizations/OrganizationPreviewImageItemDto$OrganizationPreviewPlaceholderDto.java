package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/n;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto extends n {
    public static final l Companion = new l();
    public final String a;
    public final ImageDto b;

    public OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto(int i, String str, ImageDto imageDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new ImageDto(0);
        } else {
            this.b = imageDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto)) {
            return false;
        }
        OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto organizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto = (OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto) obj;
        return jl40.l(this.a, organizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto.a) && jl40.l(this.b, organizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationPreviewPlaceholderDto(backgroundColor=" + this.a + ", icon=" + this.b + Extension.C_BRAKE;
    }

    public OrganizationPreviewImageItemDto$OrganizationPreviewPlaceholderDto() {
        ImageDto imageDto = new ImageDto(0);
        this.a = "";
        this.b = imageDto;
    }
}
