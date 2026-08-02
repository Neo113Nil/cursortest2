package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoDto;", "", "url", "", "documentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getDocumentId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UploadInfoDto {
    private final String documentId;
    private final String url;

    public UploadInfoDto(@Json(name = "upload_url") String str, @Json(name = "document_id") String str2) {
        this.url = str;
        this.documentId = str2;
    }

    public static /* synthetic */ UploadInfoDto copy$default(UploadInfoDto uploadInfoDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadInfoDto.url;
        }
        if ((i & 2) != 0) {
            str2 = uploadInfoDto.documentId;
        }
        return uploadInfoDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentId() {
        return this.documentId;
    }

    public final UploadInfoDto copy(@Json(name = "upload_url") String url, @Json(name = "document_id") String documentId) {
        return new UploadInfoDto(url, documentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadInfoDto)) {
            return false;
        }
        UploadInfoDto uploadInfoDto = (UploadInfoDto) other;
        return jl40.l(this.url, uploadInfoDto.url) && jl40.l(this.documentId, uploadInfoDto.documentId);
    }

    public final String getDocumentId() {
        return this.documentId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.documentId.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("UploadInfoDto(url=", this.url, ", documentId=", this.documentId, Extension.C_BRAKE);
    }
}
