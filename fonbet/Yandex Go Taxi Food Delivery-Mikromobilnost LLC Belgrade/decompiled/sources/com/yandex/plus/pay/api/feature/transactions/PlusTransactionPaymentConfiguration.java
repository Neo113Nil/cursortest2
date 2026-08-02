package com.yandex.plus.pay.api.feature.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionPaymentConfiguration;", "Landroid/os/Parcelable;", "", "isSbpEnabled", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "copy", "(Z)Lcom/yandex/plus/pay/api/feature/transactions/PlusTransactionPaymentConfiguration;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "pay-sdk-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTransactionPaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator<PlusTransactionPaymentConfiguration> CREATOR = new Creator();
    private final boolean isSbpEnabled;

    public PlusTransactionPaymentConfiguration(boolean z) {
        this.isSbpEnabled = z;
    }

    public static /* synthetic */ PlusTransactionPaymentConfiguration copy$default(PlusTransactionPaymentConfiguration plusTransactionPaymentConfiguration, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = plusTransactionPaymentConfiguration.isSbpEnabled;
        }
        return plusTransactionPaymentConfiguration.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSbpEnabled() {
        return this.isSbpEnabled;
    }

    public final PlusTransactionPaymentConfiguration copy(boolean isSbpEnabled) {
        return new PlusTransactionPaymentConfiguration(isSbpEnabled);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlusTransactionPaymentConfiguration) && this.isSbpEnabled == ((PlusTransactionPaymentConfiguration) other).isSbpEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSbpEnabled);
    }

    public final boolean isSbpEnabled() {
        return this.isSbpEnabled;
    }

    public String toString() {
        return unr0.u(new StringBuilder("PlusTransactionPaymentConfiguration(isSbpEnabled="), this.isSbpEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isSbpEnabled ? 1 : 0);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTransactionPaymentConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionPaymentConfiguration createFromParcel(Parcel parcel) {
            return new PlusTransactionPaymentConfiguration(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionPaymentConfiguration[] newArray(int i) {
            return new PlusTransactionPaymentConfiguration[i];
        }
    }
}
