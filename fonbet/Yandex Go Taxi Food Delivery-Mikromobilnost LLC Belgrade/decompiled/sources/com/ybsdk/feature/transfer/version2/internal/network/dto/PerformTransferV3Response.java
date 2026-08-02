package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Response;", "", "responseStatus", "", "transferId", "error", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Error;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Error;)V", "getResponseStatus", "()Ljava/lang/String;", "getTransferId", "getError", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/PerformTransferV3Error;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PerformTransferV3Response {
    private final PerformTransferV3Error error;
    private final String responseStatus;
    private final String transferId;

    public /* synthetic */ PerformTransferV3Response(String str, String str2, PerformTransferV3Error performTransferV3Error, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : performTransferV3Error);
    }

    public static /* synthetic */ PerformTransferV3Response copy$default(PerformTransferV3Response performTransferV3Response, String str, String str2, PerformTransferV3Error performTransferV3Error, int i, Object obj) {
        if ((i & 1) != 0) {
            str = performTransferV3Response.responseStatus;
        }
        if ((i & 2) != 0) {
            str2 = performTransferV3Response.transferId;
        }
        if ((i & 4) != 0) {
            performTransferV3Error = performTransferV3Response.error;
        }
        return performTransferV3Response.copy(str, str2, performTransferV3Error);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResponseStatus() {
        return this.responseStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component3, reason: from getter */
    public final PerformTransferV3Error getError() {
        return this.error;
    }

    public final PerformTransferV3Response copy(@Json(name = "response_status") String responseStatus, @Json(name = "transfer_id") String transferId, @Json(name = "error") PerformTransferV3Error error) {
        return new PerformTransferV3Response(responseStatus, transferId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerformTransferV3Response)) {
            return false;
        }
        PerformTransferV3Response performTransferV3Response = (PerformTransferV3Response) other;
        return jl40.l(this.responseStatus, performTransferV3Response.responseStatus) && jl40.l(this.transferId, performTransferV3Response.transferId) && jl40.l(this.error, performTransferV3Response.error);
    }

    public final PerformTransferV3Error getError() {
        return this.error;
    }

    public final String getResponseStatus() {
        return this.responseStatus;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = this.responseStatus.hashCode() * 31;
        String str = this.transferId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PerformTransferV3Error performTransferV3Error = this.error;
        return hashCode2 + (performTransferV3Error != null ? performTransferV3Error.hashCode() : 0);
    }

    public String toString() {
        String str = this.responseStatus;
        String str2 = this.transferId;
        PerformTransferV3Error performTransferV3Error = this.error;
        StringBuilder v = b64.v("PerformTransferV3Response(responseStatus=", str, ", transferId=", str2, ", error=");
        v.append(performTransferV3Error);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PerformTransferV3Response(@Json(name = "response_status") String str, @Json(name = "transfer_id") String str2, @Json(name = "error") PerformTransferV3Error performTransferV3Error) {
        this.responseStatus = str;
        this.transferId = str2;
        this.error = performTransferV3Error;
    }
}
