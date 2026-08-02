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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Ljava/math/BigDecimal;", "bigDecimalAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableBigDecimalAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodInfoDto;", "paymentMethodInfoDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeRequestDto;", "nullableAutoTopupTypeRequestDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "nullableAutoTopupSwitchStatusRequestDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupParamsDtoJsonAdapter extends JsonAdapter<AutoTopupParamsDto> {
    private final JsonAdapter<BigDecimal> bigDecimalAdapter;
    private final JsonAdapter<AutoTopupSwitchStatusRequestDto> nullableAutoTopupSwitchStatusRequestDtoAdapter;
    private final JsonAdapter<AutoTopupTypeRequestDto> nullableAutoTopupTypeRequestDtoAdapter;
    private final JsonAdapter<BigDecimal> nullableBigDecimalAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("money", "threshold", "paymentMethodInfo", "autoTopupType", "autotopupStatus");
    private final JsonAdapter<PaymentMethodInfoDto> paymentMethodInfoDtoAdapter;

    public AutoTopupParamsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.bigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "amount");
        this.nullableBigDecimalAdapter = moshi.adapter(BigDecimal.class, emptySet, "threshold");
        this.paymentMethodInfoDtoAdapter = moshi.adapter(PaymentMethodInfoDto.class, emptySet, "paymentMethodInfo");
        this.nullableAutoTopupTypeRequestDtoAdapter = moshi.adapter(AutoTopupTypeRequestDto.class, emptySet, "autoTopupType");
        this.nullableAutoTopupSwitchStatusRequestDtoAdapter = moshi.adapter(AutoTopupSwitchStatusRequestDto.class, emptySet, "autoTopupStatus");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupParamsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        PaymentMethodInfoDto paymentMethodInfoDto = null;
        AutoTopupTypeRequestDto autoTopupTypeRequestDto = null;
        AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bigDecimal = this.bigDecimalAdapter.fromJson(jsonReader);
                if (bigDecimal == null) {
                    throw Util.unexpectedNull("amount", "money", jsonReader);
                }
            } else if (selectName == 1) {
                bigDecimal2 = this.nullableBigDecimalAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                paymentMethodInfoDto = this.paymentMethodInfoDtoAdapter.fromJson(jsonReader);
                if (paymentMethodInfoDto == null) {
                    throw Util.unexpectedNull("paymentMethodInfo", "paymentMethodInfo", jsonReader);
                }
            } else if (selectName == 3) {
                autoTopupTypeRequestDto = this.nullableAutoTopupTypeRequestDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4) {
                autoTopupSwitchStatusRequestDto = this.nullableAutoTopupSwitchStatusRequestDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (bigDecimal == null) {
            throw Util.missingProperty("amount", "money", jsonReader);
        }
        if (paymentMethodInfoDto != null) {
            return new AutoTopupParamsDto(bigDecimal, bigDecimal2, paymentMethodInfoDto, autoTopupTypeRequestDto, autoTopupSwitchStatusRequestDto);
        }
        throw Util.missingProperty("paymentMethodInfo", "paymentMethodInfo", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupParamsDto autoTopupParamsDto) {
        AutoTopupParamsDto autoTopupParamsDto2 = autoTopupParamsDto;
        if (autoTopupParamsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("money");
        this.bigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoTopupParamsDto2.getAmount());
        jsonWriter.name("threshold");
        this.nullableBigDecimalAdapter.toJson(jsonWriter, (JsonWriter) autoTopupParamsDto2.getThreshold());
        jsonWriter.name("paymentMethodInfo");
        this.paymentMethodInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupParamsDto2.getPaymentMethodInfo());
        jsonWriter.name("autoTopupType");
        this.nullableAutoTopupTypeRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupParamsDto2.getAutoTopupType());
        jsonWriter.name("autotopupStatus");
        this.nullableAutoTopupSwitchStatusRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupParamsDto2.getAutoTopupStatus());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(AutoTopupParamsDto)");
    }
}
