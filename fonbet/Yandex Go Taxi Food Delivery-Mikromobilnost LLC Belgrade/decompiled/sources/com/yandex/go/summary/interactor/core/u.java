package com.yandex.go.summary.interactor.core;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.g6u;
import defpackage.gdv0;
import defpackage.jl40;
import defpackage.nqv0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oiv0;
import defpackage.oqv0;
import defpackage.pqv0;
import defpackage.qqv0;
import defpackage.rqv0;
import defpackage.sjh;
import defpackage.sqv0;
import defpackage.tqv0;
import defpackage.upj0;
import defpackage.uqv0;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zjj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements vpr {
    public final /* synthetic */ v a;
    public final /* synthetic */ oiv0 b;

    public u(v vVar, oiv0 oiv0Var) {
        this.a = vVar;
        this.b = oiv0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fb, code lost:
    
        if (defpackage.tje.k0(r8, r9, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (defpackage.tje.k0(r7, r9, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r7.a.d(r2, r3, r7.b, true, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
    
        if (r7.a.d(r2, r3, r7.b, false, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        if (r2.x(r7, r8, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012d, code lost:
    
        if (r3.c(r2, r7, r6) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1;
        int i;
        uqv0 uqv0Var;
        Runnable runnable;
        if (continuation instanceof SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1) {
            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 = (SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1) continuation;
            int i2 = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12 = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1;
                Object obj2 = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label;
                oiv0 oiv0Var = this.b;
                v vVar = this.a;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        uqv0 uqv0Var2 = (uqv0) obj;
                        if (uqv0Var2 instanceof nqv0) {
                            vVar.b.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$1 summaryUiEventsInteractor$collectSummaryUiEvents$2$1$1 = new SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$1(oiv0Var, uqv0Var2, null);
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 1;
                            break;
                        } else if (uqv0Var2 instanceof oqv0) {
                            upj0 upj0Var = ((oqv0) uqv0Var2).a;
                            String str = upj0Var.a;
                            String str2 = upj0Var.b;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 2;
                            break;
                        } else {
                            if (!(uqv0Var2 instanceof pqv0)) {
                                if (uqv0Var2 instanceof rqv0) {
                                    SummaryExpandReason summaryExpandReason = ((rqv0) uqv0Var2).b;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = uqv0Var2;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 4;
                                    if (vVar.a.a(new gdv0(summaryExpandReason), summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12) != coroutineSingletons) {
                                        uqv0Var = uqv0Var2;
                                        runnable = ((rqv0) uqv0Var).c;
                                        if (runnable != null) {
                                            vVar.b.getClass();
                                            sjh sjhVar2 = uyj.a;
                                            g6u g6uVar2 = o400.a;
                                            SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1 summaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1 = new SummaryUiEventsInteractor$collectSummaryUiEvents$2$1$2$1(oiv0Var, runnable, null);
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$3 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 5;
                                            break;
                                        }
                                        return zy11.a;
                                    }
                                } else {
                                    if (!(uqv0Var2 instanceof sqv0)) {
                                        if (uqv0Var2 instanceof tqv0) {
                                            SummaryExpandReason summaryExpandReason2 = ((tqv0) uqv0Var2).a;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 7;
                                            break;
                                        } else if (!jl40.l(uqv0Var2, qqv0.a)) {
                                            w511.b();
                                            return null;
                                        }
                                        return zy11.a;
                                    }
                                    sqv0 sqv0Var = (sqv0) uqv0Var2;
                                    SummaryExpandReason summaryExpandReason3 = sqv0Var.a;
                                    zjj0 zjj0Var = sqv0Var.b;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                                    summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 6;
                                    break;
                                }
                                return coroutineSingletons;
                            }
                            pqv0 pqv0Var = (pqv0) uqv0Var2;
                            String str3 = pqv0Var.a;
                            String str4 = pqv0Var.b;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$0 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$1 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2 = null;
                            summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.label = 3;
                            break;
                        }
                    case 1:
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                        kotlin.b.b(obj2);
                        return zy11.a;
                    case 4:
                        uqv0Var = (uqv0) summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$12.L$2;
                        kotlin.b.b(obj2);
                        runnable = ((rqv0) uqv0Var).c;
                        if (runnable != null) {
                        }
                        return zy11.a;
                    case 5:
                        kotlin.b.b(obj2);
                        return zy11.a;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 = new SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1(this, continuation);
        SummaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1 summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$122 = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$1;
        Object obj22 = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryUiEventsInteractor$collectSummaryUiEvents$2$invokeSuspend$$inlined$safeCollect$2$122.label;
        oiv0 oiv0Var2 = this.b;
        v vVar2 = this.a;
        switch (i) {
        }
    }
}
