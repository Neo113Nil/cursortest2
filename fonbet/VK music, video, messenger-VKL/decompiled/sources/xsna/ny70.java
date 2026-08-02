package xsna;

import android.net.Uri;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.InetAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import okhttp3.l;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;
import ru.ok.android.sdk.SharedKt;

/* compiled from: OkHttpProxyClient.kt */
/* loaded from: classes.dex */
public final class ny70 {
    public final rx70 a;
    public final Object b;
    public final bpn0 c = new bpn0(new q12(this, 6));
    public final bpn0 d = new bpn0(new wh(this, 3));

    /* compiled from: OkHttpProxyClient.kt */
    public static final class a {
        public final okhttp3.u a;

        public a(okhttp3.u uVar, boolean z) {
            this.a = uVar;
        }
    }

    public ny70(rx70 rx70Var, Lazy<rx70> lazy) {
        this.a = rx70Var;
        this.b = lazy;
    }

    public static okhttp3.p b(p.a aVar, String str) {
        okhttp3.m mVar;
        List<String> queryParameters;
        vx2.a.getClass();
        VKApiConfig vKApiConfig = vx2.b().a;
        o260 o260Var = d260.a;
        if (o260Var == null) {
            o260Var = null;
        }
        String a2 = o260Var.l.a();
        String h = o25.a().h();
        o25.a().getClass();
        aVar.c.b("User-Agent", a2);
        aVar.c.b("X-VK-Android-Client", "new");
        aVar.c.b("X-Get-Processing-Time", "1");
        LinkedHashMap m = pn00.m(new Pair("device_id", vKApiConfig.f.getValue()), new Pair("lang", vKApiConfig.b()));
        if (h.length() == 0) {
            m.put("client_id", String.valueOf(vx2.b));
            m.put(SharedKt.PARAM_CLIENT_SECRET, vx2.c);
        }
        t.a aVar2 = okhttp3.t.Companion;
        String d = kpe0.a.d("account.getGeoByIp", m, vKApiConfig.g, h, "", vKApiConfig.b, false, EmptyList.b, false);
        if (brm0.B("account.getGeoByIp", "execute.", false)) {
            Uri parse = Uri.parse("https://" + a0a.d + "/?" + d);
            if (parse.getQueryParameters("method").contains("execute") && (queryParameters = parse.getQueryParameters("code")) != null && !queryParameters.isEmpty()) {
                throw new VKApiExecutionException(15, "account.getGeoByIp", false, "Hey dude don't execute your hacky code ;)", null, null, null, null, 0, null, null, null, 4080);
            }
        }
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar2.getClass();
        aVar.f("POST", t.a.a(d, mVar));
        l.a aVar3 = new l.a();
        aVar3.e(null, str);
        aVar.a = aVar3.b();
        return aVar.b();
    }

    public static a c(okhttp3.o oVar, okhttp3.p pVar) {
        L.e("VkProxyHttpClient", "Execute: request - " + pVar);
        try {
            okhttp3.u execute = ((f8f0) oVar.a(pVar)).execute();
            L.e("VkProxyHttpClient", "Execute: ping end " + pVar.a + " | code: " + execute.o() + " | result: " + execute);
            return new a(execute, false);
        } catch (ConnectException e) {
            L.l("VkProxyHttpClient", "Execute: request error ConnectException: " + e);
            return new a(null, true);
        } catch (Exception e2) {
            L.l("VkProxyHttpClient", "Execute: request error Exception: " + e2);
            return new a(null, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        xsna.x2r0.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        a c;
        okhttp3.v m;
        boolean z;
        L.e("VkProxyHttpClient", "Check: api request begin: internal.api.vk.ru | account.getGeoByIp");
        if (str.length() == 0) {
            c = c((okhttp3.o) this.c.getValue(), b(new p.a(), "https://internal.api.vk.ru/method/account.getGeoByIp"));
        } else {
            Uri parse = Uri.parse("https://internal.api.vk.ru/method/account.getGeoByIp");
            Uri build = parse.buildUpon().authority(str).build();
            p.a aVar = new p.a();
            aVar.c.b("Host", parse.getHost());
            c = c((okhttp3.o) this.d.getValue(), b(aVar, build.toString()));
        }
        okhttp3.u uVar = c.a;
        boolean z2 = false;
        if (uVar != null) {
            if (uVar != null) {
                try {
                    if (uVar.t() || uVar.o() == 429) {
                        z = true;
                        if (!z) {
                            z2 = true;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        L.f("VkProxyHttpClient", "Check: api request error: internal.api.vk.ru | account.getGeoByIp}", th);
                        if (uVar != null) {
                            x2r0.c(uVar);
                        }
                    } finally {
                        if (uVar != null) {
                            x2r0.c(uVar);
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        L.e("VkProxyHttpClient", "Check: api request end status: internal.api.vk.ru | account.getGeoByIp - " + z2 + '}');
        if (z2) {
            if (uVar != null && (m = uVar.m()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(m.byteStream(), emb.b), 8192);
                try {
                    String b = a0a.b(bufferedReader);
                    bufferedReader.close();
                    x2r0.c(uVar);
                    return b;
                } finally {
                }
            }
        } else if (uVar != null) {
            return null;
        }
        return null;
    }

    public final List<InetAddress> d(String str) {
        return ((okhttp3.o) this.d.getValue()).m.a(str);
    }
}
