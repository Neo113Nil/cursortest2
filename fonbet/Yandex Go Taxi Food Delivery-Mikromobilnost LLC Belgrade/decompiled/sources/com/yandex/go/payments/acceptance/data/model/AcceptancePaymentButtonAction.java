package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentButtonAction;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentButtonAction {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(0))};
    public final AcceptancePaymentButtonActionType a;

    public /* synthetic */ AcceptancePaymentButtonAction(int i, AcceptancePaymentButtonActionType acceptancePaymentButtonActionType) {
        if ((i & 1) == 0) {
            this.a = AcceptancePaymentButtonActionType.UNKNOWN;
        } else {
            this.a = acceptancePaymentButtonActionType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AcceptancePaymentButtonAction) && this.a == ((AcceptancePaymentButtonAction) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AcceptancePaymentButtonAction(type=" + this.a + Extension.C_BRAKE;
    }

    public AcceptancePaymentButtonAction() {
        this.a = AcceptancePaymentButtonActionType.UNKNOWN;
    }
}
