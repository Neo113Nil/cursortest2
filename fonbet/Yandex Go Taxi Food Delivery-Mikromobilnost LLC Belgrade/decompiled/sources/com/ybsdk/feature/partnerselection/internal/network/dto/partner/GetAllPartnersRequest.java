package com.ybsdk.feature.partnerselection.internal.network.dto.partner;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.vfc;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;", "", "receiverPhone", "", "transferId", "cursor", "limit", "", "transferType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getReceiverPhone", "()Ljava/lang/String;", "getTransferId", "getCursor", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTransferType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetAllPartnersRequest;", "equals", "", "other", "hashCode", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllPartnersRequest {
    private final String cursor;
    private final Integer limit;
    private final String receiverPhone;
    private final String transferId;
    private final String transferType;

    public /* synthetic */ GetAllPartnersRequest(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : num, str4);
    }

    public static /* synthetic */ GetAllPartnersRequest copy$default(GetAllPartnersRequest getAllPartnersRequest, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAllPartnersRequest.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = getAllPartnersRequest.transferId;
        }
        if ((i & 4) != 0) {
            str3 = getAllPartnersRequest.cursor;
        }
        if ((i & 8) != 0) {
            num = getAllPartnersRequest.limit;
        }
        if ((i & 16) != 0) {
            str4 = getAllPartnersRequest.transferType;
        }
        String str5 = str4;
        String str6 = str3;
        return getAllPartnersRequest.copy(str, str2, str6, num, str5);
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

    /* renamed from: component5, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    public final GetAllPartnersRequest copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "transfer_id") String transferId, @Json(name = "cursor") String cursor, @Json(name = "limit") Integer limit, @Json(name = "transfer_type") String transferType) {
        return new GetAllPartnersRequest(receiverPhone, transferId, cursor, limit, transferType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllPartnersRequest)) {
            return false;
        }
        GetAllPartnersRequest getAllPartnersRequest = (GetAllPartnersRequest) other;
        return jl40.l(this.receiverPhone, getAllPartnersRequest.receiverPhone) && jl40.l(this.transferId, getAllPartnersRequest.transferId) && jl40.l(this.cursor, getAllPartnersRequest.cursor) && jl40.l(this.limit, getAllPartnersRequest.limit) && jl40.l(this.transferType, getAllPartnersRequest.transferType);
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

    public final String getTransferType() {
        return this.transferType;
    }

    public int hashCode() {
        String str = this.receiverPhone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transferId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cursor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.limit;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.transferType;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.transferId;
        String str3 = this.cursor;
        Integer num = this.limit;
        String str4 = this.transferType;
        StringBuilder v = b64.v("GetAllPartnersRequest(receiverPhone=", str, ", transferId=", str2, ", cursor=");
        vfc.w(num, str3, ", limit=", ", transferType=", v);
        return oyr.t(v, str4, Extension.C_BRAKE);
    }

    public GetAllPartnersRequest(@Json(name = "receiver_phone") String str, @Json(name = "transfer_id") String str2, @Json(name = "cursor") String str3, @Json(name = "limit") Integer num, @Json(name = "transfer_type") String str4) {
        this.receiverPhone = str;
        this.transferId = str2;
        this.cursor = str3;
        this.limit = num;
        this.transferType = str4;
    }
}
