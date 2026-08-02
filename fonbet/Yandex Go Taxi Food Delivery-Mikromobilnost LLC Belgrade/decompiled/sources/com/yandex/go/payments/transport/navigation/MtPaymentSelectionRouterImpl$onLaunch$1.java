package com.yandex.go.payments.transport.navigation;

import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ur30;
import defpackage.vr30;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.transport.navigation.MtPaymentSelectionRouterImpl$onLaunch$1", f = "MtPaymentSelectionRouterImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MtPaymentSelectionRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ ur30 $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtPaymentSelectionRouterImpl$onLaunch$1(ur30 ur30Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = ur30Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtPaymentSelectionRouterImpl$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtPaymentSelectionRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aVar = this.this$0;
            m950 m950Var2 = (m950) aVar.D.get();
            a aVar2 = this.this$0;
            ur30 ur30Var = this.$payload;
            this.L$0 = aVar;
            this.L$1 = m950Var2;
            this.label = 1;
            Object P = a.P(aVar2, ur30Var, this);
            if (P == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = m950Var2;
            obj = P;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$1;
            aVar = (a) this.L$0;
            kotlin.b.b(obj);
        }
        a aVar3 = this.this$0;
        aVar3.getClass();
        aVar.A(m950Var, obj, new vr30(aVar3));
        return zy11.a;
    }
}
