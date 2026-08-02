package ru.ok.android.externcalls.sdk.api.log;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RequestSecretEraser.kt */
/* loaded from: classes9.dex */
public final class RequestSecretEraser {
    private final String erasedSubstitution;
    private final Set<String> secretKeys;

    public RequestSecretEraser(Set<String> set, String str) {
        this.secretKeys = set;
        this.erasedSubstitution = str;
    }

    private final JSONArray getJsonArrayOrNull(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject getJsonObjectOrNull(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String eraseSecrets(String str) throws JSONException {
        JSONObject jsonObjectOrNull = getJsonObjectOrNull(str);
        JSONArray jsonArrayOrNull = getJsonArrayOrNull(str);
        if (jsonObjectOrNull != null) {
            eraseSecrets(jsonObjectOrNull);
            return jsonObjectOrNull.toString();
        }
        if (jsonArrayOrNull == null) {
            return this.erasedSubstitution;
        }
        eraseSecrets(jsonArrayOrNull);
        return jsonArrayOrNull.toString();
    }

    private final void eraseSecrets(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (this.secretKeys.contains(next)) {
                jSONObject.put(next, this.erasedSubstitution);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            if (optJSONObject != null) {
                eraseSecrets(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(next);
            if (optJSONArray != null) {
                eraseSecrets(optJSONArray);
            }
        }
    }

    private final void eraseSecrets(JSONArray jSONArray) {
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                eraseSecrets(optJSONObject);
            }
            JSONArray optJSONArray = jSONArray.optJSONArray(i);
            if (optJSONArray != null) {
                eraseSecrets(optJSONArray);
            }
        }
    }
}
