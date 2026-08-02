package com.yandex.go.places.impl.data.entities.network.payments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.t7a0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/payments/PaymentStatusResponse;", "", "Companion", "$serializer", "com/yandex/go/places/impl/data/entities/network/payments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentStatusResponse {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(18)), null};
    public final PaymentStatus a;
    public final String b;

    public /* synthetic */ PaymentStatusResponse(int i, PaymentStatus paymentStatus, String str) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, PaymentStatusResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = paymentStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentStatusResponse)) {
            return false;
        }
        PaymentStatusResponse paymentStatusResponse = (PaymentStatusResponse) obj;
        return this.a == paymentStatusResponse.a && jl40.l(this.b, paymentStatusResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PaymentStatusResponse(status=" + this.a + ", userInteractionUrl=" + this.b + Extension.C_BRAKE;
    }
}
