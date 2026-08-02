package com.yandex.go.analytics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.q;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.analytics.DebugAnalyticsImpl$reportEvent$2", f = "DebugAnalyticsImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DebugAnalyticsImpl$reportEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ Map<String, Object> $attrs;
    final /* synthetic */ String $eventName;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugAnalyticsImpl$reportEvent$2(b bVar, String str, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$eventName = str;
        this.$attrs = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DebugAnalyticsImpl$reportEvent$2(this.this$0, this.$eventName, this.$attrs, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DebugAnalyticsImpl$reportEvent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Map map;
        Map map2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Map<String, Object> map3 = this.$attrs;
            b bVar = this.this$0;
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.putAll(map3);
            ru.yandex.taxi.analytics.g gVar = bVar.a;
            this.L$0 = mapBuilder;
            this.L$1 = null;
            str = "CommonParams";
            this.L$2 = "CommonParams";
            this.L$3 = mapBuilder;
            this.label = 1;
            obj = gVar.b(null, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = mapBuilder;
            map2 = map;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$3;
            str = (String) this.L$2;
            map2 = (Map) this.L$0;
            kotlin.b.b(obj);
        }
        map.put(str, obj);
        MapBuilder j = ((MapBuilder) map2).j();
        ((q) this.this$0.b).h(g8e.o("Debug.", this.$eventName), j);
        return zy11.a;
    }
}
