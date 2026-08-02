package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/mapkit/transport/masstransit/Route;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.WalkingRouteUriResolver$resolveUri$2", f = "WalkingRouteUriResolver.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkingRouteUriResolver$resolveUri$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $routeUri;
    int label;
    final /* synthetic */ j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingRouteUriResolver$resolveUri$2(j0 j0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j0Var;
        this.$routeUri = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkingRouteUriResolver$resolveUri$2(this.this$0, this.$routeUri, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkingRouteUriResolver$resolveUri$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                j0 j0Var = this.this$0;
                String str = this.$routeUri;
                this.label = 1;
                obj = j0.a(j0Var, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return new Result(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result(new Result.Failure(th));
        }
    }
}
