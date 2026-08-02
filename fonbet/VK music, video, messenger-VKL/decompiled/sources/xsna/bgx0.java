package xsna;

import android.net.Uri;
import android.os.Bundle;
import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import org.json.JSONObject;
import ru.ok.android.commons.http.Http;
import xsna.tu2;

/* compiled from: WebAuthHttpUrlChainCall.kt */
/* loaded from: classes6.dex */
public final class bgx0 extends ara<yfx0> {
    public final alv b;
    public final String c;

    public bgx0(l7r0 l7r0Var, alv alvVar, String str) {
        super(l7r0Var);
        this.b = alvVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0163 A[RETURN] */
    @Override // xsna.ara
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yfx0 a(zqa zqaVar) {
        String str;
        yfx0 yfx0Var;
        String str2 = zqaVar.g;
        alv alvVar = this.b;
        alv a = str2 != null ? alv.a(alvVar, null, j5g.v0(new gnk(Http.Header.X_CHALLENGE_SOLUTION, str2), alvVar.f), 31) : alvVar;
        if (zqaVar.c.length() > 0) {
            a = alv.a(a, Uri.parse(a.a).buildUpon().appendQueryParameter("success_token", zqaVar.c).build().toString(), null, 62);
        }
        tu2.a a2 = uu2.a(this.a.i(), a, zqaVar);
        JSONObject jSONObject = a2.a;
        a9v.b(zqaVar, a2.b, a9v.a(a.a));
        String str3 = a2.d;
        int i = a2.c;
        boolean equals = "/blank.html".equals(Uri.parse(str3).getPath());
        String str4 = this.c;
        if (equals) {
            Uri parse = Uri.parse(str3.replace('#', '?'));
            String queryParameter = parse.getQueryParameter(str4);
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            HashMap hashMap = new HashMap(queryParameterNames.size());
            for (String str5 : queryParameterNames) {
                String queryParameter2 = parse.getQueryParameter(str5);
                if (queryParameter2 != null) {
                    hashMap.put(str5, queryParameter2);
                }
            }
            if (queryParameter != null) {
                return new yfx0(queryParameter, hashMap);
            }
            throw new VKWebAuthException(i, 48, parse.getQueryParameter("error"), parse.getQueryParameter("error_description"), parse.getQueryParameter("error_reason"));
        }
        str = "";
        if (jSONObject != null && jSONObject.has("error") && (jSONObject.get("error") instanceof JSONObject) && jSONObject.getJSONObject("error").has("error_code")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            String path = Uri.parse(alvVar.a).getPath();
            throw pbr0.c(jSONObject2, 4, path != null ? path : "");
        }
        int i2 = a2.c;
        boolean z = false;
        if (200 <= i2 && i2 < 300) {
            z = true;
        }
        if (i2 != 401 && !z) {
            jSONObject = null;
        }
        if (z) {
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject3 = jSONObject.has("root_response") ? new JSONObject(jSONObject.getString("root_response")) : jSONObject;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        linkedHashMap.put(next, jSONObject3.getString(next));
                    }
                    String str6 = (String) linkedHashMap.get(str4);
                    if (str6 != null) {
                        str = str6;
                    }
                    yfx0Var = new yfx0(str, linkedHashMap);
                } catch (Exception unused) {
                }
                if (yfx0Var != null) {
                    return yfx0Var;
                }
            }
            yfx0Var = null;
            if (yfx0Var != null) {
            }
        }
        if (jSONObject == null) {
            throw new VKWebAuthException(i2, 62, null, null, null);
        }
        String optString = jSONObject.optString("error", null);
        String optString2 = jSONObject.optString("error_description", null);
        String optString3 = jSONObject.optString("error_reason", null);
        if (optString3 == null) {
            optString3 = jSONObject.optString("error_type");
        }
        JSONObject jSONObject4 = jSONObject;
        VKWebAuthException vKWebAuthException = new VKWebAuthException(i2, optString, optString2, optString3, jSONObject.optJSONObject("info"), jSONObject4);
        if (!vKWebAuthException.m()) {
            if (!vKWebAuthException.n()) {
                throw vKWebAuthException;
            }
            String optString4 = jSONObject4.optString("extend_hash");
            if (optString4.length() == 0) {
                throw vKWebAuthException;
            }
            String str7 = alvVar.a;
            Bundle a3 = q9k.a("extend_hash", optString4);
            s3q0 s3q0Var = s3q0.a;
            throw new VKApiExecutionException(3609, str7, false, "Token extension required", a3, null, null, null, 0, null, null, null, 4064);
        }
        Bundle bundle = new Bundle();
        bundle.putString("captcha_sid", jSONObject4.getString("captcha_sid"));
        bundle.putString("captcha_img", jSONObject4.getString("captcha_img"));
        Integer x = f370.x(jSONObject4, "captcha_attempt");
        if (x != null) {
            bundle.putInt("captcha_attempt", x.intValue());
        }
        Double t = f370.t(jSONObject4, "captcha_ts");
        if (t != null) {
            bundle.putDouble("captcha_ts", t.doubleValue());
        }
        Double t2 = f370.t(jSONObject4, "captcha_ratio");
        if (t2 != null) {
            bundle.putDouble("captcha_ratio", t2.doubleValue());
        }
        Boolean q = f370.q(jSONObject4, "is_refresh_enabled");
        if (q != null) {
            bundle.putBoolean("is_refresh_enabled", q.booleanValue());
        }
        Integer x2 = f370.x(jSONObject4, "captcha_height");
        if (x2 != null) {
            bundle.putInt("captcha_height", x2.intValue());
        }
        Integer x3 = f370.x(jSONObject4, "captcha_width");
        if (x3 != null) {
            bundle.putInt("captcha_width", x3.intValue());
        }
        Boolean q2 = f370.q(jSONObject4, "is_sound_captcha_available");
        if (q2 != null) {
            bundle.putBoolean("is_sound_captcha_available", q2.booleanValue());
        }
        String D = f370.D(jSONObject4, "captcha_track");
        if (D != null) {
            bundle.putString("captcha_track", D);
        }
        String D2 = f370.D(jSONObject4, "redirect_uri");
        if (D2 != null) {
            bundle.putString("redirect_uri", D2);
        }
        throw new VKApiExecutionException(14, alvVar.a, false, "need_captcha", bundle, null, null, null, 0, null, null, null, 4064);
    }
}
