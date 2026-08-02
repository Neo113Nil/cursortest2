package com.yandex.go.taxi.order.infosharing.domain;

import defpackage.avj0;
import defpackage.bvf0;
import defpackage.o4h0;
import defpackage.r2y0;
import defpackage.s2y0;
import defpackage.v5y0;
import defpackage.vng;
import defpackage.w5y0;
import defpackage.zuj0;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final zuj0 a;
    public final ru.yandex.taxi.widget.utils.e b;

    public a(zuj0 zuj0Var, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = zuj0Var;
        this.b = eVar;
    }

    public final Object a(s2y0 s2y0Var, boolean z, ContinuationImpl continuationImpl) {
        CharSequence charSequence = s2y0Var.b;
        CharSequence charSequence2 = s2y0Var.c;
        if (charSequence.length() == 0 || charSequence2.length() == 0) {
            return null;
        }
        r2y0 r2y0Var = s2y0Var.d;
        v5y0 v5y0Var = new v5y0(r2y0Var.a, r2y0Var.b, r2y0Var.c, r2y0Var.d);
        return z ? new w5y0(s2y0Var.b, charSequence2, v5y0Var, vng.t(o4h0.ic_share_order_loading_state, ((avj0) this.a).a)) : bvf0.n(new TaxiOrderModalSharingUiStateMapper$internalMap$2(s2y0Var, v5y0Var, this, null), continuationImpl);
    }
}
