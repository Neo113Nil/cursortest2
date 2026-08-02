package com.ybsdk.feature.qr.payments.internal.network.dto.list;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/dto/list/GetSubscriptionsRequest;", "", "agreementId", "", "<init>", "(Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetSubscriptionsRequest {
    private final String agreementId;

    public GetSubscriptionsRequest(@Json(name = "agreement_id") String str) {
        this.agreementId = str;
    }

    public static /* synthetic */ GetSubscriptionsRequest copy$default(GetSubscriptionsRequest getSubscriptionsRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSubscriptionsRequest.agreementId;
        }
        return getSubscriptionsRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final GetSubscriptionsRequest copy(@Json(name = "agreement_id") String agreementId) {
        return new GetSubscriptionsRequest(agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetSubscriptionsRequest) && jl40.l(this.agreementId, ((GetSubscriptionsRequest) other).agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public int hashCode() {
        String str = this.agreementId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return oyr.p("GetSubscriptionsRequest(agreementId=", this.agreementId, Extension.C_BRAKE);
    }
}
