package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import defpackage.wpp0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchRequestDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/b0", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchRequestDto {
    public static final b0 Companion = new b0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wpp0(11))};
    public final List a;

    public /* synthetic */ SearchRequestDto(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, SearchRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchRequestDto) && jl40.l(this.a, ((SearchRequestDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SearchRequestDto(searchItems=", Extension.C_BRAKE, this.a);
    }

    public SearchRequestDto(List list) {
        this.a = list;
    }
}
