package ru.ok.android.api.core;

import android.net.Uri;
import java.io.IOException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import xsna.ozl;

/* compiled from: ApiRequest.kt */
/* loaded from: classes9.dex */
public interface ApiRequest {
    default boolean canRepeat() {
        return true;
    }

    default int getPriority() {
        return 16;
    }

    default ApiScope getScope() {
        return ApiScope.SESSION;
    }

    Uri getUri();

    @ozl
    default boolean shouldGzip() {
        return false;
    }

    default boolean shouldNeverGzip() {
        return false;
    }

    default boolean shouldNeverJson() {
        return false;
    }

    default boolean shouldNeverPost() {
        return false;
    }

    @ozl
    default boolean shouldPost() {
        return false;
    }

    default boolean shouldReport() {
        return true;
    }

    default boolean willWriteParams() {
        return true;
    }

    default boolean willWriteSupplyParams() {
        return false;
    }

    void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException;

    default void writeSupplyParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
    }
}
