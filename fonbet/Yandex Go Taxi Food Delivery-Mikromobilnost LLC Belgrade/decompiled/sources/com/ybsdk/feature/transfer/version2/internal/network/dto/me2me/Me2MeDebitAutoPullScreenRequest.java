package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenRequest;", "", "ybId", "", "agreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getYbId", "()Ljava/lang/String;", "getAgreementId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Me2MeDebitAutoPullScreenRequest {
    private final String agreementId;
    private final String ybId;

    public Me2MeDebitAutoPullScreenRequest(@Json(name = "JSON_FIELD_MEMBER_ID") String str, @Json(name = "agreement_id") String str2) {
        this.ybId = str;
        this.agreementId = str2;
    }

    public static /* synthetic */ Me2MeDebitAutoPullScreenRequest copy$default(Me2MeDebitAutoPullScreenRequest me2MeDebitAutoPullScreenRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = me2MeDebitAutoPullScreenRequest.ybId;
        }
        if ((i & 2) != 0) {
            str2 = me2MeDebitAutoPullScreenRequest.agreementId;
        }
        return me2MeDebitAutoPullScreenRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Me2MeDebitAutoPullScreenRequest copy(@Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "agreement_id") String agreementId) {
        return new Me2MeDebitAutoPullScreenRequest(ybId, agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Me2MeDebitAutoPullScreenRequest)) {
            return false;
        }
        Me2MeDebitAutoPullScreenRequest me2MeDebitAutoPullScreenRequest = (Me2MeDebitAutoPullScreenRequest) other;
        return jl40.l(this.ybId, me2MeDebitAutoPullScreenRequest.ybId) && jl40.l(this.agreementId, me2MeDebitAutoPullScreenRequest.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int hashCode = this.ybId.hashCode() * 31;
        String str = this.agreementId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("Me2MeDebitAutoPullScreenRequest(ybId=", this.ybId, ", agreementId=", this.agreementId, Extension.C_BRAKE);
    }
}
