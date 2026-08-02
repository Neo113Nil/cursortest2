package com.yandex.go.payments_widgets.section.payments;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.pyp0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments_widgets/section/payments/PaymentWidgetsSection;", "Lpyp0;", "Companion", "$serializer", "com/yandex/go/payments_widgets/section/payments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentWidgetsSection extends pyp0 {
    public static final b Companion = new b();
    public final String a;
    public final boolean b;
    public final PaymentWidgetsDataDto c;
    public final String d;

    public /* synthetic */ PaymentWidgetsSection(int i, String str, boolean z, PaymentWidgetsDataDto paymentWidgetsDataDto, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = paymentWidgetsDataDto;
        }
        if ((i & 8) == 0) {
            this.d = "payment_widgets";
        } else {
            this.d = str2;
        }
    }

    @Override // defpackage.pyp0
    /* renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // defpackage.pyp0
    /* renamed from: d, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentWidgetsSection)) {
            return false;
        }
        PaymentWidgetsSection paymentWidgetsSection = (PaymentWidgetsSection) obj;
        return jl40.l(this.a, paymentWidgetsSection.a) && this.b == paymentWidgetsSection.b && jl40.l(this.c, paymentWidgetsSection.c) && jl40.l(this.d, paymentWidgetsSection.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        PaymentWidgetsDataDto paymentWidgetsDataDto = this.c;
        return this.d.hashCode() + ((e + (paymentWidgetsDataDto == null ? 0 : paymentWidgetsDataDto.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("PaymentWidgetsSection(id=", this.a, ", reloadable=", ", data=", this.b);
        l.append(this.c);
        l.append(", type=");
        l.append(this.d);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public PaymentWidgetsSection() {
        this.a = "";
        this.b = false;
        this.c = null;
        this.d = "payment_widgets";
    }
}
