package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayOutputStream;
import java.util.zip.DeflaterOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class xdz0 {
    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, l0n l0nVar, String str9, float f, int i, boolean z, Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", gpy0.l.b.g(context));
            jSONObject.put("network", str);
            jSONObject.put("navigationType", str2);
            c(jSONObject, "storeType", str3);
            c(jSONObject, "title", str4);
            c(jSONObject, "ctaText", str5);
            c(jSONObject, X3.j.D, str6);
            c(jSONObject, "ageRestrictions", str7);
            c(jSONObject, "disclaimer", str8);
            if (l0nVar != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("disclaimerType", l0nVar.a);
                jSONObject2.put("disclaimerText", l0nVar.c);
                jSONObject.put("disclaimerInfo", jSONObject2);
            }
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                jSONObject.put(CampaignEx.JSON_KEY_STAR, String.valueOf(f));
            }
            if (i > 0) {
                jSONObject.put("votes", String.valueOf(i));
            }
            c(jSONObject, "description", str9);
            if (z) {
                jSONObject.put("hasVideo", "true");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void b(String str) {
        String str2;
        if (str == null) {
            return;
        }
        mcz0 mcz0Var = new mcz0();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
                try {
                    deflaterOutputStream.write(str.getBytes());
                    deflaterOutputStream.close();
                    str2 = byteArrayOutputStream.toString();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("EncryptionUtils: Cannot obtain bidder token - "), th);
            str2 = "";
        }
        mcz0Var.d("https://sdk.mail.ru/mobile/adcontext", str2, null);
    }

    public static void c(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
