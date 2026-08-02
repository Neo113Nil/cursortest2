package com.yandex.go.user_profile.settings.profile.presentation;

import com.yandex.go.user_profile.settings.profile.domain.SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1;
import defpackage.fcr0;
import defpackage.gcr0;
import defpackage.hcr0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.settings.profile.presentation.SettingsProfilePresenter$attachView$1", f = "SettingsProfilePresenter.kt", l = {23}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SettingsProfilePresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcr0 $mvpView;
    int label;
    final /* synthetic */ hcr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsProfilePresenter$attachView$1(hcr0 hcr0Var, gcr0 gcr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hcr0Var;
        this.$mvpView = gcr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsProfilePresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsProfilePresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            fcr0 fcr0Var = this.this$0.y;
            g X = e.X(fcr0Var.b.a(), new SettingsProfileInteractor$stateFlow$$inlined$flatMapLatest$1(null, fcr0Var));
            fcr0Var.g.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(X, mdh.b);
            v41 v41Var = new v41(26, this.$mvpView);
            this.label = 1;
            if (F.collect(v41Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
