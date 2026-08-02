package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequest;", "", "type", "", "agreementId", "confirmation", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getType", "()Ljava/lang/String;", "getAgreementId", "getConfirmation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ybsdk/feature/savings/internal/network/dto/FundOperationRequest;", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundOperationRequest {
    private final String agreementId;
    private final Boolean confirmation;
    private final String type;

    public FundOperationRequest(@Json(name = "type") String str, @Json(name = "agreement_id") String str2, @Json(name = "confirmation") Boolean bool) {
        this.type = str;
        this.agreementId = str2;
        this.confirmation = bool;
    }

    public static /* synthetic */ FundOperationRequest copy$default(FundOperationRequest fundOperationRequest, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundOperationRequest.type;
        }
        if ((i & 2) != 0) {
            str2 = fundOperationRequest.agreementId;
        }
        if ((i & 4) != 0) {
            bool = fundOperationRequest.confirmation;
        }
        return fundOperationRequest.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getConfirmation() {
        return this.confirmation;
    }

    public final FundOperationRequest copy(@Json(name = "type") String type, @Json(name = "agreement_id") String agreementId, @Json(name = "confirmation") Boolean confirmation) {
        return new FundOperationRequest(type, agreementId, confirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundOperationRequest)) {
            return false;
        }
        FundOperationRequest fundOperationRequest = (FundOperationRequest) other;
        return jl40.l(this.type, fundOperationRequest.type) && jl40.l(this.agreementId, fundOperationRequest.agreementId) && jl40.l(this.confirmation, fundOperationRequest.confirmation);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final Boolean getConfirmation() {
        return this.confirmation;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int b = unr0.b(this.type.hashCode() * 31, 31, this.agreementId);
        Boolean bool = this.confirmation;
        return b + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.type;
        String str2 = this.agreementId;
        return nzs.d(b64.v("FundOperationRequest(type=", str, ", agreementId=", str2, ", confirmation="), this.confirmation, Extension.C_BRAKE);
    }
}
