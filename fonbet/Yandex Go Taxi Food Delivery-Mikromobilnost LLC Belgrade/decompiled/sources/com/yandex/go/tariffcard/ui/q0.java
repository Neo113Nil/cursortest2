package com.yandex.go.tariffcard.ui;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q0 implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ r0 b;

    public q0(mth mthVar, r0 r0Var) {
        this.a = mthVar;
        this.b = r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1 tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1) {
            tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1 = (TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p0 p0Var = new p0(vprVar, this.b);
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(p0Var, tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1 = new TariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffPagerDialogDelegate$attach$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
