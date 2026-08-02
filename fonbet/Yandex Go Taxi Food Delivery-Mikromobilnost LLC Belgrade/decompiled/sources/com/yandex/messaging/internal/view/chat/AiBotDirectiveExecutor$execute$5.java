package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.SendMessageDirective;
import com.yandex.messaging.internal.entities.TextMessageData;
import defpackage.ax80;
import defpackage.b00;
import defpackage.l520;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xoq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$5", f = "AiBotDirectiveExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotDirectiveExecutor$execute$5 extends SuspendLambda implements wls {
    final /* synthetic */ Directive $directive;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDirectiveExecutor$execute$5(a aVar, Directive directive, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$directive = directive;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotDirectiveExecutor$execute$5(this.this$0, this.$directive, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiBotDirectiveExecutor$execute$5 aiBotDirectiveExecutor$execute$5 = (AiBotDirectiveExecutor$execute$5) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiBotDirectiveExecutor$execute$5.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        xoq0 xoq0Var = aVar.a;
        ChatRequest chatRequest = aVar.d;
        SendMessageDirective sendMessageDirective = (SendMessageDirective) this.$directive;
        b00 b00Var = xoq0Var.a;
        ax80 ax80Var = xoq0Var.b;
        TextMessageData textMessageData = new TextMessageData(0, sendMessageDirective.text);
        l520 l520Var = l520.d;
        Object obj2 = sendMessageDirective.callbackData;
        ax80Var.getClass();
        b00Var.c(chatRequest, ax80.f(textMessageData, l520Var, obj2));
        return zy11.a;
    }
}
