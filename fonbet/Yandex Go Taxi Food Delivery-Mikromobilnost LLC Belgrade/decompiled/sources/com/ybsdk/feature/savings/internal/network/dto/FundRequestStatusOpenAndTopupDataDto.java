package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodsListDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jg\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u00062"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusOpenAndTopupDataDto;", "", "title", "", "subtitle", "currentPaymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "paymentMethodsList", "Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "limitsData", "Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenLimitsDataDto;", "bottomDivkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "saveButtonText", "agreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenLimitsDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCurrentPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getPaymentMethodsList", "()Lcom/ybsdk/core/common/data/network/dto/PaymentMethodsListDto;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getLimitsData", "()Lcom/ybsdk/feature/savings/internal/network/dto/FundOpenLimitsDataDto;", "getBottomDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getSaveButtonText", "getAgreementId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundRequestStatusOpenAndTopupDataDto {
    private final String agreementId;
    private final DivDataDto bottomDivkitWidget;
    private final CurrentPaymentMethodDto currentPaymentMethod;
    private final FundOpenLimitsDataDto limitsData;
    private final Money money;
    private final PaymentMethodsListDto paymentMethodsList;
    private final String saveButtonText;
    private final String subtitle;
    private final String title;

    public FundRequestStatusOpenAndTopupDataDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "current_payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsListDto, @Json(name = "money") Money money, @Json(name = "limits_data") FundOpenLimitsDataDto fundOpenLimitsDataDto, @Json(name = "bottom_divkit_widget") DivDataDto divDataDto, @Json(name = "save_button_text") String str3, @Json(name = "agreement_id") String str4) {
        this.title = str;
        this.subtitle = str2;
        this.currentPaymentMethod = currentPaymentMethodDto;
        this.paymentMethodsList = paymentMethodsListDto;
        this.money = money;
        this.limitsData = fundOpenLimitsDataDto;
        this.bottomDivkitWidget = divDataDto;
        this.saveButtonText = str3;
        this.agreementId = str4;
    }

    public static /* synthetic */ FundRequestStatusOpenAndTopupDataDto copy$default(FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto, String str, String str2, CurrentPaymentMethodDto currentPaymentMethodDto, PaymentMethodsListDto paymentMethodsListDto, Money money, FundOpenLimitsDataDto fundOpenLimitsDataDto, DivDataDto divDataDto, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundRequestStatusOpenAndTopupDataDto.title;
        }
        if ((i & 2) != 0) {
            str2 = fundRequestStatusOpenAndTopupDataDto.subtitle;
        }
        if ((i & 4) != 0) {
            currentPaymentMethodDto = fundRequestStatusOpenAndTopupDataDto.currentPaymentMethod;
        }
        if ((i & 8) != 0) {
            paymentMethodsListDto = fundRequestStatusOpenAndTopupDataDto.paymentMethodsList;
        }
        if ((i & 16) != 0) {
            money = fundRequestStatusOpenAndTopupDataDto.money;
        }
        if ((i & 32) != 0) {
            fundOpenLimitsDataDto = fundRequestStatusOpenAndTopupDataDto.limitsData;
        }
        if ((i & 64) != 0) {
            divDataDto = fundRequestStatusOpenAndTopupDataDto.bottomDivkitWidget;
        }
        if ((i & 128) != 0) {
            str3 = fundRequestStatusOpenAndTopupDataDto.saveButtonText;
        }
        if ((i & 256) != 0) {
            str4 = fundRequestStatusOpenAndTopupDataDto.agreementId;
        }
        String str5 = str3;
        String str6 = str4;
        FundOpenLimitsDataDto fundOpenLimitsDataDto2 = fundOpenLimitsDataDto;
        DivDataDto divDataDto2 = divDataDto;
        Money money2 = money;
        CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
        return fundRequestStatusOpenAndTopupDataDto.copy(str, str2, currentPaymentMethodDto2, paymentMethodsListDto, money2, fundOpenLimitsDataDto2, divDataDto2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    /* renamed from: component4, reason: from getter */
    public final PaymentMethodsListDto getPaymentMethodsList() {
        return this.paymentMethodsList;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component6, reason: from getter */
    public final FundOpenLimitsDataDto getLimitsData() {
        return this.limitsData;
    }

    /* renamed from: component7, reason: from getter */
    public final DivDataDto getBottomDivkitWidget() {
        return this.bottomDivkitWidget;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final FundRequestStatusOpenAndTopupDataDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "current_payment_method") CurrentPaymentMethodDto currentPaymentMethod, @Json(name = "payment_methods_list") PaymentMethodsListDto paymentMethodsList, @Json(name = "money") Money money, @Json(name = "limits_data") FundOpenLimitsDataDto limitsData, @Json(name = "bottom_divkit_widget") DivDataDto bottomDivkitWidget, @Json(name = "save_button_text") String saveButtonText, @Json(name = "agreement_id") String agreementId) {
        return new FundRequestStatusOpenAndTopupDataDto(title, subtitle, currentPaymentMethod, paymentMethodsList, money, limitsData, bottomDivkitWidget, saveButtonText, agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundRequestStatusOpenAndTopupDataDto)) {
            return false;
        }
        FundRequestStatusOpenAndTopupDataDto fundRequestStatusOpenAndTopupDataDto = (FundRequestStatusOpenAndTopupDataDto) other;
        return jl40.l(this.title, fundRequestStatusOpenAndTopupDataDto.title) && jl40.l(this.subtitle, fundRequestStatusOpenAndTopupDataDto.subtitle) && jl40.l(this.currentPaymentMethod, fundRequestStatusOpenAndTopupDataDto.currentPaymentMethod) && jl40.l(this.paymentMethodsList, fundRequestStatusOpenAndTopupDataDto.paymentMethodsList) && jl40.l(this.money, fundRequestStatusOpenAndTopupDataDto.money) && jl40.l(this.limitsData, fundRequestStatusOpenAndTopupDataDto.limitsData) && jl40.l(this.bottomDivkitWidget, fundRequestStatusOpenAndTopupDataDto.bottomDivkitWidget) && jl40.l(this.saveButtonText, fundRequestStatusOpenAndTopupDataDto.saveButtonText) && jl40.l(this.agreementId, fundRequestStatusOpenAndTopupDataDto.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final DivDataDto getBottomDivkitWidget() {
        return this.bottomDivkitWidget;
    }

    public final CurrentPaymentMethodDto getCurrentPaymentMethod() {
        return this.currentPaymentMethod;
    }

    public final FundOpenLimitsDataDto getLimitsData() {
        return this.limitsData;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final PaymentMethodsListDto getPaymentMethodsList() {
        return this.paymentMethodsList;
    }

    public final String getSaveButtonText() {
        return this.saveButtonText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b(this.title.hashCode() * 31, 31, this.subtitle);
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        int hashCode = (this.paymentMethodsList.hashCode() + ((b + (currentPaymentMethodDto == null ? 0 : currentPaymentMethodDto.hashCode())) * 31)) * 31;
        Money money = this.money;
        return this.agreementId.hashCode() + unr0.b((this.bottomDivkitWidget.hashCode() + ((this.limitsData.hashCode() + ((hashCode + (money != null ? money.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.saveButtonText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.currentPaymentMethod;
        PaymentMethodsListDto paymentMethodsListDto = this.paymentMethodsList;
        Money money = this.money;
        FundOpenLimitsDataDto fundOpenLimitsDataDto = this.limitsData;
        DivDataDto divDataDto = this.bottomDivkitWidget;
        String str3 = this.saveButtonText;
        String str4 = this.agreementId;
        StringBuilder v = b64.v("FundRequestStatusOpenAndTopupDataDto(title=", str, ", subtitle=", str2, ", currentPaymentMethod=");
        v.append(currentPaymentMethodDto);
        v.append(", paymentMethodsList=");
        v.append(paymentMethodsListDto);
        v.append(", money=");
        v.append(money);
        v.append(", limitsData=");
        v.append(fundOpenLimitsDataDto);
        v.append(", bottomDivkitWidget=");
        v.append(divDataDto);
        v.append(", saveButtonText=");
        v.append(str3);
        v.append(", agreementId=");
        return oyr.t(v, str4, Extension.C_BRAKE);
    }
}
