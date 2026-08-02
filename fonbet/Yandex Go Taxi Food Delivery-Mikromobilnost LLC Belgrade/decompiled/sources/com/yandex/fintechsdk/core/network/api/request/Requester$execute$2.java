package com.yandex.fintechsdk.core.network.api.request;

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

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"TResult", "Ltse;", "Lkotlin/Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.network.api.request.Requester$execute$2", f = "Requester.kt", l = {15}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class Requester$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $params;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Requester$execute$2(a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Requester$execute$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Requester$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                a aVar2 = this.this$0;
                Object a = aVar2.a(this.$params);
                this.L$0 = aVar2;
                this.label = 1;
                Object c = aVar2.c(a, this);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj2 = c;
                aVar = aVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                kotlin.b.b(obj);
                obj2 = ((Result) obj).getValue();
            }
            if (!(obj2 instanceof Result.Failure)) {
                obj2 = aVar.d(obj2);
            }
            return new Result(obj2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new Result(new Result.Failure(th));
        }
    }
}
