package com.yandex.go.payments.paymentlist.experiments;

import defpackage.f9a0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCashIconExperiment;", "Lw96;", "Companion", "CurrencyDescription", "com/yandex/go/payments/paymentlist/experiments/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodsCashIconExperiment extends w96 {
    public static final r Companion = new r();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(5))};
    public static final PaymentMethodsCashIconExperiment e = new PaymentMethodsCashIconExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ PaymentMethodsCashIconExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/PaymentMethodsCashIconExperiment$CurrencyDescription;", "", "Companion", "$serializer", "com/yandex/go/payments/paymentlist/experiments/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CurrencyDescription {
        public static final s Companion = new s();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new f9a0(6)), null};
        public final Map a;
        public final String b;

        public /* synthetic */ CurrencyDescription(int i, String str, Map map) {
            this.a = (i & 1) == 0 ? kotlin.collections.b.f() : map;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public CurrencyDescription() {
            this.a = kotlin.collections.b.f();
            this.b = "";
        }
    }

    public PaymentMethodsCashIconExperiment() {
        this(0);
    }

    public PaymentMethodsCashIconExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
