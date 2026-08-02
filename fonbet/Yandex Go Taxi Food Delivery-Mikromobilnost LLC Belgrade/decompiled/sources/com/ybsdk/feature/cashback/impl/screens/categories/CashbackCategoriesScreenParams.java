package com.ybsdk.feature.cashback.impl.screens.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams;", "Lcom/ybsdk/core/navigation/ScreenParams;", "agreementId", "", "<init>", "(Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "Prefetched", "UnknownPromo", "Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$Prefetched;", "Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$UnknownPromo;", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CashbackCategoriesScreenParams implements ScreenParams {
    private final String agreementId;

    private CashbackCategoriesScreenParams(String str) {
        this.agreementId = str;
    }

    public String getAgreementId() {
        return this.agreementId;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$Prefetched;", "Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams;", "", "agreementId", "Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;", "suggestedCashbackPromo", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;)Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$Prefetched;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "Lcom/ybsdk/feature/cashback/impl/entities/SuggestedCashbackPromoEntity;", "getSuggestedCashbackPromo", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Prefetched extends CashbackCategoriesScreenParams {
        public static final Parcelable.Creator<Prefetched> CREATOR = new Creator();
        private final String agreementId;
        private final SuggestedCashbackPromoEntity suggestedCashbackPromo;

        public Prefetched(String str, SuggestedCashbackPromoEntity suggestedCashbackPromoEntity) {
            super(str, null);
            this.agreementId = str;
            this.suggestedCashbackPromo = suggestedCashbackPromoEntity;
        }

        public static /* synthetic */ Prefetched copy$default(Prefetched prefetched, String str, SuggestedCashbackPromoEntity suggestedCashbackPromoEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                str = prefetched.agreementId;
            }
            if ((i & 2) != 0) {
                suggestedCashbackPromoEntity = prefetched.suggestedCashbackPromo;
            }
            return prefetched.copy(str, suggestedCashbackPromoEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component2, reason: from getter */
        public final SuggestedCashbackPromoEntity getSuggestedCashbackPromo() {
            return this.suggestedCashbackPromo;
        }

        public final Prefetched copy(String agreementId, SuggestedCashbackPromoEntity suggestedCashbackPromo) {
            return new Prefetched(agreementId, suggestedCashbackPromo);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Prefetched)) {
                return false;
            }
            Prefetched prefetched = (Prefetched) other;
            return jl40.l(this.agreementId, prefetched.agreementId) && jl40.l(this.suggestedCashbackPromo, prefetched.suggestedCashbackPromo);
        }

        @Override // com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams
        public String getAgreementId() {
            return this.agreementId;
        }

        public final SuggestedCashbackPromoEntity getSuggestedCashbackPromo() {
            return this.suggestedCashbackPromo;
        }

        public int hashCode() {
            return this.suggestedCashbackPromo.hashCode() + (this.agreementId.hashCode() * 31);
        }

        public String toString() {
            return "Prefetched(agreementId=" + this.agreementId + ", suggestedCashbackPromo=" + this.suggestedCashbackPromo + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            this.suggestedCashbackPromo.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Prefetched> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Prefetched createFromParcel(Parcel parcel) {
                return new Prefetched(parcel.readString(), SuggestedCashbackPromoEntity.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Prefetched[] newArray(int i) {
                return new Prefetched[i];
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$UnknownPromo;", "Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams;", "", "agreementId", "promoID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/feature/cashback/impl/screens/categories/CashbackCategoriesScreenParams$UnknownPromo;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAgreementId", "getPromoID", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnknownPromo extends CashbackCategoriesScreenParams {
        public static final Parcelable.Creator<UnknownPromo> CREATOR = new Creator();
        private final String agreementId;
        private final String promoID;

        public UnknownPromo(String str, String str2) {
            super(str, null);
            this.agreementId = str;
            this.promoID = str2;
        }

        public static /* synthetic */ UnknownPromo copy$default(UnknownPromo unknownPromo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownPromo.agreementId;
            }
            if ((i & 2) != 0) {
                str2 = unknownPromo.promoID;
            }
            return unknownPromo.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementId() {
            return this.agreementId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPromoID() {
            return this.promoID;
        }

        public final UnknownPromo copy(String agreementId, String promoID) {
            return new UnknownPromo(agreementId, promoID);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnknownPromo)) {
                return false;
            }
            UnknownPromo unknownPromo = (UnknownPromo) other;
            return jl40.l(this.agreementId, unknownPromo.agreementId) && jl40.l(this.promoID, unknownPromo.promoID);
        }

        @Override // com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesScreenParams
        public String getAgreementId() {
            return this.agreementId;
        }

        public final String getPromoID() {
            return this.promoID;
        }

        public int hashCode() {
            return this.promoID.hashCode() + (this.agreementId.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("UnknownPromo(agreementId=", this.agreementId, ", promoID=", this.promoID, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.agreementId);
            dest.writeString(this.promoID);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnknownPromo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownPromo createFromParcel(Parcel parcel) {
                return new UnknownPromo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UnknownPromo[] newArray(int i) {
                return new UnknownPromo[i];
            }
        }
    }

    public /* synthetic */ CashbackCategoriesScreenParams(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
