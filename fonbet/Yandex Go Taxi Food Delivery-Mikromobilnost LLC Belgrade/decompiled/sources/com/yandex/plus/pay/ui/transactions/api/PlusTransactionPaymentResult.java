package com.yandex.plus.pay.ui.transactions.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult;", "Landroid/os/Parcelable;", "Success", "Error", "Cancel", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Cancel;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Error;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Success;", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusTransactionPaymentResult extends Parcelable {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Cancel;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel implements PlusTransactionPaymentResult {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        private Cancel() {
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
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0014¨\u0006#"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Error;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionError;", "error", "", "errorScreenSkipped", "<init>", "(Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionError;Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionError;", "component2", "()Z", "copy", "(Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionError;Z)Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Error;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionError;", "getError", "Z", "getErrorScreenSkipped", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements PlusTransactionPaymentResult {
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final PlusTransactionError error;
        private final boolean errorScreenSkipped;

        public Error(PlusTransactionError plusTransactionError, boolean z) {
            this.error = plusTransactionError;
            this.errorScreenSkipped = z;
        }

        public static /* synthetic */ Error copy$default(Error error, PlusTransactionError plusTransactionError, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                plusTransactionError = error.error;
            }
            if ((i & 2) != 0) {
                z = error.errorScreenSkipped;
            }
            return error.copy(plusTransactionError, z);
        }

        /* renamed from: component1, reason: from getter */
        public final PlusTransactionError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getErrorScreenSkipped() {
            return this.errorScreenSkipped;
        }

        public final Error copy(PlusTransactionError error, boolean errorScreenSkipped) {
            return new Error(error, errorScreenSkipped);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return jl40.l(this.error, error.error) && this.errorScreenSkipped == error.errorScreenSkipped;
        }

        public final PlusTransactionError getError() {
            return this.error;
        }

        public final boolean getErrorScreenSkipped() {
            return this.errorScreenSkipped;
        }

        public int hashCode() {
            return Boolean.hashCode(this.errorScreenSkipped) + (this.error.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Error(error=");
            sb.append(this.error);
            sb.append(", errorScreenSkipped=");
            return unr0.u(sb, this.errorScreenSkipped, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.error.writeToParcel(dest, flags);
            dest.writeInt(this.errorScreenSkipped ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(PlusTransactionError.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Success;", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult;", "", "successScreenSkipped", "", "buttonId", "<init>", "(ZLjava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionPaymentResult$Success;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccessScreenSkipped", "Ljava/lang/String;", "getButtonId", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PlusTransactionPaymentResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final String buttonId;
        private final boolean successScreenSkipped;

        public Success(boolean z, String str) {
            this.successScreenSkipped = z;
            this.buttonId = str;
        }

        public static /* synthetic */ Success copy$default(Success success, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = success.successScreenSkipped;
            }
            if ((i & 2) != 0) {
                str = success.buttonId;
            }
            return success.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSuccessScreenSkipped() {
            return this.successScreenSkipped;
        }

        /* renamed from: component2, reason: from getter */
        public final String getButtonId() {
            return this.buttonId;
        }

        public final Success copy(boolean successScreenSkipped, String buttonId) {
            return new Success(successScreenSkipped, buttonId);
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
            return this.successScreenSkipped == success.successScreenSkipped && jl40.l(this.buttonId, success.buttonId);
        }

        public final String getButtonId() {
            return this.buttonId;
        }

        public final boolean getSuccessScreenSkipped() {
            return this.successScreenSkipped;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.successScreenSkipped) * 31;
            String str = this.buttonId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Success(successScreenSkipped=");
            sb.append(this.successScreenSkipped);
            sb.append(", buttonId=");
            return b64.p(sb, this.buttonId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.successScreenSkipped ? 1 : 0);
            dest.writeString(this.buttonId);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                return new Success(parcel.readInt() != 0, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }
    }
}
