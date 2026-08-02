package com.ybsdk.feature.transfer.version2.internal.network.dto.targets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetAllYbsRequest;", "", "receiverPhone", "", "transferId", "cursor", "limit", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getReceiverPhone", "()Ljava/lang/String;", "getTransferId", "getCursor", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetAllYbsRequest;", "equals", "", "other", "hashCode", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllYbsRequest {
    private final String cursor;
    private final Integer limit;
    private final String receiverPhone;
    private final String transferId;

    public GetAllYbsRequest(@Json(name = "receiver_phone") String str, @Json(name = "transfer_id") String str2, @Json(name = "cursor") String str3, @Json(name = "limit") Integer num) {
        this.receiverPhone = str;
        this.transferId = str2;
        this.cursor = str3;
        this.limit = num;
    }

    public static /* synthetic */ GetAllYbsRequest copy$default(GetAllYbsRequest getAllYbsRequest, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAllYbsRequest.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = getAllYbsRequest.transferId;
        }
        if ((i & 4) != 0) {
            str3 = getAllYbsRequest.cursor;
        }
        if ((i & 8) != 0) {
            num = getAllYbsRequest.limit;
        }
        return getAllYbsRequest.copy(str, str2, str3, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final GetAllYbsRequest copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "transfer_id") String transferId, @Json(name = "cursor") String cursor, @Json(name = "limit") Integer limit) {
        return new GetAllYbsRequest(receiverPhone, transferId, cursor, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllYbsRequest)) {
            return false;
        }
        GetAllYbsRequest getAllYbsRequest = (GetAllYbsRequest) other;
        return jl40.l(this.receiverPhone, getAllYbsRequest.receiverPhone) && jl40.l(this.transferId, getAllYbsRequest.transferId) && jl40.l(this.cursor, getAllYbsRequest.cursor) && jl40.l(this.limit, getAllYbsRequest.limit);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        String str = this.receiverPhone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transferId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cursor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.limit;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.transferId;
        String str3 = this.cursor;
        Integer num = this.limit;
        StringBuilder v = b64.v("GetAllYbsRequest(receiverPhone=", str, ", transferId=", str2, ", cursor=");
        v.append(str3);
        v.append(", limit=");
        v.append(num);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ GetAllYbsRequest(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num);
    }
}
