package com.yandex.go.taxi_order.ws;

import defpackage.ak41;
import defpackage.bk41;
import defpackage.bvf0;
import defpackage.ck41;
import defpackage.cne0;
import defpackage.cq91;
import defpackage.eci0;
import defpackage.ffx;
import defpackage.fk41;
import defpackage.g8e;
import defpackage.gci0;
import defpackage.ge51;
import defpackage.gk41;
import defpackage.gtq0;
import defpackage.gwk0;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.ke00;
import defpackage.mdh;
import defpackage.nq20;
import defpackage.ny61;
import defpackage.q721;
import defpackage.qcx;
import defpackage.sjh;
import defpackage.te51;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ub3;
import defpackage.uyj;
import defpackage.wnt;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.uuid.Uuid;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes8.dex */
public final class d {
    public final nq20 a;
    public final wnt b;
    public final te51 c;
    public final bk41 d;
    public final g e;
    public final ru.yandex.taxi.am.token.a f;
    public final h3y g;
    public final tse h;
    public final tt2 i;
    public final ge51 j;
    public final r0 k;
    public final gci0 l;
    public final n0 m;
    public final eci0 n;
    public volatile a o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final kotlinx.coroutines.sync.a r;

    public d(nq20 nq20Var, wnt wntVar, te51 te51Var, bk41 bk41Var, g gVar, ru.yandex.taxi.am.token.a aVar, h3y h3yVar, tse tseVar, tt2 tt2Var, ge51 ge51Var) {
        this.a = nq20Var;
        this.b = wntVar;
        this.c = te51Var;
        this.d = bk41Var;
        this.e = gVar;
        this.f = aVar;
        this.g = h3yVar;
        this.h = tseVar;
        this.i = tt2Var;
        this.j = ge51Var;
        r0 c = bvf0.c(WebSocketRepository$ConnectionState.DISCONNECTED);
        this.k = c;
        this.l = e.d(c);
        n0 b = ffx.b(0, 8, BufferOverflow.DROP_OLDEST);
        this.m = b;
        this.n = e.c(b);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = gtq0.a();
    }

    public static final ck41 a(d dVar) {
        ge51 ge51Var = dVar.j;
        String a = dVar.a.a();
        if (a != null) {
            h hVar = (h) ge51Var;
            ((cne0) hVar.b).l("client_notify_service", null);
            String l = ((cne0) hVar.b).l("xiva_service", null);
            if (l == null) {
                l = TariffOrderFlow.ORDER_FLOW_TAXI_KEY;
            }
            return new ck41(a, l);
        }
        hst hstVar = jst.e;
        hstVar.getClass();
        ke00 a2 = hstVar.b.a();
        if (a2 != null && a2.b(15)) {
            a2.a(15, "ws-taxiroute", null, "Can't create a XivaConfig. Xiva proxy is not configured.\nPlease add Xiva proxy to your flavor's MOB config 'Default (CI) configurations'", hstVar.a);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, ContinuationImpl continuationImpl) {
        WebSocketRepositoryImpl$getCredentials$1 webSocketRepositoryImpl$getCredentials$1;
        int i;
        Object d;
        Object obj;
        Uuid uuid;
        long j;
        Throwable a;
        dVar.getClass();
        if (continuationImpl instanceof WebSocketRepositoryImpl$getCredentials$1) {
            webSocketRepositoryImpl$getCredentials$1 = (WebSocketRepositoryImpl$getCredentials$1) continuationImpl;
            int i2 = webSocketRepositoryImpl$getCredentials$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketRepositoryImpl$getCredentials$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webSocketRepositoryImpl$getCredentials$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketRepositoryImpl$getCredentials$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long i3 = dVar.e.i();
                    Uuid p = gwk0.p();
                    ru.yandex.taxi.am.token.a aVar = dVar.f;
                    webSocketRepositoryImpl$getCredentials$1.L$0 = p;
                    webSocketRepositoryImpl$getCredentials$1.J$0 = i3;
                    webSocketRepositoryImpl$getCredentials$1.label = 1;
                    d = aVar.d(false, webSocketRepositoryImpl$getCredentials$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = d;
                    uuid = p;
                    j = i3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = webSocketRepositoryImpl$getCredentials$1.J$0;
                    uuid = (Uuid) webSocketRepositoryImpl$getCredentials$1.L$0;
                    kotlin.b.b(obj2);
                    obj = ((Result) obj2).getValue();
                }
                a = Result.a(obj);
                if (a != null) {
                    return new ak41(j, uuid.a(), (String) obj);
                }
                jst.e.h("ws-taxiroute", "WebSocketRepository::getCredentials token retrieval failed", a);
                return null;
            }
        }
        webSocketRepositoryImpl$getCredentials$1 = new WebSocketRepositoryImpl$getCredentials$1(dVar, continuationImpl);
        Object obj22 = webSocketRepositoryImpl$getCredentials$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketRepositoryImpl$getCredentials$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
    
        if (r10 == r2) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, WebSocketMessageDto webSocketMessageDto, ContinuationImpl continuationImpl) {
        WebSocketRepositoryImpl$resolveMessage$1 webSocketRepositoryImpl$resolveMessage$1;
        int i;
        String str;
        kotlinx.serialization.json.b bVar;
        fk41 fk41Var;
        h3y h3yVar = dVar.g;
        if (continuationImpl instanceof WebSocketRepositoryImpl$resolveMessage$1) {
            webSocketRepositoryImpl$resolveMessage$1 = (WebSocketRepositoryImpl$resolveMessage$1) continuationImpl;
            int i2 = webSocketRepositoryImpl$resolveMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webSocketRepositoryImpl$resolveMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = webSocketRepositoryImpl$resolveMessage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webSocketRepositoryImpl$resolveMessage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.serialization.json.c i3 = webSocketMessageDto.getI();
                    String a = (i3 == null || (bVar = (kotlinx.serialization.json.b) i3.get(DatabaseHelper.OttTrackingTable.COLUMN_EVENT)) == null) ? null : qcx.n(bVar).a();
                    gk41 gk41Var = (gk41) ((Map) h3yVar.get()).get(a);
                    if (gk41Var != null) {
                        webSocketRepositoryImpl$resolveMessage$1.L$0 = null;
                        webSocketRepositoryImpl$resolveMessage$1.L$1 = a;
                        webSocketRepositoryImpl$resolveMessage$1.L$2 = null;
                        webSocketRepositoryImpl$resolveMessage$1.label = 1;
                        Object a2 = ((q721) gk41Var).a(webSocketMessageDto);
                        if (a2 != coroutineSingletons) {
                            String str2 = a;
                            obj = a2;
                            str = str2;
                            fk41Var = (fk41) obj;
                            if (fk41Var == null) {
                            }
                            return fk41Var;
                        }
                    } else {
                        gk41 gk41Var2 = (gk41) ((Map) h3yVar.get()).get(webSocketMessageDto.getE());
                        if (gk41Var2 == null) {
                            hst hstVar = jst.e;
                            return null;
                        }
                        webSocketRepositoryImpl$resolveMessage$1.L$0 = webSocketMessageDto;
                        webSocketRepositoryImpl$resolveMessage$1.L$1 = null;
                        webSocketRepositoryImpl$resolveMessage$1.L$2 = null;
                        webSocketRepositoryImpl$resolveMessage$1.L$3 = null;
                        webSocketRepositoryImpl$resolveMessage$1.label = 2;
                        obj = ((q721) gk41Var2).a(webSocketMessageDto);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    str = (String) webSocketRepositoryImpl$resolveMessage$1.L$1;
                    kotlin.b.b(obj);
                    fk41Var = (fk41) obj;
                    if (fk41Var == null) {
                        hst hstVar2 = jst.e;
                        ke00 a3 = hstVar2.b.a();
                        if (a3 != null && a3.b(15)) {
                            a3.a(15, "ws-taxiroute", null, g8e.o("WebSocketRepository::resolveMessage, handler returned null for event=", str), hstVar2.a);
                        }
                    }
                    return fk41Var;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                webSocketMessageDto = (WebSocketMessageDto) webSocketRepositoryImpl$resolveMessage$1.L$0;
                kotlin.b.b(obj);
                fk41 fk41Var2 = (fk41) obj;
                if (fk41Var2 != null) {
                    te51 te51Var = dVar.c;
                    String a4 = webSocketMessageDto.getA();
                    if (a4 == null) {
                        a4 = "";
                    }
                    String e = webSocketMessageDto.getE();
                    String str3 = e != null ? e : "";
                    te51Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("push_id", a4);
                    hashMap.put("push_type", str3);
                    te51Var.a.a("XivaWs.Push.Received", hashMap, 1, new HashMap());
                }
                return fk41Var2;
            }
        }
        webSocketRepositoryImpl$resolveMessage$1 = new WebSocketRepositoryImpl$resolveMessage$1(dVar, continuationImpl);
        Object obj2 = webSocketRepositoryImpl$resolveMessage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webSocketRepositoryImpl$resolveMessage$1.label;
        if (i != 0) {
        }
    }

    public final void d() {
        this.i.getClass();
        sjh sjhVar = uyj.a;
        tje.N(this.h, mdh.b, null, new WebSocketRepositoryImpl$connectInternal$1(this, null), 2);
    }

    public final void e() {
        int i;
        int i2;
        AtomicInteger atomicInteger = this.p;
        do {
            i = atomicInteger.get();
            i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        if (i2 > 0) {
            hst hstVar = jst.e;
            return;
        }
        if (this.o == null) {
            return;
        }
        hst hstVar2 = jst.e;
        a aVar = this.o;
        if (aVar != null) {
            aVar.i();
        }
    }

    public final void f(WebSocketClient$CloseReason webSocketClient$CloseReason) {
        hst hstVar = jst.e;
        this.o = null;
        te51 te51Var = this.c;
        XivaWsAnalytics$ConnectionCloseReason c = cq91.c(webSocketClient$CloseReason);
        te51Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, c.getEventValue());
        te51Var.a.a("XivaWs.Connection.Closed", hashMap, 1, new HashMap());
        this.k.l(WebSocketRepository$ConnectionState.DISCONNECTED);
        if (this.p.get() <= 0 || webSocketClient$CloseReason == WebSocketClient$CloseReason.UNAUTHORIZED || webSocketClient$CloseReason == WebSocketClient$CloseReason.BAD_REQUEST) {
            return;
        }
        tje.N(this.h, null, null, new WebSocketRepositoryImpl$scheduleReconnect$2(Math.min(((long) Math.pow(2.0d, ub3.a(this.q) - 1)) * 1000, 64000L), this, null), 3);
    }

    public final void g() {
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState = (WebSocketRepository$ConnectionState) this.l.a.getValue();
        WebSocketRepository$ConnectionState webSocketRepository$ConnectionState2 = WebSocketRepository$ConnectionState.CONNECTED;
        if (webSocketRepository$ConnectionState != webSocketRepository$ConnectionState2) {
            hst hstVar = jst.e;
            this.q.set(0);
            te51 te51Var = this.c;
            te51Var.getClass();
            te51Var.a.a("XivaWs.Connection.Connected", new HashMap(), 1, new HashMap());
            this.k.l(webSocketRepository$ConnectionState2);
        }
    }
}
