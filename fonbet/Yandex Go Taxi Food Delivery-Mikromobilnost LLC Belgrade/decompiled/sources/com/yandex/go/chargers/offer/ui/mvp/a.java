package com.yandex.go.chargers.offer.ui.mvp;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.wn9;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1 chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1) {
            chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1 = (ChargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1) continuation;
            int i2 = chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wn9 wn9Var = (wn9) obj;
                    Pair pair = new Pair(Boolean.valueOf(wn9Var.c || wn9Var.d), Boolean.valueOf(wn9Var.e));
                    chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.L$0 = null;
                    chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.L$1 = null;
                    chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.L$2 = null;
                    chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.L$3 = null;
                    chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1 = new ChargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersOfferPresenter$listenToPlaquesState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
