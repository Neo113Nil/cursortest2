package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.jqr;
import defpackage.lod0;
import defpackage.qqx0;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.zio;
import java.util.Locale;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n;

/* loaded from: classes2.dex */
public abstract class d implements lod0 {
    public final PlusPayCompositeOffers.Offer a;
    public final PlusPayPaymentAnalyticsParams b;
    public final com.yandex.plus.pay.internal.feature.cache.a c;
    public final qqx0 d;
    public final com.yandex.plus.experiments.impl.providers.a e;
    public final com.yandex.plus.core.benchmark.a f;
    public final com.yandex.plus.core.benchmark.b g;
    public final jqr h = new jqr(new n(new rol0(new TarifficatorBaseInvoicePaymentSession$startPayment$1(this, null)), new TarifficatorBaseInvoicePaymentSession$flow$1(this, null)), new TarifficatorBaseInvoicePaymentSession$flow$2(this, null), 3);
    public final String i;

    public d(PlusPayCompositeOffers.Offer offer, UUID uuid, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, com.yandex.plus.pay.internal.feature.cache.a aVar, qqx0 qqx0Var, com.yandex.plus.experiments.impl.providers.a aVar2, com.yandex.plus.core.benchmark.a aVar3) {
        this.a = offer;
        this.b = plusPayPaymentAnalyticsParams;
        this.c = aVar;
        this.d = qqx0Var;
        this.e = aVar2;
        this.f = aVar3;
        this.g = aVar3.c("Payment.Native.Success");
        this.i = uuid.toString().toUpperCase(Locale.ROOT);
    }

    public static final void b(d dVar, PlusPayInvoice plusPayInvoice) {
        qqx0 qqx0Var = dVar.d;
        PlusPayCompositeOffers.Offer offer = dVar.a;
        zio zioVar = (zio) qqx0Var;
        zioVar.c(dVar.b, offer);
        zioVar.f(offer, plusPayInvoice.getId(), dVar.i);
    }

    public abstract Object c(Continuation continuation);

    public abstract Object d(PlusPayInvoice plusPayInvoice, Continuation continuation);

    public abstract Object e(PlusPayInvoice plusPayInvoice, vpr vprVar, Continuation continuation);
}
