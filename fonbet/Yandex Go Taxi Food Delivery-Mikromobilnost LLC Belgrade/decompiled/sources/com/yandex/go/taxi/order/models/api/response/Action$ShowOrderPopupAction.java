package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/Action$ShowOrderPopupAction", "Lcom/yandex/go/taxi/order/models/api/response/d;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Action$ShowOrderPopupAction extends d {
    public static final b Companion = new b();
    public final com.yandex.go.zone.dto.objects.u2 a;

    public Action$ShowOrderPopupAction(int i, com.yandex.go.zone.dto.objects.u2 u2Var) {
        if ((i & 1) == 0) {
            this.a = com.yandex.go.zone.dto.objects.s6.INSTANCE;
        } else {
            this.a = u2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$ShowOrderPopupAction) && jl40.l(this.a, ((Action$ShowOrderPopupAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowOrderPopupAction(orderPopupProperties=" + this.a + Extension.C_BRAKE;
    }

    public Action$ShowOrderPopupAction() {
        this.a = com.yandex.go.zone.dto.objects.s6.INSTANCE;
    }
}
