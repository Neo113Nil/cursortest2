package com.yandex.go.taxi.order.feed.data;

import android.content.Context;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.feed.experiments.tracking_feed_client_features.StatusRefreshPolicyDto;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.c1o;
import defpackage.cp60;
import defpackage.dv70;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.mth;
import defpackage.ny61;
import defpackage.sc20;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u1m;
import defpackage.uyj;
import defpackage.w9w0;
import defpackage.xu70;
import defpackage.y8u0;
import defpackage.ym11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final h3y a;
    public final xu70 b;
    public final f0 c;
    public final w9w0 d;
    public final Context e;
    public final h3y f;
    public final cp60 g;
    public final dv70 h;
    public final i3y i = kotlin.a.b(LazyThreadSafetyMode.NONE, new c1o(20, this));

    public a(h3y h3yVar, xu70 xu70Var, f0 f0Var, w9w0 w9w0Var, Context context, h3y h3yVar2, tt2 tt2Var, cp60 cp60Var, dv70 dv70Var) {
        this.a = h3yVar;
        this.b = xu70Var;
        this.c = f0Var;
        this.d = w9w0Var;
        this.e = context;
        this.f = h3yVar2;
        this.g = cp60Var;
        this.h = dv70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        FeedSdkLoadInteractor$createQuery$1 feedSdkLoadInteractor$createQuery$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        TaxiOrder taxiOrder2;
        Map map;
        Object b;
        Map map2;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof FeedSdkLoadInteractor$createQuery$1) {
            feedSdkLoadInteractor$createQuery$1 = (FeedSdkLoadInteractor$createQuery$1) continuationImpl;
            int i2 = feedSdkLoadInteractor$createQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedSdkLoadInteractor$createQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedSdkLoadInteractor$createQuery$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedSdkLoadInteractor$createQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    zzs m = taxiOrder.m();
                    if (m != null) {
                        b("x-location", m.a + ";" + m.b, linkedHashMap);
                    }
                    String a = aVar.d.a();
                    if (a != null) {
                    }
                    String oaid = aVar.g.getOaid();
                    if (oaid != null) {
                        b("x-adv-oaid", oaid, linkedHashMap);
                    }
                    xu70 xu70Var = aVar.b;
                    feedSdkLoadInteractor$createQuery$1.L$0 = taxiOrder;
                    feedSdkLoadInteractor$createQuery$1.L$1 = linkedHashMap;
                    feedSdkLoadInteractor$createQuery$1.label = 1;
                    xu70Var.getClass();
                    if ("bdui/v1/taxi/tracking" != coroutineSingletons) {
                        taxiOrder2 = taxiOrder;
                        map = linkedHashMap;
                        obj = "bdui/v1/taxi/tracking";
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) feedSdkLoadInteractor$createQuery$1.L$3;
                    str = (String) feedSdkLoadInteractor$createQuery$1.L$2;
                    kotlin.b.b(obj);
                    return new u1m(map2, str, (Map) obj);
                }
                map = (Map) feedSdkLoadInteractor$createQuery$1.L$1;
                taxiOrder2 = (TaxiOrder) feedSdkLoadInteractor$createQuery$1.L$0;
                kotlin.b.b(obj);
                String str2 = (String) obj;
                com.yandex.go.taxi.order.feed.data.mapper.c cVar = (com.yandex.go.taxi.order.feed.data.mapper.c) aVar.f.get();
                DriveState driveState = taxiOrder2.h.b;
                feedSdkLoadInteractor$createQuery$1.L$0 = null;
                feedSdkLoadInteractor$createQuery$1.L$1 = null;
                feedSdkLoadInteractor$createQuery$1.L$2 = str2;
                feedSdkLoadInteractor$createQuery$1.L$3 = map;
                feedSdkLoadInteractor$createQuery$1.label = 2;
                b = cVar.b(taxiOrder2, driveState, feedSdkLoadInteractor$createQuery$1);
                if (b != coroutineSingletons) {
                    obj = b;
                    map2 = map;
                    str = str2;
                    return new u1m(map2, str, (Map) obj);
                }
                return coroutineSingletons;
            }
        }
        feedSdkLoadInteractor$createQuery$1 = new FeedSdkLoadInteractor$createQuery$1(aVar, continuationImpl);
        Object obj2 = feedSdkLoadInteractor$createQuery$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedSdkLoadInteractor$createQuery$1.label;
        if (i != 0) {
        }
        String str22 = (String) obj2;
        com.yandex.go.taxi.order.feed.data.mapper.c cVar2 = (com.yandex.go.taxi.order.feed.data.mapper.c) aVar.f.get();
        DriveState driveState2 = taxiOrder2.h.b;
        feedSdkLoadInteractor$createQuery$1.L$0 = null;
        feedSdkLoadInteractor$createQuery$1.L$1 = null;
        feedSdkLoadInteractor$createQuery$1.L$2 = str22;
        feedSdkLoadInteractor$createQuery$1.L$3 = map;
        feedSdkLoadInteractor$createQuery$1.label = 2;
        b = cVar2.b(taxiOrder2, driveState2, feedSdkLoadInteractor$createQuery$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static void b(String str, String str2, LinkedHashMap linkedHashMap) {
        String concat = "move_to_header:".concat(str);
        List list = (List) linkedHashMap.get(concat);
        if (list == null) {
            list = new ArrayList();
        } else if (!ym11.g(list)) {
            list = new ArrayList(list);
        }
        if (list.contains(str2)) {
            return;
        }
        list.add(str2);
        linkedHashMap.put(concat, list);
    }

    public final tpr c() {
        g X = kotlinx.coroutines.flow.e.X(new mth(this.c.q, 6), new FeedSdkLoadInteractor$documentState$$inlined$flatMapLatest$1(3, null));
        dv70 dv70Var = this.h;
        StatusRefreshPolicyDto statusRefreshPolicyDto = dv70Var.b.a.a().h;
        return kotlinx.coroutines.flow.e.F(new n(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.p(new e(kotlinx.coroutines.flow.e.s(new c(kotlinx.coroutines.flow.e.X(dv70Var.a.b, new OrderFeedStatusRefreshDecisionInteractor$appliedOrderFlow$$inlined$flatMapLatest$1(X, null))), new sc20(22, new y8u0(kotlin.collections.a.N0(statusRefreshPolicyDto.b), statusRefreshPolicyDto.a)))), 300L), new FeedSdkLoadInteractor$documentState$1(this, null)), new FeedSdkLoadInteractor$documentState$2(this, null)), uyj.a);
    }
}
