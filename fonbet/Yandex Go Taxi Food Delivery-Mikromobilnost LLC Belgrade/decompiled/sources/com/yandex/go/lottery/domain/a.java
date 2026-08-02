package com.yandex.go.lottery.domain;

import com.yandex.go.lottery.experiment.LotteryMenuItemExperiment;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xrz;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1 lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof LotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1) {
            lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1 = (LotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LotteryMenuItemExperiment lotteryMenuItemExperiment = (LotteryMenuItemExperiment) obj;
                    boolean z = lotteryMenuItemExperiment.c;
                    String Y = d6z.Y(lotteryMenuItemExperiment, lotteryMenuItemExperiment.f);
                    String Y2 = d6z.Y(lotteryMenuItemExperiment, lotteryMenuItemExperiment.g);
                    String str = lotteryMenuItemExperiment.e;
                    String str2 = lotteryMenuItemExperiment.d;
                    xrz xrzVar = new xrz(Y, Y2, str2, str, (!z || evu0.J(Y) || evu0.J(Y2) || evu0.J(str) || evu0.J(str2)) ? false : true);
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                    lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.label = 1;
                    if (this.a.emit(xrzVar, lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1 = new LotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lotteryMenuItemUiStateInteractorImpl$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
