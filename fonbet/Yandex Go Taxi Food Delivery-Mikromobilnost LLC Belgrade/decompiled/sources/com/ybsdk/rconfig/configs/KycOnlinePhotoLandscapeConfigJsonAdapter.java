package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/rconfig/configs/KycOnlinePhotoLandscapeConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/KycOnlinePhotoLandscapeConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBooleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KycOnlinePhotoLandscapeConfigJsonAdapter extends JsonAdapter<KycOnlinePhotoLandscapeConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(BackendConfig.Restrictions.ENABLED, "selfie_frame_enabled", "double_frame_enabled", "change_animation_enabled");

    public KycOnlinePhotoLandscapeConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "selfieFrameEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final KycOnlinePhotoLandscapeConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                }
            } else if (selectName == 1) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bool3 = this.booleanAdapter.fromJson(jsonReader);
                if (bool3 == null) {
                    throw Util.unexpectedNull("doubleFrameEnabled", "double_frame_enabled", jsonReader);
                }
            } else if (selectName == 3 && (bool4 = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("changeAnimationEnabled", "change_animation_enabled", jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (bool3 == null) {
            throw Util.missingProperty("doubleFrameEnabled", "double_frame_enabled", jsonReader);
        }
        boolean booleanValue2 = bool3.booleanValue();
        if (bool4 != null) {
            return new KycOnlinePhotoLandscapeConfig(booleanValue, bool2, booleanValue2, bool4.booleanValue());
        }
        throw Util.missingProperty("changeAnimationEnabled", "change_animation_enabled", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, KycOnlinePhotoLandscapeConfig kycOnlinePhotoLandscapeConfig) {
        KycOnlinePhotoLandscapeConfig kycOnlinePhotoLandscapeConfig2 = kycOnlinePhotoLandscapeConfig;
        if (kycOnlinePhotoLandscapeConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(kycOnlinePhotoLandscapeConfig2.getEnabled()));
        jsonWriter.name("selfie_frame_enabled");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) kycOnlinePhotoLandscapeConfig2.getSelfieFrameEnabled());
        jsonWriter.name("double_frame_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(kycOnlinePhotoLandscapeConfig2.getDoubleFrameEnabled()));
        jsonWriter.name("change_animation_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(kycOnlinePhotoLandscapeConfig2.getChangeAnimationEnabled()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(KycOnlinePhotoLandscapeConfig)");
    }
}
