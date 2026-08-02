package com.yandex.go.payments.shared.data.model;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/shared/data/model/SetCurrencyRequest;", "", "Companion", "$serializer", "com/yandex/go/payments/shared/data/model/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SetCurrencyRequest {
    public static final r Companion = new r();
    public final String a;

    public /* synthetic */ SetCurrencyRequest(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, SetCurrencyRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public SetCurrencyRequest(String str) {
        this.a = str;
    }
}
