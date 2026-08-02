package com.yandex.go.taxi.order.models.api.cancel;

import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/cancel/AfterCancelPopupButton$Action$Deeplink", "Lcom/yandex/go/taxi/order/models/api/cancel/t;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/q", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AfterCancelPopupButton$Action$Deeplink extends t {
    public static final q Companion = new q();
    public final String a;

    public AfterCancelPopupButton$Action$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.cancel.t
    public final AfterCancelPopupButton.ActionType a() {
        return AfterCancelPopupButton.ActionType.DEEPLINK;
    }

    @Override // com.yandex.go.taxi.order.models.api.cancel.t
    public final boolean b() {
        return this.a.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterCancelPopupButton$Action$Deeplink) && jl40.l(this.a, ((AfterCancelPopupButton$Action$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }

    public AfterCancelPopupButton$Action$Deeplink() {
        this.a = "";
    }
}
