package com.yandex.go.pin.repository;

import defpackage.eco;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xa00;
import defpackage.ybo;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ xa00 b;

    public t(vpr vprVar, xa00 xa00Var) {
        this.a = vprVar;
        this.b = xa00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1 mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1) {
            mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1 = (MainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1) continuation;
            int i2 = mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    eco ecoVar = this.b.e;
                    int i3 = ((ybo) obj).a;
                    CharSequence a = ecoVar.a(i3 > 0 ? String.valueOf(i3) : "");
                    mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.L$0 = null;
                    mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.L$1 = null;
                    mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.L$2 = null;
                    mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.L$3 = null;
                    mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1 = new MainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenPinV1DataRepositoryImpl$pinTextFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
