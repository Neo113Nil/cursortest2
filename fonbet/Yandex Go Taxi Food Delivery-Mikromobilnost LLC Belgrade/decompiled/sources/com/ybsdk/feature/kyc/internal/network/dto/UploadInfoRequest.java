package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/UploadInfoRequest;", "", "applicationId", "", "applicationType", "documentType", "fileFormat", "fileName", "contentLength", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getApplicationId", "()Ljava/lang/String;", "getApplicationType", "getDocumentType", "getFileFormat", "getFileName", "getContentLength", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UploadInfoRequest {
    private final String applicationId;
    private final String applicationType;
    private final long contentLength;
    private final String documentType;
    private final String fileFormat;
    private final String fileName;

    public UploadInfoRequest(@Json(name = "application_id") String str, @Json(name = "application_type") String str2, @Json(name = "document_type") String str3, @Json(name = "file_format") String str4, @Json(name = "file_name") String str5, @Json(name = "content_length") long j) {
        this.applicationId = str;
        this.applicationType = str2;
        this.documentType = str3;
        this.fileFormat = str4;
        this.fileName = str5;
        this.contentLength = j;
    }

    public static /* synthetic */ UploadInfoRequest copy$default(UploadInfoRequest uploadInfoRequest, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadInfoRequest.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = uploadInfoRequest.applicationType;
        }
        if ((i & 4) != 0) {
            str3 = uploadInfoRequest.documentType;
        }
        if ((i & 8) != 0) {
            str4 = uploadInfoRequest.fileFormat;
        }
        if ((i & 16) != 0) {
            str5 = uploadInfoRequest.fileName;
        }
        if ((i & 32) != 0) {
            j = uploadInfoRequest.contentLength;
        }
        long j2 = j;
        String str6 = str5;
        String str7 = str3;
        return uploadInfoRequest.copy(str, str2, str7, str4, str6, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getApplicationType() {
        return this.applicationType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileFormat() {
        return this.fileFormat;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component6, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    public final UploadInfoRequest copy(@Json(name = "application_id") String applicationId, @Json(name = "application_type") String applicationType, @Json(name = "document_type") String documentType, @Json(name = "file_format") String fileFormat, @Json(name = "file_name") String fileName, @Json(name = "content_length") long contentLength) {
        return new UploadInfoRequest(applicationId, applicationType, documentType, fileFormat, fileName, contentLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadInfoRequest)) {
            return false;
        }
        UploadInfoRequest uploadInfoRequest = (UploadInfoRequest) other;
        return jl40.l(this.applicationId, uploadInfoRequest.applicationId) && jl40.l(this.applicationType, uploadInfoRequest.applicationType) && jl40.l(this.documentType, uploadInfoRequest.documentType) && jl40.l(this.fileFormat, uploadInfoRequest.fileFormat) && jl40.l(this.fileName, uploadInfoRequest.fileName) && this.contentLength == uploadInfoRequest.contentLength;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getApplicationType() {
        return this.applicationType;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getFileFormat() {
        return this.fileFormat;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        return Long.hashCode(this.contentLength) + unr0.b(unr0.b(unr0.b(unr0.b(this.applicationId.hashCode() * 31, 31, this.applicationType), 31, this.documentType), 31, this.fileFormat), 31, this.fileName);
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.applicationType;
        String str3 = this.documentType;
        String str4 = this.fileFormat;
        String str5 = this.fileName;
        long j = this.contentLength;
        StringBuilder v = b64.v("UploadInfoRequest(applicationId=", str, ", applicationType=", str2, ", documentType=");
        g8e.D(v, str3, ", fileFormat=", str4, ", fileName=");
        ly3.y(j, str5, ", contentLength=", v);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
