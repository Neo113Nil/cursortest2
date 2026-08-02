package com.yandex.go.chargers.discounts.data.models;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction", "Lcom/yandex/go/chargers/discounts/data/models/q;", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction extends q {
    public static final o Companion = new o();
    public final String a;

    public ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction) && jl40.l(this.a, ((ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectPromocodeAction(promocodeId=", this.a, Extension.C_BRAKE);
    }

    public ChargersDiscountsButtonDto$ChargersPromocodesAction$SelectPromocodeAction() {
        this.a = "";
    }
}
