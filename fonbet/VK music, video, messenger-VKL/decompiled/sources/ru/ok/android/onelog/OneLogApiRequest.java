package ru.ok.android.onelog;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiScope;
import ru.ok.android.api.core.ApiUris;
import ru.ok.android.api.json.JsonParser;
import ru.ok.android.api.json.JsonParsers;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;

/* loaded from: classes9.dex */
final class OneLogApiRequest implements ApiExecutableRequest<Void> {
    private static final Uri URI = ApiUris.methodUri("log.externalLog");

    @NonNull
    private final String application;

    @NonNull
    private final BoxedApiValue items;

    @NonNull
    private final String platform;

    public OneLogApiRequest(@NonNull String str, @NonNull String str2, @NonNull BoxedApiValue boxedApiValue) {
        this.application = str;
        this.platform = str2;
        this.items = boxedApiValue;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean canRepeat() {
        return this.items.canRepeat();
    }

    @Override // ru.ok.android.api.core.ApiExecutableRequest
    @NonNull
    public JsonParser<? extends Void> getOkParser() {
        return JsonParsers.voidParser();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public int getPriority() {
        return 2;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @NonNull
    public ApiScope getScope() {
        return ApiScope.OPT_SESSION;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    @NonNull
    public Uri getUri() {
        return URI;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldNeverJson() {
        return OneLogImpl.getInstance().getShouldNeverJson();
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public boolean shouldReport() {
        return false;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(@NonNull JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.name("data");
        jsonWriter.beginObject();
        jsonWriter.name("application");
        jsonWriter.value(this.application);
        jsonWriter.name("platform");
        jsonWriter.value(this.platform);
        jsonWriter.name("items");
        this.items.write(jsonWriter);
        jsonWriter.endObject();
    }
}
