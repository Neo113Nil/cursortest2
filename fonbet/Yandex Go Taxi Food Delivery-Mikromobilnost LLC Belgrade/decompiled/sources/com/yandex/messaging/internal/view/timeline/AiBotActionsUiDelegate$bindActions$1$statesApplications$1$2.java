package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.BotRequestKt;
import com.yandex.messaging.internal.entities.AiBotAction;
import defpackage.acb;
import defpackage.lh00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rm1;
import defpackage.scc;
import defpackage.sm1;
import defpackage.tse;
import defpackage.tu10;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2", f = "AiBotActionsUiDelegate.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ AiBotAction $action;
    final /* synthetic */ acb $dependencies;
    final /* synthetic */ tu10 $messageMetaData;
    final /* synthetic */ List<Directive> $parsedDirectives;
    int label;
    final /* synthetic */ rm1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2(acb acbVar, List list, AiBotAction aiBotAction, tu10 tu10Var, rm1 rm1Var, Continuation continuation) {
        super(2, continuation);
        this.$dependencies = acbVar;
        this.$parsedDirectives = list;
        this.$action = aiBotAction;
        this.$messageMetaData = tu10Var;
        this.this$0 = rm1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2(this.$dependencies, this.$parsedDirectives, this.$action, this.$messageMetaData, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2 aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.view.chat.a aVar = this.$dependencies.r;
            List<Directive> list = this.$parsedDirectives;
            List<BotRequest.Error> errorsOnParsing = this.$action.getErrorsOnParsing();
            String buttonId = this.$action.getButtonId();
            tu10 tu10Var = this.$messageMetaData;
            lh00 lh00Var = this.this$0.h;
            this.label = 1;
            aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2 = this;
            obj = aVar.b(list, errorsOnParsing, buttonId, tu10Var, lh00Var, aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2 = this;
        }
        rm1 rm1Var = aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.this$0;
        AiBotAction aiBotAction = aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.$action;
        tu10 tu10Var2 = aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.$messageMetaData;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            Directive directive = (Directive) pair.getFirst();
            BotRequest.Error error = (BotRequest.Error) pair.getSecond();
            if (error != null) {
                rm1Var.b.a("ai_bot_action_directive_execution_error", aiBotAction, tu10Var2, scc.g(new Pair("directive_name", directive.a), new Pair("directive_details", directive.a()), new Pair("error_message", BotRequestKt.a(error))));
                directive = null;
            }
            if (directive != null) {
                arrayList.add(directive);
            }
        }
        sm1 sm1Var = aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.this$0.b;
        AiBotAction aiBotAction2 = aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.$action;
        sm1Var.a("ai_bot_action_handled", aiBotAction2, aiBotActionsUiDelegate$bindActions$1$statesApplications$1$2.$messageMetaData, scc.g(new Pair("all_directives_count", Integer.valueOf(aiBotAction2.getDirectives().size())), new Pair("parsed_directives_count", Integer.valueOf(((ArrayList) kotlin.collections.a.M(aiBotAction2.getDirectives())).size())), new Pair("handled_directives_count", Integer.valueOf(arrayList.size()))));
        return zy11.a;
    }
}
