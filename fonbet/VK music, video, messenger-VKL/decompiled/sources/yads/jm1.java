package yads;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class jm1 {
    public final ax3 a;

    public jm1(ax3 ax3Var) {
        this.a = ax3Var;
    }

    public final void a(float f, float f2) {
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new IllegalArgumentException("Invalid Media duration");
        }
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        iy3.a(this.a);
        JSONObject jSONObject = new JSONObject();
        px3.a(jSONObject, "duration", Float.valueOf(f));
        px3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
        px3.a(jSONObject, X3.j.P, Float.valueOf(ny3.a().a));
        this.a.e.a("start", jSONObject);
    }

    public final void a(float f) {
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= 1.0f) {
            iy3.a(this.a);
            JSONObject jSONObject = new JSONObject();
            px3.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
            px3.a(jSONObject, X3.j.P, Float.valueOf(ny3.a().a));
            this.a.e.a("volumeChange", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }
}
