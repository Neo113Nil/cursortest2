package com.ybsdk.core.common.data.cache;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.sro;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.xga1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JL\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006,"}, d2 = {"Lcom/ybsdk/core/common/data/cache/StoredLayoutInfo;", "Lsro;", "", "ttl", "receivedAt", "", "hash", "", "stale", "", "version", "", "info", "<init>", "(JJLjava/lang/String;ZILjava/lang/Object;)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()I", "component6", "()Ljava/lang/Object;", "copy", "(JJLjava/lang/String;ZILjava/lang/Object;)Lcom/ybsdk/core/common/data/cache/StoredLayoutInfo;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getTtl", "getReceivedAt", "Ljava/lang/String;", "getHash", "Z", "getStale", CA20Status.STATUS_USER_I, "getVersion", "Ljava/lang/Object;", "getInfo", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StoredLayoutInfo implements sro {
    private final String hash;
    private final Object info;
    private final long receivedAt;
    private final boolean stale;
    private final long ttl;
    private final int version;

    public /* synthetic */ StoredLayoutInfo(long j, long j2, String str, boolean z, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, z, i, (i2 & 32) != 0 ? new Object() : obj);
    }

    public static /* synthetic */ StoredLayoutInfo copy$default(StoredLayoutInfo storedLayoutInfo, long j, long j2, String str, boolean z, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            j = storedLayoutInfo.ttl;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = storedLayoutInfo.receivedAt;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            str = storedLayoutInfo.hash;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            z = storedLayoutInfo.stale;
        }
        return storedLayoutInfo.copy(j3, j4, str2, z, (i2 & 16) != 0 ? storedLayoutInfo.version : i, (i2 & 32) != 0 ? storedLayoutInfo.info : obj);
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
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getStale() {
        return this.stale;
    }

    /* renamed from: component5, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component6, reason: from getter */
    public final Object getInfo() {
        return this.info;
    }

    public final StoredLayoutInfo copy(long ttl, long receivedAt, String hash, boolean stale, int version, @Json(ignore = true) Object info) {
        return new StoredLayoutInfo(ttl, receivedAt, hash, stale, version, info);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredLayoutInfo)) {
            return false;
        }
        StoredLayoutInfo storedLayoutInfo = (StoredLayoutInfo) other;
        return this.ttl == storedLayoutInfo.ttl && this.receivedAt == storedLayoutInfo.receivedAt && jl40.l(this.hash, storedLayoutInfo.hash) && this.stale == storedLayoutInfo.stale && this.version == storedLayoutInfo.version && jl40.l(this.info, storedLayoutInfo.info);
    }

    public final String getHash() {
        return this.hash;
    }

    public final Object getInfo() {
        return this.info;
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

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.info.hashCode() + oyr.b(this.version, unr0.e(unr0.b(qv10.c(Long.hashCode(this.ttl) * 31, 31, this.receivedAt), 31, this.hash), 31, this.stale), 31);
    }

    public String toString() {
        long j = this.ttl;
        long j2 = this.receivedAt;
        String str = this.hash;
        boolean z = this.stale;
        int i = this.version;
        Object obj = this.info;
        StringBuilder w = unr0.w(j, "StoredLayoutInfo(ttl=", ", receivedAt=");
        uw51.v(j2, ", hash=", str, w);
        w.append(", stale=");
        w.append(z);
        w.append(", version=");
        w.append(i);
        w.append(", info=");
        w.append(obj);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }

    public StoredLayoutInfo(long j, long j2, String str, boolean z, int i, @Json(ignore = true) Object obj) {
        this.ttl = j;
        this.receivedAt = j2;
        this.hash = str;
        this.stale = z;
        this.version = i;
        this.info = obj;
    }
}
