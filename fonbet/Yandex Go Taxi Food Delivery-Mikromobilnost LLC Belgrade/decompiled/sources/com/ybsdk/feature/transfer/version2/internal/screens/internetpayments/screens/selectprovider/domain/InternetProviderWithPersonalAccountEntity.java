package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/domain/InternetProviderWithPersonalAccountEntity;", "Landroid/os/Parcelable;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "provider", "", "personalAccount", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/selectprovider/domain/InternetProviderWithPersonalAccountEntity;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "getProvider", "Ljava/lang/String;", "getPersonalAccount", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InternetProviderWithPersonalAccountEntity implements Parcelable {
    public static final Parcelable.Creator<InternetProviderWithPersonalAccountEntity> CREATOR = new Creator();
    private final String personalAccount;
    private final PaymentProviderEntity provider;

    public InternetProviderWithPersonalAccountEntity(PaymentProviderEntity paymentProviderEntity, String str) {
        this.provider = paymentProviderEntity;
        this.personalAccount = str;
    }

    public static /* synthetic */ InternetProviderWithPersonalAccountEntity copy$default(InternetProviderWithPersonalAccountEntity internetProviderWithPersonalAccountEntity, PaymentProviderEntity paymentProviderEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProviderEntity = internetProviderWithPersonalAccountEntity.provider;
        }
        if ((i & 2) != 0) {
            str = internetProviderWithPersonalAccountEntity.personalAccount;
        }
        return internetProviderWithPersonalAccountEntity.copy(paymentProviderEntity, str);
    }

    /* renamed from: component1, reason: from getter */
    public final PaymentProviderEntity getProvider() {
        return this.provider;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPersonalAccount() {
        return this.personalAccount;
    }

    public final InternetProviderWithPersonalAccountEntity copy(PaymentProviderEntity provider, String personalAccount) {
        return new InternetProviderWithPersonalAccountEntity(provider, personalAccount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternetProviderWithPersonalAccountEntity)) {
            return false;
        }
        InternetProviderWithPersonalAccountEntity internetProviderWithPersonalAccountEntity = (InternetProviderWithPersonalAccountEntity) other;
        return jl40.l(this.provider, internetProviderWithPersonalAccountEntity.provider) && jl40.l(this.personalAccount, internetProviderWithPersonalAccountEntity.personalAccount);
    }

    public final String getPersonalAccount() {
        return this.personalAccount;
    }

    public final PaymentProviderEntity getProvider() {
        return this.provider;
    }

    public int hashCode() {
        int hashCode = this.provider.hashCode() * 31;
        String str = this.personalAccount;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InternetProviderWithPersonalAccountEntity(provider=" + this.provider + ", personalAccount=" + this.personalAccount + Extension.C_BRAKE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.provider, flags);
        dest.writeString(this.personalAccount);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InternetProviderWithPersonalAccountEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetProviderWithPersonalAccountEntity createFromParcel(Parcel parcel) {
            return new InternetProviderWithPersonalAccountEntity((PaymentProviderEntity) parcel.readParcelable(InternetProviderWithPersonalAccountEntity.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternetProviderWithPersonalAccountEntity[] newArray(int i) {
            return new InternetProviderWithPersonalAccountEntity[i];
        }
    }
}
