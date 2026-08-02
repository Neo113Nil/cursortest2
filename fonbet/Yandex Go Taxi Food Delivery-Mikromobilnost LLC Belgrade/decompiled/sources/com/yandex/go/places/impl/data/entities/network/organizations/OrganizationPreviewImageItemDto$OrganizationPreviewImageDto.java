package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewImageItemDto$OrganizationPreviewImageDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/n;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationPreviewImageItemDto$OrganizationPreviewImageDto extends n {
    public static final k Companion = new k();
    public final ImageDto a;

    public OrganizationPreviewImageItemDto$OrganizationPreviewImageDto(int i, ImageDto imageDto) {
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
        return (obj instanceof OrganizationPreviewImageItemDto$OrganizationPreviewImageDto) && jl40.l(this.a, ((OrganizationPreviewImageItemDto$OrganizationPreviewImageDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OrganizationPreviewImageDto(image=" + this.a + Extension.C_BRAKE;
    }

    public OrganizationPreviewImageItemDto$OrganizationPreviewImageDto() {
        this.a = new ImageDto(0);
    }
}
