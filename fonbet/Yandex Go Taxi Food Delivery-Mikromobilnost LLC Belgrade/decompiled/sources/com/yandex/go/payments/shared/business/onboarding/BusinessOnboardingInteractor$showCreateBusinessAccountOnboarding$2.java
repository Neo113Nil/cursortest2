package com.yandex.go.payments.shared.business.onboarding;

import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.fx6;
import defpackage.gx6;
import defpackage.hx6;
import defpackage.ix6;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mvg;
import defpackage.mx6;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.onboarding.BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2", f = "BusinessOnboardingInteractor.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onRestoreFocusAction;
    final /* synthetic */ SharedPaymentsOpenReason $openReason;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2(b bVar, SharedPaymentsOpenReason sharedPaymentsOpenReason, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$openReason = sharedPaymentsOpenReason;
        this.$onRestoreFocusAction = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2(this.this$0, this.$openReason, this.$onRestoreFocusAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessOnboardingInteractor$showCreateBusinessAccountOnboarding$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.yandex.go.payments.shared.business.onboarding.b, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SharedPaymentsOpenReason sharedPaymentsOpenReason;
        Runnable runnable;
        BusinessAccountFlowExperiment businessAccountFlowExperiment;
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                sharedPaymentsOpenReason = this.$openReason;
                runnable = this.$onRestoreFocusAction;
                BusinessAccountFlowExperiment businessAccountFlowExperiment2 = (BusinessAccountFlowExperiment) bVar2.e.a.b();
                this.L$0 = bVar2;
                this.L$1 = sharedPaymentsOpenReason;
                this.L$2 = runnable;
                this.L$3 = bVar2;
                this.L$4 = businessAccountFlowExperiment2;
                this.label = 1;
                Object b = b.b(bVar2, businessAccountFlowExperiment2, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                businessAccountFlowExperiment = businessAccountFlowExperiment2;
                obj = b;
                bVar = bVar2;
            } else {
                if (r1 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                businessAccountFlowExperiment = (BusinessAccountFlowExperiment) this.L$4;
                runnable = (Runnable) this.L$2;
                sharedPaymentsOpenReason = (SharedPaymentsOpenReason) this.L$1;
                bVar = (b) this.L$0;
                kotlin.b.b(obj);
            }
            hx6 hx6Var = (hx6) obj;
            if (hx6Var instanceof gx6) {
                mx6 mx6Var = bVar.h;
                Promotion promotion = ((gx6) hx6Var).a;
                mx6Var.getClass();
                c.m(bVar.c, mx6.a(promotion, sharedPaymentsOpenReason), "business_onboarding", new ix6(1, runnable), null, 24);
            } else if (jl40.l(hx6Var, fx6.c)) {
                bVar.g.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT_ONBOARDING_ERROR", null, new IllegalArgumentException(), "timeout with loading onboarding fullscreen", 2);
                b.a(bVar, businessAccountFlowExperiment, sharedPaymentsOpenReason, runnable);
            } else if (jl40.l(hx6Var, fx6.b)) {
                bVar.g.getClass();
                xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT_ONBOARDING_ERROR", null, new IllegalArgumentException(), "error with loading onboarding fullscreen", 2);
                b.a(bVar, businessAccountFlowExperiment, sharedPaymentsOpenReason, runnable);
            } else {
                if (!jl40.l(hx6Var, fx6.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                runnable.run();
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            r1.g.getClass();
            xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT_ONBOARDING", null, th, "onboarding banner showing error", 2);
        }
        return zy11.a;
    }
}
