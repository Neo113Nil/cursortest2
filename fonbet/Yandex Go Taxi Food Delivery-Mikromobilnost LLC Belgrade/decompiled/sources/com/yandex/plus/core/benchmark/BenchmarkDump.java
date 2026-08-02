package com.yandex.plus.core.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/plus/core/benchmark/BenchmarkDump;", "Landroid/os/Parcelable;", "name", "", "getName", "()Ljava/lang/String;", "NotStarted", "Started", "Stopped", "Lcom/yandex/plus/core/benchmark/BenchmarkDump$NotStarted;", "Lcom/yandex/plus/core/benchmark/BenchmarkDump$Started;", "Lcom/yandex/plus/core/benchmark/BenchmarkDump$Stopped;", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BenchmarkDump extends Parcelable {
    String getName();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/core/benchmark/BenchmarkDump$NotStarted;", "Lcom/yandex/plus/core/benchmark/BenchmarkDump;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/yandex/plus/core/benchmark/BenchmarkDump$NotStarted;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotStarted implements BenchmarkDump {
        public static final Parcelable.Creator<NotStarted> CREATOR = new Creator();
        private final String name;

        public NotStarted(String str) {
            this.name = str;
        }

        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.name;
            }
            return notStarted.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final NotStarted copy(String name) {
            return new NotStarted(name);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotStarted) && jl40.l(this.name, ((NotStarted) other).name);
        }

        @Override // com.yandex.plus.core.benchmark.BenchmarkDump
        public String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return b64.p(new StringBuilder("NotStarted(name="), this.name, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.name);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotStarted> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotStarted createFromParcel(Parcel parcel) {
                return new NotStarted(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NotStarted[] newArray(int i) {
                return new NotStarted[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/yandex/plus/core/benchmark/BenchmarkDump$Started;", "Lcom/yandex/plus/core/benchmark/BenchmarkDump;", "", "name", "", "startTime", "<init>", "(Ljava/lang/String;J)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/yandex/plus/core/benchmark/BenchmarkDump$Started;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "J", "getStartTime", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Started implements BenchmarkDump {
        public static final Parcelable.Creator<Started> CREATOR = new Creator();
        private final String name;
        private final long startTime;

        public Started(String str, long j) {
            this.name = str;
            this.startTime = j;
        }

        public static /* synthetic */ Started copy$default(Started started, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = started.name;
            }
            if ((i & 2) != 0) {
                j = started.startTime;
            }
            return started.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        public final Started copy(String name, long startTime) {
            return new Started(name, startTime);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Started)) {
                return false;
            }
            Started started = (Started) other;
            return jl40.l(this.name, started.name) && this.startTime == started.startTime;
        }

        @Override // com.yandex.plus.core.benchmark.BenchmarkDump
        public String getName() {
            return this.name;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return Long.hashCode(this.startTime) + (this.name.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Started(name=");
            sb.append(this.name);
            sb.append(", startTime=");
            return b64.o(sb, this.startTime, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.name);
            dest.writeLong(this.startTime);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Started> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Started createFromParcel(Parcel parcel) {
                return new Started(parcel.readString(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Started[] newArray(int i) {
                return new Started[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lcom/yandex/plus/core/benchmark/BenchmarkDump$Stopped;", "Lcom/yandex/plus/core/benchmark/BenchmarkDump;", "", "name", "", "startTime", "stopTime", "<init>", "(Ljava/lang/String;JJ)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JJ)Lcom/yandex/plus/core/benchmark/BenchmarkDump$Stopped;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "J", "getStartTime", "getStopTime", "plus-core-common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stopped implements BenchmarkDump {
        public static final Parcelable.Creator<Stopped> CREATOR = new Creator();
        private final String name;
        private final long startTime;
        private final long stopTime;

        public Stopped(String str, long j, long j2) {
            this.name = str;
            this.startTime = j;
            this.stopTime = j2;
        }

        public static /* synthetic */ Stopped copy$default(Stopped stopped, String str, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stopped.name;
            }
            if ((i & 2) != 0) {
                j = stopped.startTime;
            }
            if ((i & 4) != 0) {
                j2 = stopped.stopTime;
            }
            return stopped.copy(str, j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* renamed from: component3, reason: from getter */
        public final long getStopTime() {
            return this.stopTime;
        }

        public final Stopped copy(String name, long startTime, long stopTime) {
            return new Stopped(name, startTime, stopTime);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Stopped)) {
                return false;
            }
            Stopped stopped = (Stopped) other;
            return jl40.l(this.name, stopped.name) && this.startTime == stopped.startTime && this.stopTime == stopped.stopTime;
        }

        @Override // com.yandex.plus.core.benchmark.BenchmarkDump
        public String getName() {
            return this.name;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final long getStopTime() {
            return this.stopTime;
        }

        public int hashCode() {
            return Long.hashCode(this.stopTime) + qv10.c(this.name.hashCode() * 31, 31, this.startTime);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Stopped(name=");
            sb.append(this.name);
            sb.append(", startTime=");
            sb.append(this.startTime);
            sb.append(", stopTime=");
            return b64.o(sb, this.stopTime, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.name);
            dest.writeLong(this.startTime);
            dest.writeLong(this.stopTime);
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Stopped> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stopped createFromParcel(Parcel parcel) {
                return new Stopped(parcel.readString(), parcel.readLong(), parcel.readLong());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stopped[] newArray(int i) {
                return new Stopped[i];
            }
        }
    }
}
