package com.yandex.go.payments.paymentlist.experiments;

import com.yandex.go.payments.paymentlist.experiments.ExtraTipsPaymentMethodsExperiment;
import defpackage.fsn;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.qje;
import defpackage.sls;
import defpackage.xn11;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.a;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/ExtraTipsPaymentMethodsExperiment;", "Lxn11;", "Companion", "com/yandex/go/payments/paymentlist/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtraTipsPaymentMethodsExperiment implements xn11 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(17))};
    public static final ExtraTipsPaymentMethodsExperiment f = new ExtraTipsPaymentMethodsExperiment(0);
    public final boolean b;
    public final jsq0 c;
    public final i3y d;

    public /* synthetic */ ExtraTipsPaymentMethodsExperiment(int i, boolean z, jsq0 jsq0Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ExtraTipsPaymentMethodsExperiment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.b = z;
        this.c = jsq0Var;
        final int i2 = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: a5p
            public final /* synthetic */ ExtraTipsPaymentMethodsExperiment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                ExtraTipsPaymentMethodsExperiment extraTipsPaymentMethodsExperiment = this.b;
                switch (i3) {
                    case 0:
                        jsq0 jsq0Var2 = extraTipsPaymentMethodsExperiment.c;
                        HashSet hashSet = new HashSet();
                        a.N(jsq0Var2, hashSet);
                        return hashSet;
                    default:
                        jsq0 jsq0Var3 = extraTipsPaymentMethodsExperiment.c;
                        HashSet hashSet2 = new HashSet();
                        a.N(jsq0Var3, hashSet2);
                        return hashSet2;
                }
            }
        });
    }

    public ExtraTipsPaymentMethodsExperiment() {
        this(0);
    }

    public ExtraTipsPaymentMethodsExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
        final int i2 = 1;
        this.d = kotlin.a.a(new sls(this) { // from class: a5p
            public final /* synthetic */ ExtraTipsPaymentMethodsExperiment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                ExtraTipsPaymentMethodsExperiment extraTipsPaymentMethodsExperiment = this.b;
                switch (i3) {
                    case 0:
                        jsq0 jsq0Var2 = extraTipsPaymentMethodsExperiment.c;
                        HashSet hashSet = new HashSet();
                        a.N(jsq0Var2, hashSet);
                        return hashSet;
                    default:
                        jsq0 jsq0Var3 = extraTipsPaymentMethodsExperiment.c;
                        HashSet hashSet2 = new HashSet();
                        a.N(jsq0Var3, hashSet2);
                        return hashSet2;
                }
            }
        });
    }
}
