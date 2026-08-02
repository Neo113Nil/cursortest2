package com.yandex.plus.home.feature.webviews.internalapi.bridge;

import defpackage.gov;
import defpackage.mvg;
import defpackage.ny61;
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
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internalapi.bridge.PlusWebMessagesAdapter$toJsonString$2", f = "PlusWebMessagesAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusWebMessagesAdapter$toJsonString$2 extends SuspendLambda implements wls {
    final /* synthetic */ gov $inMessage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebMessagesAdapter$toJsonString$2(a aVar, gov govVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$inMessage = govVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusWebMessagesAdapter$toJsonString$2 plusWebMessagesAdapter$toJsonString$2 = new PlusWebMessagesAdapter$toJsonString$2(this.this$0, this.$inMessage, continuation);
        plusWebMessagesAdapter$toJsonString$2.L$0 = obj;
        return plusWebMessagesAdapter$toJsonString$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusWebMessagesAdapter$toJsonString$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        try {
            obj2 = aVar.b.c(this.$inMessage, aVar.d);
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
