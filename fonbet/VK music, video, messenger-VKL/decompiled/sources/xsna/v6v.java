package xsna;

import com.vk.log.L;
import com.vk.toggle.Features;
import com.vk.toggle.b;
import org.json.JSONObject;

/* compiled from: HintFeatureToggles.kt */
/* loaded from: classes7.dex */
public final class v6v {
    public static ghu a() {
        if (!com.vk.toggle.b.A.a(Features.Type.FEATURE_VOIP_GROUP_CAM_OFF_BAD_NET)) {
            return new ghu(false);
        }
        try {
            return b();
        } catch (Exception e) {
            L.C("Can't parse " + Features.Type.FEATURE_VOIP_GROUP_CAM_OFF_BAD_NET.getKey() + " feature toggle values", e);
            return new ghu(true);
        }
    }

    public static ghu b() {
        ghu ghuVar = new ghu(true);
        b.d i = com.vk.toggle.b.A.i(Features.Type.FEATURE_VOIP_GROUP_CAM_OFF_BAD_NET);
        String obj = i != null ? i.c.toString() : null;
        if (obj == null || obj.length() == 0) {
            return ghuVar;
        }
        JSONObject jSONObject = new JSONObject(obj);
        return new ghu(true, jSONObject.has("camera_disabled_duration_ms") ? jSONObject.getLong("camera_disabled_duration_ms") : 5000L);
    }
}
