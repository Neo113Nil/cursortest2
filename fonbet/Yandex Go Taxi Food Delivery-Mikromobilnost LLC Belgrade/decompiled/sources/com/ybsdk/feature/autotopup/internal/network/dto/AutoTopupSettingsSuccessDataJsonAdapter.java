package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.stories.dto.FullScreenDto;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "themesOfStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "paymentMethodsListDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "nullableSavingsNoticeDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "bindingPaymentInstructionsDtoAdapter", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "nullableFullScreenDtoAdapter", "", "listOfStringAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupDataDto;", "autoTopupDataDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;", "nullableAutofundDataDtoAdapter", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "nullableCurrentPaymentMethodDtoAdapter", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupToolbarButton;", "nullableAutoTopupToolbarButtonAdapter", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "nullableListOfFullScreenDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupSettingsSuccessDataJsonAdapter extends JsonAdapter<AutoTopupSettingsSuccessData> {
    private final JsonAdapter<AutoTopupDataDto> autoTopupDataDtoAdapter;
    private final JsonAdapter<BindingPaymentInstructionsDto> bindingPaymentInstructionsDtoAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<AutoTopupToolbarButton> nullableAutoTopupToolbarButtonAdapter;
    private final JsonAdapter<C0142AutofundDataDto> nullableAutofundDataDtoAdapter;
    private final JsonAdapter<CurrentPaymentMethodDto> nullableCurrentPaymentMethodDtoAdapter;
    private final JsonAdapter<FullScreenDto> nullableFullScreenDtoAdapter;
    private final JsonAdapter<List<com.ybsdk.feature.banners.api.dto.FullScreenDto>> nullableListOfFullScreenDtoAdapter;
    private final JsonAdapter<SavingsNoticeDto> nullableSavingsNoticeDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreement_id", "screen_title", "screen_subtitle", "screen_icon", "save_button_text", "payment_methods_list", "savings_notice", "binding_payment_instructions", "confirmation_payment_instruction", "bound_payment_method_ids", "autotopup", "autofund", "autotopup_id", "payment_method", "toolbar_button", "fullscreens");
    private final JsonAdapter<PaymentMethodsListDto> paymentMethodsListDtoAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public AutoTopupSettingsSuccessDataJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementId");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "screenIcon");
        this.paymentMethodsListDtoAdapter = moshi.adapter(PaymentMethodsListDto.class, emptySet, "paymentMethodList");
        this.nullableSavingsNoticeDtoAdapter = moshi.adapter(SavingsNoticeDto.class, emptySet, "savingsNotice");
        this.bindingPaymentInstructionsDtoAdapter = moshi.adapter(BindingPaymentInstructionsDto.class, emptySet, "bindingPaymentInstructions");
        this.nullableFullScreenDtoAdapter = moshi.adapter(FullScreenDto.class, emptySet, "confirmationPaymentInstruction");
        this.listOfStringAdapter = moshi.adapter(Types.newParameterizedType(List.class, String.class), emptySet, "boundPaymentMethodIds");
        this.autoTopupDataDtoAdapter = moshi.adapter(AutoTopupDataDto.class, emptySet, "autotopupData");
        this.nullableAutofundDataDtoAdapter = moshi.adapter(C0142AutofundDataDto.class, emptySet, "autofundData");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "autoTopupId");
        this.nullableCurrentPaymentMethodDtoAdapter = moshi.adapter(CurrentPaymentMethodDto.class, emptySet, "paymentMethod");
        this.nullableAutoTopupToolbarButtonAdapter = moshi.adapter(AutoTopupToolbarButton.class, emptySet, "toolbarButton");
        this.nullableListOfFullScreenDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, com.ybsdk.feature.banners.api.dto.FullScreenDto.class), emptySet, "fullScreens");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupSettingsSuccessData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        Themes<String> themes = null;
        String str4 = null;
        PaymentMethodsListDto paymentMethodsListDto = null;
        SavingsNoticeDto savingsNoticeDto = null;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = null;
        FullScreenDto fullScreenDto = null;
        List<String> list = null;
        AutoTopupDataDto autoTopupDataDto = null;
        C0142AutofundDataDto c0142AutofundDataDto = null;
        String str5 = null;
        CurrentPaymentMethodDto currentPaymentMethodDto = null;
        AutoTopupToolbarButton autoTopupToolbarButton = null;
        List<com.ybsdk.feature.banners.api.dto.FullScreenDto> list2 = null;
        while (true) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            Themes<String> themes2 = themes;
            String str9 = str4;
            PaymentMethodsListDto paymentMethodsListDto2 = paymentMethodsListDto;
            SavingsNoticeDto savingsNoticeDto2 = savingsNoticeDto;
            BindingPaymentInstructionsDto bindingPaymentInstructionsDto2 = bindingPaymentInstructionsDto;
            FullScreenDto fullScreenDto2 = fullScreenDto;
            List<String> list3 = list;
            AutoTopupDataDto autoTopupDataDto2 = autoTopupDataDto;
            C0142AutofundDataDto c0142AutofundDataDto2 = c0142AutofundDataDto;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("agreementId", "agreement_id", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("title", "screen_title", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("screenSubtitle", "screen_subtitle", jsonReader);
                }
                if (themes2 == null) {
                    throw Util.missingProperty("screenIcon", "screen_icon", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("saveButtonText", "save_button_text", jsonReader);
                }
                if (paymentMethodsListDto2 == null) {
                    throw Util.missingProperty("paymentMethodList", "payment_methods_list", jsonReader);
                }
                if (bindingPaymentInstructionsDto2 == null) {
                    throw Util.missingProperty("bindingPaymentInstructions", "binding_payment_instructions", jsonReader);
                }
                if (list3 == null) {
                    throw Util.missingProperty("boundPaymentMethodIds", "bound_payment_method_ids", jsonReader);
                }
                if (autoTopupDataDto2 != null) {
                    return new AutoTopupSettingsSuccessData(str6, str7, str8, themes2, str9, paymentMethodsListDto2, savingsNoticeDto2, bindingPaymentInstructionsDto2, fullScreenDto2, list3, autoTopupDataDto2, c0142AutofundDataDto2, str5, currentPaymentMethodDto, autoTopupToolbarButton, list2);
                }
                throw Util.missingProperty("autotopupData", "autotopup", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("agreementId", "agreement_id", jsonReader);
                    }
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "screen_title", jsonReader);
                    }
                    str = str6;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("screenSubtitle", "screen_subtitle", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 3:
                    themes = this.themesOfStringAdapter.fromJson(jsonReader);
                    if (themes == null) {
                        throw Util.unexpectedNull("screenIcon", "screen_icon", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("saveButtonText", "save_button_text", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 5:
                    paymentMethodsListDto = this.paymentMethodsListDtoAdapter.fromJson(jsonReader);
                    if (paymentMethodsListDto == null) {
                        throw Util.unexpectedNull("paymentMethodList", "payment_methods_list", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 6:
                    savingsNoticeDto = this.nullableSavingsNoticeDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 7:
                    bindingPaymentInstructionsDto = this.bindingPaymentInstructionsDtoAdapter.fromJson(jsonReader);
                    if (bindingPaymentInstructionsDto == null) {
                        throw Util.unexpectedNull("bindingPaymentInstructions", "binding_payment_instructions", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 8:
                    fullScreenDto = this.nullableFullScreenDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 9:
                    list = this.listOfStringAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("boundPaymentMethodIds", "bound_payment_method_ids", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 10:
                    autoTopupDataDto = this.autoTopupDataDtoAdapter.fromJson(jsonReader);
                    if (autoTopupDataDto == null) {
                        throw Util.unexpectedNull("autotopupData", "autotopup", jsonReader);
                    }
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 11:
                    c0142AutofundDataDto = this.nullableAutofundDataDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                case 12:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 13:
                    currentPaymentMethodDto = this.nullableCurrentPaymentMethodDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 14:
                    autoTopupToolbarButton = this.nullableAutoTopupToolbarButtonAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                case 15:
                    list2 = this.nullableListOfFullScreenDtoAdapter.fromJson(jsonReader);
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
                default:
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    themes = themes2;
                    str4 = str9;
                    paymentMethodsListDto = paymentMethodsListDto2;
                    savingsNoticeDto = savingsNoticeDto2;
                    bindingPaymentInstructionsDto = bindingPaymentInstructionsDto2;
                    fullScreenDto = fullScreenDto2;
                    list = list3;
                    autoTopupDataDto = autoTopupDataDto2;
                    c0142AutofundDataDto = c0142AutofundDataDto2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupSettingsSuccessData autoTopupSettingsSuccessData) {
        AutoTopupSettingsSuccessData autoTopupSettingsSuccessData2 = autoTopupSettingsSuccessData;
        if (autoTopupSettingsSuccessData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreement_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getAgreementId());
        jsonWriter.name("screen_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getTitle());
        jsonWriter.name("screen_subtitle");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getScreenSubtitle());
        jsonWriter.name("screen_icon");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getScreenIcon());
        jsonWriter.name("save_button_text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getSaveButtonText());
        jsonWriter.name("payment_methods_list");
        this.paymentMethodsListDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getPaymentMethodList());
        jsonWriter.name("savings_notice");
        this.nullableSavingsNoticeDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getSavingsNotice());
        jsonWriter.name("binding_payment_instructions");
        this.bindingPaymentInstructionsDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getBindingPaymentInstructions());
        jsonWriter.name("confirmation_payment_instruction");
        this.nullableFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getConfirmationPaymentInstruction());
        jsonWriter.name("bound_payment_method_ids");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getBoundPaymentMethodIds());
        jsonWriter.name("autotopup");
        this.autoTopupDataDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getAutotopupData());
        jsonWriter.name("autofund");
        this.nullableAutofundDataDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getAutofundData());
        jsonWriter.name("autotopup_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getAutoTopupId());
        jsonWriter.name("payment_method");
        this.nullableCurrentPaymentMethodDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getPaymentMethod());
        jsonWriter.name("toolbar_button");
        this.nullableAutoTopupToolbarButtonAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getToolbarButton());
        jsonWriter.name("fullscreens");
        this.nullableListOfFullScreenDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupSettingsSuccessData2.getFullScreens());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(AutoTopupSettingsSuccessData)");
    }
}
