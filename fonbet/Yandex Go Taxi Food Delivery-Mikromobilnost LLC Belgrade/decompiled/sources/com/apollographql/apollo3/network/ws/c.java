package com.apollographql.apollo3.network.ws;

import defpackage.dxf0;
import defpackage.hc70;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rnh;
import defpackage.tls;
import defpackage.to2;
import defpackage.zws;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class c extends f {
    public final long c;
    public final tls d;
    public final WsFrameType e;

    public c(rnh rnhVar, dxf0 dxf0Var, long j, tls tlsVar, WsFrameType wsFrameType) {
        super(rnhVar, dxf0Var);
        this.c = j;
        this.d = tlsVar;
        this.e = wsFrameType;
    }

    @Override // com.apollographql.apollo3.network.ws.f
    public final void b(Map map) {
        Object obj = map.get("type");
        boolean l = jl40.l(obj, Constants.KEY_DATA);
        dxf0 dxf0Var = this.b;
        if (l) {
            ((e) dxf0Var.a).f.d(new zws((String) map.get("id"), (Map) map.get("payload")));
        } else {
            if (!jl40.l(obj, "error")) {
                if (jl40.l(obj, "complete")) {
                    ((e) dxf0Var.a).f.d(new hc70());
                    return;
                }
                return;
            }
            Object obj2 = map.get("id");
            if (obj2 instanceof String) {
                ((e) dxf0Var.a).f.d(new zws((String) obj2, (Map) map.get("payload")));
            } else {
                ((e) dxf0Var.a).f.d(new zws((Map) map.get("payload")));
            }
        }
    }

    @Override // com.apollographql.apollo3.network.ws.f
    public final void f(to2 to2Var) {
        e(kotlin.collections.b.i(new Pair("type", "start"), new Pair("id", to2Var.b.toString()), new Pair("payload", com.apollographql.apollo3.api.http.a.a(to2Var))), this.e);
    }

    @Override // com.apollographql.apollo3.network.ws.f
    public final void g(to2 to2Var) {
        e(kotlin.collections.b.i(new Pair("type", "stop"), new Pair("id", to2Var.b.toString())), this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (kotlinx.coroutines.a.u(r8, r4, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        SubscriptionWsProtocol$connectionInit$1 subscriptionWsProtocol$connectionInit$1;
        int i;
        c cVar;
        Map map;
        Map map2;
        if (continuationImpl instanceof SubscriptionWsProtocol$connectionInit$1) {
            subscriptionWsProtocol$connectionInit$1 = (SubscriptionWsProtocol$connectionInit$1) continuationImpl;
            int i2 = subscriptionWsProtocol$connectionInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscriptionWsProtocol$connectionInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscriptionWsProtocol$connectionInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscriptionWsProtocol$connectionInit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap l = kotlin.collections.b.l(new Pair("type", "connection_init"));
                    subscriptionWsProtocol$connectionInit$1.L$0 = this;
                    subscriptionWsProtocol$connectionInit$1.L$1 = l;
                    subscriptionWsProtocol$connectionInit$1.label = 1;
                    Object invoke = this.d.invoke(subscriptionWsProtocol$connectionInit$1);
                    if (invoke != coroutineSingletons) {
                        cVar = this;
                        map = l;
                        obj = invoke;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = (Map) subscriptionWsProtocol$connectionInit$1.L$1;
                cVar = (c) subscriptionWsProtocol$connectionInit$1.L$0;
                kotlin.b.b(obj);
                map2 = (Map) obj;
                if (map2 != null) {
                    map.put("payload", map2);
                }
                cVar.e(map, cVar.e);
                long j = cVar.c;
                SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$2 = new SubscriptionWsProtocol$connectionInit$2(cVar, null);
                subscriptionWsProtocol$connectionInit$1.L$0 = null;
                subscriptionWsProtocol$connectionInit$1.L$1 = null;
                subscriptionWsProtocol$connectionInit$1.label = 2;
            }
        }
        subscriptionWsProtocol$connectionInit$1 = new SubscriptionWsProtocol$connectionInit$1(this, continuationImpl);
        Object obj2 = subscriptionWsProtocol$connectionInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscriptionWsProtocol$connectionInit$1.label;
        if (i != 0) {
        }
        map2 = (Map) obj2;
        if (map2 != null) {
        }
        cVar.e(map, cVar.e);
        long j2 = cVar.c;
        SubscriptionWsProtocol$connectionInit$2 subscriptionWsProtocol$connectionInit$22 = new SubscriptionWsProtocol$connectionInit$2(cVar, null);
        subscriptionWsProtocol$connectionInit$1.L$0 = null;
        subscriptionWsProtocol$connectionInit$1.L$1 = null;
        subscriptionWsProtocol$connectionInit$1.label = 2;
    }
}
