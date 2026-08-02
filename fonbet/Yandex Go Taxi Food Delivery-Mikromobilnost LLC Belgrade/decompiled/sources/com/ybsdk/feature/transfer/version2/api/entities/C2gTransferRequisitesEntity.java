package com.ybsdk.feature.transfer.version2.api.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ¼\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001fJ\u0010\u00102\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b2\u0010\u001dJ\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b@\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\bA\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bB\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\bC\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\bE\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\bF\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00108\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\bH\u0010\u001f¨\u0006I"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;", "Landroid/os/Parcelable;", "", "uin", "paymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "discount", "discountExpire", "payerName", "payerInn", "payerKpp", "taxiBillDate", "payeeName", "payeeAccountNumber", "payeeBankBic", "payeeInn", "payeeKpp", "legalAct", "paymentTerm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/domain/entities/MoneyEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/entities/C2gTransferRequisitesEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUin", "getPaymentPurpose", "Lcom/ybsdk/core/common/domain/entities/MoneyEntity;", "getDiscount", "getDiscountExpire", "getPayerName", "getPayerInn", "getPayerKpp", "getTaxiBillDate", "getPayeeName", "getPayeeAccountNumber", "getPayeeBankBic", "getPayeeInn", "getPayeeKpp", "getLegalAct", "getPaymentTerm", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class C2gTransferRequisitesEntity implements Parcelable {
    public static final Parcelable.Creator<C2gTransferRequisitesEntity> CREATOR = new Creator();
    private final MoneyEntity discount;
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

    public C2gTransferRequisitesEntity(String str, String str2, MoneyEntity moneyEntity, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.uin = str;
        this.paymentPurpose = str2;
        this.discount = moneyEntity;
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
    public final MoneyEntity getDiscount() {
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

    public final C2gTransferRequisitesEntity copy(String uin, String paymentPurpose, MoneyEntity discount, String discountExpire, String payerName, String payerInn, String payerKpp, String taxiBillDate, String payeeName, String payeeAccountNumber, String payeeBankBic, String payeeInn, String payeeKpp, String legalAct, String paymentTerm) {
        return new C2gTransferRequisitesEntity(uin, paymentPurpose, discount, discountExpire, payerName, payerInn, payerKpp, taxiBillDate, payeeName, payeeAccountNumber, payeeBankBic, payeeInn, payeeKpp, legalAct, paymentTerm);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2gTransferRequisitesEntity)) {
            return false;
        }
        C2gTransferRequisitesEntity c2gTransferRequisitesEntity = (C2gTransferRequisitesEntity) other;
        return jl40.l(this.uin, c2gTransferRequisitesEntity.uin) && jl40.l(this.paymentPurpose, c2gTransferRequisitesEntity.paymentPurpose) && jl40.l(this.discount, c2gTransferRequisitesEntity.discount) && jl40.l(this.discountExpire, c2gTransferRequisitesEntity.discountExpire) && jl40.l(this.payerName, c2gTransferRequisitesEntity.payerName) && jl40.l(this.payerInn, c2gTransferRequisitesEntity.payerInn) && jl40.l(this.payerKpp, c2gTransferRequisitesEntity.payerKpp) && jl40.l(this.taxiBillDate, c2gTransferRequisitesEntity.taxiBillDate) && jl40.l(this.payeeName, c2gTransferRequisitesEntity.payeeName) && jl40.l(this.payeeAccountNumber, c2gTransferRequisitesEntity.payeeAccountNumber) && jl40.l(this.payeeBankBic, c2gTransferRequisitesEntity.payeeBankBic) && jl40.l(this.payeeInn, c2gTransferRequisitesEntity.payeeInn) && jl40.l(this.payeeKpp, c2gTransferRequisitesEntity.payeeKpp) && jl40.l(this.legalAct, c2gTransferRequisitesEntity.legalAct) && jl40.l(this.paymentTerm, c2gTransferRequisitesEntity.paymentTerm);
    }

    public final MoneyEntity getDiscount() {
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
        MoneyEntity moneyEntity = this.discount;
        int hashCode3 = (hashCode2 + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
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
        MoneyEntity moneyEntity = this.discount;
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
        StringBuilder v = b64.v("C2gTransferRequisitesEntity(uin=", str, ", paymentPurpose=", str2, ", discount=");
        v.append(moneyEntity);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uin);
        dest.writeString(this.paymentPurpose);
        dest.writeParcelable(this.discount, flags);
        dest.writeString(this.discountExpire);
        dest.writeString(this.payerName);
        dest.writeString(this.payerInn);
        dest.writeString(this.payerKpp);
        dest.writeString(this.taxiBillDate);
        dest.writeString(this.payeeName);
        dest.writeString(this.payeeAccountNumber);
        dest.writeString(this.payeeBankBic);
        dest.writeString(this.payeeInn);
        dest.writeString(this.payeeKpp);
        dest.writeString(this.legalAct);
        dest.writeString(this.paymentTerm);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<C2gTransferRequisitesEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2gTransferRequisitesEntity createFromParcel(Parcel parcel) {
            return new C2gTransferRequisitesEntity(parcel.readString(), parcel.readString(), (MoneyEntity) parcel.readParcelable(C2gTransferRequisitesEntity.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final C2gTransferRequisitesEntity[] newArray(int i) {
            return new C2gTransferRequisitesEntity[i];
        }
    }
}
