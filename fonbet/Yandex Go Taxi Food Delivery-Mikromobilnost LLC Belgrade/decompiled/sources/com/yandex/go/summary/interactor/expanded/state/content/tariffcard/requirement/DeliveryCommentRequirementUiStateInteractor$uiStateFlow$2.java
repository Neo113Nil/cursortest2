package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.bmj0;
import defpackage.bms;
import defpackage.d4h0;
import defpackage.fnx0;
import defpackage.g8e;
import defpackage.jdj0;
import defpackage.kkj0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pzh;
import defpackage.qzh;
import defpackage.scc;
import defpackage.uij0;
import defpackage.vfx0;
import defpackage.w511;
import defpackage.ykj0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryCommentRequirementType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "isRedesignEnabled", "Lfnx0;", "tariffSelection", "Lpzh;", "courierInfo", "Lf6v;", "Lufx0;", "", "Lamj0;", "<anonymous>", "(ZLfnx0;Lpzh;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2", f = "DeliveryCommentRequirementUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2(l lVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = lVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2 deliveryCommentRequirementUiStateInteractor$uiStateFlow$2 = new DeliveryCommentRequirementUiStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj4);
        deliveryCommentRequirementUiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        deliveryCommentRequirementUiStateInteractor$uiStateFlow$2.L$0 = (fnx0) obj2;
        deliveryCommentRequirementUiStateInteractor$uiStateFlow$2.L$1 = (pzh) obj3;
        return deliveryCommentRequirementUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uij0 uij0Var;
        boolean z = this.Z$0;
        fnx0 fnx0Var = (fnx0) this.L$0;
        pzh pzhVar = (pzh) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        amj0 amj0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        pex0 pex0Var = fnx0Var.c;
        String str = pex0Var.b;
        qzh a = this.this$0.b.a(pzhVar, str, pex0Var.u0 == TariffOrderFlow.DELIVERY_FLOW, false);
        String str2 = a.c;
        String str3 = a.b;
        com.yandex.go.summary.mapper.a aVar = this.this$0.c;
        DeliveryCommentRequirementType deliveryCommentRequirementType = DeliveryCommentRequirementType.COURIER;
        aVar.getClass();
        if (a.a) {
            if (!z) {
                uij0Var = null;
            } else {
                if (bmj0.a[deliveryCommentRequirementType.ordinal()] != 1) {
                    w511.b();
                    return null;
                }
                uij0Var = new uij0(mja1.b("", null, 6), Integer.valueOf(d4h0.ic_delivery_comment_courier), null);
            }
            jdj0 jdj0Var = new jdj0(str3, str2 != null ? str2 : "");
            if (bmj0.a[deliveryCommentRequirementType.ordinal()] != 1) {
                w511.b();
                return null;
            }
            ykj0 ykj0Var = new ykj0(str, HapticEffect.ClickMedium);
            String b = com.yandex.go.summary.mapper.a.b(aVar, str3, str2, null, 12);
            String o = g8e.o("delivery_comment_", deliveryCommentRequirementType.name());
            amj0Var = new amj0(o, o, true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, null, kkj0.a, ykj0Var, b, RequirementTypeUiState.DEFAULT);
        }
        List h = scc.h(amj0Var);
        vfx0 vfx0Var = this.this$0.a;
        mi31 mi31Var = fnx0Var.a;
        vfx0Var.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(h, vfx0.a(mi31Var));
    }
}
