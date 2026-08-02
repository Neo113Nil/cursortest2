package androidx.window.java.core;

import defpackage.dl7;
import defpackage.e9e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.window.java.core.CallbackToFlowAdapter$connect$1$1", f = "CallbackToFlowAdapter.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class CallbackToFlowAdapter$connect$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9e $consumer;
    final /* synthetic */ tpr $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackToFlowAdapter$connect$1$1(tpr tprVar, e9e e9eVar, Continuation continuation) {
        super(2, continuation);
        this.$flow = tprVar;
        this.$consumer = e9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallbackToFlowAdapter$connect$1$1(this.$flow, this.$consumer, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackToFlowAdapter$connect$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tpr tprVar = this.$flow;
            dl7 dl7Var = new dl7(this.$consumer, 0);
            this.label = 1;
            if (tprVar.collect(dl7Var, this) == coroutineSingletons) {
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
