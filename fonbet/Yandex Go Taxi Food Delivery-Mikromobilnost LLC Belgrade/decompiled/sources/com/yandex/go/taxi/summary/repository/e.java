package com.yandex.go.taxi.summary.repository;

import com.yandex.go.taxi.summary.api.repository.SummaryRouterType;
import defpackage.kov0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kov0 b;

    public e(vpr vprVar, kov0 kov0Var) {
        this.a = vprVar;
        this.b = kov0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1 summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1) {
            summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1 = (SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1) continuation;
            int i2 = summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    boolean booleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
                    this.b.a.getClass();
                    SummaryRouterType summaryRouterType = booleanValue ? SummaryRouterType.VERTICAL_SUMMARY : booleanValue2 ? SummaryRouterType.COMPOSE_SUMMARY : SummaryRouterType.VIEW_SUMMARY;
                    summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.L$0 = null;
                    summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.L$1 = null;
                    summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.L$2 = null;
                    summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.L$3 = null;
                    summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(summaryRouterType, summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1 = new SummaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryRouterTypeRepositoryImpl$summaryRouterTypeFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
