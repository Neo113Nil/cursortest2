package com.yandex.go.taxi.summary.rida_summary.header;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1 summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1) {
            summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1 = (SummaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((fnx0) obj).c.H0;
                    summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(list, summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1 = new SummaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryRidaHeaderStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
