package com.yandex.go.inapp_calls.push_handler;

import android.content.Context;
import com.yandex.go.inapp_calls.analytics.InAppCallsAnalytics$ErrorType;
import com.yandex.go.inapp_calls.repository.InAppCallsFeatureWrapper$State;
import com.yandex.go.inapp_calls.repository.c;
import com.yandex.go.proxyprovision.j;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.clv;
import defpackage.dlv;
import defpackage.elv;
import defpackage.g6u;
import defpackage.h3y;
import defpackage.jl40;
import defpackage.ky2;
import defpackage.lyx0;
import defpackage.njv;
import defpackage.npv;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.p2y0;
import defpackage.pd51;
import defpackage.pjv;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.upv;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xww0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a implements xww0 {
    public final h3y a;
    public final com.yandex.go.inapp_calls.interactor.a b;
    public final ky2 c;
    public final tt2 d;
    public final njv e;
    public final h3y f;
    public final j g;
    public final p2y0 h;
    public final com.yandex.go.taxi.order.domain.a i;
    public final Context j;

    public a(h3y h3yVar, com.yandex.go.inapp_calls.interactor.a aVar, ky2 ky2Var, tt2 tt2Var, njv njvVar, h3y h3yVar2, j jVar, p2y0 p2y0Var, com.yandex.go.taxi.order.domain.a aVar2, Context context) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = ky2Var;
        this.d = tt2Var;
        this.e = njvVar;
        this.f = h3yVar2;
        this.g = jVar;
        this.h = p2y0Var;
        this.i = aVar2;
        this.j = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        if (r13 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014e, code lost:
    
        if (r13 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r13 == r0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0095, code lost:
    
        if (r13 == r0) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        IncomingCallPushHandler$handle$1 incomingCallPushHandler$handle$1;
        Object obj;
        int i;
        if (continuationImpl instanceof IncomingCallPushHandler$handle$1) {
            incomingCallPushHandler$handle$1 = (IncomingCallPushHandler$handle$1) continuationImpl;
            int i2 = incomingCallPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                incomingCallPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                IncomingCallPushHandler$handle$1 incomingCallPushHandler$handle$12 = incomingCallPushHandler$handle$1;
                obj = incomingCallPushHandler$handle$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = incomingCallPushHandler$handle$12.label;
                njv njvVar = this.e;
                if (i != 0) {
                    b.b(obj);
                    if (!jl40.l(map.get("type"), "incoming_call")) {
                        return Boolean.FALSE;
                    }
                    npv npvVar = njvVar.c;
                    npvVar.getClass();
                    npvVar.a.a("InAppCalls.IncomingCall.PushReceived", new HashMap(), 1, new HashMap());
                    incomingCallPushHandler$handle$12.L$0 = map;
                    incomingCallPushHandler$handle$12.label = 1;
                    obj = this.g.a(incomingCallPushHandler$handle$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                b.b(obj);
                                return Boolean.TRUE;
                            }
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return Boolean.TRUE;
                        }
                        map = (Map) incomingCallPushHandler$handle$12.L$0;
                        b.b(obj);
                        int i3 = upv.a[((InAppCallsFeatureWrapper$State) obj).ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            incomingCallPushHandler$handle$12.L$0 = null;
                            incomingCallPushHandler$handle$12.L$1 = null;
                            incomingCallPushHandler$handle$12.label = 3;
                            String str = (String) map.get(Constants.KEY_DATA);
                            JSONObject optJSONObject = str != null ? new JSONObject(str).optJSONObject("extra_info") : null;
                            obj = ((com.yandex.go.inapp_calls.interactor.b) this.f.get()).a((String) map.get("id"), optJSONObject != null ? optJSONObject.optString("call_guid") : null, optJSONObject != null ? optJSONObject.optString("call_platform_id") : null, optJSONObject != null ? optJSONObject.optString("linkage_id") : null, incomingCallPushHandler$handle$12);
                        } else {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        w511.b();
                                        return null;
                                    }
                                    InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType = InAppCallsAnalytics$ErrorType.INCOMING_NOT_LOADED_ERROR;
                                    njvVar.getClass();
                                    njv.h(inAppCallsAnalytics$ErrorType);
                                }
                                return Boolean.TRUE;
                            }
                            incomingCallPushHandler$handle$12.L$0 = null;
                            incomingCallPushHandler$handle$12.L$1 = null;
                            incomingCallPushHandler$handle$12.label = 4;
                            obj = c(map, incomingCallPushHandler$handle$12);
                        }
                        return obj2;
                    }
                    map = (Map) incomingCallPushHandler$handle$12.L$0;
                    b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    InAppCallsAnalytics$ErrorType inAppCallsAnalytics$ErrorType2 = InAppCallsAnalytics$ErrorType.INCOMING_NOT_LOADED_ERROR;
                    njvVar.getClass();
                    njv.h(inAppCallsAnalytics$ErrorType2);
                    return Boolean.FALSE;
                }
                g c = ((c) this.a.get()).c();
                IncomingCallPushHandler$handle$featureState$1 incomingCallPushHandler$handle$featureState$1 = new IncomingCallPushHandler$handle$featureState$1(2, null);
                incomingCallPushHandler$handle$12.L$0 = map;
                incomingCallPushHandler$handle$12.label = 2;
                obj = e.x(c, incomingCallPushHandler$handle$featureState$1, incomingCallPushHandler$handle$12);
            }
        }
        incomingCallPushHandler$handle$1 = new IncomingCallPushHandler$handle$1(this, continuationImpl);
        IncomingCallPushHandler$handle$1 incomingCallPushHandler$handle$122 = incomingCallPushHandler$handle$1;
        obj = incomingCallPushHandler$handle$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = incomingCallPushHandler$handle$122.label;
        njv njvVar2 = this.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (defpackage.pd51.a(10021, r13) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a7, code lost:
    
        if (r1 == r4) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Map map, ContinuationImpl continuationImpl) {
        IncomingCallPushHandler$handleIncomingCallPush$1 incomingCallPushHandler$handleIncomingCallPush$1;
        int i;
        Map map2;
        elv elvVar;
        int i2;
        elv elvVar2;
        Map map3;
        int i3;
        JSONObject optJSONObject;
        Map map4;
        elv elvVar3;
        lyx0 lyx0Var;
        TaxiOrder b;
        Map map5;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof IncomingCallPushHandler$handleIncomingCallPush$1) {
            incomingCallPushHandler$handleIncomingCallPush$1 = (IncomingCallPushHandler$handleIncomingCallPush$1) continuationImpl;
            int i4 = incomingCallPushHandler$handleIncomingCallPush$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                incomingCallPushHandler$handleIncomingCallPush$1.label = i4 - Integer.MIN_VALUE;
                Object obj = incomingCallPushHandler$handleIncomingCallPush$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = incomingCallPushHandler$handleIncomingCallPush$1.label;
                if (i != 0) {
                    b.b(obj);
                    com.yandex.go.inapp_calls.interactor.a aVar = this.b;
                    map2 = map;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$0 = map2;
                    incomingCallPushHandler$handleIncomingCallPush$1.label = 1;
                    obj = aVar.a(kotlin.collections.b.f(), incomingCallPushHandler$handleIncomingCallPush$1);
                } else if (i == 1) {
                    map2 = (Map) incomingCallPushHandler$handleIncomingCallPush$1.L$0;
                    b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return zy11Var;
                        }
                        i3 = incomingCallPushHandler$handleIncomingCallPush$1.I$0;
                        elvVar3 = (elv) incomingCallPushHandler$handleIncomingCallPush$1.L$1;
                        map5 = (Map) incomingCallPushHandler$handleIncomingCallPush$1.L$0;
                        b.b(obj);
                        lyx0Var = (lyx0) obj;
                        map4 = map5;
                        pjv pjvVar = new pjv(map4, ((dlv) elvVar3).a, i3 != 0, lyx0Var != null ? lyx0Var.a : null, lyx0Var != null ? lyx0Var.b : null, lyx0Var != null ? lyx0Var.c : null, lyx0Var != null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
                        this.d.getClass();
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        IncomingCallPushHandler$handleIncomingCallPush$2 incomingCallPushHandler$handleIncomingCallPush$2 = new IncomingCallPushHandler$handleIncomingCallPush$2(this, pjvVar, null);
                        incomingCallPushHandler$handleIncomingCallPush$1.L$0 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$1 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$5 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                        incomingCallPushHandler$handleIncomingCallPush$1.label = 4;
                        return tje.k0(g6uVar, incomingCallPushHandler$handleIncomingCallPush$2, incomingCallPushHandler$handleIncomingCallPush$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    i3 = incomingCallPushHandler$handleIncomingCallPush$1.I$0;
                    elvVar2 = (elv) incomingCallPushHandler$handleIncomingCallPush$1.L$1;
                    map3 = (Map) incomingCallPushHandler$handleIncomingCallPush$1.L$0;
                    b.b(obj);
                    o2y0 o2y0Var = (o2y0) obj;
                    b = o2y0Var == null ? o2y0Var.b() : null;
                    if (b == null) {
                        com.yandex.go.taxi.order.domain.a aVar2 = this.i;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$0 = map3;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$1 = elvVar2;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                        incomingCallPushHandler$handleIncomingCallPush$1.label = 3;
                        obj = aVar2.b(b, incomingCallPushHandler$handleIncomingCallPush$1);
                        if (obj != coroutineSingletons) {
                            elvVar3 = elvVar2;
                            map5 = map3;
                            lyx0Var = (lyx0) obj;
                            map4 = map5;
                            pjv pjvVar2 = new pjv(map4, ((dlv) elvVar3).a, i3 != 0, lyx0Var != null ? lyx0Var.a : null, lyx0Var != null ? lyx0Var.b : null, lyx0Var != null ? lyx0Var.c : null, lyx0Var != null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
                            this.d.getClass();
                            sjh sjhVar2 = uyj.a;
                            g6u g6uVar2 = o400.a;
                            IncomingCallPushHandler$handleIncomingCallPush$2 incomingCallPushHandler$handleIncomingCallPush$22 = new IncomingCallPushHandler$handleIncomingCallPush$2(this, pjvVar2, null);
                            incomingCallPushHandler$handleIncomingCallPush$1.L$0 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$1 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$5 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                            incomingCallPushHandler$handleIncomingCallPush$1.label = 4;
                            if (tje.k0(g6uVar2, incomingCallPushHandler$handleIncomingCallPush$22, incomingCallPushHandler$handleIncomingCallPush$1) == coroutineSingletons) {
                            }
                        }
                    }
                    i2 = i3;
                    elvVar = elvVar2;
                    map2 = map3;
                    int i5 = i2;
                    map4 = map2;
                    i3 = i5;
                    elvVar3 = elvVar;
                    lyx0Var = null;
                    pjv pjvVar22 = new pjv(map4, ((dlv) elvVar3).a, i3 != 0, lyx0Var != null ? lyx0Var.a : null, lyx0Var != null ? lyx0Var.b : null, lyx0Var != null ? lyx0Var.c : null, lyx0Var != null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
                    this.d.getClass();
                    sjh sjhVar22 = uyj.a;
                    g6u g6uVar22 = o400.a;
                    IncomingCallPushHandler$handleIncomingCallPush$2 incomingCallPushHandler$handleIncomingCallPush$222 = new IncomingCallPushHandler$handleIncomingCallPush$2(this, pjvVar22, null);
                    incomingCallPushHandler$handleIncomingCallPush$1.L$0 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$1 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$5 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                    incomingCallPushHandler$handleIncomingCallPush$1.label = 4;
                    if (tje.k0(g6uVar22, incomingCallPushHandler$handleIncomingCallPush$222, incomingCallPushHandler$handleIncomingCallPush$1) == coroutineSingletons) {
                    }
                }
                elvVar = (elv) obj;
                String str = (String) map2.get("linkage_id");
                if (!(elvVar instanceof clv) && str != null) {
                    this.e.j(str, ((clv) elvVar).a, null);
                    return zy11Var;
                }
                if (elvVar instanceof dlv) {
                    String str2 = (String) map2.get(Constants.KEY_DATA);
                    String optString = (str2 == null || (optJSONObject = new JSONObject(str2).optJSONObject("extra_info")) == null) ? null : optJSONObject.optString("external_ref_id");
                    if (!this.c.a) {
                        if (((Boolean) pd51.a.getValue()).booleanValue()) {
                            Context context = this.j;
                            if (pd51.a(10020, context)) {
                                if (pd51.a(24, context)) {
                                }
                            }
                        }
                        i2 = 0;
                        if (optString != null) {
                            p2y0 p2y0Var = this.h;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$0 = map2;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$1 = elvVar;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                            incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i2;
                            incomingCallPushHandler$handleIncomingCallPush$1.label = 2;
                            Object p = ((e0) p2y0Var).p(optString, incomingCallPushHandler$handleIncomingCallPush$1);
                            if (p != coroutineSingletons) {
                                elvVar2 = elvVar;
                                obj = p;
                                map3 = map2;
                                i3 = i2;
                                o2y0 o2y0Var2 = (o2y0) obj;
                                if (o2y0Var2 == null) {
                                }
                                if (b == null) {
                                }
                            }
                        }
                        int i52 = i2;
                        map4 = map2;
                        i3 = i52;
                        elvVar3 = elvVar;
                        lyx0Var = null;
                        pjv pjvVar222 = new pjv(map4, ((dlv) elvVar3).a, i3 != 0, lyx0Var != null ? lyx0Var.a : null, lyx0Var != null ? lyx0Var.b : null, lyx0Var != null ? lyx0Var.c : null, lyx0Var != null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
                        this.d.getClass();
                        sjh sjhVar222 = uyj.a;
                        g6u g6uVar222 = o400.a;
                        IncomingCallPushHandler$handleIncomingCallPush$2 incomingCallPushHandler$handleIncomingCallPush$2222 = new IncomingCallPushHandler$handleIncomingCallPush$2(this, pjvVar222, null);
                        incomingCallPushHandler$handleIncomingCallPush$1.L$0 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$1 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.L$5 = null;
                        incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                        incomingCallPushHandler$handleIncomingCallPush$1.label = 4;
                        if (tje.k0(g6uVar222, incomingCallPushHandler$handleIncomingCallPush$2222, incomingCallPushHandler$handleIncomingCallPush$1) == coroutineSingletons) {
                        }
                    }
                    i2 = 1;
                    if (optString != null) {
                    }
                    int i522 = i2;
                    map4 = map2;
                    i3 = i522;
                    elvVar3 = elvVar;
                    lyx0Var = null;
                    pjv pjvVar2222 = new pjv(map4, ((dlv) elvVar3).a, i3 != 0, lyx0Var != null ? lyx0Var.a : null, lyx0Var != null ? lyx0Var.b : null, lyx0Var != null ? lyx0Var.c : null, lyx0Var != null ? lyx0Var.d : null, lyx0Var != null ? lyx0Var.e : null);
                    this.d.getClass();
                    sjh sjhVar2222 = uyj.a;
                    g6u g6uVar2222 = o400.a;
                    IncomingCallPushHandler$handleIncomingCallPush$2 incomingCallPushHandler$handleIncomingCallPush$22222 = new IncomingCallPushHandler$handleIncomingCallPush$2(this, pjvVar2222, null);
                    incomingCallPushHandler$handleIncomingCallPush$1.L$0 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$1 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$2 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$3 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$4 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.L$5 = null;
                    incomingCallPushHandler$handleIncomingCallPush$1.I$0 = i3;
                    incomingCallPushHandler$handleIncomingCallPush$1.label = 4;
                    if (tje.k0(g6uVar2222, incomingCallPushHandler$handleIncomingCallPush$22222, incomingCallPushHandler$handleIncomingCallPush$1) == coroutineSingletons) {
                    }
                }
            }
        }
        incomingCallPushHandler$handleIncomingCallPush$1 = new IncomingCallPushHandler$handleIncomingCallPush$1(this, continuationImpl);
        Object obj2 = incomingCallPushHandler$handleIncomingCallPush$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = incomingCallPushHandler$handleIncomingCallPush$1.label;
        if (i != 0) {
        }
        elvVar = (elv) obj2;
        String str3 = (String) map2.get("linkage_id");
        if (!(elvVar instanceof clv)) {
        }
        if (elvVar instanceof dlv) {
        }
    }
}
