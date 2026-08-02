package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/ResolvedYaDiskFile;", "", "uploadId", "", "uploadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUploadId", "()Ljava/lang/String;", "getUploadUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ResolvedYaDiskFile {
    private final String uploadId;
    private final String uploadUrl;

    public ResolvedYaDiskFile(@Json(name = "upload_id") String str, @Json(name = "upload_url") String str2) {
        this.uploadId = str;
        this.uploadUrl = str2;
    }

    public static /* synthetic */ ResolvedYaDiskFile copy$default(ResolvedYaDiskFile resolvedYaDiskFile, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resolvedYaDiskFile.uploadId;
        }
        if ((i & 2) != 0) {
            str2 = resolvedYaDiskFile.uploadUrl;
        }
        return resolvedYaDiskFile.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public final ResolvedYaDiskFile copy(@Json(name = "upload_id") String uploadId, @Json(name = "upload_url") String uploadUrl) {
        return new ResolvedYaDiskFile(uploadId, uploadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResolvedYaDiskFile)) {
            return false;
        }
        ResolvedYaDiskFile resolvedYaDiskFile = (ResolvedYaDiskFile) other;
        return jl40.l(this.uploadId, resolvedYaDiskFile.uploadId) && jl40.l(this.uploadUrl, resolvedYaDiskFile.uploadUrl);
    }

    public final String getUploadId() {
        return this.uploadId;
    }

    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public int hashCode() {
        return this.uploadUrl.hashCode() + (this.uploadId.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("ResolvedYaDiskFile(uploadId=", this.uploadId, ", uploadUrl=", this.uploadUrl, Extension.C_BRAKE);
    }
}
