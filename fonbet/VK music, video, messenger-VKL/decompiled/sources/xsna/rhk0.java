package xsna;

import android.net.Uri;
import com.ironsource.D1;
import com.vk.core.telemetry.Utils$VideoContentQuality;
import com.vk.core.telemetry.Utils$VideoContentType;
import io.opentelemetry.api.common.AttributeType;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import xsna.rhk0;

/* compiled from: SpanContextHolder.kt */
/* loaded from: classes17.dex */
public final class rhk0 implements com.vk.core.telemetry.a {
    public static final wdp0 f = m1u.a("one-video");
    public static final xfx g = xfx.a(AttributeType.BOOLEAN, "isNetwork");
    public final ConcurrentHashMap<String, ohk0> a = new ConcurrentHashMap<>();
    public final HashMap<String, Boolean> b = new HashMap<>();
    public final ConcurrentHashMap<ljp0, ohk0> c = new ConcurrentHashMap<>();
    public final ExecutorService d;
    public final b e;

    /* compiled from: SpanContextHolder.kt */
    public static final class a {
        public static final ljp0 a(evk evkVar) {
            wdp0 wdp0Var = rhk0.f;
            return new ljp0(evkVar.a, evk.b(evkVar.c), blv.a(evkVar.g, evkVar.h));
        }
    }

    public rhk0() {
        ExecutorService b2;
        b2 = asu0.a.b((r5 & 2) != 0 ? 1 : 5, (r5 & 4) != 0 ? 0L : 1000L, "tracing-transfer-executor");
        this.d = b2;
        this.e = new b();
    }

    @Override // com.vk.core.telemetry.a
    public final ohk0 a(String str) {
        return this.a.remove(str);
    }

    @Override // com.vk.core.telemetry.a
    public final ohk0 b(Long l, String str) {
        ConcurrentHashMap<String, ohk0> concurrentHashMap = this.a;
        ohk0 ohk0Var = concurrentHashMap.get(str);
        if (ohk0Var == null) {
            ohk0 e = f.a("player").b().c(l != null ? l.longValue() : -1L).setAttribute("content.id", str).e();
            ohk0 putIfAbsent = concurrentHashMap.putIfAbsent(str, e);
            ohk0Var = putIfAbsent == null ? e : putIfAbsent;
        }
        return ohk0Var;
    }

    @Override // com.vk.core.telemetry.a
    public final void c(String str, ohk0 ohk0Var) {
        if (this.b.containsKey(str)) {
            ohk0Var.e(StatusCode.ERROR, "BUFFERING!!");
        }
    }

    @Override // com.vk.core.telemetry.a
    public final void d(String str) {
        this.b.put(str, Boolean.TRUE);
    }

    @Override // com.vk.core.telemetry.a
    public final void e(es80 es80Var) {
        Iterator<Map.Entry<String, ohk0>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            es80Var.invoke(it.next());
        }
    }

    @Override // com.vk.core.telemetry.a
    public final ohk0 f(String str) {
        return this.a.get(str);
    }

    @Override // com.vk.core.telemetry.a
    public final void g(String str) {
        this.b.remove(str);
    }

    @Override // xsna.qjp0
    public final ohk0 h(ljp0 ljp0Var) {
        return (ohk0) this.d.submit(new nme0(1, this, ljp0Var)).get();
    }

    @Override // com.vk.core.telemetry.a
    public final mjp0 i() {
        return this.e;
    }

    /* compiled from: SpanContextHolder.kt */
    public static final class b implements mjp0 {
        public b() {
        }

        @Override // xsna.mjp0
        public final void e(androidx.media3.datasource.a aVar, final evk evkVar, final boolean z) {
            final rhk0 rhk0Var = rhk0.this;
            rhk0Var.d.submit(new Runnable() { // from class: xsna.shk0
                @Override // java.lang.Runnable
                public final void run() {
                    String a;
                    String a2;
                    List<String> pathSegments;
                    int indexOf;
                    List<String> pathSegments2;
                    int indexOf2;
                    List<String> pathSegments3;
                    int indexOf3;
                    boolean z2 = z;
                    evk evkVar2 = evk.this;
                    Uri uri = evkVar2.a;
                    String queryParameter = (uri == null || (indexOf3 = (pathSegments3 = uri.getPathSegments()).indexOf("id")) == -1 || indexOf3 >= pathSegments3.size() + (-1)) ? uri != null ? uri.getQueryParameter("id") : null : pathSegments3.get(indexOf3 + 1);
                    if (queryParameter == null) {
                        return;
                    }
                    rhk0 rhk0Var2 = rhk0Var;
                    ohk0 b = rhk0Var2.b(null, queryParameter);
                    v9h0 makeCurrent = b != null ? b.makeCurrent() : null;
                    try {
                        Uri parse = Uri.parse(evkVar2.a.toString());
                        phk0 a3 = rhk0.f.a(D1.i).d(SpanKind.CLIENT).a(z2);
                        if (parse == null || (indexOf2 = (pathSegments2 = parse.getPathSegments()).indexOf("ct")) == -1 || indexOf2 >= pathSegments2.size() - 1) {
                            Utils$VideoContentType.a aVar2 = Utils$VideoContentType.Companion;
                            String queryParameter2 = parse != null ? parse.getQueryParameter("ct") : null;
                            aVar2.getClass();
                            a = Utils$VideoContentType.a.a(queryParameter2);
                        } else {
                            Utils$VideoContentType.a aVar3 = Utils$VideoContentType.Companion;
                            String str = pathSegments2.get(indexOf2 + 1);
                            aVar3.getClass();
                            a = Utils$VideoContentType.a.a(str);
                        }
                        phk0 attribute = a3.setAttribute("contentType", a);
                        if (parse == null || (indexOf = (pathSegments = parse.getPathSegments()).indexOf("type")) == -1 || indexOf >= pathSegments.size() - 1) {
                            Utils$VideoContentQuality.a aVar4 = Utils$VideoContentQuality.Companion;
                            String queryParameter3 = parse != null ? parse.getQueryParameter("type") : null;
                            aVar4.getClass();
                            a2 = Utils$VideoContentQuality.a.a(queryParameter3);
                        } else {
                            Utils$VideoContentQuality.a aVar5 = Utils$VideoContentQuality.Companion;
                            String str2 = pathSegments.get(indexOf + 1);
                            aVar5.getClass();
                            a2 = Utils$VideoContentQuality.a.a(str2);
                        }
                        if (a2 == null) {
                            a2 = "";
                        }
                        rhk0Var2.c.putIfAbsent(rhk0.a.a(evkVar2), attribute.setAttribute("quality", a2).e());
                        s3q0 s3q0Var = s3q0.a;
                        yfb.d(makeCurrent, null);
                    } finally {
                    }
                }
            });
        }

        @Override // xsna.mjp0
        public final void g(androidx.media3.datasource.a aVar, final evk evkVar, final boolean z) {
            final rhk0 rhk0Var = rhk0.this;
            rhk0Var.d.submit(new Runnable() { // from class: xsna.uhk0
                @Override // java.lang.Runnable
                public final void run() {
                    ConcurrentHashMap<ljp0, ohk0> concurrentHashMap = rhk0Var.c;
                    wdp0 wdp0Var = rhk0.f;
                    ohk0 ohk0Var = concurrentHashMap.get(rhk0.a.a(evkVar));
                    if (ohk0Var != null) {
                        ohk0Var.j("transferStart", q94.j(rhk0.g, Boolean.valueOf(z)));
                    }
                }
            });
        }

        @Override // xsna.mjp0
        public final void h(androidx.media3.datasource.a aVar, final evk evkVar, final boolean z) {
            final rhk0 rhk0Var = rhk0.this;
            rhk0Var.d.submit(new Runnable() { // from class: xsna.thk0
                @Override // java.lang.Runnable
                public final void run() {
                    ConcurrentHashMap<ljp0, ohk0> concurrentHashMap = rhk0Var.c;
                    wdp0 wdp0Var = rhk0.f;
                    ohk0 remove = concurrentHashMap.remove(rhk0.a.a(evkVar));
                    if (remove != null) {
                        remove.j("onTransferEnd", q94.j(rhk0.g, Boolean.valueOf(z)));
                        remove.end();
                    }
                }
            });
        }

        @Override // xsna.mjp0
        public final void f(androidx.media3.datasource.a aVar, evk evkVar, boolean z, int i) {
        }
    }
}
