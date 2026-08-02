package com.yandex.go.chargers.data.model;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/data/model/Action$OpenDiscountDetails", "Lcom/yandex/go/chargers/data/model/e;", "Companion", "$serializer", "com/yandex/go/chargers/data/model/c", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Action$OpenDiscountDetails extends e {
    public static final c Companion = new c();
    public final ChargersDiscountDto a;

    public Action$OpenDiscountDetails(int i, ChargersDiscountDto chargersDiscountDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = chargersDiscountDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$OpenDiscountDetails) && jl40.l(this.a, ((Action$OpenDiscountDetails) obj).a);
    }

    public final int hashCode() {
        ChargersDiscountDto chargersDiscountDto = this.a;
        if (chargersDiscountDto == null) {
            return 0;
        }
        return chargersDiscountDto.hashCode();
    }

    public final String toString() {
        return "OpenDiscountDetails(discount=" + this.a + Extension.C_BRAKE;
    }

    public Action$OpenDiscountDetails() {
        this.a = null;
    }
}
