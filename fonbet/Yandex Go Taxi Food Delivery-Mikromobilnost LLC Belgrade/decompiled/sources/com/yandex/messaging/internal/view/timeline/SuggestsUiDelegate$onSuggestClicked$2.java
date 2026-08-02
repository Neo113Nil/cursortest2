package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.BotRequestKt;
import com.yandex.messaging.internal.entities.Suggest;
import defpackage.acb;
import defpackage.lh00;
import defpackage.mvg;
import defpackage.ny61;
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
@mvg(c = "com.yandex.messaging.internal.view.timeline.SuggestsUiDelegate$onSuggestClicked$2", f = "SuggestsUiDelegate.kt", l = {306}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SuggestsUiDelegate$onSuggestClicked$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $arranged;
    final /* synthetic */ int $columnIndex;
    final /* synthetic */ acb $dependencies;
    final /* synthetic */ tu10 $messageMetaData;
    final /* synthetic */ List<Directive> $parsedDirectives;
    final /* synthetic */ Integer $rowIndex;
    final /* synthetic */ Suggest $suggest;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestsUiDelegate$onSuggestClicked$2(acb acbVar, List list, Suggest suggest, Integer num, int i, tu10 tu10Var, c0 c0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$dependencies = acbVar;
        this.$parsedDirectives = list;
        this.$suggest = suggest;
        this.$rowIndex = num;
        this.$columnIndex = i;
        this.$messageMetaData = tu10Var;
        this.this$0 = c0Var;
        this.$arranged = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestsUiDelegate$onSuggestClicked$2(this.$dependencies, this.$parsedDirectives, this.$suggest, this.$rowIndex, this.$columnIndex, this.$messageMetaData, this.this$0, this.$arranged, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestsUiDelegate$onSuggestClicked$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SuggestsUiDelegate$onSuggestClicked$2 suggestsUiDelegate$onSuggestClicked$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.view.chat.a aVar = this.$dependencies.r;
            List<Directive> list = this.$parsedDirectives;
            List<BotRequest.Error> errorsOnParsing = this.$suggest.getErrorsOnParsing();
            Integer num = this.$rowIndex;
            int i2 = this.$columnIndex;
            Suggest suggest = this.$suggest;
            String str = num != null ? num.intValue() + ":" + i2 + "_" + suggest.getText() : i2 + "_" + suggest.getText();
            tu10 tu10Var = this.$messageMetaData;
            lh00 lh00Var = this.this$0.m;
            this.label = 1;
            suggestsUiDelegate$onSuggestClicked$2 = this;
            obj = aVar.b(list, errorsOnParsing, str, tu10Var, lh00Var, suggestsUiDelegate$onSuggestClicked$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            suggestsUiDelegate$onSuggestClicked$2 = this;
        }
        c0 c0Var = suggestsUiDelegate$onSuggestClicked$2.this$0;
        Suggest suggest2 = suggestsUiDelegate$onSuggestClicked$2.$suggest;
        boolean z = suggestsUiDelegate$onSuggestClicked$2.$arranged;
        tu10 tu10Var2 = suggestsUiDelegate$onSuggestClicked$2.$messageMetaData;
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            Directive directive = (Directive) pair.getFirst();
            BotRequest.Error error = (BotRequest.Error) pair.getSecond();
            if (error != null) {
                c0Var.e.b("suggest_directive_execution_error", suggest2, z, tu10Var2, scc.g(new Pair("directive_name", directive.a), new Pair("directive_details", directive.a()), new Pair("error_message", BotRequestKt.a(error))));
                directive = null;
            }
            if (directive != null) {
                arrayList.add(directive);
            }
        }
        sm1 sm1Var = suggestsUiDelegate$onSuggestClicked$2.this$0.e;
        Suggest suggest3 = suggestsUiDelegate$onSuggestClicked$2.$suggest;
        sm1Var.b("suggest_handled", suggest3, suggestsUiDelegate$onSuggestClicked$2.$arranged, suggestsUiDelegate$onSuggestClicked$2.$messageMetaData, scc.g(new Pair("all_directives_count", Integer.valueOf(suggest3.getDirectives().size())), new Pair("parsed_directives_count", Integer.valueOf(((ArrayList) kotlin.collections.a.M(suggest3.getDirectives())).size())), new Pair("handled_directives_count", Integer.valueOf(arrayList.size()))));
        return zy11.a;
    }
}
