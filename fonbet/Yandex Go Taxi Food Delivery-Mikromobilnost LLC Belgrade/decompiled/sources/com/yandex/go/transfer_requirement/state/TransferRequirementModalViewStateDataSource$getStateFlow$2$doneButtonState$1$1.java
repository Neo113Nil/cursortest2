package com.yandex.go.transfer_requirement.state;

import com.yandex.go.transfer_requirement.card_state.DoneButtonAction;
import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.e4m;
import defpackage.f4m;
import defpackage.g4m;
import defpackage.i4m;
import defpackage.j4m;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4m;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.yo01;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lo4m;", "<anonymous>", "(Ltse;)Lo4m;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.state.TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1", f = "TransferRequirementModalViewStateDataSource.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ TransferRequirementExperiment.Card $cardDto;
    final /* synthetic */ yo01 $cardState;
    final /* synthetic */ TransferRequirementExperiment.Card.ActionButtonDto $it;
    final /* synthetic */ Map<String, String> $l10n;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1(a aVar, TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto, yo01 yo01Var, TransferRequirementExperiment.Card card, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = actionButtonDto;
        this.$cardState = yo01Var;
        this.$cardDto = card;
        this.$l10n = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1(this.this$0, this.$it, this.$cardState, this.$cardDto, this.$l10n, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewStateDataSource$getStateFlow$2$doneButtonState$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object o4mVar;
        String str2;
        String str3;
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
        com.yandex.go.transfer_requirement.state.done_button.a aVar = this.this$0.a;
        TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto = this.$it;
        yo01 yo01Var = this.$cardState;
        j4m j4mVar = yo01Var.h;
        TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto = this.$cardDto.c;
        boolean z = (serviceSectionDto != null ? serviceSectionDto.b : null) != null;
        boolean z2 = (serviceSectionDto != null ? serviceSectionDto.c : null) != null;
        Map<String, String> map = this.$l10n;
        this.label = 1;
        aVar.getClass();
        if (j4mVar instanceof e4m) {
            e4m e4mVar = (e4m) j4mVar;
            String str4 = yo01Var.c.a;
            if (str4 == null || str4.length() == 0) {
                str2 = actionButtonDto.b;
            } else if (z && yo01Var.b == null) {
                str2 = actionButtonDto.c;
                if (str2 == null) {
                    str2 = actionButtonDto.b;
                }
            } else if (z2 && ((str3 = yo01Var.d.a) == null || str3.length() == 0)) {
                str2 = actionButtonDto.d;
                if (str2 == null) {
                    str2 = actionButtonDto.b;
                }
            } else {
                str2 = actionButtonDto.b;
            }
            str = str2 != null ? map.get(str2) : null;
            o4mVar = new o4m(str == null ? "" : str, e4mVar.a, null, null, DoneButtonAction.REQUEST);
        } else if (j4mVar instanceof f4m) {
            o4mVar = aVar.a(actionButtonDto, (f4m) j4mVar, map, this);
        } else if (j4mVar instanceof i4m) {
            o4mVar = aVar.b(actionButtonDto, (i4m) j4mVar, map, this);
        } else {
            if (!(j4mVar instanceof g4m)) {
                w511.b();
                return null;
            }
            g4m g4mVar = (g4m) j4mVar;
            String str5 = actionButtonDto.f;
            str = str5 != null ? map.get(str5) : null;
            o4mVar = new o4m(str == null ? "" : str, g4mVar.a, null, null, DoneButtonAction.REQUEST);
        }
        return o4mVar == coroutineSingletons ? coroutineSingletons : o4mVar;
    }
}
