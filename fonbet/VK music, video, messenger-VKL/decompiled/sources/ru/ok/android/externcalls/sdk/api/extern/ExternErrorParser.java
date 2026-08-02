package ru.ok.android.externcalls.sdk.api.extern;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.zcl;

/* compiled from: ExternErrorParser.kt */
/* loaded from: classes9.dex */
public final class ExternErrorParser {
    private static final String CODE_KEY = "code";
    private static final Companion Companion = new Companion(null);
    private static final String EXTENDED_CODE_KEY = "extended_code";

    /* compiled from: ExternErrorParser.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: ExternErrorParser.kt */
    public static final class ErrorDescription {
        private final String errorCode;

        public ErrorDescription(String str) {
            this.errorCode = str;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }
    }

    private final String parseError(ApiInvocationException apiInvocationException, String str) {
        try {
            String errorCustomJson = apiInvocationException.getErrorCustomJson();
            if (errorCustomJson != null) {
                JSONObject jSONObject = new JSONObject(errorCustomJson);
                if (jSONObject.has(str)) {
                    return jSONObject.optString(str);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public final ErrorDescription parse(ApiInvocationException apiInvocationException) {
        String parseError = parseError(apiInvocationException, "code");
        if (parseError == null) {
            parseError = parseError(apiInvocationException, EXTENDED_CODE_KEY);
        }
        return new ErrorDescription(parseError);
    }
}
