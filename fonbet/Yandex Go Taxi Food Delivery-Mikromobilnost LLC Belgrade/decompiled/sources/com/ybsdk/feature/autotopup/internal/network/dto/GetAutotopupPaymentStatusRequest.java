package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/GetAutotopupPaymentStatusRequest;", "", "agreementId", "", "source", "type", "wasPaymentRetried", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAgreementId", "()Ljava/lang/String;", "getSource", "getType", "getWasPaymentRetried", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAutotopupPaymentStatusRequest {
    private final String agreementId;
    private final String source;
    private final String type;
    private final boolean wasPaymentRetried;

    public GetAutotopupPaymentStatusRequest(@Json(name = "agreement_id") String str, @Json(name = "source") String str2, @Json(name = "type") String str3, @Json(name = "was_payment_retried") boolean z) {
        this.agreementId = str;
        this.source = str2;
        this.type = str3;
        this.wasPaymentRetried = z;
    }

    public static /* synthetic */ GetAutotopupPaymentStatusRequest copy$default(GetAutotopupPaymentStatusRequest getAutotopupPaymentStatusRequest, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getAutotopupPaymentStatusRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = getAutotopupPaymentStatusRequest.source;
        }
        if ((i & 4) != 0) {
            str3 = getAutotopupPaymentStatusRequest.type;
        }
        if ((i & 8) != 0) {
            z = getAutotopupPaymentStatusRequest.wasPaymentRetried;
        }
        return getAutotopupPaymentStatusRequest.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getWasPaymentRetried() {
        return this.wasPaymentRetried;
    }

    public final GetAutotopupPaymentStatusRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "source") String source, @Json(name = "type") String type, @Json(name = "was_payment_retried") boolean wasPaymentRetried) {
        return new GetAutotopupPaymentStatusRequest(agreementId, source, type, wasPaymentRetried);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAutotopupPaymentStatusRequest)) {
            return false;
        }
        GetAutotopupPaymentStatusRequest getAutotopupPaymentStatusRequest = (GetAutotopupPaymentStatusRequest) other;
        return jl40.l(this.agreementId, getAutotopupPaymentStatusRequest.agreementId) && jl40.l(this.source, getAutotopupPaymentStatusRequest.source) && jl40.l(this.type, getAutotopupPaymentStatusRequest.type) && this.wasPaymentRetried == getAutotopupPaymentStatusRequest.wasPaymentRetried;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getWasPaymentRetried() {
        return this.wasPaymentRetried;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        String str = this.source;
        return Boolean.hashCode(this.wasPaymentRetried) + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.type);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.source;
        return nnm.i(this.type, ", wasPaymentRetried=", Extension.C_BRAKE, b64.v("GetAutotopupPaymentStatusRequest(agreementId=", str, ", source=", str2, ", type="), this.wasPaymentRetried);
    }
}
