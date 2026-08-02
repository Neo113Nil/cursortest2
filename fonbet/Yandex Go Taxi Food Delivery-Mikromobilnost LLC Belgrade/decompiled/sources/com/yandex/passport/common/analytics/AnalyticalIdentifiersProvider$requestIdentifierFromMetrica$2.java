package com.yandex.passport.common.analytics;

import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/common/analytics/b;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/common/analytics/b;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.common.analytics.AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2", f = "AnalyticalIdentifiersProvider.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AnalyticalIdentifiersProvider$requestIdentifierFromMetrica$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        this.L$0 = dVar;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        AppMetricaYandex.requestStartupParams(dVar.a, new c(j18Var), (List<String>) scc.g("appmetrica_device_id", "appmetrica_uuid"));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
