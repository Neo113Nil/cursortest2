package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.cs8;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r99;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ChangeChatTranslationUseCase$execute$1", f = "ChangeChatTranslationUseCase.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ChangeChatTranslationUseCase$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $language;
    int label;
    final /* synthetic */ r99 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeChatTranslationUseCase$execute$1(r99 r99Var, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r99Var;
        this.$chatRequest = chatRequest;
        this.$language = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeChatTranslationUseCase$execute$1(this.this$0, this.$chatRequest, this.$language, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeChatTranslationUseCase$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.authorized.chat.b bVar = this.this$0.a;
            ChatRequest chatRequest = this.$chatRequest;
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
        int i2 = 7;
        this.this$0.b.d(new cs8(i2, ((m8g) ((s020) obj)).a, this.$language));
        return zy11.a;
    }
}
