package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/RequisitesHcsTransferRequest;", "", "agreementId", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "accountNumber", "bic", "legalName", "inn", "includeVat", "", "paymentPurpose", "hcsPersonalAccount", "paymentPeriod", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getAccountNumber", "getBic", "getLegalName", "getInn", "getIncludeVat", "()Z", "getPaymentPurpose", "getHcsPersonalAccount", "getPaymentPeriod", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesHcsTransferRequest {
    private final String accountNumber;
    private final String agreementId;
    private final String bic;
    private final String hcsPersonalAccount;
    private final boolean includeVat;
    private final String inn;
    private final String legalName;
    private final Money money;
    private final String paymentPeriod;
    private final String paymentPurpose;

    public RequisitesHcsTransferRequest(@Json(name = "agreement_id") String str, @Json(name = "money") Money money, @Json(name = "account_number") String str2, @Json(name = "bic") String str3, @Json(name = "legal_name") String str4, @Json(name = "inn") String str5, @Json(name = "include_vat") boolean z, @Json(name = "payment_purpose") String str6, @Json(name = "hcs_personal_account") String str7, @Json(name = "payment_period") String str8) {
        this.agreementId = str;
        this.money = money;
        this.accountNumber = str2;
        this.bic = str3;
        this.legalName = str4;
        this.inn = str5;
        this.includeVat = z;
        this.paymentPurpose = str6;
        this.hcsPersonalAccount = str7;
        this.paymentPeriod = str8;
    }

    public static /* synthetic */ RequisitesHcsTransferRequest copy$default(RequisitesHcsTransferRequest requisitesHcsTransferRequest, String str, Money money, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesHcsTransferRequest.agreementId;
        }
        if ((i & 2) != 0) {
            money = requisitesHcsTransferRequest.money;
        }
        if ((i & 4) != 0) {
            str2 = requisitesHcsTransferRequest.accountNumber;
        }
        if ((i & 8) != 0) {
            str3 = requisitesHcsTransferRequest.bic;
        }
        if ((i & 16) != 0) {
            str4 = requisitesHcsTransferRequest.legalName;
        }
        if ((i & 32) != 0) {
            str5 = requisitesHcsTransferRequest.inn;
        }
        if ((i & 64) != 0) {
            z = requisitesHcsTransferRequest.includeVat;
        }
        if ((i & 128) != 0) {
            str6 = requisitesHcsTransferRequest.paymentPurpose;
        }
        if ((i & 256) != 0) {
            str7 = requisitesHcsTransferRequest.hcsPersonalAccount;
        }
        if ((i & 512) != 0) {
            str8 = requisitesHcsTransferRequest.paymentPeriod;
        }
        String str9 = str7;
        String str10 = str8;
        boolean z2 = z;
        String str11 = str6;
        String str12 = str4;
        String str13 = str5;
        return requisitesHcsTransferRequest.copy(str, money, str2, str3, str12, str13, z2, str11, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPaymentPeriod() {
        return this.paymentPeriod;
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
    public final String getLegalName() {
        return this.legalName;
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

    /* renamed from: component9, reason: from getter */
    public final String getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    public final RequisitesHcsTransferRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "account_number") String accountNumber, @Json(name = "bic") String bic, @Json(name = "legal_name") String legalName, @Json(name = "inn") String inn, @Json(name = "include_vat") boolean includeVat, @Json(name = "payment_purpose") String paymentPurpose, @Json(name = "hcs_personal_account") String hcsPersonalAccount, @Json(name = "payment_period") String paymentPeriod) {
        return new RequisitesHcsTransferRequest(agreementId, money, accountNumber, bic, legalName, inn, includeVat, paymentPurpose, hcsPersonalAccount, paymentPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesHcsTransferRequest)) {
            return false;
        }
        RequisitesHcsTransferRequest requisitesHcsTransferRequest = (RequisitesHcsTransferRequest) other;
        return jl40.l(this.agreementId, requisitesHcsTransferRequest.agreementId) && jl40.l(this.money, requisitesHcsTransferRequest.money) && jl40.l(this.accountNumber, requisitesHcsTransferRequest.accountNumber) && jl40.l(this.bic, requisitesHcsTransferRequest.bic) && jl40.l(this.legalName, requisitesHcsTransferRequest.legalName) && jl40.l(this.inn, requisitesHcsTransferRequest.inn) && this.includeVat == requisitesHcsTransferRequest.includeVat && jl40.l(this.paymentPurpose, requisitesHcsTransferRequest.paymentPurpose) && jl40.l(this.hcsPersonalAccount, requisitesHcsTransferRequest.hcsPersonalAccount) && jl40.l(this.paymentPeriod, requisitesHcsTransferRequest.paymentPeriod);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getBic() {
        return this.bic;
    }

    public final String getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    public final boolean getIncludeVat() {
        return this.includeVat;
    }

    public final String getInn() {
        return this.inn;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPeriod.hashCode() + unr0.b(unr0.b(unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(tse0.c(this.money, this.agreementId.hashCode() * 31, 31), 31, this.accountNumber), 31, this.bic), 31, this.legalName), 31, this.inn), 31, this.includeVat), 31, this.paymentPurpose), 31, this.hcsPersonalAccount);
    }

    public String toString() {
        String str = this.agreementId;
        Money money = this.money;
        String str2 = this.accountNumber;
        String str3 = this.bic;
        String str4 = this.legalName;
        String str5 = this.inn;
        boolean z = this.includeVat;
        String str6 = this.paymentPurpose;
        String str7 = this.hcsPersonalAccount;
        String str8 = this.paymentPeriod;
        StringBuilder sb = new StringBuilder("RequisitesHcsTransferRequest(agreementId=");
        sb.append(str);
        sb.append(", money=");
        sb.append(money);
        sb.append(", accountNumber=");
        g8e.D(sb, str2, ", bic=", str3, ", legalName=");
        g8e.D(sb, str4, ", inn=", str5, ", includeVat=");
        unr0.A(", paymentPurpose=", str6, ", hcsPersonalAccount=", sb, z);
        return g8e.r(sb, str7, ", paymentPeriod=", str8, Extension.C_BRAKE);
    }
}
