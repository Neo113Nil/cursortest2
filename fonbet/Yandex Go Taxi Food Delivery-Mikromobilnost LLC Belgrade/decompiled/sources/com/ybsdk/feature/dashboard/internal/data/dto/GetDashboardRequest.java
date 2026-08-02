package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/GetDashboardRequest;", "", "agreementId", "", "productId", "productType", "pagingData", "Lcom/ybsdk/feature/dashboard/internal/data/dto/PagingData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/dashboard/internal/data/dto/PagingData;)V", "getAgreementId", "()Ljava/lang/String;", "getProductId", "getProductType", "getPagingData", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/PagingData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetDashboardRequest {
    private final String agreementId;
    private final PagingData pagingData;
    private final String productId;
    private final String productType;

    public GetDashboardRequest(@Json(name = "agreement_id") String str, @Json(name = "product_id") String str2, @Json(name = "product_type") String str3, @Json(name = "paging_data") PagingData pagingData) {
        this.agreementId = str;
        this.productId = str2;
        this.productType = str3;
        this.pagingData = pagingData;
    }

    public static /* synthetic */ GetDashboardRequest copy$default(GetDashboardRequest getDashboardRequest, String str, String str2, String str3, PagingData pagingData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getDashboardRequest.agreementId;
        }
        if ((i & 2) != 0) {
            str2 = getDashboardRequest.productId;
        }
        if ((i & 4) != 0) {
            str3 = getDashboardRequest.productType;
        }
        if ((i & 8) != 0) {
            pagingData = getDashboardRequest.pagingData;
        }
        return getDashboardRequest.copy(str, str2, str3, pagingData);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* renamed from: component4, reason: from getter */
    public final PagingData getPagingData() {
        return this.pagingData;
    }

    public final GetDashboardRequest copy(@Json(name = "agreement_id") String agreementId, @Json(name = "product_id") String productId, @Json(name = "product_type") String productType, @Json(name = "paging_data") PagingData pagingData) {
        return new GetDashboardRequest(agreementId, productId, productType, pagingData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDashboardRequest)) {
            return false;
        }
        GetDashboardRequest getDashboardRequest = (GetDashboardRequest) other;
        return jl40.l(this.agreementId, getDashboardRequest.agreementId) && jl40.l(this.productId, getDashboardRequest.productId) && jl40.l(this.productType, getDashboardRequest.productType) && jl40.l(this.pagingData, getDashboardRequest.pagingData);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final PagingData getPagingData() {
        return this.pagingData;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductType() {
        return this.productType;
    }

    public int hashCode() {
        String str = this.agreementId;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.productId);
        String str2 = this.productType;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        PagingData pagingData = this.pagingData;
        return hashCode + (pagingData != null ? pagingData.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        String str2 = this.productId;
        String str3 = this.productType;
        PagingData pagingData = this.pagingData;
        StringBuilder v = b64.v("GetDashboardRequest(agreementId=", str, ", productId=", str2, ", productType=");
        v.append(str3);
        v.append(", pagingData=");
        v.append(pagingData);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ GetDashboardRequest(String str, String str2, String str3, PagingData pagingData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "wallet" : str2, str3, pagingData);
    }
}
