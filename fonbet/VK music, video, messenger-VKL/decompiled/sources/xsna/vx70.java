package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.IgnoredAccessTokenException;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.api.sdk.exceptions.VKLargeEntityException;
import com.vk.api.sdk.utils.log.Logger;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import okhttp3.c;
import okhttp3.k;
import okhttp3.m;
import okhttp3.n;
import okhttp3.p;
import okhttp3.t;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import ru.ok.android.sdk.SharedKt;
import xsna.xjv;

/* compiled from: OkHttpExecutor.kt */
/* loaded from: classes.dex */
public class vx70 {
    public final u8y a;
    public final Context b;
    public final ox70 c;
    public final bpn0 d;
    public volatile Lazy<? extends List<h7r0>> e;
    public final bpn0 f;
    public final String g;
    public volatile String h;

    /* compiled from: OkHttpExecutor.kt */
    /* loaded from: classes15.dex */
    public static final class a {
        public final JSONObject a;
        public final okhttp3.k b;
        public final String c;

        public /* synthetic */ a(JSONObject jSONObject, okhttp3.k kVar) {
            this(jSONObject, kVar, null);
        }

        public final String a() {
            return this.c;
        }

        public final okhttp3.k b() {
            return this.b;
        }

        public final JSONObject c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            JSONObject jSONObject = this.a;
            int hashCode = (((jSONObject == null ? 0 : jSONObject.hashCode()) * 31) + Arrays.hashCode(this.b.b)) * 31;
            String str = this.c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecutorResponse(responseBodyJson=");
            sb.append(this.a);
            sb.append(", headers=");
            sb.append(this.b);
            sb.append(", executorRequestAccessToken=");
            return i5s.a(sb, this.c, ")");
        }

        public a(JSONObject jSONObject, okhttp3.k kVar, String str) {
            this.a = jSONObject;
            this.b = kVar;
            this.c = str;
        }
    }

    /* compiled from: OkHttpExecutor.kt */
    /* loaded from: classes15.dex */
    public static final class b {
        public final InputStream a;
        public final okhttp3.k b;
        public final String c;

        public b(InputStream inputStream, okhttp3.k kVar, String str) {
            this.a = inputStream;
            this.b = kVar;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final okhttp3.k b() {
            return this.b;
        }

        public final InputStream c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            InputStream inputStream = this.a;
            int hashCode = (((inputStream == null ? 0 : inputStream.hashCode()) * 31) + Arrays.hashCode(this.b.b)) * 31;
            String str = this.c;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecutorResponseStream(stream=");
            sb.append(this.a);
            sb.append(", headers=");
            sb.append(this.b);
            sb.append(", executorRequestAccessToken=");
            return i5s.a(sb, this.c, ")");
        }
    }

    public vx70(u8y u8yVar) {
        this.a = u8yVar;
        VKApiConfig vKApiConfig = (VKApiConfig) u8yVar.b;
        this.b = vKApiConfig.a;
        this.c = vKApiConfig.L;
        this.d = new bpn0(new cia(this, 7));
        this.e = vKApiConfig.k;
        this.f = new bpn0(new qb8(5));
        this.g = (String) ((VKApiConfig) u8yVar.b).t.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r1 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(okhttp3.u uVar) {
        String string;
        if (uVar.o() == 413) {
            throw new VKLargeEntityException(uVar.v());
        }
        int o = uVar.o();
        if (500 > o || o >= 600) {
            return;
        }
        int o2 = uVar.o();
        okhttp3.v m = uVar.m();
        if (m != null) {
            try {
                string = m.string();
                m.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ro.e(m, th);
                    throw th2;
                }
            }
        }
        string = "null";
        throw new VKInternalServerErrorException(o2, string);
    }

    public static void q(gy70 gy70Var, String str) throws VKApiException {
        List<String> queryParameters;
        if (brm0.B(gy70Var.d, "execute.", false)) {
            Uri parse = Uri.parse("https://" + a0a.d + "/?" + str);
            if (parse.getQueryParameters("method").contains("execute") && (queryParameters = parse.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                throw new VKApiExecutionException(15, gy70Var.d, false, "Hey dude don't execute your hacky code ;)", null, null, null, null, 0, null, null, null, 4080);
            }
        }
    }

    public c200 c(boolean z, d13 d13Var, w03 w03Var) {
        return new c200(z, e43.l(SharedKt.PARAM_ACCESS_TOKEN, "key", SharedKt.PARAM_CLIENT_SECRET, "webview_access_token", "webview_refresh_token", "exchange_token", "exchange_tokens", "common_token"), d13Var, w03Var);
    }

    public final a d(gy70 gy70Var) throws InterruptedException, IOException, VKApiException {
        okhttp3.u f = f(gy70Var);
        return new a(o(f), f.s(), i7r0.a(this.e.getValue()));
    }

    public final a e(ly70 ly70Var, m7r0 m7r0Var) throws InterruptedException, IOException, VKApiException {
        okhttp3.t a2;
        if (ly70Var.c()) {
            n.a aVar = new n.a(0);
            aVar.d(okhttp3.n.h);
            for (Map.Entry entry : ((HashMap) ly70Var.a()).entrySet()) {
                String str = (String) entry.getKey();
                xjv xjvVar = (xjv) entry.getValue();
                if (xjvVar instanceof xjv.b) {
                    aVar.a(str, ((xjv.b) xjvVar).a());
                } else if (xjvVar instanceof xjv.a) {
                    xjv.a aVar2 = (xjv.a) xjvVar;
                    v8r v8rVar = new v8r(this.b, aVar2.b());
                    String a3 = aVar2.a();
                    if (a3 == null) {
                        a3 = "";
                    }
                    aVar.b(str, URLEncoder.encode(brm0.y(a3, "\"", "\\\""), C.UTF8_NAME), v8rVar);
                }
            }
            a2 = aVar.c();
        } else {
            Map<String, xjv> a4 = ly70Var.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : ((HashMap) a4).entrySet()) {
                if (((xjv) entry2.getValue()) instanceof xjv.b) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                arrayList.add(((String) entry3.getKey()) + "=" + URLEncoder.encode(((xjv.b) entry3.getValue()).a(), C.UTF8_NAME));
            }
            String g0 = j5g.g0(arrayList, "&", null, null, 0, null, 62);
            t.a aVar3 = okhttp3.t.Companion;
            Pattern pattern = okhttp3.m.e;
            okhttp3.m a5 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
            aVar3.getClass();
            a2 = t.a.a(g0, a5);
        }
        okhttp3.u g = g(n(ly70Var, new f3e0(a2, m7r0Var)).b());
        return new a(o(g), g.s());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u f(gy70 gy70Var) {
        okhttp3.m mVar;
        String a2;
        p.a aVar;
        String str;
        okhttp3.c cVar;
        String i = i(gy70Var);
        String str2 = gy70Var.d;
        if (this.h != null && i != null && i.equals(this.h)) {
            throw new IgnoredAccessTokenException(str2);
        }
        String j = j(gy70Var);
        a(gy70Var);
        kpe0 kpe0Var = kpe0.a;
        String str3 = gy70Var.d;
        LinkedHashMap linkedHashMap = gy70Var.f;
        String str4 = gy70Var.e;
        int i2 = ((VKApiConfig) this.a.b).b;
        boolean z = gy70Var.k;
        List<h7r0> value = this.e.getValue();
        ArrayList arrayList = new ArrayList(c5g.u(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((h7r0) it.next()).a);
        }
        String d = kpe0Var.d(str3, linkedHashMap, str4, null, j, i2, z, arrayList, gy70Var.m);
        t.a aVar2 = okhttp3.t.Companion;
        q(gy70Var, d);
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar2.getClass();
        okhttp3.s a3 = t.a.a(d, mVar);
        String str5 = gy70Var.a;
        if (str5 == null) {
            str5 = ((VKApiConfig) this.a.b).p.invoke();
        }
        if (this.g.length() != 0) {
            if (!epx.f(this.g, "https://" + "api.".concat(a0a.d) + "/method")) {
                a2 = this.g;
                gy70Var.o = a2;
                aVar = new p.a();
                aVar.f("POST", a3);
                aVar.i(gy70Var.o + DomExceptionUtils.SEPARATOR + gy70Var.d);
                str = gy70Var.c;
                if (str == null) {
                    okhttp3.c cVar2 = okhttp3.c.n;
                    k.a aVar3 = new k.a();
                    aVar3.b("Cache-Control", str);
                    cVar = c.b.a(aVar3.e());
                } else {
                    cVar = okhttp3.c.n;
                }
                aVar.c(cVar);
                l8g0 l8g0Var = gy70Var.h;
                aVar.h(Map.class, l8g0Var != null ? l8g0Var.a() : null);
                if (!gy70Var.k && !gy70Var.m && i != null && !drm0.N(i)) {
                    aVar.c.h(Http.Header.AUTHORIZATION, "Bearer ".concat(i));
                }
                return g(aVar.b());
            }
        }
        a2 = zr.a("https://", str5, "/method");
        gy70Var.o = a2;
        aVar = new p.a();
        aVar.f("POST", a3);
        aVar.i(gy70Var.o + DomExceptionUtils.SEPARATOR + gy70Var.d);
        str = gy70Var.c;
        if (str == null) {
        }
        aVar.c(cVar);
        l8g0 l8g0Var2 = gy70Var.h;
        aVar.h(Map.class, l8g0Var2 != null ? l8g0Var2.a() : null);
        if (!gy70Var.k) {
            aVar.c.h(Http.Header.AUTHORIZATION, "Bearer ".concat(i));
        }
        return g(aVar.b());
    }

    public final okhttp3.u g(okhttp3.p pVar) throws InterruptedException, IOException {
        okhttp3.d a2 = ((com.vk.api.sdk.b) this.d.getValue()).a().a(pVar);
        ox70 ox70Var = this.c;
        if (ox70Var != null) {
            ox70Var.a((f8f0) a2);
        }
        try {
            return ((f8f0) a2).execute();
        } finally {
            if (ox70Var != null) {
                ox70Var.b((f8f0) a2);
            }
        }
    }

    public final b h(gy70 gy70Var) throws InterruptedException, IOException, VKApiException {
        okhttp3.u f = f(gy70Var);
        return new b(p(f), f.s(), i7r0.a(this.e.getValue()));
    }

    public String i(gy70 gy70Var) {
        return i7r0.a(this.e.getValue());
    }

    public String j(gy70 gy70Var) {
        return i7r0.b(this.e.getValue());
    }

    public final boolean k() {
        List<h7r0> value = this.e.getValue();
        if ((value instanceof Collection) && value.isEmpty()) {
            return true;
        }
        for (h7r0 h7r0Var : value) {
            if (drm0.N(h7r0Var.a)) {
                return false;
            }
            int i = h7r0Var.c;
            if (i > 0) {
                if ((i * 0.95d * 1000) + h7r0Var.d <= System.currentTimeMillis()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean l() {
        return !drm0.N(i7r0.a(this.e.getValue()));
    }

    public final void m(String str) {
        ((VKApiConfig) this.a.b).i.a(Logger.LogLevel.VERBOSE, "[SET CREDENTIALS IN API] ".concat(((p2i0) this.f.getValue()).a(str)), null);
    }

    public p.a n(ly70 ly70Var, f3e0 f3e0Var) {
        p.a aVar = new p.a();
        aVar.f("POST", f3e0Var);
        aVar.i(ly70Var.b());
        aVar.c(okhttp3.c.n);
        return aVar;
    }

    public final JSONObject o(okhttp3.u uVar) {
        InputStream byteStream;
        b(uVar);
        okhttp3.v m = uVar.m();
        if (m == null || (byteStream = m.byteStream()) == null) {
            return null;
        }
        return ((lbg0) ((VKApiConfig) this.a.b).M.getValue()).a(byteStream, uVar.s().a("content-type"), uVar.A().a.b());
    }

    public final InputStream p(okhttp3.u uVar) {
        b(uVar);
        okhttp3.v m = uVar.m();
        if (m != null) {
            return ((mbg0) ((VKApiConfig) this.a.b).N.getValue()).a(m, uVar.s().a("content-type"), uVar.A().a.b());
        }
        return null;
    }

    public void a(gy70 gy70Var) {
    }
}
