package com.yandex.taxi.go_platform.delegates;

import defpackage.awt;
import defpackage.blv;
import defpackage.ny61;
import defpackage.y631;
import defpackage.z631;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b implements blv {
    public final y631 a;

    public b(y631 y631Var) {
        this.a = y631Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        InAppReviewDelegateImpl$handleInAppReview$1 inAppReviewDelegateImpl$handleInAppReview$1;
        int i;
        if (continuationImpl instanceof InAppReviewDelegateImpl$handleInAppReview$1) {
            inAppReviewDelegateImpl$handleInAppReview$1 = (InAppReviewDelegateImpl$handleInAppReview$1) continuationImpl;
            int i2 = inAppReviewDelegateImpl$handleInAppReview$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppReviewDelegateImpl$handleInAppReview$1.label = i2 - Integer.MIN_VALUE;
                Object obj = inAppReviewDelegateImpl$handleInAppReview$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppReviewDelegateImpl$handleInAppReview$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                z631 a = this.a.a();
                if (a != null) {
                    inAppReviewDelegateImpl$handleInAppReview$1.L$0 = null;
                    inAppReviewDelegateImpl$handleInAppReview$1.label = 1;
                    if (((awt) a).b(inAppReviewDelegateImpl$handleInAppReview$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }
        inAppReviewDelegateImpl$handleInAppReview$1 = new InAppReviewDelegateImpl$handleInAppReview$1(this, continuationImpl);
        Object obj2 = inAppReviewDelegateImpl$handleInAppReview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppReviewDelegateImpl$handleInAppReview$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
