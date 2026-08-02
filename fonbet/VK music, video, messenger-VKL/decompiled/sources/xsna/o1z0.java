package xsna;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class o1z0 extends oc {
    public final ArrayList t(JSONArray jSONArray, ooy0 ooy0Var) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        nl nlVar = null;
        if (length <= 0) {
            gu8.c(null, "CommonVideoMotionParser: videoMotionItems size 0");
            return null;
        }
        int i = 0;
        while (i < length) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String c = b920.c(jSONObject, "id");
                if (!TextUtils.isEmpty(c)) {
                    String c2 = b920.c(jSONObject, InAppPurchaseMetaData.KEY_CURRENCY);
                    if (!TextUtils.isEmpty(c2)) {
                        String c3 = b920.c(jSONObject, "image");
                        if (!TextUtils.isEmpty(c3)) {
                            String c4 = b920.c(jSONObject, "text");
                            if (!TextUtils.isEmpty(c4)) {
                                String c5 = b920.c(jSONObject, "ctaText");
                                if (!TextUtils.isEmpty(c5) && jSONObject.has("statistics")) {
                                    xhz0 xhz0Var = new xhz0((jkz0) this.a);
                                    e5z0 a = e5z0.a(ooy0Var.a, nlVar);
                                    xhz0Var.b(a, jSONObject, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    arrayList.add(new ljz0(c, b920.c(jSONObject, "price"), b920.c(jSONObject, "old_price"), c2, c3, c4, c5, a, b920.c(jSONObject, "url"), b920.c(jSONObject, "deeplink"), b920.c(jSONObject, "deeplink_fallback_url")));
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                ooy0Var.d("message=" + e.getMessage(), e);
                e.printStackTrace();
            }
            i++;
            nlVar = null;
        }
        return arrayList;
    }

    public final q7z0 u(JSONObject jSONObject, ooy0 ooy0Var) {
        String c = b920.c(jSONObject, "icon");
        if (TextUtils.isEmpty(c)) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, icon is empty");
            return null;
        }
        String c2 = b920.c(jSONObject, "title");
        if (TextUtils.isEmpty(c2)) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, title is empty");
            return null;
        }
        String c3 = b920.c(jSONObject, "linkText");
        if (TextUtils.isEmpty(c3)) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, link text is empty");
            return null;
        }
        String c4 = b920.c(jSONObject, "ageRestrictionText");
        if (TextUtils.isEmpty(c4)) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, age restriction is empty");
            return null;
        }
        String c5 = b920.c(jSONObject, "adDisclaimerText");
        if (TextUtils.isEmpty(c5)) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, ad disclaimer text is empty");
            return null;
        }
        if (!jSONObject.has("statistics")) {
            gu8.c(null, "CommonVideoMotionParser: can't parse header, hasn't stats key");
            return null;
        }
        xhz0 xhz0Var = new xhz0((jkz0) this.a);
        e5z0 a = e5z0.a(ooy0Var.a, null);
        xhz0Var.c(a, jSONObject, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ooy0Var);
        return new q7z0(c, c2, c3, c4, c5, b920.c(jSONObject, "url"), b920.c(jSONObject, "deeplink"), b920.c(jSONObject, "deeplink_fallback_url"), a);
    }

    public final boolean v(JSONObject jSONObject, bsz0 bsz0Var, ooy0 ooy0Var) {
        q7z0 u;
        try {
            ArrayList t = t(jSONObject.getJSONArray("items"), ooy0Var.a("items"));
            if (t != null && !t.isEmpty() && (u = u(jSONObject.getJSONObject("header"), ooy0Var.a("header"))) != null) {
                jxb0 jxb0Var = null;
                if (jSONObject.has("disclaimer")) {
                    String c = b920.c(jSONObject.getJSONObject("disclaimer"), "text");
                    if (!TextUtils.isEmpty(c)) {
                        jxb0Var = new jxb0(c);
                    }
                }
                bsz0Var.y0 = new rvu(u, t, jxb0Var);
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }
}
