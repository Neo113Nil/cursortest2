package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersScreenRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "deviceInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "nullableListOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "nullableCommunicationsShownInfoDtoAdapter", "", "intAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersScreenRequestJsonAdapter extends JsonAdapter<MerchantOffersScreenRequest> {
    private final JsonAdapter<DeviceInfoDto> deviceInfoDtoAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<CommunicationsShownInfoDto> nullableCommunicationsShownInfoDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("device_info", "ml_request_id", "offer_ids", "initial_deeplink", "communications_shown_info", "sessions_count_without_fullscreen");

    public MerchantOffersScreenRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.deviceInfoDtoAdapter = moshi.adapter(DeviceInfoDto.class, emptySet, "deviceInfo");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "mlRequestId");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "offerIds");
        this.nullableCommunicationsShownInfoDtoAdapter = moshi.adapter(CommunicationsShownInfoDto.class, emptySet, "communicationShownInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "sessionsCountWithoutFullscreenCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOffersScreenRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        DeviceInfoDto deviceInfoDto = null;
        String str = null;
        List<String> list = null;
        String str2 = null;
        CommunicationsShownInfoDto communicationsShownInfoDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    deviceInfoDto = this.deviceInfoDtoAdapter.fromJson(jsonReader);
                    if (deviceInfoDto == null) {
                        throw Util.unexpectedNull("deviceInfo", "device_info", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    communicationsShownInfoDto = this.nullableCommunicationsShownInfoDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("sessionsCountWithoutFullscreenCount", "sessions_count_without_fullscreen", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (deviceInfoDto == null) {
            throw Util.missingProperty("deviceInfo", "device_info", jsonReader);
        }
        if (num != null) {
            return new MerchantOffersScreenRequest(deviceInfoDto, str, list, str2, communicationsShownInfoDto, num.intValue());
        }
        throw Util.missingProperty("sessionsCountWithoutFullscreenCount", "sessions_count_without_fullscreen", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOffersScreenRequest merchantOffersScreenRequest) {
        MerchantOffersScreenRequest merchantOffersScreenRequest2 = merchantOffersScreenRequest;
        if (merchantOffersScreenRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("device_info");
        this.deviceInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenRequest2.getDeviceInfo());
        jsonWriter.name("ml_request_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenRequest2.getMlRequestId());
        jsonWriter.name("offer_ids");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenRequest2.getOfferIds());
        jsonWriter.name("initial_deeplink");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenRequest2.getInitialDeeplink());
        jsonWriter.name("communications_shown_info");
        this.nullableCommunicationsShownInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersScreenRequest2.getCommunicationShownInfo());
        jsonWriter.name("sessions_count_without_fullscreen");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(merchantOffersScreenRequest2.getSessionsCountWithoutFullscreenCount()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(MerchantOffersScreenRequest)");
    }
}
