package com.yandex.messaging.domain.chat;

import com.yandex.messaging.ChatRequest;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o721;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;", "<anonymous>", "(Ltse;)Lcom/yandex/messaging/core/net/entities/UpdateOrganizationResult;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.chat.UpdateOrganizationUseCase$execute$2", f = "UpdateOrganizationUseCase.kt", l = {22, 24}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class UpdateOrganizationUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ o721 $params;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateOrganizationUseCase$execute$2(h hVar, o721 o721Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$params = o721Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateOrganizationUseCase$execute$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateOrganizationUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.authorized.chat.b bVar = this.this$0.a;
            ChatRequest chatRequest = this.$params.a;
            this.label = 1;
            obj = bVar.a(chatRequest, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar2 = (b) ((m8g) ((s020) obj)).E0.get();
        long j = this.$params.b;
        this.label = 2;
        Object a = bVar2.a(j, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
