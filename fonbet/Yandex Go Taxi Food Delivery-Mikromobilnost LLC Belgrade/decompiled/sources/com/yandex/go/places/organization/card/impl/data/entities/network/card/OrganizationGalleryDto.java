package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import com.yandex.go.places.models.data.entities.network.BadgeDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.s780;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationGalleryDto;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationGalleryDto {
    public static final j Companion = new j();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(29)), null};
    public final List a;
    public final BadgeDto b;

    public /* synthetic */ OrganizationGalleryDto(int i, List list, BadgeDto badgeDto) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = new BadgeDto(0);
        } else {
            this.b = badgeDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationGalleryDto)) {
            return false;
        }
        OrganizationGalleryDto organizationGalleryDto = (OrganizationGalleryDto) obj;
        return jl40.l(this.a, organizationGalleryDto.a) && jl40.l(this.b, organizationGalleryDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrganizationGalleryDto(galleryItems=" + this.a + ", badge=" + this.b + Extension.C_BRAKE;
    }

    public OrganizationGalleryDto() {
        BadgeDto badgeDto = new BadgeDto(0);
        this.a = EmptyList.a;
        this.b = badgeDto;
    }
}
