package com.yandex.go.chargers.order.completion.pre_finish.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/completion/pre_finish/data/model/ActiveOrderDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/completion/pre_finish/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ActiveOrderDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ ActiveOrderDto(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveOrderDto)) {
            return false;
        }
        ActiveOrderDto activeOrderDto = (ActiveOrderDto) obj;
        return jl40.l(this.a, activeOrderDto.a) && jl40.l(this.b, activeOrderDto.b) && jl40.l(this.c, activeOrderDto.c);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(n.r("ActiveOrderDto(stationInfo=", this.a, ", orderDetails=", this.b, ", powerBankIconTag="), this.c, Extension.C_BRAKE);
    }

    public ActiveOrderDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
