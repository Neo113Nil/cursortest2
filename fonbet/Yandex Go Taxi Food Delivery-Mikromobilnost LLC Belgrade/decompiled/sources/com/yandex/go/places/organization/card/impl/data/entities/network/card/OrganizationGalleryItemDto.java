package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import com.yandex.go.places.models.data.entities.network.s;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/OrganizationGalleryItemDto;", "", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/k", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationGalleryItemDto {
    public static final k Companion = new k();
    public final i a;
    public final s b;

    public /* synthetic */ OrganizationGalleryItemDto(int i, i iVar, s sVar) {
        this.a = (i & 1) == 0 ? h.INSTANCE : iVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationGalleryItemDto)) {
            return false;
        }
        OrganizationGalleryItemDto organizationGalleryItemDto = (OrganizationGalleryItemDto) obj;
        return jl40.l(this.a, organizationGalleryItemDto.a) && jl40.l(this.b, organizationGalleryItemDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s sVar = this.b;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        return "OrganizationGalleryItemDto(content=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public OrganizationGalleryItemDto() {
        this.a = h.INSTANCE;
        this.b = null;
    }
}
