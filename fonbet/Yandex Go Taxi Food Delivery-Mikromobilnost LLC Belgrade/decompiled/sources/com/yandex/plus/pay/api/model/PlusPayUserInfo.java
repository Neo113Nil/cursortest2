package com.yandex.plus.pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.vfc;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003<=>BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u0014J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%Jj\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010\u0014J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u0014R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b8\u0010\u001eR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010%¨\u0006?"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayUserInfo;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/pay/api/model/FamilyInfo;", "familyInfo", "", "Lcom/yandex/plus/pay/api/model/FrozenFeature;", "frozenFeatures", "", "hasFamilySubscription", "", "region", "Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserSubscription;", "subscriptions", "Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserPaymentMethod;", "userPaymentMethods", "Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;", "wallet", "<init>", "(Lcom/yandex/plus/pay/api/model/FamilyInfo;Ljava/util/List;ZILjava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/api/model/FamilyInfo;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;", "copy", "(Lcom/yandex/plus/pay/api/model/FamilyInfo;Ljava/util/List;ZILjava/util/List;Ljava/util/List;Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;)Lcom/yandex/plus/pay/api/model/PlusPayUserInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/api/model/FamilyInfo;", "getFamilyInfo", "Ljava/util/List;", "getFrozenFeatures", "Z", "getHasFamilySubscription", CA20Status.STATUS_USER_I, "getRegion", "getSubscriptions", "getUserPaymentMethods", "Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;", "getWallet", "UserSubscription", "UserPaymentMethod", "Wallet", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayUserInfo implements Parcelable {
    public static final Parcelable.Creator<PlusPayUserInfo> CREATOR = new Creator();
    private final FamilyInfo familyInfo;
    private final List<FrozenFeature> frozenFeatures;
    private final boolean hasFamilySubscription;
    private final int region;
    private final List<UserSubscription> subscriptions;
    private final List<UserPaymentMethod> userPaymentMethods;
    private final Wallet wallet;

    public PlusPayUserInfo(FamilyInfo familyInfo, List<FrozenFeature> list, boolean z, int i, List<UserSubscription> list2, List<UserPaymentMethod> list3, Wallet wallet) {
        this.familyInfo = familyInfo;
        this.frozenFeatures = list;
        this.hasFamilySubscription = z;
        this.region = i;
        this.subscriptions = list2;
        this.userPaymentMethods = list3;
        this.wallet = wallet;
    }

    public static /* synthetic */ PlusPayUserInfo copy$default(PlusPayUserInfo plusPayUserInfo, FamilyInfo familyInfo, List list, boolean z, int i, List list2, List list3, Wallet wallet, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            familyInfo = plusPayUserInfo.familyInfo;
        }
        if ((i2 & 2) != 0) {
            list = plusPayUserInfo.frozenFeatures;
        }
        if ((i2 & 4) != 0) {
            z = plusPayUserInfo.hasFamilySubscription;
        }
        if ((i2 & 8) != 0) {
            i = plusPayUserInfo.region;
        }
        if ((i2 & 16) != 0) {
            list2 = plusPayUserInfo.subscriptions;
        }
        if ((i2 & 32) != 0) {
            list3 = plusPayUserInfo.userPaymentMethods;
        }
        if ((i2 & 64) != 0) {
            wallet = plusPayUserInfo.wallet;
        }
        List list4 = list3;
        Wallet wallet2 = wallet;
        List list5 = list2;
        boolean z2 = z;
        return plusPayUserInfo.copy(familyInfo, list, z2, i, list5, list4, wallet2);
    }

    /* renamed from: component1, reason: from getter */
    public final FamilyInfo getFamilyInfo() {
        return this.familyInfo;
    }

    public final List<FrozenFeature> component2() {
        return this.frozenFeatures;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasFamilySubscription() {
        return this.hasFamilySubscription;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRegion() {
        return this.region;
    }

    public final List<UserSubscription> component5() {
        return this.subscriptions;
    }

    public final List<UserPaymentMethod> component6() {
        return this.userPaymentMethods;
    }

    /* renamed from: component7, reason: from getter */
    public final Wallet getWallet() {
        return this.wallet;
    }

    public final PlusPayUserInfo copy(FamilyInfo familyInfo, List<FrozenFeature> frozenFeatures, boolean hasFamilySubscription, int region, List<UserSubscription> subscriptions, List<UserPaymentMethod> userPaymentMethods, Wallet wallet) {
        return new PlusPayUserInfo(familyInfo, frozenFeatures, hasFamilySubscription, region, subscriptions, userPaymentMethods, wallet);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayUserInfo)) {
            return false;
        }
        PlusPayUserInfo plusPayUserInfo = (PlusPayUserInfo) other;
        return jl40.l(this.familyInfo, plusPayUserInfo.familyInfo) && jl40.l(this.frozenFeatures, plusPayUserInfo.frozenFeatures) && this.hasFamilySubscription == plusPayUserInfo.hasFamilySubscription && this.region == plusPayUserInfo.region && jl40.l(this.subscriptions, plusPayUserInfo.subscriptions) && jl40.l(this.userPaymentMethods, plusPayUserInfo.userPaymentMethods) && jl40.l(this.wallet, plusPayUserInfo.wallet);
    }

    public final FamilyInfo getFamilyInfo() {
        return this.familyInfo;
    }

    public final List<FrozenFeature> getFrozenFeatures() {
        return this.frozenFeatures;
    }

    public final boolean getHasFamilySubscription() {
        return this.hasFamilySubscription;
    }

    public final int getRegion() {
        return this.region;
    }

    public final List<UserSubscription> getSubscriptions() {
        return this.subscriptions;
    }

    public final List<UserPaymentMethod> getUserPaymentMethods() {
        return this.userPaymentMethods;
    }

    public final Wallet getWallet() {
        return this.wallet;
    }

    public int hashCode() {
        FamilyInfo familyInfo = this.familyInfo;
        return this.wallet.hashCode() + unr0.c(unr0.c(oyr.b(this.region, unr0.e(unr0.c((familyInfo == null ? 0 : familyInfo.hashCode()) * 31, 31, this.frozenFeatures), 31, this.hasFamilySubscription), 31), 31, this.subscriptions), 31, this.userPaymentMethods);
    }

    public String toString() {
        return "PlusPayUserInfo(familyInfo=" + this.familyInfo + ", frozenFeatures=" + this.frozenFeatures + ", hasFamilySubscription=" + this.hasFamilySubscription + ", region=" + this.region + ", subscriptions=" + this.subscriptions + ", userPaymentMethods=" + this.userPaymentMethods + ", wallet=" + this.wallet + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        FamilyInfo familyInfo = this.familyInfo;
        if (familyInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            familyInfo.writeToParcel(dest, flags);
        }
        Iterator t = vfc.t(dest, this.frozenFeatures);
        while (t.hasNext()) {
            ((FrozenFeature) t.next()).writeToParcel(dest, flags);
        }
        dest.writeInt(this.hasFamilySubscription ? 1 : 0);
        dest.writeInt(this.region);
        Iterator t2 = vfc.t(dest, this.subscriptions);
        while (t2.hasNext()) {
            ((UserSubscription) t2.next()).writeToParcel(dest, flags);
        }
        Iterator t3 = vfc.t(dest, this.userPaymentMethods);
        while (t3.hasNext()) {
            ((UserPaymentMethod) t3.next()).writeToParcel(dest, flags);
        }
        this.wallet.writeToParcel(dest, flags);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b&\u0010\u0013¨\u0006'"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserPaymentMethod;", "Landroid/os/Parcelable;", "", "paymentMethodId", "", "regionId", "system", "number", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserPaymentMethod;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentMethodId", "Ljava/lang/Integer;", "getRegionId", "getSystem", "getNumber", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserPaymentMethod implements Parcelable {
        public static final Parcelable.Creator<UserPaymentMethod> CREATOR = new Creator();
        private final String number;
        private final String paymentMethodId;
        private final Integer regionId;
        private final String system;

        public UserPaymentMethod(String str, Integer num, String str2, String str3) {
            this.paymentMethodId = str;
            this.regionId = num;
            this.system = str2;
            this.number = str3;
        }

        public static /* synthetic */ UserPaymentMethod copy$default(UserPaymentMethod userPaymentMethod, String str, Integer num, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userPaymentMethod.paymentMethodId;
            }
            if ((i & 2) != 0) {
                num = userPaymentMethod.regionId;
            }
            if ((i & 4) != 0) {
                str2 = userPaymentMethod.system;
            }
            if ((i & 8) != 0) {
                str3 = userPaymentMethod.number;
            }
            return userPaymentMethod.copy(str, num, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getRegionId() {
            return this.regionId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSystem() {
            return this.system;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        public final UserPaymentMethod copy(String paymentMethodId, Integer regionId, String system, String number) {
            return new UserPaymentMethod(paymentMethodId, regionId, system, number);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserPaymentMethod)) {
                return false;
            }
            UserPaymentMethod userPaymentMethod = (UserPaymentMethod) other;
            return jl40.l(this.paymentMethodId, userPaymentMethod.paymentMethodId) && jl40.l(this.regionId, userPaymentMethod.regionId) && jl40.l(this.system, userPaymentMethod.system) && jl40.l(this.number, userPaymentMethod.number);
        }

        public final String getNumber() {
            return this.number;
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final Integer getRegionId() {
            return this.regionId;
        }

        public final String getSystem() {
            return this.system;
        }

        public int hashCode() {
            int hashCode = this.paymentMethodId.hashCode() * 31;
            Integer num = this.regionId;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.system;
            return this.number.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UserPaymentMethod(paymentMethodId=");
            sb.append(this.paymentMethodId);
            sb.append(", regionId=");
            sb.append(this.regionId);
            sb.append(", system=");
            sb.append(this.system);
            sb.append(", number=");
            return b64.p(sb, this.number, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.paymentMethodId);
            Integer num = this.regionId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            dest.writeString(this.system);
            dest.writeString(this.number);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserPaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserPaymentMethod createFromParcel(Parcel parcel) {
                return new UserPaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserPaymentMethod[] newArray(int i) {
                return new UserPaymentMethod[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserSubscription;", "Landroid/os/Parcelable;", "", "autoRenewable", "", "offerId", "Lcom/yandex/plus/pay/api/model/VendorType;", DRMInfoProvider.MediaDRMKeys.VENDOR, "<init>", "(ZLjava/lang/String;Lcom/yandex/plus/pay/api/model/VendorType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/yandex/plus/pay/api/model/VendorType;", "copy", "(ZLjava/lang/String;Lcom/yandex/plus/pay/api/model/VendorType;)Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$UserSubscription;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAutoRenewable", "Ljava/lang/String;", "getOfferId", "Lcom/yandex/plus/pay/api/model/VendorType;", "getVendor", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserSubscription implements Parcelable {
        public static final Parcelable.Creator<UserSubscription> CREATOR = new Creator();
        private final boolean autoRenewable;
        private final String offerId;
        private final VendorType vendor;

        public UserSubscription(boolean z, String str, VendorType vendorType) {
            this.autoRenewable = z;
            this.offerId = str;
            this.vendor = vendorType;
        }

        public static /* synthetic */ UserSubscription copy$default(UserSubscription userSubscription, boolean z, String str, VendorType vendorType, int i, Object obj) {
            if ((i & 1) != 0) {
                z = userSubscription.autoRenewable;
            }
            if ((i & 2) != 0) {
                str = userSubscription.offerId;
            }
            if ((i & 4) != 0) {
                vendorType = userSubscription.vendor;
            }
            return userSubscription.copy(z, str, vendorType);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAutoRenewable() {
            return this.autoRenewable;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        /* renamed from: component3, reason: from getter */
        public final VendorType getVendor() {
            return this.vendor;
        }

        public final UserSubscription copy(boolean autoRenewable, String offerId, VendorType vendor) {
            return new UserSubscription(autoRenewable, offerId, vendor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserSubscription)) {
                return false;
            }
            UserSubscription userSubscription = (UserSubscription) other;
            return this.autoRenewable == userSubscription.autoRenewable && jl40.l(this.offerId, userSubscription.offerId) && this.vendor == userSubscription.vendor;
        }

        public final boolean getAutoRenewable() {
            return this.autoRenewable;
        }

        public final String getOfferId() {
            return this.offerId;
        }

        public final VendorType getVendor() {
            return this.vendor;
        }

        public int hashCode() {
            return this.vendor.hashCode() + unr0.b(Boolean.hashCode(this.autoRenewable) * 31, 31, this.offerId);
        }

        public String toString() {
            return "UserSubscription(autoRenewable=" + this.autoRenewable + ", offerId=" + this.offerId + ", vendor=" + this.vendor + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.autoRenewable ? 1 : 0);
            dest.writeString(this.offerId);
            dest.writeString(this.vendor.name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UserSubscription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserSubscription createFromParcel(Parcel parcel) {
                return new UserSubscription(parcel.readInt() != 0, parcel.readString(), VendorType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserSubscription[] newArray(int i) {
                return new UserSubscription[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006'"}, d2 = {"Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;", "Landroid/os/Parcelable;", "Ljava/math/BigDecimal;", "balance", "", "currencyCode", "", "walletAvailable", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Z)Lcom/yandex/plus/pay/api/model/PlusPayUserInfo$Wallet;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getBalance", "Ljava/lang/String;", "getCurrencyCode", "Z", "getWalletAvailable", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wallet implements Parcelable {
        public static final Parcelable.Creator<Wallet> CREATOR = new Creator();
        private final BigDecimal balance;
        private final String currencyCode;
        private final boolean walletAvailable;

        public Wallet(BigDecimal bigDecimal, String str, boolean z) {
            this.balance = bigDecimal;
            this.currencyCode = str;
            this.walletAvailable = z;
        }

        public static /* synthetic */ Wallet copy$default(Wallet wallet, BigDecimal bigDecimal, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = wallet.balance;
            }
            if ((i & 2) != 0) {
                str = wallet.currencyCode;
            }
            if ((i & 4) != 0) {
                z = wallet.walletAvailable;
            }
            return wallet.copy(bigDecimal, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getBalance() {
            return this.balance;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getWalletAvailable() {
            return this.walletAvailable;
        }

        public final Wallet copy(BigDecimal balance, String currencyCode, boolean walletAvailable) {
            return new Wallet(balance, currencyCode, walletAvailable);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Wallet)) {
                return false;
            }
            Wallet wallet = (Wallet) other;
            return jl40.l(this.balance, wallet.balance) && jl40.l(this.currencyCode, wallet.currencyCode) && this.walletAvailable == wallet.walletAvailable;
        }

        public final BigDecimal getBalance() {
            return this.balance;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final boolean getWalletAvailable() {
            return this.walletAvailable;
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.balance;
            int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            String str = this.currencyCode;
            return Boolean.hashCode(this.walletAvailable) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Wallet(balance=");
            sb.append(this.balance);
            sb.append(", currencyCode=");
            sb.append(this.currencyCode);
            sb.append(", walletAvailable=");
            return unr0.u(sb, this.walletAvailable, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeSerializable(this.balance);
            dest.writeString(this.currencyCode);
            dest.writeInt(this.walletAvailable ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Wallet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Wallet createFromParcel(Parcel parcel) {
                return new Wallet((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Wallet[] newArray(int i) {
                return new Wallet[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayUserInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayUserInfo createFromParcel(Parcel parcel) {
            boolean z;
            int i;
            FamilyInfo createFromParcel = parcel.readInt() == 0 ? null : FamilyInfo.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i2 = 0;
            int i3 = 0;
            while (i3 != readInt) {
                i3 = oo31.d(FrozenFeature.CREATOR, parcel, arrayList, i3, 1);
            }
            if (parcel.readInt() != 0) {
                i = 1;
                z = true;
            } else {
                z = false;
                i = 1;
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i4 = 0;
            while (i4 != readInt3) {
                i4 = oo31.d(UserSubscription.CREATOR, parcel, arrayList2, i4, i);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i2 != readInt4) {
                i2 = oo31.d(UserPaymentMethod.CREATOR, parcel, arrayList3, i2, i);
            }
            return new PlusPayUserInfo(createFromParcel, arrayList, z, readInt2, arrayList2, arrayList3, Wallet.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayUserInfo[] newArray(int i) {
            return new PlusPayUserInfo[i];
        }
    }
}
