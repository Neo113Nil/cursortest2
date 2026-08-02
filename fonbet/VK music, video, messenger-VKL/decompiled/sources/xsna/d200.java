package xsna;

import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.commons.http.Http;
import xsna.dky;
import xsna.zjv;

/* compiled from: LoggingInterceptor.kt */
/* loaded from: classes.dex */
public final class d200 implements ojv, uz80 {
    public final hky a;
    public final gzs<String> b;
    public final la4 c;
    public final pjy d;
    public final y35 e;
    public final rjy f;
    public final AtomicInteger g = new AtomicInteger(1);
    public final ThreadLocal<String> h = new ThreadLocal<>();

    public d200(hky hkyVar, dky.b bVar, la4 la4Var, pjy pjyVar, y35 y35Var, qjy qjyVar, rjy rjyVar) {
        this.a = hkyVar;
        this.b = bVar;
        this.c = la4Var;
        this.d = pjyVar;
        this.e = y35Var;
        this.f = rjyVar;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        mkv c;
        long elapsedRealtime;
        ArrayList arrayList;
        StringBuilder sb;
        boolean z;
        boolean z2;
        ArrayList arrayList2;
        d200 d200Var = this;
        d200Var.h.set(d200Var.b.invoke());
        int andIncrement = d200Var.g.getAndIncrement();
        boolean booleanValue = ((Boolean) d200Var.c.invoke(aVar.b())).booleanValue();
        y35 y35Var = d200Var.e;
        if (!booleanValue) {
            if (booleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            String id = aVar.a().b().getId();
            ckv b = aVar.b();
            String str = (String) y35Var.invoke(b.j());
            d200Var.b("----> [" + id + ':' + andIncrement + "] " + b.g() + ' ' + str);
            try {
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                mkv c2 = aVar.c(b);
                d200Var.b("<---- [" + id + ':' + andIncrement + "] " + c2.r() + ' ' + c2.s() + ' ' + c2.t() + ' ' + str + " (" + (SystemClock.elapsedRealtime() - elapsedRealtime2) + "ms)");
                return c2;
            } catch (Throwable th) {
                d200Var.e(id, andIncrement, b, th);
                throw th;
            }
        }
        String id2 = aVar.a().b().getId();
        ckv b2 = aVar.b();
        String str2 = (String) y35Var.invoke(b2.j());
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("----> [" + id2 + ':' + andIncrement + "] Request");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b2.g());
        sb2.append(' ');
        sb2.append(str2);
        arrayList3.add(sb2.toString());
        if (!b2.e().isEmpty()) {
            for (Map.Entry<String, List<String>> entry : b2.e().entrySet()) {
                String key = entry.getKey();
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList3.add(key + ": " + ((String) it.next()));
                }
            }
        }
        dkv b3 = b2.b();
        rjy rjyVar = d200Var.f;
        if (b3 == null) {
            arrayList3.add("<empty>");
        } else if (b3 instanceof fkv) {
            arrayList3.add(rjyVar.invoke(null));
        } else if (!(b3 instanceof ekv)) {
            arrayList3.add("<binary>");
        } else if (zjy.b(b2)) {
            arrayList3.add(rjyVar.invoke(zq70.m(3, ((ekv) b3).getContent())));
        }
        arrayList3.add("----> [" + id2 + ':' + andIncrement + "] End of request");
        d200Var.c(arrayList3);
        try {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            c = aVar.c(b2);
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime3;
            arrayList = new ArrayList();
            sb = new StringBuilder();
            sb.append("<---- [");
            sb.append(id2);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            sb.append(':');
            sb.append(andIncrement);
            sb.append("] Response");
            arrayList.add(sb.toString());
            arrayList.add(c.r() + ' ' + c.s() + ' ' + c.t() + ' ' + str2 + " (" + elapsedRealtime + "ms)");
            if (!c.q().isEmpty()) {
                for (Map.Entry<String, List<String>> entry2 : c.q().entrySet()) {
                    String key2 = entry2.getKey();
                    Iterator<T> it2 = entry2.getValue().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(key2 + ": " + ((String) it2.next()));
                    }
                }
            }
            okv n = c.n();
            long contentLength = c.getContentLength();
            boolean v = c.v();
            String c3 = b2.c(Http.Header.ACCEPT);
            boolean equalsIgnoreCase = c3 != null ? c3.equalsIgnoreCase("text/event-stream") : false;
            String o = c.o("Content-type");
            if (o != null) {
                z = true;
                z2 = drm0.D(o, "application/x-msgpack", true);
            } else {
                z = true;
                z2 = false;
            }
            if (n == null || equalsIgnoreCase) {
                z = false;
            }
            if (!z || !v) {
                if (!z || !z2) {
                    arrayList2 = arrayList;
                    String str3 = contentLength < 0 ? "unknown size" : contentLength + " bytes";
                    if (contentLength == 0) {
                        arrayList2.add("<empty>");
                    } else if (v) {
                        arrayList2.add("<text-omitted> (" + str3 + ')');
                    } else {
                        arrayList2.add("<binary> (" + str3 + ')');
                    }
                } else if (n != null) {
                    try {
                        byte[] m = n.m();
                        qn30 qn30Var = new qn30(mq9.d(new ByteArrayInputStream(m)));
                        vl8 vl8Var = new vl8();
                        Charset charset = emb.b;
                        vl8Var.L2(qn30Var);
                        arrayList2 = arrayList;
                        arrayList2.add(rjyVar.invoke(vl8Var.w(vl8Var.c, charset)));
                        c = mkv.b(c, null, n.p(new ByteArrayInputStream(m)), 31);
                        s3q0 s3q0Var = s3q0.a;
                        n.close();
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                arrayList2.add("<---- [" + id2 + ':' + andIncrement + "] End of Response");
                d200Var = this;
                d200Var.c(arrayList2);
                return c;
            }
            if (n != null) {
                try {
                    String o2 = n.o();
                    arrayList.add(rjyVar.invoke(o2));
                    c = mkv.b(c, null, n.p(new ByteArrayInputStream(o2.getBytes(emb.b))), 31);
                    s3q0 s3q0Var2 = s3q0.a;
                    n.close();
                } finally {
                }
            }
            arrayList2 = arrayList;
            arrayList2.add("<---- [" + id2 + ':' + andIncrement + "] End of Response");
            d200Var = this;
            d200Var.c(arrayList2);
            return c;
        } catch (Throwable th3) {
            th = th3;
            d200Var = this;
            d200Var.e(id2, andIncrement, b2, th);
            throw th;
        }
    }

    public final void b(String str) {
        if (drm0.N(str)) {
            return;
        }
        this.a.a(this.h.get() + ' ' + str);
    }

    public final void c(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!drm0.N(str)) {
                this.a.a(this.h.get() + ' ' + drm0.r0(str).toString());
            }
        }
    }

    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!drm0.N(str)) {
                this.a.b(this.h.get() + ' ' + drm0.r0(str).toString());
            }
        }
    }

    public final void e(String str, int i, ckv ckvVar, Throwable th) {
        boolean booleanValue = ((Boolean) this.d.invoke(ckvVar, th)).booleanValue();
        String str2 = (String) this.e.invoke(ckvVar.j());
        if (!booleanValue) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("<---- [" + str + ':' + i + "] " + str2);
            arrayList.add("<---- [" + str + ':' + i + "] " + th.getClass().getSimpleName() + ": " + th.getMessage());
            d(arrayList);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("<---- [" + str + ':' + i + "] Response");
        arrayList2.add(str2);
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            arrayList2.addAll(drm0.Q(stringWriter2));
            arrayList2.add("<---- [" + str + ':' + i + "] End of Response");
            d(arrayList2);
        } catch (Throwable th2) {
            printWriter.close();
            stringWriter.close();
            throw th2;
        }
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "Logging";
    }
}
