package com.ybsdk.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.network.dto.StartSessionRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/network/dto/StartSessionRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/StartSessionRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/network/dto/StartSessionRequest$AntifraudInfo;", "antifraudInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartSessionRequestJsonAdapter extends JsonAdapter<StartSessionRequest> {
    private final JsonAdapter<StartSessionRequest.AntifraudInfo> antifraudInfoAdapter;
    private volatile Constructor<StartSessionRequest> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("antifraud_info", "skip_registration", "origin_deeplink");

    public StartSessionRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.antifraudInfoAdapter = moshi.adapter(StartSessionRequest.AntifraudInfo.class, emptySet, "antifraudInfo");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "skipRegistration");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "originDeeplink");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final StartSessionRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        StartSessionRequest.AntifraudInfo antifraudInfo = null;
        Boolean bool = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                antifraudInfo = this.antifraudInfoAdapter.fromJson(jsonReader);
                if (antifraudInfo == null) {
                    throw Util.unexpectedNull("antifraudInfo", "antifraud_info", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -7) {
            if (antifraudInfo != null) {
                return new StartSessionRequest(antifraudInfo, bool, str);
            }
            throw Util.missingProperty("antifraudInfo", "antifraud_info", jsonReader);
        }
        Constructor<StartSessionRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = StartSessionRequest.class.getDeclaredConstructor(StartSessionRequest.AntifraudInfo.class, Boolean.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (antifraudInfo != null) {
            return constructor.newInstance(antifraudInfo, bool, str, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("antifraudInfo", "antifraud_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, StartSessionRequest startSessionRequest) {
        StartSessionRequest startSessionRequest2 = startSessionRequest;
        if (startSessionRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("antifraud_info");
        this.antifraudInfoAdapter.toJson(jsonWriter, (JsonWriter) startSessionRequest2.getAntifraudInfo());
        jsonWriter.name("skip_registration");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) startSessionRequest2.getSkipRegistration());
        jsonWriter.name("origin_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) startSessionRequest2.getOriginDeeplink());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(StartSessionRequest)");
    }
}
