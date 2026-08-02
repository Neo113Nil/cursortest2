package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/main/internal/data/network/dto/ScreenProductsRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "deviceInfoDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "nfcInfoDtoAdapter", "", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "", "intAdapter", "", "", "nullableMapOfStringAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenProductsRequestJsonAdapter extends JsonAdapter<ScreenProductsRequest> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ScreenProductsRequest> constructorRef;
    private final JsonAdapter<DeviceInfoDto> deviceInfoDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<NfcInfoDto> nfcInfoDtoAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("v4_header_enabled", "device_info", "nfc_info", "initial_deeplink", "communications_shown_info", "sessions_count_without_fullscreen", "additional_data");

    public ScreenProductsRequestJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "v4HeaderEnabled");
        this.deviceInfoDtoAdapter = moshi.adapter(DeviceInfoDto.class, emptySet, "deviceInfo");
        this.nfcInfoDtoAdapter = moshi.adapter(NfcInfoDto.class, emptySet, "nfcInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "initialDeeplink");
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationShownInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreenCount");
        this.nullableMapOfStringAnyAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), emptySet, "additionalData");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ScreenProductsRequest fromJson(JsonReader jsonReader) {
        int i;
        jsonReader.beginObject();
        int i2 = -1;
        Boolean bool = null;
        DeviceInfoDto deviceInfoDto = null;
        NfcInfoDto nfcInfoDto = null;
        String str = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        Integer num = null;
        Map<String, Object> map = null;
        while (true) {
            Boolean bool2 = bool;
            DeviceInfoDto deviceInfoDto2 = deviceInfoDto;
            if (!jsonReader.hasNext()) {
                NfcInfoDto nfcInfoDto2 = nfcInfoDto;
                jsonReader.endObject();
                if (i2 == -73) {
                    if (bool2 == null) {
                        throw Util.missingProperty("v4HeaderEnabled", "v4_header_enabled", jsonReader);
                    }
                    boolean booleanValue = bool2.booleanValue();
                    if (deviceInfoDto2 == null) {
                        throw Util.missingProperty("deviceInfo", "device_info", jsonReader);
                    }
                    if (nfcInfoDto2 == null) {
                        throw Util.missingProperty("nfcInfo", "nfc_info", jsonReader);
                    }
                    if (num == null) {
                        throw Util.missingProperty("sessionsCountWithoutFullscreenCount", "sessions_count_without_fullscreen", jsonReader);
                    }
                    return new ScreenProductsRequest(booleanValue, deviceInfoDto2, nfcInfoDto2, str, communicationsShownInfoDto, num.intValue(), map);
                }
                Constructor<ScreenProductsRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
                    Class cls2 = Boolean.TYPE;
                    Class cls3 = Integer.TYPE;
                    Class[] clsArr = {cls2, DeviceInfoDto.class, NfcInfoDto.class, String.class, CommunicationsShownInfoDto.class, cls3, Map.class, cls3, cls};
                    i = i2;
                    constructor = ScreenProductsRequest.class.getDeclaredConstructor(clsArr);
                    this.constructorRef = constructor;
                } else {
                    i = i2;
                }
                Constructor<ScreenProductsRequest> constructor2 = constructor;
                if (bool2 == null) {
                    throw Util.missingProperty("v4HeaderEnabled", "v4_header_enabled", jsonReader);
                }
                if (deviceInfoDto2 == null) {
                    throw Util.missingProperty("deviceInfo", "device_info", jsonReader);
                }
                if (nfcInfoDto2 == null) {
                    throw Util.missingProperty("nfcInfo", "nfc_info", jsonReader);
                }
                if (num != null) {
                    return constructor2.newInstance(bool2, deviceInfoDto2, nfcInfoDto2, str, communicationsShownInfoDto, num, map, Integer.valueOf(i), null);
                }
                throw Util.missingProperty("sessionsCountWithoutFullscreenCount", "sessions_count_without_fullscreen", jsonReader);
            }
            NfcInfoDto nfcInfoDto3 = nfcInfoDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("v4HeaderEnabled", "v4_header_enabled", jsonReader);
                    }
                    nfcInfoDto = nfcInfoDto3;
                    deviceInfoDto = deviceInfoDto2;
                case 1:
                    deviceInfoDto = this.deviceInfoDtoAdapter.fromJson(jsonReader);
                    if (deviceInfoDto == null) {
                        throw Util.unexpectedNull("deviceInfo", "device_info", jsonReader);
                    }
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                case 2:
                    nfcInfoDto = this.nfcInfoDtoAdapter.fromJson(jsonReader);
                    if (nfcInfoDto == null) {
                        throw Util.unexpectedNull("nfcInfo", "nfc_info", jsonReader);
                    }
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                case 3:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                case 4:
                    communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("sessionsCountWithoutFullscreenCount", "sessions_count_without_fullscreen", jsonReader);
                    }
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                case 6:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
                default:
                    nfcInfoDto = nfcInfoDto3;
                    bool = bool2;
                    deviceInfoDto = deviceInfoDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ScreenProductsRequest screenProductsRequest) {
        ScreenProductsRequest screenProductsRequest2 = screenProductsRequest;
        if (screenProductsRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("v4_header_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(screenProductsRequest2.getV4HeaderEnabled()));
        jsonWriter.name("device_info");
        this.deviceInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsRequest2.getDeviceInfo());
        jsonWriter.name("nfc_info");
        this.nfcInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsRequest2.getNfcInfo());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) screenProductsRequest2.getInitialDeeplink());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) screenProductsRequest2.getCommunicationShownInfo());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(screenProductsRequest2.getSessionsCountWithoutFullscreenCount()));
        jsonWriter.name("additional_data");
        this.nullableMapOfStringAnyAdapter.toJson(jsonWriter, (JsonWriter) screenProductsRequest2.getAdditionalData());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ScreenProductsRequest)");
    }
}
