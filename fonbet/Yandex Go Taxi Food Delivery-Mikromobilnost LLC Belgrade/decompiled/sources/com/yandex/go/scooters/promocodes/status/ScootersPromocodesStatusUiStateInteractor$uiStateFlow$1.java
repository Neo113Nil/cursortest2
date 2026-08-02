package com.yandex.go.scooters.promocodes.status;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pno0;
import defpackage.qno0;
import defpackage.tno0;
import defpackage.uno0;
import defpackage.vno0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lvno0;", TarifficatorScenarioActivity.RESULT_KEY, "Lrno0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lvno0;)Lrno0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusUiStateInteractor$uiStateFlow$1", f = "ScootersPromocodesStatusUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromocodesStatusUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersPromocodesStatusUiStateInteractor$uiStateFlow$1 scootersPromocodesStatusUiStateInteractor$uiStateFlow$1 = new ScootersPromocodesStatusUiStateInteractor$uiStateFlow$1(3, (Continuation) obj3);
        scootersPromocodesStatusUiStateInteractor$uiStateFlow$1.L$0 = (vno0) obj2;
        return scootersPromocodesStatusUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vno0 vno0Var = (vno0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (vno0Var instanceof uno0) {
            return new qno0(vno0Var.a, vno0Var.b);
        }
        if (vno0Var instanceof tno0) {
            return new pno0(vno0Var.a, vno0Var.b);
        }
        w511.b();
        return null;
    }
}
