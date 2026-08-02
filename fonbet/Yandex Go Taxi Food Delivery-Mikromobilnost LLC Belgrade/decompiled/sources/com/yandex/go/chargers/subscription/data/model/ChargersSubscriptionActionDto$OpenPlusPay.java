package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/subscription/data/model/ChargersSubscriptionActionDto$OpenPlusPay", "Lcom/yandex/go/chargers/subscription/data/model/h;", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersSubscriptionActionDto$OpenPlusPay extends h {
    public static final f Companion = new f();
    public final ChargersPlusOfferParametersDto a;

    public ChargersSubscriptionActionDto$OpenPlusPay(int i, ChargersPlusOfferParametersDto chargersPlusOfferParametersDto) {
        if ((i & 1) == 0) {
            this.a = new ChargersPlusOfferParametersDto(0);
        } else {
            this.a = chargersPlusOfferParametersDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersSubscriptionActionDto$OpenPlusPay) && jl40.l(this.a, ((ChargersSubscriptionActionDto$OpenPlusPay) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPlusPay(offerParams=" + this.a + Extension.C_BRAKE;
    }

    public ChargersSubscriptionActionDto$OpenPlusPay() {
        this.a = new ChargersPlusOfferParametersDto(0);
    }
}
