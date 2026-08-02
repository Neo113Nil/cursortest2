package ru.ok.android.api.methods.authV2.login;

import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;

/* compiled from: LoginApiParser.kt */
/* loaded from: classes9.dex */
public final class LoginApiParser implements JsonParser<LoginApiResult> {
    public static final LoginApiParser INSTANCE = new LoginApiParser();

    /* compiled from: LoginApiParser.kt */
    public static final class Subsequent implements JsonParser<LoginApiResult> {
        public static final Subsequent INSTANCE = new Subsequent();

        private Subsequent() {
        }

        @Override // ru.ok.android.api.json.JsonParser
        public LoginApiResult parse(JsonReader jsonReader) {
            return LoginApiParser.INSTANCE.parse(jsonReader, false);
        }
    }

    private LoginApiParser() {
    }

    @Override // ru.ok.android.api.json.JsonParser
    public LoginApiResult parse(JsonReader jsonReader) {
        return parse(jsonReader, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleLoginApiResult parse(JsonReader jsonReader, boolean z) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            int hashCode = name.hashCode();
            if (hashCode != -22145738) {
                if (hashCode == 115792) {
                    if (name.equals("uid")) {
                        str = jsonReader.stringValue();
                    } else {
                        jsonReader.skipValue();
                    }
                } else {
                    if (hashCode == 438353305 && name.equals("session_secret_key")) {
                        str3 = jsonReader.stringValue();
                    }
                    jsonReader.skipValue();
                }
            } else if (!name.equals("session_key")) {
                jsonReader.skipValue();
            } else {
                str2 = jsonReader.stringValue();
            }
        }
        jsonReader.endObject();
        if (z && str == null) {
            throw new JsonParseException("No uid");
        }
        if (str2 == null) {
            throw new JsonParseException("No sessionKey");
        }
        if (str3 != null) {
            return new SimpleLoginApiResult(str, str2, str3);
        }
        throw new JsonParseException("No sessionSecretKey");
    }
}
