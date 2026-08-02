package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductSkinDto;", "", "id", "", "mini", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;)V", "getId", "()Ljava/lang/String;", "getMini", "()Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProductSkinDto {
    private final String id;
    private final ProductSkinMiniDto mini;

    public ProductSkinDto(@Json(name = "id") String str, @Json(name = "mini") ProductSkinMiniDto productSkinMiniDto) {
        this.id = str;
        this.mini = productSkinMiniDto;
    }

    public static /* synthetic */ ProductSkinDto copy$default(ProductSkinDto productSkinDto, String str, ProductSkinMiniDto productSkinMiniDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSkinDto.id;
        }
        if ((i & 2) != 0) {
            productSkinMiniDto = productSkinDto.mini;
        }
        return productSkinDto.copy(str, productSkinMiniDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductSkinMiniDto getMini() {
        return this.mini;
    }

    public final ProductSkinDto copy(@Json(name = "id") String id, @Json(name = "mini") ProductSkinMiniDto mini) {
        return new ProductSkinDto(id, mini);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSkinDto)) {
            return false;
        }
        ProductSkinDto productSkinDto = (ProductSkinDto) other;
        return jl40.l(this.id, productSkinDto.id) && jl40.l(this.mini, productSkinDto.mini);
    }

    public final String getId() {
        return this.id;
    }

    public final ProductSkinMiniDto getMini() {
        return this.mini;
    }

    public int hashCode() {
        return this.mini.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "ProductSkinDto(id=" + this.id + ", mini=" + this.mini + Extension.C_BRAKE;
    }
}
