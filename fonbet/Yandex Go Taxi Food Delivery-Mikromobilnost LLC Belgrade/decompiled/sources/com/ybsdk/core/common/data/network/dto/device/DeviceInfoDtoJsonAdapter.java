package com.ybsdk.core.common.data.network.dto.device;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/device/ScreenResolutionDto;", "screenResolutionDtoAdapter", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeviceInfoDtoJsonAdapter extends JsonAdapter<DeviceInfoDto> {
    private final JsonReader.Options options = JsonReader.Options.of("model", "screen_resolution_width", "screen_resolution_height", "operation_system", MetaDataField.DEVICE_ID_FIELD, "uuid");
    private final JsonAdapter<ScreenResolutionDto> screenResolutionDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public DeviceInfoDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "model");
        this.screenResolutionDtoAdapter = moshi.adapter(ScreenResolutionDto.class, emptySet, "screenResolutionWidth");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DeviceInfoDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        ScreenResolutionDto screenResolutionDto = null;
        ScreenResolutionDto screenResolutionDto2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            String str5 = str;
            ScreenResolutionDto screenResolutionDto3 = screenResolutionDto;
            if (!jsonReader.hasNext()) {
                ScreenResolutionDto screenResolutionDto4 = screenResolutionDto2;
                jsonReader.endObject();
                if (str5 == null) {
                    throw Util.missingProperty("model", "model", jsonReader);
                }
                if (screenResolutionDto3 == null) {
                    throw Util.missingProperty("screenResolutionWidth", "screen_resolution_width", jsonReader);
                }
                if (screenResolutionDto4 == null) {
                    throw Util.missingProperty("screenResolutionHeight", "screen_resolution_height", jsonReader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("operationSystem", "operation_system", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
                }
                if (str4 != null) {
                    return new DeviceInfoDto(str5, screenResolutionDto3, screenResolutionDto4, str2, str3, str4);
                }
                throw Util.missingProperty("uuid", "uuid", jsonReader);
            }
            ScreenResolutionDto screenResolutionDto5 = screenResolutionDto2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
                case 0:
                    String fromJson = this.stringAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("model", "model", jsonReader);
                    }
                    str = fromJson;
                    screenResolutionDto2 = screenResolutionDto5;
                    screenResolutionDto = screenResolutionDto3;
                case 1:
                    screenResolutionDto = this.screenResolutionDtoAdapter.fromJson(jsonReader);
                    if (screenResolutionDto == null) {
                        throw Util.unexpectedNull("screenResolutionWidth", "screen_resolution_width", jsonReader);
                    }
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                case 2:
                    screenResolutionDto2 = this.screenResolutionDtoAdapter.fromJson(jsonReader);
                    if (screenResolutionDto2 == null) {
                        throw Util.unexpectedNull("screenResolutionHeight", "screen_resolution_height", jsonReader);
                    }
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
                case 3:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("operationSystem", "operation_system", jsonReader);
                    }
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
                case 4:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("deviceId", MetaDataField.DEVICE_ID_FIELD, jsonReader);
                    }
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
                case 5:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("uuid", "uuid", jsonReader);
                    }
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
                default:
                    screenResolutionDto2 = screenResolutionDto5;
                    str = str5;
                    screenResolutionDto = screenResolutionDto3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DeviceInfoDto deviceInfoDto) {
        DeviceInfoDto deviceInfoDto2 = deviceInfoDto;
        if (deviceInfoDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("model");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getModel());
        jsonWriter.name("screen_resolution_width");
        this.screenResolutionDtoAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getScreenResolutionWidth());
        jsonWriter.name("screen_resolution_height");
        this.screenResolutionDtoAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getScreenResolutionHeight());
        jsonWriter.name("operation_system");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getOperationSystem());
        jsonWriter.name(MetaDataField.DEVICE_ID_FIELD);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getDeviceId());
        jsonWriter.name("uuid");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) deviceInfoDto2.getUuid());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(DeviceInfoDto)");
    }
}
