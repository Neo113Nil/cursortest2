package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusResultData;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "themedParameterOfStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$Status;", "statusAdapter", "", "booleanAdapter", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "actionButtonDtoAdapter", "nullableActionButtonDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$LoadingData;", "nullableLoadingDataAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "nullableAutoTopupParamsDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "nullableAutoFundDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;", "nullableRegularAutotopupDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutotopupPaymentStatusResultDataJsonAdapter extends JsonAdapter<AutotopupPaymentStatusResultData> {
    private final JsonAdapter<ActionButtonDto> actionButtonDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ActionButtonDto> nullableActionButtonDtoAdapter;
    private final JsonAdapter<AutoFundDto> nullableAutoFundDtoAdapter;
    private final JsonAdapter<AutoTopupParamsDto> nullableAutoTopupParamsDtoAdapter;
    private final JsonAdapter<AutotopupPaymentStatusResultData.LoadingData> nullableLoadingDataAdapter;
    private final JsonAdapter<RegularAutotopupDto> nullableRegularAutotopupDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "logo", ACSPConstants.STATUS, "is_logo_with_status", "primary_button", "secondary_button", "failed_payment_id", "loading_info", "autotopup", "autofund", "regular_autotopup", "agreement_id");
    private final JsonAdapter<AutotopupPaymentStatusResultData.Status> statusAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public AutotopupPaymentStatusResultDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.stringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "logo");
        this.statusAdapter = moshi.adapter(AutotopupPaymentStatusResultData.Status.class, emptySet, ACSPConstants.STATUS);
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isLogoWithStatus");
        this.actionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "primaryButton");
        this.nullableActionButtonDtoAdapter = moshi.adapter(ActionButtonDto.class, emptySet, "secondaryButton");
        this.nullableLoadingDataAdapter = moshi.adapter(AutotopupPaymentStatusResultData.LoadingData.class, emptySet, "loadingData");
        this.nullableAutoTopupParamsDtoAdapter = moshi.adapter(AutoTopupParamsDto.class, emptySet, "autotopup");
        this.nullableAutoFundDtoAdapter = moshi.adapter(AutoFundDto.class, emptySet, "autofund");
        this.nullableRegularAutotopupDtoAdapter = moshi.adapter(RegularAutotopupDto.class, emptySet, "regularAutotopup");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutotopupPaymentStatusResultData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        ThemedParameter<String> themedParameter = null;
        AutotopupPaymentStatusResultData.Status status = null;
        ActionButtonDto actionButtonDto = null;
        ActionButtonDto actionButtonDto2 = null;
        String str4 = null;
        AutotopupPaymentStatusResultData.LoadingData loadingData = null;
        AutoTopupParamsDto autoTopupParamsDto = null;
        AutoFundDto autoFundDto = null;
        RegularAutotopupDto regularAutotopupDto = null;
        String str5 = null;
        while (true) {
            Boolean bool2 = bool;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            ThemedParameter<String> themedParameter2 = themedParameter;
            AutotopupPaymentStatusResultData.Status status2 = status;
            ActionButtonDto actionButtonDto3 = actionButtonDto;
            if (!jsonReader.hasNext()) {
                ActionButtonDto actionButtonDto4 = actionButtonDto2;
                jsonReader.endObject();
                if (str7 == null) {
                    throw Util.missingProperty(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                }
                if (themedParameter2 == null) {
                    throw Util.missingProperty("logo", "logo", jsonReader);
                }
                if (status2 == null) {
                    throw Util.missingProperty(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                }
                if (bool2 == null) {
                    throw Util.missingProperty("isLogoWithStatus", "is_logo_with_status", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (actionButtonDto3 == null) {
                    throw Util.missingProperty("primaryButton", "primary_button", jsonReader);
                }
                if (str5 != null) {
                    return new AutotopupPaymentStatusResultData(str6, str7, str8, themedParameter2, status2, booleanValue, actionButtonDto3, actionButtonDto4, str4, loadingData, autoTopupParamsDto, autoFundDto, regularAutotopupDto, str5);
                }
                throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
            }
            ActionButtonDto actionButtonDto5 = actionButtonDto2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, jsonReader);
                    }
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 3:
                    themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter == null) {
                        throw Util.unexpectedNull("logo", "logo", jsonReader);
                    }
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 4:
                    status = this.statusAdapter.fromJson(jsonReader);
                    if (status == null) {
                        throw Util.unexpectedNull(ACSPConstants.STATUS, ACSPConstants.STATUS, jsonReader);
                    }
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    actionButtonDto = actionButtonDto3;
                case 5:
                    Boolean fromJson = this.booleanAdapter.fromJson(jsonReader);
                    if (fromJson == null) {
                        throw Util.unexpectedNull("isLogoWithStatus", "is_logo_with_status", jsonReader);
                    }
                    bool = fromJson;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 6:
                    actionButtonDto = this.actionButtonDtoAdapter.fromJson(jsonReader);
                    if (actionButtonDto == null) {
                        throw Util.unexpectedNull("primaryButton", "primary_button", jsonReader);
                    }
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                case 7:
                    actionButtonDto2 = this.nullableActionButtonDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 9:
                    loadingData = this.nullableLoadingDataAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 10:
                    autoTopupParamsDto = this.nullableAutoTopupParamsDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 11:
                    autoFundDto = this.nullableAutoFundDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 12:
                    regularAutotopupDto = this.nullableRegularAutotopupDtoAdapter.fromJson(jsonReader);
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                case 13:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
                default:
                    bool = bool2;
                    actionButtonDto2 = actionButtonDto5;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themedParameter = themedParameter2;
                    status = status2;
                    actionButtonDto = actionButtonDto3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutotopupPaymentStatusResultData autotopupPaymentStatusResultData) {
        AutotopupPaymentStatusResultData autotopupPaymentStatusResultData2 = autotopupPaymentStatusResultData;
        if (autotopupPaymentStatusResultData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getDescription());
        jsonWriter.name("amount");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getAmount());
        jsonWriter.name("logo");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getLogo());
        jsonWriter.name(ACSPConstants.STATUS);
        this.statusAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getStatus());
        jsonWriter.name("is_logo_with_status");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(autotopupPaymentStatusResultData2.isLogoWithStatus()));
        jsonWriter.name("primary_button");
        this.actionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getPrimaryButton());
        jsonWriter.name("secondary_button");
        this.nullableActionButtonDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getSecondaryButton());
        jsonWriter.name("failed_payment_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getFailedPaymentId());
        jsonWriter.name("loading_info");
        this.nullableLoadingDataAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getLoadingData());
        jsonWriter.name("autotopup");
        this.nullableAutoTopupParamsDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getAutotopup());
        jsonWriter.name("autofund");
        this.nullableAutoFundDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getAutofund());
        jsonWriter.name("regular_autotopup");
        this.nullableRegularAutotopupDtoAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getRegularAutotopup());
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autotopupPaymentStatusResultData2.getAgreementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(AutotopupPaymentStatusResultData)");
    }
}
