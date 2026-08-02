package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.BindingPaymentInstructionsDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\n\u0012\b\b\u0001\u0010\u0010\u001a\u00020\n\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003Jy\u00104\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\n2\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupSettingsResponse;", "", Constants.KEY_DATA, "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;", "currentPaymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "paymentMethods", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "boundPaymentMethodIds", "", "", "bindingPaymentInstructions", "Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "toolbar", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "saveButtonText", "turnOffButtonText", "infoButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "turnOffNotice", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;Ljava/util/List;Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;)V", "getData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutotopupDataDto;", "getCurrentPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getPaymentMethods", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "getBoundPaymentMethodIds", "()Ljava/util/List;", "getBindingPaymentInstructions", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/BindingPaymentInstructionsDto;", "getToolbar", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "getSaveButtonText", "()Ljava/lang/String;", "getTurnOffButtonText", "getInfoButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "getTurnOffNotice", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RegularAutoTopupSettingsResponse {
    private final BindingPaymentInstructionsDto bindingPaymentInstructions;
    private final List<String> boundPaymentMethodIds;
    private final CurrentPaymentMethodDto currentPaymentMethod;
    private final RegularAutotopupDataDto data;
    private final InformationButtonDataDto infoButton;
    private final PaymentMethodsListDto paymentMethods;
    private final String saveButtonText;
    private final ToolbarDataDto toolbar;
    private final String turnOffButtonText;
    private final TurnOffNoticeDto turnOffNotice;

    public RegularAutoTopupSettingsResponse(@Json(name = "data") RegularAutotopupDataDto regularAutotopupDataDto, @Json(name = "payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto, @Json(name = "bound_payment_method_ids") List<String> list, @Json(name = "binding_payment_instructions") BindingPaymentInstructionsDto bindingPaymentInstructionsDto, @Json(name = "toolbar") ToolbarDataDto toolbarDataDto, @Json(name = "save_button_text") String str, @Json(name = "turn_off_button_text") String str2, @Json(name = "information_button") InformationButtonDataDto informationButtonDataDto, @Json(name = "turn_off_notice") TurnOffNoticeDto turnOffNoticeDto) {
        this.data = regularAutotopupDataDto;
        this.currentPaymentMethod = currentPaymentMethodDto;
        this.paymentMethods = paymentMethodsListDto;
        this.boundPaymentMethodIds = list;
        this.bindingPaymentInstructions = bindingPaymentInstructionsDto;
        this.toolbar = toolbarDataDto;
        this.saveButtonText = str;
        this.turnOffButtonText = str2;
        this.infoButton = informationButtonDataDto;
        this.turnOffNotice = turnOffNoticeDto;
    }

    public static /* synthetic */ RegularAutoTopupSettingsResponse copy$default(RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse, RegularAutotopupDataDto regularAutotopupDataDto, CurrentPaymentMethodDto currentPaymentMethodDto, PaymentMethodsListDto paymentMethodsListDto, List list, BindingPaymentInstructionsDto bindingPaymentInstructionsDto, ToolbarDataDto toolbarDataDto, String str, String str2, InformationButtonDataDto informationButtonDataDto, TurnOffNoticeDto turnOffNoticeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            regularAutotopupDataDto = regularAutoTopupSettingsResponse.data;
        }
        if ((i & 2) != 0) {
            currentPaymentMethodDto = regularAutoTopupSettingsResponse.currentPaymentMethod;
        }
        if ((i & 4) != 0) {
            paymentMethodsListDto = regularAutoTopupSettingsResponse.paymentMethods;
        }
        if ((i & 8) != 0) {
            list = regularAutoTopupSettingsResponse.boundPaymentMethodIds;
        }
        if ((i & 16) != 0) {
            bindingPaymentInstructionsDto = regularAutoTopupSettingsResponse.bindingPaymentInstructions;
        }
        if ((i & 32) != 0) {
            toolbarDataDto = regularAutoTopupSettingsResponse.toolbar;
        }
        if ((i & 64) != 0) {
            str = regularAutoTopupSettingsResponse.saveButtonText;
        }
        if ((i & 128) != 0) {
            str2 = regularAutoTopupSettingsResponse.turnOffButtonText;
        }
        if ((i & 256) != 0) {
            informationButtonDataDto = regularAutoTopupSettingsResponse.infoButton;
        }
        if ((i & 512) != 0) {
            turnOffNoticeDto = regularAutoTopupSettingsResponse.turnOffNotice;
        }
        InformationButtonDataDto informationButtonDataDto2 = informationButtonDataDto;
        TurnOffNoticeDto turnOffNoticeDto2 = turnOffNoticeDto;
        String str3 = str;
        String str4 = str2;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto2 = bindingPaymentInstructionsDto;
        ToolbarDataDto toolbarDataDto2 = toolbarDataDto;
        return regularAutoTopupSettingsResponse.copy(regularAutotopupDataDto, currentPaymentMethodDto, paymentMethodsListDto, list, bindingPaymentInstructionsDto2, toolbarDataDto2, str3, str4, informationButtonDataDto2, turnOffNoticeDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final RegularAutotopupDataDto getData() {
        return this.data;
    }

    /* renamed from: component10, reason: from getter */
    public final TurnOffNoticeDto getTurnOffNotice() {
        return this.turnOffNotice;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodsListDto getPaymentMethods() {
        return this.paymentMethods;
    }

    public final List<String> component4() {
        return this.boundPaymentMethodIds;
    }

    /* renamed from: component5, reason: from getter */
    public final BindingPaymentInstructionsDto getBindingPaymentInstructions() {
        return this.bindingPaymentInstructions;
    }

    /* renamed from: component6, reason: from getter */
    public final ToolbarDataDto getToolbar() {
        return this.toolbar;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTurnOffButtonText() {
        return this.turnOffButtonText;
    }

    /* renamed from: component9, reason: from getter */
    public final InformationButtonDataDto getInfoButton() {
        return this.infoButton;
    }

    public final RegularAutoTopupSettingsResponse copy(@Json(name = "data") RegularAutotopupDataDto data, @Json(name = "payment_method") CurrentPaymentMethodDto currentPaymentMethod, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethods, @Json(name = "bound_payment_method_ids") List<String> boundPaymentMethodIds, @Json(name = "binding_payment_instructions") BindingPaymentInstructionsDto bindingPaymentInstructions, @Json(name = "toolbar") ToolbarDataDto toolbar, @Json(name = "save_button_text") String saveButtonText, @Json(name = "turn_off_button_text") String turnOffButtonText, @Json(name = "information_button") InformationButtonDataDto infoButton, @Json(name = "turn_off_notice") TurnOffNoticeDto turnOffNotice) {
        return new RegularAutoTopupSettingsResponse(data, currentPaymentMethod, paymentMethods, boundPaymentMethodIds, bindingPaymentInstructions, toolbar, saveButtonText, turnOffButtonText, infoButton, turnOffNotice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegularAutoTopupSettingsResponse)) {
            return false;
        }
        RegularAutoTopupSettingsResponse regularAutoTopupSettingsResponse = (RegularAutoTopupSettingsResponse) other;
        return jl40.l(this.data, regularAutoTopupSettingsResponse.data) && jl40.l(this.currentPaymentMethod, regularAutoTopupSettingsResponse.currentPaymentMethod) && jl40.l(this.paymentMethods, regularAutoTopupSettingsResponse.paymentMethods) && jl40.l(this.boundPaymentMethodIds, regularAutoTopupSettingsResponse.boundPaymentMethodIds) && jl40.l(this.bindingPaymentInstructions, regularAutoTopupSettingsResponse.bindingPaymentInstructions) && jl40.l(this.toolbar, regularAutoTopupSettingsResponse.toolbar) && jl40.l(this.saveButtonText, regularAutoTopupSettingsResponse.saveButtonText) && jl40.l(this.turnOffButtonText, regularAutoTopupSettingsResponse.turnOffButtonText) && jl40.l(this.infoButton, regularAutoTopupSettingsResponse.infoButton) && jl40.l(this.turnOffNotice, regularAutoTopupSettingsResponse.turnOffNotice);
    }

    public final BindingPaymentInstructionsDto getBindingPaymentInstructions() {
        return this.bindingPaymentInstructions;
    }

    public final List<String> getBoundPaymentMethodIds() {
        return this.boundPaymentMethodIds;
    }

    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    public final RegularAutotopupDataDto getData() {
        return this.data;
    }

    public final InformationButtonDataDto getInfoButton() {
        return this.infoButton;
    }

    public final PaymentMethodsListDto getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    public final ToolbarDataDto getToolbar() {
        return this.toolbar;
    }

    public final String getTurnOffButtonText() {
        return this.turnOffButtonText;
    }

    public final TurnOffNoticeDto getTurnOffNotice() {
        return this.turnOffNotice;
    }

    public int hashCode() {
        int hashCode = this.data.hashCode() * 31;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        int hashCode2 = (this.paymentMethods.hashCode() + ((hashCode + (currentPaymentMethodDto == null ? 0 : currentPaymentMethodDto.hashCode())) * 31)) * 31;
        List<String> list = this.boundPaymentMethodIds;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = this.bindingPaymentInstructions;
        return this.turnOffNotice.hashCode() + ((this.infoButton.hashCode() + unr0.b(unr0.b((this.toolbar.hashCode() + ((hashCode3 + (bindingPaymentInstructionsDto != null ? bindingPaymentInstructionsDto.hashCode() : 0)) * 31)) * 31, 31, this.saveButtonText), 31, this.turnOffButtonText)) * 31);
    }

    public String toString() {
        RegularAutotopupDataDto regularAutotopupDataDto = this.data;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        PaymentMethodsListDto paymentMethodsListDto = this.paymentMethods;
        List<String> list = this.boundPaymentMethodIds;
        BindingPaymentInstructionsDto bindingPaymentInstructionsDto = this.bindingPaymentInstructions;
        ToolbarDataDto toolbarDataDto = this.toolbar;
        String str = this.saveButtonText;
        String str2 = this.turnOffButtonText;
        InformationButtonDataDto informationButtonDataDto = this.infoButton;
        TurnOffNoticeDto turnOffNoticeDto = this.turnOffNotice;
        StringBuilder sb = new StringBuilder("RegularAutoTopupSettingsResponse(data=");
        sb.append(regularAutotopupDataDto);
        sb.append(", currentPaymentMethod=");
        sb.append(currentPaymentMethodDto);
        sb.append(", paymentMethods=");
        sb.append(paymentMethodsListDto);
        sb.append(", boundPaymentMethodIds=");
        sb.append(list);
        sb.append(", bindingPaymentInstructions=");
        sb.append(bindingPaymentInstructionsDto);
        sb.append(", toolbar=");
        sb.append(toolbarDataDto);
        sb.append(", saveButtonText=");
        g8e.D(sb, str, ", turnOffButtonText=", str2, ", infoButton=");
        sb.append(informationButtonDataDto);
        sb.append(", turnOffNotice=");
        sb.append(turnOffNoticeDto);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
