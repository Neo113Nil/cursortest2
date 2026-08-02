package com.yandex.go.payments.shared;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.omr0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedAccountProgressInteractor$runWithSpinner$task$1", f = "SharedAccountProgressInteractor.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedAccountProgressInteractor$runWithSpinner$task$1 extends SuspendLambda implements wls {
    final /* synthetic */ omr0 $host;
    final /* synthetic */ tls $work;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedAccountProgressInteractor$runWithSpinner$task$1(tls tlsVar, g gVar, omr0 omr0Var, Continuation continuation) {
        super(2, continuation);
        this.$work = tlsVar;
        this.this$0 = gVar;
        this.$host = omr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedAccountProgressInteractor$runWithSpinner$task$1(this.$work, this.this$0, this.$host, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedAccountProgressInteractor$runWithSpinner$task$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [h55, omr0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g gVar;
        omr0 omr0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar = this.$work;
                this.label = 1;
                if (tlsVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            if (gVar.d == omr0Var) {
                gVar.d = null;
            }
            omr0Var.i();
            return zy11.a;
        } finally {
            gVar = this.this$0;
            omr0 omr0Var2 = gVar.d;
            omr0Var = this.$host;
            if (omr0Var2 == omr0Var) {
                gVar.d = null;
            }
            omr0Var.i();
        }
    }
}
