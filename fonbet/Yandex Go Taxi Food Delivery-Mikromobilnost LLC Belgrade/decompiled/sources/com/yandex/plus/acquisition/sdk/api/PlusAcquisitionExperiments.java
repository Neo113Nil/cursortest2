package com.yandex.plus.acquisition.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionExperiments;", "Landroid/os/Parcelable;", "", "Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionExperiments$TestId;", "testIds", "", "flags", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Set;", "component2", "copy", "(Ljava/util/Set;Ljava/util/Set;)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionExperiments;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getTestIds", "getFlags", "TestId", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionExperiments implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionExperiments> CREATOR = new Creator();
    private final Set<String> flags;
    private final Set<TestId> testIds;

    public PlusAcquisitionExperiments(Set<TestId> set, Set<String> set2) {
        this.testIds = set;
        this.flags = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusAcquisitionExperiments copy$default(PlusAcquisitionExperiments plusAcquisitionExperiments, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = plusAcquisitionExperiments.testIds;
        }
        if ((i & 2) != 0) {
            set2 = plusAcquisitionExperiments.flags;
        }
        return plusAcquisitionExperiments.copy(set, set2);
    }

    public final Set<TestId> component1() {
        return this.testIds;
    }

    public final Set<String> component2() {
        return this.flags;
    }

    public final PlusAcquisitionExperiments copy(Set<TestId> testIds, Set<String> flags) {
        return new PlusAcquisitionExperiments(testIds, flags);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionExperiments)) {
            return false;
        }
        PlusAcquisitionExperiments plusAcquisitionExperiments = (PlusAcquisitionExperiments) other;
        return jl40.l(this.testIds, plusAcquisitionExperiments.testIds) && jl40.l(this.flags, plusAcquisitionExperiments.flags);
    }

    public final Set<String> getFlags() {
        return this.flags;
    }

    public final Set<TestId> getTestIds() {
        return this.testIds;
    }

    public int hashCode() {
        return this.flags.hashCode() + (this.testIds.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionExperiments(testIds=");
        sb.append(this.testIds);
        sb.append(", flags=");
        return qv10.s(sb, this.flags, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Set<TestId> set = this.testIds;
        dest.writeInt(set.size());
        Iterator<TestId> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        Set<String> set2 = this.flags;
        dest.writeInt(set2.size());
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            dest.writeString(it2.next());
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0014¨\u0006$"}, d2 = {"Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionExperiments$TestId;", "Landroid/os/Parcelable;", "", "value", "bucketNumber", "<init>", "(JJ)V", "", "toExpBoxFormat", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/yandex/plus/acquisition/sdk/api/PlusAcquisitionExperiments$TestId;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue", "getBucketNumber", "Companion", "com/yandex/plus/acquisition/sdk/api/a", "acquisition-sdk-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TestId implements Parcelable {

        @Deprecated
        public static final long UNDEFINED_BUCKET_NUMBER = -1;
        private final long bucketNumber;
        private final long value;
        private static final a Companion = new a();
        public static final Parcelable.Creator<TestId> CREATOR = new Creator();

        public /* synthetic */ TestId(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? -1L : j2);
        }

        public static /* synthetic */ TestId copy$default(TestId testId, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = testId.value;
            }
            if ((i & 2) != 0) {
                j2 = testId.bucketNumber;
            }
            return testId.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final long getBucketNumber() {
            return this.bucketNumber;
        }

        public final TestId copy(long value, long bucketNumber) {
            return new TestId(value, bucketNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TestId)) {
                return false;
            }
            TestId testId = (TestId) other;
            return this.value == testId.value && this.bucketNumber == testId.bucketNumber;
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
            return this.value + ", 0, " + this.bucketNumber;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("TestId(value=");
            sb.append(this.value);
            sb.append(", bucketNumber=");
            return b64.o(sb, this.bucketNumber, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeLong(this.value);
            dest.writeLong(this.bucketNumber);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TestId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TestId createFromParcel(Parcel parcel) {
                return new TestId(parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TestId[] newArray(int i) {
                return new TestId[i];
            }
        }

        public TestId(long j, long j2) {
            this.value = j;
            this.bucketNumber = j2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionExperiments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionExperiments createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(TestId.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashSet2.add(parcel.readString());
            }
            return new PlusAcquisitionExperiments(linkedHashSet, linkedHashSet2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionExperiments[] newArray(int i) {
            return new PlusAcquisitionExperiments[i];
        }
    }
}
