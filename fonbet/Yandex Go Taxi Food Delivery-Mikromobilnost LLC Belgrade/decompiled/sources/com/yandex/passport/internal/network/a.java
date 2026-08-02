package com.yandex.passport.internal.network;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.analytics.t;
import com.yandex.passport.internal.network.response.ExternalApplicationPermissionsResult;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.social.gimap.ExtAuthFailedException;
import com.yandex.passport.internal.ui.social.gimap.MailProvider;
import defpackage.g8e;
import defpackage.kvj0;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rvj0;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class a {
    public final b1 a;

    public a(t tVar, com.yandex.passport.common.a aVar, b1 b1Var) {
        this.a = b1Var;
    }

    public static String a(JSONArray jSONArray, int i) {
        JSONObject optJSONObject = jSONArray.optJSONObject(i);
        if (optJSONObject == null) {
            return jSONArray.optString(i);
        }
        String string = optJSONObject.getString(AuthSdkActivity.RESPONSE_TYPE_CODE);
        String string2 = optJSONObject.getString("field");
        return TextUtils.isEmpty(string2) ? string : g8e.p(string2, Extension.DOT_CHAR, string);
    }

    public static JSONObject b(kvj0 kvj0Var) {
        return new JSONObject(c(kvj0Var));
    }

    public static String c(kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        String string = rvj0Var != null ? rvj0Var.string() : null;
        kvj0Var.close();
        if (string != null) {
            return string;
        }
        ny61.v("empty response body");
        return null;
    }

    public static String d(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("errors");
        if (optJSONArray == null) {
            return null;
        }
        return a(optJSONArray, 0);
    }

    public static ArrayList e(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("errors");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String a = a(optJSONArray, i);
            if (a == null) {
                return null;
            }
            arrayList.add(a);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MasterToken f(kvj0 kvj0Var) {
        com.yandex.passport.internal.ui.social.gimap.b bVar;
        JSONObject b = b(kvj0Var);
        JSONObject jSONObject = b.getJSONObject(ACSPConstants.STATUS);
        if (jSONObject.getInt(ACSPConstants.STATUS) == 1) {
            return MasterToken.from(b.getString("xtoken"));
        }
        String string = jSONObject.getString("phrase");
        String string2 = jSONObject.getString("trace");
        JSONObject optJSONObject = b.optJSONObject("hint");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("imap_server");
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("smtp_server");
            if (optJSONObject2 != null && optJSONObject3 != null) {
                bVar = new com.yandex.passport.internal.ui.social.gimap.b(new com.yandex.passport.internal.ui.social.gimap.c(optJSONObject2.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), optJSONObject2.getInt(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), optJSONObject2.getBoolean("ssl")), new com.yandex.passport.internal.ui.social.gimap.c(optJSONObject3.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), optJSONObject3.getInt(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), optJSONObject3.getBoolean("ssl")));
                String optString = b.optString("provider");
                throw new ExtAuthFailedException(oyr.f(HexString.CHAR_SPACE, string, string2), bVar, optString.equals("") ? null : MailProvider.a(optString));
            }
        }
        bVar = null;
        String optString2 = b.optString("provider");
        throw new ExtAuthFailedException(oyr.f(HexString.CHAR_SPACE, string, string2), bVar, optString2.equals("") ? null : MailProvider.a(optString2));
    }

    public static ArrayList g(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Iterator<String> keys2 = jSONObject2.keys();
            ArrayList arrayList2 = new ArrayList(jSONObject2.length());
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                arrayList2.add(new ExternalApplicationPermissionsResult.Permission(jSONObject2.getJSONObject(next2).getString("title"), next2));
            }
            arrayList.add(new ExternalApplicationPermissionsResult.Scope(next, arrayList2));
        }
        return arrayList;
    }

    public static void h(JSONObject jSONObject) {
        String d = d(jSONObject);
        if (d == null) {
            return;
        }
        i(d);
        throw new FailedResponseException(d);
    }

    public static void i(String str) {
        if (str.equals("oauth_token.invalid")) {
            throw new InvalidTokenException();
        }
    }
}
