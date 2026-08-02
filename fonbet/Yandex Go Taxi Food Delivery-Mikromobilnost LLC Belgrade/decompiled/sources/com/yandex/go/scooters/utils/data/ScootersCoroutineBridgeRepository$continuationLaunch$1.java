package com.yandex.go.scooters.utils.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.utils.data.ScootersCoroutineBridgeRepository$continuationLaunch$1", f = "ScootersCoroutineBridgeRepository.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCoroutineBridgeRepository$continuationLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ Continuation<zy11> $continuation;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCoroutineBridgeRepository$continuationLaunch$1(tls tlsVar, Continuation continuation, Continuation continuation2) {
        super(2, continuation2);
        this.$action = tlsVar;
        this.$continuation = continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCoroutineBridgeRepository$continuationLaunch$1(this.$action, this.$continuation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCoroutineBridgeRepository$continuationLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Continuation<zy11> continuation;
        Continuation<zy11> continuation2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                b.b(obj);
                tls tlsVar = this.$action;
                Continuation<zy11> continuation3 = this.$continuation;
                try {
                    this.L$0 = continuation3;
                    this.L$1 = continuation3;
                    this.label = 1;
                    if (tlsVar.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    continuation2 = continuation3;
                    continuation = continuation2;
                } catch (Throwable th) {
                    th = th;
                    continuation = continuation3;
                    continuation.resumeWith(new Result.Failure(th));
                    return zy11Var;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                continuation = (Continuation) this.L$1;
                continuation2 = (Continuation) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    continuation.resumeWith(new Result.Failure(th));
                    return zy11Var;
                }
            }
            continuation2.resumeWith(zy11Var);
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
