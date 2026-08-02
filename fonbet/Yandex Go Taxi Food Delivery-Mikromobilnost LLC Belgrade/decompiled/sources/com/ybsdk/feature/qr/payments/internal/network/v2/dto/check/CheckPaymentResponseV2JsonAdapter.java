package com.ybsdk.feature.qr.payments.internal.network.v2.dto.check;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.common.CredlimCheckPayloadDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/TooltipWithActionDto;", "nullableTooltipWithActionDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/ResultPageDataDto;", "resultPageDataDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/feature/qr/payments/internal/network/common/CredlimCheckPayloadDto;", "nullableCredlimCheckPayloadDtoAdapter", "", "nullableMapOfStringStringAdapter", "nullableStringAdapter", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckPaymentResponseV2JsonAdapter extends JsonAdapter<CheckPaymentResponseV2> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CredlimCheckPayloadDto> nullableCredlimCheckPayloadDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TooltipWithActionDto> nullableTooltipWithActionDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_payment_allowed", "check_id", "tooltip", "result_page_data", "divkit_widget", "credlim_payload", "divkit_agreements_chip_text", "decline_reason");
    private final JsonAdapter<ResultPageDataDto> resultPageDataDtoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public CheckPaymentResponseV2JsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isPaymentAllowed");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "checkId");
        this.nullableTooltipWithActionDtoAdapter = moshi.adapter(TooltipWithActionDto.class, emptySet, "tooltip");
        this.resultPageDataDtoAdapter = moshi.adapter(ResultPageDataDto.class, emptySet, "resultPageData");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitWidget");
        this.nullableCredlimCheckPayloadDtoAdapter = moshi.adapter(CredlimCheckPayloadDto.class, emptySet, "credlimPayload");
        this.nullableMapOfStringStringAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, String.class), emptySet, "divkitAgreementsChipText");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "declineReason");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckPaymentResponseV2 fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        TooltipWithActionDto tooltipWithActionDto = null;
        ResultPageDataDto resultPageDataDto = null;
        DivDataDto divDataDto = null;
        CredlimCheckPayloadDto credlimCheckPayloadDto = null;
        Map<String, String> map = null;
        String str2 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (bool2 == null) {
                    throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str == null) {
                    throw Util.missingProperty("checkId", "check_id", jsonReader);
                }
                if (resultPageDataDto != null) {
                    return new CheckPaymentResponseV2(booleanValue, str, tooltipWithActionDto, resultPageDataDto, divDataDto, credlimCheckPayloadDto, map, str2);
                }
                throw Util.missingProperty("resultPageData", "result_page_data", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isPaymentAllowed", "is_payment_allowed", jsonReader);
                    }
                    continue;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("checkId", "check_id", jsonReader);
                    }
                    break;
                case 2:
                    tooltipWithActionDto = this.nullableTooltipWithActionDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    resultPageDataDto = this.resultPageDataDtoAdapter.fromJson(jsonReader);
                    if (resultPageDataDto == null) {
                        throw Util.unexpectedNull("resultPageData", "result_page_data", jsonReader);
                    }
                    break;
                case 4:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    credlimCheckPayloadDto = this.nullableCredlimCheckPayloadDtoAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    map = this.nullableMapOfStringStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckPaymentResponseV2 checkPaymentResponseV2) {
        CheckPaymentResponseV2 checkPaymentResponseV22 = checkPaymentResponseV2;
        if (checkPaymentResponseV22 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_payment_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(checkPaymentResponseV22.isPaymentAllowed()));
        jsonWriter.name("check_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getCheckId());
        jsonWriter.name("tooltip");
        this.nullableTooltipWithActionDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getTooltip());
        jsonWriter.name("result_page_data");
        this.resultPageDataDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getResultPageData());
        jsonWriter.name("divkit_widget");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getDivkitWidget());
        jsonWriter.name("credlim_payload");
        this.nullableCredlimCheckPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getCredlimPayload());
        jsonWriter.name("divkit_agreements_chip_text");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getDivkitAgreementsChipText());
        jsonWriter.name("decline_reason");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkPaymentResponseV22.getDeclineReason());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(CheckPaymentResponseV2)");
    }
}
