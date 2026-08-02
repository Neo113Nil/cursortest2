package com.yandex.go.places.impl.data.entities.network.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import defpackage.gsq0;
import defpackage.uc4;
import defpackage.zzs;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/organizations/OrganizationsStateRequestParam;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/organizations/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationsStateRequestParam {
    public static final u Companion = new u();
    public final zzs a;
    public final FiltersAndSortingRequestDto b;
    public final uc4 c;
    public final Integer d;
    public final String e;
    public final String f;
    public final Long g;
    public final Double h;

    public /* synthetic */ OrganizationsStateRequestParam(int i, zzs zzsVar, FiltersAndSortingRequestDto filtersAndSortingRequestDto, uc4 uc4Var, Integer num, String str, String str2, Long l, Double d) {
        this.a = (i & 1) == 0 ? zzs.f : zzsVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = filtersAndSortingRequestDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = uc4Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d;
        }
    }

    public OrganizationsStateRequestParam() {
        this(null, null, null, null, null, null, 255);
    }

    public OrganizationsStateRequestParam(zzs zzsVar, FiltersAndSortingRequestDto filtersAndSortingRequestDto, uc4 uc4Var, Integer num, String str, String str2, Long l, Double d) {
        this.a = zzsVar;
        this.b = filtersAndSortingRequestDto;
        this.c = uc4Var;
        this.d = num;
        this.e = str;
        this.f = str2;
        this.g = l;
        this.h = d;
    }

    public /* synthetic */ OrganizationsStateRequestParam(zzs zzsVar, FiltersAndSortingRequestDto filtersAndSortingRequestDto, uc4 uc4Var, Integer num, String str, String str2, int i) {
        this((i & 1) != 0 ? zzs.f : zzsVar, (i & 2) != 0 ? null : filtersAndSortingRequestDto, (i & 4) != 0 ? null : uc4Var, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, null, null);
    }
}
