package com.yandex.go.chargers.feedback.ui;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackBannerAnalyticsAlias;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import defpackage.az9;
import defpackage.dz9;
import defpackage.m0a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q0a;
import defpackage.t0a;
import defpackage.tls;
import defpackage.tse;
import defpackage.ty9;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.feedback.ui.ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1", f = "ChargersFeedbackScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ t0a $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1(tls tlsVar, t0a t0aVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tlsVar;
        this.$state = t0aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1(this.$action, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1 chargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1 = (ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = this.$action;
        az9 az9Var = ((q0a) this.$state).a;
        String str = az9Var.a;
        ty9 ty9Var = az9Var.d;
        ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias = ty9Var != null ? ty9Var.f : null;
        ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage = az9Var.h;
        dz9 dz9Var = az9Var.e;
        tlsVar.invoke(new m0a(str, chargersFeedbackBannerAnalyticsAlias, chargersFeedbackCompletedOrder$FinishingStage, dz9Var != null ? dz9Var.a : null));
        return zy11.a;
    }
}
