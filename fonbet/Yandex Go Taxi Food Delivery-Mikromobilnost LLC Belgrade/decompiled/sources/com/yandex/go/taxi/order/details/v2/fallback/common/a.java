package com.yandex.go.taxi.order.details.v2.fallback.common;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a {
    public final h3y a;
    public final h3y b;
    public final tt2 c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public a(h3y h3yVar, h3y h3yVar2, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = tt2Var;
    }

    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new RideCardLocalResponseDelegate$warmup$2(this, taxiOrder, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
