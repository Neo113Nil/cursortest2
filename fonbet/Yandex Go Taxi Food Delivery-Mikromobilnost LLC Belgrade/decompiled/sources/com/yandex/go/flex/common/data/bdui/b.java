package com.yandex.go.flex.common.data.bdui;

import android.os.SystemClock;
import com.yandex.go.network_metrics.Status;
import core.network.mapi.exception.IssueType;
import core.network.mapi.exception.MapiClientException;
import defpackage.alr;
import defpackage.b64;
import defpackage.bai0;
import defpackage.ens0;
import defpackage.er20;
import defpackage.fse;
import defpackage.gmr;
import defpackage.gw00;
import defpackage.hhr;
import defpackage.ivj0;
import defpackage.jl40;
import defpackage.jmr;
import defpackage.jwu;
import defpackage.ku00;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.lu00;
import defpackage.meu;
import defpackage.nmt;
import defpackage.nn2;
import defpackage.ny61;
import defpackage.on2;
import defpackage.oyr;
import defpackage.pmt;
import defpackage.qje;
import defpackage.qmt;
import defpackage.qoi0;
import defpackage.ru00;
import defpackage.s76;
import defpackage.su00;
import defpackage.tje;
import defpackage.uu00;
import defpackage.uza;
import defpackage.vu00;
import defpackage.w2j0;
import defpackage.w511;
import defpackage.wg10;
import defpackage.wwg;
import defpackage.xu00;
import defpackage.yf7;
import defpackage.yu00;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class b implements lu00 {
    public final su00 a;
    public final ru00 b;
    public final hhr c;
    public final gmr d;
    public final alr e;
    public final List f;

    public b(su00 su00Var, ru00 ru00Var, hhr hhrVar, gmr gmrVar, alr alrVar, List list) {
        this.a = su00Var;
        this.b = ru00Var;
        this.c = hhrVar;
        this.d = gmrVar;
        this.e = alrVar;
        this.f = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, ContinuationImpl continuationImpl) {
        GoBDUIClient$buildHeaders$1 goBDUIClient$buildHeaders$1;
        int i;
        Map map;
        Map map2;
        if (continuationImpl instanceof GoBDUIClient$buildHeaders$1) {
            goBDUIClient$buildHeaders$1 = (GoBDUIClient$buildHeaders$1) continuationImpl;
            int i2 = goBDUIClient$buildHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goBDUIClient$buildHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goBDUIClient$buildHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goBDUIClient$buildHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MapBuilder mapBuilder = new MapBuilder();
                    goBDUIClient$buildHeaders$1.L$0 = str;
                    goBDUIClient$buildHeaders$1.L$1 = mapBuilder;
                    goBDUIClient$buildHeaders$1.L$2 = mapBuilder;
                    goBDUIClient$buildHeaders$1.L$3 = mapBuilder;
                    goBDUIClient$buildHeaders$1.label = 1;
                    Object headers = this.b.getHeaders(goBDUIClient$buildHeaders$1);
                    if (headers == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = mapBuilder;
                    obj = headers;
                    map2 = map;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map2 = (Map) goBDUIClient$buildHeaders$1.L$3;
                    map = (Map) goBDUIClient$buildHeaders$1.L$1;
                    kotlin.b.b(obj);
                }
                map2.putAll((Map) obj);
                this.d.getClass();
                return ((MapBuilder) map).j();
            }
        }
        goBDUIClient$buildHeaders$1 = new GoBDUIClient$buildHeaders$1(this, continuationImpl);
        Object obj2 = goBDUIClient$buildHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goBDUIClient$buildHeaders$1.label;
        if (i != 0) {
        }
        map2.putAll((Map) obj2);
        this.d.getClass();
        return ((MapBuilder) map).j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x006e, code lost:
    
        if (r11 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd A[LOOP:0: B:14:0x00f7->B:16:0x00fd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126 A[LOOP:1: B:19:0x0120->B:21:0x0126, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vu00 vu00Var, ContinuationImpl continuationImpl) {
        GoBDUIClient$buildRequest$1 goBDUIClient$buildRequest$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Serializable a;
        vu00 vu00Var2;
        kwu kwuVar;
        if (continuationImpl instanceof GoBDUIClient$buildRequest$1) {
            goBDUIClient$buildRequest$1 = (GoBDUIClient$buildRequest$1) continuationImpl;
            int i2 = goBDUIClient$buildRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goBDUIClient$buildRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = goBDUIClient$buildRequest$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goBDUIClient$buildRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.getClass();
                    goBDUIClient$buildRequest$1.L$0 = vu00Var;
                    goBDUIClient$buildRequest$1.L$1 = null;
                    goBDUIClient$buildRequest$1.label = 1;
                    obj = this.a.getHost(goBDUIClient$buildRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (b) goBDUIClient$buildRequest$1.L$4;
                        kwuVar = (kwu) goBDUIClient$buildRequest$1.L$3;
                        if (goBDUIClient$buildRequest$1.L$1 != null) {
                            ny61.u();
                            return null;
                        }
                        vu00Var2 = (vu00) goBDUIClient$buildRequest$1.L$0;
                        kotlin.b.b(obj);
                        this.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        for (Map.Entry entry2 : ((uu00) vu00Var2).b.entrySet()) {
                            linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
                        }
                        meu y = wwg.y(linkedHashMap);
                        if (vu00Var2 instanceof uu00) {
                            w511.b();
                            return null;
                        }
                        Regex regex = wg10.e;
                        return new pmt(kwuVar, y, qje.o("application/json;charset=UTF-8"), ((uu00) vu00Var2).d);
                    }
                    if (goBDUIClient$buildRequest$1.L$1 != null) {
                        ny61.u();
                        return null;
                    }
                    vu00Var = (vu00) goBDUIClient$buildRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                jwu jwuVar = new jwu();
                jwuVar.i(null, (String) obj);
                jwu g = jwuVar.e().g();
                g.c(((uu00) vu00Var).a, false);
                for (Map.Entry entry3 : ((uu00) vu00Var).c.entrySet()) {
                    String str = (String) entry3.getKey();
                    Iterator it = ((List) entry3.getValue()).iterator();
                    while (it.hasNext()) {
                        g.d(str, (String) it.next());
                    }
                }
                kwu e = g.e();
                String str2 = ((uu00) vu00Var).a;
                goBDUIClient$buildRequest$1.L$0 = vu00Var;
                goBDUIClient$buildRequest$1.L$1 = null;
                goBDUIClient$buildRequest$1.L$2 = null;
                goBDUIClient$buildRequest$1.L$3 = e;
                goBDUIClient$buildRequest$1.L$4 = this;
                goBDUIClient$buildRequest$1.label = 2;
                a = a(str2, goBDUIClient$buildRequest$1);
                if (a != coroutineSingletons) {
                    vu00Var2 = vu00Var;
                    kwuVar = e;
                    obj = a;
                    this.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    while (r11.hasNext()) {
                    }
                    while (r11.hasNext()) {
                    }
                    meu y2 = wwg.y(linkedHashMap2);
                    if (vu00Var2 instanceof uu00) {
                    }
                }
                return coroutineSingletons;
            }
        }
        goBDUIClient$buildRequest$1 = new GoBDUIClient$buildRequest$1(this, continuationImpl);
        Object obj2 = goBDUIClient$buildRequest$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goBDUIClient$buildRequest$1.label;
        if (i != 0) {
        }
        jwu jwuVar2 = new jwu();
        jwuVar2.i(null, (String) obj2);
        jwu g2 = jwuVar2.e().g();
        g2.c(((uu00) vu00Var).a, false);
        while (r2.hasNext()) {
        }
        kwu e2 = g2.e();
        String str22 = ((uu00) vu00Var).a;
        goBDUIClient$buildRequest$1.L$0 = vu00Var;
        goBDUIClient$buildRequest$1.L$1 = null;
        goBDUIClient$buildRequest$1.L$2 = null;
        goBDUIClient$buildRequest$1.L$3 = e2;
        goBDUIClient$buildRequest$1.L$4 = this;
        goBDUIClient$buildRequest$1.label = 2;
        a = a(str22, goBDUIClient$buildRequest$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(nmt nmtVar, qmt qmtVar, ku00 ku00Var, ContinuationImpl continuationImpl) {
        GoBDUIClient$executeRequest$2 goBDUIClient$executeRequest$2;
        int i;
        try {
            if (continuationImpl instanceof GoBDUIClient$executeRequest$2) {
                goBDUIClient$executeRequest$2 = (GoBDUIClient$executeRequest$2) continuationImpl;
                int i2 = goBDUIClient$executeRequest$2.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    goBDUIClient$executeRequest$2.label = i2 - Integer.MIN_VALUE;
                    Object obj = goBDUIClient$executeRequest$2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = goBDUIClient$executeRequest$2.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        fse fseVar = jl40.l(jmr.a.get(), Boolean.TRUE) ? ens0.a : EmptyCoroutineContext.a;
                        GoBDUIClient$executeRequest$3 goBDUIClient$executeRequest$3 = new GoBDUIClient$executeRequest$3(this, qmtVar, ku00Var, null);
                        goBDUIClient$executeRequest$2.L$0 = nmtVar;
                        goBDUIClient$executeRequest$2.L$1 = qmtVar;
                        goBDUIClient$executeRequest$2.L$2 = null;
                        goBDUIClient$executeRequest$2.L$3 = null;
                        goBDUIClient$executeRequest$2.label = 1;
                        obj = tje.k0(fseVar, goBDUIClient$executeRequest$3, goBDUIClient$executeRequest$2);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qmtVar = (qmt) goBDUIClient$executeRequest$2.L$1;
                        nmtVar = (nmt) goBDUIClient$executeRequest$2.L$0;
                        kotlin.b.b(obj);
                    }
                    return (ivj0) obj;
                }
            }
            if (i != 0) {
            }
            return (ivj0) obj;
        } catch (Throwable th) {
            Long l = nmtVar.f;
            if (l != null) {
                ((ConcurrentHashMap) this.c.b.b).remove(Long.valueOf(l.longValue()));
            }
            throw new MapiClientException(b64.l("Failed to execute ", qoi0.a(qmtVar.getClass()).c(), " for ", oyr.p("MapiRequest(urlPath=\"", ((uu00) nmtVar.a).a, "\")")), th, nmtVar.a(), IssueType.COMMUNICATION);
        }
        goBDUIClient$executeRequest$2 = new GoBDUIClient$executeRequest$2(this, continuationImpl);
        Object obj2 = goBDUIClient$executeRequest$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goBDUIClient$executeRequest$2.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f6 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:13:0x00f0, B:15:0x00f6, B:16:0x0110, B:17:0x0127, B:19:0x012d, B:21:0x0152, B:32:0x0100), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012d A[Catch: all -> 0x00fd, LOOP:0: B:17:0x0127->B:19:0x012d, LOOP_END, TryCatch #2 {all -> 0x00fd, blocks: (B:13:0x00f0, B:15:0x00f6, B:16:0x0110, B:17:0x0127, B:19:0x012d, B:21:0x0152, B:32:0x0100), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100 A[Catch: all -> 0x00fd, TryCatch #2 {all -> 0x00fd, blocks: (B:13:0x00f0, B:15:0x00f6, B:16:0x0110, B:17:0x0127, B:19:0x012d, B:21:0x0152, B:32:0x0100), top: B:12:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.lu00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation continuation) {
        GoBDUIClient$executeRequest$1 goBDUIClient$executeRequest$1;
        Object obj;
        Object obj2;
        int i;
        nmt nmtVar;
        yu00 yu00Var2;
        ku00 ku00Var2;
        yu00 yu00Var3;
        long j;
        hhr hhrVar;
        long currentTimeMillis;
        Long l;
        nn2 nn2Var;
        if (continuation instanceof GoBDUIClient$executeRequest$1) {
            goBDUIClient$executeRequest$1 = (GoBDUIClient$executeRequest$1) continuation;
            int i2 = goBDUIClient$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                goBDUIClient$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                obj = goBDUIClient$executeRequest$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goBDUIClient$executeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nmt nmtVar2 = new nmt(vu00Var);
                    try {
                        goBDUIClient$executeRequest$1.L$0 = null;
                        yu00Var2 = yu00Var;
                        goBDUIClient$executeRequest$1.L$1 = yu00Var2;
                        ku00Var2 = ku00Var;
                        goBDUIClient$executeRequest$1.L$2 = ku00Var2;
                        goBDUIClient$executeRequest$1.L$3 = nmtVar2;
                        goBDUIClient$executeRequest$1.label = 1;
                        Object b = b(vu00Var, goBDUIClient$executeRequest$1);
                        if (b != obj2) {
                            obj = b;
                            nmtVar = nmtVar2;
                        }
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        nmtVar = nmtVar2;
                        throw new MapiClientException("Failed to get data for request.", th, nmtVar.a(), IssueType.COMMUNICATION);
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nmtVar = (nmt) goBDUIClient$executeRequest$1.L$3;
                    yu00Var3 = (yu00) goBDUIClient$executeRequest$1.L$1;
                    kotlin.b.b(obj);
                    ivj0 ivj0Var = (ivj0) obj;
                    nmtVar.c = Integer.valueOf(ivj0Var.c);
                    nmtVar.d = ivj0Var.d;
                    meu meuVar = ivj0Var.b;
                    nmtVar.e = meuVar.a("X-YaRequestId");
                    j = ivj0Var.f;
                    nmtVar.f = Long.valueOf(j);
                    long j2 = ivj0Var.g;
                    nmtVar.g = Long.valueOf(j2);
                    nmtVar.h = Long.valueOf(j2 - j);
                    hhrVar = this.c;
                    currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    TreeMap e = meuVar.e();
                    try {
                        s76 s76Var = ivj0Var.e;
                        InputStream c = !(s76Var instanceof bai0) ? ((bai0) s76Var).c() : new ByteArrayInputStream(s76Var.toString().getBytes(uza.a));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(e.size()));
                        for (Object obj3 : e.entrySet()) {
                            linkedHashMap.put(((Map.Entry) obj3).getKey(), kotlin.collections.a.X((Iterable) ((Map.Entry) obj3).getValue(), null, null, null, null, 63));
                        }
                        Object a = yu00Var3.a(linkedHashMap, c);
                        l = nmtVar.f;
                        if (l != null) {
                            currentTimeMillis = l.longValue();
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        nmtVar.i = Long.valueOf(elapsedRealtime2);
                        nmtVar.j = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hhrVar.b.b;
                        nn2Var = (nn2) concurrentHashMap.get(Long.valueOf(j));
                        if (nn2Var != null) {
                            on2 on2Var = nn2Var.a;
                            yf7 yf7Var = nn2Var.b;
                            kvj0 kvj0Var = nn2Var.c;
                            w2j0 w2j0Var = (w2j0) on2Var.d.get();
                            w2j0Var.getClass();
                            w2j0Var.a(yf7Var, Status.ParsingEnd, new er20(kvj0Var, elapsedRealtime2));
                        }
                        concurrentHashMap.remove(Long.valueOf(j));
                        return new xu00(a, nmtVar.a());
                    } catch (Throwable th2) {
                        ((ConcurrentHashMap) hhrVar.b.b).remove(Long.valueOf(j));
                        throw new MapiClientException("Failed to parse response for ".concat("MapiRequest(urlPath=\"" + ((uu00) nmtVar.a).a + "\")"), th2, nmtVar.a(), IssueType.PARSING);
                    }
                }
                nmtVar = (nmt) goBDUIClient$executeRequest$1.L$3;
                ku00 ku00Var3 = (ku00) goBDUIClient$executeRequest$1.L$2;
                yu00 yu00Var4 = (yu00) goBDUIClient$executeRequest$1.L$1;
                try {
                    kotlin.b.b(obj);
                    ku00Var2 = ku00Var3;
                    yu00Var2 = yu00Var4;
                } catch (Throwable th3) {
                    th = th3;
                    throw new MapiClientException("Failed to get data for request.", th, nmtVar.a(), IssueType.COMMUNICATION);
                }
                qmt qmtVar = (qmt) obj;
                nmtVar.b = ((pmt) qmtVar).a.i;
                nmtVar.f = new Long(System.currentTimeMillis());
                goBDUIClient$executeRequest$1.L$0 = null;
                goBDUIClient$executeRequest$1.L$1 = yu00Var2;
                goBDUIClient$executeRequest$1.L$2 = null;
                goBDUIClient$executeRequest$1.L$3 = nmtVar;
                goBDUIClient$executeRequest$1.L$4 = null;
                goBDUIClient$executeRequest$1.label = 2;
                obj = c(nmtVar, qmtVar, ku00Var2, goBDUIClient$executeRequest$1);
                if (obj != obj2) {
                    yu00Var3 = yu00Var2;
                    ivj0 ivj0Var2 = (ivj0) obj;
                    nmtVar.c = Integer.valueOf(ivj0Var2.c);
                    nmtVar.d = ivj0Var2.d;
                    meu meuVar2 = ivj0Var2.b;
                    nmtVar.e = meuVar2.a("X-YaRequestId");
                    j = ivj0Var2.f;
                    nmtVar.f = Long.valueOf(j);
                    long j22 = ivj0Var2.g;
                    nmtVar.g = Long.valueOf(j22);
                    nmtVar.h = Long.valueOf(j22 - j);
                    hhrVar = this.c;
                    currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    TreeMap e2 = meuVar2.e();
                    s76 s76Var2 = ivj0Var2.e;
                    if (!(s76Var2 instanceof bai0)) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(e2.size()));
                    while (r0.hasNext()) {
                    }
                    Object a2 = yu00Var3.a(linkedHashMap2, c);
                    l = nmtVar.f;
                    if (l != null) {
                    }
                    long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime3;
                    nmtVar.i = Long.valueOf(elapsedRealtime22);
                    nmtVar.j = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) hhrVar.b.b;
                    nn2Var = (nn2) concurrentHashMap2.get(Long.valueOf(j));
                    if (nn2Var != null) {
                    }
                    concurrentHashMap2.remove(Long.valueOf(j));
                    return new xu00(a2, nmtVar.a());
                }
                return obj2;
            }
        }
        goBDUIClient$executeRequest$1 = new GoBDUIClient$executeRequest$1(this, (ContinuationImpl) continuation);
        obj = goBDUIClient$executeRequest$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goBDUIClient$executeRequest$1.label;
        if (i != 0) {
        }
        qmt qmtVar2 = (qmt) obj;
        nmtVar.b = ((pmt) qmtVar2).a.i;
        nmtVar.f = new Long(System.currentTimeMillis());
        goBDUIClient$executeRequest$1.L$0 = null;
        goBDUIClient$executeRequest$1.L$1 = yu00Var2;
        goBDUIClient$executeRequest$1.L$2 = null;
        goBDUIClient$executeRequest$1.L$3 = nmtVar;
        goBDUIClient$executeRequest$1.L$4 = null;
        goBDUIClient$executeRequest$1.label = 2;
        obj = c(nmtVar, qmtVar2, ku00Var2, goBDUIClient$executeRequest$1);
        if (obj != obj2) {
        }
        return obj2;
    }
}
