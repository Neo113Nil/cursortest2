package com.yandex.messaging.internal;

import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lr3z;", "<anonymous>", "(Ltse;)Lr3z;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetLastMessageUseCase$lastMessageFlow$1$1$message$1", f = "GetLastMessageUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetLastMessageUseCase$lastMessageFlow$1$1$message$1 extends SuspendLambda implements wls {
    final /* synthetic */ j9b $reader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastMessageUseCase$lastMessageFlow$1$1$message$1(j9b j9bVar, Continuation continuation) {
        super(2, continuation);
        this.$reader = j9bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetLastMessageUseCase$lastMessageFlow$1$1$message$1(this.$reader, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetLastMessageUseCase$lastMessageFlow$1$1$message$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.$reader.b().a();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
