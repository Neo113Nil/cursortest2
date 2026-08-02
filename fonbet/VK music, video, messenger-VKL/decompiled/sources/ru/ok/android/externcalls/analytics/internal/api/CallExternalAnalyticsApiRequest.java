package ru.ok.android.externcalls.analytics.internal.api;

import java.io.IOException;
import ru.ok.android.api.common.BoxedApiValue;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonWriter;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* compiled from: CallExternalAnalyticsApiRequest.kt */
/* loaded from: classes9.dex */
public final class CallExternalAnalyticsApiRequest extends CallAnalyticsApiRequest {
    private final String application;
    private final String collector;
    private final String platform;

    public CallExternalAnalyticsApiRequest(String str, String str2, String str3, String str4, BoxedApiValue boxedApiValue, CallAnalyticsLogger callAnalyticsLogger) {
        super(str, boxedApiValue, callAnalyticsLogger);
        this.application = str2;
        this.collector = str3;
        this.platform = str4;
    }

    @Override // ru.ok.android.api.core.ApiRequest
    public void writeParams(JsonWriter jsonWriter) throws IOException, JsonSerializeException {
        CallAnalyticsApiRequest.writeString$default(this, jsonWriter, "collector", this.collector, false, 8, null);
        jsonWriter.name("data");
        jsonWriter.beginObject();
        try {
            CallAnalyticsApiRequest.writeString$default(this, jsonWriter, "application", this.application, false, 8, null);
            writeString(jsonWriter, "platform", this.platform, true);
            jsonWriter.name("items");
            getItems().write(jsonWriter);
        } finally {
            jsonWriter.endObject();
        }
    }
}
