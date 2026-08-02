package androidx.compose.foundation.pager;

import defpackage.iip0;
import defpackage.ny61;
import defpackage.s890;
import defpackage.snr;
import defpackage.tje;
import defpackage.u290;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class e implements snr {
    public final androidx.compose.foundation.gestures.snapping.a a;
    public final d b;

    public e(androidx.compose.foundation.gestures.snapping.a aVar, d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.snr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iip0 iip0Var, float f, Continuation continuation) {
        PagerWrapperFlingBehavior$performFling$1 pagerWrapperFlingBehavior$performFling$1;
        int i;
        d dVar;
        if (continuation instanceof PagerWrapperFlingBehavior$performFling$1) {
            pagerWrapperFlingBehavior$performFling$1 = (PagerWrapperFlingBehavior$performFling$1) continuation;
            int i2 = pagerWrapperFlingBehavior$performFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerWrapperFlingBehavior$performFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pagerWrapperFlingBehavior$performFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pagerWrapperFlingBehavior$performFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u290 u290Var = new u290(this, iip0Var);
                    pagerWrapperFlingBehavior$performFling$1.label = 1;
                    obj = this.a.d(iip0Var, f, u290Var, pagerWrapperFlingBehavior$performFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                float floatValue = ((Number) obj).floatValue();
                dVar = this.b;
                if (dVar.l() != 0.0f && Math.abs(dVar.l()) < 0.001d) {
                    int k = dVar.k();
                    if (dVar.k.a()) {
                        tje.N(((s890) dVar.m.getValue()).s, null, null, new PagerState$requestScrollToPage$1(dVar, null), 3);
                    }
                    dVar.v(k, 0.0f, false);
                } else {
                    new Float(dVar.l());
                }
                return new Float(floatValue);
            }
        }
        pagerWrapperFlingBehavior$performFling$1 = new PagerWrapperFlingBehavior$performFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = pagerWrapperFlingBehavior$performFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pagerWrapperFlingBehavior$performFling$1.label;
        if (i != 0) {
        }
        float floatValue2 = ((Number) obj2).floatValue();
        dVar = this.b;
        if (dVar.l() != 0.0f) {
            int k2 = dVar.k();
            if (dVar.k.a()) {
            }
            dVar.v(k2, 0.0f, false);
            return new Float(floatValue2);
        }
        new Float(dVar.l());
        return new Float(floatValue2);
    }
}
