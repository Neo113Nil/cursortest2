package defpackage;

import com.yandex.go.payments.paymentlist.experiments.PaymentMethodsCustomSubtitlesExperiment;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class k5a0 {
    public final pdc a;

    public k5a0(pdc pdcVar) {
        this.a = pdcVar;
    }

    public final p4a0 a(u0k u0kVar, PaymentMethodsCustomSubtitlesExperiment paymentMethodsCustomSubtitlesExperiment) {
        if (!paymentMethodsCustomSubtitlesExperiment.b || (u0kVar instanceof vi0)) {
            return null;
        }
        String c = vez0.c(u0kVar);
        String V = vez0.V(u0kVar);
        Iterator it = paymentMethodsCustomSubtitlesExperiment.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription paymentMethodsDescription = (PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsDescription) it.next();
            if (jl40.l(paymentMethodsDescription.getE(), c) && gia1.c(V, paymentMethodsDescription.getF())) {
                PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsSubtitlesTariffDescription paymentMethodsSubtitlesTariffDescription = (PaymentMethodsCustomSubtitlesExperiment.PaymentMethodsSubtitlesTariffDescription) a.R(paymentMethodsDescription.getD());
                String Y = d6z.Y(paymentMethodsCustomSubtitlesExperiment, paymentMethodsDescription.getA());
                pdc pdcVar = this.a;
                if (paymentMethodsSubtitlesTariffDescription != null) {
                    String Y2 = d6z.Y(paymentMethodsCustomSubtitlesExperiment, paymentMethodsSubtitlesTariffDescription.getB());
                    if (Y2.length() != 0) {
                        String Y3 = d6z.Y(paymentMethodsCustomSubtitlesExperiment, paymentMethodsSubtitlesTariffDescription.getA());
                        kdc i = ((ufu) pdcVar).i(paymentMethodsSubtitlesTariffDescription.getC());
                        if (Y3.length() != 0) {
                            Y = Y3;
                        }
                        return new p4a0(i, Y2, Y);
                    }
                }
                String Y4 = d6z.Y(paymentMethodsCustomSubtitlesExperiment, paymentMethodsDescription.getB());
                if (Y4.length() != 0 || Y.length() != 0) {
                    return new p4a0(((ufu) pdcVar).i(paymentMethodsDescription.getG()), Y4, Y);
                }
            }
        }
        return null;
    }
}
