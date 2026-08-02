package ru.ok.android.api.core;

import java.io.IOException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.message.MessagePlainJsonParser;
import ru.ok.android.api.session.ApiRecreateSessionException;
import ru.ok.android.api.session.ApiSessionChangedException;
import ru.ok.android.sdk.SharedKt;

/* compiled from: ApiInvocationExceptionParser.kt */
/* loaded from: classes9.dex */
public final class ApiInvocationExceptionParser implements JsonParser<ApiInvocationException> {
    public static final ApiInvocationExceptionParser INSTANCE = new ApiInvocationExceptionParser();

    private ApiInvocationExceptionParser() {
    }

    private final ApiInvocationException.ErrorPageInfo readErrorPage(JsonReader jsonReader) {
        String str;
        int peek = jsonReader.peek();
        if (peek == 110) {
            jsonReader.skipValue();
            str = null;
        } else if (peek != 123) {
            str = jsonReader.stringValue();
        } else {
            jsonReader.beginObject();
            String str2 = null;
            while (jsonReader.hasNext()) {
                String name = jsonReader.name();
                if (name.hashCode() == 954925063 && name.equals("message")) {
                    str2 = MessagePlainJsonParser.INSTANCE.parse(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            str = str2;
        }
        if (str != null) {
            return new ApiInvocationException.ErrorPageInfo(str);
        }
        return null;
    }

    @Override // ru.ok.android.api.json.JsonParser
    public ApiInvocationException parse(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginObject();
        String str = null;
        int i = 0;
        String str2 = null;
        ApiInvocationException.ErrorPageInfo errorPageInfo = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            switch (name.hashCode()) {
                case -1125973592:
                    if (!name.equals("ver_redirect_url")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str2 = jsonReader.stringValue();
                        break;
                    }
                case -830722045:
                    if (!name.equals("error_field")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str5 = jsonReader.nullableStringValue();
                        break;
                    }
                case -22145738:
                    if (!name.equals("session_key")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str = jsonReader.stringValue();
                        break;
                    }
                case 96784904:
                    if (!name.equals("error")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str4 = jsonReader.stringValue();
                        break;
                    }
                case 329868490:
                    if (!name.equals(SharedKt.PARAM_ERROR_MSG)) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str4 = jsonReader.stringValue();
                        break;
                    }
                case 438353305:
                    if (!name.equals("session_secret_key")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str3 = jsonReader.stringValue();
                        break;
                    }
                case 717465530:
                    if (!name.equals("custom_error")) {
                        jsonReader.skipValue();
                        break;
                    } else if (jsonReader.peek() == 110) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            str7 = jsonReader.name();
                            str8 = jsonReader.jsonValue();
                        }
                        jsonReader.endObject();
                        break;
                    }
                case 1635686852:
                    if (!name.equals("error_code")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        i = jsonReader.intValue();
                        break;
                    }
                case 1635703681:
                    if (!name.equals("error_data")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str6 = jsonReader.nullableStringValue();
                        break;
                    }
                case 1636060774:
                    if (!name.equals("error_page")) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        errorPageInfo = readErrorPage(jsonReader);
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (i == 100) {
            return new ApiInvocationParamException(str4, str5, str6, str7, str8);
        }
        if (i == 107) {
            if (str == null) {
                throw new JsonParseException("No sessionKey");
            }
            if (str3 != null) {
                return new ApiSessionChangedException(str4, str, str3);
            }
            throw new JsonParseException("No sessionSecretKey");
        }
        if (i == 401) {
            return new ApiLoginException(str4, str5, str6, str7, str8);
        }
        if (i == 403) {
            String str9 = str8;
            String str10 = str7;
            return new ApiCaptchaException(str4, str2, str5, str6, str10, str9);
        }
        if (i == 102 || i == 103) {
            return new ApiRecreateSessionException(i, str4);
        }
        return new ApiInvocationException(i, str4, str5, str6, str7, str8, errorPageInfo);
    }
}
