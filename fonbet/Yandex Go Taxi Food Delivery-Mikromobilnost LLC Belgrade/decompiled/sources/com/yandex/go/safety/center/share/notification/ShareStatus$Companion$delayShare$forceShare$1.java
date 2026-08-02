package com.yandex.go.safety.center.share.notification;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.u1a;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.share.notification.ShareStatus$Companion$delayShare$forceShare$1", f = "ShareStatus.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShareStatus$Companion$delayShare$forceShare$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $forceFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStatus$Companion$delayShare$forceShare$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$forceFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShareStatus$Companion$delayShare$forceShare$1 shareStatus$Companion$delayShare$forceShare$1 = new ShareStatus$Companion$delayShare$forceShare$1(this.$forceFlow, continuation);
        shareStatus$Companion$delayShare$forceShare$1.L$0 = obj;
        return shareStatus$Companion$delayShare$forceShare$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareStatus$Companion$delayShare$forceShare$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$forceFlow;
            u1a u1aVar = new u1a(y6f0Var, 1);
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(u1aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
