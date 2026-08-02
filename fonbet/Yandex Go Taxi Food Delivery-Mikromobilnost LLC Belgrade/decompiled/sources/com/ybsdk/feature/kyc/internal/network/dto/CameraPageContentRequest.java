package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/CameraPageContentRequest;", "", "applicationId", "", "applicationType", "documentGroup", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "getApplicationType", "getDocumentGroup", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraPageContentRequest {
    private final String applicationId;
    private final String applicationType;
    private final String documentGroup;

    public CameraPageContentRequest(@Json(name = "application_id") String str, @Json(name = "application_type") String str2, @Json(name = "document_group") String str3) {
        this.applicationId = str;
        this.applicationType = str2;
        this.documentGroup = str3;
    }

    public static /* synthetic */ CameraPageContentRequest copy$default(CameraPageContentRequest cameraPageContentRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cameraPageContentRequest.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = cameraPageContentRequest.applicationType;
        }
        if ((i & 4) != 0) {
            str3 = cameraPageContentRequest.documentGroup;
        }
        return cameraPageContentRequest.copy(str, str2, str3);
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
    public final String getDocumentGroup() {
        return this.documentGroup;
    }

    public final CameraPageContentRequest copy(@Json(name = "application_id") String applicationId, @Json(name = "application_type") String applicationType, @Json(name = "document_group") String documentGroup) {
        return new CameraPageContentRequest(applicationId, applicationType, documentGroup);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraPageContentRequest)) {
            return false;
        }
        CameraPageContentRequest cameraPageContentRequest = (CameraPageContentRequest) other;
        return jl40.l(this.applicationId, cameraPageContentRequest.applicationId) && jl40.l(this.applicationType, cameraPageContentRequest.applicationType) && jl40.l(this.documentGroup, cameraPageContentRequest.documentGroup);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getApplicationType() {
        return this.applicationType;
    }

    public final String getDocumentGroup() {
        return this.documentGroup;
    }

    public int hashCode() {
        int b = unr0.b(this.applicationId.hashCode() * 31, 31, this.applicationType);
        String str = this.documentGroup;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.applicationType;
        return oyr.t(b64.v("CameraPageContentRequest(applicationId=", str, ", applicationType=", str2, ", documentGroup="), this.documentGroup, Extension.C_BRAKE);
    }
}
