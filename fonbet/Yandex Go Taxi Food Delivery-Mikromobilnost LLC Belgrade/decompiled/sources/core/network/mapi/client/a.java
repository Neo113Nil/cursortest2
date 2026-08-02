package core.network.mapi.client;

import core.network.mapi.exception.IssueType;
import core.network.mapi.exception.MapiClientException;
import defpackage.b64;
import defpackage.d5j0;
import defpackage.i3y;
import defpackage.j24;
import defpackage.jwu;
import defpackage.ku00;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.lu00;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.ru00;
import defpackage.rvj0;
import defpackage.rzo;
import defpackage.s7s0;
import defpackage.su00;
import defpackage.t4j0;
import defpackage.tjr;
import defpackage.tu00;
import defpackage.unr0;
import defpackage.uu00;
import defpackage.v5j0;
import defpackage.vu00;
import defpackage.wg10;
import defpackage.wms;
import defpackage.wu00;
import defpackage.wwg;
import defpackage.xfz;
import defpackage.xu00;
import defpackage.ycc;
import defpackage.yd5;
import defpackage.yf7;
import defpackage.yu00;
import defpackage.zjr;
import flex.logger.FlexLogLevel;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import okhttp3.OkHttpClient;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes4.dex */
public final class a implements lu00 {
    public final su00 a;
    public final List b;
    public final ArrayList c = new ArrayList();
    public final zjr d = new zjr(xfz.b(a.class.getSimpleName()));
    public final OkHttpClient e;

    public a(su00 su00Var, List list, tu00 tu00Var) {
        this.a = su00Var;
        this.b = list;
        this.e = tu00Var.a(new yd5(this));
    }

    public static meu b(Map map, vu00 vu00Var, v5j0 v5j0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put((String) entry.getKey(), (String) entry.getValue());
        }
        for (Map.Entry entry2 : ((uu00) vu00Var).b.entrySet()) {
            linkedHashMap.put((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (v5j0Var.m) {
            linkedHashMap.put("InitialEngineRequest", "1");
        }
        return wwg.y(linkedHashMap);
    }

    public static kwu c(String str, vu00 vu00Var) {
        jwu jwuVar = new jwu();
        jwuVar.i(null, str);
        jwu g = jwuVar.e().g();
        g.c(((uu00) vu00Var).a, true);
        for (Map.Entry entry : ((uu00) vu00Var).c.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                g.d(str2, (String) it.next());
            }
        }
        return g.e();
    }

    public static String d(v5j0 v5j0Var) {
        return oyr.p("MapiRequest(urlPath=\"", ((uu00) v5j0Var.a).a, "\")");
    }

    public final kvj0 a(v5j0 v5j0Var, d5j0 d5j0Var, ku00 ku00Var) {
        v5j0Var.b = d5j0Var.a.i;
        yf7 newCall = this.e.newCall(d5j0Var);
        if (ku00Var != null) {
            synchronized (this.c) {
                this.c.add(new Pair(newCall, ku00Var));
            }
        }
        try {
            return ((nci0) newCall).execute();
        } catch (Throwable th) {
            throw new MapiClientException(b64.l("Failed to execute ", qoi0.a(d5j0.class).c(), " for ", d(v5j0Var)), th, v5j0Var.a(), IssueType.COMMUNICATION);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008b -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        BasicMapiClient$getHeaders$1 basicMapiClient$getHeaders$1;
        int i;
        Iterator it;
        Map map;
        if (continuationImpl instanceof BasicMapiClient$getHeaders$1) {
            basicMapiClient$getHeaders$1 = (BasicMapiClient$getHeaders$1) continuationImpl;
            int i2 = basicMapiClient$getHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basicMapiClient$getHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basicMapiClient$getHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basicMapiClient$getHeaders$1.label;
                if (i != 0) {
                    b.b(obj);
                    List list = this.b;
                    if (list.isEmpty()) {
                        return kotlin.collections.b.f();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = list.iterator();
                    map = linkedHashMap;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a aVar = (a) basicMapiClient$getHeaders$1.L$6;
                    map = (Map) basicMapiClient$getHeaders$1.L$5;
                    it = (Iterator) basicMapiClient$getHeaders$1.L$1;
                    Map map2 = (Map) basicMapiClient$getHeaders$1.L$0;
                    b.b(obj);
                    Map map3 = (Map) obj;
                    aVar.getClass();
                    if (!map3.isEmpty()) {
                        map.putAll(map3);
                    }
                    map = map2;
                    if (it.hasNext()) {
                        ru00 ru00Var = (ru00) it.next();
                        basicMapiClient$getHeaders$1.L$0 = map;
                        basicMapiClient$getHeaders$1.L$1 = it;
                        basicMapiClient$getHeaders$1.L$2 = null;
                        basicMapiClient$getHeaders$1.L$3 = map;
                        basicMapiClient$getHeaders$1.L$4 = null;
                        basicMapiClient$getHeaders$1.L$5 = map;
                        basicMapiClient$getHeaders$1.L$6 = this;
                        basicMapiClient$getHeaders$1.I$0 = 0;
                        basicMapiClient$getHeaders$1.label = 1;
                        obj = ru00Var.getHeaders(basicMapiClient$getHeaders$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = this;
                        map2 = map;
                        Map map32 = (Map) obj;
                        aVar.getClass();
                        if (!map32.isEmpty()) {
                        }
                        map = map2;
                        if (it.hasNext()) {
                            return map;
                        }
                    }
                }
            }
        }
        basicMapiClient$getHeaders$1 = new BasicMapiClient$getHeaders$1(this, continuationImpl);
        Object obj2 = basicMapiClient$getHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basicMapiClient$getHeaders$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014c A[Catch: IllegalArgumentException -> 0x019d, TRY_LEAVE, TryCatch #6 {IllegalArgumentException -> 0x019d, blocks: (B:16:0x0133, B:18:0x014c, B:45:0x019f, B:46:0x01a4), top: B:15:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f A[Catch: IllegalArgumentException -> 0x019d, TRY_ENTER, TryCatch #6 {IllegalArgumentException -> 0x019d, blocks: (B:16:0x0133, B:18:0x014c, B:45:0x019f, B:46:0x01a4), top: B:15:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.lu00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, v5j0 v5j0Var, Continuation continuation) {
        BasicMapiClient$executeRequest$2 basicMapiClient$executeRequest$2;
        Object obj;
        int i;
        tjr tjrVar;
        String str;
        v5j0 v5j0Var2;
        yu00 yu00Var2;
        ku00 ku00Var2;
        Object e;
        vu00 vu00Var2;
        Object obj2;
        yu00 yu00Var3;
        ku00 ku00Var3;
        v5j0 v5j0Var3;
        vu00 vu00Var3 = vu00Var;
        if (continuation instanceof BasicMapiClient$executeRequest$2) {
            basicMapiClient$executeRequest$2 = (BasicMapiClient$executeRequest$2) continuation;
            int i2 = basicMapiClient$executeRequest$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basicMapiClient$executeRequest$2.label = i2 - Integer.MIN_VALUE;
                Object obj3 = basicMapiClient$executeRequest$2.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basicMapiClient$executeRequest$2.label;
                if (i != 0) {
                    b.b(obj3);
                    zjr zjrVar = this.d;
                    i3y a = xfz.a(new Pair("requestPath", ((uu00) vu00Var3).a), new Pair("requestHeaders", ((uu00) vu00Var3).b));
                    EmptyList emptyList = EmptyList.a;
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue()) {
                        StackTraceElement stackTraceElement = (StackTraceElement) unr0.j(0);
                        if (stackTraceElement != null) {
                            String fileName = stackTraceElement.getFileName();
                            if (fileName == null) {
                                fileName = "No file info";
                            }
                            String methodName = stackTraceElement.getMethodName();
                            Integer num = new Integer(stackTraceElement.getLineNumber());
                            Integer num2 = num.intValue() > 0 ? num : null;
                            if (num2 == null || (str = num2.toString()) == null) {
                                str = "No line info";
                            }
                            tjrVar = new tjr(fileName, methodName, str);
                        } else {
                            tjrVar = tjr.d;
                        }
                    } else {
                        tjrVar = tjr.d;
                    }
                    zjrVar.d(FlexLogLevel.DEBUG, "Mapi request executed", a, emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                    try {
                        su00 su00Var = this.a;
                        basicMapiClient$executeRequest$2.L$0 = vu00Var3;
                        yu00Var2 = yu00Var;
                        basicMapiClient$executeRequest$2.L$1 = yu00Var2;
                        ku00Var2 = ku00Var;
                        basicMapiClient$executeRequest$2.L$2 = ku00Var2;
                        v5j0Var2 = v5j0Var;
                        try {
                            basicMapiClient$executeRequest$2.L$3 = v5j0Var2;
                            basicMapiClient$executeRequest$2.label = 1;
                            obj3 = su00Var.getHost(basicMapiClient$executeRequest$2);
                            if (obj3 == obj) {
                                return obj;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw new MapiClientException("Failed to get data for request.", th, v5j0Var2.a(), IssueType.COMMUNICATION);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        v5j0Var2 = v5j0Var;
                        throw new MapiClientException("Failed to get data for request.", th, v5j0Var2.a(), IssueType.COMMUNICATION);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = basicMapiClient$executeRequest$2.L$4;
                        v5j0Var3 = (v5j0) basicMapiClient$executeRequest$2.L$3;
                        ku00Var3 = (ku00) basicMapiClient$executeRequest$2.L$2;
                        yu00Var3 = (yu00) basicMapiClient$executeRequest$2.L$1;
                        vu00Var2 = (vu00) basicMapiClient$executeRequest$2.L$0;
                        try {
                            b.b(obj3);
                            Pair pair = new Pair(obj2, obj3);
                            String str2 = (String) pair.getFirst();
                            Map map = (Map) pair.getSecond();
                            try {
                                t4j0 t4j0Var = new t4j0();
                                t4j0Var.a = c(str2, vu00Var2);
                                t4j0Var.c = b(map, vu00Var2, v5j0Var3).d();
                                if (vu00Var2 instanceof uu00) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Regex regex = wg10.e;
                                wg10 o = qje.o("application/json;charset=UTF-8");
                                int i3 = m5j0.a;
                                t4j0Var.e("POST", wms.a(((uu00) vu00Var2).d, o));
                                int i4 = 14;
                                try {
                                    xu00 f = f(v5j0Var3, a(v5j0Var3, new d5j0(t4j0Var), ku00Var3), yu00Var3);
                                    if (ku00Var3 == null) {
                                        return f;
                                    }
                                    synchronized (this.c) {
                                        ycc.w(this.c, new j24(i4, ku00Var3), true);
                                    }
                                    return f;
                                } catch (Throwable th3) {
                                    if (ku00Var3 != null) {
                                        synchronized (this.c) {
                                            ycc.w(this.c, new j24(i4, ku00Var3), true);
                                        }
                                    }
                                    throw th3;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw new MapiClientException(b64.l("Failed to create ", qoi0.a(d5j0.class).c(), " for ", d(v5j0Var3)), e2, v5j0Var3.a(), IssueType.COMMUNICATION);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            v5j0Var2 = v5j0Var3;
                            throw new MapiClientException("Failed to get data for request.", th, v5j0Var2.a(), IssueType.COMMUNICATION);
                        }
                    }
                    v5j0 v5j0Var4 = (v5j0) basicMapiClient$executeRequest$2.L$3;
                    ku00 ku00Var4 = (ku00) basicMapiClient$executeRequest$2.L$2;
                    yu00 yu00Var4 = (yu00) basicMapiClient$executeRequest$2.L$1;
                    vu00 vu00Var4 = (vu00) basicMapiClient$executeRequest$2.L$0;
                    try {
                        b.b(obj3);
                        ku00Var2 = ku00Var4;
                        vu00Var3 = vu00Var4;
                        v5j0Var2 = v5j0Var4;
                        yu00Var2 = yu00Var4;
                    } catch (Throwable th5) {
                        th = th5;
                        v5j0Var2 = v5j0Var4;
                        throw new MapiClientException("Failed to get data for request.", th, v5j0Var2.a(), IssueType.COMMUNICATION);
                    }
                }
                basicMapiClient$executeRequest$2.L$0 = vu00Var3;
                basicMapiClient$executeRequest$2.L$1 = yu00Var2;
                basicMapiClient$executeRequest$2.L$2 = ku00Var2;
                basicMapiClient$executeRequest$2.L$3 = v5j0Var2;
                basicMapiClient$executeRequest$2.L$4 = obj3;
                basicMapiClient$executeRequest$2.label = 2;
                e = e(basicMapiClient$executeRequest$2);
                if (e != obj) {
                    vu00Var2 = vu00Var3;
                    obj2 = obj3;
                    obj3 = e;
                    ku00 ku00Var5 = ku00Var2;
                    yu00Var3 = yu00Var2;
                    ku00Var3 = ku00Var5;
                    v5j0Var3 = v5j0Var2;
                    Pair pair2 = new Pair(obj2, obj3);
                    String str22 = (String) pair2.getFirst();
                    Map map2 = (Map) pair2.getSecond();
                    t4j0 t4j0Var2 = new t4j0();
                    t4j0Var2.a = c(str22, vu00Var2);
                    t4j0Var2.c = b(map2, vu00Var2, v5j0Var3).d();
                    if (vu00Var2 instanceof uu00) {
                    }
                }
                return obj;
            }
        }
        basicMapiClient$executeRequest$2 = new BasicMapiClient$executeRequest$2(this, (ContinuationImpl) continuation);
        Object obj32 = basicMapiClient$executeRequest$2.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basicMapiClient$executeRequest$2.label;
        if (i != 0) {
        }
        basicMapiClient$executeRequest$2.L$0 = vu00Var3;
        basicMapiClient$executeRequest$2.L$1 = yu00Var2;
        basicMapiClient$executeRequest$2.L$2 = ku00Var2;
        basicMapiClient$executeRequest$2.L$3 = v5j0Var2;
        basicMapiClient$executeRequest$2.L$4 = obj32;
        basicMapiClient$executeRequest$2.label = 2;
        e = e(basicMapiClient$executeRequest$2);
        if (e != obj) {
        }
        return obj;
    }

    public final xu00 f(v5j0 v5j0Var, kvj0 kvj0Var, yu00 yu00Var) {
        StackTraceElement stackTraceElement;
        String str;
        tjr tjrVar;
        InputStream byteStream;
        StackTraceElement stackTraceElement2;
        String num;
        v5j0Var.c = null;
        v5j0Var.d = null;
        v5j0Var.e = null;
        v5j0Var.f = null;
        v5j0Var.g = null;
        v5j0Var.h = null;
        v5j0Var.k = kotlin.collections.b.f();
        v5j0Var.c = Integer.valueOf(kvj0Var.w);
        String str2 = kvj0Var.c;
        v5j0Var.d = str2;
        meu meuVar = kvj0Var.y;
        v5j0Var.e = meuVar.a("x-market-req-id");
        long j = kvj0Var.E;
        v5j0Var.f = Long.valueOf(j);
        long j2 = kvj0Var.F;
        v5j0Var.g = Long.valueOf(j2);
        v5j0Var.h = Long.valueOf(j2 - j);
        if (!kvj0Var.J) {
            kvj0Var.close();
            StringBuilder u = b64.u(kvj0Var.w, "Request ", d(v5j0Var), " failed with code ", " and message ");
            u.append(str2);
            throw new MapiClientException(u.toString(), null, v5j0Var.a(), IssueType.COMMUNICATION);
        }
        wu00 a = v5j0Var.a();
        i3y a2 = xfz.a(xfz.d(a.b, "url"), xfz.d(a.c, Constants.INTENT_PARAM_RESPONSE_CODE), xfz.d(a.d, io.appmetrica.analytics.rtm.internal.Constants.KEY_MESSAGE), xfz.d(a.h, "requestDuration"));
        zjr zjrVar = this.d;
        s7s0 s7s0Var = zjrVar.c.a;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = bool.booleanValue();
        String str3 = "No line info";
        tjr tjrVar2 = tjr.d;
        if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "No file info";
            }
            String methodName = stackTraceElement.getMethodName();
            int lineNumber = stackTraceElement.getLineNumber();
            Integer valueOf = Integer.valueOf(lineNumber);
            if (lineNumber <= 0) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "No line info";
            }
            tjrVar = new tjr(fileName, methodName, str);
        } else {
            tjrVar = tjrVar2;
        }
        FlexLogLevel flexLogLevel = FlexLogLevel.DEBUG;
        String str4 = tjrVar.a;
        String str5 = tjrVar.c;
        String str6 = tjrVar.b;
        EmptyList emptyList = EmptyList.a;
        zjrVar.d(flexLogLevel, "Fetch response is successful", a2, emptyList, str4, str6, str5);
        try {
            rvj0 rvj0Var = kvj0Var.z;
            if (rvj0Var == null || (byteStream = rvj0Var.byteStream()) == null) {
                throw new MapiClientException("Empty response for ".concat(d(v5j0Var)), null, v5j0Var.a(), IssueType.PARSING);
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rzo.R(byteStream));
            kvj0Var.close();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    Object b = yu00Var.b(kotlin.collections.b.s(meuVar), byteArrayInputStream, a);
                    byteArrayInputStream.close();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j3 = currentTimeMillis2 - currentTimeMillis;
                    i3y a3 = xfz.a(new Pair("parsingDuration", Long.valueOf(j3)));
                    s7s0 s7s0Var2 = zjrVar.c.a;
                    if (bool.booleanValue() && (stackTraceElement2 = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName2 = stackTraceElement2.getFileName();
                        if (fileName2 == null) {
                            fileName2 = "No file info";
                        }
                        String methodName2 = stackTraceElement2.getMethodName();
                        int lineNumber2 = stackTraceElement2.getLineNumber();
                        Integer valueOf2 = lineNumber2 > 0 ? Integer.valueOf(lineNumber2) : null;
                        if (valueOf2 != null && (num = valueOf2.toString()) != null) {
                            str3 = num;
                        }
                        tjrVar2 = new tjr(fileName2, methodName2, str3);
                    }
                    tjr tjrVar3 = tjrVar2;
                    zjrVar.d(flexLogLevel, "Response body parsing successful", a3, emptyList, tjrVar3.a, tjrVar3.b, tjrVar3.c);
                    v5j0Var.i = Long.valueOf(j3);
                    Long l = v5j0Var.f;
                    if (l != null) {
                        v5j0Var.j = Long.valueOf(currentTimeMillis2 - l.longValue());
                    }
                    return new xu00(b, v5j0Var.a());
                } catch (Throwable th) {
                    throw new MapiClientException("Failed to parse response for ".concat(d(v5j0Var)), th, v5j0Var.a(), IssueType.PARSING);
                }
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.lu00
    public final Object executeRequest(vu00 vu00Var, yu00 yu00Var, ku00 ku00Var, Continuation continuation) {
        return executeRequest(vu00Var, yu00Var, ku00Var, new v5j0(vu00Var, null), continuation);
    }
}
