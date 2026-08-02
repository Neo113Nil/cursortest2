package com.ybsdk.feature.pinstorage.internal.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/pinstorage/internal/data/PinTokenAmModelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pinstorage/internal/data/PinTokenAmModel;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-pin-storage-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinTokenAmModelJsonAdapter extends JsonAdapter<PinTokenAmModel> {
    private final JsonReader.Options options = JsonReader.Options.of(AuthSdkActivity.RESPONSE_TYPE_TOKEN, MetaDataField.DEVICE_ID_FIELD, "token_biometric_id");
    private final JsonAdapter<String> stringAdapter;

    public PinTokenAmModelJsonAdapter(Moshi moshi) {
        this.stringAdapter = moshi.adapter(String.class, EmptySet.a, AuthSdkActivity.RESPONSE_TYPE_TOKEN);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PinTokenAmModel fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
                }
            } else if (selectName == 2 && (str3 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("tokenBiometricUUID", "token_biometric_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty(AuthSdkActivity.RESPONSE_TYPE_TOKEN, AuthSdkActivity.RESPONSE_TYPE_TOKEN, jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
        }
        if (str3 != null) {
            return new PinTokenAmModel(str, str2, str3);
        }
        throw Util.missingProperty("tokenBiometricUUID", "token_biometric_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PinTokenAmModel pinTokenAmModel) {
        PinTokenAmModel pinTokenAmModel2 = pinTokenAmModel;
        if (pinTokenAmModel2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pinTokenAmModel2.getToken());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pinTokenAmModel2.getDeviceId());
        jsonWriter.name("token_biometric_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pinTokenAmModel2.getTokenBiometricUUID());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(PinTokenAmModel)");
    }
}
