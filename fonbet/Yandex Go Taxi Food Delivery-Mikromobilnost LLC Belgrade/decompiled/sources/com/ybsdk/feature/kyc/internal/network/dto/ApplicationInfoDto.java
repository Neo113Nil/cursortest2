package com.ybsdk.feature.kyc.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationInfoDto;", "", "applicationId", "", "applicationType", "applicationState", "documentsInfo", "Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationDocumentsInfoDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationDocumentsInfoDto;)V", "getApplicationId", "()Ljava/lang/String;", "getApplicationType", "getApplicationState", "getDocumentsInfo", "()Lcom/ybsdk/feature/kyc/internal/network/dto/ApplicationDocumentsInfoDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-kyc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationInfoDto {
    private final String applicationId;
    private final String applicationState;
    private final String applicationType;
    private final ApplicationDocumentsInfoDto documentsInfo;

    public ApplicationInfoDto(@Json(name = "application_id") String str, @Json(name = "application_type") String str2, @Json(name = "application_state") String str3, @Json(name = "documents_info") ApplicationDocumentsInfoDto applicationDocumentsInfoDto) {
        this.applicationId = str;
        this.applicationType = str2;
        this.applicationState = str3;
        this.documentsInfo = applicationDocumentsInfoDto;
    }

    public static /* synthetic */ ApplicationInfoDto copy$default(ApplicationInfoDto applicationInfoDto, String str, String str2, String str3, ApplicationDocumentsInfoDto applicationDocumentsInfoDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationInfoDto.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = applicationInfoDto.applicationType;
        }
        if ((i & 4) != 0) {
            str3 = applicationInfoDto.applicationState;
        }
        if ((i & 8) != 0) {
            applicationDocumentsInfoDto = applicationInfoDto.documentsInfo;
        }
        return applicationInfoDto.copy(str, str2, str3, applicationDocumentsInfoDto);
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
    public final String getApplicationState() {
        return this.applicationState;
    }

    /* renamed from: component4, reason: from getter */
    public final ApplicationDocumentsInfoDto getDocumentsInfo() {
        return this.documentsInfo;
    }

    public final ApplicationInfoDto copy(@Json(name = "application_id") String applicationId, @Json(name = "application_type") String applicationType, @Json(name = "application_state") String applicationState, @Json(name = "documents_info") ApplicationDocumentsInfoDto documentsInfo) {
        return new ApplicationInfoDto(applicationId, applicationType, applicationState, documentsInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationInfoDto)) {
            return false;
        }
        ApplicationInfoDto applicationInfoDto = (ApplicationInfoDto) other;
        return jl40.l(this.applicationId, applicationInfoDto.applicationId) && jl40.l(this.applicationType, applicationInfoDto.applicationType) && jl40.l(this.applicationState, applicationInfoDto.applicationState) && jl40.l(this.documentsInfo, applicationInfoDto.documentsInfo);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getApplicationState() {
        return this.applicationState;
    }

    public final String getApplicationType() {
        return this.applicationType;
    }

    public final ApplicationDocumentsInfoDto getDocumentsInfo() {
        return this.documentsInfo;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.applicationId.hashCode() * 31, 31, this.applicationType), 31, this.applicationState);
        ApplicationDocumentsInfoDto applicationDocumentsInfoDto = this.documentsInfo;
        return b + (applicationDocumentsInfoDto == null ? 0 : applicationDocumentsInfoDto.hashCode());
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.applicationType;
        String str3 = this.applicationState;
        ApplicationDocumentsInfoDto applicationDocumentsInfoDto = this.documentsInfo;
        StringBuilder v = b64.v("ApplicationInfoDto(applicationId=", str, ", applicationType=", str2, ", applicationState=");
        v.append(str3);
        v.append(", documentsInfo=");
        v.append(applicationDocumentsInfoDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
