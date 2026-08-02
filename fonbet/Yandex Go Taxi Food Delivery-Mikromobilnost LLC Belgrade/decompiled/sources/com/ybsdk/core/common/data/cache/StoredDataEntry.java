package com.ybsdk.core.common.data.cache;

import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.sro;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.xga1;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b#\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ybsdk/core/common/data/cache/StoredDataEntry;", "Lsro;", "", "ttl", "receivedAt", "", "type", "value", "", "stale", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "copy", "(JJLjava/lang/String;Ljava/lang/String;Z)Lcom/ybsdk/core/common/data/cache/StoredDataEntry;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getTtl", "getReceivedAt", "Ljava/lang/String;", "getType", "getValue", "Z", "getStale", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StoredDataEntry implements sro {
    private final long receivedAt;
    private final boolean stale;
    private final long ttl;
    private final String type;
    private final String value;

    public StoredDataEntry(long j, long j2, String str, String str2, boolean z) {
        this.ttl = j;
        this.receivedAt = j2;
        this.type = str;
        this.value = str2;
        this.stale = z;
    }

    public static /* synthetic */ StoredDataEntry copy$default(StoredDataEntry storedDataEntry, long j, long j2, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = storedDataEntry.ttl;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = storedDataEntry.receivedAt;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = storedDataEntry.type;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = storedDataEntry.value;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = storedDataEntry.stale;
        }
        return storedDataEntry.copy(j3, j4, str3, str4, z);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTtl() {
        return this.ttl;
    }

    /* renamed from: component2, reason: from getter */
    public final long getReceivedAt() {
        return this.receivedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getStale() {
        return this.stale;
    }

    public final StoredDataEntry copy(long ttl, long receivedAt, String type, String value, boolean stale) {
        return new StoredDataEntry(ttl, receivedAt, type, value, stale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredDataEntry)) {
            return false;
        }
        StoredDataEntry storedDataEntry = (StoredDataEntry) other;
        return this.ttl == storedDataEntry.ttl && this.receivedAt == storedDataEntry.receivedAt && jl40.l(this.type, storedDataEntry.type) && jl40.l(this.value, storedDataEntry.value) && this.stale == storedDataEntry.stale;
    }

    public long getLifeExpectancyMs() {
        return xga1.d(this);
    }

    @Override // defpackage.sro
    public long getReceivedAt() {
        return this.receivedAt;
    }

    public final boolean getStale() {
        return this.stale;
    }

    @Override // defpackage.sro
    public long getTtl() {
        return this.ttl;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.stale) + unr0.b(unr0.b(qv10.c(Long.hashCode(this.ttl) * 31, 31, this.receivedAt), 31, this.type), 31, this.value);
    }

    public String toString() {
        long j = this.ttl;
        long j2 = this.receivedAt;
        String str = this.type;
        String str2 = this.value;
        boolean z = this.stale;
        StringBuilder w = unr0.w(j, "StoredDataEntry(ttl=", ", receivedAt=");
        uw51.v(j2, ", type=", str, w);
        uw51.x(", value=", str2, ", stale=", w, z);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }
}
