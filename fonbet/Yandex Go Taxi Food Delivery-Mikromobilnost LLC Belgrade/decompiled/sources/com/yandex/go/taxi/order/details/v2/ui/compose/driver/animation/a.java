package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.qhk0;
import defpackage.vpr;
import defpackage.ygk0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ qhk0 b;

    public a(Ref$ObjectRef ref$ObjectRef, qhk0 qhk0Var) {
        this.a = ref$ObjectRef;
        this.b = qhk0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:23|24))(4:25|(2:27|(1:29))|15|16)|13|14|15|16))|34|6|7|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0032, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0030, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        defpackage.a3y0.d(r4.c, "Animation error", r8, null, 4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, ygk0] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ygk0 ygk0Var, Continuation continuation) {
        RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1 rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1;
        int i;
        if (continuation instanceof RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1) {
            rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1 = (RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1) continuation;
            int i2 = rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.label;
                qhk0 qhk0Var = this.b;
                Ref$ObjectRef ref$ObjectRef = this.a;
                if (i != 0) {
                    b.b(obj);
                    if (!jl40.l(ygk0Var, ref$ObjectRef.element)) {
                        zls zlsVar = qhk0Var.a;
                        Object obj2 = ref$ObjectRef.element;
                        rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.L$0 = ygk0Var;
                        rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.label = 1;
                        Object invoke = ((RideCardDriverSectionOrchestrator$animationQueue$1) zlsVar).invoke(obj2, ygk0Var, rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1);
                        ygk0Var = ygk0Var;
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ?? r7 = (ygk0) rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.L$0;
                try {
                    b.b(obj);
                    ygk0Var = r7;
                } catch (Throwable th) {
                    ref$ObjectRef.element = r7;
                    throw th;
                }
                ref$ObjectRef.element = ygk0Var;
                return zy11.a;
            }
        }
        rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1 = new RideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1(this, continuation);
        Object obj3 = rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDriverSectionOrchestrator$AnimationQueue$startAnimationSubscription$1$1$emit$1.label;
        qhk0 qhk0Var2 = this.b;
        Ref$ObjectRef ref$ObjectRef2 = this.a;
        if (i != 0) {
        }
        ref$ObjectRef2.element = ygk0Var;
        return zy11.a;
    }
}
