package com.yandex.go.chargers.order.active;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class o implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public o(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1 chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1) {
            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1 = (ChargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    for (Object obj3 : ((rl9) obj).a) {
                        if (jl40.l(((taa) obj3).a(), this.b.F)) {
                            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                            chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(obj3, chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    w511.i("Collection contains no element matching the predicate.");
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                return zy11.a;
            }
        }
        chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1 = new ChargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderPresenter$openSupport$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
