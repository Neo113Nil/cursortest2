package com.yandex.go.taxi.order.tariff_upgrade.ui;

import defpackage.gqx0;
import defpackage.hqx0;
import defpackage.lpx0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.npx0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpx0;
import defpackage.tse;
import defpackage.upx0;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradePresenter$attachView$1", f = "TariffUpgradePresenter.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TariffUpgradePresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpx0 $mvpView;
    int label;
    final /* synthetic */ upx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffUpgradePresenter$attachView$1(upx0 upx0Var, tpx0 tpx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = upx0Var;
        this.$mvpView = tpx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffUpgradePresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffUpgradePresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            upx0 upx0Var = this.this$0;
            npx0 npx0Var = upx0Var.A;
            String str = upx0Var.x.c;
            o61 o61Var = npx0Var.a;
            o61Var.getClass();
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("class_after_upgrade", str);
            }
            o61Var.a.a("HigherClassCard.Shown", hashMap, 1, new HashMap());
            upx0 upx0Var2 = this.this$0;
            hqx0 hqx0Var = upx0Var2.z;
            lpx0 lpx0Var = upx0Var2.x;
            this.label = 1;
            hqx0Var.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new TariffUpgradeUiStateMapper$mapToUiState$2(lpx0Var, hqx0Var, null), this);
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
        this.$mvpView.render((gqx0) obj);
        return zy11.a;
    }
}
