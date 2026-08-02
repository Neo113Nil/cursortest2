package com.yandex.go.superapp.discovery.map.impl.ui.search;

import defpackage.hnr0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;

    public c(hnr0 hnr0Var) {
        this.a = hnr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) {
            superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 = (SuperAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) continuation;
            int i2 = superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$0 = null;
                    superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$1 = null;
                    superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.L$2 = null;
                    superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1 = new SuperAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapSearchModalView$InnerMvpView$searchFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
