package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.OpenUriDirective;
import defpackage.b0x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x870;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$4", f = "AiBotDirectiveExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotDirectiveExecutor$execute$4 extends SuspendLambda implements wls {
    final /* synthetic */ Directive $directive;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDirectiveExecutor$execute$4(a aVar, Directive directive, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$directive = directive;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotDirectiveExecutor$execute$4(this.this$0, this.$directive, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiBotDirectiveExecutor$execute$4 aiBotDirectiveExecutor$execute$4 = (AiBotDirectiveExecutor$execute$4) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiBotDirectiveExecutor$execute$4.invokeSuspend(zy11Var);
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
        x870 x870Var = this.this$0.b;
        OpenUriDirective openUriDirective = (OpenUriDirective) this.$directive;
        ((b0x) x870Var.a).b(openUriDirective.uri);
        return zy11.a;
    }
}
