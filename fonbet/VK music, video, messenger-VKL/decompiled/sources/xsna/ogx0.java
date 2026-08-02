package xsna;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.superapp.api.internal.requests.common.CustomApiRequest;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import ru.ok.android.commons.http.Http;
import xsna.oxp;

/* compiled from: WebHttpProxyDelegate.kt */
/* loaded from: classes6.dex */
public final class ogx0 {
    public static final WebResourceResponse e = new WebResourceResponse("text/plain", emb.b.name(), c.b);
    public final qdx0 a;
    public final b b;
    public final AtomicBoolean c;
    public final wou d;

    /* compiled from: WebHttpProxyDelegate.kt */
    public static abstract class a {

        /* compiled from: WebHttpProxyDelegate.kt */
        /* renamed from: xsna.ogx0$a$a, reason: collision with other inner class name */
        public static final class C3454a extends a {
            public final Map<String, String> a;

            public C3454a(Map<String, String> map) {
                this.a = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3454a) && epx.f(this.a, ((C3454a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return cjl0.a(new StringBuilder("Params(map="), this.a, ')');
            }
        }

        /* compiled from: WebHttpProxyDelegate.kt */
        public static final class b extends a {
            public final String a;
            public final byte[] b;

            public b(String str, byte[] bArr) {
                this.a = str;
                this.b = bArr;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!b.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && Arrays.equals(this.b, bVar.b);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Plain(type=" + this.a + ", content=" + Arrays.toString(this.b) + ')';
            }
        }
    }

    /* compiled from: WebHttpProxyDelegate.kt */
    public static final class b {
        public final CookieManager a;
        public final aog b;

        public b(CookieManager cookieManager, aog aogVar) {
            this.a = cookieManager;
            this.b = aogVar;
        }

        public final String a(Context context, String str) {
            CookieManager cookieManager = CookieManager.getInstance();
            String cookie = cookieManager.getCookie(str);
            String str2 = (String) this.b.get();
            if (drm0.N(str2)) {
                float f = iah0.f().density;
                Point j = iah0.j(context);
                str2 = ((int) Math.ceil(j.x / f)) + '/' + ((int) Math.ceil(j.y / f)) + '/' + f + "/!!!!!!!";
            }
            String b = go9.b("remixmdevice=", str2);
            if (cookie == null || drm0.N(cookie)) {
                return b;
            }
            if (drm0.D(cookie, "remixmdevice", false)) {
                return cookie;
            }
            String str3 = cookie + "; " + b;
            cookieManager.setCookie(str, str3);
            return str3;
        }
    }

    /* compiled from: WebHttpProxyDelegate.kt */
    public static final class c extends InputStream {
        public static final c b = new c();

        @Override // java.io.InputStream
        public final int available() {
            return 0;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            return -1;
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            return 0L;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr) {
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            return -1;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final void reset() {
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
        }
    }

    /* compiled from: WebHttpProxyDelegate.kt */
    public static final class d {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RawBody(content=");
            sb.append(this.a);
            sb.append(", type=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public ogx0(qdx0 qdx0Var) {
        b bVar;
        this.a = qdx0Var;
        try {
            bVar = new b(CookieManager.getInstance(), new aog(0, qdx0Var, b6y.class, "deviceInfo", "getDeviceInfo()Ljava/lang/String;", 1));
        } catch (Throwable unused) {
            bVar = null;
        }
        this.b = bVar;
        this.c = new AtomicBoolean(false);
        wou wouVar = new wou();
        wouVar.b = rl3.y0(new String[]{"ttf", "woff2", "woff", "otf", "png", "jpg", "jpeg", "gif", "bmp", "svg", "ico", "webp", "html", "js", "ts", "css", "xml", "json", "swf", "txt", "text", "conf", "mp3", "mp4", "webm", "wav"});
        this.d = wouVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r5 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebResourceResponse a(okhttp3.u uVar, boolean z) {
        String str;
        String name;
        ByteArrayInputStream byteArrayInputStream;
        org.jsoup.parser.a aVar;
        List list;
        List<org.jsoup.nodes.j> unmodifiableList;
        String str2 = uVar.d;
        okhttp3.k kVar = uVar.g;
        if (drm0.N(str2)) {
            str2 = "OK";
        }
        okhttp3.v vVar = uVar.h;
        if (vVar != null) {
            okhttp3.m contentType = vVar.contentType();
            if (contentType != null) {
                String str3 = contentType.c;
                str = contentType.b;
                if (!drm0.N(str3)) {
                    str = v1v.a('/', str, str3);
                }
            } else {
                str = null;
            }
            if (str == null) {
                str = kVar.a("Content-Type".toLowerCase(Locale.getDefault()));
                if (str == null) {
                    str = null;
                }
                if (str == null) {
                    str = kVar.a("Content-Type");
                    if (str == null) {
                        str = null;
                    }
                    if (str == null) {
                        str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uVar.b.a.i));
                        if (str == null) {
                            str = "text/plain";
                        }
                    }
                }
            }
            okhttp3.m contentType2 = vVar.contentType();
            if (contentType2 != null) {
                Pattern pattern = okhttp3.m.e;
                Charset a2 = contentType2.a(null);
                if (a2 != null) {
                    name = a2.displayName();
                }
            }
            name = emb.b.name();
            InputStream byteStream = vVar.byteStream();
            if (str.equals("text/html") && z) {
                Charset forName = Charset.forName(name);
                String b2 = a0a.b(new BufferedReader(new InputStreamReader(byteStream, forName), 8192));
                try {
                    new JSONObject(b2);
                    byteStream = new ByteArrayInputStream(b2.getBytes(forName));
                } catch (JSONException unused) {
                    if (e370.r != null && afx0.b != null) {
                        org.jsoup.parser.a aVar2 = new org.jsoup.parser.a();
                        aVar2.w(new StringReader(b2), "", new od50(aVar2));
                        aVar2.f();
                        aVar2.b.d();
                        aVar2.b = null;
                        aVar2.c = null;
                        aVar2.e = null;
                        aVar2.i = null;
                        Document document = aVar2.d;
                        document.k.f = true;
                        kir0.b(TtmlNode.TAG_HEAD);
                        oxp.a aVar3 = new oxp.a(ad0.C(TtmlNode.TAG_HEAD).trim());
                        Elements elements = new Elements();
                        q7o.j(new k5g(aVar3, document, elements), document);
                        if (elements.size() > 0) {
                            org.jsoup.nodes.g gVar = elements.get(0);
                            String str4 = (String) jgx0.b.getValue();
                            gVar.getClass();
                            kir0.c(str4);
                            od50 a3 = org.jsoup.nodes.k.a(gVar);
                            String i = gVar.i();
                            aVar = (org.jsoup.parser.a) a3.b;
                            aVar.l = org.jsoup.parser.b.Initial;
                            aVar.w(new StringReader(str4), i, a3);
                            aVar.q = gVar;
                            aVar.x = true;
                            if (gVar.x() != null) {
                                aVar.d.m = gVar.x().m;
                            }
                            String str5 = gVar.e.c;
                            str5.getClass();
                            switch (str5) {
                                case "template":
                                    aVar.c.p(org.jsoup.parser.d.Data);
                                    aVar.M(org.jsoup.parser.b.InTemplate);
                                    break;
                                case "iframe":
                                case "xml":
                                case "style":
                                case "noframes":
                                case "noembed":
                                    aVar.c.p(org.jsoup.parser.d.Rawtext);
                                    break;
                                case "textarea":
                                case "title":
                                    aVar.c.p(org.jsoup.parser.d.Rcdata);
                                    break;
                                case "script":
                                    aVar.c.p(org.jsoup.parser.d.ScriptData);
                                    break;
                                case "noscript":
                                    aVar.c.p(org.jsoup.parser.d.Data);
                                    break;
                                case "plaintext":
                                    aVar.c.p(org.jsoup.parser.d.PLAINTEXT);
                                    break;
                                default:
                                    aVar.c.p(org.jsoup.parser.d.Data);
                                    break;
                            }
                            org.jsoup.nodes.g gVar2 = new org.jsoup.nodes.g(aVar.g(str5, aVar.h), i, null);
                            aVar.d.C(gVar2);
                            aVar.e.add(gVar2);
                            aVar.R();
                            org.jsoup.nodes.g gVar3 = gVar;
                            while (true) {
                                if (gVar3 != null) {
                                    if (gVar3 instanceof org.jsoup.nodes.h) {
                                        aVar.p = (org.jsoup.nodes.h) gVar3;
                                    } else {
                                        gVar3 = (org.jsoup.nodes.g) gVar3.b;
                                    }
                                }
                            }
                            aVar.f();
                            org.jsoup.nodes.j jVar = gVar2.b;
                            if (jVar == null) {
                                list = Collections.EMPTY_LIST;
                            } else {
                                List<org.jsoup.nodes.j> n = jVar.n();
                                ArrayList arrayList = new ArrayList(n.size() - 1);
                                for (org.jsoup.nodes.j jVar2 : n) {
                                    if (jVar2 != gVar2) {
                                        arrayList.add(jVar2);
                                    }
                                }
                                list = arrayList;
                            }
                            if (!list.isEmpty()) {
                                gVar2.H(list);
                            }
                            if (gVar2.j() == 0) {
                                unmodifiableList = org.jsoup.nodes.j.d;
                            } else {
                                List<org.jsoup.nodes.j> n2 = gVar2.n();
                                ArrayList arrayList2 = new ArrayList(n2.size());
                                arrayList2.addAll(n2);
                                unmodifiableList = Collections.unmodifiableList(arrayList2);
                            }
                            gVar.b(0, (org.jsoup.nodes.j[]) unmodifiableList.toArray(new org.jsoup.nodes.j[0]));
                        }
                        b2 = document.toString();
                    }
                    byteArrayInputStream = new ByteArrayInputStream(b2.getBytes(forName));
                    byteStream = byteArrayInputStream;
                    WebResourceResponse webResourceResponse = new WebResourceResponse(str, name, byteStream);
                    TreeMap e2 = kVar.e();
                    StringBuilder sb = new StringBuilder();
                    HashMap hashMap = new HashMap();
                    while (r1.hasNext()) {
                    }
                    webResourceResponse.setResponseHeaders(hashMap);
                    webResourceResponse.setStatusCodeAndReasonPhrase(uVar.e, str2);
                    return webResourceResponse;
                } catch (Exception unused2) {
                    byteArrayInputStream = new ByteArrayInputStream(b2.getBytes(forName));
                    byteStream = byteArrayInputStream;
                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(str, name, byteStream);
                    TreeMap e22 = kVar.e();
                    StringBuilder sb2 = new StringBuilder();
                    HashMap hashMap2 = new HashMap();
                    while (r1.hasNext()) {
                    }
                    webResourceResponse2.setResponseHeaders(hashMap2);
                    webResourceResponse2.setStatusCodeAndReasonPhrase(uVar.e, str2);
                    return webResourceResponse2;
                }
            }
            WebResourceResponse webResourceResponse22 = new WebResourceResponse(str, name, byteStream);
            TreeMap e222 = kVar.e();
            StringBuilder sb22 = new StringBuilder();
            HashMap hashMap22 = new HashMap();
            for (Map.Entry entry : e222.entrySet()) {
                String str6 = (String) entry.getKey();
                List list2 = (List) entry.getValue();
                sb22.delete(0, sb22.length());
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        sb22.append((String) it.next());
                        sb22.append(";");
                    }
                }
                if (sb22.length() > 0) {
                    sb22.deleteCharAt(sb22.length() - 1);
                }
                hashMap22.put(str6, sb22.toString());
            }
            webResourceResponse22.setResponseHeaders(hashMap22);
            try {
                webResourceResponse22.setStatusCodeAndReasonPhrase(uVar.e, str2);
                return webResourceResponse22;
            } catch (Exception unused3) {
            }
        }
        return e;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(1:133)(1:5)|6|(1:10)|(1:13)|14|(4:16|(6:18|19|20|(4:22|(3:23|24|(1:121)(1:(2:28|29)(1:27)))|30|31)(1:126)|32|(2:34|(2:36|(10:38|(5:40|41|42|(1:44)|46)|51|(1:53)(1:119)|(3:115|(1:117)|118)|57|(1:114)|61|(1:63)(1:113)|(6:67|68|69|(4:71|(4:74|(2:76|77)(2:79|80)|78|72)|81|82)(1:110)|83|(1:85)(2:86|(11:88|(1:92)|93|(1:95)|96|97|98|99|(1:101)(1:104)|102|103)(2:108|109)))(2:65|66)))))|131|(0))|132|(2:90|92)|93|(0)|96|97|98|99|(0)(0)|102|103|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x024b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024c, code lost:
    
        xsna.xgx0.a.getClass();
        xsna.xgx0.d(r0);
        r0 = com.vk.superapp.api.internal.requests.common.CustomApiRequest.RequestMethod.GET;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CustomApiRequest b(Context context, khx0 khx0Var) {
        CustomApiRequest.b bVar;
        Map<String, String> map;
        d dVar;
        byte[] decode;
        Object bVar2;
        Pair<String, String> pair;
        String a2;
        Uri uri;
        qdx0 qdx0Var = this.a;
        HashMap<String, Condition> hashMap = qdx0Var.a;
        ReentrantLock reentrantLock = qdx0Var.c;
        HashMap<String, Pair<String, String>> hashMap2 = qdx0Var.b;
        Uri uri2 = khx0Var.a;
        String str = khx0Var.b;
        Map<String, String> map2 = khx0Var.c;
        String uri3 = uri2.toString();
        jhx0 jhx0Var = khx0Var.d;
        String host = (jhx0Var == null || (uri = jhx0Var.a) == null) ? null : uri.getHost();
        String host2 = uri2.getHost();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b bVar3 = this.b;
        if (bVar3 != null && (a2 = bVar3.a(context, uri3)) != null) {
        }
        if (host != null && host2 != null) {
            uri3 = brm0.y(uri3, host2, host);
            linkedHashMap.put("Host", host2);
        }
        if (drm0.D(uri3, "_VK_PROXY_REQUEST_", false)) {
            List c0 = drm0.c0(uri3, new String[]{"_VK_PROXY_REQUEST_"}, 0, 6);
            Pair pair2 = new Pair(c0.get(0), c0.get(1));
            uri3 = (String) pair2.d();
            String str2 = (String) pair2.g();
            int i = 10;
            if (!drm0.N(str2)) {
                reentrantLock.lock();
                try {
                    Condition condition = hashMap.get(str2);
                    if (condition != null) {
                        int i2 = 0;
                        while (true) {
                            try {
                                if (hashMap2.containsKey(str2)) {
                                    break;
                                }
                                if (i2 >= i) {
                                    xgx0.a.getClass();
                                    xgx0.b("Missed body for - " + str2);
                                    break;
                                }
                                condition.await(300L, TimeUnit.MILLISECONDS);
                                i2++;
                                i = 10;
                            } catch (Throwable th) {
                                condition.signal();
                                throw th;
                            }
                        }
                        pair = hashMap2.get(str2);
                        condition.signal();
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        String d2 = pair.d();
                        String g = pair.g();
                        if (d2.length() != 0) {
                            dVar = new d(d2, g);
                            if (dVar != null) {
                                String str3 = dVar.b;
                                if (!str.equalsIgnoreCase("OPTIONS")) {
                                    reentrantLock.lock();
                                    try {
                                        hashMap2.remove(str2);
                                        Condition remove = hashMap.remove(str2);
                                        if (remove != null) {
                                            remove.signal();
                                            s3q0 s3q0Var = s3q0.a;
                                        }
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                }
                                if (drm0.N(str3)) {
                                    str3 = null;
                                } else {
                                    linkedHashMap.put("Content-Type", str3);
                                }
                                if (str3 == null || drm0.N(str3)) {
                                    String str4 = map2.get("Content-Type".toLowerCase(Locale.getDefault()));
                                    if (str4 == null) {
                                        str4 = map2.get("Content-Type");
                                    }
                                    str3 = str4;
                                }
                                if (str3 == null || drm0.N(str3)) {
                                    linkedHashMap.put("Content-Type", Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED);
                                    str3 = Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED;
                                }
                                String str5 = dVar.a;
                                int K = drm0.K(0, 6, str5, ";base64,", false);
                                String substring = K > -1 ? str5.substring(K + 8) : null;
                                if (substring == null) {
                                    throw new IllegalStateException("Body is null after some checks!");
                                }
                                try {
                                    decode = Base64.decode(substring, 0);
                                } catch (IllegalArgumentException unused) {
                                    decode = Base64.decode(substring, 10);
                                }
                                if (str3.equals(Http.ContentType.APPLICATION_X_WWW_FORM_URLENCODED)) {
                                    List c02 = drm0.c0(new String(decode, emb.b), new String[]{"&"}, 0, 6);
                                    ArrayList arrayList = new ArrayList(c5g.u(c02, 10));
                                    Iterator it = c02.iterator();
                                    while (it.hasNext()) {
                                        List c03 = drm0.c0((String) it.next(), new String[]{"="}, 0, 6);
                                        arrayList.add(c03.size() < 2 ? new Pair(c03.get(0), "") : new Pair(c03.get(0), c03.get(1)));
                                    }
                                    bVar2 = new a.C3454a(pn00.s(arrayList));
                                } else {
                                    bVar2 = new a.b(str3, decode);
                                }
                                if (!(bVar2 instanceof a.C3454a)) {
                                    if (!(bVar2 instanceof a.b)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    a.b bVar4 = (a.b) bVar2;
                                    bVar = new CustomApiRequest.b(bVar4.a, bVar4.b);
                                    if (jhx0Var != null && (map = jhx0Var.b) != null) {
                                        linkedHashMap.putAll(map);
                                    }
                                    CustomApiRequest.a aVar = new CustomApiRequest.a();
                                    aVar.b = uri3;
                                    if (bVar != null) {
                                        aVar.g = bVar;
                                    }
                                    CustomApiRequest.RequestMethod.Companion.getClass();
                                    CustomApiRequest.RequestMethod requestMethod = CustomApiRequest.RequestMethod.valueOf(str.toUpperCase(Locale.getDefault()));
                                    aVar.c = requestMethod;
                                    aVar.f = linkedHashMap;
                                    aVar.e = linkedHashMap2;
                                    aVar.h = e370.r == null ? (okhttp3.o) afx0.c.getValue() : null;
                                    return aVar.a();
                                }
                                linkedHashMap2.putAll(((a.C3454a) bVar2).a);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar = null;
            if (dVar != null) {
            }
        }
        bVar = null;
        if (jhx0Var != null) {
            linkedHashMap.putAll(map);
        }
        CustomApiRequest.a aVar2 = new CustomApiRequest.a();
        aVar2.b = uri3;
        if (bVar != null) {
        }
        CustomApiRequest.RequestMethod.Companion.getClass();
        CustomApiRequest.RequestMethod requestMethod2 = CustomApiRequest.RequestMethod.valueOf(str.toUpperCase(Locale.getDefault()));
        aVar2.c = requestMethod2;
        aVar2.f = linkedHashMap;
        aVar2.e = linkedHashMap2;
        aVar2.h = e370.r == null ? (okhttp3.o) afx0.c.getValue() : null;
        return aVar2.a();
    }

    public final CustomApiRequest c(Context context, khx0 khx0Var) {
        CustomApiRequest.RequestMethod requestMethod;
        String a2;
        Uri uri = khx0Var.a;
        String uri2 = uri.toString();
        CustomApiRequest.a aVar = new CustomApiRequest.a();
        aVar.b = uri2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(khx0Var.c);
        b bVar = this.b;
        if (bVar != null && (a2 = bVar.a(context, uri.toString())) != null) {
        }
        CustomApiRequest.RequestMethod.a aVar2 = CustomApiRequest.RequestMethod.Companion;
        String str = khx0Var.b;
        aVar2.getClass();
        try {
            requestMethod = CustomApiRequest.RequestMethod.valueOf(str.toUpperCase(Locale.getDefault()));
        } catch (Exception e2) {
            xgx0.a.getClass();
            xgx0.d(e2);
            requestMethod = CustomApiRequest.RequestMethod.GET;
        }
        aVar.c = requestMethod;
        aVar.f = linkedHashMap;
        okhttp3.o oVar = null;
        if (s200.r) {
            afx0 afx0Var = e370.r;
            if (afx0Var != null) {
                oVar = afx0Var.c();
            }
        } else {
            afx0 afx0Var2 = e370.r;
            if (afx0Var2 != null) {
                oVar = afx0Var2.b();
            }
        }
        aVar.h = oVar;
        return aVar.a();
    }
}
