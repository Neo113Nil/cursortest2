package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;
import defpackage.wpp0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultItemDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/d0", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchResultItemDto {
    public static final d0 Companion = new d0();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(13)), null, null};
    public final h0 a;
    public final Map b;
    public final a0 c;
    public final String d;

    public /* synthetic */ SearchResultItemDto(int i, h0 h0Var, Map map, a0 a0Var, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, SearchResultItemDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = h0Var;
        this.b = map;
        this.c = a0Var;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultItemDto)) {
            return false;
        }
        SearchResultItemDto searchResultItemDto = (SearchResultItemDto) obj;
        return jl40.l(this.a, searchResultItemDto.a) && jl40.l(this.b, searchResultItemDto.b) && jl40.l(this.c, searchResultItemDto.c) && jl40.l(this.d, searchResultItemDto.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SearchResultItemDto(listItem=" + this.a + ", ticketingSystemContext=" + this.b + ", searchData=" + this.c + ", deduplicationKey=" + this.d + Extension.C_BRAKE;
    }
}
