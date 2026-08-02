package com.yandex.messaging.internal.authorized.chat;

import defpackage.j9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w4t;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.GetChatOrganizationsCountUseCase$run$2$1$1$1", f = "GetChatOrganizationsCountUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetChatOrganizationsCountUseCase$run$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ j9b $reader;
    int label;
    final /* synthetic */ w4t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatOrganizationsCountUseCase$run$2$1$1$1(w4t w4tVar, j9b j9bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w4tVar;
        this.$reader = j9bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetChatOrganizationsCountUseCase$run$2$1$1$1(this.this$0, this.$reader, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetChatOrganizationsCountUseCase$run$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        w4t w4tVar = this.this$0;
        return new Integer(w4tVar.c.o(this.$reader.h()).size());
    }
}
