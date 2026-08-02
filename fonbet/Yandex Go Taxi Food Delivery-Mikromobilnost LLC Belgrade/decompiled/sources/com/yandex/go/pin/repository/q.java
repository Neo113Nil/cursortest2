package com.yandex.go.pin.repository;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class q implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ boolean b;

    public q(r0 r0Var, boolean z) {
        this.a = r0Var;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1 mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1) {
            mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1 = (MainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1) continuation;
            int i2 = mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b);
                    mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.L$0 = null;
                    mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.L$1 = null;
                    mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.L$2 = null;
                    mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1 = new MainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenPinV1DataRepositoryImpl$anchorFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
