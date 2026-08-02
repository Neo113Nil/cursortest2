package com.yandex.go.taxi.summary.ui;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ mth a;

    public c(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1 summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1) {
            summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1 = (SummaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1 = new SummaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryHeaderHolder$attach$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
