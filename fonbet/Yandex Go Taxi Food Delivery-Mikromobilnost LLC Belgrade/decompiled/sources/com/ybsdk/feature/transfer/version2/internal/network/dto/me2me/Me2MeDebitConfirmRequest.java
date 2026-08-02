package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitConfirmRequest;", "", "permissionRequestId", "", "agreementId", "hmac", "Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/HmacDto;)V", "getPermissionRequestId", "()Ljava/lang/String;", "getAgreementId", "getHmac", "()Lcom/ybsdk/core/common/data/network/dto/HmacDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitConfirmRequest {
    private final String agreementId;
    private final HmacDto hmac;
    private final String permissionRequestId;

    public Me2MeDebitConfirmRequest(@Json(name = "permission_request_id") String str, @Json(name = "agreement_id") String str2, @Json(name = "hmac") HmacDto hmacDto) {
        this.permissionRequestId = str;
        this.agreementId = str2;
        this.hmac = hmacDto;
    }

    public static /* synthetic */ Me2MeDebitConfirmRequest copy$default(Me2MeDebitConfirmRequest me2MeDebitConfirmRequest, String str, String str2, HmacDto hmacDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = me2MeDebitConfirmRequest.permissionRequestId;
        }
        if ((i & 2) != 0) {
            str2 = me2MeDebitConfirmRequest.agreementId;
        }
        if ((i & 4) != 0) {
            hmacDto = me2MeDebitConfirmRequest.hmac;
        }
        return me2MeDebitConfirmRequest.copy(str, str2, hmacDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPermissionRequestId() {
        return this.permissionRequestId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final Me2MeDebitConfirmRequest copy(@Json(name = "permission_request_id") String permissionRequestId, @Json(name = "agreement_id") String agreementId, @Json(name = "hmac") HmacDto hmac) {
        return new Me2MeDebitConfirmRequest(permissionRequestId, agreementId, hmac);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitConfirmRequest)) {
            return false;
        }
        Me2MeDebitConfirmRequest me2MeDebitConfirmRequest = (Me2MeDebitConfirmRequest) other;
        return jl40.l(this.permissionRequestId, me2MeDebitConfirmRequest.permissionRequestId) && jl40.l(this.agreementId, me2MeDebitConfirmRequest.agreementId) && jl40.l(this.hmac, me2MeDebitConfirmRequest.hmac);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final HmacDto getHmac() {
        return this.hmac;
    }

    public final String getPermissionRequestId() {
        return this.permissionRequestId;
    }

    public int hashCode() {
        int b = unr0.b(this.permissionRequestId.hashCode() * 31, 31, this.agreementId);
        HmacDto hmacDto = this.hmac;
        return b + (hmacDto == null ? 0 : hmacDto.hashCode());
    }

    public String toString() {
        String str = this.permissionRequestId;
        String str2 = this.agreementId;
        HmacDto hmacDto = this.hmac;
        StringBuilder v = b64.v("Me2MeDebitConfirmRequest(permissionRequestId=", str, ", agreementId=", str2, ", hmac=");
        v.append(hmacDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
