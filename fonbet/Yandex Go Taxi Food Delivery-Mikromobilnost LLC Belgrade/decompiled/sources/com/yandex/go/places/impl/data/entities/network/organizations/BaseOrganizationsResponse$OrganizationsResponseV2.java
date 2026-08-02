package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l65;
import defpackage.tse0;
import defpackage.tt4;
import defpackage.uc4;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/BaseOrganizationsResponse$OrganizationsResponseV2", "Ll65;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BaseOrganizationsResponse$OrganizationsResponseV2 implements l65 {
    public static final b Companion = new b();
    public static final i3y[] i;
    public final int a;
    public final Integer b;
    public final String c;
    public final List d;
    public final OrganizationsEmptyScreenConfigDto e;
    public final FiltersAndSortingResponseDto f;
    public final List g;
    public final uc4 h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tt4(12)), null, null, kotlin.a.b(lazyThreadSafetyMode, new tt4(13)), null};
    }

    public /* synthetic */ BaseOrganizationsResponse$OrganizationsResponseV2(int i2, int i3, Integer num, String str, List list, OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto, FiltersAndSortingResponseDto filtersAndSortingResponseDto, List list2, uc4 uc4Var) {
        this.a = (i2 & 1) == 0 ? -1 : i3;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        int i4 = i2 & 8;
        EmptyList emptyList = EmptyList.a;
        if (i4 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = organizationsEmptyScreenConfigDto;
        }
        if ((i2 & 32) == 0) {
            this.f = new FiltersAndSortingResponseDto(0);
        } else {
            this.f = filtersAndSortingResponseDto;
        }
        if ((i2 & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = uc4Var;
        }
    }

    @Override // defpackage.l65
    /* renamed from: a, reason: from getter */
    public final FiltersAndSortingResponseDto getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOrganizationsResponse$OrganizationsResponseV2)) {
            return false;
        }
        BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV2 = (BaseOrganizationsResponse$OrganizationsResponseV2) obj;
        return this.a == baseOrganizationsResponse$OrganizationsResponseV2.a && jl40.l(this.b, baseOrganizationsResponse$OrganizationsResponseV2.b) && jl40.l(this.c, baseOrganizationsResponse$OrganizationsResponseV2.c) && jl40.l(this.d, baseOrganizationsResponse$OrganizationsResponseV2.d) && jl40.l(this.e, baseOrganizationsResponse$OrganizationsResponseV2.e) && jl40.l(this.f, baseOrganizationsResponse$OrganizationsResponseV2.f) && jl40.l(this.g, baseOrganizationsResponse$OrganizationsResponseV2.g) && jl40.l(this.h, baseOrganizationsResponse$OrganizationsResponseV2.h);
    }

    @Override // defpackage.l65
    /* renamed from: getMapObjects, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        int c = unr0.c((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto = this.e;
        int c2 = unr0.c((this.f.hashCode() + ((c + (organizationsEmptyScreenConfigDto == null ? 0 : organizationsEmptyScreenConfigDto.hashCode())) * 31)) * 31, 31, this.g);
        uc4 uc4Var = this.h;
        return c2 + (uc4Var != null ? uc4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationsResponseV2(page=");
        sb.append(this.a);
        sb.append(", nextPage=");
        sb.append(this.b);
        sb.append(", paginationContext=");
        tse0.x(this.c, ", mapObjects=", ", emptyScreenConfig=", sb, this.d);
        sb.append(this.e);
        sb.append(", filtersAndSorting=");
        sb.append(this.f);
        sb.append(", items=");
        sb.append(this.g);
        sb.append(", bbox=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public BaseOrganizationsResponse$OrganizationsResponseV2() {
        FiltersAndSortingResponseDto filtersAndSortingResponseDto = new FiltersAndSortingResponseDto(0);
        this.a = -1;
        this.b = null;
        this.c = null;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = null;
        this.f = filtersAndSortingResponseDto;
        this.g = emptyList;
        this.h = null;
    }
}
