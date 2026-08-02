package com.yandex.go.masstransit.sdk.client_api.data.dto;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qje;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@jxi
@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto$RailwayScheduleSearchListItemDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/h0;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/f0", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchResultListItemDto$RailwayScheduleSearchListItemDto extends h0 {
    public static final f0 Companion = new f0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final CurrencyRulesDto k;

    public SearchResultListItemDto$RailwayScheduleSearchListItemDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, CurrencyRulesDto currencyRulesDto) {
        if (128 != (i & 128)) {
            qje.Z(i, 128, SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? "railway_schedule" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        this.h = str8;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = currencyRulesDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultListItemDto$RailwayScheduleSearchListItemDto)) {
            return false;
        }
        SearchResultListItemDto$RailwayScheduleSearchListItemDto searchResultListItemDto$RailwayScheduleSearchListItemDto = (SearchResultListItemDto$RailwayScheduleSearchListItemDto) obj;
        return jl40.l(this.a, searchResultListItemDto$RailwayScheduleSearchListItemDto.a) && jl40.l(this.b, searchResultListItemDto$RailwayScheduleSearchListItemDto.b) && jl40.l(this.c, searchResultListItemDto$RailwayScheduleSearchListItemDto.c) && jl40.l(this.d, searchResultListItemDto$RailwayScheduleSearchListItemDto.d) && jl40.l(this.e, searchResultListItemDto$RailwayScheduleSearchListItemDto.e) && jl40.l(this.f, searchResultListItemDto$RailwayScheduleSearchListItemDto.f) && jl40.l(this.g, searchResultListItemDto$RailwayScheduleSearchListItemDto.g) && jl40.l(this.h, searchResultListItemDto$RailwayScheduleSearchListItemDto.h) && jl40.l(this.i, searchResultListItemDto$RailwayScheduleSearchListItemDto.i) && jl40.l(this.j, searchResultListItemDto$RailwayScheduleSearchListItemDto.j) && jl40.l(this.k, searchResultListItemDto$RailwayScheduleSearchListItemDto.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int b = unr0.b((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.h);
        String str7 = this.i;
        int hashCode7 = (b + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        CurrencyRulesDto currencyRulesDto = this.k;
        return hashCode8 + (currencyRulesDto != null ? currencyRulesDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("RailwayScheduleSearchListItemDto(type=", this.a, ", iconTag=", this.b, ", departureTime=");
        g8e.D(v, this.c, ", departureDetail=", this.d, ", arrivalTime=");
        g8e.D(v, this.e, ", arrivalDetail=", this.f, ", durationText=");
        g8e.D(v, this.g, ", serviceTitle=", this.h, ", routeDescription=");
        g8e.D(v, this.i, ", price=", this.j, ", currencyRules=");
        v.append(this.k);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
