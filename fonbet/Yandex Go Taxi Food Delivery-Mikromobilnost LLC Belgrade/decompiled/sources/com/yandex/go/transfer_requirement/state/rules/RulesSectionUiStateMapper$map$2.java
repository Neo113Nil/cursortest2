package com.yandex.go.transfer_requirement.state.rules;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.ikl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Likl0;", "<anonymous>", "(Ltse;)Likl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.rules.RulesSectionUiStateMapper$map$2", f = "RulesSectionUiStateMapper.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RulesSectionUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.RulesSectionDto $rulesSection;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RulesSectionUiStateMapper$map$2(TransferRequirementExperiment.Card.RulesSectionDto rulesSectionDto, Map map, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$rulesSection = rulesSectionDto;
        this.$l10n = map;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RulesSectionUiStateMapper$map$2 rulesSectionUiStateMapper$map$2 = new RulesSectionUiStateMapper$map$2(this.$rulesSection, this.$l10n, this.this$0, continuation);
        rulesSectionUiStateMapper$map$2.L$0 = obj;
        return rulesSectionUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RulesSectionUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransferRequirementExperiment.Card.RulesSectionDto rulesSectionDto = this.$rulesSection;
            if (rulesSectionDto == null) {
                return null;
            }
            String str = rulesSectionDto.a;
            String str2 = str != null ? this.$l10n.get(str) : null;
            List list = this.$rulesSection.b;
            a aVar = this.this$0;
            Map<String, String> map = this.$l10n;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new RulesSectionUiStateMapper$map$2$rules$1$1(aVar, (TransferRequirementExperiment.Card.RulesSectionDto.RulesItem) it.next(), map, null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = str2;
            this.label = 1;
            Object b = kotlinx.coroutines.a.b(arrayList, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            charSequence = str2;
            obj = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            charSequence = (CharSequence) this.L$3;
            b.b(obj);
        }
        return new ikl0(charSequence, (List) obj);
    }
}
