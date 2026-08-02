package ru.ok.android.api.methods.users.changePassword;

import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import ru.ok.android.api.json.JsonSyntaxException;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: ChangePasswordApiParserV1.kt */
/* loaded from: classes9.dex */
public final class ChangePasswordApiParserV1 implements JsonParser<ChangePasswordApiResultV1> {
    public static final ChangePasswordApiParserV1 INSTANCE = new ChangePasswordApiParserV1();

    private ChangePasswordApiParserV1() {
    }

    @Override // ru.ok.android.api.json.JsonParser
    public ChangePasswordApiResultV1 parse(JsonReader jsonReader) throws IOException, JsonParseException, JsonSyntaxException {
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
        return new ChangePasswordApiResultV1(str);
    }
}
