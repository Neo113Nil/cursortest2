package com.yandex.go.taxi.order.superapp.orders;

import defpackage.ag5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.CoroutinesCompatKt$simpleCallbackApiToFlow$1", f = "CoroutinesCompat.kt", l = {181}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $registerCallback;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.taxi.order.superapp.orders.TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((Runnable) this.receiver).run();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1(tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$registerCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1 taxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1 = new TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1(this.$registerCallback, continuation);
        taxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1.L$0 = obj;
        return taxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderFlowTrackingSourceRepository$ModelSource$orderTitlesFlow$$inlined$simpleCallbackApiToFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(0, (Runnable) this.$registerCallback.invoke(new ag5(y6f0Var, 14)), Runnable.class, "run", "run()V", 0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
