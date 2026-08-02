package yads;

import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class on1 {
    public final yc3 a;

    public on1(yc3 yc3Var) {
        this.a = yc3Var;
    }

    public final Object a(JSONObject jSONObject) {
        String a = this.a.a("html", jSONObject);
        float f = (float) jSONObject.getDouble("aspectRatio");
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.7777778f;
        }
        return new pk1(a, f);
    }
}
