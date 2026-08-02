package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchDataItemDto$UrlSearchDataDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/a0;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/z", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchDataItemDto$UrlSearchDataDto extends a0 {
    public static final z Companion = new z();
    public final String a;

    public SearchDataItemDto$UrlSearchDataDto(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, SearchDataItemDto$UrlSearchDataDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchDataItemDto$UrlSearchDataDto) && jl40.l(this.a, ((SearchDataItemDto$UrlSearchDataDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("UrlSearchDataDto(url=", this.a, Extension.C_BRAKE);
    }

    public SearchDataItemDto$UrlSearchDataDto(String str) {
        this.a = str;
    }
}
