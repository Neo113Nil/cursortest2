package xsna;

import android.text.TextUtils;
import com.ironsource.X3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.csz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class i8z0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final csz0 a(JSONObject jSONObject) {
        csz0.a.C2681a c2681a;
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        JSONObject jSONObject3 = jSONObject.getJSONObject("assets");
        ArrayList arrayList = null;
        csz0.b bVar = new csz0.b(jSONObject2.optString("title", null), jSONObject2.optString("body", null), jSONObject2.optString(X3.j.D, null));
        JSONArray optJSONArray = jSONObject3.optJSONArray("first_frame");
        if (optJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("url", null);
                    if (TextUtils.isEmpty(optString)) {
                        gu8.c(null, "VastYandexAdInfoParser: Invalid first_frame url");
                    } else {
                        try {
                            c2681a = new csz0.a.C2681a(optString, optJSONObject.getInt("width"), optJSONObject.getInt("height"));
                        } catch (JSONException e) {
                            gu8.c(null, "VastYandexAdInfoParser: Invalid first_frame dimension: " + e);
                        }
                        if (c2681a == null) {
                            arrayList2.add(c2681a);
                        }
                    }
                }
                c2681a = null;
                if (c2681a == null) {
                }
            }
            arrayList = arrayList2;
        }
        return new csz0(bVar, new csz0.a(arrayList));
    }
}
