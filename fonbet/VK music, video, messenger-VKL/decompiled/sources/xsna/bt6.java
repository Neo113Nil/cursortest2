package xsna;

import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.VkClientErrorSerializer;
import com.vk.superapp.browser.internal.bridges.JsApiEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.bridges.MethodScope;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.js.bridge.events.EventNames;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.sdk.SharedKt;
import xsna.bex0;

/* compiled from: BaseWebBridge.kt */
/* loaded from: classes6.dex */
public abstract class bt6 extends h4y implements bex0 {
    public final MethodScope f;
    public final Map<JsApiMethodType, String> g = Collections.synchronizedMap(new EnumMap(JsApiMethodType.class));
    public final Map<EventNames, String> h = Collections.synchronizedMap(new EnumMap(EventNames.class));
    public final Set<String> i = Collections.synchronizedSet(new HashSet());
    public final Gson j = new GsonBuilder().registerTypeAdapter(Responses$ClientError.class, VkClientErrorSerializer.a).create();
    public final b k = new b(new c());

    /* compiled from: BaseWebBridge.kt */
    public static final class a {
        public static JSONObject a(String str, String str2, JSONObject jSONObject) {
            if (str2 != null && !drm0.N(str2)) {
                jSONObject.put(CommonUrlParts.REQUEST_ID, str2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", str);
            jSONObject2.put("data", jSONObject);
            if (str2 != null && !drm0.N(str2)) {
                jSONObject2.put(CommonUrlParts.REQUEST_ID, str2);
            }
            return jSONObject2;
        }
    }

    /* compiled from: BaseWebBridge.kt */
    public static final class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: BaseWebBridge.kt */
    public static final class c {
        public static final List<String> a = e43.l(SharedKt.PARAM_ACCESS_TOKEN, "token", "secret");
    }

    public bt6(MethodScope methodScope) {
        this.f = methodScope;
    }

    public final void A(JsApiMethodType jsApiMethodType, JSONObject jSONObject) {
        B(jsApiMethodType, jsApiMethodType.h(), jSONObject, null, null);
    }

    public final void B(JsApiMethodType jsApiMethodType, String str, JSONObject jSONObject, String str2, String str3) {
        JsMethod jsMethod;
        c cVar = this.k.a;
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        List<String> list = c.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (jSONObject2.has((String) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject2.put((String) it.next(), "HIDE");
        }
        xgx0 xgx0Var = xgx0.a;
        String str4 = "send event: " + jsApiMethodType.i() + ", eventName=" + str + " json=" + jSONObject2;
        xgx0Var.getClass();
        xgx0.a(str4);
        m(jsApiMethodType.i(), str3, jSONObject);
        if (str2 == null) {
            Map<JsApiMethodType, String> map = this.g;
            String str5 = map.get(jsApiMethodType);
            if (str5 != null) {
                map.remove(jsApiMethodType);
                str2 = str5;
            } else {
                String i = jsApiMethodType.i();
                ConcurrentHashMap concurrentHashMap = this.b;
                Iterator it2 = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        jsMethod = (JsMethod) ((Map.Entry) it2.next()).getKey();
                        if (epx.f(jsMethod.a, i)) {
                            break;
                        }
                    } else {
                        jsMethod = null;
                        break;
                    }
                }
                if (jsMethod == null) {
                    str2 = null;
                } else {
                    String i2 = i(jsMethod);
                    concurrentHashMap.remove(jsMethod);
                    str2 = i2;
                }
            }
        }
        JSONObject a2 = a.a(str, str2, jSONObject);
        WebView r = r();
        if (r != null) {
            r.post(new at6(0, this, a2));
        }
    }

    @Override // xsna.bex0
    public final void b(JsApiMethodType jsApiMethodType, VkAppsErrors.Client client, String str, Pair pair, String str2) {
        B(jsApiMethodType, jsApiMethodType.h(), VkAppsErrors.Client.i(client, str, pair, 1), str2, null);
    }

    @Override // xsna.bex0
    public final void e(JsApiMethodType jsApiMethodType, JSONObject jSONObject, String str) {
        B(jsApiMethodType, jsApiMethodType.k(), jSONObject, str, null);
    }

    @Override // com.vk.superapp.base.js.bridge.b
    public final WebView r() {
        fgx0 s = s();
        if (s != null) {
            return s.a;
        }
        return null;
    }

    public abstract fgx0 s();

    public final boolean t(JsApiMethodType jsApiMethodType) {
        return this.g.get(jsApiMethodType) != null;
    }

    public final boolean u(JsApiMethodType jsApiMethodType, String str) {
        String optString;
        if (str != null) {
            try {
                optString = new JSONObject(str).optString(CommonUrlParts.REQUEST_ID);
            } catch (JSONException unused) {
            }
            this.g.put(jsApiMethodType, optString);
            if (optString != null || optString.length() == 0) {
                this.i.add(brm0.y(jsApiMethodType.i(), "VKWebApp", ""));
            }
            MethodScope methodScope = this.f;
            methodScope.getClass();
            if (jsApiMethodType.j() != MethodScope.INTERNAL && methodScope == MethodScope.PUBLIC) {
                bex0.a.a(this, jsApiMethodType, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                return false;
            }
            xgx0 xgx0Var = xgx0.a;
            String str2 = "call " + jsApiMethodType.i();
            xgx0Var.getClass();
            xgx0.f(str2);
            xgx0.a("data " + str);
            return true;
        }
        optString = null;
        this.g.put(jsApiMethodType, optString);
        if (optString != null) {
        }
        this.i.add(brm0.y(jsApiMethodType.i(), "VKWebApp", ""));
        MethodScope methodScope2 = this.f;
        methodScope2.getClass();
        if (jsApiMethodType.j() != MethodScope.INTERNAL) {
        }
        xgx0 xgx0Var2 = xgx0.a;
        String str22 = "call " + jsApiMethodType.i();
        xgx0Var2.getClass();
        xgx0.f(str22);
        xgx0.a("data " + str);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean v(String str, fvp fvpVar) {
        String optString;
        boolean h;
        EventNames b2 = fvpVar.b();
        String str2 = null;
        Object[] objArr = 0;
        if (str != null) {
            try {
                optString = new JSONObject(str).optString(CommonUrlParts.REQUEST_ID);
            } catch (JSONException unused) {
            }
            Map<EventNames, String> map = this.h;
            map.put(b2, optString);
            h = b2.h();
            MethodScope methodScope = this.f;
            methodScope.getClass();
            if (!h || methodScope == MethodScope.INTERNAL) {
                xgx0 xgx0Var = xgx0.a;
                String str3 = "call " + b2.name();
                xgx0Var.getClass();
                xgx0.f(str3);
                xgx0.a("data " + str);
                return true;
            }
            int i = uyp.a;
            String str4 = null;
            w(b2, fvpVar.c(new Responses$ClientError(str4, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, str2, 3, objArr == true ? 1 : 0), null, null, null, null, 126972, null), map.get(b2), 1, null)));
            return false;
        }
        optString = null;
        Map<EventNames, String> map2 = this.h;
        map2.put(b2, optString);
        h = b2.h();
        MethodScope methodScope2 = this.f;
        methodScope2.getClass();
        if (h) {
        }
        xgx0 xgx0Var2 = xgx0.a;
        String str32 = "call " + b2.name();
        xgx0Var2.getClass();
        xgx0.f(str32);
        xgx0.a("data " + str);
        return true;
    }

    public final void w(EventNames eventNames, com.vk.superapp.base.js.bridge.a aVar) {
        x9y h = this.j.toJsonTree(aVar).h();
        EventNames.Companion.getClass();
        m("VKWebApp" + eventNames.name(), null, new JSONObject(h.toString()));
        WebView r = r();
        if (r != null) {
            r.post(new zs6(0, this, h));
        }
        this.h.remove(eventNames);
        xgx0.a.getClass();
        xgx0.a("Send error to js for event: " + eventNames);
    }

    public final void x(JsApiEvent jsApiEvent, JSONObject jSONObject) {
        xgx0 xgx0Var = xgx0.a;
        String str = "send event: " + jsApiEvent.h() + ", json=" + jSONObject;
        xgx0Var.getClass();
        xgx0.a(str);
        JSONObject a2 = a.a(jsApiEvent.h(), null, jSONObject);
        WebView r = r();
        if (r != null) {
            r.post(new at6(0, this, a2));
        }
    }

    public final void y(JsApiMethodType jsApiMethodType) {
        B(jsApiMethodType, jsApiMethodType.h(), new JSONObject().put("error_type", VkAppsErrors.ErrorTypes.API.h()), null, null);
    }

    public final void z(JsApiMethodType jsApiMethodType, Throwable th) {
        B(jsApiMethodType, jsApiMethodType.h(), VkAppsErrors.b(th), null, null);
    }
}
