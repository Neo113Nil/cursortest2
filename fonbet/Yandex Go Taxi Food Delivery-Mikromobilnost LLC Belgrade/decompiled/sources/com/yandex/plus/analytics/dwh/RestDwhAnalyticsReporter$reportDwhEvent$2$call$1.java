package com.yandex.plus.analytics.dwh;

import com.yandex.plus.analytics.dwh.internal.network.DwhEventsApi;
import defpackage.mvg;
import defpackage.n4n;
import defpackage.ny61;
import defpackage.q4n;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsq50;", "<unused var>", "Lcom/yandex/plus/analytics/dwh/internal/network/DwhEventsApi;", "api", "Lzy11;", "<anonymous>", "(Lsq50;Lcom/yandex/plus/analytics/dwh/internal/network/DwhEventsApi;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.analytics.dwh.RestDwhAnalyticsReporter$reportDwhEvent$2$call$1", f = "RestDwhAnalyticsReporter.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestDwhAnalyticsReporter$reportDwhEvent$2$call$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $event;
    final /* synthetic */ Map<String, Object> $parameters;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestDwhAnalyticsReporter$reportDwhEvent$2$call$1(String str, Map map, Continuation continuation) {
        super(3, continuation);
        this.$event = str;
        this.$parameters = map;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RestDwhAnalyticsReporter$reportDwhEvent$2$call$1 restDwhAnalyticsReporter$reportDwhEvent$2$call$1 = new RestDwhAnalyticsReporter$reportDwhEvent$2$call$1(this.$event, this.$parameters, (Continuation) obj3);
        restDwhAnalyticsReporter$reportDwhEvent$2$call$1.L$0 = (DwhEventsApi) obj2;
        return restDwhAnalyticsReporter$reportDwhEvent$2$call$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DwhEventsApi dwhEventsApi = (DwhEventsApi) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = this.$event;
            Map<String, Object> map = this.$parameters;
            if (map == null) {
                map = kotlin.collections.b.f();
            }
            q4n q4nVar = new q4n(Collections.singletonList(new n4n(str, map)));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (dwhEventsApi.a(q4nVar, this) == coroutineSingletons) {
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
