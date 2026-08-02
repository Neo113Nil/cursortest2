package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/InternetPaymentRequest;", "", "agreementId", "", "providerId", "accountNumber", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getAgreementId", "()Ljava/lang/String;", "getProviderId", "getAccountNumber", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetPaymentRequest {
    private final String accountNumber;
    private final String agreementId;
    private final Money money;
    private final String providerId;

    public InternetPaymentRequest(@Json(name = "agreement_id") String str, @Json(name = "provider_id") String str2, @Json(name = "account_number") String str3, @Json(name = "money") Money money) {
        this.agreementId = str;
        this.providerId = str2;
        this.accountNumber = str3;
        this.money = money;
    }

    public static /* synthetic */ InternetPaymentRequest copy$default(InternetPaymentRequest internetPaymentRequest, String str, String str2, String str3, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internetPaymentRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = internetPaymentRequest.providerId;
        }
        if ((i & 4) != 0) {
            str3 = internetPaymentRequest.accountNumber;
        }
        if ((i & 8) != 0) {
            money = internetPaymentRequest.money;
        }
        return internetPaymentRequest.copy(str, str2, str3, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final InternetPaymentRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "provider_id") String providerId, @Json(name = "account_number") String accountNumber, @Json(name = "money") Money money) {
        return new InternetPaymentRequest(agreementId, providerId, accountNumber, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetPaymentRequest)) {
            return false;
        }
        InternetPaymentRequest internetPaymentRequest = (InternetPaymentRequest) other;
        return jl40.l(this.agreementId, internetPaymentRequest.agreementId) && jl40.l(this.providerId, internetPaymentRequest.providerId) && jl40.l(this.accountNumber, internetPaymentRequest.accountNumber) && jl40.l(this.money, internetPaymentRequest.money);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getProviderId() {
        return this.providerId;
    }

    public int hashCode() {
        return this.money.hashCode() + unr0.b(unr0.b(this.agreementId.hashCode() * 31, 31, this.providerId), 31, this.accountNumber);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.providerId;
        String str3 = this.accountNumber;
        Money money = this.money;
        StringBuilder v = b64.v("InternetPaymentRequest(agreementId=", str, ", providerId=", str2, ", accountNumber=");
        v.append(str3);
        v.append(", money=");
        v.append(money);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
