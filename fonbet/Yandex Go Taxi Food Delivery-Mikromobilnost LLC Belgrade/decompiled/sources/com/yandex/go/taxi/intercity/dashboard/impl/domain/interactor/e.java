package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ f b;

    public e(n0 n0Var, f fVar) {
        this.a = n0Var;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        IntercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1 intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof IntercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1) {
            intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1 = (IntercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1) continuation;
            int i2 = intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.L$0 = null;
                    intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.L$1 = null;
                    intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.L$2 = null;
                    intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1 = new IntercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardInteractor$getEarlyOptionChangedFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
