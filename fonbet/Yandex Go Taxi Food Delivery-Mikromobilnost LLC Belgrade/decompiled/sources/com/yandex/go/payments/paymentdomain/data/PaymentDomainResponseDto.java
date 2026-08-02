package com.yandex.go.payments.paymentdomain.data;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentdomain/data/PaymentDomainResponseDto;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentdomain/data/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentDomainResponseDto {
    public static final f Companion = new f();
    public final DomainConfigDto a;
    public final String b;
    public final String c;

    public /* synthetic */ PaymentDomainResponseDto(int i, DomainConfigDto domainConfigDto, String str, String str2) {
        this.a = (i & 1) == 0 ? new DomainConfigDto(0) : domainConfigDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
    }

    public PaymentDomainResponseDto() {
        this.a = new DomainConfigDto(0);
        this.b = "";
        this.c = "";
    }
}
