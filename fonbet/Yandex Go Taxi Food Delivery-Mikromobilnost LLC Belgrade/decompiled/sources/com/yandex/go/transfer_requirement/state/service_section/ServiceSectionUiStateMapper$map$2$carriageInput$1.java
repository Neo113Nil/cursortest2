package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rnr;
import defpackage.tse;
import defpackage.wls;
import defpackage.wo01;
import defpackage.yo01;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrnr;", "<anonymous>", "(Ltse;)Lrnr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$map$2$carriageInput$1", f = "ServiceSectionUiStateMapper.kt", l = {54}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$map$2$carriageInput$1 extends SuspendLambda implements wls {
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto $serviceSection;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$map$2$carriageInput$1(TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto, a aVar, yo01 yo01Var, Map map, Continuation continuation) {
        super(2, continuation);
        this.$serviceSection = serviceSectionDto;
        this.this$0 = aVar;
        this.$cardState = yo01Var;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceSectionUiStateMapper$map$2$carriageInput$1(this.$serviceSection, this.this$0, this.$cardState, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$map$2$carriageInput$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            b.b(obj);
            TransferRequirementExperiment.Card.ServiceSectionDto.CarriageNumberInfoDto carriageNumberInfoDto = this.$serviceSection.c;
            if (carriageNumberInfoDto == null) {
                return null;
            }
            a aVar = this.this$0;
            yo01 yo01Var = this.$cardState;
            Map<String, String> map = this.$l10n;
            wo01 wo01Var = yo01Var.d;
            this.L$0 = null;
            this.label = 1;
            aVar.getClass();
            String str = map.get(carriageNumberInfoDto.a);
            String str2 = wo01Var.c;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            rnr rnrVar = new rnr(str, null, !z ? wo01Var.c : wo01Var.b, wo01Var.a, !z);
            if (rnrVar == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = rnrVar;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return (rnr) obj;
    }
}
