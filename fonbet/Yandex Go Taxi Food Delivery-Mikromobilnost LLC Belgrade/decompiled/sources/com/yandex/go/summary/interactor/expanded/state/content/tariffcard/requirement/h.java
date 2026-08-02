package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import defpackage.amj0;
import defpackage.avj0;
import defpackage.d1h0;
import defpackage.evu0;
import defpackage.f6v;
import defpackage.fnx0;
import defpackage.jdj0;
import defpackage.kyh0;
import defpackage.mi31;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.scc;
import defpackage.uij0;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.z1f;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z1f b;
    public final /* synthetic */ fnx0 c;

    public h(vpr vprVar, z1f z1fVar, fnx0 fnx0Var) {
        this.a = vprVar;
        this.b = z1fVar;
        this.c = fnx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CouponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1;
        int i;
        String str;
        String str2;
        amj0 amj0Var;
        if (continuation instanceof CouponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) {
            couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 = (CouponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    z1f z1fVar = this.b;
                    com.yandex.go.summary.mapper.a aVar = z1fVar.d;
                    fnx0 fnx0Var = this.c;
                    pex0 pex0Var = fnx0Var.c;
                    aVar.getClass();
                    CouponCheckResult couponCheckResult = pex0Var.j0;
                    boolean z = pex0Var.u;
                    if (couponCheckResult == null || (str = couponCheckResult.c) == null || z || !couponCheckResult.a) {
                        str = null;
                    }
                    if (couponCheckResult == null || (str2 = couponCheckResult.e) == null || z) {
                        str2 = null;
                    }
                    if (str == null || evu0.J(str)) {
                        amj0Var = null;
                    } else {
                        uij0 uij0Var = new uij0(mja1.b("", null, 6), Integer.valueOf(d1h0.coupon_badge_icon), null);
                        if (str2 == null || evu0.J(str2)) {
                            str2 = ((avj0) aVar.a).i(kyh0.tariff_card_coupon_note, str);
                        }
                        amj0Var = new amj0("tariff_coupon", "tariff_coupon", true, com.yandex.go.summary.mapper.a.c(booleanValue), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(booleanValue), uij0Var, new jdj0(str2, ""), null, null, null, str2, RequirementTypeUiState.COUPON);
                    }
                    List h = scc.h(amj0Var);
                    vfx0 vfx0Var = z1fVar.b;
                    mi31 mi31Var = fnx0Var.a;
                    vfx0Var.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b(h, vfx0.a(mi31Var));
                    couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1 = new CouponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = couponUiStateInteractor$uiStateFlow$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
