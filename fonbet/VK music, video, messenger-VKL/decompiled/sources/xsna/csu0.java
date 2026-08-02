package xsna;

import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VkExecutorsConfigRepository.kt */
/* loaded from: classes.dex */
public final class csu0 {
    public static final csu0 a = new csu0();
    public static final bpn0 b = new bpn0(new cd3(17));

    public static bsu0 a() {
        if (e43.a == null || !b().exists()) {
            return null;
        }
        try {
            String r = nbr.r(b(), emb.b);
            if (drm0.N(r)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(r);
            return new bsu0(jSONObject.optBoolean("is_experimental_im_pool_enabled", false), jSONObject.optBoolean("is_experimental_image_pool_enabled", false), jSONObject.optBoolean("is_experimental_thread_pool_enabled", false));
        } catch (IllegalArgumentException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return null;
        } catch (NullPointerException e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
            return null;
        } catch (JSONException e3) {
            com.vk.metrics.eventtracking.b.a.a(e3);
            return null;
        }
    }

    public static File b() {
        return (File) b.getValue();
    }
}
