package com.yandex.go.taxi.summary.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.u8u;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ u8u c;

    public f(tpr tprVar, g gVar, u8u u8uVar) {
        this.a = tprVar;
        this.b = gVar;
        this.c = u8uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1 summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1) {
            summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1 = (SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1) continuation;
            int i2 = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c);
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.L$0 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.L$1 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.L$2 = null;
                    summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1 = new SummaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryHeaderUIStateInteractor$verticalHeader$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
