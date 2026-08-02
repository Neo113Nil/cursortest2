package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupType;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/CreateAutoTopupRequest;", "", "type", "Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "agreementId", "", "paymentMethodInfo", "Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "threshold", "<init>", "(Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getType", "()Lcom/ybsdk/feature/autotopup/api/dto/AutoTopupType;", "getAgreementId", "()Ljava/lang/String;", "getPaymentMethodInfo", "()Lcom/ybsdk/feature/autotopup/api/dto/PaymentMethodInfoDto;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getThreshold", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateAutoTopupRequest {
    private final String agreementId;
    private final Money money;
    private final PaymentMethodInfoDto paymentMethodInfo;
    private final Money threshold;
    private final AutoTopupType type;

    public CreateAutoTopupRequest(@Json(name = "type") AutoTopupType autoTopupType, @Json(name = "agreement_id") String str, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfoDto, @Json(name = "money") Money money, @Json(name = "threshold") Money money2) {
        this.type = autoTopupType;
        this.agreementId = str;
        this.paymentMethodInfo = paymentMethodInfoDto;
        this.money = money;
        this.threshold = money2;
    }

    public static /* synthetic */ CreateAutoTopupRequest copy$default(CreateAutoTopupRequest createAutoTopupRequest, AutoTopupType autoTopupType, String str, PaymentMethodInfoDto paymentMethodInfoDto, Money money, Money money2, int i, Object obj) {
        if ((i & 1) != 0) {
            autoTopupType = createAutoTopupRequest.type;
        }
        if ((i & 2) != 0) {
            str = createAutoTopupRequest.agreementId;
        }
        if ((i & 4) != 0) {
            paymentMethodInfoDto = createAutoTopupRequest.paymentMethodInfo;
        }
        if ((i & 8) != 0) {
            money = createAutoTopupRequest.money;
        }
        if ((i & 16) != 0) {
            money2 = createAutoTopupRequest.threshold;
        }
        Money money3 = money2;
        PaymentMethodInfoDto paymentMethodInfoDto2 = paymentMethodInfoDto;
        return createAutoTopupRequest.copy(autoTopupType, str, paymentMethodInfoDto2, money, money3);
    }

    /* renamed from: component1, reason: from getter */
    public final AutoTopupType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component5, reason: from getter */
    public final Money getThreshold() {
        return this.threshold;
    }

    public final CreateAutoTopupRequest copy(@Json(name = "type") AutoTopupType type, @Json(name = "agreement_id") String agreementId, @Json(name = "payment_method_info") PaymentMethodInfoDto paymentMethodInfo, @Json(name = "money") Money money, @Json(name = "threshold") Money threshold) {
        return new CreateAutoTopupRequest(type, agreementId, paymentMethodInfo, money, threshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAutoTopupRequest)) {
            return false;
        }
        CreateAutoTopupRequest createAutoTopupRequest = (CreateAutoTopupRequest) other;
        return this.type == createAutoTopupRequest.type && jl40.l(this.agreementId, createAutoTopupRequest.agreementId) && jl40.l(this.paymentMethodInfo, createAutoTopupRequest.paymentMethodInfo) && jl40.l(this.money, createAutoTopupRequest.money) && jl40.l(this.threshold, createAutoTopupRequest.threshold);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final PaymentMethodInfoDto getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public final Money getThreshold() {
        return this.threshold;
    }

    public final AutoTopupType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.paymentMethodInfo.hashCode() + unr0.b(this.type.hashCode() * 31, 31, this.agreementId)) * 31;
        Money money = this.money;
        int hashCode2 = (hashCode + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.threshold;
        return hashCode2 + (money2 != null ? money2.hashCode() : 0);
    }

    public String toString() {
        return "CreateAutoTopupRequest(type=" + this.type + ", agreementId=" + this.agreementId + ", paymentMethodInfo=" + this.paymentMethodInfo + ", money=" + this.money + ", threshold=" + this.threshold + Extension.C_BRAKE;
    }
}
