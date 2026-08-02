package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import defpackage.avm0;
import defpackage.bvf0;
import defpackage.ism0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lavm0;", "paymentElement", "Lhsm0;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lavm0;)Lhsm0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.disabling.ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1", f = "ScootersActivePassesV3RenewDisablingUiStateInteractor.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ism0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1(ism0 ism0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = ism0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1 scootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1 = new ScootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        scootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1.L$0 = (avm0) obj2;
        return scootersActivePassesV3RenewDisablingUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        avm0 avm0Var = (avm0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0.c;
        this.L$0 = null;
        this.label = 1;
        dVar.getClass();
        Object n = bvf0.n(new ScootersActivePassesV3RenewDisablingUiStateMapper$mapToUiState$2(dVar, avm0Var, null), this);
        return n == coroutineSingletons ? coroutineSingletons : n;
    }
}
