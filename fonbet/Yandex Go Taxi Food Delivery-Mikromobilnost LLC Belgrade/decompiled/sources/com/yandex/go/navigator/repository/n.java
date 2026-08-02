package com.yandex.go.navigator.repository;

import defpackage.lf50;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ lf50 b;

    public n(kotlinx.coroutines.flow.n nVar, lf50 lf50Var) {
        this.a = nVar;
        this.b = lf50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1 navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1) {
            navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1 = (NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1) continuation;
            int i2 = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.L$0 = null;
                    navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.L$1 = null;
                    navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.L$2 = null;
                    navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(mVar, navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1 = new NavigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorStateRepositoryImpl$special$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
