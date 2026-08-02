package com.yandex.plus.pay.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cgd0;
import defpackage.scc;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\rJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lcom/yandex/plus/pay/api/analytics/PlusPayTestId;", "Landroid/os/Parcelable;", "", "value", "bucketNumber", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "toExpBoxFormat", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/yandex/plus/pay/api/analytics/PlusPayTestId;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue", "getBucketNumber", "Companion", "cgd0", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusPayTestId implements Parcelable {
    private final long bucketNumber;
    private final long value;
    public static final cgd0 Companion = new cgd0();
    public static final Parcelable.Creator<PlusPayTestId> CREATOR = new Creator();

    public PlusPayTestId(long j, long j2) {
        this.value = j;
        this.bucketNumber = j2;
    }

    public static /* synthetic */ PlusPayTestId copy$default(PlusPayTestId plusPayTestId, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = plusPayTestId.value;
        }
        if ((i & 2) != 0) {
            j2 = plusPayTestId.bucketNumber;
        }
        return plusPayTestId.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final long getBucketNumber() {
        return this.bucketNumber;
    }

    public final PlusPayTestId copy(long value, long bucketNumber) {
        return new PlusPayTestId(value, bucketNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusPayTestId)) {
            return false;
        }
        PlusPayTestId plusPayTestId = (PlusPayTestId) other;
        return this.value == plusPayTestId.value && this.bucketNumber == plusPayTestId.bucketNumber;
    }

    public final long getBucketNumber() {
        return this.bucketNumber;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.bucketNumber) + (Long.hashCode(this.value) * 31);
    }

    public final String toExpBoxFormat() {
        return kotlin.collections.a.X(scc.g(Long.valueOf(this.value), 0L, Long.valueOf(this.bucketNumber)), ",", null, null, null, 62);
    }

    public String toString() {
        return toExpBoxFormat();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.value);
        dest.writeLong(this.bucketNumber);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayTestId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayTestId createFromParcel(Parcel parcel) {
            return new PlusPayTestId(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayTestId[] newArray(int i) {
            return new PlusPayTestId[i];
        }
    }
}
