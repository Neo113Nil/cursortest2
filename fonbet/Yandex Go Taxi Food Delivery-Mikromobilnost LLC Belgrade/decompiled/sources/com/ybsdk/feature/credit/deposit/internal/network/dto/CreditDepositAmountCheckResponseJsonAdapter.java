package com.ybsdk.feature.credit.deposit.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/CreditDepositAmountCheckResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "", "Lcom/ybsdk/feature/credit/deposit/internal/network/dto/SuggestDto;", "nullableListOfSuggestDtoAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "", "booleanAdapter", "feature-credit-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreditDepositAmountCheckResponseJsonAdapter extends JsonAdapter<CreditDepositAmountCheckResponse> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<SuggestDto>> nullableListOfSuggestDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("amount_description", "tooltip", "tooltip_amount", "tooltip_position", "tooltip_action_text", "tooltip_action", "tooltip_action_image", "suggests", "divkit_data", "is_payment_allowed");
    private final JsonAdapter<String> stringAdapter;

    public CreditDepositAmountCheckResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "amountDescription");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "tooltip");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "tooltipActionImage");
        this.nullableListOfSuggestDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, SuggestDto.class), emptySet, "suggests");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "divkitData");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isPaymentAllowed");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CreditDepositAmountCheckResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Themes<String> themes = null;
        List<SuggestDto> list = null;
        DivDataDto divDataDto = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str == null) {
                    throw Util.missingProperty("amountDescription", "amount_description", jsonReader);
                }
                if (bool2 != null) {
                    return new CreditDepositAmountCheckResponse(str, str2, str3, str4, str5, str6, themes, list, divDataDto, bool2.booleanValue());
                }
                throw Util.missingProperty("isPaymentAllowed", "is_payment_allowed", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("amountDescription", "amount_description", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list = this.nullableListOfSuggestDtoAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("isPaymentAllowed", "is_payment_allowed", jsonReader);
                    }
                    bool = fromJson;
                    continue;
            }
            bool = bool2;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CreditDepositAmountCheckResponse creditDepositAmountCheckResponse) {
        CreditDepositAmountCheckResponse creditDepositAmountCheckResponse2 = creditDepositAmountCheckResponse;
        if (creditDepositAmountCheckResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("amount_description");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getAmountDescription());
        jsonWriter.name("tooltip");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltip());
        jsonWriter.name("tooltip_amount");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltipAmount());
        jsonWriter.name("tooltip_position");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltipPosition());
        jsonWriter.name("tooltip_action_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltipActionText());
        jsonWriter.name("tooltip_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltipAction());
        jsonWriter.name("tooltip_action_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getTooltipActionImage());
        jsonWriter.name("suggests");
        this.nullableListOfSuggestDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getSuggests());
        jsonWriter.name("divkit_data");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) creditDepositAmountCheckResponse2.getDivkitData());
        jsonWriter.name("is_payment_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(creditDepositAmountCheckResponse2.isPaymentAllowed()));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(CreditDepositAmountCheckResponse)");
    }
}
