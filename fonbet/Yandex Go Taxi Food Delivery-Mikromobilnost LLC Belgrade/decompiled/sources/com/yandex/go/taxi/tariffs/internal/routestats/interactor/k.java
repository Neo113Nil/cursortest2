package com.yandex.go.taxi.tariffs.internal.routestats.interactor;

import defpackage.mmf0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class k implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ mmf0 b;

    public k(tpr tprVar, mmf0 mmf0Var) {
        this.a = tprVar;
        this.b = mmf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PromoCodeInteractor$promoCodeFlow$$inlined$map$1$1 promoCodeInteractor$promoCodeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PromoCodeInteractor$promoCodeFlow$$inlined$map$1$1) {
            promoCodeInteractor$promoCodeFlow$$inlined$map$1$1 = (PromoCodeInteractor$promoCodeFlow$$inlined$map$1$1) continuation;
            int i2 = promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.L$0 = null;
                    promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.L$1 = null;
                    promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.L$2 = null;
                    promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, promoCodeInteractor$promoCodeFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        promoCodeInteractor$promoCodeFlow$$inlined$map$1$1 = new PromoCodeInteractor$promoCodeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoCodeInteractor$promoCodeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
