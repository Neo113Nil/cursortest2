package com.yandex.go.taxi.order.search.v2.data.api.response.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/v2/data/api/response/dto/HintDTO;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/search/v2/data/api/response/dto/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HintDTO {
    public static final b Companion = new b();
    public final String a;

    public /* synthetic */ HintDTO(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HintDTO) && jl40.l(this.a, ((HintDTO) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("HintDTO(searchStatus=", this.a, Extension.C_BRAKE);
    }

    public HintDTO() {
        this.a = null;
    }
}
