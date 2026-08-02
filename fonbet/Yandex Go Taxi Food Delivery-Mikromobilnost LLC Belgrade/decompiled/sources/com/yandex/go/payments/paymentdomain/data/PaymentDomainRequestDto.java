package com.yandex.go.payments.paymentdomain.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nk90;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/data/PaymentDomainRequestDto;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentdomain/data/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentDomainRequestDto {
    public static final e Companion = new e();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(11)), null};
    public final List a;
    public final String b;

    public /* synthetic */ PaymentDomainRequestDto(int i, List list, String str) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public PaymentDomainRequestDto(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public PaymentDomainRequestDto() {
        this(EmptyList.a, null);
    }
}
