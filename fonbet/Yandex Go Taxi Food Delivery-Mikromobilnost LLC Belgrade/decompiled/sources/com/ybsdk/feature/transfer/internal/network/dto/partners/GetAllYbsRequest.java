package com.ybsdk.feature.transfer.internal.network.dto.partners;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/internal/network/dto/partners/GetAllYbsRequest;", "", "transferId", "", "cursor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTransferId", "()Ljava/lang/String;", "getCursor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllYbsRequest {
    private final String cursor;
    private final String transferId;

    public GetAllYbsRequest(@Json(name = "transfer_id") String str, @Json(name = "cursor") String str2) {
        this.transferId = str;
        this.cursor = str2;
    }

    public static /* synthetic */ GetAllYbsRequest copy$default(GetAllYbsRequest getAllYbsRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAllYbsRequest.transferId;
        }
        if ((i & 2) != 0) {
            str2 = getAllYbsRequest.cursor;
        }
        return getAllYbsRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final GetAllYbsRequest copy(@Json(name = "transfer_id") String transferId, @Json(name = "cursor") String cursor) {
        return new GetAllYbsRequest(transferId, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllYbsRequest)) {
            return false;
        }
        GetAllYbsRequest getAllYbsRequest = (GetAllYbsRequest) other;
        return jl40.l(this.transferId, getAllYbsRequest.transferId) && jl40.l(this.cursor, getAllYbsRequest.cursor);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = this.transferId.hashCode() * 31;
        String str = this.cursor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("GetAllYbsRequest(transferId=", this.transferId, ", cursor=", this.cursor, Extension.C_BRAKE);
    }
}
