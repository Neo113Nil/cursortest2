package com.yandex.go.flex.main_screen.routers;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements tpr {
    public final /* synthetic */ gci0 a;

    public b(gci0 gci0Var) {
        this.a = gci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1 mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1) {
            mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1 = (MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.a.collect(aVar, mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1 = new MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
