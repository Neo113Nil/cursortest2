package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/ReportFileResponse;", "", "id", "", "name", "type", "downloadLink", "Lcom/ybsdk/feature/pdf/internal/network/dto/FileLinkResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/FileLinkResponse;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getDownloadLink", "()Lcom/ybsdk/feature/pdf/internal/network/dto/FileLinkResponse;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReportFileResponse {
    private final FileLinkResponse downloadLink;
    private final String id;
    private final String name;
    private final String type;

    public ReportFileResponse(@Json(name = "id") String str, @Json(name = "name") String str2, @Json(name = "type") String str3, @Json(name = "download") FileLinkResponse fileLinkResponse) {
        this.id = str;
        this.name = str2;
        this.type = str3;
        this.downloadLink = fileLinkResponse;
    }

    public static /* synthetic */ ReportFileResponse copy$default(ReportFileResponse reportFileResponse, String str, String str2, String str3, FileLinkResponse fileLinkResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reportFileResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = reportFileResponse.name;
        }
        if ((i & 4) != 0) {
            str3 = reportFileResponse.type;
        }
        if ((i & 8) != 0) {
            fileLinkResponse = reportFileResponse.downloadLink;
        }
        return reportFileResponse.copy(str, str2, str3, fileLinkResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final FileLinkResponse getDownloadLink() {
        return this.downloadLink;
    }

    public final ReportFileResponse copy(@Json(name = "id") String id, @Json(name = "name") String name, @Json(name = "type") String type, @Json(name = "download") FileLinkResponse downloadLink) {
        return new ReportFileResponse(id, name, type, downloadLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportFileResponse)) {
            return false;
        }
        ReportFileResponse reportFileResponse = (ReportFileResponse) other;
        return jl40.l(this.id, reportFileResponse.id) && jl40.l(this.name, reportFileResponse.name) && jl40.l(this.type, reportFileResponse.type) && jl40.l(this.downloadLink, reportFileResponse.downloadLink);
    }

    public final FileLinkResponse getDownloadLink() {
        return this.downloadLink;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.name), 31, this.type);
        FileLinkResponse fileLinkResponse = this.downloadLink;
        return b + (fileLinkResponse == null ? 0 : fileLinkResponse.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.type;
        FileLinkResponse fileLinkResponse = this.downloadLink;
        StringBuilder v = b64.v("ReportFileResponse(id=", str, ", name=", str2, ", type=");
        v.append(str3);
        v.append(", downloadLink=");
        v.append(fileLinkResponse);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
