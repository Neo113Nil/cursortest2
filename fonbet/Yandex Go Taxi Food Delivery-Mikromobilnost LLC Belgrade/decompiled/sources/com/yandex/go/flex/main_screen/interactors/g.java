package com.yandex.go.flex.main_screen.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1 mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1;
        int i;
        if (continuation instanceof MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1) {
            mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1 = (MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1) continuation;
            int i2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!((Collection) obj).isEmpty()) {
                        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.L$0 = null;
                        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.L$1 = null;
                        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.L$2 = null;
                        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.L$3 = null;
                        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.label = 1;
                        if (this.a.emit(obj, mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1 = new MainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1(this, continuation);
        Object obj22 = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenFlexLoadInteractor$listenUpdateLabels$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
