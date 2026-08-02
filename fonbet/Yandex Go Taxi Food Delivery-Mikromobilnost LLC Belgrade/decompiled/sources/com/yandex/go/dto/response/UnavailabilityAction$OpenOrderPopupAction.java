package com.yandex.go.dto.response;

import com.yandex.go.zone.dto.objects.s6;
import com.yandex.go.zone.dto.objects.u2;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/UnavailabilityAction$OpenOrderPopupAction", "Lcom/yandex/go/dto/response/d2;", "Companion", "$serializer", "com/yandex/go/dto/response/z1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnavailabilityAction$OpenOrderPopupAction extends d2 {
    public static final z1 Companion = new z1();
    public final u2 a;

    public UnavailabilityAction$OpenOrderPopupAction(int i, u2 u2Var) {
        if ((i & 1) == 0) {
            this.a = s6.INSTANCE;
        } else {
            this.a = u2Var;
        }
    }

    @Override // com.yandex.go.dto.response.d2
    public final UnavailabilityActionType a() {
        return UnavailabilityActionType.OPEN_ORDER_POPUP;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnavailabilityAction$OpenOrderPopupAction) && jl40.l(this.a, ((UnavailabilityAction$OpenOrderPopupAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenOrderPopupAction(orderPopupProperties=" + this.a + Extension.C_BRAKE;
    }

    public UnavailabilityAction$OpenOrderPopupAction() {
        this.a = s6.INSTANCE;
    }
}
