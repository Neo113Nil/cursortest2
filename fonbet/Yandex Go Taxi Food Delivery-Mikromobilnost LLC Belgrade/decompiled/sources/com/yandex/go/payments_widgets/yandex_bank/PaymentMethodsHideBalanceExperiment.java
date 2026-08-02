package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.gsq0;
import defpackage.nzs;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.w96;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments_widgets/yandex_bank/PaymentMethodsHideBalanceExperiment;", "Lw96;", "Companion", "com/yandex/go/payments_widgets/yandex_bank/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PaymentMethodsHideBalanceExperiment extends w96 {
    public static final a Companion = new a();
    public static final PaymentMethodsHideBalanceExperiment f = new PaymentMethodsHideBalanceExperiment(0);
    public final boolean b;
    public final long c;
    public final double d;
    public final double e;

    public /* synthetic */ PaymentMethodsHideBalanceExperiment(int i, boolean z, long j, double d, double d2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = 2000L;
        } else {
            this.c = j;
        }
        if ((i & 4) == 0) {
            this.d = 7.0d;
        } else {
            this.d = d;
        }
        if ((i & 8) == 0) {
            this.e = 5.0d;
        } else {
            this.e = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodsHideBalanceExperiment)) {
            return false;
        }
        PaymentMethodsHideBalanceExperiment paymentMethodsHideBalanceExperiment = (PaymentMethodsHideBalanceExperiment) obj;
        return this.b == paymentMethodsHideBalanceExperiment.b && this.c == paymentMethodsHideBalanceExperiment.c && Double.compare(this.d, paymentMethodsHideBalanceExperiment.d) == 0 && Double.compare(this.e, paymentMethodsHideBalanceExperiment.e) == 0;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + unr0.a(qv10.c(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentMethodsHideBalanceExperiment(enabled=");
        sb.append(this.b);
        sb.append(", timeWindow=");
        sb.append(this.c);
        nzs.o(sb, ", startMinGravityValue=", this.d, ", startMaxGravityValue=");
        return nzs.c(sb, this.e, Extension.C_BRAKE);
    }

    public PaymentMethodsHideBalanceExperiment(int i) {
        this.b = false;
        this.c = 2000L;
        this.d = 7.0d;
        this.e = 5.0d;
    }

    public PaymentMethodsHideBalanceExperiment() {
        this(0);
    }
}
