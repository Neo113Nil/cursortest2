package com.yandex.messaging.internal.view.chat;

import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.directives.SetElementsStateDirective;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uqn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Loyj0;", "Lzy11;", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "<anonymous>", "(Ltse;)Loyj0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.chat.AiBotDirectiveExecutor$execute$6", f = "AiBotDirectiveExecutor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotDirectiveExecutor$execute$6 extends SuspendLambda implements wls {
    final /* synthetic */ Directive $directive;
    final /* synthetic */ uqn $stateMediator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotDirectiveExecutor$execute$6(Directive directive, uqn uqnVar, Continuation continuation) {
        super(2, continuation);
        this.$directive = directive;
        this.$stateMediator = uqnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotDirectiveExecutor$execute$6(this.$directive, this.$stateMediator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiBotDirectiveExecutor$execute$6) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SetElementsStateDirective setElementsStateDirective = (SetElementsStateDirective) this.$directive;
        uqn uqnVar = this.$stateMediator;
        this.label = 1;
        Object n = bvf0.n(new SetElementsStateDirectiveHandler$handle$2(setElementsStateDirective, uqnVar, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
