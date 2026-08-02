package xsna;

import com.mbridge.msdk.foundation.download.Command;
import com.vk.log.L;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.regex.Pattern;
import kotlin.Pair;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.k;
import okhttp3.l;
import okhttp3.p;
import okhttp3.u;
import org.chromium.base.TimeUtils;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import xsna.giv;
import xsna.giv.d;
import xsna.nbn;
import xsna.riv;
import xsna.tiv;

/* compiled from: HttpCacheInterceptor.kt */
/* loaded from: classes2.dex */
public final class iiv implements Interceptor, uz80 {
    public final hiv a;
    public final bpn0 b = new bpn0(new m1o(this, 12));
    public final bpn0 c;

    /* compiled from: HttpCacheInterceptor.kt */
    public static final class a {
        public static final okhttp3.u a(okhttp3.u uVar) {
            if (uVar == null) {
                return null;
            }
            if (uVar.h == null && uVar.j == null && uVar.i == null && uVar.k == null) {
                return uVar;
            }
            u.a w = uVar.w();
            w.g = null;
            w.d(null);
            w.k(null);
            w.j = null;
            return w.c();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public iiv(hiv hivVar, zcx zcxVar, rej rejVar) {
        this.a = hivVar;
        this.c = new bpn0(new kt(this, zcxVar, rejVar, 1));
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "HttpCache";
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0502 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0809 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0566 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x049f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04b1  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v24, types: [okhttp3.p, okhttp3.u] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        Object obj;
        String str;
        String str2;
        Object obj2;
        giv givVar;
        nbn nbnVar;
        String str3;
        String str4;
        okhttp3.u uVar;
        int i;
        long j;
        long j2;
        Date date;
        Date date2;
        Date date3;
        String str5;
        String str6;
        String str7;
        ?? r4;
        tiv tivVar;
        long j3;
        long j4;
        long j5;
        String str8;
        String str9;
        long j6;
        long j7;
        long j8;
        String sb;
        int i2;
        long j9;
        long j10;
        String str10;
        String str11;
        int i3;
        okhttp3.p pVar;
        riv rivVar;
        boolean z;
        okhttp3.u uVar2;
        okhttp3.u uVar3;
        okhttp3.v vVar;
        okhttp3.v vVar2;
        okhttp3.u a2;
        String str12;
        boolean z2;
        okhttp3.u c;
        String str13;
        nbn.c cVar;
        giv.d dVar;
        nbn.c cVar2;
        boolean z3;
        String str14;
        boolean z4;
        okhttp3.v vVar3;
        okhttp3.v vVar4;
        nbn.e i4;
        giv.c cVar3;
        okhttp3.k kVar;
        String str15;
        okhttp3.l lVar;
        okhttp3.u c2;
        String str16;
        okhttp3.p request = aVar.request();
        giv givVar2 = (giv) this.b.getValue();
        if (givVar2 == null) {
            return aVar.a(request);
        }
        nbn nbnVar2 = givVar2.c;
        String b = request.a.b();
        hiv hivVar = this.a;
        int i5 = hivVar.d;
        bpn0 bpn0Var = hivVar.j;
        Map<String, String> map = hivVar.a;
        if (i5 == 1) {
            if (!hivVar.b && !map.containsKey(b)) {
                Map map2 = (Map) bpn0Var.getValue();
                if (!map2.isEmpty()) {
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        if (brm0.B(b, (String) ((Map.Entry) it.next()).getKey(), false)) {
                        }
                    }
                }
                return aVar.a(request);
            }
            String str17 = map.get(b);
            if (str17 == null) {
                Iterator it2 = ((Map) bpn0Var.getValue()).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str16 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    str16 = (String) entry.getValue();
                    if (str16 == null || !brm0.B(b, (String) entry.getKey(), false)) {
                        str16 = null;
                    }
                    if (str16 != null) {
                        break;
                    }
                }
                str17 = str16 == null ? hivVar.c : str16;
            }
            if (str17 != null) {
                p.a b2 = request.b();
                b2.c.h("Cache-Control", str17);
                request = b2.b();
            }
            str = null;
        } else {
            Iterator<T> it3 = hivVar.e.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                yv8 yv8Var = (yv8) obj;
                String str18 = yv8Var.d;
                if (str18 != null ? drm0.e0(b, str18) : b.equals(yv8Var.a)) {
                    break;
                }
            }
            yv8 yv8Var2 = (yv8) obj;
            String str19 = yv8Var2 != null ? yv8Var2.b : null;
            str = yv8Var2 != null ? yv8Var2.c : null;
            if (str19 != null) {
                p.a b3 = request.b();
                b3.c.h("Cache-Control", str19);
                request = b3.b();
            }
            String a3 = request.c.a("Cache-Control");
            if (a3 != null && drm0.D(a3, "no-store", false)) {
                return aVar.a(request);
            }
        }
        okhttp3.p pVar2 = request;
        String str20 = pVar2.b;
        okhttp3.k kVar2 = pVar2.c;
        try {
            i4 = nbnVar2.i(givVar2.b(pVar2));
        } catch (IOException e) {
            str2 = "Content-Type";
            obj2 = "HttpCache";
            givVar = givVar2;
            nbnVar = nbnVar2;
            str3 = str;
            str4 = "Cache-Control";
            L.j(e, obj2);
        }
        if (i4 == null) {
            str2 = "Content-Type";
            obj2 = "HttpCache";
            givVar = givVar2;
            nbnVar = nbnVar2;
            str3 = str;
            str4 = "Cache-Control";
        } else {
            try {
                obj2 = "HttpCache";
                try {
                    cVar3 = new giv.c(mq9.d(i4.e[0]));
                    kVar = cVar3.b;
                    nbnVar = nbnVar2;
                    try {
                        str15 = cVar3.c;
                        givVar = givVar2;
                    } catch (IOException e2) {
                        e = e2;
                        str2 = "Content-Type";
                        givVar = givVar2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str2 = "Content-Type";
                    givVar = givVar2;
                    nbnVar = nbnVar2;
                    str3 = str;
                    str4 = "Cache-Control";
                    L.j(e, obj2);
                    x2r0.c(i4);
                    uVar = null;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (uVar == null) {
                    }
                    long j11 = currentTimeMillis;
                    String str21 = "Warning";
                    if (uVar != null) {
                    }
                    if (tivVar.a != null) {
                    }
                    ohk0 c3 = m63.c();
                    Pair pair = new Pair("http.cache.version", Integer.valueOf(hivVar.d));
                    pVar = tivVar.a;
                    okhttp3.u uVar4 = tivVar.b;
                    m63.j(c3, pair, new Pair("http.cache.hit", Boolean.valueOf((pVar == null || uVar4 == null) ? false : true)), new Pair("http.cache.candidate", Boolean.valueOf(uVar == null)));
                    rivVar = (riv) this.c.getValue();
                    if (rivVar != null) {
                    }
                    if (uVar != null) {
                    }
                    if (pVar != null) {
                    }
                    if (pVar != null) {
                    }
                }
                try {
                    lVar = cVar3.a;
                    str3 = str;
                    okhttp3.k kVar3 = cVar3.g;
                    String a4 = kVar3.a("Content-Type");
                    str2 = "Content-Type";
                    String a5 = kVar3.a(Http.Header.CONTENT_LENGTH);
                    p.a aVar2 = new p.a();
                    aVar2.a = lVar;
                    str4 = "Cache-Control";
                    aVar2.f(str15, x2r0.d);
                    aVar2.c = kVar.d();
                    okhttp3.p b4 = aVar2.b();
                    u.a aVar3 = new u.a();
                    aVar3.a = b4;
                    aVar3.b = cVar3.d;
                    aVar3.c = cVar3.e;
                    aVar3.d = cVar3.f;
                    aVar3.f = kVar3.d();
                    aVar3.g = new giv.a(i4, a4, a5);
                    aVar3.e = cVar3.h;
                    aVar3.k = cVar3.i;
                    aVar3.l = cVar3.j;
                    c2 = aVar3.c();
                } catch (IOException e4) {
                    e = e4;
                    str2 = "Content-Type";
                    str3 = str;
                    str4 = "Cache-Control";
                    L.j(e, obj2);
                    x2r0.c(i4);
                    uVar = null;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (uVar == null) {
                    }
                    long j112 = currentTimeMillis2;
                    String str212 = "Warning";
                    if (uVar != null) {
                    }
                    if (tivVar.a != null) {
                    }
                    ohk0 c32 = m63.c();
                    Pair pair2 = new Pair("http.cache.version", Integer.valueOf(hivVar.d));
                    pVar = tivVar.a;
                    okhttp3.u uVar42 = tivVar.b;
                    m63.j(c32, pair2, new Pair("http.cache.hit", Boolean.valueOf((pVar == null || uVar42 == null) ? false : true)), new Pair("http.cache.candidate", Boolean.valueOf(uVar == null)));
                    rivVar = (riv) this.c.getValue();
                    if (rivVar != null) {
                    }
                    if (uVar != null) {
                    }
                    if (pVar != null) {
                    }
                    if (pVar != null) {
                    }
                }
            } catch (IOException e5) {
                e = e5;
                str2 = "Content-Type";
                obj2 = "HttpCache";
            }
            if (epx.f(lVar, pVar2.a) && str15.equals(str20)) {
                Set<String> b5 = giv.b.b(c2.g);
                if (!(b5 instanceof Collection) || !b5.isEmpty()) {
                    for (String str22 : b5) {
                        if (!epx.f(kVar.g(str22), kVar2.g(str22))) {
                        }
                    }
                }
                uVar = c2;
                long currentTimeMillis22 = System.currentTimeMillis();
                if (uVar == null) {
                    j2 = uVar.l;
                    j = uVar.m;
                    okhttp3.k kVar4 = uVar.g;
                    int size = kVar4.size();
                    int i6 = 0;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    int i7 = -1;
                    while (i6 < size) {
                        long j12 = currentTimeMillis22;
                        String c4 = kVar4.c(i6);
                        String f = kVar4.f(i6);
                        int i8 = i6;
                        okhttp3.k kVar5 = kVar4;
                        if (brm0.w(c4, "Date", true)) {
                            tiv.a aVar4 = tiv.c;
                            date3 = tiv.b.a(f);
                            str7 = f;
                        } else if (brm0.w(c4, "Expires", true)) {
                            tiv.a aVar5 = tiv.c;
                            date = tiv.b.a(f);
                        } else if (brm0.w(c4, "Last-Modified", true)) {
                            tiv.a aVar6 = tiv.c;
                            date2 = tiv.b.a(f);
                            str6 = f;
                        } else if (brm0.w(c4, Command.HTTP_HEADER_ETAG, true)) {
                            str5 = f;
                        } else if (brm0.w(c4, "Age", true)) {
                            i7 = x2r0.x(-1, f);
                        }
                        i6 = i8 + 1;
                        currentTimeMillis22 = j12;
                        kVar4 = kVar5;
                    }
                    i = i7;
                } else {
                    i = -1;
                    j = 0;
                    j2 = 0;
                    date = null;
                    date2 = null;
                    date3 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                }
                long j1122 = currentTimeMillis22;
                String str2122 = "Warning";
                if (uVar != null) {
                    r4 = 0;
                    tivVar = new tiv(pVar2, null);
                } else {
                    r4 = 0;
                    tiv.a aVar7 = tiv.c;
                    if (tiv.b.b(pVar2, uVar)) {
                        okhttp3.c a6 = pVar2.a();
                        if (kVar2.a("If-Modified-Since") == null && kVar2.a("If-None-Match") == null) {
                            okhttp3.c n = uVar.n();
                            if (date3 != null) {
                                j3 = j;
                                j4 = j2;
                                j5 = Math.max(0L, j3 - date3.getTime());
                            } else {
                                j3 = j;
                                j4 = j2;
                                j5 = 0;
                            }
                            if (i != -1) {
                                str8 = "If-None-Match";
                                str9 = str20;
                                j5 = Math.max(j5, TimeUnit.SECONDS.toMillis(i));
                            } else {
                                str8 = "If-None-Match";
                                str9 = str20;
                            }
                            long j13 = j5 + (j3 - j4) + (j1122 - j3);
                            int i9 = uVar.n().c;
                            if (i9 != -1) {
                                j6 = j13;
                                j8 = TimeUnit.SECONDS.toMillis(i9);
                            } else {
                                j6 = j13;
                                if (date != null) {
                                    j8 = date.getTime() - (date3 != null ? date3.getTime() : j3);
                                    if (j8 <= 0) {
                                        j8 = 0;
                                    }
                                } else {
                                    if (date2 != null) {
                                        List<String> list = uVar.b.a.g;
                                        if (list == null) {
                                            sb = null;
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            l.b.e(sb2, list);
                                            sb = sb2.toString();
                                        }
                                        if (sb == null) {
                                            if (date3 != null) {
                                                j4 = date3.getTime();
                                            }
                                            long time = j4 - date2.getTime();
                                            j7 = 0;
                                            if (time > 0) {
                                                j8 = time / 10;
                                                i2 = a6.c;
                                                if (i2 == -1) {
                                                    str20 = str9;
                                                    j8 = Math.min(j8, TimeUnit.SECONDS.toMillis(i2));
                                                } else {
                                                    str20 = str9;
                                                }
                                                int i10 = a6.i;
                                                long millis = i10 == -1 ? TimeUnit.SECONDS.toMillis(i10) : j7;
                                                if (!n.g || (i3 = a6.h) == -1) {
                                                    j9 = j8;
                                                    j10 = j7;
                                                } else {
                                                    j9 = j8;
                                                    j10 = TimeUnit.SECONDS.toMillis(i3);
                                                }
                                                if (!n.a) {
                                                    long j14 = j6 + millis;
                                                    if (j14 < j9 + j10) {
                                                        u.a w = uVar.w();
                                                        if (j14 >= j9) {
                                                            w.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                        }
                                                        if (j6 > TimeUtils.MILLISECONDS_PER_DAY && uVar.n().c == -1 && date == null) {
                                                            w.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                        }
                                                        tivVar = new tiv(null, w.c());
                                                        r4 = 0;
                                                    }
                                                }
                                                if (str5 == null) {
                                                    str10 = str5;
                                                    str11 = str8;
                                                } else {
                                                    if (date2 != null) {
                                                        str10 = str6;
                                                    } else if (date3 != null) {
                                                        str10 = str7;
                                                    } else {
                                                        r4 = 0;
                                                        tivVar = new tiv(pVar2, null);
                                                    }
                                                    str11 = "If-Modified-Since";
                                                }
                                                k.a d = kVar2.d();
                                                d.b(str11, str10);
                                                p.a b6 = pVar2.b();
                                                b6.c = d.e().d();
                                                tivVar = new tiv(b6.b(), uVar);
                                                r4 = 0;
                                            }
                                            j8 = j7;
                                            i2 = a6.c;
                                            if (i2 == -1) {
                                            }
                                            int i102 = a6.i;
                                            if (i102 == -1) {
                                            }
                                            if (n.g) {
                                            }
                                            j9 = j8;
                                            j10 = j7;
                                            if (!n.a) {
                                            }
                                            if (str5 == null) {
                                            }
                                            k.a d2 = kVar2.d();
                                            d2.b(str11, str10);
                                            p.a b62 = pVar2.b();
                                            b62.c = d2.e().d();
                                            tivVar = new tiv(b62.b(), uVar);
                                            r4 = 0;
                                        }
                                    }
                                    j7 = 0;
                                    j8 = j7;
                                    i2 = a6.c;
                                    if (i2 == -1) {
                                    }
                                    int i1022 = a6.i;
                                    if (i1022 == -1) {
                                    }
                                    if (n.g) {
                                    }
                                    j9 = j8;
                                    j10 = j7;
                                    if (!n.a) {
                                    }
                                    if (str5 == null) {
                                    }
                                    k.a d22 = kVar2.d();
                                    d22.b(str11, str10);
                                    p.a b622 = pVar2.b();
                                    b622.c = d22.e().d();
                                    tivVar = new tiv(b622.b(), uVar);
                                    r4 = 0;
                                }
                            }
                            j7 = 0;
                            i2 = a6.c;
                            if (i2 == -1) {
                            }
                            int i10222 = a6.i;
                            if (i10222 == -1) {
                            }
                            if (n.g) {
                            }
                            j9 = j8;
                            j10 = j7;
                            if (!n.a) {
                            }
                            if (str5 == null) {
                            }
                            k.a d222 = kVar2.d();
                            d222.b(str11, str10);
                            p.a b6222 = pVar2.b();
                            b6222.c = d222.e().d();
                            tivVar = new tiv(b6222.b(), uVar);
                            r4 = 0;
                        } else {
                            r4 = 0;
                            tivVar = new tiv(pVar2, null);
                        }
                    } else {
                        tivVar = new tiv(pVar2, null);
                    }
                }
                if (tivVar.a != null && pVar2.a().j) {
                    tivVar = new tiv(r4, r4);
                }
                ohk0 c322 = m63.c();
                Pair pair22 = new Pair("http.cache.version", Integer.valueOf(hivVar.d));
                pVar = tivVar.a;
                okhttp3.u uVar422 = tivVar.b;
                m63.j(c322, pair22, new Pair("http.cache.hit", Boolean.valueOf((pVar == null || uVar422 == null) ? false : true)), new Pair("http.cache.candidate", Boolean.valueOf(uVar == null)));
                rivVar = (riv) this.c.getValue();
                if (rivVar != null) {
                    ConcurrentHashMap<String, riv.b> concurrentHashMap = rivVar.d;
                    final log logVar = new log(7);
                    concurrentHashMap.compute(b, new BiFunction() { // from class: xsna.niv
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj3, Object obj4) {
                            return (riv.b) log.this.invoke(obj3, obj4);
                        }
                    });
                    if (pVar != null) {
                        final f07 f07Var = new f07((byte) 0, 4);
                        concurrentHashMap.compute(b, new BiFunction() { // from class: xsna.oiv
                            @Override // java.util.function.BiFunction
                            public final Object apply(Object obj3, Object obj4) {
                                return (riv.b) f07.this.invoke(obj3, obj4);
                            }
                        });
                    } else if (uVar422 != null) {
                        rivVar.b(b, uVar422.g.a(Http.Header.CONTENT_LENGTH));
                    }
                }
                if (uVar != null && uVar422 == null && (vVar4 = uVar.h) != null) {
                    x2r0.c(vVar4);
                }
                if (pVar != null && uVar422 == null) {
                    u.a aVar8 = new u.a();
                    aVar8.a = pVar2;
                    aVar8.b = Protocol.HTTP_1_1;
                    aVar8.c = ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED;
                    aVar8.d = "Unsatisfiable Request (only-if-cached)";
                    aVar8.g = x2r0.c;
                    aVar8.k = -1L;
                    aVar8.l = System.currentTimeMillis();
                    return aVar8.c();
                }
                if (pVar != null) {
                    u.a w2 = uVar422.w();
                    w2.d(a.a(uVar422));
                    return w2.c();
                }
                String a7 = kVar2.a(str4);
                try {
                    if (a7 != null && drm0.D(a7, "stale-if-error", false)) {
                        z = true;
                        a2 = aVar.a(pVar);
                        if (str3 != null) {
                            try {
                                u.a w3 = a2.w();
                                w3.f.h("Cache-control", str3);
                                a2 = w3.c();
                            } catch (Exception e6) {
                                e = e6;
                                uVar3 = a2;
                                try {
                                    L.j(e, "HttpCacheInterceptor");
                                    if (uVar422 == null || !z) {
                                        throw e;
                                    }
                                    u.a w4 = uVar422.w();
                                    w4.d(a.a(uVar422));
                                    w4.k(null);
                                    okhttp3.u c5 = w4.c();
                                    if (rivVar != null) {
                                        rivVar.b(b, uVar422.g.a(Http.Header.CONTENT_LENGTH));
                                    }
                                    if (uVar3 == null && uVar != null && !z && (vVar2 = uVar.h) != null) {
                                        x2r0.c(vVar2);
                                    }
                                    return c5;
                                } catch (Throwable th) {
                                    th = th;
                                    uVar2 = uVar3;
                                    if (uVar2 == null && uVar != null && ((uVar422 == null || !z) && (vVar = uVar.h) != null)) {
                                        x2r0.c(vVar);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                uVar2 = a2;
                                if (uVar2 == null) {
                                    x2r0.c(vVar);
                                }
                                throw th;
                            }
                        }
                        if (a2 == null && uVar != null && ((uVar422 == null || !z) && (vVar3 = uVar.h) != null)) {
                            x2r0.c(vVar3);
                        }
                        if (uVar422 == null) {
                            okhttp3.v vVar5 = uVar422.h;
                            okhttp3.k kVar6 = uVar422.g;
                            if (a2 != null && a2.e == 304) {
                                u.a w5 = uVar422.w();
                                okhttp3.k kVar7 = a2.g;
                                k.a aVar9 = new k.a();
                                int size2 = kVar6.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    String c6 = kVar6.c(i11);
                                    okhttp3.v vVar6 = vVar5;
                                    String f2 = kVar6.f(i11);
                                    String str23 = str2122;
                                    if (str2122.equalsIgnoreCase(c6)) {
                                        z3 = false;
                                        if (brm0.B(f2, "1", false)) {
                                            str14 = str2;
                                            i11++;
                                            str2 = str14;
                                            vVar5 = vVar6;
                                            str2122 = str23;
                                        }
                                    } else {
                                        z3 = false;
                                    }
                                    if (Http.Header.CONTENT_LENGTH.equalsIgnoreCase(c6) || Http.Header.CONTENT_ENCODING.equalsIgnoreCase(c6)) {
                                        str14 = str2;
                                    } else {
                                        str14 = str2;
                                        if (!str14.equalsIgnoreCase(c6)) {
                                            z4 = z3;
                                            if (!z4 || !a.b(c6) || kVar7.a(c6) == null) {
                                                aVar9.b(c6, f2);
                                            }
                                            i11++;
                                            str2 = str14;
                                            vVar5 = vVar6;
                                            str2122 = str23;
                                        }
                                    }
                                    z4 = true;
                                    if (!z4) {
                                    }
                                    aVar9.b(c6, f2);
                                    i11++;
                                    str2 = str14;
                                    vVar5 = vVar6;
                                    str2122 = str23;
                                }
                                okhttp3.v vVar7 = vVar5;
                                String str24 = str2;
                                int size3 = kVar7.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    String c7 = kVar7.c(i12);
                                    if (!(Http.Header.CONTENT_LENGTH.equalsIgnoreCase(c7) || Http.Header.CONTENT_ENCODING.equalsIgnoreCase(c7) || str24.equalsIgnoreCase(c7)) && a.b(c7)) {
                                        aVar9.b(c7, kVar7.f(i12));
                                    }
                                }
                                w5.f = aVar9.e().d();
                                w5.k = a2.l;
                                w5.l = a2.m;
                                w5.d(a.a(uVar422));
                                w5.k(a.a(a2));
                                okhttp3.u c8 = w5.c();
                                a2.h.close();
                                if (rivVar != null) {
                                    rivVar.b(b, kVar6.a(Http.Header.CONTENT_LENGTH));
                                }
                                giv.c cVar4 = new giv.c(c8);
                                nbn.e eVar = ((giv.a) vVar7).d;
                                try {
                                    nbn nbnVar3 = nbn.this;
                                    String str25 = eVar.b;
                                    long j15 = eVar.c;
                                    Pattern pattern = nbn.p;
                                    cVar2 = nbnVar3.h(j15, str25);
                                    if (cVar2 != null) {
                                        try {
                                            cVar4.c(cVar2);
                                            cVar2.b();
                                        } catch (IOException e7) {
                                            e = e7;
                                            L.j(e, obj2);
                                            if (cVar2 != null) {
                                                try {
                                                    cVar2.a();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            return c8;
                                        }
                                    }
                                } catch (IOException e8) {
                                    e = e8;
                                    cVar2 = null;
                                }
                                return c8;
                            }
                            str12 = str2;
                            z2 = false;
                            if ((a2 == null || a2.e != 200) && z) {
                                u.a w6 = uVar422.w();
                                w6.d(a.a(uVar422));
                                w6.k(a.a(a2));
                                okhttp3.u c9 = w6.c();
                                if (rivVar != null) {
                                    rivVar.b(b, kVar6.a(Http.Header.CONTENT_LENGTH));
                                }
                                return c9;
                            }
                            if (vVar5 != null) {
                                x2r0.c(vVar5);
                            }
                        } else {
                            str12 = str2;
                            z2 = false;
                        }
                        u.a w7 = a2.w();
                        w7.d(a.a(uVar422));
                        w7.k(a.a(a2));
                        c = w7.c();
                        okhttp3.v vVar8 = c.h;
                        okhttp3.k kVar8 = c.g;
                        if (njv.a(c)) {
                            tiv.a aVar10 = tiv.c;
                            if (tiv.b.b(pVar, c)) {
                                String str26 = str20;
                                if (epx.f(str26, "POST") || !(str26.equals("POST") || str26.equals("PATCH") || str26.equals("PUT") || str26.equals("DELETE") || str26.equals("MOVE"))) {
                                    nbn nbnVar4 = nbnVar;
                                    giv givVar3 = givVar;
                                    if ((epx.f(str26, "GET") || epx.f(str26, "POST")) && !giv.b.b(kVar8).contains("*")) {
                                        giv.c cVar5 = new giv.c(c);
                                        try {
                                            try {
                                                cVar = nbnVar4.h(-1L, givVar3.b(pVar2));
                                            } catch (IOException unused2) {
                                            }
                                        } catch (IOException e9) {
                                            e = e9;
                                            cVar = null;
                                        } catch (Exception e10) {
                                            e = e10;
                                            cVar = null;
                                        }
                                        if (cVar != null) {
                                            try {
                                                cVar5.c(cVar);
                                                dVar = givVar3.new d(cVar);
                                            } catch (IOException e11) {
                                                e = e11;
                                                L.j(e, obj2);
                                                if (cVar != null) {
                                                    cVar.a();
                                                }
                                                dVar = null;
                                                if (dVar != null) {
                                                }
                                            } catch (Exception e12) {
                                                e = e12;
                                                L.j(e, obj2);
                                                if (cVar != null) {
                                                    cVar.a();
                                                }
                                                dVar = null;
                                                if (dVar != null) {
                                                }
                                            }
                                            if (dVar != null) {
                                                return c;
                                            }
                                            jiv jivVar = new jiv(vVar8.source(), dVar, new d8f0(dVar.c));
                                            String a8 = kVar8.a(str12);
                                            String str27 = a8 == null ? null : a8;
                                            long contentLength = vVar8.contentLength();
                                            u.a w8 = c.w();
                                            w8.g = new n8f0(str27, contentLength, new e8f0(jivVar));
                                            return w8.c();
                                        }
                                    }
                                } else {
                                    try {
                                        nbnVar.s(givVar.b(pVar2));
                                    } catch (IOException e13) {
                                        L.j(e13, obj2);
                                    }
                                }
                                dVar = null;
                                if (dVar != null) {
                                }
                            }
                        }
                        nbn nbnVar5 = nbnVar;
                        giv givVar4 = givVar;
                        str13 = pVar.b;
                        if ((!str13.equals("POST") || str13.equals("PATCH") || str13.equals("PUT") || str13.equals("DELETE") || str13.equals("MOVE")) ? true : z2) {
                            try {
                                nbnVar5.s(givVar4.b(pVar));
                            } catch (IOException e14) {
                                L.j(e14, "HttpCacheInterceptor");
                            }
                        }
                        return c;
                    }
                    a2 = aVar.a(pVar);
                    if (str3 != null) {
                    }
                    if (a2 == null) {
                        x2r0.c(vVar3);
                    }
                    if (uVar422 == null) {
                    }
                    u.a w72 = a2.w();
                    w72.d(a.a(uVar422));
                    w72.k(a.a(a2));
                    c = w72.c();
                    okhttp3.v vVar82 = c.h;
                    okhttp3.k kVar82 = c.g;
                    if (njv.a(c)) {
                    }
                    nbn nbnVar52 = nbnVar;
                    giv givVar42 = givVar;
                    str13 = pVar.b;
                    if ((!str13.equals("POST") || str13.equals("PATCH") || str13.equals("PUT") || str13.equals("DELETE") || str13.equals("MOVE")) ? true : z2) {
                    }
                    return c;
                } catch (Exception e15) {
                    e = e15;
                    uVar3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    uVar2 = null;
                }
                z = false;
            }
            okhttp3.v vVar9 = c2.h;
            if (vVar9 != null) {
                x2r0.c(vVar9);
            }
        }
        uVar = null;
        long currentTimeMillis222 = System.currentTimeMillis();
        if (uVar == null) {
        }
        long j11222 = currentTimeMillis222;
        String str21222 = "Warning";
        if (uVar != null) {
        }
        if (tivVar.a != null) {
            tivVar = new tiv(r4, r4);
        }
        ohk0 c3222 = m63.c();
        Pair pair222 = new Pair("http.cache.version", Integer.valueOf(hivVar.d));
        pVar = tivVar.a;
        okhttp3.u uVar4222 = tivVar.b;
        m63.j(c3222, pair222, new Pair("http.cache.hit", Boolean.valueOf((pVar == null || uVar4222 == null) ? false : true)), new Pair("http.cache.candidate", Boolean.valueOf(uVar == null)));
        rivVar = (riv) this.c.getValue();
        if (rivVar != null) {
        }
        if (uVar != null) {
            x2r0.c(vVar4);
        }
        if (pVar != null) {
        }
        if (pVar != null) {
        }
    }
}
