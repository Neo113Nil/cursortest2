package com.ybsdk.feature.merchant.offers.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/data/network/dto/MerchantOffersSearchNextPageRequest;", "", "mlRequestId", "", "offerIds", "", "query", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMlRequestId", "()Ljava/lang/String;", "getOfferIds", "()Ljava/util/List;", "getQuery", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MerchantOffersSearchNextPageRequest {
    private final String mlRequestId;
    private final List<String> offerIds;
    private final String query;

    public MerchantOffersSearchNextPageRequest(@Json(name = "ml_request_id") String str, @Json(name = "offer_ids") List<String> list, @Json(name = "query") String str2) {
        this.mlRequestId = str;
        this.offerIds = list;
        this.query = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MerchantOffersSearchNextPageRequest copy$default(MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = merchantOffersSearchNextPageRequest.mlRequestId;
        }
        if ((i & 2) != 0) {
            list = merchantOffersSearchNextPageRequest.offerIds;
        }
        if ((i & 4) != 0) {
            str2 = merchantOffersSearchNextPageRequest.query;
        }
        return merchantOffersSearchNextPageRequest.copy(str, list, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> component2() {
        return this.offerIds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final MerchantOffersSearchNextPageRequest copy(@Json(name = "ml_request_id") String mlRequestId, @Json(name = "offer_ids") List<String> offerIds, @Json(name = "query") String query) {
        return new MerchantOffersSearchNextPageRequest(mlRequestId, offerIds, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MerchantOffersSearchNextPageRequest)) {
            return false;
        }
        MerchantOffersSearchNextPageRequest merchantOffersSearchNextPageRequest = (MerchantOffersSearchNextPageRequest) other;
        return jl40.l(this.mlRequestId, merchantOffersSearchNextPageRequest.mlRequestId) && jl40.l(this.offerIds, merchantOffersSearchNextPageRequest.offerIds) && jl40.l(this.query, merchantOffersSearchNextPageRequest.query);
    }

    public final String getMlRequestId() {
        return this.mlRequestId;
    }

    public final List<String> getOfferIds() {
        return this.offerIds;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        String str = this.mlRequestId;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.offerIds);
        String str2 = this.query;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.mlRequestId;
        List<String> list = this.offerIds;
        return oyr.t(xvz.r("MerchantOffersSearchNextPageRequest(mlRequestId=", str, ", offerIds=", list, ", query="), this.query, Extension.C_BRAKE);
    }
}
