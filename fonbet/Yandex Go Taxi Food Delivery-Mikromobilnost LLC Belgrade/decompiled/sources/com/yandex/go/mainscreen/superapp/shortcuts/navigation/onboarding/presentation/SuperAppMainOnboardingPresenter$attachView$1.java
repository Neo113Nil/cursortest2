package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.SuperAppMainOnboardingInteractor$onboardingResultFlow$$inlined$flatMapLatest$1;
import com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.domain.e;
import defpackage.jx81;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v2w0;
import defpackage.wls;
import defpackage.x0w0;
import defpackage.y0w0;
import defpackage.ye;
import defpackage.z9s0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingPresenter$attachView$1", f = "SuperAppMainOnboardingPresenter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainOnboardingPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ x0w0 $mvpView;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ y0w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainOnboardingPresenter$attachView$1(y0w0 y0w0Var, x0w0 x0w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y0w0Var;
        this.$mvpView = x0w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainOnboardingPresenter$attachView$1 superAppMainOnboardingPresenter$attachView$1 = new SuperAppMainOnboardingPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        superAppMainOnboardingPresenter$attachView$1.L$0 = obj;
        return superAppMainOnboardingPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainOnboardingPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        z9s0 z9s0Var = this.this$0.D.b.a;
        z9s0Var.getClass();
        String[] b = jx81.b(1);
        int length = b.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String str = b[i2];
                if (!z9s0Var.a.g("was_" + str + "_dialog_shown", false)) {
                    break;
                }
                i2++;
            } else {
                e eVar = this.this$0.C;
                g X = kotlinx.coroutines.flow.e.X(((v2w0) eVar.e).a, new SuperAppMainOnboardingInteractor$onboardingResultFlow$$inlined$flatMapLatest$1(null, eVar));
                ye yeVar = new ye(22, this.this$0, tseVar, this.$mvpView);
                this.L$0 = null;
                this.label = 1;
                if (X.collect(yeVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
