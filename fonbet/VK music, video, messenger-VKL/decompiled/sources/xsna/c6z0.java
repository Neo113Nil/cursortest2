package xsna;

import android.text.TextUtils;
import com.ironsource.sdk.controller.f;
import com.unity3d.ads.BuildConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.wty0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class c6z0 {
    public static wty0 a(JSONObject jSONObject) {
        wty0.a aVar;
        JSONObject optJSONObject = jSONObject.optJSONObject("adInfo");
        if (optJSONObject == null) {
            throw new JSONException("VastAdChoicesParser: adInfo json object is mandatory");
        }
        ArrayList arrayList = new ArrayList();
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("advertiserInfo");
        if (optJSONObject2 == null) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo json object is mandatory");
        }
        String c = b920.c(optJSONObject2, "text");
        if (TextUtils.isEmpty(c)) {
            throw new JSONException("VastAdChoicesParser: advertiserInfo:text json field is mandatory");
        }
        String c2 = b920.c(optJSONObject2, "url");
        if (TextUtils.isEmpty(c2) || !s770.k(c2)) {
            throw new JSONException(zr.a("VastAdChoicesParser: Invalid url (", c2, ") in advertiserInfo:url"));
        }
        gu8.c(null, "VastAdChoicesParser: parsed advertiserInfo: name = " + c + ", clickLink = " + c2);
        arrayList.add(new wty0.a(c, BuildConfig.FLAVOR, null, c2, null, null, true));
        JSONObject optJSONObject3 = optJSONObject.optJSONObject(f.b.c);
        if (optJSONObject3 == null) {
            throw new JSONException("VastAdChoicesParser: adId json object is mandatory");
        }
        String c3 = b920.c(optJSONObject3, "text");
        if (TextUtils.isEmpty(c3)) {
            throw new JSONException("VastAdChoicesParser: adId:text json field is mandatory");
        }
        String c4 = b920.c(optJSONObject3, "copyText");
        if (TextUtils.isEmpty(c4)) {
            throw new JSONException("VastAdChoicesParser: adId:copyText json field is mandatory");
        }
        gu8.c(null, "VastAdChoicesParser: parsed adId: name = " + c3 + ", copyText = " + c4);
        arrayList.add(new wty0.a(c3, "copy", null, null, c4, null, false));
        JSONObject optJSONObject4 = optJSONObject.optJSONObject("icon");
        if (optJSONObject4 == null) {
            throw new JSONException("VastAdChoicesParser: icon json object is mandatory");
        }
        String c5 = b920.c(optJSONObject4, "url");
        if (TextUtils.isEmpty(c5) || !s770.k(c5)) {
            throw new JSONException(go9.b("VastAdChoicesParser: Invalid iconLink in adChoices = ", c5));
        }
        gu8.c(null, "VastAdChoicesParser: parsed icon: url = " + c5);
        kiw kiwVar = new kiw(c5);
        JSONObject optJSONObject5 = optJSONObject.optJSONObject("recommendationInfo");
        if (optJSONObject5 == null) {
            aVar = null;
        } else {
            String c6 = b920.c(optJSONObject5, "text");
            if (TextUtils.isEmpty(c6)) {
                throw new JSONException("VastAdChoicesParser: recommendationInfo:text json field is mandatory");
            }
            String c7 = b920.c(optJSONObject5, "url");
            if (TextUtils.isEmpty(c7) || !s770.k(c7)) {
                throw new JSONException(zr.a("VastAdChoicesParser: Invalid url (", c7, ") in recommendationInfo:url"));
            }
            gu8.c(null, "VastAdChoicesParser: parsed recommendationInfo: name = " + c6 + ", clickLink = " + c7);
            aVar = new wty0.a(c6, BuildConfig.FLAVOR, null, c7, null, null, true);
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
        wty0 wty0Var = new wty0(kiwVar, "");
        wty0Var.c = arrayList;
        if (wty0Var.d != null) {
            wty0Var.d = wty0.a(arrayList);
        }
        gu8.c(null, "VastAdChoicesParser: parsed adInfo");
        gu8.c(null, "VastAdChoicesParser: parsed adChoices");
        return wty0Var;
    }
}
