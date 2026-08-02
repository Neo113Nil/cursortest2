package com.yandex.payment.sdk.core.data;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.jxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "Card", "SbpToken", "NewCard", "GooglePay", "Sbp", "NewSbpToken", "TinkoffCredit", "Cash", "Split", "ChallengePollingMethod", "YBMethod", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Cash;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$ChallengePollingMethod;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$GooglePay;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$NewCard;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$NewSbpToken;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Sbp;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$SbpToken;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$Split;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$TinkoffCredit;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod$YBMethod;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PaymentMethod implements Parcelable {
    public /* synthetic */ PaymentMethod(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001Bi\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0013BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0011\u0010\u0014BQ\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010\u0017J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0018¢\u0006\u0004\b+\u0010\u001aJ\u001d\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0018¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010*R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b?\u0010\u0017R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b@\u0010>R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bA\u0010\u0017R\u0017\u0010E\u001a\u00020\u00068F¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bB\u0010\u0017R\u0017\u0010F\u001a\u00020\u001d8F¢\u0006\f\u0012\u0004\bH\u0010D\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "Lcom/yandex/payment/sdk/core/data/CardId;", "id", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "system", "", "account", "Lcom/yandex/payment/sdk/core/data/BankName;", "bankName", "Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "familyInfo", "", "restrictions", "errorRespCode", "aliases", "payload", "<init>", "(Lcom/yandex/payment/sdk/core/data/CardId;Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/BankName;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "(Lcom/yandex/payment/sdk/core/data/CardId;Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/BankName;Lcom/yandex/payment/sdk/core/data/FamilyInfo;)V", "(Lcom/yandex/payment/sdk/core/data/CardId;Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/BankName;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/util/List;)V", "(Lcom/yandex/payment/sdk/core/data/CardId;Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/BankName;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "copy", "(Lcom/yandex/payment/sdk/core/data/CardId;Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;Ljava/lang/String;Lcom/yandex/payment/sdk/core/data/BankName;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/util/List;)Lcom/yandex/payment/sdk/core/data/PaymentMethod$Card;", "component1", "()Lcom/yandex/payment/sdk/core/data/CardId;", "component2", "()Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "component3", "component4", "()Lcom/yandex/payment/sdk/core/data/BankName;", "component5", "()Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/yandex/payment/sdk/core/data/CardId;", "getId", "Lcom/yandex/payment/sdk/core/data/CardPaymentSystem;", "getSystem", "Ljava/lang/String;", "getAccount", "Lcom/yandex/payment/sdk/core/data/BankName;", "getBankName", "Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "getFamilyInfo", "Ljava/util/List;", "getRestrictions", "()Ljava/util/List;", "getErrorRespCode", "getAliases$core_release", "getPayload", "getCardId", "getCardId$annotations", "()V", "cardId", "isNewCardId", "()Z", "isNewCardId$annotations", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Card extends PaymentMethod {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        private final String account;
        private final List<String> aliases;
        private final BankName bankName;
        private final String errorRespCode;
        private final FamilyInfo familyInfo;
        private final CardId id;
        private final String payload;
        private final List<String> restrictions;
        private final CardPaymentSystem system;

        public /* synthetic */ Card(CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo, List list, String str2, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cardId, cardPaymentSystem, str, bankName, familyInfo, list, str2, (i & 128) != 0 ? EmptyList.a : list2, (i & 256) != 0 ? null : str3);
        }

        public static /* synthetic */ Card copy$default(Card card, CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                cardId = card.id;
            }
            if ((i & 2) != 0) {
                cardPaymentSystem = card.system;
            }
            if ((i & 4) != 0) {
                str = card.account;
            }
            if ((i & 8) != 0) {
                bankName = card.bankName;
            }
            if ((i & 16) != 0) {
                familyInfo = card.familyInfo;
            }
            if ((i & 32) != 0) {
                list = card.aliases;
            }
            FamilyInfo familyInfo2 = familyInfo;
            List list2 = list;
            return card.copy(cardId, cardPaymentSystem, str, bankName, familyInfo2, list2);
        }

        public static /* synthetic */ void getCardId$annotations() {
        }

        public static /* synthetic */ void isNewCardId$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final CardId getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final CardPaymentSystem getSystem() {
            return this.system;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccount() {
            return this.account;
        }

        /* renamed from: component4, reason: from getter */
        public final BankName getBankName() {
            return this.bankName;
        }

        /* renamed from: component5, reason: from getter */
        public final FamilyInfo getFamilyInfo() {
            return this.familyInfo;
        }

        public final Card copy(CardId id, CardPaymentSystem system, String account, BankName bankName, FamilyInfo familyInfo, List<String> aliases) {
            return new Card(id, system, account, bankName, familyInfo, this.restrictions, null, aliases, this.payload);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other;
        }

        public final String getAccount() {
            return this.account;
        }

        public final List<String> getAliases$core_release() {
            return this.aliases;
        }

        public final BankName getBankName() {
            return this.bankName;
        }

        public final String getCardId() {
            return this.id.getValue();
        }

        public final String getErrorRespCode() {
            return this.errorRespCode;
        }

        public final FamilyInfo getFamilyInfo() {
            return this.familyInfo;
        }

        public final CardId getId() {
            return this.id;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final List<String> getRestrictions() {
            return this.restrictions;
        }

        public final CardPaymentSystem getSystem() {
            return this.system;
        }

        public int hashCode() {
            return this.id.getValue().hashCode();
        }

        public final boolean isNewCardId() {
            return jl40.l(getCardId(), "NEW_CARD");
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.id.writeToParcel(dest, flags);
            dest.writeString(this.system.name());
            dest.writeString(this.account);
            dest.writeString(this.bankName.name());
            FamilyInfo familyInfo = this.familyInfo;
            if (familyInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                familyInfo.writeToParcel(dest, flags);
            }
            dest.writeStringList(this.restrictions);
            dest.writeString(this.errorRespCode);
            dest.writeStringList(this.aliases);
            dest.writeString(this.payload);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                return new Card(CardId.CREATOR.createFromParcel(parcel), CardPaymentSystem.valueOf(parcel.readString()), parcel.readString(), BankName.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : FamilyInfo.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo, List<String> list, String str2, List<String> list2, String str3) {
            super(null);
            this.id = cardId;
            this.system = cardPaymentSystem;
            this.account = str;
            this.bankName = bankName;
            this.familyInfo = familyInfo;
            this.restrictions = list;
            this.errorRespCode = str2;
            this.aliases = list2;
            this.payload = str3;
        }

        public Card(CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo) {
            this(cardId, cardPaymentSystem, str, bankName, familyInfo, null, null, EmptyList.a, null, 256, null);
        }

        public Card(CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo, List<String> list) {
            this(cardId, cardPaymentSystem, str, bankName, familyInfo, null, null, list, null, 256, null);
        }

        public Card(CardId cardId, CardPaymentSystem cardPaymentSystem, String str, BankName bankName, FamilyInfo familyInfo, List<String> list, List<String> list2) {
            this(cardId, cardPaymentSystem, str, bankName, familyInfo, list, null, list2, null, 256, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$Cash;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cash extends PaymentMethod {
        public static final Cash INSTANCE = new Cash();
        public static final Parcelable.Creator<Cash> CREATOR = new Creator();

        private Cash() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Cash> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cash createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cash.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cash[] newArray(int i) {
                return new Cash[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$ChallengePollingMethod;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChallengePollingMethod extends PaymentMethod {
        public static final ChallengePollingMethod INSTANCE = new ChallengePollingMethod();
        public static final Parcelable.Creator<ChallengePollingMethod> CREATOR = new Creator();

        private ChallengePollingMethod() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ChallengePollingMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengePollingMethod createFromParcel(Parcel parcel) {
                parcel.readInt();
                return ChallengePollingMethod.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChallengePollingMethod[] newArray(int i) {
                return new ChallengePollingMethod[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$GooglePay;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GooglePay extends PaymentMethod {
        public static final GooglePay INSTANCE = new GooglePay();
        public static final Parcelable.Creator<GooglePay> CREATOR = new Creator();

        private GooglePay() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GooglePay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay createFromParcel(Parcel parcel) {
                parcel.readInt();
                return GooglePay.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePay[] newArray(int i) {
                return new GooglePay[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$NewCard;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewCard extends PaymentMethod {
        public static final NewCard INSTANCE = new NewCard();
        public static final Parcelable.Creator<NewCard> CREATOR = new Creator();

        private NewCard() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NewCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewCard createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewCard.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewCard[] newArray(int i) {
                return new NewCard[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$NewSbpToken;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewSbpToken extends PaymentMethod {
        public static final NewSbpToken INSTANCE = new NewSbpToken();
        public static final Parcelable.Creator<NewSbpToken> CREATOR = new Creator();

        private NewSbpToken() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NewSbpToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewSbpToken createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewSbpToken.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NewSbpToken[] newArray(int i) {
                return new NewSbpToken[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$Sbp;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Sbp extends PaymentMethod {
        public static final Sbp INSTANCE = new Sbp();
        public static final Parcelable.Creator<Sbp> CREATOR = new Creator();

        private Sbp() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Sbp> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sbp createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Sbp.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sbp[] newArray(int i) {
                return new Sbp[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0010BO\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0019\u0010\u0018Ja\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 H\u0096\u0002¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u001d¢\u0006\u0004\b%\u0010\u001fJ\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001d¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0013R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b8\u0010\u0013¨\u00069"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$SbpToken;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "", "id", "memberId", "memberName", "memberNameRus", "Landroid/net/Uri;", "lightLogoURL", "darkLogoURL", "errorRespCode", "", "aliases", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Landroid/net/Uri;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)Lcom/yandex/payment/sdk/core/data/PaymentMethod$SbpToken;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getMemberId", "getMemberName", "getMemberNameRus", "Landroid/net/Uri;", "getLightLogoURL", "getDarkLogoURL", "getErrorRespCode", "Ljava/util/List;", "getAliases$core_release", "()Ljava/util/List;", "getPayload", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SbpToken extends PaymentMethod {
        public static final Parcelable.Creator<SbpToken> CREATOR = new Creator();
        private final List<String> aliases;
        private final Uri darkLogoURL;
        private final String errorRespCode;
        private final String id;
        private final Uri lightLogoURL;
        private final String memberId;
        private final String memberName;
        private final String memberNameRus;
        private final String payload;

        public /* synthetic */ SbpToken(String str, String str2, String str3, String str4, Uri uri, Uri uri2, String str5, List list, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, uri, uri2, str5, (i & 128) != 0 ? EmptyList.a : list, (i & 256) != 0 ? null : str6);
        }

        public static /* synthetic */ SbpToken copy$default(SbpToken sbpToken, String str, String str2, String str3, String str4, Uri uri, Uri uri2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sbpToken.id;
            }
            if ((i & 2) != 0) {
                str2 = sbpToken.memberId;
            }
            if ((i & 4) != 0) {
                str3 = sbpToken.memberName;
            }
            if ((i & 8) != 0) {
                str4 = sbpToken.memberNameRus;
            }
            if ((i & 16) != 0) {
                uri = sbpToken.lightLogoURL;
            }
            if ((i & 32) != 0) {
                uri2 = sbpToken.darkLogoURL;
            }
            if ((i & 64) != 0) {
                list = sbpToken.aliases;
            }
            Uri uri3 = uri2;
            List list2 = list;
            Uri uri4 = uri;
            String str5 = str3;
            return sbpToken.copy(str, str2, str5, str4, uri4, uri3, list2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMemberId() {
            return this.memberId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMemberName() {
            return this.memberName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMemberNameRus() {
            return this.memberNameRus;
        }

        /* renamed from: component5, reason: from getter */
        public final Uri getLightLogoURL() {
            return this.lightLogoURL;
        }

        /* renamed from: component6, reason: from getter */
        public final Uri getDarkLogoURL() {
            return this.darkLogoURL;
        }

        public final SbpToken copy(String id, String memberId, String memberName, String memberNameRus, Uri lightLogoURL, Uri darkLogoURL, List<String> aliases) {
            return new SbpToken(id, memberId, memberName, memberNameRus, lightLogoURL, darkLogoURL, aliases);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other;
        }

        public final List<String> getAliases$core_release() {
            return this.aliases;
        }

        public final Uri getDarkLogoURL() {
            return this.darkLogoURL;
        }

        public final String getErrorRespCode() {
            return this.errorRespCode;
        }

        public final String getId() {
            return this.id;
        }

        public final Uri getLightLogoURL() {
            return this.lightLogoURL;
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

        public final String getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeString(this.memberId);
            dest.writeString(this.memberName);
            dest.writeString(this.memberNameRus);
            dest.writeParcelable(this.lightLogoURL, flags);
            dest.writeParcelable(this.darkLogoURL, flags);
            dest.writeString(this.errorRespCode);
            dest.writeStringList(this.aliases);
            dest.writeString(this.payload);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SbpToken> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpToken createFromParcel(Parcel parcel) {
                return new SbpToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(SbpToken.class.getClassLoader()), (Uri) parcel.readParcelable(SbpToken.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SbpToken[] newArray(int i) {
                return new SbpToken[i];
            }
        }

        public SbpToken(String str, String str2, String str3, String str4, Uri uri, Uri uri2, String str5, List<String> list, String str6) {
            super(null);
            this.id = str;
            this.memberId = str2;
            this.memberName = str3;
            this.memberNameRus = str4;
            this.lightLogoURL = uri;
            this.darkLogoURL = uri2;
            this.errorRespCode = str5;
            this.aliases = list;
            this.payload = str6;
        }

        public SbpToken(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, null, null, null, EmptyList.a, null, 256, null);
        }

        public SbpToken(String str, String str2, String str3, String str4, Uri uri, Uri uri2, List<String> list) {
            this(str, str2, str3, str4, uri, uri2, null, list, null, 256, null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$Split;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Split extends PaymentMethod {
        public static final Split INSTANCE = new Split();
        public static final Parcelable.Creator<Split> CREATOR = new Creator();

        private Split() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Split> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Split createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Split.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Split[] newArray(int i) {
                return new Split[i];
            }
        }
    }

    @jxi
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$TinkoffCredit;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TinkoffCredit extends PaymentMethod {
        public static final TinkoffCredit INSTANCE = new TinkoffCredit();
        public static final Parcelable.Creator<TinkoffCredit> CREATOR = new Creator();

        private TinkoffCredit() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TinkoffCredit> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TinkoffCredit createFromParcel(Parcel parcel) {
                parcel.readInt();
                return TinkoffCredit.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TinkoffCredit[] newArray(int i) {
                return new TinkoffCredit[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BS\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0010B3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0011B=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0012J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001b¢\u0006\u0004\b#\u0010\u001dJ\u001d\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001b¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b6\u0010\u0016R\u0017\u00107\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010 R\u0017\u0010:\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010 ¨\u0006<"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethod$YBMethod;", "Lcom/yandex/payment/sdk/core/data/PaymentMethod;", "", "id", "", "isOwner", "Lcom/yandex/payment/sdk/core/data/YBCardType;", "type", "Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "familyInfo", "errorRespCode", "", "aliases", "payload", "<init>", "(Ljava/lang/String;ZLcom/yandex/payment/sdk/core/data/YBCardType;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "(Ljava/lang/String;ZLcom/yandex/payment/sdk/core/data/YBCardType;)V", "(Ljava/lang/String;ZLcom/yandex/payment/sdk/core/data/YBCardType;Ljava/util/List;)V", "(Ljava/lang/String;ZLcom/yandex/payment/sdk/core/data/YBCardType;Lcom/yandex/payment/sdk/core/data/FamilyInfo;Ljava/util/List;)V", "copy", "(Ljava/lang/String;ZLcom/yandex/payment/sdk/core/data/YBCardType;Ljava/util/List;)Lcom/yandex/payment/sdk/core/data/PaymentMethod$YBMethod;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "component2", "()Z", "component3", "()Lcom/yandex/payment/sdk/core/data/YBCardType;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Z", "Lcom/yandex/payment/sdk/core/data/YBCardType;", "getType", "Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "getFamilyInfo", "()Lcom/yandex/payment/sdk/core/data/FamilyInfo;", "getErrorRespCode", "Ljava/util/List;", "getAliases$core_release", "()Ljava/util/List;", "getPayload", "isProCard", "isProCard$annotations", "()V", "isSplitCard", "isSplitCard$annotations", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YBMethod extends PaymentMethod {
        public static final Parcelable.Creator<YBMethod> CREATOR = new Creator();
        private final List<String> aliases;
        private final String errorRespCode;
        private final FamilyInfo familyInfo;
        private final String id;
        private final boolean isOwner;
        private final String payload;
        private final YBCardType type;

        public /* synthetic */ YBMethod(String str, boolean z, YBCardType yBCardType, FamilyInfo familyInfo, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? YBCardType.PlusCard : yBCardType, familyInfo, str2, (List<String>) ((i & 32) != 0 ? EmptyList.a : list), (i & 64) != 0 ? null : str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ YBMethod copy$default(YBMethod yBMethod, String str, boolean z, YBCardType yBCardType, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yBMethod.id;
            }
            if ((i & 2) != 0) {
                z = yBMethod.isOwner;
            }
            if ((i & 4) != 0) {
                yBCardType = yBMethod.type;
            }
            if ((i & 8) != 0) {
                list = yBMethod.aliases;
            }
            return yBMethod.copy(str, z, yBCardType, list);
        }

        public static /* synthetic */ void isProCard$annotations() {
        }

        public static /* synthetic */ void isSplitCard$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsOwner() {
            return this.isOwner;
        }

        /* renamed from: component3, reason: from getter */
        public final YBCardType getType() {
            return this.type;
        }

        public final YBMethod copy(String id, boolean isOwner, YBCardType type, List<String> aliases) {
            return new YBMethod(id, isOwner, type, this.familyInfo, aliases);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other;
        }

        public final List<String> getAliases$core_release() {
            return this.aliases;
        }

        public final String getErrorRespCode() {
            return this.errorRespCode;
        }

        public final FamilyInfo getFamilyInfo() {
            return this.familyInfo;
        }

        public final String getId() {
            return this.id;
        }

        public final String getPayload() {
            return this.payload;
        }

        public final YBCardType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public final boolean isOwner() {
            return this.isOwner;
        }

        public final boolean isProCard() {
            return this.type == YBCardType.ProCard;
        }

        public final boolean isSplitCard() {
            return this.type == YBCardType.SplitCard;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.id);
            dest.writeInt(this.isOwner ? 1 : 0);
            this.type.writeToParcel(dest, flags);
            FamilyInfo familyInfo = this.familyInfo;
            if (familyInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                familyInfo.writeToParcel(dest, flags);
            }
            dest.writeString(this.errorRespCode);
            dest.writeStringList(this.aliases);
            dest.writeString(this.payload);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<YBMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YBMethod createFromParcel(Parcel parcel) {
                return new YBMethod(parcel.readString(), parcel.readInt() != 0, YBCardType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FamilyInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final YBMethod[] newArray(int i) {
                return new YBMethod[i];
            }
        }

        public YBMethod(String str, boolean z, YBCardType yBCardType, FamilyInfo familyInfo, String str2, List<String> list, String str3) {
            super(null);
            this.id = str;
            this.isOwner = z;
            this.type = yBCardType;
            this.familyInfo = familyInfo;
            this.errorRespCode = str2;
            this.aliases = list;
            this.payload = str3;
        }

        public /* synthetic */ YBMethod(String str, boolean z, YBCardType yBCardType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? YBCardType.PlusCard : yBCardType);
        }

        public YBMethod(String str, boolean z, YBCardType yBCardType) {
            this(str, z, yBCardType, null, null, EmptyList.a, null, 64, null);
        }

        public /* synthetic */ YBMethod(String str, boolean z, YBCardType yBCardType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? YBCardType.PlusCard : yBCardType, (i & 8) != 0 ? EmptyList.a : list);
        }

        public YBMethod(String str, boolean z, YBCardType yBCardType, List<String> list) {
            this(str, z, yBCardType, null, null, list, null, 64, null);
        }

        public /* synthetic */ YBMethod(String str, boolean z, YBCardType yBCardType, FamilyInfo familyInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, (i & 4) != 0 ? YBCardType.PlusCard : yBCardType, familyInfo, (List<String>) ((i & 16) != 0 ? EmptyList.a : list));
        }

        public YBMethod(String str, boolean z, YBCardType yBCardType, FamilyInfo familyInfo, List<String> list) {
            this(str, z, yBCardType, familyInfo, null, list, null, 64, null);
        }
    }

    private PaymentMethod() {
    }
}
