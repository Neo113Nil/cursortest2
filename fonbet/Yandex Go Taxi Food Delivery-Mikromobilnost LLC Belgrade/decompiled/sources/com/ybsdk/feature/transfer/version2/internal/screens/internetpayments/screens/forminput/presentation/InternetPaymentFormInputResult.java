package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.dtw;
import defpackage.jl40;
import defpackage.wwg;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Companion", "Success", "dtw", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult$Success;", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InternetPaymentFormInputResult extends Parcelable {
    public static final dtw Companion = dtw.a;

    Bundle toBundle();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult$Success;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult;", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "provider", "", "accountNumber", "<init>", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;Ljava/lang/String;)Lcom/ybsdk/feature/transfer/version2/internal/screens/internetpayments/screens/forminput/presentation/InternetPaymentFormInputResult$Success;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/transfer/version2/api/entities/paymentmethodssheet/PaymentProviderEntity;", "getProvider", "Ljava/lang/String;", "getAccountNumber", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements InternetPaymentFormInputResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String accountNumber;
        private final PaymentProviderEntity provider;

        public Success(PaymentProviderEntity paymentProviderEntity, String str) {
            this.provider = paymentProviderEntity;
            this.accountNumber = str;
        }

        public static /* synthetic */ Success copy$default(Success success, PaymentProviderEntity paymentProviderEntity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentProviderEntity = success.provider;
            }
            if ((i & 2) != 0) {
                str = success.accountNumber;
            }
            return success.copy(paymentProviderEntity, str);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentProviderEntity getProvider() {
            return this.provider;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final Success copy(PaymentProviderEntity provider, String accountNumber) {
            return new Success(provider, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.provider, success.provider) && jl40.l(this.accountNumber, success.accountNumber);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final PaymentProviderEntity getProvider() {
            return this.provider;
        }

        public int hashCode() {
            return this.accountNumber.hashCode() + (this.provider.hashCode() * 31);
        }

        @Override // com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputResult
        public Bundle toBundle() {
            return wwg.g(new Pair("InternetPaymentFormInputResult", this));
        }

        public String toString() {
            return "Success(provider=" + this.provider + ", accountNumber=" + this.accountNumber + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeParcelable(this.provider, flags);
            dest.writeString(this.accountNumber);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success((PaymentProviderEntity) parcel.readParcelable(Success.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
