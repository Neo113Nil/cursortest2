package com.yandex.plus.pay.repository.api.model.offers;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006#"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;", "Landroid/os/Parcelable;", "", "purchaseToken", "Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;", "strategy", "<init>", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;", "copy", "(Ljava/lang/String;Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;)Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPurchaseToken", "Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;", "getStrategy", "Strategy", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InAppReplacementParams implements Parcelable {
    public static final Parcelable.Creator<InAppReplacementParams> CREATOR = new Creator();
    private final String purchaseToken;
    private final Strategy strategy;

    public InAppReplacementParams(String str, Strategy strategy) {
        this.purchaseToken = str;
        this.strategy = strategy;
    }

    public static /* synthetic */ InAppReplacementParams copy$default(InAppReplacementParams inAppReplacementParams, String str, Strategy strategy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppReplacementParams.purchaseToken;
        }
        if ((i & 2) != 0) {
            strategy = inAppReplacementParams.strategy;
        }
        return inAppReplacementParams.copy(str, strategy);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* renamed from: component2, reason: from getter */
    public final Strategy getStrategy() {
        return this.strategy;
    }

    public final InAppReplacementParams copy(String purchaseToken, Strategy strategy) {
        return new InAppReplacementParams(purchaseToken, strategy);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppReplacementParams)) {
            return false;
        }
        InAppReplacementParams inAppReplacementParams = (InAppReplacementParams) other;
        return jl40.l(this.purchaseToken, inAppReplacementParams.purchaseToken) && this.strategy == inAppReplacementParams.strategy;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final Strategy getStrategy() {
        return this.strategy;
    }

    public int hashCode() {
        return this.strategy.hashCode() + (this.purchaseToken.hashCode() * 31);
    }

    public String toString() {
        return "InAppReplacementParams(purchaseToken=" + this.purchaseToken + ", strategy=" + this.strategy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.purchaseToken);
        this.strategy.writeToParcel(dest, flags);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/offers/InAppReplacementParams$Strategy;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "CHARGE_FULL_PRICE", "DEFERRED", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Strategy implements Parcelable {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final Parcelable.Creator<Strategy> CREATOR;
        public static final Strategy CHARGE_FULL_PRICE = new Strategy("CHARGE_FULL_PRICE", 0);
        public static final Strategy DEFERRED = new Strategy("DEFERRED", 1);

        private static final /* synthetic */ Strategy[] $values() {
            return new Strategy[]{CHARGE_FULL_PRICE, DEFERRED};
        }

        static {
            Strategy[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            CREATOR = new Creator();
        }

        private Strategy(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name());
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Strategy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy createFromParcel(Parcel parcel) {
                return Strategy.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Strategy[] newArray(int i) {
                return new Strategy[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InAppReplacementParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InAppReplacementParams createFromParcel(Parcel parcel) {
            return new InAppReplacementParams(parcel.readString(), Strategy.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InAppReplacementParams[] newArray(int i) {
            return new InAppReplacementParams[i];
        }
    }
}
