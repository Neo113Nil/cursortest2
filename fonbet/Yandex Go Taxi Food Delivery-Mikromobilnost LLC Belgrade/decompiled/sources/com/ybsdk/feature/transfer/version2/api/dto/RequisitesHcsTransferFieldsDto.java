package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006#"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsTransferFieldsDto;", "", "accountNumber", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "bic", "legalName", "inn", "paymentPurpose", "hcsPersonalAccount", "paymentPeriod", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;)V", "getAccountNumber", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "getBic", "getLegalName", "getInn", "getPaymentPurpose", "getHcsPersonalAccount", "getPaymentPeriod", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesHcsTransferFieldsDto {
    private final RequisiteFieldValidatorDto accountNumber;
    private final RequisiteFieldValidatorDto bic;
    private final RequisiteFieldValidatorDto hcsPersonalAccount;
    private final RequisiteFieldValidatorDto inn;
    private final RequisiteFieldValidatorDto legalName;
    private final RequisiteFieldValidatorDto paymentPeriod;
    private final RequisiteFieldValidatorDto paymentPurpose;

    public RequisitesHcsTransferFieldsDto(@Json(name = "account_number") RequisiteFieldValidatorDto requisiteFieldValidatorDto, @Json(name = "bic") RequisiteFieldValidatorDto requisiteFieldValidatorDto2, @Json(name = "legal_name") RequisiteFieldValidatorDto requisiteFieldValidatorDto3, @Json(name = "inn") RequisiteFieldValidatorDto requisiteFieldValidatorDto4, @Json(name = "payment_purpose") RequisiteFieldValidatorDto requisiteFieldValidatorDto5, @Json(name = "hcs_personal_account") RequisiteFieldValidatorDto requisiteFieldValidatorDto6, @Json(name = "payment_period") RequisiteFieldValidatorDto requisiteFieldValidatorDto7) {
        this.accountNumber = requisiteFieldValidatorDto;
        this.bic = requisiteFieldValidatorDto2;
        this.legalName = requisiteFieldValidatorDto3;
        this.inn = requisiteFieldValidatorDto4;
        this.paymentPurpose = requisiteFieldValidatorDto5;
        this.hcsPersonalAccount = requisiteFieldValidatorDto6;
        this.paymentPeriod = requisiteFieldValidatorDto7;
    }

    public static /* synthetic */ RequisitesHcsTransferFieldsDto copy$default(RequisitesHcsTransferFieldsDto requisitesHcsTransferFieldsDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto2, RequisiteFieldValidatorDto requisiteFieldValidatorDto3, RequisiteFieldValidatorDto requisiteFieldValidatorDto4, RequisiteFieldValidatorDto requisiteFieldValidatorDto5, RequisiteFieldValidatorDto requisiteFieldValidatorDto6, RequisiteFieldValidatorDto requisiteFieldValidatorDto7, int i, Object obj) {
        if ((i & 1) != 0) {
            requisiteFieldValidatorDto = requisitesHcsTransferFieldsDto.accountNumber;
        }
        if ((i & 2) != 0) {
            requisiteFieldValidatorDto2 = requisitesHcsTransferFieldsDto.bic;
        }
        if ((i & 4) != 0) {
            requisiteFieldValidatorDto3 = requisitesHcsTransferFieldsDto.legalName;
        }
        if ((i & 8) != 0) {
            requisiteFieldValidatorDto4 = requisitesHcsTransferFieldsDto.inn;
        }
        if ((i & 16) != 0) {
            requisiteFieldValidatorDto5 = requisitesHcsTransferFieldsDto.paymentPurpose;
        }
        if ((i & 32) != 0) {
            requisiteFieldValidatorDto6 = requisitesHcsTransferFieldsDto.hcsPersonalAccount;
        }
        if ((i & 64) != 0) {
            requisiteFieldValidatorDto7 = requisitesHcsTransferFieldsDto.paymentPeriod;
        }
        RequisiteFieldValidatorDto requisiteFieldValidatorDto8 = requisiteFieldValidatorDto6;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto9 = requisiteFieldValidatorDto7;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto10 = requisiteFieldValidatorDto5;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto11 = requisiteFieldValidatorDto3;
        return requisitesHcsTransferFieldsDto.copy(requisiteFieldValidatorDto, requisiteFieldValidatorDto2, requisiteFieldValidatorDto11, requisiteFieldValidatorDto4, requisiteFieldValidatorDto10, requisiteFieldValidatorDto8, requisiteFieldValidatorDto9);
    }

    /* renamed from: component1, reason: from getter */
    public final RequisiteFieldValidatorDto getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final RequisiteFieldValidatorDto getBic() {
        return this.bic;
    }

    /* renamed from: component3, reason: from getter */
    public final RequisiteFieldValidatorDto getLegalName() {
        return this.legalName;
    }

    /* renamed from: component4, reason: from getter */
    public final RequisiteFieldValidatorDto getInn() {
        return this.inn;
    }

    /* renamed from: component5, reason: from getter */
    public final RequisiteFieldValidatorDto getPaymentPurpose() {
        return this.paymentPurpose;
    }

    /* renamed from: component6, reason: from getter */
    public final RequisiteFieldValidatorDto getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    /* renamed from: component7, reason: from getter */
    public final RequisiteFieldValidatorDto getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final RequisitesHcsTransferFieldsDto copy(@Json(name = "account_number") RequisiteFieldValidatorDto accountNumber, @Json(name = "bic") RequisiteFieldValidatorDto bic, @Json(name = "legal_name") RequisiteFieldValidatorDto legalName, @Json(name = "inn") RequisiteFieldValidatorDto inn, @Json(name = "payment_purpose") RequisiteFieldValidatorDto paymentPurpose, @Json(name = "hcs_personal_account") RequisiteFieldValidatorDto hcsPersonalAccount, @Json(name = "payment_period") RequisiteFieldValidatorDto paymentPeriod) {
        return new RequisitesHcsTransferFieldsDto(accountNumber, bic, legalName, inn, paymentPurpose, hcsPersonalAccount, paymentPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesHcsTransferFieldsDto)) {
            return false;
        }
        RequisitesHcsTransferFieldsDto requisitesHcsTransferFieldsDto = (RequisitesHcsTransferFieldsDto) other;
        return jl40.l(this.accountNumber, requisitesHcsTransferFieldsDto.accountNumber) && jl40.l(this.bic, requisitesHcsTransferFieldsDto.bic) && jl40.l(this.legalName, requisitesHcsTransferFieldsDto.legalName) && jl40.l(this.inn, requisitesHcsTransferFieldsDto.inn) && jl40.l(this.paymentPurpose, requisitesHcsTransferFieldsDto.paymentPurpose) && jl40.l(this.hcsPersonalAccount, requisitesHcsTransferFieldsDto.hcsPersonalAccount) && jl40.l(this.paymentPeriod, requisitesHcsTransferFieldsDto.paymentPeriod);
    }

    public final RequisiteFieldValidatorDto getAccountNumber() {
        return this.accountNumber;
    }

    public final RequisiteFieldValidatorDto getBic() {
        return this.bic;
    }

    public final RequisiteFieldValidatorDto getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    public final RequisiteFieldValidatorDto getInn() {
        return this.inn;
    }

    public final RequisiteFieldValidatorDto getLegalName() {
        return this.legalName;
    }

    public final RequisiteFieldValidatorDto getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final RequisiteFieldValidatorDto getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPeriod.hashCode() + ((this.hcsPersonalAccount.hashCode() + ((this.paymentPurpose.hashCode() + ((this.inn.hashCode() + ((this.legalName.hashCode() + ((this.bic.hashCode() + (this.accountNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequisitesHcsTransferFieldsDto(accountNumber=" + this.accountNumber + ", bic=" + this.bic + ", legalName=" + this.legalName + ", inn=" + this.inn + ", paymentPurpose=" + this.paymentPurpose + ", hcsPersonalAccount=" + this.hcsPersonalAccount + ", paymentPeriod=" + this.paymentPeriod + Extension.C_BRAKE;
    }
}
