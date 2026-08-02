package com.ybsdk.feature.card.internal.interactors;

import defpackage.d13;
import defpackage.dqg;
import defpackage.e13;
import defpackage.f13;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar, j jVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1 cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof CardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1) {
            cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1 = (CardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    s2e0 s2e0Var = (s2e0) obj;
                    if (s2e0Var instanceof q2e0) {
                        obj3 = new e13((dqg) ((q2e0) s2e0Var).a);
                    } else if (jl40.l(s2e0Var, r2e0.a)) {
                        obj3 = f13.a;
                    } else if (s2e0Var instanceof n2e0) {
                        obj3 = new d13(((n2e0) s2e0Var).a);
                    }
                    if (obj3 != null) {
                        cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(obj3, cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1 = new CardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardReissueInteractor$getCardReissueStatus$$inlined$mapNotNull$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
