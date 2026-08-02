package com.yandex.go.chargers.offer.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.tsa;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes12.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ b b;
    public final /* synthetic */ tsa c;

    public a(tpr[] tprVarArr, b bVar, tsa tsaVar) {
        this.a = tprVarArr;
        this.b = bVar;
        this.c = tsaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1 chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1;
        int i;
        if (continuation instanceof ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1) {
            chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1 = (ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1) continuation;
            int i2 = chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 11);
                    ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$3 chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$3 = new ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$3(this.c, this.b, null);
                    chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.L$0 = null;
                    chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.L$1 = null;
                    chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.L$2 = null;
                    chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, v10Var, chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$3, chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1 = new ChargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1(this, continuation);
        Object obj2 = chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersCreateOfferInteractor$loadOffer$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
