package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductRightPartDto;", "", "subtitle", "Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;", "subtitleMini", "divRightPart", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getSubtitle", "()Lcom/ybsdk/feature/main/internal/data/network/dto/ProductSubtitle;", "getSubtitleMini", "getDivRightPart", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductRightPartDto {
    private final DivDataDto divRightPart;
    private final ProductSubtitle subtitle;
    private final ProductSubtitle subtitleMini;

    public ProductRightPartDto(@Json(name = "subtitle") ProductSubtitle productSubtitle, @Json(name = "subtitle_mini") ProductSubtitle productSubtitle2, @Json(name = "div_right_part") DivDataDto divDataDto) {
        this.subtitle = productSubtitle;
        this.subtitleMini = productSubtitle2;
        this.divRightPart = divDataDto;
    }

    public static /* synthetic */ ProductRightPartDto copy$default(ProductRightPartDto productRightPartDto, ProductSubtitle productSubtitle, ProductSubtitle productSubtitle2, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            productSubtitle = productRightPartDto.subtitle;
        }
        if ((i & 2) != 0) {
            productSubtitle2 = productRightPartDto.subtitleMini;
        }
        if ((i & 4) != 0) {
            divDataDto = productRightPartDto.divRightPart;
        }
        return productRightPartDto.copy(productSubtitle, productSubtitle2, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductSubtitle getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductSubtitle getSubtitleMini() {
        return this.subtitleMini;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivRightPart() {
        return this.divRightPart;
    }

    public final ProductRightPartDto copy(@Json(name = "subtitle") ProductSubtitle subtitle, @Json(name = "subtitle_mini") ProductSubtitle subtitleMini, @Json(name = "div_right_part") DivDataDto divRightPart) {
        return new ProductRightPartDto(subtitle, subtitleMini, divRightPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductRightPartDto)) {
            return false;
        }
        ProductRightPartDto productRightPartDto = (ProductRightPartDto) other;
        return jl40.l(this.subtitle, productRightPartDto.subtitle) && jl40.l(this.subtitleMini, productRightPartDto.subtitleMini) && jl40.l(this.divRightPart, productRightPartDto.divRightPart);
    }

    public final DivDataDto getDivRightPart() {
        return this.divRightPart;
    }

    public final ProductSubtitle getSubtitle() {
        return this.subtitle;
    }

    public final ProductSubtitle getSubtitleMini() {
        return this.subtitleMini;
    }

    public int hashCode() {
        ProductSubtitle productSubtitle = this.subtitle;
        int hashCode = (productSubtitle == null ? 0 : productSubtitle.hashCode()) * 31;
        ProductSubtitle productSubtitle2 = this.subtitleMini;
        int hashCode2 = (hashCode + (productSubtitle2 == null ? 0 : productSubtitle2.hashCode())) * 31;
        DivDataDto divDataDto = this.divRightPart;
        return hashCode2 + (divDataDto != null ? divDataDto.hashCode() : 0);
    }

    public String toString() {
        return "ProductRightPartDto(subtitle=" + this.subtitle + ", subtitleMini=" + this.subtitleMini + ", divRightPart=" + this.divRightPart + Extension.C_BRAKE;
    }
}
