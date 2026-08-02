package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.yandex.alicekit.core.json.schema.HtmlString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class b4x {
    public static JSONArray a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            return optJSONArray;
        }
        throw new JSONException(oyr.p("Value for ", str, " is null"));
    }

    public static JSONObject b(String str, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        throw new JSONException(oyr.p("Object for ", str, " is null"));
    }

    public static Integer c(String str, JSONObject jSONObject) {
        String m = m(str, jSONObject);
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        try {
            return Integer.valueOf(mob1.b(m));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static Double d(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        if (opt instanceof Number) {
            return Double.valueOf(((Number) opt).doubleValue());
        }
        throw new JSONException(qv10.o("Expected number, got ", opt));
    }

    public static Integer e(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        if (opt instanceof Number) {
            return Integer.valueOf(((Number) opt).intValue());
        }
        throw new JSONException(qv10.o("Expected number, got ", opt));
    }

    public static Boolean f(String str, JSONObject jSONObject) {
        Integer e = e(str, jSONObject);
        if (e == null) {
            return null;
        }
        return Boolean.valueOf(e.intValue() == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(String str, JSONObject jSONObject) {
        Integer valueOf;
        String j = j(str, jSONObject);
        if (!TextUtils.isEmpty(j)) {
            try {
                valueOf = Integer.valueOf(mob1.b(j));
            } catch (IllegalArgumentException unused) {
            }
            if (valueOf == null) {
                return valueOf.intValue();
            }
            throw new JSONException(unr0.p("Invalid color value [", j, "] for attribute [", str, "]"));
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static Integer h(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            throw new JSONException(oyr.p("Value for ", str, " is null"));
        }
        if (opt instanceof Number) {
            return Integer.valueOf(((Number) opt).intValue());
        }
        throw new JSONException(qv10.o("Expected number, got ", opt));
    }

    public static HtmlString i(String str, JSONObject jSONObject) {
        HtmlString l = l(str, jSONObject);
        if (l != null) {
            return l;
        }
        throw new JSONException(oyr.p("Value for ", str, " is null"));
    }

    public static String j(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            throw new JSONException(oyr.p("String for ", str, " is null"));
        }
        return String.valueOf(opt);
    }

    public static Uri k(String str, JSONObject jSONObject) {
        String j = j(str, jSONObject);
        if (TextUtils.isEmpty(j)) {
            throw new JSONException(oyr.p("String for uri ", str, " is empty"));
        }
        if (j.startsWith("//")) {
            j = "https:".concat(j);
        }
        return TextUtils.isEmpty(j) ? Uri.EMPTY : Uri.parse(j);
    }

    public static HtmlString l(String str, JSONObject jSONObject) {
        String m = m(str, jSONObject);
        if (TextUtils.isEmpty(m)) {
            return null;
        }
        return new HtmlString(m);
    }

    public static String m(String str, JSONObject jSONObject) {
        Object opt = jSONObject.opt(str);
        if (opt == null || opt == JSONObject.NULL) {
            return null;
        }
        return String.valueOf(opt);
    }
}
