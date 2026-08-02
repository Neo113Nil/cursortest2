package com.yandex.go.places.models.data.entities.network.bottom_panel;

import defpackage.av5;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/bottom_panel/BottomPanelContentDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/bottom_panel/m", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BottomPanelContentDto {
    public static final m Companion = new m();
    public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new av5(21)), null, null};
    public final BrowserInfoAttributesDto a;
    public final OrganizationCardAnalyticsParams b;
    public final List c;
    public final PromoInfoDto d;
    public final PromoDetailsDto e;

    public /* synthetic */ BottomPanelContentDto(int i, BrowserInfoAttributesDto browserInfoAttributesDto, OrganizationCardAnalyticsParams organizationCardAnalyticsParams, List list, PromoInfoDto promoInfoDto, PromoDetailsDto promoDetailsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = browserInfoAttributesDto;
        }
        if ((i & 2) == 0) {
            this.b = new OrganizationCardAnalyticsParams(0);
        } else {
            this.b = organizationCardAnalyticsParams;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = promoInfoDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = promoDetailsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomPanelContentDto)) {
            return false;
        }
        BottomPanelContentDto bottomPanelContentDto = (BottomPanelContentDto) obj;
        return jl40.l(this.a, bottomPanelContentDto.a) && jl40.l(this.b, bottomPanelContentDto.b) && jl40.l(this.c, bottomPanelContentDto.c) && jl40.l(this.d, bottomPanelContentDto.d) && jl40.l(this.e, bottomPanelContentDto.e);
    }

    public final int hashCode() {
        BrowserInfoAttributesDto browserInfoAttributesDto = this.a;
        int c = unr0.c((this.b.hashCode() + ((browserInfoAttributesDto == null ? 0 : browserInfoAttributesDto.hashCode()) * 31)) * 31, 31, this.c);
        PromoInfoDto promoInfoDto = this.d;
        int hashCode = (c + (promoInfoDto == null ? 0 : promoInfoDto.hashCode())) * 31;
        PromoDetailsDto promoDetailsDto = this.e;
        return hashCode + (promoDetailsDto != null ? promoDetailsDto.a.hashCode() : 0);
    }

    public final String toString() {
        return "BottomPanelContentDto(browserAttributes=" + this.a + ", analyticsParams=" + this.b + ", buttons=" + this.c + ", promoInfo=" + this.d + ", promoDetails=" + this.e + Extension.C_BRAKE;
    }

    public BottomPanelContentDto() {
        OrganizationCardAnalyticsParams organizationCardAnalyticsParams = new OrganizationCardAnalyticsParams(0);
        this.a = null;
        this.b = organizationCardAnalyticsParams;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
    }
}
