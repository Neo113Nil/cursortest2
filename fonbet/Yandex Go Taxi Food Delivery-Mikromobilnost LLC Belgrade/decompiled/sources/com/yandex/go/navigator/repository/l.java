package com.yandex.go.navigator.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class l implements tpr {
    public final /* synthetic */ tpr a;

    public l(r0 r0Var) {
        this.a = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1 navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1;
        int i;
        if (continuation instanceof NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1) {
            navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1 = (NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1) continuation;
            int i2 = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar);
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.L$0 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.L$1 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.L$2 = null;
                    navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.label = 1;
                    if (this.a.collect(kVar, navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1) == coroutineSingletons) {
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
        navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1 = new NavigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1(this, continuation);
        Object obj2 = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigatorStateRepositoryImpl$navigatorState$lambda$0$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
