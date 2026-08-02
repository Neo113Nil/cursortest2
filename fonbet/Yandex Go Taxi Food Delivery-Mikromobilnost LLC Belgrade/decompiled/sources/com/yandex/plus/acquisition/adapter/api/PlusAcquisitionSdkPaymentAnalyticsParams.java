package com.yandex.plus.acquisition.adapter.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\fJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0018¨\u0006)"}, d2 = {"Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams;", "Landroid/os/Parcelable;", "Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;", "experiments", "", "from", "", "customParams", "<init>", "(Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;Ljava/lang/String;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;Ljava/lang/String;Ljava/util/Map;)Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;", "getExperiments", "Ljava/lang/String;", "getFrom", "Ljava/util/Map;", "getCustomParams", "Experiments", "plus-home-acquisition-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PlusAcquisitionSdkPaymentAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator<PlusAcquisitionSdkPaymentAnalyticsParams> CREATOR = new Creator();
    private final Map<String, String> customParams;
    private final Experiments experiments;
    private final String from;

    public /* synthetic */ PlusAcquisitionSdkPaymentAnalyticsParams(Experiments experiments, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : experiments, (i & 2) != 0 ? null : str, (i & 4) != 0 ? b.f() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlusAcquisitionSdkPaymentAnalyticsParams copy$default(PlusAcquisitionSdkPaymentAnalyticsParams plusAcquisitionSdkPaymentAnalyticsParams, Experiments experiments, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            experiments = plusAcquisitionSdkPaymentAnalyticsParams.experiments;
        }
        if ((i & 2) != 0) {
            str = plusAcquisitionSdkPaymentAnalyticsParams.from;
        }
        if ((i & 4) != 0) {
            map = plusAcquisitionSdkPaymentAnalyticsParams.customParams;
        }
        return plusAcquisitionSdkPaymentAnalyticsParams.copy(experiments, str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final Experiments getExperiments() {
        return this.experiments;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    public final Map<String, String> component3() {
        return this.customParams;
    }

    public final PlusAcquisitionSdkPaymentAnalyticsParams copy(Experiments experiments, String from, Map<String, String> customParams) {
        return new PlusAcquisitionSdkPaymentAnalyticsParams(experiments, from, customParams);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlusAcquisitionSdkPaymentAnalyticsParams)) {
            return false;
        }
        PlusAcquisitionSdkPaymentAnalyticsParams plusAcquisitionSdkPaymentAnalyticsParams = (PlusAcquisitionSdkPaymentAnalyticsParams) other;
        return jl40.l(this.experiments, plusAcquisitionSdkPaymentAnalyticsParams.experiments) && jl40.l(this.from, plusAcquisitionSdkPaymentAnalyticsParams.from) && jl40.l(this.customParams, plusAcquisitionSdkPaymentAnalyticsParams.customParams);
    }

    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    public final Experiments getExperiments() {
        return this.experiments;
    }

    public final String getFrom() {
        return this.from;
    }

    public int hashCode() {
        Experiments experiments = this.experiments;
        int hashCode = (experiments == null ? 0 : experiments.hashCode()) * 31;
        String str = this.from;
        return this.customParams.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionSdkPaymentAnalyticsParams(experiments=");
        sb.append(this.experiments);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", customParams=");
        return smw0.n(sb, this.customParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Experiments experiments = this.experiments;
        if (experiments == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            experiments.writeToParcel(dest, flags);
        }
        dest.writeString(this.from);
        Iterator x = qv10.x(this.customParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J0\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0012¨\u0006\""}, d2 = {"Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;", "Landroid/os/Parcelable;", "", "Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments$TestId;", "testIds", "", "flags", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/Set;", "component2", "copy", "(Ljava/util/Set;Ljava/util/Set;)Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getTestIds", "getFlags", "TestId", "plus-home-acquisition-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Experiments implements Parcelable {
        public static final Parcelable.Creator<Experiments> CREATOR = new Creator();
        private final Set<String> flags;
        private final Set<TestId> testIds;

        public Experiments(Set<TestId> set, Set<String> set2) {
            this.testIds = set;
            this.flags = set2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Experiments copy$default(Experiments experiments, Set set, Set set2, int i, Object obj) {
            if ((i & 1) != 0) {
                set = experiments.testIds;
            }
            if ((i & 2) != 0) {
                set2 = experiments.flags;
            }
            return experiments.copy(set, set2);
        }

        public final Set<TestId> component1() {
            return this.testIds;
        }

        public final Set<String> component2() {
            return this.flags;
        }

        public final Experiments copy(Set<TestId> testIds, Set<String> flags) {
            return new Experiments(testIds, flags);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Experiments)) {
                return false;
            }
            Experiments experiments = (Experiments) other;
            return jl40.l(this.testIds, experiments.testIds) && jl40.l(this.flags, experiments.flags);
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
            StringBuilder sb = new StringBuilder("Experiments(testIds=");
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

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0011¨\u0006#"}, d2 = {"Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments$TestId;", "Landroid/os/Parcelable;", "", "value", "bucketNumber", "<init>", "(JJ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/yandex/plus/acquisition/adapter/api/PlusAcquisitionSdkPaymentAnalyticsParams$Experiments$TestId;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getValue", "getBucketNumber", "Companion", "com/yandex/plus/acquisition/adapter/api/a", "plus-home-acquisition-sdk-adapter-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Experiments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Experiments createFromParcel(Parcel parcel) {
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
                return new Experiments(linkedHashSet, linkedHashSet2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Experiments[] newArray(int i) {
                return new Experiments[i];
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusAcquisitionSdkPaymentAnalyticsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionSdkPaymentAnalyticsParams createFromParcel(Parcel parcel) {
            Experiments createFromParcel = parcel.readInt() == 0 ? null : Experiments.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new PlusAcquisitionSdkPaymentAnalyticsParams(createFromParcel, readString, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusAcquisitionSdkPaymentAnalyticsParams[] newArray(int i) {
            return new PlusAcquisitionSdkPaymentAnalyticsParams[i];
        }
    }

    public PlusAcquisitionSdkPaymentAnalyticsParams(Experiments experiments, String str, Map<String, String> map) {
        this.experiments = experiments;
        this.from = str;
        this.customParams = map;
    }

    public PlusAcquisitionSdkPaymentAnalyticsParams() {
        this(null, null, null, 7, null);
    }
}
