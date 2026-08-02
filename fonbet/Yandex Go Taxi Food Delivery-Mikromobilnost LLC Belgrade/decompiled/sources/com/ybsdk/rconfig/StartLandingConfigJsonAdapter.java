package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/rconfig/StartLandingConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/StartLandingConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StartLandingConfigJsonAdapter extends JsonAdapter<StartLandingConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "landing_url", "activate_callback", "close_callback");
    private final JsonAdapter<String> stringAdapter;

    public StartLandingConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "url");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartLandingConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("url", "landing_url", jsonReader);
                }
            } else if (selectName == 2) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("goAction", "activate_callback", jsonReader);
                }
            } else if (selectName == 3 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("closeAction", "close_callback", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (str == null) {
            throw Util.missingProperty("url", "landing_url", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("goAction", "activate_callback", jsonReader);
        }
        if (str3 != null) {
            return new StartLandingConfig(booleanValue, str, str2, str3);
        }
        throw Util.missingProperty("closeAction", "close_callback", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartLandingConfig startLandingConfig) {
        StartLandingConfig startLandingConfig2 = startLandingConfig;
        if (startLandingConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(startLandingConfig2.isEnabled()));
        jsonWriter.name("landing_url");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startLandingConfig2.getUrl());
        jsonWriter.name("activate_callback");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startLandingConfig2.getGoAction());
        jsonWriter.name("close_callback");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) startLandingConfig2.getCloseAction());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(StartLandingConfig)");
    }
}
