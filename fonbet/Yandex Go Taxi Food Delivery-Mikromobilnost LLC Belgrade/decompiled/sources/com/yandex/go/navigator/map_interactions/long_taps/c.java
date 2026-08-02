package com.yandex.go.navigator.map_interactions.long_taps;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.ynz;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ zzs b;
    public final /* synthetic */ ynz c;

    public c(tpr tprVar, zzs zzsVar, ynz ynzVar) {
        this.a = tprVar;
        this.b = zzsVar;
        this.c = ynzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1 longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1) {
            longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1 = (LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1) continuation;
            int i2 = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$0 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$1 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$2 = null;
                    longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1 = new LongTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longTapPresenter$getPointAddress$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
