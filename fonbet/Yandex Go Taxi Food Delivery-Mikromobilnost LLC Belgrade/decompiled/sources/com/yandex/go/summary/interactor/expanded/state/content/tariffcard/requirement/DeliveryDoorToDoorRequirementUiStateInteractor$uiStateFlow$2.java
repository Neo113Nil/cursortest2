package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.ati;
import defpackage.bms;
import defpackage.d4h0;
import defpackage.e6i;
import defpackage.fnx0;
import defpackage.jdj0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pkj0;
import defpackage.ufx0;
import defpackage.uij0;
import defpackage.vfx0;
import defpackage.zkj0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "isRedesignedEnabled", "Lfnx0;", "tariffSelection", "isChecked", "Lf6v;", "Lufx0;", "", "Lamj0;", "<anonymous>", "(ZLfnx0;Z)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2", f = "DeliveryDoorToDoorRequirementUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2(m mVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = mVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2 deliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2 = new DeliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj4);
        deliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        deliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2.L$0 = (fnx0) obj2;
        deliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2.L$1 = (Boolean) obj3;
        return deliveryDoorToDoorRequirementUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e6i e6iVar;
        String str;
        String str2;
        boolean z = this.Z$0;
        fnx0 fnx0Var = (fnx0) this.L$0;
        Boolean bool = (Boolean) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vfx0 vfx0Var = this.this$0.a;
        mi31 mi31Var = fnx0Var.a;
        pex0 pex0Var = fnx0Var.c;
        vfx0Var.getClass();
        ufx0 a = vfx0.a(mi31Var);
        ati atiVar = pex0Var.Z;
        if (atiVar == null || (e6iVar = atiVar.j) == null) {
            return ru.yandex.taxi.requirements.utils.c.b(EmptyList.a, a);
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : e6iVar.a;
        com.yandex.go.summary.mapper.a aVar = this.this$0.b;
        String str3 = pex0Var.b;
        aVar.getClass();
        n7v n7vVar = e6iVar.b;
        if (n7vVar == null || (str = n7vVar.b) == null) {
            str = n7vVar != null ? n7vVar.c : null;
        }
        if (str == null) {
            str = "";
        }
        uij0 uij0Var = (str.length() <= 0 && !z) ? null : new uij0(mja1.a(str, null, 6), Integer.valueOf(d4h0.ic_delivery_door_to_door), null);
        String str4 = e6iVar.c;
        if (!booleanValue ? (str2 = e6iVar.e) == null : (str2 = e6iVar.d) == null) {
            str2 = "";
        }
        return ru.yandex.taxi.requirements.utils.c.b(Collections.singletonList(new amj0("delivery_door_to_door_details", "delivery_door_to_door_details", true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, new jdj0(str4, str2), null, new pkj0(booleanValue, null, ""), new zkj0(HapticEffect.ClickMedium, str3, booleanValue), com.yandex.go.summary.mapper.a.b(aVar, str4, str2, null, 12), RequirementTypeUiState.DEFAULT)), a);
    }
}
