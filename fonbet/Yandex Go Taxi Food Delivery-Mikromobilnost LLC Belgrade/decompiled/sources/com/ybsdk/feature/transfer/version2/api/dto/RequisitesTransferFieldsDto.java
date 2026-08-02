package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesTransferFieldsDto;", "", "accountNumber", "Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "bic", "firstName", "lastName", "middleName", "paymentPurpose", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;)V", "getAccountNumber", "()Lcom/ybsdk/feature/transfer/version2/api/dto/RequisiteFieldValidatorDto;", "getBic", "getFirstName", "getLastName", "getMiddleName", "getPaymentPurpose", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesTransferFieldsDto {
    private final RequisiteFieldValidatorDto accountNumber;
    private final RequisiteFieldValidatorDto bic;
    private final RequisiteFieldValidatorDto firstName;
    private final RequisiteFieldValidatorDto lastName;
    private final RequisiteFieldValidatorDto middleName;
    private final RequisiteFieldValidatorDto paymentPurpose;

    public RequisitesTransferFieldsDto(@Json(name = "account_number") RequisiteFieldValidatorDto requisiteFieldValidatorDto, @Json(name = "bic") RequisiteFieldValidatorDto requisiteFieldValidatorDto2, @Json(name = "first_name") RequisiteFieldValidatorDto requisiteFieldValidatorDto3, @Json(name = "last_name") RequisiteFieldValidatorDto requisiteFieldValidatorDto4, @Json(name = "middle_name") RequisiteFieldValidatorDto requisiteFieldValidatorDto5, @Json(name = "payment_purpose") RequisiteFieldValidatorDto requisiteFieldValidatorDto6) {
        this.accountNumber = requisiteFieldValidatorDto;
        this.bic = requisiteFieldValidatorDto2;
        this.firstName = requisiteFieldValidatorDto3;
        this.lastName = requisiteFieldValidatorDto4;
        this.middleName = requisiteFieldValidatorDto5;
        this.paymentPurpose = requisiteFieldValidatorDto6;
    }

    public static /* synthetic */ RequisitesTransferFieldsDto copy$default(RequisitesTransferFieldsDto requisitesTransferFieldsDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto, RequisiteFieldValidatorDto requisiteFieldValidatorDto2, RequisiteFieldValidatorDto requisiteFieldValidatorDto3, RequisiteFieldValidatorDto requisiteFieldValidatorDto4, RequisiteFieldValidatorDto requisiteFieldValidatorDto5, RequisiteFieldValidatorDto requisiteFieldValidatorDto6, int i, Object obj) {
        if ((i & 1) != 0) {
            requisiteFieldValidatorDto = requisitesTransferFieldsDto.accountNumber;
        }
        if ((i & 2) != 0) {
            requisiteFieldValidatorDto2 = requisitesTransferFieldsDto.bic;
        }
        if ((i & 4) != 0) {
            requisiteFieldValidatorDto3 = requisitesTransferFieldsDto.firstName;
        }
        if ((i & 8) != 0) {
            requisiteFieldValidatorDto4 = requisitesTransferFieldsDto.lastName;
        }
        if ((i & 16) != 0) {
            requisiteFieldValidatorDto5 = requisitesTransferFieldsDto.middleName;
        }
        if ((i & 32) != 0) {
            requisiteFieldValidatorDto6 = requisitesTransferFieldsDto.paymentPurpose;
        }
        RequisiteFieldValidatorDto requisiteFieldValidatorDto7 = requisiteFieldValidatorDto5;
        RequisiteFieldValidatorDto requisiteFieldValidatorDto8 = requisiteFieldValidatorDto6;
        return requisitesTransferFieldsDto.copy(requisiteFieldValidatorDto, requisiteFieldValidatorDto2, requisiteFieldValidatorDto3, requisiteFieldValidatorDto4, requisiteFieldValidatorDto7, requisiteFieldValidatorDto8);
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
    public final RequisiteFieldValidatorDto getFirstName() {
        return this.firstName;
    }

    /* renamed from: component4, reason: from getter */
    public final RequisiteFieldValidatorDto getLastName() {
        return this.lastName;
    }

    /* renamed from: component5, reason: from getter */
    public final RequisiteFieldValidatorDto getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component6, reason: from getter */
    public final RequisiteFieldValidatorDto getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final RequisitesTransferFieldsDto copy(@Json(name = "account_number") RequisiteFieldValidatorDto accountNumber, @Json(name = "bic") RequisiteFieldValidatorDto bic, @Json(name = "first_name") RequisiteFieldValidatorDto firstName, @Json(name = "last_name") RequisiteFieldValidatorDto lastName, @Json(name = "middle_name") RequisiteFieldValidatorDto middleName, @Json(name = "payment_purpose") RequisiteFieldValidatorDto paymentPurpose) {
        return new RequisitesTransferFieldsDto(accountNumber, bic, firstName, lastName, middleName, paymentPurpose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesTransferFieldsDto)) {
            return false;
        }
        RequisitesTransferFieldsDto requisitesTransferFieldsDto = (RequisitesTransferFieldsDto) other;
        return jl40.l(this.accountNumber, requisitesTransferFieldsDto.accountNumber) && jl40.l(this.bic, requisitesTransferFieldsDto.bic) && jl40.l(this.firstName, requisitesTransferFieldsDto.firstName) && jl40.l(this.lastName, requisitesTransferFieldsDto.lastName) && jl40.l(this.middleName, requisitesTransferFieldsDto.middleName) && jl40.l(this.paymentPurpose, requisitesTransferFieldsDto.paymentPurpose);
    }

    public final RequisiteFieldValidatorDto getAccountNumber() {
        return this.accountNumber;
    }

    public final RequisiteFieldValidatorDto getBic() {
        return this.bic;
    }

    public final RequisiteFieldValidatorDto getFirstName() {
        return this.firstName;
    }

    public final RequisiteFieldValidatorDto getLastName() {
        return this.lastName;
    }

    public final RequisiteFieldValidatorDto getMiddleName() {
        return this.middleName;
    }

    public final RequisiteFieldValidatorDto getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        return this.paymentPurpose.hashCode() + ((this.middleName.hashCode() + ((this.lastName.hashCode() + ((this.firstName.hashCode() + ((this.bic.hashCode() + (this.accountNumber.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "RequisitesTransferFieldsDto(accountNumber=" + this.accountNumber + ", bic=" + this.bic + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", middleName=" + this.middleName + ", paymentPurpose=" + this.paymentPurpose + Extension.C_BRAKE;
    }
}
