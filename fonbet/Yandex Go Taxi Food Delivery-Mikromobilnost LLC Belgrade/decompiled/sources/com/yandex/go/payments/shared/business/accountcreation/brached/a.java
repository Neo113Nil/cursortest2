package com.yandex.go.payments.shared.business.accountcreation.brached;

import android.net.Uri;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import defpackage.aue;
import defpackage.bue;
import defpackage.cve;
import defpackage.due;
import defpackage.ny61;
import defpackage.tmr0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes13.dex */
public final class a {
    public final cve a;
    public final bue b;
    public final due c;

    public a(cve cveVar, bue bueVar, due dueVar) {
        this.a = cveVar;
        this.b = bueVar;
        this.c = dueVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(SharedPaymentsOpenReason sharedPaymentsOpenReason, tmr0 tmr0Var, Runnable runnable, Uri uri, ContinuationImpl continuationImpl) {
        CorpAccountRouter$tryShowCorpScreen$1 corpAccountRouter$tryShowCorpScreen$1;
        int i;
        CorpAccountFlowExperiment corpAccountFlowExperiment;
        if (continuationImpl instanceof CorpAccountRouter$tryShowCorpScreen$1) {
            corpAccountRouter$tryShowCorpScreen$1 = (CorpAccountRouter$tryShowCorpScreen$1) continuationImpl;
            int i2 = corpAccountRouter$tryShowCorpScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                corpAccountRouter$tryShowCorpScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = corpAccountRouter$tryShowCorpScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = corpAccountRouter$tryShowCorpScreen$1.label;
                if (i != 0) {
                    b.b(obj);
                    CorpAccountRouter$tryShowCorpScreen$corpAccountFlowExperiment$1 corpAccountRouter$tryShowCorpScreen$corpAccountFlowExperiment$1 = new CorpAccountRouter$tryShowCorpScreen$corpAccountFlowExperiment$1(this, null);
                    corpAccountRouter$tryShowCorpScreen$1.L$0 = sharedPaymentsOpenReason;
                    corpAccountRouter$tryShowCorpScreen$1.L$1 = tmr0Var;
                    corpAccountRouter$tryShowCorpScreen$1.L$2 = runnable;
                    corpAccountRouter$tryShowCorpScreen$1.L$3 = uri;
                    corpAccountRouter$tryShowCorpScreen$1.label = 1;
                    obj = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, corpAccountRouter$tryShowCorpScreen$corpAccountFlowExperiment$1, corpAccountRouter$tryShowCorpScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uri = (Uri) corpAccountRouter$tryShowCorpScreen$1.L$3;
                    runnable = (Runnable) corpAccountRouter$tryShowCorpScreen$1.L$2;
                    tmr0Var = (tmr0) corpAccountRouter$tryShowCorpScreen$1.L$1;
                    sharedPaymentsOpenReason = (SharedPaymentsOpenReason) corpAccountRouter$tryShowCorpScreen$1.L$0;
                    b.b(obj);
                }
                SharedPaymentsOpenReason sharedPaymentsOpenReason2 = sharedPaymentsOpenReason;
                tmr0 tmr0Var2 = tmr0Var;
                Runnable runnable2 = runnable;
                Uri uri2 = uri;
                corpAccountFlowExperiment = (CorpAccountFlowExperiment) obj;
                if (corpAccountFlowExperiment != null) {
                    return Boolean.FALSE;
                }
                bue bueVar = this.b;
                aue aueVar = new aue(corpAccountFlowExperiment, bueVar.b, bueVar.c, bueVar.d);
                if (aueVar.c() && tmr0Var2.a() == SharedAccountType.BUSINESS) {
                    this.a.b(sharedPaymentsOpenReason2, runnable2, aueVar, tmr0Var2, uri2);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
        }
        corpAccountRouter$tryShowCorpScreen$1 = new CorpAccountRouter$tryShowCorpScreen$1(this, continuationImpl);
        Object obj2 = corpAccountRouter$tryShowCorpScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpAccountRouter$tryShowCorpScreen$1.label;
        if (i != 0) {
        }
        SharedPaymentsOpenReason sharedPaymentsOpenReason22 = sharedPaymentsOpenReason;
        tmr0 tmr0Var22 = tmr0Var;
        Runnable runnable22 = runnable;
        Uri uri22 = uri;
        corpAccountFlowExperiment = (CorpAccountFlowExperiment) obj2;
        if (corpAccountFlowExperiment != null) {
        }
    }
}
