package com.yandex.go.requirements.comment.summary.ui.v3.data.net.request;

import defpackage.e4a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nk90;
import defpackage.qje;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/net/request/PaymentInfoDto;", "", "Companion", "$serializer", "com/yandex/go/requirements/comment/summary/ui/v3/data/net/request/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PaymentInfoDto {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(25)), null};
    public final PaymentMethod$Type a;
    public final String b;

    public /* synthetic */ PaymentInfoDto(int i, String str, PaymentMethod$Type paymentMethod$Type) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, PaymentInfoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = paymentMethod$Type;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentInfoDto)) {
            return false;
        }
        PaymentInfoDto paymentInfoDto = (PaymentInfoDto) obj;
        return this.a == paymentInfoDto.a && jl40.l(this.b, paymentInfoDto.b);
    }

    public final int hashCode() {
        PaymentMethod$Type paymentMethod$Type = this.a;
        int hashCode = (paymentMethod$Type == null ? 0 : paymentMethod$Type.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentInfoDto(paymentMethod=" + this.a + ", paymentMethodId=" + this.b + Extension.C_BRAKE;
    }

    public PaymentInfoDto(e4a0 e4a0Var, String str) {
        this.a = e4a0Var.a();
        this.b = str;
    }
}
