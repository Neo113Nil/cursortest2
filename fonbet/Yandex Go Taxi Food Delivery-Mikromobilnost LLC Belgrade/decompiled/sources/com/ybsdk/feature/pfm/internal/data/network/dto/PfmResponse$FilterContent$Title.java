package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.gcb0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Title", "Lgcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "contentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "title", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "component2", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Title;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$Title;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "getContentType", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "getTitle", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FilterContent$Title implements gcb0 {
    private final PfmResponse.FilterContentType contentType;
    private final PfmResponse$PfmTextContent$Plain title;

    public PfmResponse$FilterContent$Title(@Json(name = "content_type") PfmResponse.FilterContentType filterContentType, @Json(name = "title") PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain) {
        this.contentType = filterContentType;
        this.title = pfmResponse$PfmTextContent$Plain;
    }

    public static /* synthetic */ PfmResponse$FilterContent$Title copy$default(PfmResponse$FilterContent$Title pfmResponse$FilterContent$Title, PfmResponse.FilterContentType filterContentType, PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain, int i, Object obj) {
        if ((i & 1) != 0) {
            filterContentType = pfmResponse$FilterContent$Title.contentType;
        }
        if ((i & 2) != 0) {
            pfmResponse$PfmTextContent$Plain = pfmResponse$FilterContent$Title.title;
        }
        return pfmResponse$FilterContent$Title.copy(filterContentType, pfmResponse$PfmTextContent$Plain);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final PfmResponse$PfmTextContent$Plain getTitle() {
        return this.title;
    }

    public final PfmResponse$FilterContent$Title copy(@Json(name = "content_type") PfmResponse.FilterContentType contentType, @Json(name = "title") PfmResponse$PfmTextContent$Plain title) {
        return new PfmResponse$FilterContent$Title(contentType, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FilterContent$Title)) {
            return false;
        }
        PfmResponse$FilterContent$Title pfmResponse$FilterContent$Title = (PfmResponse$FilterContent$Title) other;
        return this.contentType == pfmResponse$FilterContent$Title.contentType && jl40.l(this.title, pfmResponse$FilterContent$Title.title);
    }

    public final PfmResponse.FilterContentType getContentType() {
        return this.contentType;
    }

    public final PfmResponse$PfmTextContent$Plain getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.contentType.hashCode() * 31);
    }

    public String toString() {
        return "Title(contentType=" + this.contentType + ", title=" + this.title + Extension.C_BRAKE;
    }
}
