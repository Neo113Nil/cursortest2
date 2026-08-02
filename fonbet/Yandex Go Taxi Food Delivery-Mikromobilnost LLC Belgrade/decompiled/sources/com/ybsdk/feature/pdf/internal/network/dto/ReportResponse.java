package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ReportResponse;", "", "id", "", "type", ACSPConstants.STATUS, "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusTypeDto;", "files", "Lcom/ybsdk/feature/pdf/internal/network/dto/ReportFilesResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusTypeDto;Lcom/ybsdk/feature/pdf/internal/network/dto/ReportFilesResponse;)V", "getId", "()Ljava/lang/String;", "getType", "getStatus", "()Lcom/ybsdk/feature/pdf/internal/network/dto/ReportStatusTypeDto;", "getFiles", "()Lcom/ybsdk/feature/pdf/internal/network/dto/ReportFilesResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReportResponse {
    private final ReportFilesResponse files;
    private final String id;
    private final ReportStatusTypeDto status;
    private final String type;

    public ReportResponse(@Json(name = "id") String str, @Json(name = "type") String str2, @Json(name = "status") ReportStatusTypeDto reportStatusTypeDto, @Json(name = "files") ReportFilesResponse reportFilesResponse) {
        this.id = str;
        this.type = str2;
        this.status = reportStatusTypeDto;
        this.files = reportFilesResponse;
    }

    public static /* synthetic */ ReportResponse copy$default(ReportResponse reportResponse, String str, String str2, ReportStatusTypeDto reportStatusTypeDto, ReportFilesResponse reportFilesResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = reportResponse.type;
        }
        if ((i & 4) != 0) {
            reportStatusTypeDto = reportResponse.status;
        }
        if ((i & 8) != 0) {
            reportFilesResponse = reportResponse.files;
        }
        return reportResponse.copy(str, str2, reportStatusTypeDto, reportFilesResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final ReportStatusTypeDto getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final ReportFilesResponse getFiles() {
        return this.files;
    }

    public final ReportResponse copy(@Json(name = "id") String id, @Json(name = "type") String type, @Json(name = "status") ReportStatusTypeDto status, @Json(name = "files") ReportFilesResponse files) {
        return new ReportResponse(id, type, status, files);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportResponse)) {
            return false;
        }
        ReportResponse reportResponse = (ReportResponse) other;
        return jl40.l(this.id, reportResponse.id) && jl40.l(this.type, reportResponse.type) && this.status == reportResponse.status && jl40.l(this.files, reportResponse.files);
    }

    public final ReportFilesResponse getFiles() {
        return this.files;
    }

    public final String getId() {
        return this.id;
    }

    public final ReportStatusTypeDto getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.type)) * 31;
        ReportFilesResponse reportFilesResponse = this.files;
        return hashCode + (reportFilesResponse == null ? 0 : reportFilesResponse.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        ReportStatusTypeDto reportStatusTypeDto = this.status;
        ReportFilesResponse reportFilesResponse = this.files;
        StringBuilder v = b64.v("ReportResponse(id=", str, ", type=", str2, ", status=");
        v.append(reportStatusTypeDto);
        v.append(", files=");
        v.append(reportFilesResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
