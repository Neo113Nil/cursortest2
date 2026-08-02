package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/overdraft/data/model/TapAction$SwitchPaymentMethodAction", "Lcom/yandex/go/overdraft/data/model/t0;", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/p0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapAction$SwitchPaymentMethodAction extends t0 {
    public static final p0 Companion = new p0();
    public final DebtAvailablePaymentMethod a;

    public TapAction$SwitchPaymentMethodAction(int i, DebtAvailablePaymentMethod debtAvailablePaymentMethod) {
        if ((i & 1) != 0) {
            this.a = debtAvailablePaymentMethod;
        } else {
            DebtAvailablePaymentMethod.Companion.getClass();
            this.a = DebtAvailablePaymentMethod.c;
        }
    }

    @Override // com.yandex.go.overdraft.data.model.t0
    public final ButtonActionType a() {
        return ButtonActionType.SWITCH_PAYMENT_METHOD_AND_OPEN_SUMMARY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TapAction$SwitchPaymentMethodAction) && jl40.l(this.a, ((TapAction$SwitchPaymentMethodAction) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SwitchPaymentMethodAction(paymentMethod=" + this.a + Extension.C_BRAKE;
    }

    public TapAction$SwitchPaymentMethodAction() {
        DebtAvailablePaymentMethod.Companion.getClass();
        this.a = DebtAvailablePaymentMethod.c;
    }
}
