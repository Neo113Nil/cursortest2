package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import defpackage.a1w0;
import defpackage.e3n;
import defpackage.fei0;
import defpackage.hei0;
import defpackage.j170;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.sei0;
import defpackage.tei0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xsq0;
import defpackage.y0w0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingPresenter$onboardingShowed$1", f = "SuperAppMainOnboardingPresenter.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainOnboardingPresenter$onboardingShowed$1 extends SuspendLambda implements wls {
    final /* synthetic */ j170 $onboarding;
    int label;
    final /* synthetic */ y0w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainOnboardingPresenter$onboardingShowed$1(y0w0 y0w0Var, j170 j170Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y0w0Var;
        this.$onboarding = j170Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainOnboardingPresenter$onboardingShowed$1(this.this$0, this.$onboarding, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainOnboardingPresenter$onboardingShowed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fei0 a = ((hei0) this.this$0.E).a();
            if (a != null) {
                j = a.b;
            } else {
                o430 o430Var = e3n.b;
                j = 0;
            }
            this.label = 1;
            if (kotlinx.coroutines.a.j(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        a1w0 a1w0Var = this.this$0.B;
        j170 j170Var = this.$onboarding;
        a1w0Var.getClass();
        Map map = j170Var.d;
        if (map != null) {
            ((tei0) ((sei0) a1w0Var.b.getValue())).a(new SendRealtimeAnalyticsAction.Event(176, j170Var.a, CreativeType.MainScreenOnboarding.getCreativeName(), RealtimeEventType.Shown.getEventName(), xsq0.b(map)));
        }
        return zy11.a;
    }
}
