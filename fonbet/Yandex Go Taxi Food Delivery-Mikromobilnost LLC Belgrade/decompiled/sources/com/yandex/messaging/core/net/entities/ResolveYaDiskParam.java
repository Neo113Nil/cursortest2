package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolveYaDiskParam;", "", "uploadId", "", "fileName", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "getUploadId", "()Ljava/lang/String;", "getFileName", "getSize", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ResolveYaDiskParam {
    private final String fileName;
    private final long size;
    private final String uploadId;

    public ResolveYaDiskParam(@Json(name = "upload_id") String str, @Json(name = "name") String str2, @Json(name = "size") long j) {
        this.uploadId = str;
        this.fileName = str2;
        this.size = j;
    }

    public static /* synthetic */ ResolveYaDiskParam copy$default(ResolveYaDiskParam resolveYaDiskParam, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolveYaDiskParam.uploadId;
        }
        if ((i & 2) != 0) {
            str2 = resolveYaDiskParam.fileName;
        }
        if ((i & 4) != 0) {
            j = resolveYaDiskParam.size;
        }
        return resolveYaDiskParam.copy(str, str2, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final ResolveYaDiskParam copy(@Json(name = "upload_id") String uploadId, @Json(name = "name") String fileName, @Json(name = "size") long size) {
        return new ResolveYaDiskParam(uploadId, fileName, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolveYaDiskParam)) {
            return false;
        }
        ResolveYaDiskParam resolveYaDiskParam = (ResolveYaDiskParam) other;
        return jl40.l(this.uploadId, resolveYaDiskParam.uploadId) && jl40.l(this.fileName, resolveYaDiskParam.fileName) && this.size == resolveYaDiskParam.size;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public int hashCode() {
        return Long.hashCode(this.size) + unr0.b(this.uploadId.hashCode() * 31, 31, this.fileName);
    }

    public String toString() {
        return oyr.n(this.size, Extension.C_BRAKE, b64.v("ResolveYaDiskParam(uploadId=", this.uploadId, ", fileName=", this.fileName, ", size="));
    }
}
