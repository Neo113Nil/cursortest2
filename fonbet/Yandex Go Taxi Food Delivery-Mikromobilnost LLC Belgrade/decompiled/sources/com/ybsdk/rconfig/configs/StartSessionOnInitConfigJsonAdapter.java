package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/rconfig/configs/StartSessionOnInitConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/StartSessionOnInitConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class StartSessionOnInitConfigJsonAdapter extends JsonAdapter<StartSessionOnInitConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "is_call_from_observe_state_changes_enabled");

    public StartSessionOnInitConfigJsonAdapter(Moshi moshi) {
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, EmptySet.a, "isEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartSessionOnInitConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                }
            } else if (selectName == 1 && (bool2 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isCallFromObserveStateChangesEnabled", "is_call_from_observe_state_changes_enabled", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool2 != null) {
            return new StartSessionOnInitConfig(booleanValue, bool2.booleanValue());
        }
        throw Util.missingProperty("isCallFromObserveStateChangesEnabled", "is_call_from_observe_state_changes_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartSessionOnInitConfig startSessionOnInitConfig) {
        StartSessionOnInitConfig startSessionOnInitConfig2 = startSessionOnInitConfig;
        if (startSessionOnInitConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(startSessionOnInitConfig2.isEnabled()));
        jsonWriter.name("is_call_from_observe_state_changes_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(startSessionOnInitConfig2.isCallFromObserveStateChangesEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(StartSessionOnInitConfig)");
    }
}
