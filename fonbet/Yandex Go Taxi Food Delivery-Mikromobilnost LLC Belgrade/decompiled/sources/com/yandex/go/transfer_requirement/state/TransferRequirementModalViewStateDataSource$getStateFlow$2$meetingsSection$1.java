package com.yandex.go.transfer_requirement.state;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.fh10;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfh10;", "<anonymous>", "(Ltse;)Lfh10;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1", f = "TransferRequirementModalViewStateDataSource.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card $cardDto;
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ Map<String, String> $l10n;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1(TransferRequirementExperiment.Card card, a aVar, yo01 yo01Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.$cardDto = card;
        this.this$0 = aVar;
        this.$cardState = yo01Var;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1(this.$cardDto, this.this$0, this.$cardState, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewStateDataSource$getStateFlow$2$meetingsSection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            TransferRequirementExperiment.Card.MeetingSectionDto meetingSectionDto = this.$cardDto.d;
            if (meetingSectionDto == null) {
                return null;
            }
            a aVar = this.this$0;
            yo01 yo01Var = this.$cardState;
            Map<String, String> map = this.$l10n;
            com.yandex.go.transfer_requirement.state.meeting.a aVar2 = aVar.d;
            String str = yo01Var.g;
            String str2 = yo01Var.f;
            this.L$0 = null;
            this.label = 1;
            obj = aVar2.b(meetingSectionDto, str2, str, map, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (fh10) obj;
    }
}
