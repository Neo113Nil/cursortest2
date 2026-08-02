package com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity;

import defpackage.aii;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intercity.flex.dashboard.router.payment.method.intercity.IntercitySelectPaymentMethodRouterImpl$onLaunch$1", f = "IntercitySelectPaymentMethodRouterImpl.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class IntercitySelectPaymentMethodRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $tariffClass;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercitySelectPaymentMethodRouterImpl$onLaunch$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariffClass = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercitySelectPaymentMethodRouterImpl$onLaunch$1(this.this$0, this.$tariffClass, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercitySelectPaymentMethodRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            m950 m950Var2 = (m950) aVar.J.get();
            a aVar2 = this.this$0;
            String str = this.$tariffClass;
            this.L$0 = aVar;
            this.L$1 = m950Var2;
            this.label = 1;
            Object P = a.P(aVar2, str, this);
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
            b.b(obj);
        }
        aVar.A(m950Var, obj, new aii(this.this$0, i2));
        return zy11.a;
    }
}
