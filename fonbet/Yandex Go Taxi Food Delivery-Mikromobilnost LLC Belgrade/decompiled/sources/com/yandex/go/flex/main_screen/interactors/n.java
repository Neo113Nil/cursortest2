package com.yandex.go.flex.main_screen.interactors;

import defpackage.cf11;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class n implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ cf11 b;

    public n(jqr jqrVar, cf11 cf11Var) {
        this.a = jqrVar;
        this.b = cf11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1 mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1;
        int i;
        if (continuation instanceof MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1) {
            mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1 = (MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1) continuation;
            int i2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    m mVar = new m(vprVar, this.b);
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.L$0 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.L$1 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.L$2 = null;
                    mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.label = 1;
                    if (this.a.collect(mVar, mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1) == coroutineSingletons) {
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
        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1 = new MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1(this, continuation);
        Object obj2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
