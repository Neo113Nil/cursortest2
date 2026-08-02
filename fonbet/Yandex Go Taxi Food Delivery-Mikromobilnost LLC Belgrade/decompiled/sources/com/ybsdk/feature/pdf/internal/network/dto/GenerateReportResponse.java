package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportResponse;", "", "id", "", "type", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getVersion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GenerateReportResponse {
    private final String id;
    private final String type;
    private final String version;

    public GenerateReportResponse(@Json(name = "id") String str, @Json(name = "type") String str2, @Json(name = "version") String str3) {
        this.id = str;
        this.type = str2;
        this.version = str3;
    }

    public static /* synthetic */ GenerateReportResponse copy$default(GenerateReportResponse generateReportResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateReportResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = generateReportResponse.type;
        }
        if ((i & 4) != 0) {
            str3 = generateReportResponse.version;
        }
        return generateReportResponse.copy(str, str2, str3);
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
    public final String getVersion() {
        return this.version;
    }

    public final GenerateReportResponse copy(@Json(name = "id") String id, @Json(name = "type") String type, @Json(name = "version") String version) {
        return new GenerateReportResponse(id, type, version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateReportResponse)) {
            return false;
        }
        GenerateReportResponse generateReportResponse = (GenerateReportResponse) other;
        return jl40.l(this.id, generateReportResponse.id) && jl40.l(this.type, generateReportResponse.type) && jl40.l(this.version, generateReportResponse.version);
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.version.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.type);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        return oyr.t(b64.v("GenerateReportResponse(id=", str, ", type=", str2, ", version="), this.version, Extension.C_BRAKE);
    }
}
