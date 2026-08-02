package xsna;

import android.net.Uri;
import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.http.HttpApiEndpointProvider;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.android.commons.http.Http;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.HttpHeader;
import ru.ok.android.commons.http.HttpRequest;
import ru.ok.android.commons.http.HttpResponse;
import ru.ok.android.commons.http.TcpHttpClient;

/* compiled from: OneLog.kt */
/* loaded from: classes11.dex */
public final class ui80 {
    public static final Uri a = Uri.parse("https://api.mycdn.me");
    public static final Uri b = Uri.parse("https://videotestapi.ok.ru");
    public static gyp0 c;
    public static b d;

    /* compiled from: OneLog.kt */
    public static final class a implements HttpApiEndpointProvider {
        public final Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        @Override // ru.ok.android.api.http.HttpApiEndpointProvider
        public final Uri getApiEndpoint(String str) throws NoHttpApiEndpointException {
            if (str.equals("api")) {
                return this.a;
            }
            throw new NoHttpApiEndpointException(str);
        }
    }

    /* compiled from: OneLog.kt */
    public static final class b implements HttpClient {
        public final xn80 a;
        public final TcpHttpClient b;
        public final AtomicBoolean c;

        public b(xn80 xn80Var) {
            this.a = xn80Var;
            Uri uri = ui80.a;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            b260.o.getClass();
            int millis = (int) timeUnit.toMillis(b260.p.f);
            this.b = new TcpHttpClient().setReadTimeout(millis).setConnectTimeout(millis);
            this.c = new AtomicBoolean(false);
        }

        @Override // ru.ok.android.commons.http.HttpClient
        public final HttpResponse execute(HttpRequest httpRequest) {
            HttpHeader httpHeader;
            String value;
            int i = 1;
            if (this.c.compareAndSet(true, false)) {
                L.A("OneLogVk", "user login status changed, expire session");
                throw new ApiInvocationException(102, "session expired");
            }
            StringBuilder sb = new StringBuilder("user is ");
            sb.append(o25.a().b() ? "logged in" : "anon");
            sb.append(", executing ");
            Uri uri = ui80.a;
            sb.append("req {" + httpRequest.getMethod() + ' ' + httpRequest.getUrl() + "; " + j5g.g0(httpRequest.getHeaders(), null, null, null, 0, new kl60(i), 31) + '}');
            L.A("OneLogVk", sb.toString());
            HttpResponse execute = this.b.execute(httpRequest);
            StringBuilder sb2 = new StringBuilder("< ");
            sb2.append("res {" + execute.getStatusCode() + "; " + j5g.g0(execute.getHeaders(), null, null, null, 0, new y510(9), 31) + '}');
            L.A("OneLogVk", sb2.toString());
            Iterator<HttpHeader> it = execute.getHeaders().iterator();
            while (true) {
                if (!it.hasNext()) {
                    httpHeader = null;
                    break;
                }
                httpHeader = it.next();
                if (httpHeader.nameMatches(Http.Header.INVOCATION_ERROR)) {
                    break;
                }
            }
            HttpHeader httpHeader2 = httpHeader;
            Integer m = (httpHeader2 == null || (value = httpHeader2.getValue()) == null) ? null : arm0.m(10, value);
            if ((m == null || m.intValue() != 103) && ((m == null || m.intValue() != 102) && (m == null || m.intValue() != 401))) {
                return execute;
            }
            xn80 xn80Var = this.a;
            xn80Var.c.set(true);
            xn80Var.f = null;
            return execute;
        }
    }
}
