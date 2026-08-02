package com.yandex.go.scooters.offers.v2.domain;

import defpackage.k4o0;
import defpackage.l4o0;
import defpackage.m4o0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4o0;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.domain.ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3", f = "ScootersOffersInteractor.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3(Continuation continuation, f fVar) {
        super(3, continuation);
        this.receiver$inlined = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3 scootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3 = new ScootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3((Continuation) obj3, this.receiver$inlined);
        scootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3.L$0 = (vpr) obj;
        scootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3.L$1 = obj2;
        return scootersOffersInteractor$listenToScootersOfferResult$$inlined$flatMapLatest$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rol0 rol0Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o4o0 o4o0Var = (o4o0) obj2;
            f fVar = this.receiver$inlined;
            fVar.getClass();
            if (o4o0Var instanceof m4o0) {
                rol0Var = new rol0(new ScootersCreateOfferInteractor$loadSingleScooterOffer$1(fVar, (m4o0) o4o0Var, null));
            } else if (o4o0Var instanceof k4o0) {
                rol0Var = new rol0(new ScootersCreateOfferInteractor$loadMultiorderOffers$1(fVar, (k4o0) o4o0Var, null));
            } else {
                if (!(o4o0Var instanceof l4o0)) {
                    w511.b();
                    return null;
                }
                rol0Var = new rol0(new ScootersCreateOfferInteractor$loadParkingSelectedScooterOffer$1(fVar, (l4o0) o4o0Var, null));
            }
            tpr d = com.yandex.go.coroutines.b.d(rol0Var, new ScootersCreateOfferInteractor$measureRequest$1(fVar, o4o0Var, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(d, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
