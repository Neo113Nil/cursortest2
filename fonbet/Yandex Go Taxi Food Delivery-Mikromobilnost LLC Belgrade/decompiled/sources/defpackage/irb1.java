package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.Tooltip$PreferredPosition;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes3.dex */
public abstract class irb1 {
    public static final cuz0 a(Context context, Text text) {
        buz0 buz0Var = new buz0(context);
        buz0Var.o = 12;
        buz0Var.l(text);
        buz0Var.t = Integer.valueOf(l1i0.Widget_YB_Text_Caption1_Regular_Inverted);
        buz0Var.g(Tooltip$PreferredGravity.CENTER);
        buz0Var.k(Tooltip$PreferredPosition.BOTTOM);
        buz0Var.p = kp50.r(4);
        buz0Var.q = Integer.valueOf(kp50.r(220));
        return buz0Var.a();
    }

    public static final boolean b(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(SelfTester_JCP.IMITA);
        }
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    public static void c(Object obj, LinkedHashSet linkedHashSet) {
        JSONObject optJSONObject;
        String optString;
        if (!(obj instanceof JSONObject)) {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    c(jSONArray.opt(i), linkedHashSet);
                }
                return;
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jl40.l(jSONObject.optString("type"), "custom") && (optJSONObject = jSONObject.optJSONObject("custom_props")) != null && (optString = optJSONObject.optString("native_ad_role")) != null) {
            if (optString.length() <= 0) {
                optString = null;
            }
            if (optString != null) {
                linkedHashSet.add(optString);
            }
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            c(jSONObject.opt(keys.next()), linkedHashSet);
        }
    }
}
