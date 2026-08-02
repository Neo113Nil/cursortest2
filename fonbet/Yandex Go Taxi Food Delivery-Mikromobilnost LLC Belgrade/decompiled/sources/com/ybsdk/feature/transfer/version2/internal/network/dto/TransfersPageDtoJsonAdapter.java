package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/AgreementInfoDto;", "listOfAgreementInfoDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/Money;", "nullableMoneyAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "nullableActionButtonDtoAdapter", "", "nullableBooleanAdapter", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferPageWidgetWithToggleDto;", "nullableTransferPageWidgetWithToggleDtoAdapter", "nullableListOfStringAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersPageDtoJsonAdapter extends JsonAdapter<TransfersPageDto> {
    private final JsonAdapter<List<AgreementInfoDto>> listOfAgreementInfoDtoAdapter;
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<TransferPageWidgetWithToggleDto> nullableTransferPageWidgetWithToggleDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreements", "agreements_sheet_title", "default_money_value", "title", "primary_button", "is_amount_editable", "autotopup_widget", "autotopup_whitelist_nspk_members_confirmation");
    private final JsonAdapter<String> stringAdapter;

    public TransfersPageDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, AgreementInfoDto.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfAgreementInfoDtoAdapter = moshi.adapter(newParameterizedType, emptySet, "agreements");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementsBottomSheetTitle");
        this.nullableMoneyAdapter = moshi.adapter(Money.class, emptySet, "defaultMoneyValue");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "primaryButton");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "isAmountEditable");
        this.nullableTransferPageWidgetWithToggleDtoAdapter = moshi.adapter(TransferPageWidgetWithToggleDto.class, emptySet, "autotopupWidget");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "autotopupWhitelistNspkMembersConfirmation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final TransfersPageDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<AgreementInfoDto> list = null;
        String str = null;
        Money money = null;
        String str2 = null;
        ActionButtonDto actionButtonDto = null;
        Boolean bool = null;
        TransferPageWidgetWithToggleDto transferPageWidgetWithToggleDto = null;
        List<String> list2 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.listOfAgreementInfoDtoAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("agreements", "agreements", jsonReader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementsBottomSheetTitle", "agreements_sheet_title", jsonReader);
                    }
                    break;
                case 2:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    actionButtonDto = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    transferPageWidgetWithToggleDto = this.nullableTransferPageWidgetWithToggleDtoAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("agreements", "agreements", jsonReader);
        }
        if (str != null) {
            return new TransfersPageDto(list, str, money, str2, actionButtonDto, bool, transferPageWidgetWithToggleDto, list2);
        }
        throw Util.missingProperty("agreementsBottomSheetTitle", "agreements_sheet_title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, TransfersPageDto transfersPageDto) {
        TransfersPageDto transfersPageDto2 = transfersPageDto;
        if (transfersPageDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreements");
        this.listOfAgreementInfoDtoAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getAgreements());
        jsonWriter.name("agreements_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getAgreementsBottomSheetTitle());
        jsonWriter.name("default_money_value");
        this.nullableMoneyAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getDefaultMoneyValue());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getTitle());
        jsonWriter.name("primary_button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getPrimaryButton());
        jsonWriter.name("is_amount_editable");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.isAmountEditable());
        jsonWriter.name("autotopup_widget");
        this.nullableTransferPageWidgetWithToggleDtoAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getAutotopupWidget());
        jsonWriter.name("autotopup_whitelist_nspk_members_confirmation");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) transfersPageDto2.getAutotopupWhitelistNspkMembersConfirmation());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(38, "GeneratedJsonAdapter(TransfersPageDto)");
    }
}
