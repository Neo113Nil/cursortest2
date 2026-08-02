package com.ybsdk.utils.poller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"BLOCK", "CALL", "Lpz40;", "Ls2e0;", "flow", "Lkotlin/Result;", "callResult", "Lzy11;", "<anonymous>", "(Lpz40;Lkotlin/Result;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.poller.PollerFactoryImpl$createPollerWithMapping$1", f = "PollerFactoryImpl.kt", l = {40, 43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollerFactoryImpl$createPollerWithMapping$1 extends SuspendLambda implements zls {
    final /* synthetic */ wls $mapError;
    final /* synthetic */ wls $mapSuccess;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollerFactoryImpl$createPollerWithMapping$1(wls wlsVar, wls wlsVar2, Continuation continuation) {
        super(3, continuation);
        this.$mapSuccess = wlsVar;
        this.$mapError = wlsVar2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object value = ((Result) obj2).getValue();
        PollerFactoryImpl$createPollerWithMapping$1 pollerFactoryImpl$createPollerWithMapping$1 = new PollerFactoryImpl$createPollerWithMapping$1(this.$mapSuccess, this.$mapError, (Continuation) obj3);
        pollerFactoryImpl$createPollerWithMapping$1.L$0 = (pz40) obj;
        pollerFactoryImpl$createPollerWithMapping$1.L$1 = new Result(value);
        return pollerFactoryImpl$createPollerWithMapping$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        pz40 pz40Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pz40 pz40Var3 = (pz40) this.L$0;
            Object value = ((Result) this.L$1).getValue();
            wls wlsVar = this.$mapSuccess;
            wls wlsVar2 = this.$mapError;
            Throwable a = Result.a(value);
            if (a == null) {
                this.L$0 = pz40Var3;
                this.label = 1;
                Object invoke = wlsVar.invoke(value, this);
                if (invoke != coroutineSingletons) {
                    obj = invoke;
                    pz40Var2 = pz40Var3;
                    ((r0) pz40Var2).l(obj);
                }
            } else {
                this.L$0 = pz40Var3;
                this.label = 2;
                Object invoke2 = wlsVar2.invoke(a, this);
                if (invoke2 != coroutineSingletons) {
                    obj = invoke2;
                    pz40Var = pz40Var3;
                    ((r0) pz40Var).l(obj);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            pz40Var2 = (pz40) this.L$0;
            kotlin.b.b(obj);
            ((r0) pz40Var2).l(obj);
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz40Var = (pz40) this.L$0;
            kotlin.b.b(obj);
            ((r0) pz40Var).l(obj);
        }
        return zy11.a;
    }
}
