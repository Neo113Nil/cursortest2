package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.ironsource.B5;
import io.opentelemetry.api.trace.StatusCode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import kotlin.Result;
import okhttp3.Interceptor;
import okhttp3.p;
import ru.ok.tracer.opentelemetry.traceparent.TraceParentUtil;

/* compiled from: OpenTelemetryHttpInterceptor.kt */
/* loaded from: classes17.dex */
public final class ns80 implements Interceptor {
    public static final List<String> b = e43.l("cookie", "user-agent", "x-screen");
    public final bpn0 a;

    /* compiled from: OpenTelemetryHttpInterceptor.kt */
    public static final class a {
        public static jk3 a(String str, LinkedHashMap linkedHashMap) {
            lk3 lk3Var = new lk3();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                StringBuilder a = t33.a("http.", str, ".header.");
                a.append((String) entry.getKey());
                lk3Var.b(a.toString(), j5g.g0((Iterable) entry.getValue(), null, null, null, 0, new rxc0(1), 31));
            }
            return lk3Var.e();
        }
    }

    public ns80(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object failure;
        List<String> list;
        String sb;
        List<String> pathSegments;
        int indexOf;
        okhttp3.p request = aVar.request();
        okhttp3.l lVar = request.a;
        String str = request.b;
        okhttp3.k kVar = request.c;
        Uri parse = Uri.parse(lVar.i);
        String queryParameter = (parse == null || (indexOf = (pathSegments = parse.getPathSegments()).indexOf("id")) == -1 || indexOf >= pathSegments.size() + (-1)) ? parse != null ? parse.getQueryParameter("id") : null : pathSegments.get(indexOf + 1);
        if (queryParameter != null) {
            ohk0 h = ((com.vk.core.telemetry.a) this.a.getValue()).h(new ljp0(Uri.parse(lVar.i), str, kVar.a("range")));
            if (h != null) {
                sm5 sm5Var = (sm5) h.i();
                if (sm5Var.f) {
                    ok3 ok3Var = sm5Var.e;
                    String str2 = "00-" + sm5Var.b + '-' + sm5Var.c + '-' + sm5Var.d;
                    if (ok3Var.b().isEmpty()) {
                        sb = "";
                    } else {
                        final StringBuilder sb2 = new StringBuilder();
                        ok3Var.a(new BiConsumer() { // from class: xsna.ms80
                            @Override // java.util.function.BiConsumer
                            public final void accept(Object obj, Object obj2) {
                                String str3 = (String) obj;
                                String str4 = (String) obj2;
                                StringBuilder sb3 = sb2;
                                if (sb3.length() > 0) {
                                    sb3.append(',');
                                }
                                sb3.append(str3);
                                sb3.append(B5.U);
                                sb3.append(str4);
                            }
                        });
                        sb = sb2.toString();
                    }
                    p.a b2 = request.b();
                    b2.c.h(TraceParentUtil.HTTP_HEADER_TRACE_PARENT, str2);
                    if (sb.length() > 0) {
                        b2.c.h(TraceParentUtil.HTTP_HEADER_TRACE_STATE, sb);
                    }
                    request = b2.b();
                }
                try {
                    failure = aVar.a(request);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                lk3 lk3Var = new lk3();
                lk3Var.b("http.request.method", str);
                lk3Var.b("url.full", lVar.i);
                TreeMap e = kVar.e();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = e.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    list = b;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!list.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                lk3Var.g(a.a("request", linkedHashMap));
                h.d(lk3Var.e());
                lk3 lk3Var2 = new lk3();
                boolean z = failure instanceof Result.Failure;
                if (!z) {
                    okhttp3.u uVar = (okhttp3.u) (z ? null : failure);
                    if (uVar != null) {
                        TreeMap e2 = uVar.g.e();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : e2.entrySet()) {
                            if (!list.contains(entry2.getKey())) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        lk3Var2.g(a.a("response", linkedHashMap2));
                        lk3Var2.a(uVar.e, "http.response.status_code");
                        lk3Var2.b("protocol.name", uVar.c.name());
                    }
                }
                h.d(lk3Var2.e());
                Throwable a2 = Result.a(failure);
                if (a2 != null) {
                    h.e(StatusCode.ERROR, a2.getClass().getName());
                }
                new Handler(Looper.getMainLooper()).post(new ls80(this, queryParameter, h, 0));
                kotlin.a.a(failure);
                return (okhttp3.u) failure;
            }
        }
        return aVar.a(aVar.request());
    }
}
