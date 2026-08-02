package com.yandex.go.flex.main_screen.interactors;

import android.content.Context;
import com.yandex.go.feed_common.api.payment.PaymentInfo;
import defpackage.bg5;
import defpackage.cda0;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.rfa0;
import defpackage.sat;
import defpackage.scc;
import defpackage.tje;
import defpackage.xnt;
import defpackage.ybt;
import defpackage.zzs;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final ybt b;
    public final sat c;
    public final bg5 d;
    public final ru.yandex.taxi.superapp.knownOrder.u e;

    public a(Context context, ybt ybtVar, sat satVar, bg5 bg5Var, ru.yandex.taxi.superapp.knownOrder.u uVar) {
        this.a = context;
        this.b = ybtVar;
        this.c = satVar;
        this.d = bg5Var;
        this.e = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(zzs zzsVar, ContinuationImpl continuationImpl) {
        DocumentQueryBodyInteractor$buildPayloadWithPosition$1 documentQueryBodyInteractor$buildPayloadWithPosition$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        List list;
        if (continuationImpl instanceof DocumentQueryBodyInteractor$buildPayloadWithPosition$1) {
            documentQueryBodyInteractor$buildPayloadWithPosition$1 = (DocumentQueryBodyInteractor$buildPayloadWithPosition$1) continuationImpl;
            int i2 = documentQueryBodyInteractor$buildPayloadWithPosition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentQueryBodyInteractor$buildPayloadWithPosition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = documentQueryBodyInteractor$buildPayloadWithPosition$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentQueryBodyInteractor$buildPayloadWithPosition$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    documentQueryBodyInteractor$buildPayloadWithPosition$1.L$0 = zzsVar;
                    documentQueryBodyInteractor$buildPayloadWithPosition$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(this.e.k, documentQueryBodyInteractor$buildPayloadWithPosition$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) documentQueryBodyInteractor$buildPayloadWithPosition$1.L$1;
                        kotlin.b.b(obj);
                        return new Pair((Map) obj, list);
                    }
                    zzsVar = (zzs) documentQueryBodyInteractor$buildPayloadWithPosition$1.L$0;
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                documentQueryBodyInteractor$buildPayloadWithPosition$1.L$0 = null;
                documentQueryBodyInteractor$buildPayloadWithPosition$1.L$1 = list2;
                documentQueryBodyInteractor$buildPayloadWithPosition$1.label = 2;
                a = ((com.yandex.go.flex.main_screen.domain.a) this.b).a(zzsVar, list2, documentQueryBodyInteractor$buildPayloadWithPosition$1);
                if (a != coroutineSingletons) {
                    obj = a;
                    list = list2;
                    return new Pair((Map) obj, list);
                }
                return coroutineSingletons;
            }
        }
        documentQueryBodyInteractor$buildPayloadWithPosition$1 = new DocumentQueryBodyInteractor$buildPayloadWithPosition$1(this, continuationImpl);
        Object obj2 = documentQueryBodyInteractor$buildPayloadWithPosition$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentQueryBodyInteractor$buildPayloadWithPosition$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        documentQueryBodyInteractor$buildPayloadWithPosition$1.L$0 = null;
        documentQueryBodyInteractor$buildPayloadWithPosition$1.L$1 = list22;
        documentQueryBodyInteractor$buildPayloadWithPosition$1.label = 2;
        a = ((com.yandex.go.flex.main_screen.domain.a) this.b).a(zzsVar, list22, documentQueryBodyInteractor$buildPayloadWithPosition$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(zzs zzsVar, ContinuationImpl continuationImpl) {
        DocumentQueryBodyInteractor$createDocumentPayload$1 documentQueryBodyInteractor$createDocumentPayload$1;
        int i;
        Pair pair;
        if (continuationImpl instanceof DocumentQueryBodyInteractor$createDocumentPayload$1) {
            documentQueryBodyInteractor$createDocumentPayload$1 = (DocumentQueryBodyInteractor$createDocumentPayload$1) continuationImpl;
            int i2 = documentQueryBodyInteractor$createDocumentPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentQueryBodyInteractor$createDocumentPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = documentQueryBodyInteractor$createDocumentPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentQueryBodyInteractor$createDocumentPayload$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (zzsVar == null) {
                        pair = new Pair(kotlin.collections.b.f(), null);
                        Map map = (Map) pair.getFirst();
                        List list = (List) pair.getSecond();
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.putAll(map);
                        Pair pair2 = new Pair("accessibility", gw00.e(new Pair("voice_over_enabled", Boolean.valueOf(tje.L(this.a)))));
                        mapBuilder.put(pair2.c(), pair2.f());
                        bg5 bg5Var = this.d;
                        Pair pair3 = new Pair("user_power_prc", Integer.valueOf(bg5Var.b()));
                        mapBuilder.put(pair3.c(), pair3.f());
                        Pair pair4 = new Pair("user_plugged_state", bg5Var.c().getTitle());
                        mapBuilder.put(pair4.c(), pair4.f());
                        sat satVar = this.c;
                        rfa0 f = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) satVar.b.b)).f(null);
                        PaymentInfo paymentInfo = new PaymentInfo(f.b, f.a.getCode());
                        Pair pair5 = new Pair("payment_info", ((xnt) satVar.a).f(paymentInfo, PaymentInfo.Companion.serializer()));
                        mapBuilder.put(pair5.c(), pair5.f());
                        return new Pair(mapBuilder.j(), list);
                    }
                    documentQueryBodyInteractor$createDocumentPayload$1.L$0 = null;
                    documentQueryBodyInteractor$createDocumentPayload$1.label = 1;
                    obj = a(zzsVar, documentQueryBodyInteractor$createDocumentPayload$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                pair = (Pair) obj;
                Map map2 = (Map) pair.getFirst();
                List list2 = (List) pair.getSecond();
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.putAll(map2);
                Pair pair22 = new Pair("accessibility", gw00.e(new Pair("voice_over_enabled", Boolean.valueOf(tje.L(this.a)))));
                mapBuilder2.put(pair22.c(), pair22.f());
                bg5 bg5Var2 = this.d;
                Pair pair32 = new Pair("user_power_prc", Integer.valueOf(bg5Var2.b()));
                mapBuilder2.put(pair32.c(), pair32.f());
                Pair pair42 = new Pair("user_plugged_state", bg5Var2.c().getTitle());
                mapBuilder2.put(pair42.c(), pair42.f());
                sat satVar2 = this.c;
                rfa0 f2 = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) satVar2.b.b)).f(null);
                PaymentInfo paymentInfo2 = new PaymentInfo(f2.b, f2.a.getCode());
                Pair pair52 = new Pair("payment_info", ((xnt) satVar2.a).f(paymentInfo2, PaymentInfo.Companion.serializer()));
                mapBuilder2.put(pair52.c(), pair52.f());
                return new Pair(mapBuilder2.j(), list2);
            }
        }
        documentQueryBodyInteractor$createDocumentPayload$1 = new DocumentQueryBodyInteractor$createDocumentPayload$1(this, continuationImpl);
        Object obj2 = documentQueryBodyInteractor$createDocumentPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentQueryBodyInteractor$createDocumentPayload$1.label;
        if (i != 0) {
        }
        pair = (Pair) obj2;
        Map map22 = (Map) pair.getFirst();
        List list22 = (List) pair.getSecond();
        MapBuilder mapBuilder22 = new MapBuilder();
        mapBuilder22.putAll(map22);
        Pair pair222 = new Pair("accessibility", gw00.e(new Pair("voice_over_enabled", Boolean.valueOf(tje.L(this.a)))));
        mapBuilder22.put(pair222.c(), pair222.f());
        bg5 bg5Var22 = this.d;
        Pair pair322 = new Pair("user_power_prc", Integer.valueOf(bg5Var22.b()));
        mapBuilder22.put(pair322.c(), pair322.f());
        Pair pair422 = new Pair("user_plugged_state", bg5Var22.c().getTitle());
        mapBuilder22.put(pair422.c(), pair422.f());
        sat satVar22 = this.c;
        rfa0 f22 = ((com.yandex.go.payments.paymentlist.data.c) ((cda0) satVar22.b.b)).f(null);
        PaymentInfo paymentInfo22 = new PaymentInfo(f22.b, f22.a.getCode());
        Pair pair522 = new Pair("payment_info", ((xnt) satVar22.a).f(paymentInfo22, PaymentInfo.Companion.serializer()));
        mapBuilder22.put(pair522.c(), pair522.f());
        return new Pair(mapBuilder22.j(), list22);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(zzs zzsVar, List list, boolean z, ContinuationImpl continuationImpl) {
        DocumentQueryBodyInteractor$createDocumentQueryBody$1 documentQueryBodyInteractor$createDocumentQueryBody$1;
        int i;
        if (continuationImpl instanceof DocumentQueryBodyInteractor$createDocumentQueryBody$1) {
            documentQueryBodyInteractor$createDocumentQueryBody$1 = (DocumentQueryBodyInteractor$createDocumentQueryBody$1) continuationImpl;
            int i2 = documentQueryBodyInteractor$createDocumentQueryBody$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentQueryBodyInteractor$createDocumentQueryBody$1.label = i2 - Integer.MIN_VALUE;
                Object obj = documentQueryBodyInteractor$createDocumentQueryBody$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentQueryBodyInteractor$createDocumentQueryBody$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        MapBuilder mapBuilder = new MapBuilder();
                        mapBuilder.putAll(kotlin.collections.b.i(new Pair("trigger-reasons", list), new Pair("client_request_id", UUID.randomUUID().toString())));
                        if (zzsVar != null) {
                            Pair pair = new Pair("position", scc.g(Double.valueOf(zzsVar.b), Double.valueOf(zzsVar.a)));
                            mapBuilder.put(pair.c(), pair.f());
                        }
                        return new Pair(mapBuilder.j(), null);
                    }
                    documentQueryBodyInteractor$createDocumentQueryBody$1.L$0 = null;
                    documentQueryBodyInteractor$createDocumentQueryBody$1.L$1 = list;
                    documentQueryBodyInteractor$createDocumentQueryBody$1.Z$0 = z;
                    documentQueryBodyInteractor$createDocumentQueryBody$1.label = 1;
                    obj = b(zzsVar, documentQueryBodyInteractor$createDocumentQueryBody$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) documentQueryBodyInteractor$createDocumentQueryBody$1.L$1;
                    kotlin.b.b(obj);
                }
                Pair pair2 = (Pair) obj;
                Map map = (Map) pair2.getFirst();
                List list2 = (List) pair2.getSecond();
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.putAll(map);
                mapBuilder2.putAll(kotlin.collections.b.i(new Pair("trigger-reasons", list), new Pair("client_request_id", UUID.randomUUID().toString())));
                return new Pair(mapBuilder2.j(), list2);
            }
        }
        documentQueryBodyInteractor$createDocumentQueryBody$1 = new DocumentQueryBodyInteractor$createDocumentQueryBody$1(this, continuationImpl);
        Object obj2 = documentQueryBodyInteractor$createDocumentQueryBody$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentQueryBodyInteractor$createDocumentQueryBody$1.label;
        if (i != 0) {
        }
        Pair pair22 = (Pair) obj2;
        Map map2 = (Map) pair22.getFirst();
        List list22 = (List) pair22.getSecond();
        MapBuilder mapBuilder22 = new MapBuilder();
        mapBuilder22.putAll(map2);
        mapBuilder22.putAll(kotlin.collections.b.i(new Pair("trigger-reasons", list), new Pair("client_request_id", UUID.randomUUID().toString())));
        return new Pair(mapBuilder22.j(), list22);
    }
}
