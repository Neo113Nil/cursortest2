package com.yandex.go.chargers.feedback.data;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/feedback/data/ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails", "Lcom/yandex/go/chargers/feedback/data/o;", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails extends o {
    public static final l Companion = new l();
    public final ChargersDiscountDto a;

    public ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails(int i, ChargersDiscountDto chargersDiscountDto) {
        if (1 == (i & 1)) {
            this.a = chargersDiscountDto;
        } else {
            qje.Z(i, 1, ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails) && jl40.l(this.a, ((ChargersFeedbackScreenPromoPlateActionDto$OpenDiscountDetails) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenDiscountDetails(discount=" + this.a + Extension.C_BRAKE;
    }
}
