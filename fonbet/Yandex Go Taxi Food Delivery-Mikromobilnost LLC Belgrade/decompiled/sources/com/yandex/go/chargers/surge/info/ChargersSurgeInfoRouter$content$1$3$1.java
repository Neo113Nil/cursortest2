package com.yandex.go.chargers.surge.info;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersSurgeInfoSheetButtonName;
import defpackage.b64;
import defpackage.cwa;
import defpackage.dwa;
import defpackage.em9;
import defpackage.ewa;
import defpackage.fwa;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4e;
import defpackage.yva;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.surge.info.ChargersSurgeInfoRouter$content$1$3$1", f = "ChargersSurgeInfoRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersSurgeInfoRouter$content$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ ewa $action;
    final /* synthetic */ yva $navigator;
    final /* synthetic */ fwa $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersSurgeInfoRouter$content$1$3$1(fwa fwaVar, ewa ewaVar, yva yvaVar, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = fwaVar;
        this.$action = ewaVar;
        this.$navigator = yvaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersSurgeInfoRouter$content$1$3$1(this.$uiActionInteractor, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersSurgeInfoRouter$content$1$3$1 chargersSurgeInfoRouter$content$1$3$1 = (ChargersSurgeInfoRouter$content$1$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersSurgeInfoRouter$content$1$3$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fwa fwaVar = this.$uiActionInteractor;
        ewa ewaVar = this.$action;
        yva yvaVar = this.$navigator;
        em9 em9Var = fwaVar.a;
        if (ewaVar instanceof dwa) {
            int i = ((dwa) ewaVar).a;
            HashMap w = b64.w(em9Var);
            em9Var.a.a("Chargers.SurgeInfoSheet.Shown", w, 1, x4e.n(i, w, "surge_gauge_value"));
        } else {
            if (!(ewaVar instanceof cwa)) {
                w511.b();
                return null;
            }
            ChargersAnalytics$ChargersSurgeInfoSheetButtonName chargersAnalytics$ChargersSurgeInfoSheetButtonName = ChargersAnalytics$ChargersSurgeInfoSheetButtonName.Ok;
            HashMap w2 = b64.w(em9Var);
            w2.put("button_name", chargersAnalytics$ChargersSurgeInfoSheetButtonName.getEventValue());
            em9Var.a.a("Chargers.SurgeInfoSheet.Tapped", w2, 1, new HashMap());
            yvaVar.a.r(new qu(9));
        }
        return zy11.a;
    }
}
