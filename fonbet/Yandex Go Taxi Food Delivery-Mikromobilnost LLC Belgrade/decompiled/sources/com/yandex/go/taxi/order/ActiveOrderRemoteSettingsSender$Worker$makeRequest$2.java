package com.yandex.go.taxi.order;

import defpackage.b20;
import defpackage.du;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ActiveOrderRemoteSettingsSender$Worker$makeRequest$2", f = "ActiveOrderRemoteSettingsSender.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActiveOrderRemoteSettingsSender$Worker$makeRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onComplete;
    final /* synthetic */ Object $value;
    int label;
    final /* synthetic */ b20 this$0;
    final /* synthetic */ a this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrderRemoteSettingsSender$Worker$makeRequest$2(b20 b20Var, a aVar, Object obj, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = b20Var;
        this.this$1 = aVar;
        this.$value = obj;
        this.$onComplete = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActiveOrderRemoteSettingsSender$Worker$makeRequest$2(this.this$0, this.this$1, this.$value, this.$onComplete, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActiveOrderRemoteSettingsSender$Worker$makeRequest$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b20 b20Var = this.this$0;
                a aVar = this.this$1;
                Object obj2 = this.$value;
                b20Var.a.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1 activeOrderRemoteSettingsSender$Worker$makeRequest$2$1$1 = new ActiveOrderRemoteSettingsSender$Worker$makeRequest$2$1$1(aVar, obj2, null);
                this.label = 1;
                if (tje.k0(mdhVar, activeOrderRemoteSettingsSender$Worker$makeRequest$2$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            failure = zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        a aVar2 = this.this$1;
        Object obj3 = this.$value;
        Runnable runnable = this.$onComplete;
        if (!(failure instanceof Result.Failure)) {
            aVar2.b.c(obj3);
            runnable.run();
        }
        a aVar3 = this.this$1;
        Object obj4 = this.$value;
        Runnable runnable2 = this.$onComplete;
        Throwable a = Result.a(failure);
        if (a != null) {
            aVar3.b.b(obj4, a);
            aVar3.e.b.b("onError", a, new du(29));
            runnable2.run();
        }
        return zy11Var;
    }
}
