package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.avj0;
import defpackage.bmj0;
import defpackage.bms;
import defpackage.d4h0;
import defpackage.dlj0;
import defpackage.elj0;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.gmi;
import defpackage.hkj0;
import defpackage.jdj0;
import defpackage.kkj0;
import defpackage.kyh0;
import defpackage.lkj0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qkj0;
import defpackage.ufx0;
import defpackage.uij0;
import defpackage.vfx0;
import defpackage.w511;
import defpackage.xtb1;
import defpackage.zli;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "isRedesignEnabled", "Lfnx0;", "tariffSelection", "Lzli;", "rentalModel", "Lf6v;", "Lufx0;", "", "Lamj0;", "<anonymous>", "(ZLfnx0;Lzli;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2", f = "DeliveryRentalRequirementUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2(n nVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = nVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2 deliveryRentalRequirementUiStateInteractor$uiStateFlow$2 = new DeliveryRentalRequirementUiStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj4);
        deliveryRentalRequirementUiStateInteractor$uiStateFlow$2.Z$0 = booleanValue;
        deliveryRentalRequirementUiStateInteractor$uiStateFlow$2.L$0 = (fnx0) obj2;
        deliveryRentalRequirementUiStateInteractor$uiStateFlow$2.L$1 = (zli) obj3;
        return deliveryRentalRequirementUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uij0 uij0Var;
        hkj0 hkj0Var;
        int i;
        qkj0 lkj0Var;
        boolean z = this.Z$0;
        fnx0 fnx0Var = (fnx0) this.L$0;
        zli zliVar = (zli) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vfx0 vfx0Var = this.this$0.b;
        mi31 mi31Var = fnx0Var.a;
        pex0 pex0Var = fnx0Var.c;
        vfx0Var.getClass();
        ufx0 a = vfx0.a(mi31Var);
        boolean a2 = this.this$0.a.a(pex0Var);
        String str = pex0Var.b;
        if (!a2) {
            return ru.yandex.taxi.requirements.utils.c.b(EmptyList.a, a);
        }
        gmi gmiVar = this.this$0.d;
        int i2 = zliVar.e;
        String str2 = zliVar.f;
        String str3 = zliVar.d;
        gmiVar.a(i2, str);
        com.yandex.go.summary.mapper.a aVar = this.this$0.c;
        aVar.getClass();
        if ((str3 == null || evu0.J(str3)) && !z) {
            uij0Var = null;
        } else {
            if (str3 == null) {
                str3 = "";
            }
            uij0Var = new uij0(mja1.a(str3, null, 6), Integer.valueOf(d4h0.ic_delivery_rental), null);
        }
        String str4 = zliVar.b;
        String str5 = zliVar.c;
        if (str5 == null) {
            str5 = "";
        }
        jdj0 jdj0Var = new jdj0(str4, str5);
        if (str2 != null) {
            String str6 = !evu0.J(str2) ? str2 : null;
            if (str6 != null) {
                hkj0Var = new hkj0(null, str6, "");
                i = bmj0.b[zliVar.i.ordinal()];
                if (i != 1) {
                    lkj0Var = new lkj0(xtb1.c(), new elj0(str, zliVar.e, HapticEffect.ClickMedium), ((avj0) aVar.a).h(kyh0.common_remove));
                } else {
                    if (i != 2) {
                        w511.b();
                        return null;
                    }
                    lkj0Var = kkj0.a;
                }
                return ru.yandex.taxi.requirements.utils.c.b(Collections.singletonList(new amj0("delivery_rental", "delivery_rental", true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, hkj0Var, lkj0Var, new dlj0(str, HapticEffect.ClickMedium), com.yandex.go.summary.mapper.a.b(aVar, str4, str5, str2, 8), RequirementTypeUiState.DEFAULT)), a);
            }
        }
        hkj0Var = null;
        i = bmj0.b[zliVar.i.ordinal()];
        if (i != 1) {
        }
        return ru.yandex.taxi.requirements.utils.c.b(Collections.singletonList(new amj0("delivery_rental", "delivery_rental", true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, hkj0Var, lkj0Var, new dlj0(str, HapticEffect.ClickMedium), com.yandex.go.summary.mapper.a.b(aVar, str4, str5, str2, 8), RequirementTypeUiState.DEFAULT)), a);
    }
}
