package xsna;

import android.os.SystemClock;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class ohz0 {
    public static JSONObject b(String str, s3z0.a aVar, s3z0 s3z0Var, List list, xla xlaVar, uez0 uez0Var) {
        String trim = str != null ? str.trim() : null;
        if (trim == null || "".equals(trim)) {
            gu8.c(null, "AdResponseParser: Parsing ad response: empty data");
            xlaVar.b(iaz0.j);
            uez0Var.d(3002, "Input json is empty, data=" + str);
            return null;
        }
        gu8.c(null, "AdResponseParser: Converting to JSON...");
        try {
            JSONObject jSONObject = new JSONObject(trim);
            if (!gu8.a && jSONObject.optBoolean("sdk_debug_mode", false)) {
                gu8.a = true;
            }
            if (!f(jSONObject, uez0Var)) {
                gu8.c(null, "AdResponseParser: Invalid json version");
                xlaVar.b(iaz0.k);
                return null;
            }
            e(list, jSONObject, uez0Var);
            boolean optBoolean = jSONObject.optBoolean("sdk_ms", false);
            aVar.b = optBoolean;
            s3z0Var.e = optBoolean;
            long optLong = jSONObject.optLong("timestamp", 0L);
            oay0 oay0Var = oay0.e;
            synchronized (oay0Var) {
                if (!oay0Var.d) {
                    oay0Var.b = optLong * 1000;
                    oay0Var.c = SystemClock.elapsedRealtime();
                    oay0Var.d = true;
                }
            }
            g(jSONObject, uez0Var);
            gu8.c(null, "AdResponseParser: Done");
            return jSONObject;
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("AdResponseParser: Parsing ad response error: "), th);
            xlaVar.b(iaz0.k);
            uez0Var.d(3001, "Get Json, exception=" + gu8.b(th) + ", data=" + str);
            return null;
        }
    }

    public static b2z0 c(JSONObject jSONObject, ooy0 ooy0Var) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("viewabilityTrackerV2");
            if (optJSONObject != null && optJSONObject.optBoolean("enabled", false)) {
                boolean optBoolean = optJSONObject.optBoolean("scroll", false);
                long optDouble = (long) (((float) optJSONObject.optDouble("timerPeriodSecs", ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) * 1000.0f);
                if (optDouble <= 0) {
                    optDouble = 50;
                }
                return new b2z0(optDouble, optJSONObject.optString("algorithm", ""), optBoolean);
            }
            return null;
        } catch (Throwable th) {
            ooy0Var.c(3001, "vvtv2: exception=" + gu8.b(th));
            return null;
        }
    }

    public static void e(List list, JSONObject jSONObject, uez0 uez0Var) {
        if (list == null) {
            return;
        }
        uez0 b = uez0Var.b("hosts");
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("hosts");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String optString = optJSONArray.optString(i, null);
                    if (TextUtils.isEmpty(optString)) {
                        gu8.c(null, "AdResponseParser: Invalid host-string at position " + i);
                    } else {
                        list.add(optString);
                    }
                }
            }
        } catch (Throwable th) {
            gu8.c(null, "AdResponseParser Error: Exception while handling hosts");
            b.a.a(0, 1, 3001, b.e("Handle hosts: exception=" + gu8.b(th)), null);
        }
    }

    public static boolean f(JSONObject jSONObject, uez0 uez0Var) {
        try {
            String string = jSONObject.getString("version");
            gu8.c(null, "AdResponseParser: JSON version " + string);
            int indexOf = string.indexOf(".");
            if (indexOf > 0 && Integer.parseInt(string.substring(0, indexOf), 10) == 2) {
                return true;
            }
            uez0Var.d(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, "Unsupported version=".concat(string));
            return false;
        } catch (Throwable th) {
            gu8.c(null, "AdResponseParser Error: Check version failed - " + th.getMessage());
            StringBuilder sb = new StringBuilder("Check version exception: ");
            sb.append("message=" + th.getMessage() + "\nexception=" + gu8.b(th));
            uez0Var.d(3001, sb.toString());
            return false;
        }
    }

    public static void g(JSONObject jSONObject, uez0 uez0Var) {
        JSONObject optJSONObject;
        try {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("featureFlags");
            boolean z = false;
            if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("sendStatisticV2")) != null) {
                long optLong = optJSONObject.optLong("ttl", 7200L) * 1000;
                if (jfz0.j.compareAndSet(false, true)) {
                    jfz0.k = Math.max(300000L, Math.min(optLong, 432000000L));
                }
            }
            if (optJSONObject2 != null) {
                try {
                    if (optJSONObject2.has("sendMonitoring")) {
                        z = optJSONObject2.getBoolean("sendMonitoring");
                    }
                } catch (Throwable unused) {
                }
            }
            udz0 udz0Var = uez0Var.a;
            if (udz0Var.i == 0) {
                udz0Var.f.b(udz0Var, z, new zer0(udz0Var, z, 1));
            }
            if (optJSONObject2 == null) {
                return;
            }
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("interstitial");
            if (optJSONObject3 != null) {
                try {
                    optJSONObject3.optBoolean("isHitMapEnabled");
                } catch (Throwable unused2) {
                }
            }
            uez0Var.a.getClass();
        } catch (Throwable th) {
            gu8.c(null, "AdResponseParser: Parsing ad response error: " + th.getMessage());
            uez0Var.d(3001, "Feature-flag json parse, exception=" + gu8.b(th) + ", data=" + jSONObject);
        }
    }

    public static boolean h(String str) {
        String trim = str.trim();
        return trim.startsWith("<VAST") || trim.startsWith("<?xml");
    }

    public abstract njz0 d(String str, jkz0 jkz0Var, njz0 njz0Var, u6z0 u6z0Var, s3z0.a aVar, s3z0 s3z0Var, ArrayList arrayList, xla xlaVar);
}
