package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto$BusNearbySearchListItemDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/h0;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/e0", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchResultListItemDto$BusNearbySearchListItemDto extends h0 {
    public static final e0 Companion = new e0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public SearchResultListItemDto$BusNearbySearchListItemDto(String str, String str2, String str3, String str4, int i, String str5) {
        this.a = (i & 1) == 0 ? "bus_nearby" : str;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultListItemDto$BusNearbySearchListItemDto)) {
            return false;
        }
        SearchResultListItemDto$BusNearbySearchListItemDto searchResultListItemDto$BusNearbySearchListItemDto = (SearchResultListItemDto$BusNearbySearchListItemDto) obj;
        return jl40.l(this.a, searchResultListItemDto$BusNearbySearchListItemDto.a) && jl40.l(this.b, searchResultListItemDto$BusNearbySearchListItemDto.b) && jl40.l(this.c, searchResultListItemDto$BusNearbySearchListItemDto.c) && jl40.l(this.d, searchResultListItemDto$BusNearbySearchListItemDto.d) && jl40.l(this.e, searchResultListItemDto$BusNearbySearchListItemDto.e);
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
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BusNearbySearchListItemDto(type=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", licensePlate=", this.d, ", iconTag=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public SearchResultListItemDto$BusNearbySearchListItemDto() {
        this.a = "bus_nearby";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
