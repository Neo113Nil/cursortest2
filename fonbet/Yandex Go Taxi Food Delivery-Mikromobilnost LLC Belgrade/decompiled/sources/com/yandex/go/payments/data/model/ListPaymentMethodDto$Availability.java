package com.yandex.go.payments.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/data/model/ListPaymentMethodDto$Availability", "", "Companion", "$serializer", "com/yandex/go/payments/data/model/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListPaymentMethodDto$Availability {
    public static final t Companion = new t();
    public final boolean a;
    public final String b;

    public /* synthetic */ ListPaymentMethodDto$Availability(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public ListPaymentMethodDto$Availability() {
        this.a = false;
        this.b = null;
    }
}
