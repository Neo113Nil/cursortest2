package defpackage;

import android.net.Uri;
import android.webkit.CookieManager;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.cprocsp.NGate.tools.Constants;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;
import ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.exceptions.EsiaVerificationEbsException;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptRequest;
import ru.rt.ebs.cryptosdk.core.verification.esia.entities.models.EsiaInterceptResult;

/* loaded from: classes4.dex */
public final class ibo implements IEsiaController {
    public final qbo a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Uri c = Uri.parse("https://www.gosuslugi.ru/");

    public ibo(qbo qboVar) {
        this.a = qboVar;
    }

    public final ByteArrayInputStream a(InputStream inputStream) {
        try {
            Charset charset = uza.a;
            String x0 = cma1.x0(new BufferedReader(new InputStreamReader(inputStream, charset), 8192));
            String g0 = evu0.g0(x0, "<head", x0);
            String d0 = evu0.d0(x0, "<head", x0);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((g0 + ("<head" + evu0.g0(d0, ">", d0) + ">") + "\n\t\t<script type=\"text/javascript\">\n         \nHTMLFormElement.prototype._submit = HTMLFormElement.prototype.submit;\nHTMLFormElement.prototype.submit = function () { \n\tonSubmit(this, '');\n\tthis._submit(); \n}\n\ndocument.addEventListener('DOMContentLoaded', function() {\n\t// 1\n\tvar forms = document.getElementsByTagName('form')\n\n\tfor (var i = 0; i < forms.length; i++) {\n\t\tvar form = forms[i]\n\t\t\n\t\t// 2\n\t\tvar buttons = form.getElementsByTagName('button');\n\t\tfor(var j = 0; j < buttons.length; j++) {\n\t\t\tvar button = buttons[j];\n\t\t\tif(button.type === 'submit') {\n\t\t\t\t// 3\n\t\t\t\tbutton.addEventListener('click', onClick);\n\t\t\t}\n\t\t}\n\t}\n});\n\nfunction onSubmit(form, data) {\n\n\tvar formData = new FormData(form);\n\n\tfor (const entry of formData.entries()) {\t\n\t    // 4\n\t\tif(data !== '')\n\t\t\tdata += '&';\n\t\tdata += encodeURIComponent(entry[0]) + '=' + encodeURIComponent(entry[1]);\n\t}\n\t// 5\n\tformDataRecorder.processFormData(form.action, data);\n\treturn true;\n}\n\nfunction onClick() {\n\tvar data = ''\n\t\n\tvar value = this.getAttribute('value');\n\t// 6\n\tif(value)\n\t\tdata = encodeURIComponent(this.name) + '=' + encodeURIComponent(value);\n\t\n\t// 7\n\tvar form = this;\n\twhile ((form = form.parentNode) && form.tagName !== 'FORM');\n\tonSubmit(form, data);\n}\n\n// 8\nXMLHttpRequest.prototype.reallyOpen = XMLHttpRequest.prototype.open;\nXMLHttpRequest.prototype.open = function(method, url, async, user, password) {\n    if (async == undefined) {\n        async = true;\n    }\n    this._internal_url = url;\n    this.reallyOpen(method, url , async, user, password);\n};\nXMLHttpRequest.prototype.reallySend = XMLHttpRequest.prototype.send;\nXMLHttpRequest.prototype.send = function(body) {\n    if (this._internal_url != undefined && body != undefined) {\n        formDataRecorder.interceptRequestBody(this._internal_url, body);\n    }\n    this.reallySend(body);\n};                   \n        \n</script>\n" + evu0.d0(d0, ">", d0)).getBytes(charset));
            try {
                return byteArrayInputStream;
            } catch (Exception e) {
                return byteArrayInputStream;
            }
        } finally {
            try {
                inputStream.close();
            } catch (Exception e2) {
                EbsLogger.INSTANCE.error("ESIA--->", e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0217  */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EsiaInterceptResult b(String str, HttpsMethod httpsMethod, Map map, String str2) {
        boolean z;
        String b;
        int i;
        ?? r10;
        List W;
        if (isRedirectUrl(Uri.parse(str))) {
            EsiaInterceptResult esiaInterceptResult = new EsiaInterceptResult(null, null, null, null, str, null, null, null, null, null, 1007, null);
            Uri parse = Uri.parse(esiaInterceptResult.getRedirectUrl());
            return EsiaInterceptResult.copy$default(esiaInterceptResult, null, null, null, null, null, null, aba1.e(parse), aba1.f(parse), null, null, 831, null);
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        LinkedHashMap n = b.n(map, cookie != null ? g8e.z("Cookie", cookie) : b.f());
        qbo qboVar = this.a;
        h9e h9eVar = qboVar.a;
        axu axuVar = new axu(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : n.entrySet()) {
            linkedHashMap3.put((String) entry.getKey(), Collections.singletonList((String) entry.getValue()));
        }
        ywu c = ((qwu) h9eVar.b).c(new xwu(httpsMethod, axuVar, linkedHashMap, linkedHashMap2, linkedHashMap3, str2 != null ? str2 : null, arrayList));
        Map map2 = c.b;
        String str3 = c.c;
        String str4 = c.d;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(gw00.d(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), a.X((Iterable) entry2.getValue(), ";", null, null, null, 62));
        }
        EsiaInterceptResult esiaInterceptResult2 = new EsiaInterceptResult(str3, str4, linkedHashMap4, c.e, null, null, null, null, null, null, Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND, null);
        String b2 = d2b1.b(c, "Content-Type");
        if (b2.length() != 0 && !evu0.y(b2, "text/html", false)) {
            Set<String> keySet = map2.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                for (String str5 : keySet) {
                    if (jl40.l(str5 != null ? str5.toLowerCase(Locale.ROOT) : null, "set-cookie")) {
                    }
                }
            }
            z = false;
            Collection collection = EmptyList.a;
            if (z) {
                Collection<String> collection2 = (List) map2.get("Set-Cookie");
                if (collection2 == null) {
                    collection2 = collection;
                }
                CookieManager cookieManager = CookieManager.getInstance();
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    cookieManager.setCookie(str, (String) it.next());
                }
                cookieManager.flush();
                String cookie2 = CookieManager.getInstance().getCookie(str);
                if (cookie2 != null) {
                    W = evu0.W(cookie2, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
                    r10 = new ArrayList(tcc.n(W, 10));
                    Iterator it2 = W.iterator();
                    while (it2.hasNext()) {
                        r10.add(evu0.k0((String) it2.next()).toString());
                    }
                } else {
                    r10 = collection;
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(collection2, 10));
                for (String str6 : collection2) {
                    arrayList2.add(evu0.g0(str6, ";", str6));
                }
                Iterator it3 = a.m0(r10, arrayList2).iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String g0 = evu0.g0(str7, "=", str7);
                    String d0 = evu0.d0(str7, "=", str7);
                    if (d0.length() > 0) {
                        this.b.put(g0, d0);
                    }
                }
            }
            b = d2b1.b(c, "Location");
            if (Uri.parse(b).isRelative()) {
                Uri build = Uri.parse(str).buildUpon().clearQuery().path("").build();
                if (b.length() == 0) {
                    b = String.valueOf('/');
                } else if (gvu0.u0(b) != '/') {
                    b = "/".concat(b);
                }
                b = build + b;
            }
            String str8 = b;
            i = c.a;
            if (301 <= i || i >= 303 || str8.length() == 0) {
                return esiaInterceptResult2;
            }
            if (cvu0.x(str8, qboVar.b.getString("esia.redirect_url", ""), false)) {
                EsiaInterceptResult copy$default = EsiaInterceptResult.copy$default(esiaInterceptResult2, null, null, null, null, str8, null, null, null, null, null, 1007, null);
                Uri parse2 = Uri.parse(copy$default.getRedirectUrl());
                return EsiaInterceptResult.copy$default(copy$default, null, null, null, null, null, null, aba1.e(parse2), aba1.f(parse2), null, null, 831, null);
            }
            if (z) {
                Collection collection3 = (List) map2.get("Set-Cookie");
                if (collection3 != null) {
                    collection = collection3;
                }
                CookieManager cookieManager2 = CookieManager.getInstance();
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    cookieManager2.setCookie(str8, (String) it4.next());
                }
                cookieManager2.flush();
            }
            return EsiaInterceptResult.copy$default(b(str8, HttpsMethod.GET, map, null), null, null, null, null, null, null, null, null, str, str8, 255, null);
        }
        z = true;
        Collection collection4 = EmptyList.a;
        if (z) {
        }
        b = d2b1.b(c, "Location");
        if (Uri.parse(b).isRelative()) {
        }
        String str82 = b;
        i = c.a;
        if (301 <= i) {
        }
        return esiaInterceptResult2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final void clearSession() {
        this.b.clear();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final Uri getHomePageUri() {
        return this.c;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean isBrowserUrl(Uri uri) {
        String n0;
        if (uri != null) {
            try {
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null && (n0 = evu0.n0(encodedPath, '/')) != null) {
                    return qbo.f.contains(n0);
                }
            } catch (Exception e) {
                EbsLogger.INSTANCE.error("ESIA--->", e);
            }
        }
        return false;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean isEsiaUrlWithoutPath(Uri uri) {
        return uri != null && supportTlsHost(uri.getHost()) && jl40.l(uri.getPath(), "/");
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean isHandleUrl(Uri uri) {
        String host;
        if (uri != null) {
            try {
                host = uri.getHost();
            } catch (Exception e) {
                EbsLogger.INSTANCE.error("ESIA--->", e);
                return false;
            }
        } else {
            host = null;
        }
        if (host == null) {
            host = "";
        }
        return host.equals(this.a.c);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean isIgnoreHost(String str) {
        HashSet hashSet = qbo.d;
        if (str == null) {
            str = "";
        }
        return hashSet.contains(str);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean isRedirectUrl(Uri uri) {
        String host;
        if (uri != null) {
            try {
                host = uri.getHost();
            } catch (Exception e) {
                EbsLogger.INSTANCE.error("ESIA--->", e);
                return false;
            }
        } else {
            host = null;
        }
        if (host == null) {
            host = "";
        }
        return host.equals(this.a.c);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final EsiaInterceptResult processUrl(EsiaInterceptRequest esiaInterceptRequest) {
        List W;
        try {
            EsiaInterceptResult b = b(esiaInterceptRequest.getUrl(), HttpsMethod.valueOf(esiaInterceptRequest.getMethod()), esiaInterceptRequest.getHeaders(), esiaInterceptRequest.getBody());
            return (!jl40.l(b.getContentType(), "text/html") || b.getInputStream() == null) ? b : EsiaInterceptResult.copy$default(b, null, null, null, a(b.getInputStream()), null, null, null, null, null, null, 1015, null);
        } catch (Exception e) {
            String url = esiaInterceptRequest.getUrl();
            W = evu0.W(url, new String[]{"?"}, (r2 & 4) != 0 ? 0 : 2);
            String str = (String) a.P(W);
            if (!qbo.g.h(str)) {
                List list = qbo.h;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (cvu0.s(str, (String) it.next(), true)) {
                            break;
                        }
                    }
                }
                if (!evu0.y(url, "/banners", false)) {
                    return new EsiaInterceptResult(null, null, null, null, null, new EsiaVerificationEbsException(e), null, null, null, null, 991, null);
                }
            }
            throw e;
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final void setEsiaRedirectUrl(String str) {
        qbo qboVar = this.a;
        qboVar.b.putString("esia.redirect_url", str).save();
        String host = Uri.parse(str).getHost();
        if (host == null) {
            host = "";
        }
        qboVar.c = host;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController
    public final boolean supportTlsHost(String str) {
        HashSet hashSet = qbo.e;
        if (str == null) {
            str = "";
        }
        return hashSet.contains(str);
    }
}
