package com.yandex.go.taxi.order.tariff_upgrade.ui;

import com.yandex.go.zone.dto.objects.TariffCard;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import defpackage.eqx0;
import defpackage.evu0;
import defpackage.fqx0;
import defpackage.gqx0;
import defpackage.hqx0;
import defpackage.jl40;
import defpackage.kpx0;
import defpackage.lpx0;
import defpackage.mvg;
import defpackage.n3a;
import defpackage.ny61;
import defpackage.qqo;
import defpackage.tfx0;
import defpackage.tse;
import defpackage.viu;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lgqx0;", "<anonymous>", "(Ltse;)Lgqx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeUiStateMapper$mapToUiState$2", f = "TariffUpgradeUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffUpgradeUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ lpx0 $tariffUpgrade;
    int label;
    final /* synthetic */ hqx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUpgradeUiStateMapper$mapToUiState$2(lpx0 lpx0Var, hqx0 hqx0Var, Continuation continuation) {
        super(2, continuation);
        this.$tariffUpgrade = lpx0Var;
        this.this$0 = hqx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffUpgradeUiStateMapper$mapToUiState$2(this.$tariffUpgrade, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffUpgradeUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eqx0 eqx0Var;
        String str;
        fqx0 fqx0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lpx0 lpx0Var = this.$tariffUpgrade;
        ZoneTariffInfo zoneTariffInfo = lpx0Var.d;
        String str2 = lpx0Var.a;
        String str3 = lpx0Var.b;
        kpx0 kpx0Var = lpx0Var.f;
        boolean z = false;
        if (kpx0Var != null) {
            hqx0 hqx0Var = this.this$0;
            String str4 = lpx0Var.c;
            hqx0Var.getClass();
            String str5 = kpx0Var.a;
            boolean z2 = kpx0Var.b;
            if (z2) {
                fqx0Var = new fqx0(hqx0Var.a(32), jl40.l(str4, "vip") ? hqx0Var.a(-148) : jl40.l(str4, "ultimate") ? hqx0Var.a(-196) : hqx0Var.a(-100), 508.0f);
            } else {
                fqx0Var = new fqx0(hqx0Var.a(0), hqx0Var.a(0), hqx0Var.a(544));
            }
            eqx0Var = new eqx0(str5, z2, fqx0Var);
        } else {
            eqx0Var = null;
        }
        tfx0 tfx0Var = (tfx0) this.this$0.c;
        tfx0Var.getClass();
        if (zoneTariffInfo != null) {
            TariffCard tariffCard = zoneTariffInfo.t;
            List list = tariffCard != null ? tariffCard.d : null;
            if ((list != null && !list.isEmpty()) || ((str = zoneTariffInfo.a) != null && !evu0.J(str))) {
                n3a n3aVar = tfx0Var.c;
                String str6 = zoneTariffInfo.e;
                qqo qqoVar = n3aVar.b;
                if (!((viu) qqoVar.b()).b || ((viu) qqoVar.b()).c.contains(str6)) {
                    z = true;
                }
            }
        }
        return new gqx0(str2, str3, eqx0Var, z);
    }
}
