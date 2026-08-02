package com.ybsdk.feature.transfer.version2.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jµ\u0001\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006<"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/dto/C2gTransferRequisitesDto;", "", "uin", "", "paymentPurpose", "discount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "discountExpire", "payerName", "payerInn", "payerKpp", "taxiBillDate", "payeeName", "payeeAccountNumber", "payeeBankBic", "payeeInn", "payeeKpp", "legalAct", "paymentTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUin", "()Ljava/lang/String;", "getPaymentPurpose", "getDiscount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getDiscountExpire", "getPayerName", "getPayerInn", "getPayerKpp", "getTaxiBillDate", "getPayeeName", "getPayeeAccountNumber", "getPayeeBankBic", "getPayeeInn", "getPayeeKpp", "getLegalAct", "getPaymentTerm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class C2gTransferRequisitesDto {
    private final Money discount;
    private final String discountExpire;
    private final String legalAct;
    private final String payeeAccountNumber;
    private final String payeeBankBic;
    private final String payeeInn;
    private final String payeeKpp;
    private final String payeeName;
    private final String payerInn;
    private final String payerKpp;
    private final String payerName;
    private final String paymentPurpose;
    private final String paymentTerm;
    private final String taxiBillDate;
    private final String uin;

    public C2gTransferRequisitesDto(@Json(name = "uin") String str, @Json(name = "payment_purpose") String str2, @Json(name = "discount") Money money, @Json(name = "discount_expire") String str3, @Json(name = "payer_name") String str4, @Json(name = "payer_inn") String str5, @Json(name = "payer_kpp") String str6, @Json(name = "tax_bill_date") String str7, @Json(name = "payee_name") String str8, @Json(name = "payee_account_number") String str9, @Json(name = "JSON_FIELD_PAYEE_MEMBER_BIC") String str10, @Json(name = "payee_inn") String str11, @Json(name = "payee_kpp") String str12, @Json(name = "legal_act") String str13, @Json(name = "payment_term") String str14) {
        this.uin = str;
        this.paymentPurpose = str2;
        this.discount = money;
        this.discountExpire = str3;
        this.payerName = str4;
        this.payerInn = str5;
        this.payerKpp = str6;
        this.taxiBillDate = str7;
        this.payeeName = str8;
        this.payeeAccountNumber = str9;
        this.payeeBankBic = str10;
        this.payeeInn = str11;
        this.payeeKpp = str12;
        this.legalAct = str13;
        this.paymentTerm = str14;
    }

    /* renamed from: component1, reason: from getter */
    public final String getUin() {
        return this.uin;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPayeeAccountNumber() {
        return this.payeeAccountNumber;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPayeeBankBic() {
        return this.payeeBankBic;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPayeeInn() {
        return this.payeeInn;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPayeeKpp() {
        return this.payeeKpp;
    }

    /* renamed from: component14, reason: from getter */
    public final String getLegalAct() {
        return this.legalAct;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPaymentTerm() {
        return this.paymentTerm;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getDiscount() {
        return this.discount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDiscountExpire() {
        return this.discountExpire;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPayerName() {
        return this.payerName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPayerInn() {
        return this.payerInn;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPayerKpp() {
        return this.payerKpp;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTaxiBillDate() {
        return this.taxiBillDate;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPayeeName() {
        return this.payeeName;
    }

    public final C2gTransferRequisitesDto copy(@Json(name = "uin") String uin, @Json(name = "payment_purpose") String paymentPurpose, @Json(name = "discount") Money discount, @Json(name = "discount_expire") String discountExpire, @Json(name = "payer_name") String payerName, @Json(name = "payer_inn") String payerInn, @Json(name = "payer_kpp") String payerKpp, @Json(name = "tax_bill_date") String taxiBillDate, @Json(name = "payee_name") String payeeName, @Json(name = "payee_account_number") String payeeAccountNumber, @Json(name = "JSON_FIELD_PAYEE_MEMBER_BIC") String payeeBankBic, @Json(name = "payee_inn") String payeeInn, @Json(name = "payee_kpp") String payeeKpp, @Json(name = "legal_act") String legalAct, @Json(name = "payment_term") String paymentTerm) {
        return new C2gTransferRequisitesDto(uin, paymentPurpose, discount, discountExpire, payerName, payerInn, payerKpp, taxiBillDate, payeeName, payeeAccountNumber, payeeBankBic, payeeInn, payeeKpp, legalAct, paymentTerm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2gTransferRequisitesDto)) {
            return false;
        }
        C2gTransferRequisitesDto c2gTransferRequisitesDto = (C2gTransferRequisitesDto) other;
        return jl40.l(this.uin, c2gTransferRequisitesDto.uin) && jl40.l(this.paymentPurpose, c2gTransferRequisitesDto.paymentPurpose) && jl40.l(this.discount, c2gTransferRequisitesDto.discount) && jl40.l(this.discountExpire, c2gTransferRequisitesDto.discountExpire) && jl40.l(this.payerName, c2gTransferRequisitesDto.payerName) && jl40.l(this.payerInn, c2gTransferRequisitesDto.payerInn) && jl40.l(this.payerKpp, c2gTransferRequisitesDto.payerKpp) && jl40.l(this.taxiBillDate, c2gTransferRequisitesDto.taxiBillDate) && jl40.l(this.payeeName, c2gTransferRequisitesDto.payeeName) && jl40.l(this.payeeAccountNumber, c2gTransferRequisitesDto.payeeAccountNumber) && jl40.l(this.payeeBankBic, c2gTransferRequisitesDto.payeeBankBic) && jl40.l(this.payeeInn, c2gTransferRequisitesDto.payeeInn) && jl40.l(this.payeeKpp, c2gTransferRequisitesDto.payeeKpp) && jl40.l(this.legalAct, c2gTransferRequisitesDto.legalAct) && jl40.l(this.paymentTerm, c2gTransferRequisitesDto.paymentTerm);
    }

    public final Money getDiscount() {
        return this.discount;
    }

    public final String getDiscountExpire() {
        return this.discountExpire;
    }

    public final String getLegalAct() {
        return this.legalAct;
    }

    public final String getPayeeAccountNumber() {
        return this.payeeAccountNumber;
    }

    public final String getPayeeBankBic() {
        return this.payeeBankBic;
    }

    public final String getPayeeInn() {
        return this.payeeInn;
    }

    public final String getPayeeKpp() {
        return this.payeeKpp;
    }

    public final String getPayeeName() {
        return this.payeeName;
    }

    public final String getPayerInn() {
        return this.payerInn;
    }

    public final String getPayerKpp() {
        return this.payerKpp;
    }

    public final String getPayerName() {
        return this.payerName;
    }

    public final String getPaymentPurpose() {
        return this.paymentPurpose;
    }

    public final String getPaymentTerm() {
        return this.paymentTerm;
    }

    public final String getTaxiBillDate() {
        return this.taxiBillDate;
    }

    public final String getUin() {
        return this.uin;
    }

    public int hashCode() {
        int hashCode = this.uin.hashCode() * 31;
        String str = this.paymentPurpose;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Money money = this.discount;
        int hashCode3 = (hashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        String str2 = this.discountExpire;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payerName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payerInn;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payerKpp;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.taxiBillDate;
        int b = unr0.b(unr0.b(unr0.b((hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.payeeName), 31, this.payeeAccountNumber), 31, this.payeeBankBic);
        String str7 = this.payeeInn;
        int hashCode8 = (b + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payeeKpp;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.legalAct;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.paymentTerm;
        return hashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        String str = this.uin;
        String str2 = this.paymentPurpose;
        Money money = this.discount;
        String str3 = this.discountExpire;
        String str4 = this.payerName;
        String str5 = this.payerInn;
        String str6 = this.payerKpp;
        String str7 = this.taxiBillDate;
        String str8 = this.payeeName;
        String str9 = this.payeeAccountNumber;
        String str10 = this.payeeBankBic;
        String str11 = this.payeeInn;
        String str12 = this.payeeKpp;
        String str13 = this.legalAct;
        String str14 = this.paymentTerm;
        StringBuilder v = b64.v("C2gTransferRequisitesDto(uin=", str, ", paymentPurpose=", str2, ", discount=");
        v.append(money);
        v.append(", discountExpire=");
        v.append(str3);
        v.append(", payerName=");
        g8e.D(v, str4, ", payerInn=", str5, ", payerKpp=");
        g8e.D(v, str6, ", taxiBillDate=", str7, ", payeeName=");
        g8e.D(v, str8, ", payeeAccountNumber=", str9, ", payeeBankBic=");
        g8e.D(v, str10, ", payeeInn=", str11, ", payeeKpp=");
        g8e.D(v, str12, ", legalAct=", str13, ", paymentTerm=");
        return oyr.t(v, str14, Extension.C_BRAKE);
    }
}
