package com.yandex.go.walking.navigation.impl.order;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.j;

/* loaded from: classes14.dex */
public final class a implements tpr {
    public final /* synthetic */ tpr[] a;

    public a(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1 walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1) {
            walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1 = (WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1) continuation;
            int i2 = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 20);
                    WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3 walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3 = new WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3(3, null);
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.L$0 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.L$1 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.L$2 = null;
                    walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.label = 1;
                    if (j.a(vprVar, akt0Var, walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$3, walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1 = new WalkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavLocalOrderTrackingInteractor$orderFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
