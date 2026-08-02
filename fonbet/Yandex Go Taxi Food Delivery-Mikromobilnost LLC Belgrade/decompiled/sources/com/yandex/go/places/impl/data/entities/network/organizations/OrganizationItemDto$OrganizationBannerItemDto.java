package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/OrganizationItemDto$OrganizationBannerItemDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/f;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationItemDto$OrganizationBannerItemDto extends f {
    public static final c Companion = new c();
    public final String a;
    public final FormattedText b;
    public final ImageDto c;
    public final com.yandex.go.places.models.data.entities.network.s d;

    public OrganizationItemDto$OrganizationBannerItemDto(int i, String str, FormattedText formattedText, ImageDto imageDto, com.yandex.go.places.models.data.entities.network.s sVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = imageDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = sVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationItemDto$OrganizationBannerItemDto)) {
            return false;
        }
        OrganizationItemDto$OrganizationBannerItemDto organizationItemDto$OrganizationBannerItemDto = (OrganizationItemDto$OrganizationBannerItemDto) obj;
        return jl40.l(this.a, organizationItemDto$OrganizationBannerItemDto.a) && jl40.l(this.b, organizationItemDto$OrganizationBannerItemDto.b) && jl40.l(this.c, organizationItemDto$OrganizationBannerItemDto.c) && jl40.l(this.d, organizationItemDto$OrganizationBannerItemDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        ImageDto imageDto = this.c;
        int hashCode3 = (hashCode2 + (imageDto == null ? 0 : imageDto.hashCode())) * 31;
        com.yandex.go.places.models.data.entities.network.s sVar = this.d;
        return hashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("OrganizationBannerItemDto(id=", this.a, ", title=", ", image=", this.b);
        q.append(this.c);
        q.append(", action=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public OrganizationItemDto$OrganizationBannerItemDto() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
