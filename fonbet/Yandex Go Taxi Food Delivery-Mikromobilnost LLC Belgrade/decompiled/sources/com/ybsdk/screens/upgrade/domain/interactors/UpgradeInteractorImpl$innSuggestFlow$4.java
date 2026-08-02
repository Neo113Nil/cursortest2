package com.ybsdk.screens.upgrade.domain.interactors;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.UpgradeEvents$UpgradeDataSearchInnResultResult;
import com.ybsdk.screens.upgrade.domain.entities.SimpleIdFormFieldEntity;
import defpackage.ja21;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ob21;
import defpackage.pb21;
import defpackage.qb21;
import defpackage.rb21;
import defpackage.rt1;
import defpackage.sb21;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsb21;", "upgradeSuggestEntity", "Lzy11;", "<anonymous>", "(Lsb21;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.domain.interactors.UpgradeInteractorImpl$innSuggestFlow$4", f = "UpgradeInteractorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeInteractorImpl$innSuggestFlow$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeInteractorImpl$innSuggestFlow$4(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeInteractorImpl$innSuggestFlow$4 upgradeInteractorImpl$innSuggestFlow$4 = new UpgradeInteractorImpl$innSuggestFlow$4(this.this$0, continuation);
        upgradeInteractorImpl$innSuggestFlow$4.L$0 = obj;
        return upgradeInteractorImpl$innSuggestFlow$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UpgradeInteractorImpl$innSuggestFlow$4 upgradeInteractorImpl$innSuggestFlow$4 = (UpgradeInteractorImpl$innSuggestFlow$4) create((sb21) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        upgradeInteractorImpl$innSuggestFlow$4.invokeSuspend(zy11Var);
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
        sb21 sb21Var = (sb21) this.L$0;
        if (sb21Var instanceof rb21) {
            rt1 rt1Var = this.this$0.d.s0;
            UpgradeEvents$UpgradeDataSearchInnResultResult upgradeEvents$UpgradeDataSearchInnResultResult = UpgradeEvents$UpgradeDataSearchInnResultResult.OK;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, upgradeEvents$UpgradeDataSearchInnResultResult.getOriginalValue());
            rt1Var.a.a("upgrade.data.search_inn.result", linkedHashMap);
            if (((ja21) this.this$0.e.getValue()).f.length() == 0) {
                c cVar = this.this$0;
                SimpleIdFormFieldEntity simpleIdFormFieldEntity = SimpleIdFormFieldEntity.INN_OR_SNILS;
                String str = (String) kotlin.collections.a.R(((rb21) sb21Var).a);
                if (str == null) {
                    str = "";
                }
                cVar.c(simpleIdFormFieldEntity, str);
            }
        } else if (jl40.l(sb21Var, pb21.a)) {
            rt1 rt1Var2 = this.this$0.d.s0;
            UpgradeEvents$UpgradeDataSearchInnResultResult upgradeEvents$UpgradeDataSearchInnResultResult2 = UpgradeEvents$UpgradeDataSearchInnResultResult.ERROR;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
            linkedHashMap2.put(TarifficatorScenarioActivity.RESULT_KEY, upgradeEvents$UpgradeDataSearchInnResultResult2.getOriginalValue());
            rt1Var2.a.a("upgrade.data.search_inn.result", linkedHashMap2);
        } else if (!jl40.l(sb21Var, ob21.a) && !jl40.l(sb21Var, qb21.a)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }
}
