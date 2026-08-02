package com.yandex.go.transfer_requirement.state;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yo01;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Laxq0;", "<anonymous>", "(Ltse;)Laxq0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1", f = "TransferRequirementModalViewStateDataSource.kt", l = {41}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card $cardDto;
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ TransferRequirementExperiment $experiment;
    final /* synthetic */ Map<String, String> $l10n;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1(a aVar, TransferRequirementExperiment.Card card, yo01 yo01Var, TransferRequirementExperiment transferRequirementExperiment, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$cardDto = card;
        this.$cardState = yo01Var;
        this.$experiment = transferRequirementExperiment;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1(this.this$0, this.$cardDto, this.$cardState, this.$experiment, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewStateDataSource$getStateFlow$2$serviceSection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        com.yandex.go.transfer_requirement.state.service_section.a aVar = this.this$0.c;
        TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto = this.$cardDto.c;
        yo01 yo01Var = this.$cardState;
        boolean z = this.$experiment.f == TransferRequirementExperiment.TransferKind.AVIA;
        Map<String, String> map = this.$l10n;
        this.label = 1;
        Object b = aVar.b(serviceSectionDto, yo01Var, z, map, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
