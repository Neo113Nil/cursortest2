package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalTransferFieldsDto;", "", "accountNumber", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "bic", "legalName", "inn", "paymentPurpose", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;)V", "getAccountNumber", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "getBic", "getLegalName", "getInn", "getPaymentPurpose", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesLegalTransferFieldsDto {
    private final RequisiteFieldValidatorDto accountNumber;
    private final RequisiteFieldValidatorDto bic;
    private final RequisiteFieldValidatorDto inn;
    private final RequisiteFieldValidatorDto legalName;
    private final RequisiteFieldValidatorDto paymentPurpose;

    public RequisitesLegalTransferFieldsDto(@Json(name = "account_number") RequisiteFieldValidatorDto requisiteFieldValidatorDto, @Json(name = "bic") RequisiteFieldValidatorDto requisiteFieldValidatorDto2, @Json(name = "legal_name") RequisiteFieldValidatorDto requisiteFieldValidatorDto3, @Json(name = "inn") RequisiteFieldValidatorDto requisiteFieldValidatorDto4, @Json(name = "payment_purpose") RequisiteFieldValidatorDto requisiteFieldValidatorDto5) {
        this.accountNumber = requisiteFieldValidatorDto;
        this.bic = requisiteFieldValidatorDto2;
        this.legalName = requisiteFieldValidatorDto3;
        this.inn = requisiteFieldValidatorDto4;
        this.paymentPurpose = requisiteFieldValidatorDto5;
    }

    public static /* synthetic */ RequisitesLegalTransferFieldsDto copy$default(RequisitesLegalTransferFieldsDto requisitesLegalTransferFieldsDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto2, RequisiteFieldValidatorDto requisiteFieldValidatorDto3, RequisiteFieldValidatorDto requisiteFieldValidatorDto4, RequisiteFieldValidatorDto requisiteFieldValidatorDto5, int i, Object obj) {
        if ((i & 1) != 0) {
            requisiteFieldValidatorDto = requisitesLegalTransferFieldsDto.accountNumber;
        }
        if ((i & 2) != 0) {
            requisiteFieldValidatorDto2 = requisitesLegalTransferFieldsDto.bic;
        }
        if ((i & 4) != 0) {
            requisiteFieldValidatorDto3 = requisitesLegalTransferFieldsDto.legalName;
        }
        if ((i & 8) != 0) {
            requisiteFieldValidatorDto4 = requisitesLegalTransferFieldsDto.inn;
        }
        if ((i & 16) != 0) {
            requisiteFieldValidatorDto5 = requisitesLegalTransferFieldsDto.paymentPurpose;
        }
        RequisiteFieldValidatorDto requisiteFieldValidatorDto6 = requisiteFieldValidatorDto5;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto7 = requisiteFieldValidatorDto3;
        return requisitesLegalTransferFieldsDto.copy(requisiteFieldValidatorDto, requisiteFieldValidatorDto2, requisiteFieldValidatorDto7, requisiteFieldValidatorDto4, requisiteFieldValidatorDto6);
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

    public final RequisitesLegalTransferFieldsDto copy(@Json(name = "account_number") RequisiteFieldValidatorDto accountNumber, @Json(name = "bic") RequisiteFieldValidatorDto bic, @Json(name = "legal_name") RequisiteFieldValidatorDto legalName, @Json(name = "inn") RequisiteFieldValidatorDto inn, @Json(name = "payment_purpose") RequisiteFieldValidatorDto paymentPurpose) {
        return new RequisitesLegalTransferFieldsDto(accountNumber, bic, legalName, inn, paymentPurpose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesLegalTransferFieldsDto)) {
            return false;
        }
        RequisitesLegalTransferFieldsDto requisitesLegalTransferFieldsDto = (RequisitesLegalTransferFieldsDto) other;
        return jl40.l(this.accountNumber, requisitesLegalTransferFieldsDto.accountNumber) && jl40.l(this.bic, requisitesLegalTransferFieldsDto.bic) && jl40.l(this.legalName, requisitesLegalTransferFieldsDto.legalName) && jl40.l(this.inn, requisitesLegalTransferFieldsDto.inn) && jl40.l(this.paymentPurpose, requisitesLegalTransferFieldsDto.paymentPurpose);
    }

    public final RequisiteFieldValidatorDto getAccountNumber() {
        return this.accountNumber;
    }

    public final RequisiteFieldValidatorDto getBic() {
        return this.bic;
    }

    public final RequisiteFieldValidatorDto getInn() {
        return this.inn;
    }

    public final RequisiteFieldValidatorDto getLegalName() {
        return this.legalName;
    }

    public final RequisiteFieldValidatorDto getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPurpose.hashCode() + ((this.inn.hashCode() + ((this.legalName.hashCode() + ((this.bic.hashCode() + (this.accountNumber.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequisitesLegalTransferFieldsDto(accountNumber=" + this.accountNumber + ", bic=" + this.bic + ", legalName=" + this.legalName + ", inn=" + this.inn + ", paymentPurpose=" + this.paymentPurpose + Extension.C_BRAKE;
    }
}
