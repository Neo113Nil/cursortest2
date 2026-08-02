package com.yandex.go.yb.lack_of_order.domain;

import defpackage.jl40;
import defpackage.o2y0;
import defpackage.wls;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class TaxiOrderMoneyLackIntentInteractor$intentFlow$1$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Optional optional = (Optional) obj2;
        ((l) this.receiver).getClass();
        o2y0 o2y0Var = (o2y0) ((Optional) obj).orElse(null);
        String str = o2y0Var != null ? o2y0Var.b().a : null;
        o2y0 o2y0Var2 = (o2y0) optional.orElse(null);
        return Boolean.valueOf(jl40.l(str, o2y0Var2 != null ? o2y0Var2.b().a : null));
    }
}
