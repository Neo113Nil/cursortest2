package com.ybsdk.feature.transfer.version2.internal.network.dto.targets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/targets/GetSuggestedTargetsRequest;", "", "receiverPhone", "", "agreementId", "deviceId", "cursor", "limit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getReceiverPhone", "()Ljava/lang/String;", "getAgreementId", "getDeviceId", "getCursor", "getLimit", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetSuggestedTargetsRequest {
    private final String agreementId;
    private final String cursor;
    private final String deviceId;
    private final String limit;
    private final String receiverPhone;

    public /* synthetic */ GetSuggestedTargetsRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ GetSuggestedTargetsRequest copy$default(GetSuggestedTargetsRequest getSuggestedTargetsRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSuggestedTargetsRequest.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = getSuggestedTargetsRequest.agreementId;
        }
        if ((i & 4) != 0) {
            str3 = getSuggestedTargetsRequest.deviceId;
        }
        if ((i & 8) != 0) {
            str4 = getSuggestedTargetsRequest.cursor;
        }
        if ((i & 16) != 0) {
            str5 = getSuggestedTargetsRequest.limit;
        }
        String str6 = str5;
        String str7 = str3;
        return getSuggestedTargetsRequest.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLimit() {
        return this.limit;
    }

    public final GetSuggestedTargetsRequest copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "agreement_id") String agreementId, @Json(name = "device_id") String deviceId, @Json(name = "cursor") String cursor, @Json(name = "limit") String limit) {
        return new GetSuggestedTargetsRequest(receiverPhone, agreementId, deviceId, cursor, limit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSuggestedTargetsRequest)) {
            return false;
        }
        GetSuggestedTargetsRequest getSuggestedTargetsRequest = (GetSuggestedTargetsRequest) other;
        return jl40.l(this.receiverPhone, getSuggestedTargetsRequest.receiverPhone) && jl40.l(this.agreementId, getSuggestedTargetsRequest.agreementId) && jl40.l(this.deviceId, getSuggestedTargetsRequest.deviceId) && jl40.l(this.cursor, getSuggestedTargetsRequest.cursor) && jl40.l(this.limit, getSuggestedTargetsRequest.limit);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public int hashCode() {
        int hashCode = this.receiverPhone.hashCode() * 31;
        String str = this.agreementId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cursor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.limit;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.agreementId;
        String str3 = this.deviceId;
        String str4 = this.cursor;
        String str5 = this.limit;
        StringBuilder v = b64.v("GetSuggestedTargetsRequest(receiverPhone=", str, ", agreementId=", str2, ", deviceId=");
        g8e.D(v, str3, ", cursor=", str4, ", limit=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }

    public GetSuggestedTargetsRequest(@Json(name = "receiver_phone") String str, @Json(name = "agreement_id") String str2, @Json(name = "device_id") String str3, @Json(name = "cursor") String str4, @Json(name = "limit") String str5) {
        this.receiverPhone = str;
        this.agreementId = str2;
        this.deviceId = str3;
        this.cursor = str4;
        this.limit = str5;
    }
}
