package com.yandex.go.payments.addmethod.navigation;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1", f = "AddFastshiftAccountBaseRouter.kt", l = {184}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $bindAction;
    final /* synthetic */ tls $onError;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1(tls tlsVar, c cVar, tls tlsVar2, Continuation continuation) {
        super(2, continuation);
        this.$bindAction = tlsVar;
        this.this$0 = cVar;
        this.$onError = tlsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1(this.$bindAction, this.this$0, this.$onError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFastshiftAccountBaseRouter$startBindFastshiftAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        tls tlsVar;
        String T;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar2 = this.$bindAction;
                c cVar2 = this.this$0;
                tls tlsVar3 = this.$onError;
                try {
                    this.L$0 = cVar2;
                    this.L$1 = tlsVar3;
                    this.label = 1;
                    if (tlsVar2.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th) {
                    th = th;
                    cVar = cVar2;
                    tlsVar = tlsVar3;
                    T = cVar.T(th);
                    if (T == null) {
                        T = ((avj0) cVar.G).h(kyh0.add_payment_method_preparing_failed_text);
                    }
                    if (tlsVar == null) {
                        tlsVar.invoke(T);
                    } else {
                        cVar.r(new qu(9));
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlsVar = (tls) this.L$1;
                cVar = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    T = cVar.T(th);
                    if (T == null) {
                    }
                    if (tlsVar == null) {
                    }
                    return zy11.a;
                }
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
