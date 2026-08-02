package com.yandex.go.scooters.offers.v2.domain;

import defpackage.d4o0;
import defpackage.p3o0;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ScootersOffersInteractor$listenToScootersOfferResult$5 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        p3o0 p3o0Var = (p3o0) obj;
        Continuation continuation = (Continuation) obj2;
        g gVar = (g) this.receiver;
        return p3o0Var instanceof d4o0 ? gVar.a((d4o0) p3o0Var, continuation) : gVar.a(null, continuation);
    }
}
