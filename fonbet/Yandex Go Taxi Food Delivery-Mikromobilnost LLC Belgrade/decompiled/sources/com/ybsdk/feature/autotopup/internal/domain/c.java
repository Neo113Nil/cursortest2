package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.feature.autotopup.api.domain.model.AutoTopupRequestStatusPollingOption;
import defpackage.ezd0;
import defpackage.fzd0;
import defpackage.gzd0;
import defpackage.hzd0;
import defpackage.ny61;
import defpackage.q1e0;
import defpackage.uy3;
import defpackage.w511;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final com.ybsdk.utils.poller.b a;
    public final com.ybsdk.feature.autotopup.internal.data.b b;

    public c(com.ybsdk.utils.poller.b bVar, com.ybsdk.feature.autotopup.internal.data.b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, AutoTopupRequestStatusPollingOption autoTopupRequestStatusPollingOption, ContinuationImpl continuationImpl) {
        AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1 autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1;
        int i;
        q1e0 q1e0Var;
        if (continuationImpl instanceof AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1) {
            autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1 = (AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1) continuationImpl;
            int i2 = autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                int i3 = uy3.a[autoTopupRequestStatusPollingOption.ordinal()];
                if (i3 == 1) {
                    q1e0Var = z ? fzd0.b : ezd0.b;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    q1e0Var = z ? hzd0.b : gzd0.b;
                }
                com.ybsdk.utils.poller.c c = this.a.c(q1e0Var, new AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$2(2, null), new AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$3(this, str, z, null));
                autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.label = 1;
                Object e = c.e(autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1 = new AutoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1(this, continuationImpl);
        Object obj2 = autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupRequestStatusPollingInteractorImpl$getAutoTopupRequestStatus$1.label;
        if (i == 0) {
        }
    }
}
