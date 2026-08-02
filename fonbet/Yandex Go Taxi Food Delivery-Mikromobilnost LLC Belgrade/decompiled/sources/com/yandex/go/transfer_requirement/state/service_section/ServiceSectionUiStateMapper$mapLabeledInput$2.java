package com.yandex.go.transfer_requirement.state.service_section;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.rnr;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wo01;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lrnr;", "<anonymous>", "(Ltse;)Lrnr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.service_section.ServiceSectionUiStateMapper$mapLabeledInput$2", f = "ServiceSectionUiStateMapper.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ServiceSectionUiStateMapper$mapLabeledInput$2 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto $dto;
    final /* synthetic */ Map<String, String> $l10n;
    final /* synthetic */ wo01 $state;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceSectionUiStateMapper$mapLabeledInput$2(Map map, TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto labeledIconInfoDto, wo01 wo01Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$l10n = map;
        this.$dto = labeledIconInfoDto;
        this.$state = wo01Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceSectionUiStateMapper$mapLabeledInput$2 serviceSectionUiStateMapper$mapLabeledInput$2 = new ServiceSectionUiStateMapper$mapLabeledInput$2(this.$l10n, this.$dto, this.$state, this.this$0, continuation);
        serviceSectionUiStateMapper$mapLabeledInput$2.L$0 = obj;
        return serviceSectionUiStateMapper$mapLabeledInput$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceSectionUiStateMapper$mapLabeledInput$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            str = this.$l10n.get(this.$dto.a);
            qoh h = tje.h(tseVar, null, null, new ServiceSectionUiStateMapper$mapLabeledInput$2$leadIcon$1(this.$dto, this.this$0, null), 3);
            String str3 = this.$state.c;
            int i3 = (str3 == null || str3.length() == 0) ? 1 : 0;
            int i4 = i3 ^ 1;
            wo01 wo01Var = this.$state;
            String str4 = i3 == 0 ? wo01Var.c : wo01Var.b;
            this.L$0 = null;
            this.L$1 = str;
            this.L$2 = null;
            this.L$3 = str4;
            this.I$0 = i4;
            this.label = 1;
            obj = h.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str4;
            i = i4;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            String str5 = (String) this.L$3;
            str = (String) this.L$1;
            b.b(obj);
            str2 = str5;
        }
        return new rnr(str, (UiStateDrawableWrapper) obj, str2, this.$state.a, i != 0);
    }
}
