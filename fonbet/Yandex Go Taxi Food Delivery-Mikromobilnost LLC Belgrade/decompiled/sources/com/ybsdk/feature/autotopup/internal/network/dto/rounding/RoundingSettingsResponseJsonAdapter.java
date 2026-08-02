package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.InformationButtonDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.ToolbarDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.TurnOffNoticeDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;", "roundingSettingsDataAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "nullableInformationButtonDataDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "turnOffNoticeDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "toolbarDataDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "", "stringAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoundingSettingsResponseJsonAdapter extends JsonAdapter<RoundingSettingsResponse> {
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonAdapter<InformationButtonDataDto> nullableInformationButtonDataDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(Constants.KEY_DATA, "information_button", "turn_off_notice", "toolbar", "payment_method", "payment_methods_list", "save_button_text", "turn_off_button_text", "title");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;
    private final JsonAdapter<RoundingSettingsData> roundingSettingsDataAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ToolbarDataDto> toolbarDataDtoAdapter;
    private final JsonAdapter<TurnOffNoticeDto> turnOffNoticeDtoAdapter;

    public RoundingSettingsResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.roundingSettingsDataAdapter = moshi.adapter(RoundingSettingsData.class, emptySet, Constants.KEY_DATA);
        this.nullableInformationButtonDataDtoAdapter = moshi.adapter(InformationButtonDataDto.class, emptySet, "infoButton");
        this.turnOffNoticeDtoAdapter = moshi.adapter(TurnOffNoticeDto.class, emptySet, "turnOffNotice");
        this.toolbarDataDtoAdapter = moshi.adapter(ToolbarDataDto.class, emptySet, "toolbar");
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "currentPaymentMethod");
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethods");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "saveButtonText");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RoundingSettingsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RoundingSettingsData roundingSettingsData = null;
        InformationButtonDataDto informationButtonDataDto = null;
        TurnOffNoticeDto turnOffNoticeDto = null;
        ToolbarDataDto toolbarDataDto = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        PaymentMethodsListDto paymentMethodsListDto = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            RoundingSettingsData roundingSettingsData2 = roundingSettingsData;
            InformationButtonDataDto informationButtonDataDto2 = informationButtonDataDto;
            TurnOffNoticeDto turnOffNoticeDto2 = turnOffNoticeDto;
            ToolbarDataDto toolbarDataDto2 = toolbarDataDto;
            CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
            PaymentMethodsListDto paymentMethodsListDto2 = paymentMethodsListDto;
            String str4 = str;
            if (!jsonReader.hasNext()) {
                String str5 = str2;
                jsonReader.endObject();
                if (roundingSettingsData2 == null) {
                    throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
                }
                if (turnOffNoticeDto2 == null) {
                    throw Util.missingProperty("turnOffNotice", "turn_off_notice", jsonReader);
                }
                if (toolbarDataDto2 == null) {
                    throw Util.missingProperty("toolbar", "toolbar", jsonReader);
                }
                if (paymentMethodsListDto2 == null) {
                    throw Util.missingProperty("paymentMethods", "payment_methods_list", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("saveButtonText", "save_button_text", jsonReader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("turnOffButtonText", "turn_off_button_text", jsonReader);
                }
                if (str3 != null) {
                    return new RoundingSettingsResponse(roundingSettingsData2, informationButtonDataDto2, turnOffNoticeDto2, toolbarDataDto2, currentPaymentMethodDto2, paymentMethodsListDto2, str4, str5, str3);
                }
                throw Util.missingProperty("title", "title", jsonReader);
            }
            String str6 = str2;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 0:
                    roundingSettingsData = this.roundingSettingsDataAdapter.fromJson(jsonReader);
                    if (roundingSettingsData == null) {
                        throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                    }
                    str2 = str6;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 1:
                    informationButtonDataDto = this.nullableInformationButtonDataDtoAdapter.fromJson(jsonReader);
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 2:
                    turnOffNoticeDto = this.turnOffNoticeDtoAdapter.fromJson(jsonReader);
                    if (turnOffNoticeDto == null) {
                        throw Util.unexpectedNull("turnOffNotice", "turn_off_notice", jsonReader);
                    }
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 3:
                    toolbarDataDto = this.toolbarDataDtoAdapter.fromJson(jsonReader);
                    if (toolbarDataDto == null) {
                        throw Util.unexpectedNull("toolbar", "toolbar", jsonReader);
                    }
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 4:
                    currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 5:
                    paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodsListDto == null) {
                        throw Util.unexpectedNull("paymentMethods", "payment_methods_list", jsonReader);
                    }
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    str = str4;
                case 6:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("saveButtonText", "save_button_text", jsonReader);
                    }
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                case 7:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("turnOffButtonText", "turn_off_button_text", jsonReader);
                    }
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                case 8:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
                default:
                    str2 = str6;
                    roundingSettingsData = roundingSettingsData2;
                    informationButtonDataDto = informationButtonDataDto2;
                    turnOffNoticeDto = turnOffNoticeDto2;
                    toolbarDataDto = toolbarDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RoundingSettingsResponse roundingSettingsResponse) {
        RoundingSettingsResponse roundingSettingsResponse2 = roundingSettingsResponse;
        if (roundingSettingsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.KEY_DATA);
        this.roundingSettingsDataAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getData());
        jsonWriter.name("information_button");
        this.nullableInformationButtonDataDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getInfoButton());
        jsonWriter.name("turn_off_notice");
        this.turnOffNoticeDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getTurnOffNotice());
        jsonWriter.name("toolbar");
        this.toolbarDataDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getToolbar());
        jsonWriter.name("payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getCurrentPaymentMethod());
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getPaymentMethods());
        jsonWriter.name("save_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getSaveButtonText());
        jsonWriter.name("turn_off_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getTurnOffButtonText());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) roundingSettingsResponse2.getTitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(RoundingSettingsResponse)");
    }
}
