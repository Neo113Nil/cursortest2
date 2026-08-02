package xsna;

import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.b;
import okhttp3.k;
import okhttp3.l;
import okhttp3.p;
import okhttp3.u;
import org.chromium.base.TimeUtils;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import xsna.rx8;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes11.dex */
public final class uw8 implements Interceptor {
    public final okhttp3.b a;

    /* compiled from: CacheInterceptor.kt */
    public static final class a {
        public static final okhttp3.u a(okhttp3.u uVar) {
            if ((uVar != null ? uVar.m() : null) == null) {
                return uVar;
            }
            u.a w = uVar.w();
            w.b(null);
            return w.c();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    public uw8(okhttp3.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01a8  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [okhttp3.p, okhttp3.u] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) throws IOException {
        int i;
        long j;
        long j2;
        Date date;
        Date date2;
        Date date3;
        String str;
        String str2;
        String str3;
        ?? r5;
        rx8 rx8Var;
        String str4;
        long j3;
        okhttp3.k kVar;
        long j4;
        okhttp3.k kVar2;
        long j5;
        long j6;
        String sb;
        int i2;
        long j7;
        String str5;
        int i3;
        Object obj;
        okhttp3.v m;
        Object obj2;
        Object obj3;
        String str6;
        okhttp3.v m2;
        okhttp3.v m3;
        okhttp3.d call = aVar.call();
        okhttp3.b bVar = this.a;
        okhttp3.u b = bVar != null ? bVar.b(aVar.request()) : null;
        long currentTimeMillis = System.currentTimeMillis();
        okhttp3.p request = aVar.request();
        if (b != null) {
            j = b.E();
            j2 = b.z();
            okhttp3.k s = b.s();
            int size = s.size();
            int i4 = 0;
            date = null;
            date2 = null;
            date3 = null;
            int i5 = -1;
            str = null;
            str2 = null;
            str3 = null;
            while (i4 < size) {
                String c = s.c(i4);
                String f = s.f(i4);
                long j8 = currentTimeMillis;
                if (brm0.w(c, "Date", true)) {
                    date3 = r1l.a(f);
                    str3 = f;
                } else if (brm0.w(c, "Expires", true)) {
                    date = r1l.a(f);
                } else if (brm0.w(c, "Last-Modified", true)) {
                    date2 = r1l.a(f);
                    str2 = f;
                } else if (brm0.w(c, Command.HTTP_HEADER_ETAG, true)) {
                    str = f;
                } else if (brm0.w(c, "Age", true)) {
                    i5 = x2r0.x(-1, f);
                }
                i4++;
                currentTimeMillis = j8;
            }
            i = i5;
        } else {
            i = -1;
            j = 0;
            j2 = 0;
            date = null;
            date2 = null;
            date3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        long j9 = currentTimeMillis;
        String str7 = "Warning";
        if (b == null) {
            r5 = 0;
            rx8Var = new rx8(request, null);
        } else {
            r5 = 0;
            r5 = 0;
            okhttp3.l lVar = request.a;
            okhttp3.k kVar3 = request.c;
            if (lVar.j && b.p() == null) {
                rx8Var = new rx8(request, null);
            } else if (rx8.a.a(request, b)) {
                okhttp3.c a2 = request.a();
                if (!a2.a) {
                    String str8 = "If-Modified-Since";
                    if (kVar3.a("If-Modified-Since") == null && kVar3.a("If-None-Match") == null) {
                        okhttp3.c n = b.n();
                        if (date3 != null) {
                            str4 = "If-None-Match";
                            j3 = j;
                            kVar = kVar3;
                            j4 = Math.max(0L, j2 - date3.getTime());
                        } else {
                            str4 = "If-None-Match";
                            j3 = j;
                            kVar = kVar3;
                            j4 = 0;
                        }
                        if (i != -1) {
                            kVar2 = kVar;
                            j4 = Math.max(j4, TimeUnit.SECONDS.toMillis(i));
                        } else {
                            kVar2 = kVar;
                        }
                        long j10 = j4 + (j2 - j3) + (j9 - j2);
                        int i6 = b.n().c;
                        if (i6 != -1) {
                            j6 = TimeUnit.SECONDS.toMillis(i6);
                        } else if (date != null) {
                            if (date3 != null) {
                                j2 = date3.getTime();
                            }
                            j6 = date.getTime() - j2;
                            if (j6 <= 0) {
                                j6 = 0;
                            }
                        } else {
                            if (date2 != null) {
                                List<String> list = b.A().a.g;
                                if (list == null) {
                                    sb = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    l.b.e(sb2, list);
                                    sb = sb2.toString();
                                }
                                if (sb == null) {
                                    long time = (date3 != null ? date3.getTime() : j3) - date2.getTime();
                                    j5 = 0;
                                    if (time > 0) {
                                        j6 = time / 10;
                                        i2 = a2.c;
                                        if (i2 == -1) {
                                            j7 = j10;
                                            j6 = Math.min(j6, TimeUnit.SECONDS.toMillis(i2));
                                        } else {
                                            j7 = j10;
                                        }
                                        int i7 = a2.i;
                                        long millis = i7 == -1 ? TimeUnit.SECONDS.toMillis(i7) : j5;
                                        if (!n.g && (i3 = a2.h) != -1) {
                                            j5 = TimeUnit.SECONDS.toMillis(i3);
                                        }
                                        if (!n.a) {
                                            long j11 = j7 + millis;
                                            if (j11 < j6 + j5) {
                                                u.a w = b.w();
                                                if (j11 >= j6) {
                                                    w.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                }
                                                if (j7 > TimeUtils.MILLISECONDS_PER_DAY && b.n().c == -1 && date == null) {
                                                    w.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                }
                                                rx8Var = new rx8(null, w.c());
                                                r5 = 0;
                                            }
                                        }
                                        if (str == null) {
                                            str8 = str4;
                                            str5 = str;
                                        } else if (date2 != null) {
                                            str5 = str2;
                                        } else if (date3 != null) {
                                            str5 = str3;
                                        } else {
                                            r5 = 0;
                                            rx8Var = new rx8(request, null);
                                        }
                                        k.a d = kVar2.d();
                                        d.d(str8, str5);
                                        p.a b2 = request.b();
                                        b2.c = d.e().d();
                                        rx8Var = new rx8(b2.b(), b);
                                        r5 = 0;
                                    }
                                    j6 = j5;
                                    i2 = a2.c;
                                    if (i2 == -1) {
                                    }
                                    int i72 = a2.i;
                                    if (i72 == -1) {
                                    }
                                    if (!n.g) {
                                        j5 = TimeUnit.SECONDS.toMillis(i3);
                                    }
                                    if (!n.a) {
                                    }
                                    if (str == null) {
                                    }
                                    k.a d2 = kVar2.d();
                                    d2.d(str8, str5);
                                    p.a b22 = request.b();
                                    b22.c = d2.e().d();
                                    rx8Var = new rx8(b22.b(), b);
                                    r5 = 0;
                                }
                            }
                            j5 = 0;
                            j6 = j5;
                            i2 = a2.c;
                            if (i2 == -1) {
                            }
                            int i722 = a2.i;
                            if (i722 == -1) {
                            }
                            if (!n.g) {
                            }
                            if (!n.a) {
                            }
                            if (str == null) {
                            }
                            k.a d22 = kVar2.d();
                            d22.d(str8, str5);
                            p.a b222 = request.b();
                            b222.c = d22.e().d();
                            rx8Var = new rx8(b222.b(), b);
                            r5 = 0;
                        }
                        j5 = 0;
                        i2 = a2.c;
                        if (i2 == -1) {
                        }
                        int i7222 = a2.i;
                        if (i7222 == -1) {
                        }
                        if (!n.g) {
                        }
                        if (!n.a) {
                        }
                        if (str == null) {
                        }
                        k.a d222 = kVar2.d();
                        d222.d(str8, str5);
                        p.a b2222 = request.b();
                        b2222.c = d222.e().d();
                        rx8Var = new rx8(b2222.b(), b);
                        r5 = 0;
                    }
                }
                r5 = 0;
                rx8Var = new rx8(request, null);
            } else {
                rx8Var = new rx8(request, null);
            }
        }
        if (rx8Var.a != null && request.a().j) {
            rx8Var = new rx8(r5, r5);
        }
        if (bVar != null) {
            bVar.n(rx8Var);
        }
        f8f0 f8f0Var = call instanceof f8f0 ? (f8f0) call : r5;
        if (f8f0Var == null || (obj = f8f0Var.f) == null) {
            obj = okhttp3.g.a;
        }
        okhttp3.u uVar = rx8Var.b;
        if (b != null && uVar == null && (m3 = b.m()) != null) {
            x2r0.c(m3);
        }
        okhttp3.p pVar = rx8Var.a;
        if (pVar == null && uVar == null) {
            u.a aVar2 = new u.a();
            aVar2.p(aVar.request());
            aVar2.m(Protocol.HTTP_1_1);
            aVar2.f(ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            aVar2.j("Unsatisfiable Request (only-if-cached)");
            aVar2.b(x2r0.c);
            aVar2.q(-1L);
            aVar2.n(System.currentTimeMillis());
            okhttp3.u c2 = aVar2.c();
            obj.getClass();
            return c2;
        }
        if (pVar == null) {
            u.a w2 = uVar.w();
            w2.d(a.a(uVar));
            okhttp3.u c3 = w2.c();
            obj.getClass();
            return c3;
        }
        if (uVar != null) {
            obj.getClass();
        } else if (bVar != null) {
            obj.getClass();
        }
        try {
            okhttp3.u a3 = aVar.a(pVar);
            if (a3 == null && b != null && m2 != null) {
            }
            if (uVar == null) {
                obj2 = obj;
            } else {
                if (a3 != null && a3.o() == 304) {
                    u.a w3 = uVar.w();
                    okhttp3.k s2 = uVar.s();
                    okhttp3.k s3 = a3.s();
                    k.a aVar3 = new k.a();
                    int size2 = s2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        String c4 = s2.c(i8);
                        String f2 = s2.f(i8);
                        if (str7.equalsIgnoreCase(c4)) {
                            obj3 = obj;
                            str6 = str7;
                            if (brm0.B(f2, "1", false)) {
                                i8++;
                                obj = obj3;
                                str7 = str6;
                            }
                        } else {
                            obj3 = obj;
                            str6 = str7;
                        }
                        if (Http.Header.CONTENT_LENGTH.equalsIgnoreCase(c4) || Http.Header.CONTENT_ENCODING.equalsIgnoreCase(c4) || "Content-Type".equalsIgnoreCase(c4) || !a.b(c4) || s3.a(c4) == null) {
                            aVar3.d(c4, f2);
                        }
                        i8++;
                        obj = obj3;
                        str7 = str6;
                    }
                    Object obj4 = obj;
                    int size3 = s3.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        String c5 = s3.c(i9);
                        if (!Http.Header.CONTENT_LENGTH.equalsIgnoreCase(c5) && !Http.Header.CONTENT_ENCODING.equalsIgnoreCase(c5) && !"Content-Type".equalsIgnoreCase(c5) && a.b(c5)) {
                            aVar3.d(c5, s3.f(i9));
                        }
                    }
                    w3.i(aVar3.e());
                    w3.q(a3.E());
                    w3.n(a3.z());
                    w3.d(a.a(uVar));
                    w3.k(a.a(a3));
                    okhttp3.u c6 = w3.c();
                    a3.m().close();
                    bVar.m();
                    okhttp3.b.o(uVar, c6);
                    obj4.getClass();
                    return c6;
                }
                obj2 = obj;
                okhttp3.v m4 = uVar.m();
                if (m4 != null) {
                    x2r0.c(m4);
                }
            }
            u.a w4 = a3.w();
            w4.d(a.a(uVar));
            w4.k(a.a(a3));
            okhttp3.u c7 = w4.c();
            if (bVar != null) {
                if (njv.a(c7) && rx8.a.a(pVar, c7)) {
                    b.d c8 = bVar.c(c7);
                    if (c8 != null) {
                        vw8 vw8Var = new vw8(c7.m().source(), c8, new d8f0(c8.b()));
                        String r = okhttp3.u.r("Content-Type", c7);
                        long contentLength = c7.m().contentLength();
                        u.a w5 = c7.w();
                        w5.b(new n8f0(r, contentLength, new e8f0(vw8Var)));
                        c7 = w5.c();
                    }
                    if (uVar != null) {
                        obj2.getClass();
                    }
                    return c7;
                }
                String str9 = pVar.b;
                if (str9.equals("POST") || str9.equals("PATCH") || str9.equals("PUT") || str9.equals("DELETE") || str9.equals("MOVE")) {
                    try {
                        bVar.h(pVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c7;
        } finally {
            if (b != null && (m = b.m()) != null) {
                x2r0.c(m);
            }
        }
    }
}
