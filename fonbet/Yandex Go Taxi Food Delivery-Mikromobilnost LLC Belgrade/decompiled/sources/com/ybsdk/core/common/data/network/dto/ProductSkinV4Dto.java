package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/ProductSkinV4Dto;", "", "id", "", "mini", "Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", C0553n3.g, "Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;)V", "getId", "()Ljava/lang/String;", "getMini", "()Lcom/ybsdk/core/common/data/network/dto/ProductSkinMiniDto;", "getBackground", "()Lcom/ybsdk/core/common/data/network/dto/ProductBackgroundDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProductSkinV4Dto {
    private final ProductBackgroundDto background;
    private final String id;
    private final ProductSkinMiniDto mini;

    public ProductSkinV4Dto(@Json(name = "id") String str, @Json(name = "mini") ProductSkinMiniDto productSkinMiniDto, @Json(name = "background") ProductBackgroundDto productBackgroundDto) {
        this.id = str;
        this.mini = productSkinMiniDto;
        this.background = productBackgroundDto;
    }

    public static /* synthetic */ ProductSkinV4Dto copy$default(ProductSkinV4Dto productSkinV4Dto, String str, ProductSkinMiniDto productSkinMiniDto, ProductBackgroundDto productBackgroundDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productSkinV4Dto.id;
        }
        if ((i & 2) != 0) {
            productSkinMiniDto = productSkinV4Dto.mini;
        }
        if ((i & 4) != 0) {
            productBackgroundDto = productSkinV4Dto.background;
        }
        return productSkinV4Dto.copy(str, productSkinMiniDto, productBackgroundDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductSkinMiniDto getMini() {
        return this.mini;
    }

    /* renamed from: component3, reason: from getter */
    public final ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final ProductSkinV4Dto copy(@Json(name = "id") String id, @Json(name = "mini") ProductSkinMiniDto mini, @Json(name = "background") ProductBackgroundDto background) {
        return new ProductSkinV4Dto(id, mini, background);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSkinV4Dto)) {
            return false;
        }
        ProductSkinV4Dto productSkinV4Dto = (ProductSkinV4Dto) other;
        return jl40.l(this.id, productSkinV4Dto.id) && jl40.l(this.mini, productSkinV4Dto.mini) && jl40.l(this.background, productSkinV4Dto.background);
    }

    public final ProductBackgroundDto getBackground() {
        return this.background;
    }

    public final String getId() {
        return this.id;
    }

    public final ProductSkinMiniDto getMini() {
        return this.mini;
    }

    public int hashCode() {
        return this.background.hashCode() + ((this.mini.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ProductSkinV4Dto(id=" + this.id + ", mini=" + this.mini + ", background=" + this.background + Extension.C_BRAKE;
    }
}
