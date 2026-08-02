package com.ybsdk.feature.transfer.version2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "Landroid/os/Parcelable;", "Self", "Phone", "Requisites", "Hcs", "MobilePayment", "CommonTopup", "InternetPayment", "C2g", "InvoiceHcs", "CrossBorder", "Template", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$C2g;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Hcs;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InternetPayment;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InvoiceHcs;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$MobilePayment;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Phone;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Requisites;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Self;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Template;", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransferPrerequisites extends Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$C2g;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$C2g;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInvoiceId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C2g implements TransferPrerequisites {
        public static final Parcelable.Creator<C2g> CREATOR = new Creator();
        private final String invoiceId;

        public C2g(String str) {
            this.invoiceId = str;
        }

        public static /* synthetic */ C2g copy$default(C2g c2g, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c2g.invoiceId;
            }
            return c2g.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final C2g copy(String invoiceId) {
            return new C2g(invoiceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof C2g) && jl40.l(this.invoiceId, ((C2g) other).invoiceId);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public int hashCode() {
            return this.invoiceId.hashCode();
        }

        public String toString() {
            return oyr.p("C2g(invoiceId=", this.invoiceId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.invoiceId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<C2g> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C2g createFromParcel(Parcel parcel) {
                return new C2g(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final C2g[] newArray(int i) {
                return new C2g[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00011B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001bR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0019¨\u00062"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "Ljava/math/BigDecimal;", "amount", "", "currency", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;", "type", "", "suggestAmounts", "suggestBehaviour", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/math/BigDecimal;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;Ljava/util/List;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getAmount", "Ljava/lang/String;", "getCurrency", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;", "getType", "Ljava/util/List;", "getSuggestAmounts", "getSuggestBehaviour", "AmountType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CommonTopup implements TransferPrerequisites {
        public static final Parcelable.Creator<CommonTopup> CREATOR = new Creator();
        private final BigDecimal amount;
        private final String currency;
        private final List<BigDecimal> suggestAmounts;
        private final String suggestBehaviour;
        private final AmountType type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CommonTopup$AmountType;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "EXPECTED", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AmountType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ AmountType[] $VALUES;
            public static final AmountType EXACT = new AmountType("EXACT", 0);
            public static final AmountType EXPECTED = new AmountType("EXPECTED", 1);

            private static final /* synthetic */ AmountType[] $values() {
                return new AmountType[]{EXACT, EXPECTED};
            }

            static {
                AmountType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private AmountType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static AmountType valueOf(String str) {
                return (AmountType) Enum.valueOf(AmountType.class, str);
            }

            public static AmountType[] values() {
                return (AmountType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ CommonTopup(BigDecimal bigDecimal, String str, AmountType amountType, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bigDecimal, str, amountType, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str2);
        }

        public static /* synthetic */ CommonTopup copy$default(CommonTopup commonTopup, BigDecimal bigDecimal, String str, AmountType amountType, List list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = commonTopup.amount;
            }
            if ((i & 2) != 0) {
                str = commonTopup.currency;
            }
            if ((i & 4) != 0) {
                amountType = commonTopup.type;
            }
            if ((i & 8) != 0) {
                list = commonTopup.suggestAmounts;
            }
            if ((i & 16) != 0) {
                str2 = commonTopup.suggestBehaviour;
            }
            String str3 = str2;
            AmountType amountType2 = amountType;
            return commonTopup.copy(bigDecimal, str, amountType2, list, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final AmountType getType() {
            return this.type;
        }

        public final List<BigDecimal> component4() {
            return this.suggestAmounts;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSuggestBehaviour() {
            return this.suggestBehaviour;
        }

        public final CommonTopup copy(BigDecimal amount, String currency, AmountType type, List<? extends BigDecimal> suggestAmounts, String suggestBehaviour) {
            return new CommonTopup(amount, currency, type, suggestAmounts, suggestBehaviour);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonTopup)) {
                return false;
            }
            CommonTopup commonTopup = (CommonTopup) other;
            return jl40.l(this.amount, commonTopup.amount) && jl40.l(this.currency, commonTopup.currency) && this.type == commonTopup.type && jl40.l(this.suggestAmounts, commonTopup.suggestAmounts) && jl40.l(this.suggestBehaviour, commonTopup.suggestBehaviour);
        }

        public final BigDecimal getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final List<BigDecimal> getSuggestAmounts() {
            return this.suggestAmounts;
        }

        public final String getSuggestBehaviour() {
            return this.suggestBehaviour;
        }

        public final AmountType getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode = (this.type.hashCode() + unr0.b(this.amount.hashCode() * 31, 31, this.currency)) * 31;
            List<BigDecimal> list = this.suggestAmounts;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.suggestBehaviour;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            BigDecimal bigDecimal = this.amount;
            String str = this.currency;
            AmountType amountType = this.type;
            List<BigDecimal> list = this.suggestAmounts;
            String str2 = this.suggestBehaviour;
            StringBuilder sb = new StringBuilder("CommonTopup(amount=");
            sb.append(bigDecimal);
            sb.append(", currency=");
            sb.append(str);
            sb.append(", type=");
            sb.append(amountType);
            sb.append(", suggestAmounts=");
            sb.append(list);
            sb.append(", suggestBehaviour=");
            return oyr.t(sb, str2, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeSerializable(this.amount);
            dest.writeString(this.currency);
            dest.writeString(this.type.name());
            List<BigDecimal> list = this.suggestAmounts;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator m = oo31.m(dest, 1, list);
                while (m.hasNext()) {
                    dest.writeSerializable((Serializable) m.next());
                }
            }
            dest.writeString(this.suggestBehaviour);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CommonTopup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommonTopup createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                String readString = parcel.readString();
                AmountType valueOf = AmountType.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(parcel.readSerializable());
                    }
                    arrayList = arrayList2;
                }
                return new CommonTopup(bigDecimal, readString, valueOf, arrayList, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CommonTopup[] newArray(int i) {
                return new CommonTopup[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CommonTopup(BigDecimal bigDecimal, String str, AmountType amountType, List<? extends BigDecimal> list, String str2) {
            this.amount = bigDecimal;
            this.currency = str;
            this.type = amountType;
            this.suggestAmounts = list;
            this.suggestBehaviour = str2;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001@Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0086\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b8\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b=\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b>\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b?\u0010\u001c¨\u0006A"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "phone", "partnerId", "Ljava/math/BigDecimal;", "debitAmount", "debitCurrency", "creditAmount", "creditCurrency", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;", "priorityMoneyType", "currencyRate", "receiverFullName", "fee", "convertationTemplate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/math/BigDecimal;", "component4", "component5", "component6", "component7", "()Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "getPartnerId", "Ljava/math/BigDecimal;", "getDebitAmount", "getDebitCurrency", "getCreditAmount", "getCreditCurrency", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;", "getPriorityMoneyType", "getCurrencyRate", "getReceiverFullName", "getFee", "getConvertationTemplate", "PriorityMoneyType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CrossBorder implements TransferPrerequisites {
        public static final Parcelable.Creator<CrossBorder> CREATOR = new Creator();
        private final String convertationTemplate;
        private final BigDecimal creditAmount;
        private final String creditCurrency;
        private final String currencyRate;
        private final BigDecimal debitAmount;
        private final String debitCurrency;
        private final String fee;
        private final String partnerId;
        private final String phone;
        private final PriorityMoneyType priorityMoneyType;
        private final String receiverFullName;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$CrossBorder$PriorityMoneyType;", "", "<init>", "(Ljava/lang/String;I)V", Card.CARD_TYPE_DEBIT, Card.CARD_TYPE_CREDIT, "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PriorityMoneyType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ PriorityMoneyType[] $VALUES;
            public static final PriorityMoneyType DEBIT = new PriorityMoneyType(Card.CARD_TYPE_DEBIT, 0);
            public static final PriorityMoneyType CREDIT = new PriorityMoneyType(Card.CARD_TYPE_CREDIT, 1);

            private static final /* synthetic */ PriorityMoneyType[] $values() {
                return new PriorityMoneyType[]{DEBIT, CREDIT};
            }

            static {
                PriorityMoneyType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private PriorityMoneyType(String str, int i) {
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static PriorityMoneyType valueOf(String str) {
                return (PriorityMoneyType) Enum.valueOf(PriorityMoneyType.class, str);
            }

            public static PriorityMoneyType[] values() {
                return (PriorityMoneyType[]) $VALUES.clone();
            }
        }

        public CrossBorder(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, String str4, PriorityMoneyType priorityMoneyType, String str5, String str6, String str7, String str8) {
            this.phone = str;
            this.partnerId = str2;
            this.debitAmount = bigDecimal;
            this.debitCurrency = str3;
            this.creditAmount = bigDecimal2;
            this.creditCurrency = str4;
            this.priorityMoneyType = priorityMoneyType;
            this.currencyRate = str5;
            this.receiverFullName = str6;
            this.fee = str7;
            this.convertationTemplate = str8;
        }

        public static /* synthetic */ CrossBorder copy$default(CrossBorder crossBorder, String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, String str4, PriorityMoneyType priorityMoneyType, String str5, String str6, String str7, String str8, int i, Object obj) {
            if ((i & 1) != 0) {
                str = crossBorder.phone;
            }
            if ((i & 2) != 0) {
                str2 = crossBorder.partnerId;
            }
            if ((i & 4) != 0) {
                bigDecimal = crossBorder.debitAmount;
            }
            if ((i & 8) != 0) {
                str3 = crossBorder.debitCurrency;
            }
            if ((i & 16) != 0) {
                bigDecimal2 = crossBorder.creditAmount;
            }
            if ((i & 32) != 0) {
                str4 = crossBorder.creditCurrency;
            }
            if ((i & 64) != 0) {
                priorityMoneyType = crossBorder.priorityMoneyType;
            }
            if ((i & 128) != 0) {
                str5 = crossBorder.currencyRate;
            }
            if ((i & 256) != 0) {
                str6 = crossBorder.receiverFullName;
            }
            if ((i & 512) != 0) {
                str7 = crossBorder.fee;
            }
            if ((i & 1024) != 0) {
                str8 = crossBorder.convertationTemplate;
            }
            String str9 = str7;
            String str10 = str8;
            String str11 = str5;
            String str12 = str6;
            String str13 = str4;
            PriorityMoneyType priorityMoneyType2 = priorityMoneyType;
            BigDecimal bigDecimal3 = bigDecimal2;
            BigDecimal bigDecimal4 = bigDecimal;
            return crossBorder.copy(str, str2, bigDecimal4, str3, bigDecimal3, str13, priorityMoneyType2, str11, str12, str9, str10);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component10, reason: from getter */
        public final String getFee() {
            return this.fee;
        }

        /* renamed from: component11, reason: from getter */
        public final String getConvertationTemplate() {
            return this.convertationTemplate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getDebitAmount() {
            return this.debitAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDebitCurrency() {
            return this.debitCurrency;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getCreditAmount() {
            return this.creditAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCreditCurrency() {
            return this.creditCurrency;
        }

        /* renamed from: component7, reason: from getter */
        public final PriorityMoneyType getPriorityMoneyType() {
            return this.priorityMoneyType;
        }

        /* renamed from: component8, reason: from getter */
        public final String getCurrencyRate() {
            return this.currencyRate;
        }

        /* renamed from: component9, reason: from getter */
        public final String getReceiverFullName() {
            return this.receiverFullName;
        }

        public final CrossBorder copy(String phone, String partnerId, BigDecimal debitAmount, String debitCurrency, BigDecimal creditAmount, String creditCurrency, PriorityMoneyType priorityMoneyType, String currencyRate, String receiverFullName, String fee, String convertationTemplate) {
            return new CrossBorder(phone, partnerId, debitAmount, debitCurrency, creditAmount, creditCurrency, priorityMoneyType, currencyRate, receiverFullName, fee, convertationTemplate);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CrossBorder)) {
                return false;
            }
            CrossBorder crossBorder = (CrossBorder) other;
            return jl40.l(this.phone, crossBorder.phone) && jl40.l(this.partnerId, crossBorder.partnerId) && jl40.l(this.debitAmount, crossBorder.debitAmount) && jl40.l(this.debitCurrency, crossBorder.debitCurrency) && jl40.l(this.creditAmount, crossBorder.creditAmount) && jl40.l(this.creditCurrency, crossBorder.creditCurrency) && this.priorityMoneyType == crossBorder.priorityMoneyType && jl40.l(this.currencyRate, crossBorder.currencyRate) && jl40.l(this.receiverFullName, crossBorder.receiverFullName) && jl40.l(this.fee, crossBorder.fee) && jl40.l(this.convertationTemplate, crossBorder.convertationTemplate);
        }

        public final String getConvertationTemplate() {
            return this.convertationTemplate;
        }

        public final BigDecimal getCreditAmount() {
            return this.creditAmount;
        }

        public final String getCreditCurrency() {
            return this.creditCurrency;
        }

        public final String getCurrencyRate() {
            return this.currencyRate;
        }

        public final BigDecimal getDebitAmount() {
            return this.debitAmount;
        }

        public final String getDebitCurrency() {
            return this.debitCurrency;
        }

        public final String getFee() {
            return this.fee;
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final PriorityMoneyType getPriorityMoneyType() {
            return this.priorityMoneyType;
        }

        public final String getReceiverFullName() {
            return this.receiverFullName;
        }

        public int hashCode() {
            int hashCode = (this.priorityMoneyType.hashCode() + unr0.b(smw0.f(this.creditAmount, unr0.b(smw0.f(this.debitAmount, unr0.b(this.phone.hashCode() * 31, 31, this.partnerId), 31), 31, this.debitCurrency), 31), 31, this.creditCurrency)) * 31;
            String str = this.currencyRate;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.receiverFullName;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fee;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.convertationTemplate;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            String str = this.phone;
            String str2 = this.partnerId;
            BigDecimal bigDecimal = this.debitAmount;
            String str3 = this.debitCurrency;
            BigDecimal bigDecimal2 = this.creditAmount;
            String str4 = this.creditCurrency;
            PriorityMoneyType priorityMoneyType = this.priorityMoneyType;
            String str5 = this.currencyRate;
            String str6 = this.receiverFullName;
            String str7 = this.fee;
            String str8 = this.convertationTemplate;
            StringBuilder v = b64.v("CrossBorder(phone=", str, ", partnerId=", str2, ", debitAmount=");
            v.append(bigDecimal);
            v.append(", debitCurrency=");
            v.append(str3);
            v.append(", creditAmount=");
            v.append(bigDecimal2);
            v.append(", creditCurrency=");
            v.append(str4);
            v.append(", priorityMoneyType=");
            v.append(priorityMoneyType);
            v.append(", currencyRate=");
            v.append(str5);
            v.append(", receiverFullName=");
            g8e.D(v, str6, ", fee=", str7, ", convertationTemplate=");
            return oyr.t(v, str8, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.phone);
            dest.writeString(this.partnerId);
            dest.writeSerializable(this.debitAmount);
            dest.writeString(this.debitCurrency);
            dest.writeSerializable(this.creditAmount);
            dest.writeString(this.creditCurrency);
            dest.writeString(this.priorityMoneyType.name());
            dest.writeString(this.currencyRate);
            dest.writeString(this.receiverFullName);
            dest.writeString(this.fee);
            dest.writeString(this.convertationTemplate);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CrossBorder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorder createFromParcel(Parcel parcel) {
                return new CrossBorder(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), PriorityMoneyType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CrossBorder[] newArray(int i) {
                return new CrossBorder[i];
            }
        }

        public /* synthetic */ CrossBorder(String str, String str2, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, String str4, PriorityMoneyType priorityMoneyType, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, bigDecimal, str3, bigDecimal2, str4, priorityMoneyType, str5, str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Hcs;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "qrString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Hcs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQrString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Hcs implements TransferPrerequisites {
        public static final Parcelable.Creator<Hcs> CREATOR = new Creator();
        private final String qrString;

        public Hcs(String str) {
            this.qrString = str;
        }

        public static /* synthetic */ Hcs copy$default(Hcs hcs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hcs.qrString;
            }
            return hcs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQrString() {
            return this.qrString;
        }

        public final Hcs copy(String qrString) {
            return new Hcs(qrString);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Hcs) && jl40.l(this.qrString, ((Hcs) other).qrString);
        }

        public final String getQrString() {
            return this.qrString;
        }

        public int hashCode() {
            String str = this.qrString;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("Hcs(qrString=", this.qrString, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.qrString);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hcs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hcs createFromParcel(Parcel parcel) {
                return new Hcs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hcs[] newArray(int i) {
                return new Hcs[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InternetPayment;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "providerId", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InternetPayment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProviderId", "getAccountNumber", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InternetPayment implements TransferPrerequisites {
        public static final Parcelable.Creator<InternetPayment> CREATOR = new Creator();
        private final String accountNumber;
        private final String providerId;

        public InternetPayment(String str, String str2) {
            this.providerId = str;
            this.accountNumber = str2;
        }

        public static /* synthetic */ InternetPayment copy$default(InternetPayment internetPayment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = internetPayment.providerId;
            }
            if ((i & 2) != 0) {
                str2 = internetPayment.accountNumber;
            }
            return internetPayment.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InternetPayment copy(String providerId, String accountNumber) {
            return new InternetPayment(providerId, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InternetPayment)) {
                return false;
            }
            InternetPayment internetPayment = (InternetPayment) other;
            return jl40.l(this.providerId, internetPayment.providerId) && jl40.l(this.accountNumber, internetPayment.accountNumber);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public int hashCode() {
            return this.accountNumber.hashCode() + (this.providerId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("InternetPayment(providerId=", this.providerId, ", accountNumber=", this.accountNumber, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.providerId);
            dest.writeString(this.accountNumber);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InternetPayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternetPayment createFromParcel(Parcel parcel) {
                return new InternetPayment(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InternetPayment[] newArray(int i) {
                return new InternetPayment[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InvoiceHcs;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "invoiceId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$InvoiceHcs;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getInvoiceId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InvoiceHcs implements TransferPrerequisites {
        public static final Parcelable.Creator<InvoiceHcs> CREATOR = new Creator();
        private final String invoiceId;

        public InvoiceHcs(String str) {
            this.invoiceId = str;
        }

        public static /* synthetic */ InvoiceHcs copy$default(InvoiceHcs invoiceHcs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invoiceHcs.invoiceId;
            }
            return invoiceHcs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public final InvoiceHcs copy(String invoiceId) {
            return new InvoiceHcs(invoiceId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvoiceHcs) && jl40.l(this.invoiceId, ((InvoiceHcs) other).invoiceId);
        }

        public final String getInvoiceId() {
            return this.invoiceId;
        }

        public int hashCode() {
            return this.invoiceId.hashCode();
        }

        public String toString() {
            return oyr.p("InvoiceHcs(invoiceId=", this.invoiceId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.invoiceId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InvoiceHcs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvoiceHcs createFromParcel(Parcel parcel) {
                return new InvoiceHcs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvoiceHcs[] newArray(int i) {
                return new InvoiceHcs[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$MobilePayment;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "phone", "providerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$MobilePayment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "getProviderId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MobilePayment implements TransferPrerequisites {
        public static final Parcelable.Creator<MobilePayment> CREATOR = new Creator();
        private final String phone;
        private final String providerId;

        public MobilePayment(String str, String str2) {
            this.phone = str;
            this.providerId = str2;
        }

        public static /* synthetic */ MobilePayment copy$default(MobilePayment mobilePayment, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mobilePayment.phone;
            }
            if ((i & 2) != 0) {
                str2 = mobilePayment.providerId;
            }
            return mobilePayment.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        public final MobilePayment copy(String phone, String providerId) {
            return new MobilePayment(phone, providerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobilePayment)) {
                return false;
            }
            MobilePayment mobilePayment = (MobilePayment) other;
            return jl40.l(this.phone, mobilePayment.phone) && jl40.l(this.providerId, mobilePayment.providerId);
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public int hashCode() {
            return this.providerId.hashCode() + (this.phone.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("MobilePayment(phone=", this.phone, ", providerId=", this.providerId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.phone);
            dest.writeString(this.providerId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MobilePayment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobilePayment createFromParcel(Parcel parcel) {
                return new MobilePayment(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobilePayment[] newArray(int i) {
                return new MobilePayment[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Phone;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "phone", "partnerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Phone;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPhone", "getPartnerId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Phone implements TransferPrerequisites {
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();
        private final String partnerId;
        private final String phone;

        public Phone(String str, String str2) {
            this.phone = str;
            this.partnerId = str2;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.phone;
            }
            if ((i & 2) != 0) {
                str2 = phone.partnerId;
            }
            return phone.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPartnerId() {
            return this.partnerId;
        }

        public final Phone copy(String phone, String partnerId) {
            return new Phone(phone, partnerId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return jl40.l(this.phone, phone.phone) && jl40.l(this.partnerId, phone.partnerId);
        }

        public final String getPartnerId() {
            return this.partnerId;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.partnerId.hashCode() + (this.phone.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("Phone(phone=", this.phone, ", partnerId=", this.partnerId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.phone);
            dest.writeString(this.partnerId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Phone> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                return new Phone(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i) {
                return new Phone[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Requisites;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "qrString", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Requisites;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getQrString", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Requisites implements TransferPrerequisites {
        public static final Parcelable.Creator<Requisites> CREATOR = new Creator();
        private final String qrString;

        public Requisites(String str) {
            this.qrString = str;
        }

        public static /* synthetic */ Requisites copy$default(Requisites requisites, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requisites.qrString;
            }
            return requisites.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getQrString() {
            return this.qrString;
        }

        public final Requisites copy(String qrString) {
            return new Requisites(qrString);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Requisites) && jl40.l(this.qrString, ((Requisites) other).qrString);
        }

        public final String getQrString() {
            return this.qrString;
        }

        public int hashCode() {
            String str = this.qrString;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return oyr.p("Requisites(qrString=", this.qrString, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.qrString);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Requisites> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Requisites createFromParcel(Parcel parcel) {
                return new Requisites(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Requisites[] newArray(int i) {
                return new Requisites[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Self;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "agreementId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Self;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Self implements TransferPrerequisites {
        public static final Parcelable.Creator<Self> CREATOR = new Creator();
        private final String agreementId;

        public Self(String str) {
            this.agreementId = str;
        }

        public static /* synthetic */ Self copy$default(Self self, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = self.agreementId;
            }
            return self.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        public final Self copy(String agreementId) {
            return new Self(agreementId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Self) && jl40.l(this.agreementId, ((Self) other).agreementId);
        }

        public final String getAgreementId() {
            return this.agreementId;
        }

        public int hashCode() {
            return this.agreementId.hashCode();
        }

        public String toString() {
            return oyr.p("Self(agreementId=", this.agreementId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Self> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Self createFromParcel(Parcel parcel) {
                return new Self(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Self[] newArray(int i) {
                return new Self[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0012¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Template;", "Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites;", "", "templateId", "type", "templateType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/api/TransferPrerequisites$Template;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateId", "getType", "getTemplateType", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Template implements TransferPrerequisites {
        public static final Parcelable.Creator<Template> CREATOR = new Creator();
        private final String templateId;
        private final String templateType;
        private final String type;

        public Template(String str, String str2, String str3) {
            this.templateId = str;
            this.type = str2;
            this.templateType = str3;
        }

        public static /* synthetic */ Template copy$default(Template template, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = template.templateId;
            }
            if ((i & 2) != 0) {
                str2 = template.type;
            }
            if ((i & 4) != 0) {
                str3 = template.templateType;
            }
            return template.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTemplateType() {
            return this.templateType;
        }

        public final Template copy(String templateId, String type, String templateType) {
            return new Template(templateId, type, templateType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Template)) {
                return false;
            }
            Template template = (Template) other;
            return jl40.l(this.templateId, template.templateId) && jl40.l(this.type, template.type) && jl40.l(this.templateType, template.templateType);
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int b = unr0.b(this.templateId.hashCode() * 31, 31, this.type);
            String str = this.templateType;
            return b + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.templateId;
            String str2 = this.type;
            return oyr.t(b64.v("Template(templateId=", str, ", type=", str2, ", templateType="), this.templateType, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.templateId);
            dest.writeString(this.type);
            dest.writeString(this.templateType);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Template> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template createFromParcel(Parcel parcel) {
                return new Template(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Template[] newArray(int i) {
                return new Template[i];
            }
        }

        public /* synthetic */ Template(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}
