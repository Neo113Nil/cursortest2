package com.android.billingclient.api;

import android.text.TextUtils;
import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class Purchase {
    public final String a;
    public final String b;
    public final JSONObject c;

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public final String a() {
        String optString = this.c.optString(FinishFlowStatus.ORDER_ID_FIELD_NAME);
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public final String b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String d() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString(AuthSdkActivity.RESPONSE_TYPE_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.b, purchase.b);
    }

    public final boolean f() {
        return this.c.optBoolean("acknowledged", true);
    }

    public final boolean g() {
        return this.c.optBoolean("autoRenewing");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
