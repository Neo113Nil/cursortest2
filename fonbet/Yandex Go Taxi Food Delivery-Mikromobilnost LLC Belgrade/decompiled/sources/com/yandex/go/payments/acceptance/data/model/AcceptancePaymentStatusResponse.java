package com.yandex.go.payments.acceptance.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentStatusResponse;", "", "Companion", "$serializer", "com/yandex/go/payments/acceptance/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AcceptancePaymentStatusResponse {
    public static final g Companion = new g();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(4)), null, null};
    public final AcceptancePaymentStatus a;
    public final String b;
    public final AcceptancePaymentUi c;

    public /* synthetic */ AcceptancePaymentStatusResponse(int i, AcceptancePaymentStatus acceptancePaymentStatus, String str, AcceptancePaymentUi acceptancePaymentUi) {
        this.a = (i & 1) == 0 ? AcceptancePaymentStatus.UNKNOWN : acceptancePaymentStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = new AcceptancePaymentUi(0);
        } else {
            this.c = acceptancePaymentUi;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptancePaymentStatusResponse)) {
            return false;
        }
        AcceptancePaymentStatusResponse acceptancePaymentStatusResponse = (AcceptancePaymentStatusResponse) obj;
        return this.a == acceptancePaymentStatusResponse.a && jl40.l(this.b, acceptancePaymentStatusResponse.b) && jl40.l(this.c, acceptancePaymentStatusResponse.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "AcceptancePaymentStatusResponse(status=" + this.a + ", paymentUrl=" + this.b + ", ui=" + this.c + Extension.C_BRAKE;
    }

    public AcceptancePaymentStatusResponse() {
        AcceptancePaymentStatus acceptancePaymentStatus = AcceptancePaymentStatus.UNKNOWN;
        AcceptancePaymentUi acceptancePaymentUi = new AcceptancePaymentUi(0);
        this.a = acceptancePaymentStatus;
        this.b = null;
        this.c = acceptancePaymentUi;
    }
}
