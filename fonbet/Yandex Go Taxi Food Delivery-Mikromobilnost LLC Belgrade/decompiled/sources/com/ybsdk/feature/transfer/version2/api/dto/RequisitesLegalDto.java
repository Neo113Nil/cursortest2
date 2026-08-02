package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/RequisitesLegalDto;", "", "bic", "", "inn", "sum", "Lcom/ybsdk/core/common/data/network/dto/Money;", "legalName", "accountNumber", "paymentPurpose", "divkitWidget", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getBic", "()Ljava/lang/String;", "getInn", "getSum", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getLegalName", "getAccountNumber", "getPaymentPurpose", "getDivkitWidget", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RequisitesLegalDto {
    private final String accountNumber;
    private final String bic;
    private final DivDataDto divkitWidget;
    private final String inn;
    private final String legalName;
    private final String paymentPurpose;
    private final Money sum;

    public RequisitesLegalDto(@Json(name = "bic") String str, @Json(name = "inn") String str2, @Json(name = "sum") Money money, @Json(name = "legal_name") String str3, @Json(name = "account_number") String str4, @Json(name = "payment_purpose") String str5, @Json(name = "divkit_widget") DivDataDto divDataDto) {
        this.bic = str;
        this.inn = str2;
        this.sum = money;
        this.legalName = str3;
        this.accountNumber = str4;
        this.paymentPurpose = str5;
        this.divkitWidget = divDataDto;
    }

    public static /* synthetic */ RequisitesLegalDto copy$default(RequisitesLegalDto requisitesLegalDto, String str, String str2, Money money, String str3, String str4, String str5, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = requisitesLegalDto.bic;
        }
        if ((i & 2) != 0) {
            str2 = requisitesLegalDto.inn;
        }
        if ((i & 4) != 0) {
            money = requisitesLegalDto.sum;
        }
        if ((i & 8) != 0) {
            str3 = requisitesLegalDto.legalName;
        }
        if ((i & 16) != 0) {
            str4 = requisitesLegalDto.accountNumber;
        }
        if ((i & 32) != 0) {
            str5 = requisitesLegalDto.paymentPurpose;
        }
        if ((i & 64) != 0) {
            divDataDto = requisitesLegalDto.divkitWidget;
        }
        String str6 = str5;
        DivDataDto divDataDto2 = divDataDto;
        String str7 = str4;
        Money money2 = money;
        return requisitesLegalDto.copy(str, str2, money2, str3, str7, str6, divDataDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBic() {
        return this.bic;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInn() {
        return this.inn;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getSum() {
        return this.sum;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLegalName() {
        return this.legalName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    /* renamed from: component7, reason: from getter */
    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final RequisitesLegalDto copy(@Json(name = "bic") String bic, @Json(name = "inn") String inn, @Json(name = "sum") Money sum, @Json(name = "legal_name") String legalName, @Json(name = "account_number") String accountNumber, @Json(name = "payment_purpose") String paymentPurpose, @Json(name = "divkit_widget") DivDataDto divkitWidget) {
        return new RequisitesLegalDto(bic, inn, sum, legalName, accountNumber, paymentPurpose, divkitWidget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequisitesLegalDto)) {
            return false;
        }
        RequisitesLegalDto requisitesLegalDto = (RequisitesLegalDto) other;
        return jl40.l(this.bic, requisitesLegalDto.bic) && jl40.l(this.inn, requisitesLegalDto.inn) && jl40.l(this.sum, requisitesLegalDto.sum) && jl40.l(this.legalName, requisitesLegalDto.legalName) && jl40.l(this.accountNumber, requisitesLegalDto.accountNumber) && jl40.l(this.paymentPurpose, requisitesLegalDto.paymentPurpose) && jl40.l(this.divkitWidget, requisitesLegalDto.divkitWidget);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getBic() {
        return this.bic;
    }

    public final DivDataDto getDivkitWidget() {
        return this.divkitWidget;
    }

    public final String getInn() {
        return this.inn;
    }

    public final String getLegalName() {
        return this.legalName;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final Money getSum() {
        return this.sum;
    }

    public int hashCode() {
        String str = this.bic;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inn;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Money money = this.sum;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        String str3 = this.legalName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.accountNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentPurpose;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DivDataDto divDataDto = this.divkitWidget;
        return hashCode6 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.bic;
        String str2 = this.inn;
        Money money = this.sum;
        String str3 = this.legalName;
        String str4 = this.accountNumber;
        String str5 = this.paymentPurpose;
        DivDataDto divDataDto = this.divkitWidget;
        StringBuilder v = b64.v("RequisitesLegalDto(bic=", str, ", inn=", str2, ", sum=");
        v.append(money);
        v.append(", legalName=");
        v.append(str3);
        v.append(", accountNumber=");
        g8e.D(v, str4, ", paymentPurpose=", str5, ", divkitWidget=");
        v.append(divDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
