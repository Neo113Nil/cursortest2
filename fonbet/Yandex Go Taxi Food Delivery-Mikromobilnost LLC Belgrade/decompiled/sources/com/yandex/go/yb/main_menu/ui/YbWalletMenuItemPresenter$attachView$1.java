package com.yandex.go.yb.main_menu.ui;

import defpackage.eg41;
import defpackage.ky51;
import defpackage.ly51;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.main_menu.ui.YbWalletMenuItemPresenter$attachView$1", f = "YbWalletMenuItemPresenter.kt", l = {71}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class YbWalletMenuItemPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ ky51 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ly51 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YbWalletMenuItemPresenter$attachView$1(ly51 ly51Var, ky51 ky51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ly51Var;
        this.$mvpView = ky51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YbWalletMenuItemPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YbWalletMenuItemPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g X = e.X(this.this$0.D.a(), new YbWalletMenuItemPresenter$attachView$1$invokeSuspend$$inlined$flatMapLatest$1(this.this$0, null));
            this.this$0.y.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(X, mdh.b);
            ky51 ky51Var = this.$mvpView;
            o oVar = new o(F, new YbWalletMenuItemPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            eg41 eg41Var = new eg41(6, ky51Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(eg41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
