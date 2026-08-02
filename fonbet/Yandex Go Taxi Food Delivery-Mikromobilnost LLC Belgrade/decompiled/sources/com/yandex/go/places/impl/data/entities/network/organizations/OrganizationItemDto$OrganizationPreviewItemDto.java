package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.models.data.entities.network.BadgeDto;
import com.yandex.go.places.models.data.entities.network.CompressionResistantAttributedTextContainerDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yi80;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/OrganizationItemDto$OrganizationPreviewItemDto", "Lcom/yandex/go/places/impl/data/entities/network/organizations/f;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrganizationItemDto$OrganizationPreviewItemDto extends f {
    public static final d Companion = new d();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(0)), null, null, null, null};
    public final String a;
    public final FormattedText b;
    public final List c;
    public final CompressionResistantAttributedTextContainerDto d;
    public final CompressionResistantAttributedTextContainerDto e;
    public final BadgeDto f;
    public final com.yandex.go.places.models.data.entities.network.s g;

    public OrganizationItemDto$OrganizationPreviewItemDto(int i, String str, FormattedText formattedText, List list, CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto, CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto2, BadgeDto badgeDto, com.yandex.go.places.models.data.entities.network.s sVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = compressionResistantAttributedTextContainerDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = compressionResistantAttributedTextContainerDto2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = badgeDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = sVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationItemDto$OrganizationPreviewItemDto)) {
            return false;
        }
        OrganizationItemDto$OrganizationPreviewItemDto organizationItemDto$OrganizationPreviewItemDto = (OrganizationItemDto$OrganizationPreviewItemDto) obj;
        return jl40.l(this.a, organizationItemDto$OrganizationPreviewItemDto.a) && jl40.l(this.b, organizationItemDto$OrganizationPreviewItemDto.b) && jl40.l(this.c, organizationItemDto$OrganizationPreviewItemDto.c) && jl40.l(this.d, organizationItemDto$OrganizationPreviewItemDto.d) && jl40.l(this.e, organizationItemDto$OrganizationPreviewItemDto.e) && jl40.l(this.f, organizationItemDto$OrganizationPreviewItemDto.f) && jl40.l(this.g, organizationItemDto$OrganizationPreviewItemDto.g);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto = this.d;
        int hashCode = (c + (compressionResistantAttributedTextContainerDto == null ? 0 : compressionResistantAttributedTextContainerDto.a.hashCode())) * 31;
        CompressionResistantAttributedTextContainerDto compressionResistantAttributedTextContainerDto2 = this.e;
        int hashCode2 = (hashCode + (compressionResistantAttributedTextContainerDto2 == null ? 0 : compressionResistantAttributedTextContainerDto2.a.hashCode())) * 31;
        BadgeDto badgeDto = this.f;
        int hashCode3 = (hashCode2 + (badgeDto == null ? 0 : badgeDto.hashCode())) * 31;
        com.yandex.go.places.models.data.entities.network.s sVar = this.g;
        return hashCode3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("OrganizationPreviewItemDto(id=", this.a, ", title=", ", images=", this.b);
        q.append(this.c);
        q.append(", subtitle=");
        q.append(this.d);
        q.append(", characteristics=");
        q.append(this.e);
        q.append(", badge=");
        q.append(this.f);
        q.append(", action=");
        q.append(this.g);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public OrganizationItemDto$OrganizationPreviewItemDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
