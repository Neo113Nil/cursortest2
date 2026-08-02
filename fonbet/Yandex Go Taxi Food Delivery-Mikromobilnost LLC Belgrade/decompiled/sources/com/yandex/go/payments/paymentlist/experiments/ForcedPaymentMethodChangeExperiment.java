package com.yandex.go.payments.paymentlist.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ogr;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/ForcedPaymentMethodChangeExperiment;", "Lw96;", "Companion", "com/yandex/go/payments/paymentlist/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ForcedPaymentMethodChangeExperiment extends w96 {
    public static final b Companion = new b();
    public static final i3y[] f;
    public static final ForcedPaymentMethodChangeExperiment g;
    public final boolean b;
    public final String c;
    public final PaymentMethod$Type d;
    public final List e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new ogr(22)), kotlin.a.b(lazyThreadSafetyMode, new ogr(23))};
        g = new ForcedPaymentMethodChangeExperiment(0);
    }

    public /* synthetic */ ForcedPaymentMethodChangeExperiment(int i, boolean z, String str, PaymentMethod$Type paymentMethod$Type, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = paymentMethod$Type;
        }
        if ((i & 8) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ForcedPaymentMethodChangeExperiment(int i) {
        this.b = false;
        this.c = "";
        this.d = null;
        this.e = EmptyList.a;
    }

    public ForcedPaymentMethodChangeExperiment() {
        this(0);
    }
}
