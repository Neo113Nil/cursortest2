package com.yandex.go.payments.cards.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/PaymentVerificationsResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentVerificationsResponse {
    public static final i Companion = new i();
    public final String a;
    public final Verification b;

    static {
        m mVar = Verification.Companion;
    }

    public /* synthetic */ PaymentVerificationsResponse(int i, String str, Verification verification) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = verification;
        }
    }

    public PaymentVerificationsResponse() {
        this.a = "";
        this.b = null;
    }
}
