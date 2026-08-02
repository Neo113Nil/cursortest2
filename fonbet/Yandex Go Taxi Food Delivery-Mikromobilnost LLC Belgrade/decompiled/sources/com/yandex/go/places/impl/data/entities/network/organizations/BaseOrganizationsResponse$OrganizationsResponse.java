package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l65;
import defpackage.ly3;
import defpackage.tse0;
import defpackage.tt4;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/impl/data/entities/network/organizations/BaseOrganizationsResponse$OrganizationsResponse", "Ll65;", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BaseOrganizationsResponse$OrganizationsResponse implements l65 {
    public static final a Companion = new a();
    public static final i3y[] h;
    public final int a;
    public final Integer b;
    public final String c;
    public final List d;
    public final OrganizationsEmptyScreenConfigDto e;
    public final FiltersAndSortingResponseDto f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, null, kotlin.a.b(lazyThreadSafetyMode, new tt4(10)), null, null, kotlin.a.b(lazyThreadSafetyMode, new tt4(11))};
    }

    public /* synthetic */ BaseOrganizationsResponse$OrganizationsResponse(int i, int i2, Integer num, String str, List list, OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto, FiltersAndSortingResponseDto filtersAndSortingResponseDto, List list2) {
        this.a = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        int i3 = i & 8;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = organizationsEmptyScreenConfigDto;
        }
        if ((i & 32) == 0) {
            this.f = new FiltersAndSortingResponseDto(0);
        } else {
            this.f = filtersAndSortingResponseDto;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list2;
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
        if (!(obj instanceof BaseOrganizationsResponse$OrganizationsResponse)) {
            return false;
        }
        BaseOrganizationsResponse$OrganizationsResponse baseOrganizationsResponse$OrganizationsResponse = (BaseOrganizationsResponse$OrganizationsResponse) obj;
        return this.a == baseOrganizationsResponse$OrganizationsResponse.a && jl40.l(this.b, baseOrganizationsResponse$OrganizationsResponse.b) && jl40.l(this.c, baseOrganizationsResponse$OrganizationsResponse.c) && jl40.l(this.d, baseOrganizationsResponse$OrganizationsResponse.d) && jl40.l(this.e, baseOrganizationsResponse$OrganizationsResponse.e) && jl40.l(this.f, baseOrganizationsResponse$OrganizationsResponse.f) && jl40.l(this.g, baseOrganizationsResponse$OrganizationsResponse.g);
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
        return this.g.hashCode() + ((this.f.hashCode() + ((c + (organizationsEmptyScreenConfigDto != null ? organizationsEmptyScreenConfigDto.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationsResponse(page=");
        sb.append(this.a);
        sb.append(", nextPage=");
        sb.append(this.b);
        sb.append(", paginationContext=");
        tse0.x(this.c, ", mapObjects=", ", emptyScreenConfig=", sb, this.d);
        sb.append(this.e);
        sb.append(", filtersAndSorting=");
        sb.append(this.f);
        sb.append(", items=");
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }

    public BaseOrganizationsResponse$OrganizationsResponse() {
        FiltersAndSortingResponseDto filtersAndSortingResponseDto = new FiltersAndSortingResponseDto(0);
        this.a = -1;
        this.b = null;
        this.c = null;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = null;
        this.f = filtersAndSortingResponseDto;
        this.g = emptyList;
    }
}
