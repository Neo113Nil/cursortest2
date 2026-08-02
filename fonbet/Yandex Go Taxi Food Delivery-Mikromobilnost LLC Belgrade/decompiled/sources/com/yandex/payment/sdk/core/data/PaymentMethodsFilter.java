package com.yandex.payment.sdk.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j73;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.vfc;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rB\t\b\u0016¢\u0006\u0004\b\f\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0011B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0012B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0013BE\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\\\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b,\u0010\u0017J\u001a\u0010/\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b\u0003\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b\u0004\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b\u0005\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b\u0006\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b\u0007\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b\b\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010&¨\u00064"}, d2 = {"Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;", "Landroid/os/Parcelable;", "", "isStoredCardAvailable", "isGooglePayAvailable", "isSBPAvailable", "isYBAccountAvailable", "isNewSbpTokenAvailable", "isSbpTokenAvailable", "", "Lcom/yandex/payment/sdk/core/data/YBCardType;", "availableYaCardTypes", "<init>", "(ZZZZZZLjava/util/Set;)V", "()V", "(Z)V", "(ZZ)V", "(ZZZ)V", "(ZZZZ)V", "(ZZZZZ)V", "(ZZZZZZ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Set;", "copy", "(ZZZZZZLjava/util/Set;)Lcom/yandex/payment/sdk/core/data/PaymentMethodsFilter;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/Set;", "getAvailableYaCardTypes", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PaymentMethodsFilter implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodsFilter> CREATOR = new Creator();
    private final Set<YBCardType> availableYaCardTypes;
    private final boolean isGooglePayAvailable;
    private final boolean isNewSbpTokenAvailable;
    private final boolean isSBPAvailable;
    private final boolean isSbpTokenAvailable;
    private final boolean isStoredCardAvailable;
    private final boolean isYBAccountAvailable;

    public /* synthetic */ PaymentMethodsFilter(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
    }

    public static /* synthetic */ PaymentMethodsFilter copy$default(PaymentMethodsFilter paymentMethodsFilter, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentMethodsFilter.isStoredCardAvailable;
        }
        if ((i & 2) != 0) {
            z2 = paymentMethodsFilter.isGooglePayAvailable;
        }
        if ((i & 4) != 0) {
            z3 = paymentMethodsFilter.isSBPAvailable;
        }
        if ((i & 8) != 0) {
            z4 = paymentMethodsFilter.isYBAccountAvailable;
        }
        if ((i & 16) != 0) {
            z5 = paymentMethodsFilter.isNewSbpTokenAvailable;
        }
        if ((i & 32) != 0) {
            z6 = paymentMethodsFilter.isSbpTokenAvailable;
        }
        if ((i & 64) != 0) {
            set = paymentMethodsFilter.availableYaCardTypes;
        }
        boolean z7 = z6;
        Set set2 = set;
        boolean z8 = z5;
        boolean z9 = z3;
        return paymentMethodsFilter.copy(z, z2, z9, z4, z8, z7, set2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsStoredCardAvailable() {
        return this.isStoredCardAvailable;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsGooglePayAvailable() {
        return this.isGooglePayAvailable;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSBPAvailable() {
        return this.isSBPAvailable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsYBAccountAvailable() {
        return this.isYBAccountAvailable;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNewSbpTokenAvailable() {
        return this.isNewSbpTokenAvailable;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSbpTokenAvailable() {
        return this.isSbpTokenAvailable;
    }

    public final Set<YBCardType> component7() {
        return this.availableYaCardTypes;
    }

    public final PaymentMethodsFilter copy(boolean isStoredCardAvailable, boolean isGooglePayAvailable, boolean isSBPAvailable, boolean isYBAccountAvailable, boolean isNewSbpTokenAvailable, boolean isSbpTokenAvailable, Set<? extends YBCardType> availableYaCardTypes) {
        return new PaymentMethodsFilter(isStoredCardAvailable, isGooglePayAvailable, isSBPAvailable, isYBAccountAvailable, isNewSbpTokenAvailable, isSbpTokenAvailable, availableYaCardTypes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodsFilter)) {
            return false;
        }
        PaymentMethodsFilter paymentMethodsFilter = (PaymentMethodsFilter) other;
        return this.isStoredCardAvailable == paymentMethodsFilter.isStoredCardAvailable && this.isGooglePayAvailable == paymentMethodsFilter.isGooglePayAvailable && this.isSBPAvailable == paymentMethodsFilter.isSBPAvailable && this.isYBAccountAvailable == paymentMethodsFilter.isYBAccountAvailable && this.isNewSbpTokenAvailable == paymentMethodsFilter.isNewSbpTokenAvailable && this.isSbpTokenAvailable == paymentMethodsFilter.isSbpTokenAvailable && jl40.l(this.availableYaCardTypes, paymentMethodsFilter.availableYaCardTypes);
    }

    public final Set<YBCardType> getAvailableYaCardTypes() {
        return this.availableYaCardTypes;
    }

    public int hashCode() {
        return this.availableYaCardTypes.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.isStoredCardAvailable) * 31, 31, this.isGooglePayAvailable), 31, this.isSBPAvailable), 31, this.isYBAccountAvailable), 31, this.isNewSbpTokenAvailable), 31, this.isSbpTokenAvailable);
    }

    public final boolean isGooglePayAvailable() {
        return this.isGooglePayAvailable;
    }

    public final boolean isNewSbpTokenAvailable() {
        return this.isNewSbpTokenAvailable;
    }

    public final boolean isSBPAvailable() {
        return this.isSBPAvailable;
    }

    public final boolean isSbpTokenAvailable() {
        return this.isSbpTokenAvailable;
    }

    public final boolean isStoredCardAvailable() {
        return this.isStoredCardAvailable;
    }

    public final boolean isYBAccountAvailable() {
        return this.isYBAccountAvailable;
    }

    public String toString() {
        boolean z = this.isStoredCardAvailable;
        boolean z2 = this.isGooglePayAvailable;
        boolean z3 = this.isSBPAvailable;
        boolean z4 = this.isYBAccountAvailable;
        boolean z5 = this.isNewSbpTokenAvailable;
        boolean z6 = this.isSbpTokenAvailable;
        Set<YBCardType> set = this.availableYaCardTypes;
        StringBuilder u = qv10.u("PaymentMethodsFilter(isStoredCardAvailable=", ", isGooglePayAvailable=", ", isSBPAvailable=", z, z2);
        nnm.v(", isYBAccountAvailable=", ", isNewSbpTokenAvailable=", u, z3, z4);
        nnm.v(", isSbpTokenAvailable=", ", availableYaCardTypes=", u, z5, z6);
        return vfc.q(u, set, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.isStoredCardAvailable ? 1 : 0);
        dest.writeInt(this.isGooglePayAvailable ? 1 : 0);
        dest.writeInt(this.isSBPAvailable ? 1 : 0);
        dest.writeInt(this.isYBAccountAvailable ? 1 : 0);
        dest.writeInt(this.isNewSbpTokenAvailable ? 1 : 0);
        dest.writeInt(this.isSbpTokenAvailable ? 1 : 0);
        Set<YBCardType> set = this.availableYaCardTypes;
        dest.writeInt(set.size());
        Iterator<YBCardType> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentMethodsFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsFilter createFromParcel(Parcel parcel) {
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(YBCardType.CREATOR.createFromParcel(parcel));
            }
            return new PaymentMethodsFilter(z, z2, z3, z4, z5, z6, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsFilter[] newArray(int i) {
            return new PaymentMethodsFilter[i];
        }
    }

    public PaymentMethodsFilter() {
        this(true, true, true, true, false, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    public PaymentMethodsFilter(boolean z) {
        this(z, true, true, true, false, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    public PaymentMethodsFilter(boolean z, boolean z2) {
        this(z, z2, true, true, false, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    public PaymentMethodsFilter(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, true, false, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    public PaymentMethodsFilter(boolean z, boolean z2, boolean z3, boolean z4) {
        this(z, z2, z3, z4, false, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    public PaymentMethodsFilter(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this(z, z2, z3, z4, z5, false, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsFilter(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Set<? extends YBCardType> set) {
        this.isStoredCardAvailable = z;
        this.isGooglePayAvailable = z2;
        this.isSBPAvailable = z3;
        this.isYBAccountAvailable = z4;
        this.isNewSbpTokenAvailable = z5;
        this.isSbpTokenAvailable = z6;
        this.availableYaCardTypes = set;
    }

    public PaymentMethodsFilter(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this(z, z2, z3, z4, z5, z6, j73.f0(new YBCardType[]{YBCardType.PlusCard, YBCardType.SplitCard, YBCardType.ProCard}));
    }
}
