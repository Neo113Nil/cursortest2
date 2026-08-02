package com.yandex.go.taxi.order.details.v2.state.elements.companion.animation;

import defpackage.evu0;
import defpackage.lek0;
import defpackage.mek0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xuc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lmek0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.animation.RideCardCompanionAnimationDataSource$collectAnimationState$1", f = "RideCardCompanionAnimationDataSource.kt", l = {18, 22, 23}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionAnimationDataSource$collectAnimationState$1 extends SuspendLambda implements wls {
    final /* synthetic */ xuc $animation;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionAnimationDataSource$collectAnimationState$1(xuc xucVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$animation = xucVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardCompanionAnimationDataSource$collectAnimationState$1 rideCardCompanionAnimationDataSource$collectAnimationState$1 = new RideCardCompanionAnimationDataSource$collectAnimationState$1(this.$animation, this.this$0, continuation);
        rideCardCompanionAnimationDataSource$collectAnimationState$1.L$0 = obj;
        return rideCardCompanionAnimationDataSource$collectAnimationState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardCompanionAnimationDataSource$collectAnimationState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        xuc xucVar = this.$animation;
        String str = xucVar != null ? xucVar.a : null;
        String str2 = xucVar != null ? xucVar.b : null;
        if (str == null || evu0.J(str) || str2 == null || evu0.J(str2)) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (vprVar.emit(lek0.a, this) != coroutineSingletons) {
                return zy11Var;
            }
        } else {
            a aVar = this.this$0;
            this.L$0 = vprVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            obj = a.a(aVar, str2, str, this);
        }
        return coroutineSingletons;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 3;
        if (vprVar.emit((mek0) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
    }
}
