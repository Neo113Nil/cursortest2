package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class xhz0 {
    public final jkz0 a;
    public int b = 1;

    public xhz0(jkz0 jkz0Var) {
        this.a = jkz0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final z1z0 a(JSONObject jSONObject, float f, ooy0 ooy0Var) {
        char c;
        int i;
        int i2;
        z1z0 z1z0Var;
        z1z0 z1z0Var2;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("url");
        boolean optBoolean = jSONObject.optBoolean("isImpression", false);
        z1z0 z1z0Var3 = null;
        if (!s770.k(optString2)) {
            ooy0Var.a("url").c(3007, optString2);
            return null;
        }
        if (TextUtils.isEmpty(optString)) {
            ooy0Var.a("type").b(3006);
            return null;
        }
        optString.getClass();
        switch (optString.hashCode()) {
            case -1439500848:
                if (optString.equals(X3.i.n)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1669348544:
                if (optString.equals("playheadViewabilityValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1788134515:
                if (optString.equals("playheadReachedValue")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (jSONObject.has(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                    z1z0Var3 = new ddy0(optString2, jSONObject.optString(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW));
                    z1z0Var2 = z1z0Var3;
                    break;
                } else {
                    ooy0Var.a(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW).g(3006);
                    z1z0Var3 = null;
                    z1z0Var2 = z1z0Var3;
                }
            case 1:
                int optInt = jSONObject.optInt("viewablePercent", -1);
                if (optInt < 0 || optInt > 100) {
                    ooy0Var.a("viewablePercent").h(3007, Integer.toString(optInt));
                } else {
                    String c2 = b920.c(jSONObject, "target");
                    if (TextUtils.isEmpty(c2)) {
                        i = this.b;
                    } else if ("video".equals(c2)) {
                        i = 2;
                    } else if ("banner".equals(c2)) {
                        i = 1;
                    } else {
                        ooy0Var.a("target").h(3007, c2);
                    }
                    if (jSONObject.has("ovv")) {
                        ghy0 ghy0Var = new ghy0(optInt, "ovvStat", optString2, i, optBoolean);
                        i2 = optInt;
                        optString2 = optString2;
                        ghy0Var.i = -1.0f;
                        ghy0Var.j = -1.0f;
                        ghy0Var.h = jSONObject.optBoolean("ovv", false);
                        if (jSONObject.has("pvalue")) {
                            float optDouble = (float) jSONObject.optDouble("pvalue", ghy0Var.j);
                            if (optDouble >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && optDouble <= 100.0f) {
                                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    ghy0Var.i = (optDouble * f) / 100.0f;
                                    z1z0Var = ghy0Var;
                                } else {
                                    ghy0Var.j = optDouble;
                                    z1z0Var = ghy0Var;
                                }
                                z1z0Var3 = z1z0Var;
                                z1z0Var2 = z1z0Var3;
                                break;
                            }
                        }
                        if (jSONObject.has("value")) {
                            float optDouble2 = (float) jSONObject.optDouble("value", ghy0Var.i);
                            if (optDouble2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                ghy0Var.i = optDouble2;
                                z1z0Var = ghy0Var;
                                z1z0Var3 = z1z0Var;
                                z1z0Var2 = z1z0Var3;
                            }
                        }
                    } else {
                        i2 = optInt;
                    }
                    float optDouble3 = (float) jSONObject.optDouble("duration", -1.0d);
                    if (optDouble3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        ooy0 a = ooy0Var.a("duration");
                        if (jSONObject.has("duration")) {
                            a.h(3007, Float.toString(optDouble3));
                        } else {
                            a.g(3006);
                        }
                    } else {
                        z1z0Var = new oiz0(optString2, optDouble3, i2, jSONObject.optBoolean("mrc", true), i, optBoolean);
                        z1z0Var3 = z1z0Var;
                        z1z0Var2 = z1z0Var3;
                    }
                }
                z1z0Var3 = null;
                z1z0Var2 = z1z0Var3;
                break;
            case 2:
                e9z0 e9z0Var = new e9z0("playheadReachedValue", optString2, false);
                e9z0Var.f = -1.0f;
                e9z0Var.g = -1.0f;
                if (jSONObject.has("pvalue")) {
                    float optDouble4 = (float) jSONObject.optDouble("pvalue", e9z0Var.g);
                    if (optDouble4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && optDouble4 <= 100.0f) {
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            e9z0Var.f = (optDouble4 * f) / 100.0f;
                        } else {
                            e9z0Var.g = optDouble4;
                        }
                        z1z0Var3 = e9z0Var;
                        z1z0Var2 = z1z0Var3;
                        break;
                    } else {
                        ooy0Var.a("pvalue").c(3007, Float.toString(optDouble4));
                    }
                }
                if (jSONObject.has("value")) {
                    float optDouble5 = (float) jSONObject.optDouble("value", e9z0Var.f);
                    if (optDouble5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        e9z0Var.f = optDouble5;
                        z1z0Var3 = e9z0Var;
                        z1z0Var2 = z1z0Var3;
                    } else {
                        ooy0Var.a("value").c(3007, Float.toString(optDouble5));
                    }
                }
                ooy0Var.b(3007);
                z1z0Var2 = z1z0Var3;
                break;
            default:
                z1z0Var2 = new z1z0(optString, optString2, optBoolean);
                break;
        }
        if (z1z0Var2 != null) {
            z1z0Var2.e = jSONObject.optBoolean("needDecodeUrl", z1z0Var2.e);
            String optString3 = jSONObject.optString("adsLightType");
            if (!TextUtils.isEmpty(optString3)) {
                z1z0Var2.c = optString3;
            }
        }
        return z1z0Var2;
    }

    public final void b(e5z0 e5z0Var, JSONObject jSONObject, float f) {
        c(e5z0Var, jSONObject, f, ooy0.e);
    }

    public final void c(e5z0 e5z0Var, JSONObject jSONObject, float f, ooy0 ooy0Var) {
        int length;
        e5z0Var.g(this.a.d, f);
        JSONArray optJSONArray = jSONObject.optJSONArray("statistics");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            ooy0 a = ooy0Var.a("statistics");
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                ooy0 f2 = a.f(i);
                if (optJSONObject == null) {
                    f2.g(3007);
                } else {
                    z1z0 a2 = a(optJSONObject, f, f2);
                    if (a2 != null) {
                        e5z0Var.f(a2);
                    }
                }
            }
        }
    }
}
