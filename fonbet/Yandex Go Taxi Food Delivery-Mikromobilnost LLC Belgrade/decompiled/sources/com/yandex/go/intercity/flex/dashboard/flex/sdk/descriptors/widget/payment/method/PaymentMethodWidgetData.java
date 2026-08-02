package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/PaymentMethodWidgetData;", "", "Companion", "$serializer", "com/yandex/go/intercity/flex/dashboard/flex/sdk/descriptors/widget/payment/method/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PaymentMethodWidgetData {
    public static final a Companion = new a();
    public final String a;
    public final Integer b;

    public /* synthetic */ PaymentMethodWidgetData(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PaymentMethodWidgetData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodWidgetData)) {
            return false;
        }
        PaymentMethodWidgetData paymentMethodWidgetData = (PaymentMethodWidgetData) obj;
        return jl40.l(this.a, paymentMethodWidgetData.a) && jl40.l(this.b, paymentMethodWidgetData.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }
}
