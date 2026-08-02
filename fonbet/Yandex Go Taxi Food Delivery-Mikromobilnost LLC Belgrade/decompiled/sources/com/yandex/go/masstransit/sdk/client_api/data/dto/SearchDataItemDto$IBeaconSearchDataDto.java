package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchDataItemDto$IBeaconSearchDataDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/a0;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/x", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchDataItemDto$IBeaconSearchDataDto extends a0 {
    public static final x Companion = new x();
    public final String a;
    public final int b;
    public final int c;

    public SearchDataItemDto$IBeaconSearchDataDto(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, SearchDataItemDto$IBeaconSearchDataDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDataItemDto$IBeaconSearchDataDto)) {
            return false;
        }
        SearchDataItemDto$IBeaconSearchDataDto searchDataItemDto$IBeaconSearchDataDto = (SearchDataItemDto$IBeaconSearchDataDto) obj;
        return jl40.l(this.a, searchDataItemDto$IBeaconSearchDataDto.a) && this.b == searchDataItemDto$IBeaconSearchDataDto.b && this.c == searchDataItemDto$IBeaconSearchDataDto.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "IBeaconSearchDataDto(uuid=", this.a, ", major=", ", minor="));
    }

    public SearchDataItemDto$IBeaconSearchDataDto(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
