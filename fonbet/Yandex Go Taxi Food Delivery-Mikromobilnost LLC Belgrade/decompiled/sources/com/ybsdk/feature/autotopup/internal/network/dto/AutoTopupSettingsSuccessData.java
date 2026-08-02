package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.stories.dto.FullScreenDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.nnm;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\nHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012HÆ\u0003J\t\u0010E\u001a\u00020\u0014HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u0011\u0010J\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012HÆ\u0003JÉ\u0001\u0010K\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0003\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012HÆ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b:\u00100¨\u0006R"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessData;", "", "agreementId", "", "title", "screenSubtitle", "screenIcon", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "saveButtonText", "paymentMethodList", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "savingsNotice", "Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "bindingPaymentInstructions", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "confirmationPaymentInstruction", "Lcom/ybsdk/core/stories/dto/FullScreenDto;", "boundPaymentMethodIds", "", "autotopupData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupDataDto;", "autofundData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;", "autoTopupId", "paymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "toolbarButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupToolbarButton;", "fullScreens", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Themes;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;Lcom/ybsdk/core/stories/dto/FullScreenDto;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupDataDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupToolbarButton;Ljava/util/List;)V", "getAgreementId", "()Ljava/lang/String;", "getTitle", "getScreenSubtitle", "getScreenIcon", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getSaveButtonText", "getPaymentMethodList", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "getSavingsNotice", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/SavingsNoticeDto;", "getBindingPaymentInstructions", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "getConfirmationPaymentInstruction", "()Lcom/ybsdk/core/stories/dto/FullScreenDto;", "getBoundPaymentMethodIds", "()Ljava/util/List;", "getAutotopupData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupDataDto;", "getAutofundData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundDataDto;", "getAutoTopupId", "getPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getToolbarButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupToolbarButton;", "getFullScreens", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsSuccessData {
    private final String agreementId;
    private final String autoTopupId;
    private final C0142AutofundDataDto autofundData;
    private final AutoTopupDataDto autotopupData;
    private final BindingPaymentInstructionsDto bindingPaymentInstructions;
    private final List<String> boundPaymentMethodIds;
    private final FullScreenDto confirmationPaymentInstruction;
    private final List<com.ybsdk.feature.banners.api.dto.FullScreenDto> fullScreens;
    private final CurrentPaymentMethodDto paymentMethod;
    private final PaymentMethodsListDto paymentMethodList;
    private final String saveButtonText;
    private final SavingsNoticeDto savingsNotice;
    private final Themes<String> screenIcon;
    private final String screenSubtitle;
    private final String title;
    private final AutoTopupToolbarButton toolbarButton;

    public AutoTopupSettingsSuccessData(@Json(name = "agreement_id") String str, @Json(name = "screen_title") String str2, @Json(name = "screen_subtitle") String str3, @Json(name = "screen_icon") Themes<String> themes, @Json(name = "save_button_text") String str4, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto, @Json(name = "savings_notice") SavingsNoticeDto savingsNoticeDto, @Json(name = "binding_payment_instructions") BindingPaymentInstructionsDto bindingPaymentInstructionsDto, @Json(name = "confirmation_payment_instruction") FullScreenDto fullScreenDto, @Json(name = "bound_payment_method_ids") List<String> list, @Json(name = "autotopup") AutoTopupDataDto autoTopupDataDto, @Json(name = "autofund") C0142AutofundDataDto c0142AutofundDataDto, @Json(name = "autotopup_id") String str5, @Json(name = "payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "toolbar_button") AutoTopupToolbarButton autoTopupToolbarButton, @Json(name = "fullscreens") List<com.ybsdk.feature.banners.api.dto.FullScreenDto> list2) {
        this.agreementId = str;
        this.title = str2;
        this.screenSubtitle = str3;
        this.screenIcon = themes;
        this.saveButtonText = str4;
        this.paymentMethodList = paymentMethodsListDto;
        this.savingsNotice = savingsNoticeDto;
        this.bindingPaymentInstructions = bindingPaymentInstructionsDto;
        this.confirmationPaymentInstruction = fullScreenDto;
        this.boundPaymentMethodIds = list;
        this.autotopupData = autoTopupDataDto;
        this.autofundData = c0142AutofundDataDto;
        this.autoTopupId = str5;
        this.paymentMethod = currentPaymentMethodDto;
        this.toolbarButton = autoTopupToolbarButton;
        this.fullScreens = list2;
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final List<String> component10() {
        return this.boundPaymentMethodIds;
    }

    /* renamed from: component11, reason: from getter */
    public final AutoTopupDataDto getAutotopupData() {
        return this.autotopupData;
    }

    /* renamed from: component12, reason: from getter */
    public final C0142AutofundDataDto getAutofundData() {
        return this.autofundData;
    }

    /* renamed from: component13, reason: from getter */
    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    /* renamed from: component14, reason: from getter */
    public final CurrentPaymentMethodDto getPaymentMethod() {
        return this.paymentMethod;
    }

    /* renamed from: component15, reason: from getter */
    public final AutoTopupToolbarButton getToolbarButton() {
        return this.toolbarButton;
    }

    public final List<com.ybsdk.feature.banners.api.dto.FullScreenDto> component16() {
        return this.fullScreens;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    public final Themes<String> component4() {
        return this.screenIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentMethodsListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    /* renamed from: component7, reason: from getter */
    public final SavingsNoticeDto getSavingsNotice() {
        return this.savingsNotice;
    }

    /* renamed from: component8, reason: from getter */
    public final BindingPaymentInstructionsDto getBindingPaymentInstructions() {
        return this.bindingPaymentInstructions;
    }

    /* renamed from: component9, reason: from getter */
    public final FullScreenDto getConfirmationPaymentInstruction() {
        return this.confirmationPaymentInstruction;
    }

    public final AutoTopupSettingsSuccessData copy(@Json(name = "agreement_id") String agreementId, @Json(name = "screen_title") String title, @Json(name = "screen_subtitle") String screenSubtitle, @Json(name = "screen_icon") Themes<String> screenIcon, @Json(name = "save_button_text") String saveButtonText, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodList, @Json(name = "savings_notice") SavingsNoticeDto savingsNotice, @Json(name = "binding_payment_instructions") BindingPaymentInstructionsDto bindingPaymentInstructions, @Json(name = "confirmation_payment_instruction") FullScreenDto confirmationPaymentInstruction, @Json(name = "bound_payment_method_ids") List<String> boundPaymentMethodIds, @Json(name = "autotopup") AutoTopupDataDto autotopupData, @Json(name = "autofund") C0142AutofundDataDto autofundData, @Json(name = "autotopup_id") String autoTopupId, @Json(name = "payment_method") CurrentPaymentMethodDto paymentMethod, @Json(name = "toolbar_button") AutoTopupToolbarButton toolbarButton, @Json(name = "fullscreens") List<com.ybsdk.feature.banners.api.dto.FullScreenDto> fullScreens) {
        return new AutoTopupSettingsSuccessData(agreementId, title, screenSubtitle, screenIcon, saveButtonText, paymentMethodList, savingsNotice, bindingPaymentInstructions, confirmationPaymentInstruction, boundPaymentMethodIds, autotopupData, autofundData, autoTopupId, paymentMethod, toolbarButton, fullScreens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsSuccessData)) {
            return false;
        }
        AutoTopupSettingsSuccessData autoTopupSettingsSuccessData = (AutoTopupSettingsSuccessData) other;
        return jl40.l(this.agreementId, autoTopupSettingsSuccessData.agreementId) && jl40.l(this.title, autoTopupSettingsSuccessData.title) && jl40.l(this.screenSubtitle, autoTopupSettingsSuccessData.screenSubtitle) && jl40.l(this.screenIcon, autoTopupSettingsSuccessData.screenIcon) && jl40.l(this.saveButtonText, autoTopupSettingsSuccessData.saveButtonText) && jl40.l(this.paymentMethodList, autoTopupSettingsSuccessData.paymentMethodList) && jl40.l(this.savingsNotice, autoTopupSettingsSuccessData.savingsNotice) && jl40.l(this.bindingPaymentInstructions, autoTopupSettingsSuccessData.bindingPaymentInstructions) && jl40.l(this.confirmationPaymentInstruction, autoTopupSettingsSuccessData.confirmationPaymentInstruction) && jl40.l(this.boundPaymentMethodIds, autoTopupSettingsSuccessData.boundPaymentMethodIds) && jl40.l(this.autotopupData, autoTopupSettingsSuccessData.autotopupData) && jl40.l(this.autofundData, autoTopupSettingsSuccessData.autofundData) && jl40.l(this.autoTopupId, autoTopupSettingsSuccessData.autoTopupId) && jl40.l(this.paymentMethod, autoTopupSettingsSuccessData.paymentMethod) && jl40.l(this.toolbarButton, autoTopupSettingsSuccessData.toolbarButton) && jl40.l(this.fullScreens, autoTopupSettingsSuccessData.fullScreens);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAutoTopupId() {
        return this.autoTopupId;
    }

    public final C0142AutofundDataDto getAutofundData() {
        return this.autofundData;
    }

    public final AutoTopupDataDto getAutotopupData() {
        return this.autotopupData;
    }

    public final BindingPaymentInstructionsDto getBindingPaymentInstructions() {
        return this.bindingPaymentInstructions;
    }

    public final List<String> getBoundPaymentMethodIds() {
        return this.boundPaymentMethodIds;
    }

    public final FullScreenDto getConfirmationPaymentInstruction() {
        return this.confirmationPaymentInstruction;
    }

    public final List<com.ybsdk.feature.banners.api.dto.FullScreenDto> getFullScreens() {
        return this.fullScreens;
    }

    public final CurrentPaymentMethodDto getPaymentMethod() {
        return this.paymentMethod;
    }

    public final PaymentMethodsListDto getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    public final SavingsNoticeDto getSavingsNotice() {
        return this.savingsNotice;
    }

    public final Themes<String> getScreenIcon() {
        return this.screenIcon;
    }

    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AutoTopupToolbarButton getToolbarButton() {
        return this.toolbarButton;
    }

    public int hashCode() {
        int hashCode = (this.paymentMethodList.hashCode() + unr0.b(nnm.c(this.screenIcon, unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.title), 31, this.screenSubtitle), 31), 31, this.saveButtonText)) * 31;
        SavingsNoticeDto savingsNoticeDto = this.savingsNotice;
        int hashCode2 = (this.bindingPaymentInstructions.hashCode() + ((hashCode + (savingsNoticeDto == null ? 0 : savingsNoticeDto.hashCode())) * 31)) * 31;
        FullScreenDto fullScreenDto = this.confirmationPaymentInstruction;
        int hashCode3 = (this.autotopupData.hashCode() + unr0.c((hashCode2 + (fullScreenDto == null ? 0 : fullScreenDto.hashCode())) * 31, 31, this.boundPaymentMethodIds)) * 31;
        C0142AutofundDataDto c0142AutofundDataDto = this.autofundData;
        int hashCode4 = (hashCode3 + (c0142AutofundDataDto == null ? 0 : c0142AutofundDataDto.hashCode())) * 31;
        String str = this.autoTopupId;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.paymentMethod;
        int hashCode6 = (hashCode5 + (currentPaymentMethodDto == null ? 0 : currentPaymentMethodDto.hashCode())) * 31;
        AutoTopupToolbarButton autoTopupToolbarButton = this.toolbarButton;
        int hashCode7 = (hashCode6 + (autoTopupToolbarButton == null ? 0 : autoTopupToolbarButton.hashCode())) * 31;
        List<com.ybsdk.feature.banners.api.dto.FullScreenDto> list = this.fullScreens;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.title;
        String str3 = this.screenSubtitle;
        Themes<String> themes = this.screenIcon;
        String str4 = this.saveButtonText;
        PaymentMethodsListDto paymentMethodsListDto = this.paymentMethodList;
        SavingsNoticeDto savingsNoticeDto = this.savingsNotice;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = this.bindingPaymentInstructions;
        FullScreenDto fullScreenDto = this.confirmationPaymentInstruction;
        List<String> list = this.boundPaymentMethodIds;
        AutoTopupDataDto autoTopupDataDto = this.autotopupData;
        C0142AutofundDataDto c0142AutofundDataDto = this.autofundData;
        String str5 = this.autoTopupId;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.paymentMethod;
        AutoTopupToolbarButton autoTopupToolbarButton = this.toolbarButton;
        List<com.ybsdk.feature.banners.api.dto.FullScreenDto> list2 = this.fullScreens;
        StringBuilder v = b64.v("AutoTopupSettingsSuccessData(agreementId=", str, ", title=", str2, ", screenSubtitle=");
        n.B(v, str3, ", screenIcon=", themes, ", saveButtonText=");
        v.append(str4);
        v.append(", paymentMethodList=");
        v.append(paymentMethodsListDto);
        v.append(", savingsNotice=");
        v.append(savingsNoticeDto);
        v.append(", bindingPaymentInstructions=");
        v.append(bindingPaymentInstructionsDto);
        v.append(", confirmationPaymentInstruction=");
        v.append(fullScreenDto);
        v.append(", boundPaymentMethodIds=");
        v.append(list);
        v.append(", autotopupData=");
        v.append(autoTopupDataDto);
        v.append(", autofundData=");
        v.append(c0142AutofundDataDto);
        v.append(", autoTopupId=");
        v.append(str5);
        v.append(", paymentMethod=");
        v.append(currentPaymentMethodDto);
        v.append(", toolbarButton=");
        v.append(autoTopupToolbarButton);
        v.append(", fullScreens=");
        v.append(list2);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
