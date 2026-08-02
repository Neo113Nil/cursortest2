package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.qv10;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/yandex/messaging/core/net/entities/YaDiskInfoData;", "", "trashSize", "", "totalSpace", "usedSpace", "<init>", "(Ljava/lang/Long;JJ)V", "getTrashSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTotalSpace", "()J", "getUsedSpace", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;JJ)Lcom/yandex/messaging/core/net/entities/YaDiskInfoData;", "equals", "", "other", "hashCode", "", "toString", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class YaDiskInfoData {
    private final long totalSpace;
    private final Long trashSize;
    private final long usedSpace;

    public YaDiskInfoData(@Json(name = "trash_space") Long l, @Json(name = "total_space") long j, @Json(name = "used_space") long j2) {
        this.trashSize = l;
        this.totalSpace = j;
        this.usedSpace = j2;
    }

    public static /* synthetic */ YaDiskInfoData copy$default(YaDiskInfoData yaDiskInfoData, Long l, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = yaDiskInfoData.trashSize;
        }
        if ((i & 2) != 0) {
            j = yaDiskInfoData.totalSpace;
        }
        if ((i & 4) != 0) {
            j2 = yaDiskInfoData.usedSpace;
        }
        return yaDiskInfoData.copy(l, j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getTrashSize() {
        return this.trashSize;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalSpace() {
        return this.totalSpace;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUsedSpace() {
        return this.usedSpace;
    }

    public final YaDiskInfoData copy(@Json(name = "trash_space") Long trashSize, @Json(name = "total_space") long totalSpace, @Json(name = "used_space") long usedSpace) {
        return new YaDiskInfoData(trashSize, totalSpace, usedSpace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YaDiskInfoData)) {
            return false;
        }
        YaDiskInfoData yaDiskInfoData = (YaDiskInfoData) other;
        return jl40.l(this.trashSize, yaDiskInfoData.trashSize) && this.totalSpace == yaDiskInfoData.totalSpace && this.usedSpace == yaDiskInfoData.usedSpace;
    }

    public final long getTotalSpace() {
        return this.totalSpace;
    }

    public final Long getTrashSize() {
        return this.trashSize;
    }

    public final long getUsedSpace() {
        return this.usedSpace;
    }

    public int hashCode() {
        Long l = this.trashSize;
        return Long.hashCode(this.usedSpace) + qv10.c((l == null ? 0 : l.hashCode()) * 31, 31, this.totalSpace);
    }

    public String toString() {
        Long l = this.trashSize;
        long j = this.totalSpace;
        long j2 = this.usedSpace;
        StringBuilder sb = new StringBuilder("YaDiskInfoData(trashSize=");
        sb.append(l);
        sb.append(", totalSpace=");
        sb.append(j);
        return g8e.l(j2, ", usedSpace=", Extension.C_BRAKE, sb);
    }
}
