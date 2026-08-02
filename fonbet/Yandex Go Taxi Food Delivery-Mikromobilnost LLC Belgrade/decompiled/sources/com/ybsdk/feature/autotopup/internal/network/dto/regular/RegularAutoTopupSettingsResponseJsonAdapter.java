package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.BindingPaymentInstructionsDto;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;", "regularAutotopupDataDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "", "", "nullableListOfStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "nullableBindingPaymentInstructionsDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "toolbarDataDtoAdapter", "stringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "informationButtonDataDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "turnOffNoticeDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutoTopupSettingsResponseJsonAdapter extends JsonAdapter<RegularAutoTopupSettingsResponse> {
    private final JsonAdapter<InformationButtonDataDto> informationButtonDataDtoAdapter;
    private final JsonAdapter<BindingPaymentInstructionsDto> nullableBindingPaymentInstructionsDtoAdapter;
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(Constants.KEY_DATA, "payment_method", "payment_methods_list", "bound_payment_method_ids", "binding_payment_instructions", "toolbar", "save_button_text", "turn_off_button_text", "information_button", "turn_off_notice");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;
    private final JsonAdapter<RegularAutotopupDataDto> regularAutotopupDataDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<ToolbarDataDto> toolbarDataDtoAdapter;
    private final JsonAdapter<TurnOffNoticeDto> turnOffNoticeDtoAdapter;

    public RegularAutoTopupSettingsResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.regularAutotopupDataDtoAdapter = moshi.adapter(RegularAutotopupDataDto.class, emptySet, Constants.KEY_DATA);
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "currentPaymentMethod");
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethods");
        this.nullableListOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "boundPaymentMethodIds");
        this.nullableBindingPaymentInstructionsDtoAdapter = moshi.adapter(BindingPaymentInstructionsDto.class, emptySet, "bindingPaymentInstructions");
        this.toolbarDataDtoAdapter = moshi.adapter(ToolbarDataDto.class, emptySet, "toolbar");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "saveButtonText");
        this.informationButtonDataDtoAdapter = moshi.adapter(InformationButtonDataDto.class, emptySet, "infoButton");
        this.turnOffNoticeDtoAdapter = moshi.adapter(TurnOffNoticeDto.class, emptySet, "turnOffNotice");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutoTopupSettingsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        RegularAutotopupDataDto regularAutotopupDataDto = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        PaymentMethodsListDto paymentMethodsListDto = null;
        List<String> list = null;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = null;
        ToolbarDataDto toolbarDataDto = null;
        String str = null;
        String str2 = null;
        InformationButtonDataDto informationButtonDataDto = null;
        TurnOffNoticeDto turnOffNoticeDto = null;
        while (true) {
            RegularAutotopupDataDto regularAutotopupDataDto2 = regularAutotopupDataDto;
            CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
            PaymentMethodsListDto paymentMethodsListDto2 = paymentMethodsListDto;
            List<String> list2 = list;
            BindingPaymentInstructionsDto bindingPaymentInstructionsDto2 = bindingPaymentInstructionsDto;
            ToolbarDataDto toolbarDataDto2 = toolbarDataDto;
            String str3 = str;
            String str4 = str2;
            InformationButtonDataDto informationButtonDataDto2 = informationButtonDataDto;
            if (!jsonReader.hasNext()) {
                TurnOffNoticeDto turnOffNoticeDto2 = turnOffNoticeDto;
                jsonReader.endObject();
                if (regularAutotopupDataDto2 == null) {
                    throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
                }
                if (paymentMethodsListDto2 == null) {
                    throw Util.missingProperty("paymentMethods", "payment_methods_list", jsonReader);
                }
                if (toolbarDataDto2 == null) {
                    throw Util.missingProperty("toolbar", "toolbar", jsonReader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("saveButtonText", "save_button_text", jsonReader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("turnOffButtonText", "turn_off_button_text", jsonReader);
                }
                if (informationButtonDataDto2 == null) {
                    throw Util.missingProperty("infoButton", "information_button", jsonReader);
                }
                if (turnOffNoticeDto2 != null) {
                    return new RegularAutoTopupSettingsResponse(regularAutotopupDataDto2, currentPaymentMethodDto2, paymentMethodsListDto2, list2, bindingPaymentInstructionsDto2, toolbarDataDto2, str3, str4, informationButtonDataDto2, turnOffNoticeDto2);
                }
                throw Util.missingProperty("turnOffNotice", "turn_off_notice", jsonReader);
            }
            TurnOffNoticeDto turnOffNoticeDto3 = turnOffNoticeDto;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 0:
                    regularAutotopupDataDto = this.regularAutotopupDataDtoAdapter.fromJson(jsonReader);
                    if (regularAutotopupDataDto == null) {
                        throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 1:
                    currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 2:
                    paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodsListDto == null) {
                        throw Util.unexpectedNull("paymentMethods", "payment_methods_list", jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 3:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader);
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 4:
                    bindingPaymentInstructionsDto = this.nullableBindingPaymentInstructionsDtoAdapter.fromJson(jsonReader);
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 5:
                    toolbarDataDto = this.toolbarDataDtoAdapter.fromJson(jsonReader);
                    if (toolbarDataDto == null) {
                        throw Util.unexpectedNull("toolbar", "toolbar", jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 6:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("saveButtonText", "save_button_text", jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                case 7:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("turnOffButtonText", "turn_off_button_text", jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    informationButtonDataDto = informationButtonDataDto2;
                case 8:
                    informationButtonDataDto = this.informationButtonDataDtoAdapter.fromJson(jsonReader);
                    if (informationButtonDataDto == null) {
                        throw Util.unexpectedNull("infoButton", "information_button", jsonReader);
                    }
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                case 9:
                    turnOffNoticeDto = this.turnOffNoticeDtoAdapter.fromJson(jsonReader);
                    if (turnOffNoticeDto == null) {
                        throw Util.unexpectedNull("turnOffNotice", "turn_off_notice", jsonReader);
                    }
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
                default:
                    turnOffNoticeDto = turnOffNoticeDto3;
                    regularAutotopupDataDto = regularAutotopupDataDto2;
                    currentPaymentMethodDto = currentPaymentMethodDto2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    list = list2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    toolbarDataDto = toolbarDataDto2;
                    str = str3;
                    str2 = str4;
                    informationButtonDataDto = informationButtonDataDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse) {
        RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse2 = regularAutoTopupSettingsResponse;
        if (regularAutoTopupSettingsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(Constants.KEY_DATA);
        this.regularAutotopupDataDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getData());
        jsonWriter.name("payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getCurrentPaymentMethod());
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getPaymentMethods());
        jsonWriter.name("bound_payment_method_ids");
        this.nullableListOfStringAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getBoundPaymentMethodIds());
        jsonWriter.name("binding_payment_instructions");
        this.nullableBindingPaymentInstructionsDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getBindingPaymentInstructions());
        jsonWriter.name("toolbar");
        this.toolbarDataDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getToolbar());
        jsonWriter.name("save_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getSaveButtonText());
        jsonWriter.name("turn_off_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getTurnOffButtonText());
        jsonWriter.name("information_button");
        this.informationButtonDataDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getInfoButton());
        jsonWriter.name("turn_off_notice");
        this.turnOffNoticeDtoAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupSettingsResponse2.getTurnOffNotice());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(54, "GeneratedJsonAdapter(RegularAutoTopupSettingsResponse)");
    }
}
