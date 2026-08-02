package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/transfer/utils/domain/dto/UnconditionalLimitWidgetDto;", "nullableUnconditionalLimitWidgetDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferResultPageDto;", "nullableTransferResultPageDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "nullableThemesOfStringAdapter", "", "booleanAdapter", "nullableBooleanAdapter", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "nullableDivDataDtoAdapter", "Lcom/ybsdk/core/transfer/utils/domain/dto/CashbackDto;", "nullableCashbackDtoAdapter", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferAgreementDto;", "nullableListOfCheckTransferAgreementDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "nullableActionButtonDtoAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderPayloadDto;", "nullableCheckCrossBorderPayloadDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CheckTransferDtoJsonAdapter extends JsonAdapter<CheckTransferDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CashbackDto> nullableCashbackDtoAdapter;
    private final JsonAdapter<CheckCrossBorderPayloadDto> nullableCheckCrossBorderPayloadDtoAdapter;
    private final JsonAdapter<DivDataDto> nullableDivDataDtoAdapter;
    private final JsonAdapter<List<CheckTransferAgreementDto>> nullableListOfCheckTransferAgreementDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Themes<String>> nullableThemesOfStringAdapter;
    private final JsonAdapter<TransferResultPageDto> nullableTransferResultPageDtoAdapter;
    private final JsonAdapter<UnconditionalLimitWidgetDto> nullableUnconditionalLimitWidgetDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("fee", "limit_widget", "result_page", "timeout_result_page", "tooltip", "tooltip_action", "tooltip_action_text", "tooltip_action_image", "is_transfer_allowed", "check_id", "transfer_id", "pre_confirm_action", "drop_pre_confirm_action_after_use", "fee_action", "fee_payload", "cashback", "agreements", "primary_button", "cross_border_payload");

    public CheckTransferDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "fee");
        this.nullableUnconditionalLimitWidgetDtoAdapter = moshi.adapter(UnconditionalLimitWidgetDto.class, emptySet, "limitWidget");
        this.nullableTransferResultPageDtoAdapter = moshi.adapter(TransferResultPageDto.class, emptySet, "resultPage");
        this.nullableThemesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "tooltipActionImage");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "transferAllowed");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "dropPreConfirmActionAfterUse");
        this.nullableDivDataDtoAdapter = moshi.adapter(DivDataDto.class, emptySet, "feePayload");
        this.nullableCashbackDtoAdapter = moshi.adapter(CashbackDto.class, emptySet, "cashback");
        this.nullableListOfCheckTransferAgreementDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, CheckTransferAgreementDto.class), emptySet, "agreements");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "primaryButton");
        this.nullableCheckCrossBorderPayloadDtoAdapter = moshi.adapter(CheckCrossBorderPayloadDto.class, emptySet, "crossBorderPayload");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CheckTransferDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        UnconditionalLimitWidgetDto unconditionalLimitWidgetDto = null;
        TransferResultPageDto transferResultPageDto = null;
        TransferResultPageDto transferResultPageDto2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Themes<String> themes = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool2 = null;
        String str8 = null;
        DivDataDto divDataDto = null;
        CashbackDto cashbackDto = null;
        List<CheckTransferAgreementDto> list = null;
        ActionButtonDto actionButtonDto = null;
        CheckCrossBorderPayloadDto checkCrossBorderPayloadDto = null;
        while (true) {
            Boolean bool3 = bool;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (bool3 != null) {
                    return new CheckTransferDto(str, unconditionalLimitWidgetDto, transferResultPageDto, transferResultPageDto2, str2, str3, str4, themes, bool3.booleanValue(), str5, str6, str7, bool2, str8, divDataDto, cashbackDto, list, actionButtonDto, checkCrossBorderPayloadDto);
                }
                throw Util.missingProperty("transferAllowed", "is_transfer_allowed", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    unconditionalLimitWidgetDto = this.nullableUnconditionalLimitWidgetDtoAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    transferResultPageDto = this.nullableTransferResultPageDtoAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    transferResultPageDto2 = this.nullableTransferResultPageDtoAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    themes = this.nullableThemesOfStringAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("transferAllowed", "is_transfer_allowed", jsonReader);
                    }
                    bool = fromJson;
                    continue;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 11:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 12:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 13:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 14:
                    divDataDto = this.nullableDivDataDtoAdapter.fromJson(jsonReader);
                    break;
                case 15:
                    cashbackDto = this.nullableCashbackDtoAdapter.fromJson(jsonReader);
                    break;
                case 16:
                    list = this.nullableListOfCheckTransferAgreementDtoAdapter.fromJson(jsonReader);
                    break;
                case 17:
                    actionButtonDto = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 18:
                    checkCrossBorderPayloadDto = this.nullableCheckCrossBorderPayloadDtoAdapter.fromJson(jsonReader);
                    break;
            }
            bool = bool3;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CheckTransferDto checkTransferDto) {
        CheckTransferDto checkTransferDto2 = checkTransferDto;
        if (checkTransferDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("fee");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getFee());
        jsonWriter.name("limit_widget");
        this.nullableUnconditionalLimitWidgetDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getLimitWidget());
        jsonWriter.name("result_page");
        this.nullableTransferResultPageDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getResultPage());
        jsonWriter.name("timeout_result_page");
        this.nullableTransferResultPageDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTimeoutResultPage());
        jsonWriter.name("tooltip");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTooltip());
        jsonWriter.name("tooltip_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTooltipAction());
        jsonWriter.name("tooltip_action_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTooltipActionText());
        jsonWriter.name("tooltip_action_image");
        this.nullableThemesOfStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTooltipActionImage());
        jsonWriter.name("is_transfer_allowed");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(checkTransferDto2.getTransferAllowed()));
        jsonWriter.name("check_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getCheckId());
        jsonWriter.name("transfer_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getTransferId());
        jsonWriter.name("pre_confirm_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getPreConfirmAction());
        jsonWriter.name("drop_pre_confirm_action_after_use");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getDropPreConfirmActionAfterUse());
        jsonWriter.name("fee_action");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getFeeAction());
        jsonWriter.name("fee_payload");
        this.nullableDivDataDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getFeePayload());
        jsonWriter.name("cashback");
        this.nullableCashbackDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getCashback());
        jsonWriter.name("agreements");
        this.nullableListOfCheckTransferAgreementDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getAgreements());
        jsonWriter.name("primary_button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getPrimaryButton());
        jsonWriter.name("cross_border_payload");
        this.nullableCheckCrossBorderPayloadDtoAdapter.toJson(jsonWriter, (JsonWriter) checkTransferDto2.getCrossBorderPayload());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(CheckTransferDto)");
    }
}
