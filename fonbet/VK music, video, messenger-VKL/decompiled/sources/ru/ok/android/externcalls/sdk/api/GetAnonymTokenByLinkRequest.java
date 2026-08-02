package ru.ok.android.externcalls.sdk.api;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import ru.ok.android.api.common.AbstractApiRequest;
import ru.ok.android.api.common.ApiParamList;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonReader;
import xsna.lpt;

/* loaded from: classes9.dex */
public class GetAnonymTokenByLinkRequest extends AbstractApiRequest implements ApiExecutableRequest<Response> {
    private static final JsonParser<Response> PARSER = new lpt();

    @NonNull
    public final String joinLink;

    @Nullable
    public final String name;

    public static final class Response {
        public final String token;
        public final String uid;

        public Response(String str, String str2) {
            this.uid = str;
            this.token = str2;
        }
    }

    public GetAnonymTokenByLinkRequest(@NonNull String str) {
        this(str, null);
    }

    public static boolean isAuthRequired(@NonNull ApiInvocationException apiInvocationException) {
        return apiInvocationException.getErrorCode() == 457;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Response lambda$static$0(JsonReader jsonReader) throws IOException, JsonParseException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String name = jsonReader.name();
            name.getClass();
            if (name.equals("uid")) {
                str = jsonReader.stringValue();
            } else if (name.equals("token")) {
                str2 = jsonReader.stringValue();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Response(str, str2);
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    @NonNull
    public JsonParser<? extends Response> getOkParser() {
        return PARSER;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @NonNull
    public Uri getUri() {
        return ApiUris.methodUri("vchat.getAnonymTokenByLink");
    }

    @Override // ru.ok.android.api.common.AbstractApiRequest
    public void populateParams(@NonNull ApiParamList apiParamList) {
        apiParamList.add("joinLink", this.joinLink);
        apiParamList.add("anonymName", this.name);
    }

    public GetAnonymTokenByLinkRequest(@NonNull String str, @Nullable String str2) {
        this.joinLink = str;
        this.name = str2;
    }
}
