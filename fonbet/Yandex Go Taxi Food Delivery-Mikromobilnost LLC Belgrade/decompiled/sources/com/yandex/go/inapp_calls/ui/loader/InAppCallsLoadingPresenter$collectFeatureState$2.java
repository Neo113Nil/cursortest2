package com.yandex.go.inapp_calls.ui.loader;

import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.ui.loader.InAppCallsLoadingPresenter$collectFeatureState$2", f = "InAppCallsLoadingPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsLoadingPresenter$collectFeatureState$2 extends SuspendLambda implements wls {
    final /* synthetic */ InAppCallsFeatureWrapper$State $initialState;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsLoadingPresenter$collectFeatureState$2(InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$initialState = inAppCallsFeatureWrapper$State;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InAppCallsLoadingPresenter$collectFeatureState$2 inAppCallsLoadingPresenter$collectFeatureState$2 = new InAppCallsLoadingPresenter$collectFeatureState$2(this.$initialState, this.this$0, continuation);
        inAppCallsLoadingPresenter$collectFeatureState$2.L$0 = obj;
        return inAppCallsLoadingPresenter$collectFeatureState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppCallsLoadingPresenter$collectFeatureState$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (com.yandex.go.inapp_calls.ui.loader.a.Kg(r7, r6) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r0.emit(r7, r6) == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = InAppCallsFeatureWrapper$State.LOADING;
            this.L$0 = null;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State2 = this.$initialState;
        if (inAppCallsFeatureWrapper$State2 == InAppCallsFeatureWrapper$State.ERROR || inAppCallsFeatureWrapper$State2 == InAppCallsFeatureWrapper$State.NOT_LOADED) {
            a aVar = this.this$0;
            this.L$0 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
