package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltzz;", "<anonymous>", "(Ltse;)Ltzz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1", f = "ServiceSectionUiStateMapper.kt", l = {159}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto $it;
    final /* synthetic */ Map<String, String> $l10n;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1(TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto, a aVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = bubbleModalDto;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1(this.$it, this.this$0, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLuggageToggle$2$bubble$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto = this.$it;
        Map<String, String> map = this.$l10n;
        this.label = 1;
        aVar.getClass();
        Object n = bvf0.n(new ServiceSectionUiStateMapper$mapBubbleModal$2(bubbleModalDto, aVar, map, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
