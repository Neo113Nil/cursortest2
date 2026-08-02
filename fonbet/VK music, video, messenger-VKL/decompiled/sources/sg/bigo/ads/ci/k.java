package sg.bigo.ads.ci;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.json.JSONObject;
import sg.bigo.ads.ai.o;

/* loaded from: classes9.dex */
public final class k implements o {

    @NonNull
    private final JSONObject a;

    public k(@NonNull JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Nullable
    private Object d(@NonNull String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        JSONObject jSONObject = this.a;
        for (int i = 0; i < split.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(split[i]);
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject.opt(split[split.length - 1]);
    }

    @Override // sg.bigo.ads.ai.o
    public final int a(@NonNull String str) {
        Integer a = sg.bigo.ads.common.utils.k.a(d(str));
        if (a != null) {
            return a.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.ai.o
    public final float b(@NonNull String str) {
        Float b = sg.bigo.ads.common.utils.k.b(d(str));
        return b != null ? b.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // sg.bigo.ads.ai.o
    public final boolean c(@NonNull String str) {
        return a(str) == 1;
    }

    @NonNull
    public final String toString() {
        return this.a.toString();
    }

    @Override // sg.bigo.ads.ai.o
    public final int a(@NonNull String str, int i) {
        Integer a = sg.bigo.ads.common.utils.k.a(d(str));
        return a != null ? a.intValue() : i;
    }

    @Override // sg.bigo.ads.ai.o
    public final o a(Map<String, String> map) {
        try {
            k kVar = new k(new JSONObject(this.a.toString()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                JSONObject optJSONObject = this.a.optJSONObject(value);
                if (optJSONObject != null) {
                    kVar.a.put(key, optJSONObject);
                }
                kVar.a.remove(value);
                this.a.remove(value);
            }
            return kVar;
        } catch (Exception unused) {
            return this;
        }
    }
}
