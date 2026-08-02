package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.n;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesLegalTransferRequest;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "accountNumber", "bic", "beneficiaryName", "inn", "includeVat", "", "paymentPurpose", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAccountNumber", "getBic", "getBeneficiaryName", "getInn", "getIncludeVat", "()Z", "getPaymentPurpose", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesLegalTransferRequest {
    private final String accountNumber;
    private final String agreementId;
    private final String beneficiaryName;
    private final String bic;
    private final boolean includeVat;
    private final String inn;
    private final Money money;
    private final String paymentPurpose;

    public RequisitesLegalTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "account_number") String str2, @Json(name = "bic") String str3, @Json(name = "legal_name") String str4, @Json(name = "inn") String str5, @Json(name = "include_vat") boolean z, @Json(name = "payment_purpose") String str6) {
        this.agreementId = str;
        this.money = money;
        this.accountNumber = str2;
        this.bic = str3;
        this.beneficiaryName = str4;
        this.inn = str5;
        this.includeVat = z;
        this.paymentPurpose = str6;
    }

    public static /* synthetic */ RequisitesLegalTransferRequest copy$default(RequisitesLegalTransferRequest requisitesLegalTransferRequest, String str, Money money, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesLegalTransferRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = requisitesLegalTransferRequest.money;
        }
        if ((i & 4) != 0) {
            str2 = requisitesLegalTransferRequest.accountNumber;
        }
        if ((i & 8) != 0) {
            str3 = requisitesLegalTransferRequest.bic;
        }
        if ((i & 16) != 0) {
            str4 = requisitesLegalTransferRequest.beneficiaryName;
        }
        if ((i & 32) != 0) {
            str5 = requisitesLegalTransferRequest.inn;
        }
        if ((i & 64) != 0) {
            z = requisitesLegalTransferRequest.includeVat;
        }
        if ((i & 128) != 0) {
            str6 = requisitesLegalTransferRequest.paymentPurpose;
        }
        boolean z2 = z;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return requisitesLegalTransferRequest.copy(str, money, str2, str3, str8, str9, z2, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIncludeVat() {
        return this.includeVat;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final RequisitesLegalTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "account_number") String accountNumber, @Json(name = "bic") String bic, @Json(name = "legal_name") String beneficiaryName, @Json(name = "inn") String inn, @Json(name = "include_vat") boolean includeVat, @Json(name = "payment_purpose") String paymentPurpose) {
        return new RequisitesLegalTransferRequest(agreementId, money, accountNumber, bic, beneficiaryName, inn, includeVat, paymentPurpose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesLegalTransferRequest)) {
            return false;
        }
        RequisitesLegalTransferRequest requisitesLegalTransferRequest = (RequisitesLegalTransferRequest) other;
        return jl40.l(this.agreementId, requisitesLegalTransferRequest.agreementId) && jl40.l(this.money, requisitesLegalTransferRequest.money) && jl40.l(this.accountNumber, requisitesLegalTransferRequest.accountNumber) && jl40.l(this.bic, requisitesLegalTransferRequest.bic) && jl40.l(this.beneficiaryName, requisitesLegalTransferRequest.beneficiaryName) && jl40.l(this.inn, requisitesLegalTransferRequest.inn) && this.includeVat == requisitesLegalTransferRequest.includeVat && jl40.l(this.paymentPurpose, requisitesLegalTransferRequest.paymentPurpose);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getBic() {
        return this.bic;
    }

    public final boolean getIncludeVat() {
        return this.includeVat;
    }

    public final String getInn() {
        return this.inn;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.accountNumber), 31, this.bic), 31, this.beneficiaryName), 31, this.inn), 31, this.includeVat);
        String str = this.paymentPurpose;
        return e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.money;
        String str2 = this.accountNumber;
        String str3 = this.bic;
        String str4 = this.beneficiaryName;
        String str5 = this.inn;
        boolean z = this.includeVat;
        String str6 = this.paymentPurpose;
        StringBuilder sb = new StringBuilder("RequisitesLegalTransferRequest(agreementId=");
        sb.append(str);
        sb.append(", money=");
        sb.append(money);
        sb.append(", accountNumber=");
        g8e.D(sb, str2, ", bic=", str3, ", beneficiaryName=");
        g8e.D(sb, str4, ", inn=", str5, ", includeVat=");
        return n.m(", paymentPurpose=", str6, Extension.C_BRAKE, sb, z);
    }
}
