package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.device.DeviceInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/device/DeviceInfoDto;", "deviceInfoDtoAdapter", "", "nullableListOfStringAdapter", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MerchantOffersSearchRequestJsonAdapter extends JsonAdapter<MerchantOffersSearchRequest> {
    private final JsonAdapter<DeviceInfoDto> deviceInfoDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("query", "device_info", "offer_ids");
    private final JsonAdapter<String> stringAdapter;

    public MerchantOffersSearchRequestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "query");
        this.deviceInfoDtoAdapter = moshi.adapter(DeviceInfoDto.class, emptySet, "deviceInfo");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "offerIds");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MerchantOffersSearchRequest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        DeviceInfoDto deviceInfoDto = null;
        List<String> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("query", "query", jsonReader);
                }
            } else if (selectName == 1) {
                deviceInfoDto = this.deviceInfoDtoAdapter.fromJson(jsonReader);
                if (deviceInfoDto == null) {
                    throw Util.unexpectedNull("deviceInfo", "device_info", jsonReader);
                }
            } else if (selectName == 2) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("query", "query", jsonReader);
        }
        if (deviceInfoDto != null) {
            return new MerchantOffersSearchRequest(str, deviceInfoDto, list);
        }
        throw Util.missingProperty("deviceInfo", "device_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MerchantOffersSearchRequest merchantOffersSearchRequest) {
        MerchantOffersSearchRequest merchantOffersSearchRequest2 = merchantOffersSearchRequest;
        if (merchantOffersSearchRequest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("query");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchRequest2.getQuery());
        jsonWriter.name("device_info");
        this.deviceInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchRequest2.getDeviceInfo());
        jsonWriter.name("offer_ids");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) merchantOffersSearchRequest2.getOfferIds());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(MerchantOffersSearchRequest)");
    }
}
