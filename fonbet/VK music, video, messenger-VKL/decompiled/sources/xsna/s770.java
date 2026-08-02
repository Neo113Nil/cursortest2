package xsna;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class s770 implements i7d0 {
    public static final String[] b = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "https://appgallery.huawei.com/", "https://appgallery.cloud.huawei.com/", "market://", "samsungapps://", "appmarket://", "hiapplink://", "mimarket://", "https://apps.rustore.ru", "https://backapi.rustore.ru"};

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, C.UTF8_NAME);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("UrlResolver: Unable to decode url - "), th);
            return str;
        }
    }

    public static day0 c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        String str = "";
        boolean z = false;
        try {
            if (jSONObject.has("data") && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                String optString = optJSONObject.optString("igniteVersion", "");
                try {
                    if (optJSONObject.has("features") && (optJSONArray = optJSONObject.optJSONArray("features")) != null) {
                        for (int length = optJSONArray.length() - 1; length >= 0; length--) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(length);
                            if (optJSONObject2.has("type") && "GET_PROPERTY".equalsIgnoreCase(optJSONObject2.optString("type", ""))) {
                                str = optString;
                                z = true;
                                break;
                            }
                        }
                    }
                    str = optString;
                } catch (Exception e) {
                    e = e;
                    str = optString;
                    vay0.d("IgniteVersionParser: exception on parse: %s", e.getMessage());
                    return new day0(z, str);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return new day0(z, str);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                n34.e("IOUtil", "closeSecure IOException");
            }
        }
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return URLUtil.isHttpsUrl(str);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i = 0; i < 13; i++) {
            if (str.startsWith(b[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (URLUtil.isHttpsUrl(str)) {
                return !TextUtils.isEmpty(new URL(str).getHost());
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public abstract qez0 d(String str, String str2, Map map);

    public void f(String str) {
        d("https://sdk.mail.ru/sdk/log/v2", str, null);
    }

    public abstract void g(int i, int i2, int i3);

    public abstract List h(kn00 kn00Var);

    public abstract View l();

    public abstract void m(hkp hkpVar, Object obj, int i);

    public void n(hkp hkpVar, Object obj, int i, List list) {
        m(hkpVar, obj, i);
    }

    public abstract hkp p(View view);

    public abstract Bitmap q(Bitmap bitmap);

    public abstract q94 r(q94 q94Var);

    public void o(hkp hkpVar, Object obj, boolean z) {
    }
}
