package ru.ok.android.sdk.api.login;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import xsna.i5s;
import xsna.p200;

/* loaded from: classes9.dex */
public class LoginResponse {
    private static final String API_SERVER = "api_server";
    private static final String AUTH_HASH = "auth_hash";
    private static final String AUTH_TOKEN = "auth_token";
    public static final JsonParser<LoginResponse> PARSER = new p200();
    private static final String SESSION_KEY = "session_key";
    private static final String UID = "uid";
    public String apiServer;
    public String authenticationHash;

    @Nullable
    public String authenticationToken;
    public String sessionKey;
    public String uid;

    public static LoginResponse parse(@NonNull JsonReader jsonReader) throws IOException, JsonParseException {
        LoginResponse loginResponse = new LoginResponse();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            name.getClass();
            switch (name) {
                case "auth_token":
                    loginResponse.authenticationToken = jsonReader.stringValue();
                    break;
                case "session_key":
                    loginResponse.sessionKey = jsonReader.stringValue();
                    break;
                case "uid":
                    loginResponse.uid = jsonReader.stringValue();
                    break;
                case "auth_hash":
                    loginResponse.authenticationHash = jsonReader.stringValue();
                    break;
                case "api_server":
                    loginResponse.apiServer = jsonReader.stringValue();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return loginResponse;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LoginResponse{uid='");
        sb.append(this.uid);
        sb.append("', sessionKey='");
        sb.append(this.sessionKey);
        sb.append("', authenticationToken='");
        sb.append(this.authenticationToken);
        sb.append("', apiServer='");
        sb.append(this.apiServer);
        sb.append("', authenticationHash='");
        return i5s.a(sb, this.authenticationHash, "'}");
    }
}
