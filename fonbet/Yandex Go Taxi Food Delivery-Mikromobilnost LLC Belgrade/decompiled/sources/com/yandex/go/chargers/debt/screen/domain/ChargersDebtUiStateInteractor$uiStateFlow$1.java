package com.yandex.go.chargers.debt.screen.domain;

import com.yandex.go.chargers.data.model.ChargersDebt;
import defpackage.dms;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.up9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lup9;", "paymentProgress", "Lcom/yandex/go/chargers/data/model/ChargersDebt;", "chargersDebt", "Lhfa0;", "paymentOptions", "Lsq9;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lup9;Lcom/yandex/go/chargers/data/model/ChargersDebt;Lhfa0;)Lsq9;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.debt.screen.domain.ChargersDebtUiStateInteractor$uiStateFlow$1", f = "ChargersDebtUiStateInteractor.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersDebtUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersDebtUiStateInteractor$uiStateFlow$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ChargersDebtUiStateInteractor$uiStateFlow$1 chargersDebtUiStateInteractor$uiStateFlow$1 = new ChargersDebtUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj5);
        chargersDebtUiStateInteractor$uiStateFlow$1.L$0 = (up9) obj2;
        chargersDebtUiStateInteractor$uiStateFlow$1.L$1 = (ChargersDebt) obj3;
        chargersDebtUiStateInteractor$uiStateFlow$1.L$2 = (hfa0) obj4;
        return chargersDebtUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        up9 up9Var = (up9) this.L$0;
        ChargersDebt chargersDebt = (ChargersDebt) this.L$1;
        hfa0 hfa0Var = (hfa0) this.L$2;
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
        com.yandex.go.chargers.debt.screen.data.a aVar = this.this$0.a;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object a = aVar.a(chargersDebt, hfa0Var, up9Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
