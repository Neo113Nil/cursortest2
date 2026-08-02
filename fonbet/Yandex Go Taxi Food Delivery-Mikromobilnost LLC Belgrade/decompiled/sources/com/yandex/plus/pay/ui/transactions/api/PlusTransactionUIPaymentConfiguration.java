package com.yandex.plus.pay.ui.transactions.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.dqd0;
import defpackage.jl40;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, d2 = {"Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionUIPaymentConfiguration;", "Landroid/os/Parcelable;", "", "Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionScreen;", "screensToSkip", "", "paymentMethodId", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Set;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/Set;Ljava/lang/String;)Lcom/yandex/plus/pay/ui/transactions/api/PlusTransactionUIPaymentConfiguration;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getScreensToSkip", "Ljava/lang/String;", "getPaymentMethodId", "Companion", "dqd0", "pay-sdk-ui-transactions-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusTransactionUIPaymentConfiguration implements Parcelable {
    private final String paymentMethodId;
    private final Set<PlusTransactionScreen> screensToSkip;
    public static final dqd0 Companion = new dqd0();
    public static final Parcelable.Creator<PlusTransactionUIPaymentConfiguration> CREATOR = new Creator();

    /* JADX WARN: Multi-variable type inference failed */
    public PlusTransactionUIPaymentConfiguration(Set<? extends PlusTransactionScreen> set, String str) {
        this.screensToSkip = set;
        this.paymentMethodId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusTransactionUIPaymentConfiguration copy$default(PlusTransactionUIPaymentConfiguration plusTransactionUIPaymentConfiguration, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = plusTransactionUIPaymentConfiguration.screensToSkip;
        }
        if ((i & 2) != 0) {
            str = plusTransactionUIPaymentConfiguration.paymentMethodId;
        }
        return plusTransactionUIPaymentConfiguration.copy(set, str);
    }

    public final Set<PlusTransactionScreen> component1() {
        return this.screensToSkip;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PlusTransactionUIPaymentConfiguration copy(Set<? extends PlusTransactionScreen> screensToSkip, String paymentMethodId) {
        return new PlusTransactionUIPaymentConfiguration(screensToSkip, paymentMethodId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusTransactionUIPaymentConfiguration)) {
            return false;
        }
        PlusTransactionUIPaymentConfiguration plusTransactionUIPaymentConfiguration = (PlusTransactionUIPaymentConfiguration) other;
        return jl40.l(this.screensToSkip, plusTransactionUIPaymentConfiguration.screensToSkip) && jl40.l(this.paymentMethodId, plusTransactionUIPaymentConfiguration.paymentMethodId);
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final Set<PlusTransactionScreen> getScreensToSkip() {
        return this.screensToSkip;
    }

    public int hashCode() {
        int hashCode = this.screensToSkip.hashCode() * 31;
        String str = this.paymentMethodId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusTransactionUIPaymentConfiguration(screensToSkip=");
        sb.append(this.screensToSkip);
        sb.append(", paymentMethodId=");
        return b64.p(sb, this.paymentMethodId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Set<PlusTransactionScreen> set = this.screensToSkip;
        dest.writeInt(set.size());
        Iterator<PlusTransactionScreen> it = set.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeString(this.paymentMethodId);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusTransactionUIPaymentConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionUIPaymentConfiguration createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(PlusTransactionScreen.valueOf(parcel.readString()));
            }
            return new PlusTransactionUIPaymentConfiguration(linkedHashSet, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusTransactionUIPaymentConfiguration[] newArray(int i) {
            return new PlusTransactionUIPaymentConfiguration[i];
        }
    }
}
