package com.ybsdk.feature.sbp.old.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.sbp.old.internal.network.SbpOldApi;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final SbpOldApi a;

    public a(SbpOldApi sbpOldApi) {
        this.a = sbpOldApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SbpOldRepository$getSbpSubscriptionConsent$1 sbpOldRepository$getSbpSubscriptionConsent$1;
        int i;
        if (continuationImpl instanceof SbpOldRepository$getSbpSubscriptionConsent$1) {
            sbpOldRepository$getSbpSubscriptionConsent$1 = (SbpOldRepository$getSbpSubscriptionConsent$1) continuationImpl;
            int i2 = sbpOldRepository$getSbpSubscriptionConsent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpOldRepository$getSbpSubscriptionConsent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpOldRepository$getSbpSubscriptionConsent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpOldRepository$getSbpSubscriptionConsent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                SbpOldRepository$getSbpSubscriptionConsent$2 sbpOldRepository$getSbpSubscriptionConsent$2 = new SbpOldRepository$getSbpSubscriptionConsent$2(this, null);
                sbpOldRepository$getSbpSubscriptionConsent$1.label = 1;
                Object c = c.c(sbpOldRepository$getSbpSubscriptionConsent$2, sbpOldRepository$getSbpSubscriptionConsent$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        sbpOldRepository$getSbpSubscriptionConsent$1 = new SbpOldRepository$getSbpSubscriptionConsent$1(this, continuationImpl);
        Object obj2 = sbpOldRepository$getSbpSubscriptionConsent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpOldRepository$getSbpSubscriptionConsent$1.label;
        if (i == 0) {
        }
    }
}
