package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/ClaimCardRequest;", "", "pan", "", "cvv", "agreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPan", "()Ljava/lang/String;", "getCvv", "getAgreementId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ClaimCardRequest {
    private final String agreementId;
    private final String cvv;
    private final String pan;

    public ClaimCardRequest(@Json(name = "pan") String str, @Json(name = "cvv") String str2, @Json(name = "agreement_id") String str3) {
        this.pan = str;
        this.cvv = str2;
        this.agreementId = str3;
    }

    public static /* synthetic */ ClaimCardRequest copy$default(ClaimCardRequest claimCardRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimCardRequest.pan;
        }
        if ((i & 2) != 0) {
            str2 = claimCardRequest.cvv;
        }
        if ((i & 4) != 0) {
            str3 = claimCardRequest.agreementId;
        }
        return claimCardRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPan() {
        return this.pan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final ClaimCardRequest copy(@Json(name = "pan") String pan, @Json(name = "cvv") String cvv, @Json(name = "agreement_id") String agreementId) {
        return new ClaimCardRequest(pan, cvv, agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimCardRequest)) {
            return false;
        }
        ClaimCardRequest claimCardRequest = (ClaimCardRequest) other;
        return jl40.l(this.pan, claimCardRequest.pan) && jl40.l(this.cvv, claimCardRequest.cvv) && jl40.l(this.agreementId, claimCardRequest.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCvv() {
        return this.cvv;
    }

    public final String getPan() {
        return this.pan;
    }

    public int hashCode() {
        return this.agreementId.hashCode() + unr0.b(this.pan.hashCode() * 31, 31, this.cvv);
    }

    public String toString() {
        String str = this.pan;
        String str2 = this.cvv;
        return oyr.t(b64.v("ClaimCardRequest(pan=", str, ", cvv=", str2, ", agreementId="), this.agreementId, Extension.C_BRAKE);
    }
}
