package com.yandex.xplat.payment.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bd90;
import defpackage.mbb1;
import defpackage.tyj0;
import defpackage.y3a0;
import defpackage.y3x;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0017\u0018\u0000 G2\u00060\u0001j\u0002`\u0002:\u0001HB»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u001a\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010)R'\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010)R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b5\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b6\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b7\u0010)R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR+\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\bD\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\bE\u0010)R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\bF\u0010)¨\u0006I"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PaymentMethod;", "Landroid/os/Parcelable;", "Lcom/yandex/xplat/common/Parcelable;", "", "identifier", "", "Lcom/yandex/xplat/common/YSArray;", "aliases", "account", "system", "", "verifyCvv", "Lcom/yandex/xplat/payment/sdk/BankName;", "bank", "memberId", "memberName", "memberNameRus", "Lcom/yandex/xplat/payment/sdk/PaymentMethodType;", "type", "Lcom/yandex/xplat/payment/sdk/FamilyInfo;", "familyInfo", "Lcom/yandex/xplat/payment/sdk/PartnerInfo;", "partnerInfo", "Lcom/yandex/xplat/payment/sdk/IconURLs;", "iconURLs", "restrictions", "errorRespCode", "payload", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/yandex/xplat/payment/sdk/BankName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/xplat/payment/sdk/PaymentMethodType;Lcom/yandex/xplat/payment/sdk/FamilyInfo;Lcom/yandex/xplat/payment/sdk/PartnerInfo;Lcom/yandex/xplat/payment/sdk/IconURLs;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Ljava/util/List;", "getAliases", "()Ljava/util/List;", "getAccount", "getSystem", "Z", "getVerifyCvv", "()Z", "Lcom/yandex/xplat/payment/sdk/BankName;", "getBank", "()Lcom/yandex/xplat/payment/sdk/BankName;", "getMemberId", "getMemberName", "getMemberNameRus", "Lcom/yandex/xplat/payment/sdk/PaymentMethodType;", "getType", "()Lcom/yandex/xplat/payment/sdk/PaymentMethodType;", "Lcom/yandex/xplat/payment/sdk/FamilyInfo;", "getFamilyInfo", "()Lcom/yandex/xplat/payment/sdk/FamilyInfo;", "Lcom/yandex/xplat/payment/sdk/PartnerInfo;", "getPartnerInfo", "()Lcom/yandex/xplat/payment/sdk/PartnerInfo;", "Lcom/yandex/xplat/payment/sdk/IconURLs;", "getIconURLs", "()Lcom/yandex/xplat/payment/sdk/IconURLs;", "getRestrictions", "getErrorRespCode", "getPayload", "Companion", "y3a0", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PaymentMethod implements Parcelable {
    private final String account;
    private final List<String> aliases;
    private final BankName bank;
    private final String errorRespCode;
    private final FamilyInfo familyInfo;
    private final IconURLs iconURLs;
    private final String identifier;
    private final String memberId;
    private final String memberName;
    private final String memberNameRus;
    private final PartnerInfo partnerInfo;
    private final String payload;
    private final List<String> restrictions;
    private final String system;
    private final PaymentMethodType type;
    private final boolean verifyCvv;
    public static final y3a0 Companion = new y3a0();
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();

    public PaymentMethod(String str, List<String> list, String str2, String str3, boolean z, BankName bankName, String str4, String str5, String str6, PaymentMethodType paymentMethodType, FamilyInfo familyInfo, PartnerInfo partnerInfo, IconURLs iconURLs, List<String> list2, String str7, String str8) {
        this.identifier = str;
        this.aliases = list;
        this.account = str2;
        this.system = str3;
        this.verifyCvv = z;
        this.bank = bankName;
        this.memberId = str4;
        this.memberName = str5;
        this.memberNameRus = str6;
        this.type = paymentMethodType;
        this.familyInfo = familyInfo;
        this.partnerInfo = partnerInfo;
        this.iconURLs = iconURLs;
        this.restrictions = list2;
        this.errorRespCode = str7;
        this.payload = str8;
    }

    public static tyj0 fromJsonItem(y3x y3xVar) {
        Companion.getClass();
        return mbb1.d(y3xVar, new bd90(13));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAccount() {
        return this.account;
    }

    public final List<String> getAliases() {
        return this.aliases;
    }

    public final BankName getBank() {
        return this.bank;
    }

    public final String getErrorRespCode() {
        return this.errorRespCode;
    }

    public final FamilyInfo getFamilyInfo() {
        return this.familyInfo;
    }

    public final IconURLs getIconURLs() {
        return this.iconURLs;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getMemberId() {
        return this.memberId;
    }

    public final String getMemberName() {
        return this.memberName;
    }

    public final String getMemberNameRus() {
        return this.memberNameRus;
    }

    public final PartnerInfo getPartnerInfo() {
        return this.partnerInfo;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final List<String> getRestrictions() {
        return this.restrictions;
    }

    public final String getSystem() {
        return this.system;
    }

    public final PaymentMethodType getType() {
        return this.type;
    }

    public final boolean getVerifyCvv() {
        return this.verifyCvv;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.identifier);
        dest.writeStringList(this.aliases);
        dest.writeString(this.account);
        dest.writeString(this.system);
        dest.writeInt(this.verifyCvv ? 1 : 0);
        dest.writeString(this.bank.name());
        dest.writeString(this.memberId);
        dest.writeString(this.memberName);
        dest.writeString(this.memberNameRus);
        dest.writeString(this.type.name());
        dest.writeParcelable(this.familyInfo, flags);
        dest.writeParcelable(this.partnerInfo, flags);
        dest.writeParcelable(this.iconURLs, flags);
        dest.writeStringList(this.restrictions);
        dest.writeString(this.errorRespCode);
        dest.writeString(this.payload);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            return new PaymentMethod(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, BankName.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), PaymentMethodType.valueOf(parcel.readString()), (FamilyInfo) parcel.readParcelable(PaymentMethod.class.getClassLoader()), (PartnerInfo) parcel.readParcelable(PaymentMethod.class.getClassLoader()), (IconURLs) parcel.readParcelable(PaymentMethod.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }
}
