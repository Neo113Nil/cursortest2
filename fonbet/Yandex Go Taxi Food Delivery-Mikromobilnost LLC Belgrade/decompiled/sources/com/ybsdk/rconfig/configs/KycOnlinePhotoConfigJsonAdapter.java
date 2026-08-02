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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/KycOnlinePhotoConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableStringAdapter", "", "nullableBooleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KycOnlinePhotoConfigJsonAdapter extends JsonAdapter<KycOnlinePhotoConfig> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("upload_success_deeplink", "upload_timeout_threshold_ms", "upload_takes_too_long_threshold_ms", "photo_target_width", "photo_target_height", "photo_target_compression_quality", "geo_request_status", "preview_in_frame_enabled");
    private final JsonAdapter<String> stringAdapter;

    public KycOnlinePhotoConfigJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "uploadSuccessDeeplink");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "uploadTimeoutThresholdMs");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "geoRequestStatus");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "previewInFrameEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final KycOnlinePhotoConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str2 = null;
        Boolean bool = null;
        while (true) {
            Integer num6 = num;
            Integer num7 = num2;
            String str3 = str;
            Integer num8 = num3;
            Integer num9 = num4;
            Integer num10 = num5;
            if (!jsonReader.hasNext()) {
                String str4 = str2;
                jsonReader.endObject();
                if (str3 == null) {
                    throw Util.missingProperty("uploadSuccessDeeplink", "upload_success_deeplink", jsonReader);
                }
                if (num6 == null) {
                    throw Util.missingProperty("uploadTimeoutThresholdMs", "upload_timeout_threshold_ms", jsonReader);
                }
                int intValue = num6.intValue();
                if (num7 == null) {
                    throw Util.missingProperty("uploadTakesTooLongThresholdMs", "upload_takes_too_long_threshold_ms", jsonReader);
                }
                int intValue2 = num7.intValue();
                if (num8 == null) {
                    throw Util.missingProperty("photoTargetWidth", "photo_target_width", jsonReader);
                }
                int intValue3 = num8.intValue();
                if (num9 == null) {
                    throw Util.missingProperty("photoTargetHeight", "photo_target_height", jsonReader);
                }
                int intValue4 = num9.intValue();
                if (num10 != null) {
                    return new KycOnlinePhotoConfig(str3, intValue, intValue2, intValue3, intValue4, num10.intValue(), str4, bool);
                }
                throw Util.missingProperty("photoTargetCompressionQuality", "photo_target_compression_quality", jsonReader);
            }
            String str5 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("uploadSuccessDeeplink", "upload_success_deeplink", jsonReader);
                    }
                    num = num6;
                    num2 = num7;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                case 1:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("uploadTimeoutThresholdMs", "upload_timeout_threshold_ms", jsonReader);
                    }
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                case 2:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("uploadTakesTooLongThresholdMs", "upload_takes_too_long_threshold_ms", jsonReader);
                    }
                    num = num6;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                case 3:
                    num3 = this.intAdapter.fromJson(jsonReader);
                    if (num3 == null) {
                        throw Util.unexpectedNull("photoTargetWidth", "photo_target_width", jsonReader);
                    }
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                case 4:
                    Integer fromJson = this.intAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("photoTargetHeight", "photo_target_height", jsonReader);
                    }
                    num4 = fromJson;
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num5 = num10;
                    str2 = str5;
                case 5:
                    Integer fromJson2 = this.intAdapter.fromJson(jsonReader);
                    if (fromJson2 == null) {
                        throw Util.unexpectedNull("photoTargetCompressionQuality", "photo_target_compression_quality", jsonReader);
                    }
                    num5 = fromJson2;
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    str2 = str5;
                case 6:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                case 7:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
                default:
                    num = num6;
                    num2 = num7;
                    str = str3;
                    num3 = num8;
                    num4 = num9;
                    num5 = num10;
                    str2 = str5;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, KycOnlinePhotoConfig kycOnlinePhotoConfig) {
        KycOnlinePhotoConfig kycOnlinePhotoConfig2 = kycOnlinePhotoConfig;
        if (kycOnlinePhotoConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("upload_success_deeplink");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoConfig2.getUploadSuccessDeeplink());
        jsonWriter.name("upload_timeout_threshold_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(kycOnlinePhotoConfig2.getUploadTimeoutThresholdMs()));
        jsonWriter.name("upload_takes_too_long_threshold_ms");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(kycOnlinePhotoConfig2.getUploadTakesTooLongThresholdMs()));
        jsonWriter.name("photo_target_width");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(kycOnlinePhotoConfig2.getPhotoTargetWidth()));
        jsonWriter.name("photo_target_height");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(kycOnlinePhotoConfig2.getPhotoTargetHeight()));
        jsonWriter.name("photo_target_compression_quality");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(kycOnlinePhotoConfig2.getPhotoTargetCompressionQuality()));
        jsonWriter.name("geo_request_status");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoConfig2.getGeoRequestStatus());
        jsonWriter.name("preview_in_frame_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoConfig2.getPreviewInFrameEnabled());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(KycOnlinePhotoConfig)");
    }
}
