package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesHcsPayloadDto;", "", "accountNumber", "", "bic", "beneficiaryName", "inn", "hcsPersonalAccount", "paymentPeriod", "paymentPurpose", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getAccountNumber", "()Ljava/lang/String;", "getBic", "getBeneficiaryName", "getInn", "getHcsPersonalAccount", "getPaymentPeriod", "getPaymentPurpose", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesHcsPayloadDto {
    private final String accountNumber;
    private final String beneficiaryName;
    private final String bic;
    private final DivDataDto divkitWidget;
    private final String hcsPersonalAccount;
    private final String inn;
    private final String paymentPeriod;
    private final String paymentPurpose;

    public RequisitesHcsPayloadDto(@Json(name = "account_number") String str, @Json(name = "bic") String str2, @Json(name = "legal_name") String str3, @Json(name = "inn") String str4, @Json(name = "hcs_personal_account") String str5, @Json(name = "payment_period") String str6, @Json(name = "payment_purpose") String str7, @Json(name = "divkit_widget") DivDataDto divDataDto) {
        this.accountNumber = str;
        this.bic = str2;
        this.beneficiaryName = str3;
        this.inn = str4;
        this.hcsPersonalAccount = str5;
        this.paymentPeriod = str6;
        this.paymentPurpose = str7;
        this.divkitWidget = divDataDto;
    }

    public static /* synthetic */ RequisitesHcsPayloadDto copy$default(RequisitesHcsPayloadDto requisitesHcsPayloadDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesHcsPayloadDto.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = requisitesHcsPayloadDto.bic;
        }
        if ((i & 4) != 0) {
            str3 = requisitesHcsPayloadDto.beneficiaryName;
        }
        if ((i & 8) != 0) {
            str4 = requisitesHcsPayloadDto.inn;
        }
        if ((i & 16) != 0) {
            str5 = requisitesHcsPayloadDto.hcsPersonalAccount;
        }
        if ((i & 32) != 0) {
            str6 = requisitesHcsPayloadDto.paymentPeriod;
        }
        if ((i & 64) != 0) {
            str7 = requisitesHcsPayloadDto.paymentPurpose;
        }
        if ((i & 128) != 0) {
            divDataDto = requisitesHcsPayloadDto.divkitWidget;
        }
        String str8 = str7;
        DivDataDto divDataDto2 = divDataDto;
        String str9 = str5;
        String str10 = str6;
        return requisitesHcsPayloadDto.copy(str, str2, str3, str4, str9, str10, str8, divDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentPeriod() {
        return this.paymentPeriod;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    /* renamed from: component8, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final RequisitesHcsPayloadDto copy(@Json(name = "account_number") String accountNumber, @Json(name = "bic") String bic, @Json(name = "legal_name") String beneficiaryName, @Json(name = "inn") String inn, @Json(name = "hcs_personal_account") String hcsPersonalAccount, @Json(name = "payment_period") String paymentPeriod, @Json(name = "payment_purpose") String paymentPurpose, @Json(name = "divkit_widget") DivDataDto divkitWidget) {
        return new RequisitesHcsPayloadDto(accountNumber, bic, beneficiaryName, inn, hcsPersonalAccount, paymentPeriod, paymentPurpose, divkitWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesHcsPayloadDto)) {
            return false;
        }
        RequisitesHcsPayloadDto requisitesHcsPayloadDto = (RequisitesHcsPayloadDto) other;
        return jl40.l(this.accountNumber, requisitesHcsPayloadDto.accountNumber) && jl40.l(this.bic, requisitesHcsPayloadDto.bic) && jl40.l(this.beneficiaryName, requisitesHcsPayloadDto.beneficiaryName) && jl40.l(this.inn, requisitesHcsPayloadDto.inn) && jl40.l(this.hcsPersonalAccount, requisitesHcsPayloadDto.hcsPersonalAccount) && jl40.l(this.paymentPeriod, requisitesHcsPayloadDto.paymentPeriod) && jl40.l(this.paymentPurpose, requisitesHcsPayloadDto.paymentPurpose) && jl40.l(this.divkitWidget, requisitesHcsPayloadDto.divkitWidget);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getBeneficiaryName() {
        return this.beneficiaryName;
    }

    public final String getBic() {
        return this.bic;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final String getHcsPersonalAccount() {
        return this.hcsPersonalAccount;
    }

    public final String getInn() {
        return this.inn;
    }

    public final String getPaymentPeriod() {
        return this.paymentPeriod;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bic;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.beneficiaryName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inn;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hcsPersonalAccount;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentPeriod;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.paymentPurpose;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        return hashCode7 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.accountNumber;
        String str2 = this.bic;
        String str3 = this.beneficiaryName;
        String str4 = this.inn;
        String str5 = this.hcsPersonalAccount;
        String str6 = this.paymentPeriod;
        String str7 = this.paymentPurpose;
        DivDataDto divDataDto = this.divkitWidget;
        StringBuilder v = b64.v("RequisitesHcsPayloadDto(accountNumber=", str, ", bic=", str2, ", beneficiaryName=");
        g8e.D(v, str3, ", inn=", str4, ", hcsPersonalAccount=");
        g8e.D(v, str5, ", paymentPeriod=", str6, ", paymentPurpose=");
        v.append(str7);
        v.append(", divkitWidget=");
        v.append(divDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
