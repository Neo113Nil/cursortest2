package com.yandex.go.payments.summary.domain;

import com.yandex.go.yb.api.experiments.YbWalletEntryPointExperiment;
import defpackage.fvt;
import defpackage.ivt;
import defpackage.jbh;
import defpackage.nj0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.ogz0;
import defpackage.qw6;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.u0k;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final fvt a;
    public final qw6 b;
    public final t1b0 c;

    public a(qw6 qw6Var, rqo rqoVar, fvt fvtVar) {
        this.a = fvtVar;
        this.b = qw6Var;
        this.c = ((jbh) rqoVar).e(YbWalletEntryPointExperiment.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (((com.yandex.go.payments.googlepay.domain.e) r5.a).q == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        if (r5.b.a(((defpackage.nj0) r6).b) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u0k u0kVar, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        SummaryPaymentsListFilter$isSupported$1 summaryPaymentsListFilter$isSupported$1;
        int i;
        if (continuationImpl instanceof SummaryPaymentsListFilter$isSupported$1) {
            summaryPaymentsListFilter$isSupported$1 = (SummaryPaymentsListFilter$isSupported$1) continuationImpl;
            int i2 = summaryPaymentsListFilter$isSupported$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryPaymentsListFilter$isSupported$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryPaymentsListFilter$isSupported$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryPaymentsListFilter$isSupported$1.label;
                boolean z3 = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(u0kVar instanceof ogz0)) {
                        if (u0kVar instanceof ivt) {
                            if (!z2) {
                                if (!z) {
                                }
                            }
                        } else if (u0kVar instanceof nk0) {
                            t1b0 t1b0Var = this.c;
                            summaryPaymentsListFilter$isSupported$1.L$0 = null;
                            summaryPaymentsListFilter$isSupported$1.Z$0 = z;
                            summaryPaymentsListFilter$isSupported$1.Z$1 = z2;
                            summaryPaymentsListFilter$isSupported$1.label = 1;
                            obj = t1b0Var.b(summaryPaymentsListFilter$isSupported$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else if (u0kVar instanceof nj0) {
                        }
                        return Boolean.valueOf(z3);
                    }
                    z3 = false;
                    return Boolean.valueOf(z3);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                z3 = ((YbWalletEntryPointExperiment) obj).d.contains(YbWalletEntryPointExperiment.EntryPoint.SUMMARY);
                return Boolean.valueOf(z3);
            }
        }
        summaryPaymentsListFilter$isSupported$1 = new SummaryPaymentsListFilter$isSupported$1(this, continuationImpl);
        Object obj2 = summaryPaymentsListFilter$isSupported$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryPaymentsListFilter$isSupported$1.label;
        boolean z32 = true;
        if (i != 0) {
        }
        z32 = ((YbWalletEntryPointExperiment) obj2).d.contains(YbWalletEntryPointExperiment.EntryPoint.SUMMARY);
        return Boolean.valueOf(z32);
    }
}
