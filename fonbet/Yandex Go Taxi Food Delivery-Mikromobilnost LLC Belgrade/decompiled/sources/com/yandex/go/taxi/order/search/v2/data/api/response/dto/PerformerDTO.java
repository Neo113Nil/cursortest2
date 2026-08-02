package com.yandex.go.taxi.order.search.v2.data.api.response.dto;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.t7a0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/search/v2/data/api/response/dto/PerformerDTO;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/search/v2/data/api/response/dto/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PerformerDTO {
    public static final c Companion = new c();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(24))};
    public final String a;
    public final String b;
    public final List c;

    public /* synthetic */ PerformerDTO(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerformerDTO)) {
            return false;
        }
        PerformerDTO performerDTO = (PerformerDTO) obj;
        return jl40.l(this.a, performerDTO.a) && jl40.l(this.b, performerDTO.b) && jl40.l(this.c, performerDTO.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ly3.s(b64.v("PerformerDTO(id=", this.a, ", displayTariff=", this.b, ", positions="), this.c, Extension.C_BRAKE);
    }

    public PerformerDTO() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
