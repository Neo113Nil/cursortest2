package ru.ok.android.api.methods.auth.logoutAll;

import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: LogoutAllApiParserV1.kt */
/* loaded from: classes9.dex */
public final class LogoutAllApiParserV1 implements JsonParser<LogoutAllApiResultV1> {
    public static final LogoutAllApiParserV1 INSTANCE = new LogoutAllApiParserV1();

    private LogoutAllApiParserV1() {
    }

    @Override // ru.ok.android.api.json.JsonParser
    public LogoutAllApiResultV1 parse(JsonReader jsonReader) throws IOException, JsonParseException, JsonSyntaxException {
        jsonReader.beginObject();
        String str = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            if (name.hashCode() == -1956766558 && name.equals(LoginApiConstants.RESULT_NAME_AUTH_TOKEN)) {
                str = jsonReader.stringValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null) {
            return new LogoutAllApiResultV1(str);
        }
        throw new JsonParseException("Missing one of required fields: auth_token");
    }
}
