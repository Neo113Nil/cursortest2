package xsna;

import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Applier.kt */
/* loaded from: classes11.dex */
public abstract class oc implements fd3 {
    public final Object a;
    public Object b;
    public final Object c;

    public oc(jkz0 jkz0Var, u6z0 u6z0Var, int i) {
        this.a = jkz0Var;
        this.b = u6z0Var;
        ryy0 ryy0Var = new ryy0(u6z0Var, jkz0Var);
        this.c = ryy0Var;
        ryy0Var.a.b = i;
    }

    public static c900 k(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("loudnessMetadata");
        if (optJSONObject == null) {
            return null;
        }
        float optDouble = (float) optJSONObject.optDouble("integratedLufs");
        float optDouble2 = (float) optJSONObject.optDouble("truePeak");
        if (Float.isNaN(optDouble) || Float.isNaN(optDouble2)) {
            return null;
        }
        return new c900(optDouble, optDouble2);
    }

    public static kiw q(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            gu8.c(null, "CommonVideoParser: PostView background image hasn't url");
            return null;
        }
        int optInt = jSONObject.optInt("width", -1);
        if (optInt < 0) {
            gu8.c(null, "CommonVideoParser: PostView background image hasn't width");
            return null;
        }
        int optInt2 = jSONObject.optInt("height", -1);
        if (optInt2 >= 0) {
            return kiw.b(optInt, optInt2, optString);
        }
        gu8.c(null, "CommonVideoParser: PostView background image hasn't height");
        return null;
    }

    @Override // xsna.fd3
    public Object a() {
        return this.b;
    }

    @Override // xsna.fd3
    public void f(Object obj) {
        ((ArrayList) this.c).add(this.b);
        this.b = obj;
    }

    @Override // xsna.fd3
    public void j() {
        this.b = znk0.J((ArrayList) this.c);
    }

    public void l(JSONObject jSONObject, lgz0 lgz0Var) {
        n(jSONObject, lgz0Var);
        jkz0 jkz0Var = (jkz0) this.a;
        Boolean bool = jkz0Var.x;
        lgz0Var.l0 = bool != null ? bool.booleanValue() : jSONObject.optBoolean("allowClose", lgz0Var.l0);
        Boolean bool2 = jkz0Var.y;
        lgz0Var.p0 = bool2 != null ? bool2.booleanValue() : jSONObject.optBoolean("hasPause", lgz0Var.p0);
        Boolean bool3 = jkz0Var.E;
        lgz0Var.j0 = bool3 != null ? bool3.booleanValue() : jSONObject.optBoolean("allowReplay", lgz0Var.j0);
        float f = jkz0Var.w;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = (float) jSONObject.optDouble("allowCloseDelay", lgz0Var.q0);
        }
        lgz0Var.q0 = f;
    }

    public boolean m(JSONObject jSONObject, lgz0 lgz0Var, ooy0 ooy0Var) {
        ((ryy0) this.c).c(jSONObject, lgz0Var, ooy0Var.i());
        if (!"statistics".equals(lgz0Var.E)) {
            return false;
        }
        n(jSONObject, lgz0Var);
        return true;
    }

    public void n(JSONObject jSONObject, lgz0 lgz0Var) {
        jkz0 jkz0Var = (jkz0) this.a;
        float f = jkz0Var.s;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jSONObject.has("point")) {
            f = (float) jSONObject.optDouble("point");
        }
        float f2 = jkz0Var.t;
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && jSONObject.has("pointP")) {
            f2 = (float) jSONObject.optDouble("pointP");
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = -1.0f;
            f2 = -1.0f;
        }
        lgz0Var.s0 = f;
        lgz0Var.t0 = f2;
    }

    public void o(JSONObject jSONObject, lgz0 lgz0Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray("companionAds");
        if (optJSONArray == null) {
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                n4z0 n4z0Var = new n4z0();
                ryy0 ryy0Var = (ryy0) this.c;
                ryy0Var.getClass();
                ryy0Var.c(optJSONObject, n4z0Var, ooy0.e);
                if (n4z0Var.B == 0 || n4z0Var.C == 0) {
                    n4z0Var = null;
                } else {
                    n4z0Var.U = optJSONObject.optInt("assetWidth");
                    n4z0Var.V = optJSONObject.optInt("assetHeight");
                    n4z0Var.W = optJSONObject.optInt("expandedWidth");
                    n4z0Var.X = optJSONObject.optInt("expandedHeight");
                    n4z0Var.Y = optJSONObject.optString("staticResource");
                    n4z0Var.Z = optJSONObject.optString("iframeResource");
                    n4z0Var.a0 = optJSONObject.optString("htmlResource");
                    n4z0Var.b0 = optJSONObject.optString("apiFramework");
                    n4z0Var.c0 = optJSONObject.optString("adSlotID");
                    String optString = optJSONObject.optString("required");
                    if (!TextUtils.isEmpty(optString) && ("all".equals(optString) || "any".equals(optString) || "none".equals(optString))) {
                        n4z0Var.d0 = optString;
                    }
                }
                if (n4z0Var != null) {
                    lgz0Var.U.add(n4z0Var);
                }
            }
        }
    }

    public void p() {
        ((ArrayList) this.c).clear();
        this.b = this.a;
        s();
    }

    public b1z0 r(JSONObject jSONObject, lgz0 lgz0Var) {
        String optString = jSONObject.optString("src");
        if (TextUtils.isEmpty(optString)) {
            gu8.c(null, "CommonVideoParser: encoded shoppable source is empty or null");
            return null;
        }
        try {
            String str = new String(Base64.decode(optString, 0));
            int i = 2;
            int optInt = jSONObject.optInt("interactionTimeout", 2);
            if (jSONObject.has("interactionTimeout") && optInt >= 0) {
                i = optInt;
            }
            b1z0 b1z0Var = new b1z0(str, (long) (Math.min(i, lgz0Var.D) * 1000.0f));
            ryy0 ryy0Var = (ryy0) this.c;
            ryy0Var.getClass();
            ryy0Var.c(jSONObject, b1z0Var, ooy0.e);
            return b1z0Var;
        } catch (Throwable th) {
            gu8.c(null, "CommonVideoParser: shoppable source parsing is ended with exception: " + th);
            th.toString();
            return null;
        }
    }

    public abstract void s();

    public oc(Object obj) {
        this.a = obj;
        this.c = new ArrayList();
        this.b = obj;
    }
}
