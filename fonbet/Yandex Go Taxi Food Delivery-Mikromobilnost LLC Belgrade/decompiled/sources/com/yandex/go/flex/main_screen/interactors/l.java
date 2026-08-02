package com.yandex.go.flex.main_screen.interactors;

import defpackage.ga00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class l implements tpr {
    public final /* synthetic */ j a;
    public final /* synthetic */ ga00 b;

    public l(j jVar, ga00 ga00Var) {
        this.a = jVar;
        this.b = ga00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1 mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1;
        int i;
        if (continuation instanceof MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1) {
            mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1 = (MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1) continuation;
            int i2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k kVar = new k(vprVar, this.b);
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.L$0 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.L$1 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.L$2 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.label = 1;
                    if (this.a.collect(kVar, mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1) == coroutineSingletons) {
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
        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1 = new MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1(this, continuation);
        Object obj2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
