package ru.ok.android.api.methods.authV2.anonymLogin;

import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;

/* compiled from: AnonymLoginApiParser.kt */
/* loaded from: classes9.dex */
public final class AnonymLoginApiParser implements JsonParser<AnonymLoginApiResult> {
    public static final AnonymLoginApiParser INSTANCE = new AnonymLoginApiParser();

    private AnonymLoginApiParser() {
    }

    @Override // ru.ok.android.api.json.JsonParser
    public AnonymLoginApiResult parse(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            int hashCode = name.hashCode();
            if (hashCode != -22145738) {
                if (hashCode == 438353305 && name.equals("session_secret_key")) {
                    str2 = jsonReader.stringValue();
                }
                jsonReader.skipValue();
            } else if (name.equals("session_key")) {
                str = jsonReader.stringValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw new JsonParseException("No sessionKey");
        }
        if (str2 != null) {
            return new AnonymLoginApiResult(str, str2);
        }
        throw new JsonParseException("No sessionSecretKey");
    }
}
