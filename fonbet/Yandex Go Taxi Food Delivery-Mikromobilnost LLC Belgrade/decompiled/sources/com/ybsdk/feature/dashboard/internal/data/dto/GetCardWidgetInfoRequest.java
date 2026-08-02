package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/GetCardWidgetInfoRequest;", "", "agreementId", "", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getProductId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetCardWidgetInfoRequest {
    private final String agreementId;
    private final String productId;

    public GetCardWidgetInfoRequest(@Json(name = "agreement_id") String str, @Json(name = "product_id") String str2) {
        this.agreementId = str;
        this.productId = str2;
    }

    public static /* synthetic */ GetCardWidgetInfoRequest copy$default(GetCardWidgetInfoRequest getCardWidgetInfoRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCardWidgetInfoRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = getCardWidgetInfoRequest.productId;
        }
        return getCardWidgetInfoRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final GetCardWidgetInfoRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "product_id") String productId) {
        return new GetCardWidgetInfoRequest(agreementId, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCardWidgetInfoRequest)) {
            return false;
        }
        GetCardWidgetInfoRequest getCardWidgetInfoRequest = (GetCardWidgetInfoRequest) other;
        return jl40.l(this.agreementId, getCardWidgetInfoRequest.agreementId) && jl40.l(this.productId, getCardWidgetInfoRequest.productId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        String str = this.agreementId;
        return this.productId.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return unr0.p("GetCardWidgetInfoRequest(agreementId=", this.agreementId, ", productId=", this.productId, Extension.C_BRAKE);
    }
}
