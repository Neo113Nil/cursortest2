package com.yandex.plus.pay.internal.feature.payment.p002native;

import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.payment.common.b;
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
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a extends d {
    public final PlusPayCompositeOffers.Offer j;
    public final String k;
    public final boolean l;
    public final PlusPayPaymentAnalyticsParams m;
    public final Map n;
    public final List o;
    public final s5f p;
    public final c1u0 q;
    public final k0x0 r;
    public final mdd0 s;
    public final jqr t;

    public a(PlusPayCompositeOffers.Offer offer, String str, UUID uuid, boolean z, PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, Map map, List list, s5f s5fVar, c1u0 c1u0Var, k0x0 k0x0Var, com.yandex.plus.pay.internal.feature.cache.a aVar, qqx0 qqx0Var, com.yandex.plus.experiments.impl.providers.a aVar2, com.yandex.plus.core.benchmark.a aVar3, mdd0 mdd0Var) {
        super(offer, uuid, plusPayPaymentAnalyticsParams, aVar, qqx0Var, aVar2, aVar3);
        this.j = offer;
        this.k = str;
        this.l = z;
        this.m = plusPayPaymentAnalyticsParams;
        this.n = map;
        this.o = list;
        this.p = s5fVar;
        this.q = c1u0Var;
        this.r = k0x0Var;
        this.s = mdd0Var;
        this.t = new jqr(this.h, new TarifficatorNativePaymentSession$flow$1(this, null), 3);
    }

    @Override // defpackage.lod0
    public final tpr a() {
        return this.t;
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object c(Continuation continuation) {
        return ((com.yandex.plus.pay.internal.feature.payment.common.a) this.p).a(this.j, this.m, this.k, this.n, this.l, this.o, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object d(PlusPayInvoice plusPayInvoice, Continuation continuation) {
        return ((b) this.q).b(plusPayInvoice, (ContinuationImpl) continuation);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.d
    public final Object e(PlusPayInvoice plusPayInvoice, vpr vprVar, Continuation continuation) {
        return ((c) this.r).c(plusPayInvoice, new e(new TarifficatorNativePaymentSession$waitForInvoiceSync$3(vprVar, null), new TarifficatorNativePaymentSession$waitForInvoiceSync$2(vprVar, null)), (ContinuationImpl) continuation);
    }
}
