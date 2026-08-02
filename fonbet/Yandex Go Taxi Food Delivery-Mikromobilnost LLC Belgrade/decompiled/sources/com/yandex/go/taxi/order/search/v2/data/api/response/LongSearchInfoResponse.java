package com.yandex.go.taxi.order.search.v2.data.api.response;

import com.yandex.go.taxi.order.search.v2.data.api.response.dto.ErrorDTO;
import com.yandex.go.taxi.order.search.v2.data.api.response.dto.HintDTO;
import com.yandex.go.taxi.order.search.v2.data.api.response.dto.PerformerDTO;
import com.yandex.go.taxi.order.search.v2.data.api.response.dto.c;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/v2/data/api/response/LongSearchInfoResponse;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/search/v2/data/api/response/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LongSearchInfoResponse {
    public static final a Companion = new a();
    public final Integer a;
    public final Integer b;
    public final PerformerDTO c;
    public final HintDTO d;
    public final ErrorDTO e;

    static {
        c cVar = PerformerDTO.Companion;
    }

    public /* synthetic */ LongSearchInfoResponse(int i, Integer num, Integer num2, PerformerDTO performerDTO, HintDTO hintDTO, ErrorDTO errorDTO) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = performerDTO;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hintDTO;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = errorDTO;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongSearchInfoResponse)) {
            return false;
        }
        LongSearchInfoResponse longSearchInfoResponse = (LongSearchInfoResponse) obj;
        return jl40.l(this.a, longSearchInfoResponse.a) && jl40.l(this.b, longSearchInfoResponse.b) && jl40.l(this.c, longSearchInfoResponse.c) && jl40.l(this.d, longSearchInfoResponse.d) && jl40.l(this.e, longSearchInfoResponse.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        PerformerDTO performerDTO = this.c;
        int hashCode3 = (hashCode2 + (performerDTO == null ? 0 : performerDTO.hashCode())) * 31;
        HintDTO hintDTO = this.d;
        int hashCode4 = (hashCode3 + (hintDTO == null ? 0 : hintDTO.hashCode())) * 31;
        ErrorDTO errorDTO = this.e;
        return hashCode4 + (errorDTO != null ? errorDTO.hashCode() : 0);
    }

    public final String toString() {
        return "LongSearchInfoResponse(radius=" + this.a + ", eta=" + this.b + ", performer=" + this.c + ", hints=" + this.d + ", error=" + this.e + Extension.C_BRAKE;
    }

    public LongSearchInfoResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
