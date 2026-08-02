package com.yandex.messaging.internal.textsuggest;

import com.yandex.messaging.ChatRequest;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tse;
import defpackage.tz10;
import defpackage.upq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.textsuggest.SendTextSuggestUseCase$execute$2", f = "SendTextSuggestUseCase.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SendTextSuggestUseCase$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ upq0 $sendData;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendTextSuggestUseCase$execute$2(d dVar, upq0 upq0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$sendData = upq0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendTextSuggestUseCase$execute$2(this.this$0, this.$sendData, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendTextSuggestUseCase$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            com.yandex.messaging.internal.authorized.chat.b bVar = dVar.b;
            ChatRequest chatRequest = dVar.a;
            this.label = 1;
            obj = bVar.a(chatRequest, this);
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
        com.yandex.messaging.internal.authorized.textsuggest.b bVar2 = (com.yandex.messaging.internal.authorized.textsuggest.b) ((m8g) ((s020) obj)).B0.get();
        upq0 upq0Var = this.$sendData;
        if (bVar2.b.a(tz10.I)) {
            bVar2.j.g(upq0Var);
        }
        return zy11.a;
    }
}
