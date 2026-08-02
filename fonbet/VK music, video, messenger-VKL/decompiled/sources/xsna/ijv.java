package xsna;

import com.ironsource.B5;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.knet.core.http.HttpMethod;
import com.vk.knet.core.http.HttpProtocol;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.k;
import okhttp3.m;
import okhttp3.u;
import ru.ok.android.commons.http.Http;
import xsna.k8g0;
import xsna.lkv;
import xsna.usj;

/* compiled from: HttpExecutorInterceptor.kt */
/* loaded from: classes.dex */
public final class ijv implements Interceptor, uz80 {
    public final NetworkClient.ClientType a;
    public final Set<Regex> b;
    public final sx70 c;

    /* compiled from: HttpExecutorInterceptor.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NetworkClient.ClientType.values().length];
            try {
                iArr[NetworkClient.ClientType.CLIENT_API.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NetworkClient.ClientType.CLIENT_SSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HttpProtocol.values().length];
            try {
                iArr2[HttpProtocol.HTTP_1_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HttpProtocol.HTTP_1_1.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HttpProtocol.HTTP_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HttpProtocol.SPDY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HttpProtocol.QUIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ijv(NetworkClient.ClientType clientType, Set set, sx70 sx70Var) {
        this.a = clientType;
        this.b = set;
        this.c = sx70Var;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "HttpExecutor";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02c7  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v7, types: [okhttp3.u] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v6, types: [xsna.ekv] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Throwable th;
        ?? r11;
        HashMap hashMap;
        Object obj;
        Protocol protocol;
        List unmodifiableList;
        bn8 bn8Var;
        InputStream n;
        String str;
        okhttp3.p request = aVar.request();
        okhttp3.l lVar = request.a;
        String str2 = lVar.i;
        jjy a2 = yjy.a();
        NetworkClient.ClientType clientType = this.a;
        if (a2 != null) {
            je5 je5Var = yjy.c;
            if (je5Var == null) {
                je5Var = null;
            }
            if (((Boolean) je5Var.invoke(clientType)).booleanValue()) {
                boolean z = request.c(k8g0.c.class) != null;
                boolean z2 = request.c(k8g0.b.class) != null;
                if (!z && !z2) {
                    Set<Regex> set = this.b;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (((Regex) it.next()).a(str2)) {
                                break;
                            }
                        }
                    }
                    okhttp3.t tVar = request.d;
                    okhttp3.m contentType = tVar != null ? tVar.contentType() : null;
                    long contentLength = tVar != null ? tVar.contentLength() : 0L;
                    if (contentLength != -1 && contentLength <= 10485760) {
                        HttpMethod.a aVar2 = HttpMethod.Companion;
                        String str3 = request.b;
                        aVar2.getClass();
                        String upperCase = str3.toUpperCase(Locale.ROOT);
                        hashMap = HttpMethod.methodMap;
                        HttpMethod httpMethod = (HttpMethod) hashMap.get(upperCase);
                        if (httpMethod != null) {
                            Map e = request.c.e();
                            if (contentType != null) {
                                th = null;
                                e = pn00.o(e, new Pair("Content-Type", yiz.p(contentType.a)));
                            } else {
                                th = null;
                            }
                            sx70 sx70Var = this.c;
                            List<usj> b = sx70Var.b(lVar);
                            if (!b.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                int i = 0;
                                for (Object obj2 : b) {
                                    int i2 = i + 1;
                                    if (i < 0) {
                                        e43.t();
                                        throw th;
                                    }
                                    usj usjVar = (usj) obj2;
                                    if (i > 0) {
                                        sb.append("; ");
                                    }
                                    sb.append(usjVar.e());
                                    sb.append(B5.U);
                                    sb.append(usjVar.i());
                                    i = i2;
                                }
                                e = pn00.o(e, new Pair(Http.Header.COOKIE, Collections.singletonList(sb.toString())));
                            }
                            if (httpMethod != HttpMethod.POST || tVar == null) {
                                obj = th;
                            } else {
                                okhttp3.m contentType2 = tVar.contentType();
                                if (contentType2 == null || (str = contentType2.a) == null) {
                                    str = "application/x-www-form-urlencoded;charset=utf-8";
                                }
                                vl8 vl8Var = new vl8();
                                tVar.writeTo(vl8Var);
                                obj = new ekv(vl8Var.v(vl8Var.c), str);
                            }
                            ckv ckvVar = new ckv(httpMethod, str2, e, (ekv) obj, 16);
                            int i3 = a.$EnumSwitchMapping$0[clientType.ordinal()];
                            if (i3 == 1) {
                                ckvVar = ckvVar.m(lkv.a.a, Boolean.TRUE).m(lkv.b.a, Boolean.valueOf(request.c(k8g0.a.class) != null));
                            } else if (i3 == 2) {
                                ckvVar = ckvVar.m(lkv.f.a, Boolean.TRUE);
                            }
                            ckv m = ckvVar.m(lkv.c.a, clientType);
                            UiTracker uiTracker = UiTracker.a;
                            ckv m2 = m.m(lkv.e.a, UiTracker.d());
                            mkv c = zjv.a(new som0(a2.b), a2.a, m2, a2.c).c(m2);
                            int s = c.s();
                            String t = c.t();
                            okhttp3.k c2 = k.b.c(c.m());
                            int i4 = a.$EnumSwitchMapping$1[c.r().ordinal()];
                            if (i4 == 1) {
                                protocol = Protocol.HTTP_1_0;
                            } else if (i4 == 2) {
                                protocol = Protocol.HTTP_1_1;
                            } else if (i4 == 3) {
                                protocol = Protocol.HTTP_2;
                            } else if (i4 == 4) {
                                protocol = Protocol.SPDY_3;
                            } else {
                                if (i4 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                protocol = Protocol.QUIC;
                            }
                            List<String> p = c.p(Http.Header.SET_COOKIE);
                            if (p == null) {
                                unmodifiableList = Collections.EMPTY_LIST;
                            } else {
                                ?? r9 = th;
                                for (String str4 : p) {
                                    Pattern pattern = usj.j;
                                    usj c3 = usj.b.c(lVar, str4);
                                    if (c3 != null) {
                                        if (r9 == 0) {
                                            r9 = new ArrayList();
                                        }
                                        r9.add(c3);
                                    }
                                }
                                unmodifiableList = r9 != 0 ? Collections.unmodifiableList(r9) : EmptyList.b;
                            }
                            sx70Var.a(unmodifiableList);
                            String contentType3 = c.getContentType();
                            String str5 = contentType3 != null ? contentType3 : "application/x-www-form-urlencoded;charset=utf-8";
                            Pattern pattern2 = okhttp3.m.e;
                            okhttp3.m a3 = m.a.a(str5);
                            okv n2 = c.n();
                            if (n2 != null || s == 304 || s == 204) {
                                long q = (c.o(Http.Header.CONTENT_ENCODING) == null && n2 != null) ? n2.q() : -1L;
                                String str6 = a3.a;
                                if (n2 == null || (n = n2.n()) == null) {
                                    vl8 vl8Var2 = new vl8();
                                    vl8Var2.write(new byte[0], 0, 0);
                                    bn8Var = vl8Var2;
                                } else {
                                    bn8Var = new e8f0(mq9.d(n));
                                }
                                n8f0 n8f0Var = new n8f0(str6, q, bn8Var);
                                u.a aVar3 = new u.a();
                                aVar3.f(s);
                                aVar3.j(t);
                                aVar3.m(protocol);
                                aVar3.i(c2);
                                aVar3.b(n8f0Var);
                                aVar3.p(request);
                                aVar3.n(System.currentTimeMillis());
                                r11 = aVar3.c();
                                if (r11 == 0) {
                                    m63.j(m63.c(), new Pair("knet.routed", Boolean.TRUE), new Pair("client.type", clientType.name()));
                                    return r11;
                                }
                                m63.j(m63.c(), new Pair("knet.routed", Boolean.FALSE), new Pair("client.type", clientType.name()));
                                return aVar.a(aVar.request());
                            }
                            r11 = th;
                            if (r11 == 0) {
                            }
                        }
                    }
                }
                th = null;
                r11 = th;
                if (r11 == 0) {
                }
            }
        }
        r11 = 0;
        if (r11 == 0) {
        }
    }
}
