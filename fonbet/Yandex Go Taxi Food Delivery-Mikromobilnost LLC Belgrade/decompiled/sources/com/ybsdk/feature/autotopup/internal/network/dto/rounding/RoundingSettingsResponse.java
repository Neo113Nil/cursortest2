package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.InformationButtonDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.ToolbarDataDto;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.TurnOffNoticeDto;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003Jg\u0010-\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u000fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!¨\u00064"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsResponse;", "", Constants.KEY_DATA, "Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;", "infoButton", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "turnOffNotice", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "toolbar", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "currentPaymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "paymentMethods", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "saveButtonText", "", "turnOffButtonText", "title", "<init>", "(Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingSettingsData;", "getInfoButton", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/InformationButtonDataDto;", "getTurnOffNotice", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/TurnOffNoticeDto;", "getToolbar", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/ToolbarDataDto;", "getCurrentPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getPaymentMethods", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "getSaveButtonText", "()Ljava/lang/String;", "getTurnOffButtonText", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundingSettingsResponse {
    private final CurrentPaymentMethodDto currentPaymentMethod;
    private final RoundingSettingsData data;
    private final InformationButtonDataDto infoButton;
    private final PaymentMethodsListDto paymentMethods;
    private final String saveButtonText;
    private final String title;
    private final ToolbarDataDto toolbar;
    private final String turnOffButtonText;
    private final TurnOffNoticeDto turnOffNotice;

    public RoundingSettingsResponse(@Json(name = "data") RoundingSettingsData roundingSettingsData, @Json(name = "information_button") InformationButtonDataDto informationButtonDataDto, @Json(name = "turn_off_notice") TurnOffNoticeDto turnOffNoticeDto, @Json(name = "toolbar") ToolbarDataDto toolbarDataDto, @Json(name = "payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto, @Json(name = "save_button_text") String str, @Json(name = "turn_off_button_text") String str2, @Json(name = "title") String str3) {
        this.data = roundingSettingsData;
        this.infoButton = informationButtonDataDto;
        this.turnOffNotice = turnOffNoticeDto;
        this.toolbar = toolbarDataDto;
        this.currentPaymentMethod = currentPaymentMethodDto;
        this.paymentMethods = paymentMethodsListDto;
        this.saveButtonText = str;
        this.turnOffButtonText = str2;
        this.title = str3;
    }

    public static /* synthetic */ RoundingSettingsResponse copy$default(RoundingSettingsResponse roundingSettingsResponse, RoundingSettingsData roundingSettingsData, InformationButtonDataDto informationButtonDataDto, TurnOffNoticeDto turnOffNoticeDto, ToolbarDataDto toolbarDataDto, CurrentPaymentMethodDto currentPaymentMethodDto, PaymentMethodsListDto paymentMethodsListDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            roundingSettingsData = roundingSettingsResponse.data;
        }
        if ((i & 2) != 0) {
            informationButtonDataDto = roundingSettingsResponse.infoButton;
        }
        if ((i & 4) != 0) {
            turnOffNoticeDto = roundingSettingsResponse.turnOffNotice;
        }
        if ((i & 8) != 0) {
            toolbarDataDto = roundingSettingsResponse.toolbar;
        }
        if ((i & 16) != 0) {
            currentPaymentMethodDto = roundingSettingsResponse.currentPaymentMethod;
        }
        if ((i & 32) != 0) {
            paymentMethodsListDto = roundingSettingsResponse.paymentMethods;
        }
        if ((i & 64) != 0) {
            str = roundingSettingsResponse.saveButtonText;
        }
        if ((i & 128) != 0) {
            str2 = roundingSettingsResponse.turnOffButtonText;
        }
        if ((i & 256) != 0) {
            str3 = roundingSettingsResponse.title;
        }
        String str4 = str2;
        String str5 = str3;
        PaymentMethodsListDto paymentMethodsListDto2 = paymentMethodsListDto;
        String str6 = str;
        CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
        TurnOffNoticeDto turnOffNoticeDto2 = turnOffNoticeDto;
        return roundingSettingsResponse.copy(roundingSettingsData, informationButtonDataDto, turnOffNoticeDto2, toolbarDataDto, currentPaymentMethodDto2, paymentMethodsListDto2, str6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final RoundingSettingsData getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final InformationButtonDataDto getInfoButton() {
        return this.infoButton;
    }

    /* renamed from: component3, reason: from getter */
    public final TurnOffNoticeDto getTurnOffNotice() {
        return this.turnOffNotice;
    }

    /* renamed from: component4, reason: from getter */
    public final ToolbarDataDto getToolbar() {
        return this.toolbar;
    }

    /* renamed from: component5, reason: from getter */
    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    /* renamed from: component6, reason: from getter */
    public final PaymentMethodsListDto getPaymentMethods() {
        return this.paymentMethods;
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
    public final String getTitle() {
        return this.title;
    }

    public final RoundingSettingsResponse copy(@Json(name = "data") RoundingSettingsData data, @Json(name = "information_button") InformationButtonDataDto infoButton, @Json(name = "turn_off_notice") TurnOffNoticeDto turnOffNotice, @Json(name = "toolbar") ToolbarDataDto toolbar, @Json(name = "payment_method") CurrentPaymentMethodDto currentPaymentMethod, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethods, @Json(name = "save_button_text") String saveButtonText, @Json(name = "turn_off_button_text") String turnOffButtonText, @Json(name = "title") String title) {
        return new RoundingSettingsResponse(data, infoButton, turnOffNotice, toolbar, currentPaymentMethod, paymentMethods, saveButtonText, turnOffButtonText, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundingSettingsResponse)) {
            return false;
        }
        RoundingSettingsResponse roundingSettingsResponse = (RoundingSettingsResponse) other;
        return jl40.l(this.data, roundingSettingsResponse.data) && jl40.l(this.infoButton, roundingSettingsResponse.infoButton) && jl40.l(this.turnOffNotice, roundingSettingsResponse.turnOffNotice) && jl40.l(this.toolbar, roundingSettingsResponse.toolbar) && jl40.l(this.currentPaymentMethod, roundingSettingsResponse.currentPaymentMethod) && jl40.l(this.paymentMethods, roundingSettingsResponse.paymentMethods) && jl40.l(this.saveButtonText, roundingSettingsResponse.saveButtonText) && jl40.l(this.turnOffButtonText, roundingSettingsResponse.turnOffButtonText) && jl40.l(this.title, roundingSettingsResponse.title);
    }

    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    public final RoundingSettingsData getData() {
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

    public final String getTitle() {
        return this.title;
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
        InformationButtonDataDto informationButtonDataDto = this.infoButton;
        int hashCode2 = (this.toolbar.hashCode() + ((this.turnOffNotice.hashCode() + ((hashCode + (informationButtonDataDto == null ? 0 : informationButtonDataDto.hashCode())) * 31)) * 31)) * 31;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        return this.title.hashCode() + unr0.b(unr0.b((this.paymentMethods.hashCode() + ((hashCode2 + (currentPaymentMethodDto != null ? currentPaymentMethodDto.hashCode() : 0)) * 31)) * 31, 31, this.saveButtonText), 31, this.turnOffButtonText);
    }

    public String toString() {
        RoundingSettingsData roundingSettingsData = this.data;
        InformationButtonDataDto informationButtonDataDto = this.infoButton;
        TurnOffNoticeDto turnOffNoticeDto = this.turnOffNotice;
        ToolbarDataDto toolbarDataDto = this.toolbar;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        PaymentMethodsListDto paymentMethodsListDto = this.paymentMethods;
        String str = this.saveButtonText;
        String str2 = this.turnOffButtonText;
        String str3 = this.title;
        StringBuilder sb = new StringBuilder("RoundingSettingsResponse(data=");
        sb.append(roundingSettingsData);
        sb.append(", infoButton=");
        sb.append(informationButtonDataDto);
        sb.append(", turnOffNotice=");
        sb.append(turnOffNoticeDto);
        sb.append(", toolbar=");
        sb.append(toolbarDataDto);
        sb.append(", currentPaymentMethod=");
        sb.append(currentPaymentMethodDto);
        sb.append(", paymentMethods=");
        sb.append(paymentMethodsListDto);
        sb.append(", saveButtonText=");
        g8e.D(sb, str, ", turnOffButtonText=", str2, ", title=");
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }
}
