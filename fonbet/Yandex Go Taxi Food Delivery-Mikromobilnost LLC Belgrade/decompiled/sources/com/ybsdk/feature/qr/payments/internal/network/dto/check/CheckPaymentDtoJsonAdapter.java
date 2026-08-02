package com.ybsdk.feature.qr.payments.internal.network.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/CheckPaymentDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/CheckPaymentDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "nullableCashbackDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "nullableUnconditionalLimitWidgetDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/check/TooltipDto;", "nullableTooltipDtoAdapter", "", "booleanAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckPaymentDtoJsonAdapter extends JsonAdapter<CheckPaymentDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CashbackDto> nullableCashbackDtoAdapter;
    private final JsonAdapter<TooltipDto> nullableTooltipDtoAdapter;
    private final JsonAdapter<UnconditionalLimitWidgetDto> nullableUnconditionalLimitWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("cashback", "check_id", "limit_widget", "tooltip", "is_payment_allowed");
    private final JsonAdapter<String> stringAdapter;

    public CheckPaymentDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableCashbackDtoAdapter = moshi.adapter(CashbackDto.class, emptySet, "cashback");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "checkId");
        this.nullableUnconditionalLimitWidgetDtoAdapter = moshi.adapter(UnconditionalLimitWidgetDto.class, emptySet, "limitWidget");
        this.nullableTooltipDtoAdapter = moshi.adapter(TooltipDto.class, emptySet, "tooltip");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPaymentAllowed");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckPaymentDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        CashbackDto cashbackDto = null;
        String str = null;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = null;
        TooltipDto tooltipDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                cashbackDto = this.nullableCashbackDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("checkId", "check_id", jsonReader);
                }
            } else if (selectName == 2) {
                unconditionalLimitWidgetDto = this.nullableUnconditionalLimitWidgetDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                tooltipDto = this.nullableTooltipDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 4 && (bool = this.booleanAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("isPaymentAllowed", "is_payment_allowed", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("checkId", "check_id", jsonReader);
        }
        if (bool != null) {
            return new CheckPaymentDto(cashbackDto, str, unconditionalLimitWidgetDto, tooltipDto, bool.booleanValue());
        }
        throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckPaymentDto checkPaymentDto) {
        CheckPaymentDto checkPaymentDto2 = checkPaymentDto;
        if (checkPaymentDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("cashback");
        this.nullableCashbackDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentDto2.getCashback());
        jsonWriter.name("check_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentDto2.getCheckId());
        jsonWriter.name("limit_widget");
        this.nullableUnconditionalLimitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentDto2.getLimitWidget());
        jsonWriter.name("tooltip");
        this.nullableTooltipDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentDto2.getTooltip());
        jsonWriter.name("is_payment_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(checkPaymentDto2.isPaymentAllowed()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(37, "GeneratedJsonAdapter(CheckPaymentDto)");
    }
}
