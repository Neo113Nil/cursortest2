package com.yandex.go.navigator.map_interactions.long_taps;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ com.yandex.go.navigator.incidents.experiment.c a;
    public final /* synthetic */ ynz b;

    public e(com.yandex.go.navigator.incidents.experiment.c cVar, ynz ynzVar) {
        this.a = cVar;
        this.b = ynzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LongTapPresenter$renderContent$$inlined$map$1$1 longTapPresenter$renderContent$$inlined$map$1$1;
        int i;
        if (continuation instanceof LongTapPresenter$renderContent$$inlined$map$1$1) {
            longTapPresenter$renderContent$$inlined$map$1$1 = (LongTapPresenter$renderContent$$inlined$map$1$1) continuation;
            int i2 = longTapPresenter$renderContent$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                longTapPresenter$renderContent$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = longTapPresenter$renderContent$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = longTapPresenter$renderContent$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    longTapPresenter$renderContent$$inlined$map$1$1.L$0 = null;
                    longTapPresenter$renderContent$$inlined$map$1$1.L$1 = null;
                    longTapPresenter$renderContent$$inlined$map$1$1.L$2 = null;
                    longTapPresenter$renderContent$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, longTapPresenter$renderContent$$inlined$map$1$1) == coroutineSingletons) {
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
        longTapPresenter$renderContent$$inlined$map$1$1 = new LongTapPresenter$renderContent$$inlined$map$1$1(this, continuation);
        Object obj2 = longTapPresenter$renderContent$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = longTapPresenter$renderContent$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
