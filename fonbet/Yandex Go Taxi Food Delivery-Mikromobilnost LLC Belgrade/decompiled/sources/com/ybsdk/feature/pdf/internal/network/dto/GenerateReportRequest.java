package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/GenerateReportRequest;", "", "idempotencyToken", "", "type", "version", "input", "Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValues;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValues;)V", "getIdempotencyToken", "()Ljava/lang/String;", "getType", "getVersion", "getInput", "()Lcom/ybsdk/feature/pdf/internal/network/dto/InputParametersValues;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GenerateReportRequest {
    private final String idempotencyToken;
    private final InputParametersValues input;
    private final String type;
    private final String version;

    public GenerateReportRequest(@Json(name = "idempotencyToken") String str, @Json(name = "type") String str2, @Json(name = "version") String str3, @Json(name = "input") InputParametersValues inputParametersValues) {
        this.idempotencyToken = str;
        this.type = str2;
        this.version = str3;
        this.input = inputParametersValues;
    }

    public static /* synthetic */ GenerateReportRequest copy$default(GenerateReportRequest generateReportRequest, String str, String str2, String str3, InputParametersValues inputParametersValues, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateReportRequest.idempotencyToken;
        }
        if ((i & 2) != 0) {
            str2 = generateReportRequest.type;
        }
        if ((i & 4) != 0) {
            str3 = generateReportRequest.version;
        }
        if ((i & 8) != 0) {
            inputParametersValues = generateReportRequest.input;
        }
        return generateReportRequest.copy(str, str2, str3, inputParametersValues);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final InputParametersValues getInput() {
        return this.input;
    }

    public final GenerateReportRequest copy(@Json(name = "idempotencyToken") String idempotencyToken, @Json(name = "type") String type, @Json(name = "version") String version, @Json(name = "input") InputParametersValues input) {
        return new GenerateReportRequest(idempotencyToken, type, version, input);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateReportRequest)) {
            return false;
        }
        GenerateReportRequest generateReportRequest = (GenerateReportRequest) other;
        return jl40.l(this.idempotencyToken, generateReportRequest.idempotencyToken) && jl40.l(this.type, generateReportRequest.type) && jl40.l(this.version, generateReportRequest.version) && jl40.l(this.input, generateReportRequest.input);
    }

    public final String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    public final InputParametersValues getInput() {
        return this.input;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.input.hashCode() + unr0.b(unr0.b(this.idempotencyToken.hashCode() * 31, 31, this.type), 31, this.version);
    }

    public String toString() {
        String str = this.idempotencyToken;
        String str2 = this.type;
        String str3 = this.version;
        InputParametersValues inputParametersValues = this.input;
        StringBuilder v = b64.v("GenerateReportRequest(idempotencyToken=", str, ", type=", str2, ", version=");
        v.append(str3);
        v.append(", input=");
        v.append(inputParametersValues);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
