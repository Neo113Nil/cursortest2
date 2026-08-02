package com.yandex.go.chargers.order.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersOrderNotificationActionDto$ShowPopupById", "Lcom/yandex/go/chargers/order/data/model/u0;", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersOrderNotificationActionDto$ShowPopupById extends u0 {
    public static final s0 Companion = new s0();
    public final String a;

    public ChargersOrderNotificationActionDto$ShowPopupById(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, ChargersOrderNotificationActionDto$ShowPopupById$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersOrderNotificationActionDto$ShowPopupById) && jl40.l(this.a, ((ChargersOrderNotificationActionDto$ShowPopupById) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ShowPopupById(popupId=", this.a, Extension.C_BRAKE);
    }
}
