package com.yandex.plus.pay.internal.feature.payment.p002native;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.cache.a;
import com.yandex.plus.pay.internal.feature.payment.common.c;
import com.yandex.plus.pay.internal.feature.payment.common.d;
import com.yandex.plus.pay.internal.feature.payment.common.e;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.c1u0;
import defpackage.jqr;
import defpackage.k0x0;
import defpackage.mdd0;
import defpackage.qqx0;
import defpackage.s5f;
import defpackage.tpr;
import defpackage.vpr;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class b extends d {
    public final PlusPayCompositeOffers.Offer j;
    public final PlusPayPaymentAnalyticsParams k;
    public final Map l;
    public final s5f m;
    public final c1u0 n;
    public final k0x0 o;
    public final mdd0 p;
    public final jqr q;

    public b(PlusPayCompositeOffers.Offer offer, UUID uuid, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map map, s5f s5fVar, c1u0 c1u0Var, k0x0 k0x0Var, a aVar, qqx0 qqx0Var, com.yandex.plus.experiments.impl.providers.a aVar2, com.yandex.plus.core.benchmark.a aVar3, mdd0 mdd0Var) {
        super(offer, uuid, plusPayPaymentAnalyticsParams, aVar, qqx0Var, aVar2, aVar3);
        this.j = offer;
        this.k = plusPayPaymentAnalyticsParams;
        this.l = map;
        this.m = s5fVar;
        this.n = c1u0Var;
        this.o = k0x0Var;
        this.p = mdd0Var;
        this.q = new jqr(this.h, new TarifficatorSilentPaymentSession$flow$1(this, null), 3);
    }

    @Override // defpackage.lod0
    public final tpr a() {
        return this.q;
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object c(Continuation continuation) {
        return ((com.yandex.plus.pay.internal.feature.payment.common.a) this.m).b(this.j, this.k, this.l, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object d(PlusPayInvoice plusPayInvoice, Continuation continuation) {
        return ((com.yandex.plus.pay.internal.feature.payment.common.b) this.n).b(plusPayInvoice, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object e(PlusPayInvoice plusPayInvoice, vpr vprVar, Continuation continuation) {
        return ((c) this.o).c(plusPayInvoice, new e(new TarifficatorSilentPaymentSession$waitForInvoiceSync$3(vprVar, null), new TarifficatorSilentPaymentSession$waitForInvoiceSync$2(vprVar, null)), (ContinuationImpl) continuation);
    }
}
