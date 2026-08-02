package com.yandex.go.pin.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class l implements tpr {
    public final /* synthetic */ com.yandex.go.navigation.screen.b a;

    public l(com.yandex.go.navigation.screen.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1 mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1) {
            mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1 = (MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1) continuation;
            int i2 = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar);
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.L$0 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.L$1 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.L$2 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(kVar, mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1 = new MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
