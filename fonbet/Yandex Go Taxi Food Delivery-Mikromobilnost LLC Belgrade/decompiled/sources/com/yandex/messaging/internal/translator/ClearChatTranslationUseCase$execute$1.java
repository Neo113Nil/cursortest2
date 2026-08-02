package com.yandex.messaging.internal.translator;

import com.yandex.messaging.ChatRequest;
import defpackage.icb;
import defpackage.jdb;
import defpackage.kcb;
import defpackage.l020;
import defpackage.lcb;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b0;
import defpackage.ph9;
import defpackage.s020;
import defpackage.tse;
import defpackage.w0c;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.translator.ClearChatTranslationUseCase$execute$1", f = "ClearChatTranslationUseCase.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ClearChatTranslationUseCase$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    int label;
    final /* synthetic */ w0c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearChatTranslationUseCase$execute$1(w0c w0cVar, ChatRequest chatRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = w0cVar;
        this.$chatRequest = chatRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClearChatTranslationUseCase$execute$1(this.this$0, this.$chatRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClearChatTranslationUseCase$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        o1b0 o1b0Var = ((m8g) ((s020) obj)).a;
        l020 C = this.this$0.b.C();
        try {
            jdb jdbVar = C.B;
            long j = o1b0Var.a;
            kcb z = jdbVar.b.z();
            z.getClass();
            androidx.room.util.a.b(z.a, false, true, new icb(z, new lcb(j, null), 0));
            ph9 ph9Var = C.z;
            ((HashMap) ph9Var.f.getValue()).put(Long.valueOf(j), null);
            C.s();
            C.close();
            return zy11.a;
        } finally {
        }
    }
}
