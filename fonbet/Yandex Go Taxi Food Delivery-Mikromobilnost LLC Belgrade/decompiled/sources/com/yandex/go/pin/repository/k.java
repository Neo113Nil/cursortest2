package com.yandex.go.pin.repository;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1 mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1) {
            mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1 = (MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1) continuation;
            int i2 = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Screen screen = (Screen) obj;
                    Boolean valueOf = Boolean.valueOf(screen == Screen.MAIN || screen == Screen.TAXI_MAIN);
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.L$0 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.L$1 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.L$2 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.L$3 = null;
                    mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1 = new MainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPinStyleRepositoryImpl$tariffSelectionFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
