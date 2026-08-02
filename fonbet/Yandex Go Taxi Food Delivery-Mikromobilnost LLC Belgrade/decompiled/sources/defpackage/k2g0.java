package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.push.impl.domain.a;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k2g0 {
    public final LinkedHashMap a;

    public k2g0(Map map) {
        this.a = new LinkedHashMap(map);
    }

    public final Boolean a() {
        JSONObject f = f();
        if (f != null) {
            return Boolean.valueOf(f.optBoolean("ack_required", false));
        }
        return null;
    }

    public final String b() {
        JSONObject optJSONObject;
        JSONObject d = d();
        if (d == null || (optJSONObject = d.optJSONObject("d")) == null) {
            return null;
        }
        return optJSONObject.optString("g");
    }

    public final String c() {
        JSONObject optJSONObject;
        JSONObject d = d();
        if (d == null || (optJSONObject = d.optJSONObject("d")) == null) {
            return null;
        }
        return optJSONObject.optString("w");
    }

    public final JSONObject d() {
        String str = (String) this.a.get(CoreConstants.PushMessage.ROOT_ELEMENT);
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String e() {
        JSONObject optJSONObject;
        JSONObject d = d();
        if (d == null || (optJSONObject = d.optJSONObject("d")) == null) {
            return null;
        }
        return optJSONObject.optString("ac");
    }

    public final JSONObject f() {
        JSONObject d = d();
        if (d != null) {
            return d.optJSONObject("c");
        }
        return null;
    }

    public final String g() {
        JSONObject d = d();
        if (d != null) {
            return d.optString("a");
        }
        return null;
    }

    public final String h() {
        JSONObject f = f();
        if (f != null) {
            return f.optString("feature");
        }
        return null;
    }

    public final JSONObject i() {
        JSONObject f = f();
        if (f != null) {
            return f.optJSONObject("params");
        }
        return null;
    }

    public final String j() {
        JSONObject f = f();
        if (f != null) {
            return f.optString("source");
        }
        return null;
    }

    public final String k() {
        JSONObject optJSONObject;
        JSONObject d = d();
        if (d == null || (optJSONObject = d.optJSONObject("d")) == null) {
            return null;
        }
        return optJSONObject.optString("e");
    }

    public final boolean l() {
        return jl40.l(j(), a.m);
    }

    public final boolean m() {
        JSONObject d = d();
        if (d != null) {
            return d.optBoolean("b");
        }
        return false;
    }

    public final void n(String str) {
        JSONObject d = d();
        JSONObject optJSONObject = d != null ? d.optJSONObject("d") : null;
        if (optJSONObject != null) {
            optJSONObject.put("g", str);
        }
        JSONObject d2 = d();
        JSONObject put = d2 != null ? d2.put("d", optJSONObject) : null;
        this.a.put(CoreConstants.PushMessage.ROOT_ELEMENT, put != null ? put.toString() : null);
    }

    public final void o(String str) {
        JSONObject d = d();
        JSONObject optJSONObject = d != null ? d.optJSONObject("d") : null;
        if (optJSONObject != null) {
            optJSONObject.put("w", str);
        }
        JSONObject d2 = d();
        JSONObject put = d2 != null ? d2.put("d", optJSONObject) : null;
        this.a.put(CoreConstants.PushMessage.ROOT_ELEMENT, put != null ? put.toString() : null);
    }

    public final void p(String str) {
        JSONObject d = d();
        JSONObject optJSONObject = d != null ? d.optJSONObject("d") : null;
        if (optJSONObject != null) {
            optJSONObject.put("e", str);
        }
        JSONObject d2 = d();
        JSONObject put = d2 != null ? d2.put("d", optJSONObject) : null;
        this.a.put(CoreConstants.PushMessage.ROOT_ELEMENT, put != null ? put.toString() : null);
    }

    public final Bundle q() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.a.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }
}
