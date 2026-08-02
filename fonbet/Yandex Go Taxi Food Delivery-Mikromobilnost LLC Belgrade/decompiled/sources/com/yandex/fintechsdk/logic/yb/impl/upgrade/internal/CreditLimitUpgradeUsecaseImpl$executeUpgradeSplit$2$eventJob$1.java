package com.yandex.fintechsdk.logic.yb.impl.upgrade.internal;

import com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit.UpgradeSplitResult$Status;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.api.YBSdk;
import defpackage.cdz0;
import defpackage.ey4;
import defpackage.eyc;
import defpackage.fp51;
import defpackage.fyc;
import defpackage.i3y;
import defpackage.ib21;
import defpackage.jl40;
import defpackage.mg51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1", f = "CreditLimitUpgradeUsecaseImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ eyc $resultDeferred;
    final /* synthetic */ fp51 $ybAdapter;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1(fp51 fp51Var, eyc eycVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$ybAdapter = fp51Var;
        this.$resultDeferred = eycVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1 creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1 = new CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1(this.$ybAdapter, this.$resultDeferred, this.this$0, continuation);
        creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1.L$0 = obj;
        return creditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditLimitUpgradeUsecaseImpl$executeUpgradeSplit$2$eventJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                i3y i3yVar = ((c) this.$ybAdapter).a;
                tpr ey4Var = !((i3yVar != null ? (mg51) i3yVar.getValue() : null) != null) ? pvn.a : new ey4(new cdz0(YBSdk.INSTANCE.observeSdkEvents(), 13), 29);
                this.label = 1;
                obj = e.y(ey4Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            failure = (Map) obj;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        eyc eycVar = this.$resultDeferred;
        a aVar = this.this$0;
        if (!(failure instanceof Result.Failure)) {
            Map map = (Map) failure;
            aVar.getClass();
            String str = (String) map.get(ACSPConstants.STATUS);
            if (str == null) {
                str = (String) map.get(TarifficatorScenarioActivity.RESULT_KEY);
            }
            ((fyc) eycVar).T(jl40.l(str, "success") ? ib21.c : jl40.l(str, "canceled") ? ib21.d : new ib21(UpgradeSplitResult$Status.FAILURE, str));
        }
        return zy11.a;
    }
}
