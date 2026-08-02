package com.yandex.go.taxi.order.details.v2.domain.a11y;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.q8k0;
import defpackage.t8k0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c {
    public final q8k0 a;
    public final t8k0 b;
    public final AccessibilityManager c;

    public c(Context context, q8k0 q8k0Var, t8k0 t8k0Var) {
        this.a = q8k0Var;
        this.b = t8k0Var;
        this.c = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardPresentationType rideCardPresentationType, ContinuationImpl continuationImpl) {
        RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1 rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1;
        int i;
        if (continuationImpl instanceof RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1) {
            rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1 = (RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1) continuationImpl;
            int i2 = rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n4u0 n4u0Var = (n4u0) this.a.a.get(rideCardPresentationType);
                    if (n4u0Var == null) {
                        return zy11.a;
                    }
                    RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2 = new RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2(this, rideCardPresentationType, null);
                    rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.L$0 = null;
                    rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.L$1 = null;
                    rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.L$2 = null;
                    rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.label = 1;
                    if (kotlinx.coroutines.flow.e.k(n4u0Var, rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$2, rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ny61.r("SharedFlow never completes, this call should never return.");
                return null;
            }
        }
        rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1 = new RideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1(this, continuationImpl);
        Object obj2 = rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAccessibilityPronunciationInteractor$startPronunciationByPresentation$1.label;
        if (i != 0) {
        }
        ny61.r("SharedFlow never completes, this call should never return.");
        return null;
    }
}
