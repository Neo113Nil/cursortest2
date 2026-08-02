package com.yandex.go.scooters.payments.navigation;

import com.yandex.go.payments.api.model.PaymentsScreen;
import defpackage.ama;
import defpackage.azz;
import defpackage.dy90;
import defpackage.fva0;
import defpackage.h0a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sgo0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.payments.navigation.ScootersPaymentRouterImpl$onLaunch$1", f = "ScootersPaymentRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPaymentRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ sgo0 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPaymentRouterImpl$onLaunch$1(a aVar, sgo0 sgo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = sgo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPaymentRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersPaymentRouterImpl$onLaunch$1 scootersPaymentRouterImpl$onLaunch$1 = (ScootersPaymentRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersPaymentRouterImpl$onLaunch$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        fva0 fva0Var = this.this$0.D;
        PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Loading;
        fva0.f(fva0Var, "ScootersPayment", performanceAnalytics$Type, 0L, 4);
        a aVar = this.this$0;
        sgo0 sgo0Var = this.$payload;
        aVar.A(((dy90) aVar.E.a()).a.a(), new azz(PaymentsScreen.SCOOTERS, "no_feature", new h0a0(sgo0Var.a, null), sgo0Var.c, sgo0Var.b, true, null, false, false, null, null, null, null, null, null, null, null, null, 524160), new ama(8, aVar));
        fva0.b(this.this$0.D, "ScootersPayment", performanceAnalytics$Type, null, 4);
        return zy11.a;
    }
}
