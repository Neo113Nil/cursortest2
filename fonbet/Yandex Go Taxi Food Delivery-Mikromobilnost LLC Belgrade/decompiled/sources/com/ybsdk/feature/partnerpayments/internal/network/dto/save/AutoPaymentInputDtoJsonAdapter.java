package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInputDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInputDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/AutoPaymentInfoDto;", "autoPaymentInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "hmacDtoAdapter", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoPaymentInputDtoJsonAdapter extends JsonAdapter<AutoPaymentInputDto> {
    private final JsonAdapter<AutoPaymentInfoDto> autoPaymentInfoDtoAdapter;
    private final JsonAdapter<HmacDto> hmacDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("info", "hmac");

    public AutoPaymentInputDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoPaymentInfoDtoAdapter = moshi.adapter(AutoPaymentInfoDto.class, emptySet, "info");
        this.hmacDtoAdapter = moshi.adapter(HmacDto.class, emptySet, "hmac");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoPaymentInputDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoPaymentInfoDto autoPaymentInfoDto = null;
        HmacDto hmacDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoPaymentInfoDto = this.autoPaymentInfoDtoAdapter.fromJson(jsonReader);
                if (autoPaymentInfoDto == null) {
                    throw Util.unexpectedNull("info", "info", jsonReader);
                }
            } else if (selectName == 1 && (hmacDto = this.hmacDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("hmac", "hmac", jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoPaymentInfoDto == null) {
            throw Util.missingProperty("info", "info", jsonReader);
        }
        if (hmacDto != null) {
            return new AutoPaymentInputDto(autoPaymentInfoDto, hmacDto);
        }
        throw Util.missingProperty("hmac", "hmac", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoPaymentInputDto autoPaymentInputDto) {
        AutoPaymentInputDto autoPaymentInputDto2 = autoPaymentInputDto;
        if (autoPaymentInputDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("info");
        this.autoPaymentInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentInputDto2.getInfo());
        jsonWriter.name("hmac");
        this.hmacDtoAdapter.toJson(jsonWriter, (JsonWriter) autoPaymentInputDto2.getHmac());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(AutoPaymentInputDto)");
    }
}
