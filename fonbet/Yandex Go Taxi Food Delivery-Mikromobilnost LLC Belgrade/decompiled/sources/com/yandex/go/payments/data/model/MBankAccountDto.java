package com.yandex.go.payments.data.model;

import com.yandex.go.payments.data.model.response.Card;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qxz;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/data/model/MBankAccountDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "$serializer", "com/yandex/go/payments/data/model/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MBankAccountDto extends u {
    public static final y Companion = new y();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qxz(3))};
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final String c;
    public final String d;
    public final String e;
    public final Card.VerifyStrategy f;

    public MBankAccountDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, String str2, String str3, String str4, Card.VerifyStrategy verifyStrategy) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = verifyStrategy;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public MBankAccountDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
