package xsna;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.C4217a2;
import com.ironsource.X3;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import com.vk.toggle.features.CoreFeatures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

/* compiled from: UrlHelper.java */
/* loaded from: classes7.dex */
public final class zeq0 {
    public static String a() {
        return b().toString();
    }

    public static JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CallAnalyticsApiRequest.KEY_APP_VERSION, BuildInfo.d);
            jSONObject.put("app_build", BuildInfo.e);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, Build.MODEL);
            jSONObject.put("android_build_device", Build.DEVICE);
            jSONObject.put("system_name", X3.d);
            jSONObject.put("system_version", Build.VERSION.RELEASE);
            String str = com.vkontakte.android.data.b.h().r;
            if ("-3".equals(str)) {
                jSONObject.put("ads_tracking_disabled", 1);
            } else if (!C4217a2.f.equals(str) && !"-2".equals(str)) {
                jSONObject.put("ads_device_id", str);
                com.vkontakte.android.data.b.h().getClass();
            }
            jSONObject.put("ads_android_id", b6m.b(e43.a));
            r6m.a.getClass();
            Context context = r6m.e;
            Context context2 = null;
            if (context == null) {
                context = null;
            }
            AudioDeviceInfo[] devices = ((AudioManager) context.getSystemService("audio")).getDevices(2);
            ArrayList arrayList = new ArrayList();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 22) {
                    arrayList.add(audioDeviceInfo);
                }
            }
            jSONObject.put("headset_on", j5g.M(arrayList));
            r6m.a.getClass();
            Context context3 = r6m.e;
            if (context3 != null) {
                context2 = context3;
            }
            jSONObject.put("sound_playing", ((AudioManager) context2.getSystemService("audio")).isMusicActive());
            if (dmx0.i.get()) {
                jSONObject.put("is_whitelist_enabled", dmx0.c());
            }
            CoreFeatures coreFeatures = CoreFeatures.KBH_DETECT;
            coreFeatures.getClass();
            if (com.vk.toggle.b.A.a(coreFeatures) && epx.f(d6q0.p, Boolean.TRUE)) {
                jSONObject.put("bad_connection", 1);
            }
            JSONObject f = com.vkontakte.android.data.b.f();
            if (f != null) {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, f);
            }
            return jSONObject;
        } catch (Exception e) {
            L.i(e);
            return jSONObject;
        }
    }

    public static String c(Boolean bool) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CallAnalyticsApiRequest.KEY_APP_VERSION, BuildInfo.d);
            jSONObject.put("app_build", BuildInfo.e);
            jSONObject.put("manufacturer", Build.MANUFACTURER);
            jSONObject.put(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL, Build.MODEL);
            jSONObject.put("android_build_device", Build.DEVICE);
            jSONObject.put("system_name", X3.d);
            jSONObject.put("system_version", Build.VERSION.RELEASE);
            if (bool.booleanValue() && dmx0.i.get()) {
                jSONObject.put("is_whitelist_enabled", dmx0.c());
            }
            String str = com.vkontakte.android.data.b.h().r;
            if ("-3".equals(str)) {
                jSONObject.put("ads_tracking_disabled", 1);
            } else if (!C4217a2.f.equals(str) && !"-2".equals(str)) {
                jSONObject.put("ads_device_id", str);
                com.vkontakte.android.data.b.h().getClass();
            }
            jSONObject.put("ads_android_id", b6m.b(e43.a));
            JSONObject f = com.vkontakte.android.data.b.f();
            if (f == null) {
                try {
                    f = new JSONObject(Preference.l().getString("mytarget_fingerprint", null));
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(e);
                }
            }
            if (f != null) {
                jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, f);
            }
        } catch (Exception e2) {
            L.i(e2);
        }
        return jSONObject.toString();
    }

    public static String d(boolean z, String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        hashSet.add("ads_app");
        hashSet.add("ads_site");
        hashSet.add("ads_post");
        hashSet.add("ads_app_slider");
        hashSet.add("ads_site_slider");
        hashSet.add("ads_app_video");
        hashSet.add("ads_post_pretty_cards");
        hashSet.add("ads_post_snippet_video");
        int size = hashSet.size();
        String[] strArr2 = new String[size];
        Iterator it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr2[i] = (String) it.next();
            i++;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append("ads_disabled");
        }
        for (int i2 = 0; i2 < size; i2++) {
            String str = strArr2[i2];
            if (sb.length() != 0) {
                sb.append(',');
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            sr10 sr10Var = dy2.a;
            String i = sr10Var != null ? sr10Var.i() : null;
            String valueOf = String.valueOf(i);
            if (!valueOf.equals("always") && !valueOf.equals("wifi")) {
                i = "none";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("value", i);
            jSONObject.put("autoplay_video", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("value", i);
            jSONObject.put("autoplay_gif", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            sr10 sr10Var2 = dy2.a;
            jSONObject4.put("value", sr10Var2 != null ? sr10Var2.c() : true ? "off" : "on");
            jSONObject.put("traffic_saver", jSONObject4);
        } catch (JSONException e) {
            L.i(e);
        }
        return jSONObject.toString();
    }
}
