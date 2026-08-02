package defpackage;

import com.yandex.go.payments.paymentlist.experiments.ExtraTipsPaymentMethodsExperiment;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final class jaa0 {
    public final qqo a;

    public jaa0(rqo rqoVar) {
        ExtraTipsPaymentMethodsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).c(ExtraTipsPaymentMethodsExperiment.f);
    }

    public final Set a() {
        ExtraTipsPaymentMethodsExperiment extraTipsPaymentMethodsExperiment = (ExtraTipsPaymentMethodsExperiment) this.a.b();
        return extraTipsPaymentMethodsExperiment.b ? (Set) extraTipsPaymentMethodsExperiment.d.getValue() : EmptySet.a;
    }
}
