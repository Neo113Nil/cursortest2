package com.yandex.go.places.impl.data.entities.network.organizations;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationPreviewSliderItemDto;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationPreviewSliderItemDto {
    public static final p Companion = new p();
    public final String a;
    public final com.yandex.go.places.models.data.entities.network.s b;
    public final n c;

    public /* synthetic */ OrganizationPreviewSliderItemDto(int i, String str, com.yandex.go.places.models.data.entities.network.s sVar, n nVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = sVar;
        }
        if ((i & 4) == 0) {
            this.c = m.INSTANCE;
        } else {
            this.c = nVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationPreviewSliderItemDto)) {
            return false;
        }
        OrganizationPreviewSliderItemDto organizationPreviewSliderItemDto = (OrganizationPreviewSliderItemDto) obj;
        return jl40.l(this.a, organizationPreviewSliderItemDto.a) && jl40.l(this.b, organizationPreviewSliderItemDto.b) && jl40.l(this.c, organizationPreviewSliderItemDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        com.yandex.go.places.models.data.entities.network.s sVar = this.b;
        return this.c.hashCode() + ((hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OrganizationPreviewSliderItemDto(id=" + this.a + ", action=" + this.b + ", content=" + this.c + Extension.C_BRAKE;
    }

    public OrganizationPreviewSliderItemDto() {
        m mVar = m.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = mVar;
    }
}
