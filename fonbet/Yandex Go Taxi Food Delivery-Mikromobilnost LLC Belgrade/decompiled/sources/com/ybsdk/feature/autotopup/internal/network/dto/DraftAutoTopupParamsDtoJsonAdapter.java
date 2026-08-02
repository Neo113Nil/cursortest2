package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.PaymentMethodInfoDto;
import defpackage.ny61;
import defpackage.uw51;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/DraftAutoTopupParamsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "autoTopupTypeRequestDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/math/BigDecimal;", "nullableBigDecimalAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "nullablePaymentMethodInfoDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DraftAutoTopupParamsDtoJsonAdapter extends JsonAdapter<DraftAutoTopupParamsDto> {
    private final JsonAdapter<AutoTopupTypeRequestDto> autoTopupTypeRequestDtoAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonAdapter<PaymentMethodInfoDto> nullablePaymentMethodInfoDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("autoTopupType", "money", "threshold", "paymentMethodInfo");

    public DraftAutoTopupParamsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupTypeRequestDtoAdapter = moshi.adapter(AutoTopupTypeRequestDto.class, emptySet, "autoTopupType");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "money");
        this.nullablePaymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethodInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final DraftAutoTopupParamsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupTypeRequestDto autoTopupTypeRequestDto = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoTopupTypeRequestDto = this.autoTopupTypeRequestDtoAdapter.fromJson(jsonReader);
                if (autoTopupTypeRequestDto == null) {
                    throw Util.unexpectedNull("autoTopupType", "autoTopupType", jsonReader);
                }
            } else if (selectName == 1) {
                bigDecimal = this.nullableBigDecimalAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                paymentMethodInfoDto = this.nullablePaymentMethodInfoDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupTypeRequestDto != null) {
            return new DraftAutoTopupParamsDto(autoTopupTypeRequestDto, bigDecimal, bigDecimal2, paymentMethodInfoDto);
        }
        throw Util.missingProperty("autoTopupType", "autoTopupType", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, DraftAutoTopupParamsDto draftAutoTopupParamsDto) {
        DraftAutoTopupParamsDto draftAutoTopupParamsDto2 = draftAutoTopupParamsDto;
        if (draftAutoTopupParamsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("autoTopupType");
        this.autoTopupTypeRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) draftAutoTopupParamsDto2.getAutoTopupType());
        jsonWriter.name("money");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) draftAutoTopupParamsDto2.getMoney());
        jsonWriter.name("threshold");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) draftAutoTopupParamsDto2.getThreshold());
        jsonWriter.name("paymentMethodInfo");
        this.nullablePaymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) draftAutoTopupParamsDto2.getPaymentMethodInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(45, "GeneratedJsonAdapter(DraftAutoTopupParamsDto)");
    }
}
