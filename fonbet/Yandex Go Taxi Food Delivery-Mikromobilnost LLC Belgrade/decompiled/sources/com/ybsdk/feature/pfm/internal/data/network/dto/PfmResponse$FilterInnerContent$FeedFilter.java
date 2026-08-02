package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.hcb0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContent$FeedFilter", "Lhcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "filterType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "innerContent", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContent$FeedFilter;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContent$FeedFilter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "getFilterType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "getInnerContent", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FilterInnerContent$FeedFilter implements hcb0 {
    private final PfmResponse.FilterInnerContentType filterType;
    private final PfmResponse.FeedFilterInnerContent innerContent;

    public PfmResponse$FilterInnerContent$FeedFilter(@Json(name = "filter_type") PfmResponse.FilterInnerContentType filterInnerContentType, @Json(name = "inner_content") PfmResponse.FeedFilterInnerContent feedFilterInnerContent) {
        this.filterType = filterInnerContentType;
        this.innerContent = feedFilterInnerContent;
    }

    public static /* synthetic */ PfmResponse$FilterInnerContent$FeedFilter copy$default(PfmResponse$FilterInnerContent$FeedFilter pfmResponse$FilterInnerContent$FeedFilter, PfmResponse.FilterInnerContentType filterInnerContentType, PfmResponse.FeedFilterInnerContent feedFilterInnerContent, int i, Object obj) {
        if ((i & 1) != 0) {
            filterInnerContentType = pfmResponse$FilterInnerContent$FeedFilter.filterType;
        }
        if ((i & 2) != 0) {
            feedFilterInnerContent = pfmResponse$FilterInnerContent$FeedFilter.innerContent;
        }
        return pfmResponse$FilterInnerContent$FeedFilter.copy(filterInnerContentType, feedFilterInnerContent);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.FilterInnerContentType getFilterType() {
        return this.filterType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse.FeedFilterInnerContent getInnerContent() {
        return this.innerContent;
    }

    public final PfmResponse$FilterInnerContent$FeedFilter copy(@Json(name = "filter_type") PfmResponse.FilterInnerContentType filterType, @Json(name = "inner_content") PfmResponse.FeedFilterInnerContent innerContent) {
        return new PfmResponse$FilterInnerContent$FeedFilter(filterType, innerContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FilterInnerContent$FeedFilter)) {
            return false;
        }
        PfmResponse$FilterInnerContent$FeedFilter pfmResponse$FilterInnerContent$FeedFilter = (PfmResponse$FilterInnerContent$FeedFilter) other;
        return this.filterType == pfmResponse$FilterInnerContent$FeedFilter.filterType && jl40.l(this.innerContent, pfmResponse$FilterInnerContent$FeedFilter.innerContent);
    }

    public final PfmResponse.FilterInnerContentType getFilterType() {
        return this.filterType;
    }

    public final PfmResponse.FeedFilterInnerContent getInnerContent() {
        return this.innerContent;
    }

    public int hashCode() {
        return this.innerContent.hashCode() + (this.filterType.hashCode() * 31);
    }

    public String toString() {
        return "FeedFilter(filterType=" + this.filterType + ", innerContent=" + this.innerContent + Extension.C_BRAKE;
    }
}
