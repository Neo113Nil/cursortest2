package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* compiled from: CallNativeAnalyticsApiRequest.kt */
/* loaded from: classes9.dex */
public final class CallNativeAnalyticsApiRequest extends CallAnalyticsApiRequest {
    private final String appVersion;
    private final String platform;
    private final String sdkType;
    private final String sdkVersion;
    private final int version;

    public CallNativeAnalyticsApiRequest(String str, String str2, String str3, String str4, String str5, int i, BoxedApiValue boxedApiValue, CallAnalyticsLogger callAnalyticsLogger) {
        super(str, boxedApiValue, callAnalyticsLogger);
        this.platform = str2;
        this.appVersion = str3;
        this.sdkType = str4;
        this.sdkVersion = str5;
        this.version = i;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        jsonWriter.name("data");
        jsonWriter.beginObject();
        try {
            writeString(jsonWriter, "platform", this.platform, true);
            CallAnalyticsApiRequest.writeString$default(this, jsonWriter, CallAnalyticsApiRequest.KEY_APP_VERSION, this.appVersion, false, 8, null);
            CallAnalyticsApiRequest.writeString$default(this, jsonWriter, "sdk_type", this.sdkType, false, 8, null);
            CallAnalyticsApiRequest.writeString$default(this, jsonWriter, "sdk_version", this.sdkVersion, false, 8, null);
            jsonWriter.name("version");
            jsonWriter.value(this.version);
            jsonWriter.name("items");
            getItems().write(jsonWriter);
        } finally {
            jsonWriter.endObject();
        }
    }
}
