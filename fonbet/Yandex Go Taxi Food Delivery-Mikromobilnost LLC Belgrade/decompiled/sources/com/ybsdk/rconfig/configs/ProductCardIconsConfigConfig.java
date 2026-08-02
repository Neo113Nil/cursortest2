package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/rconfig/configs/ProductCardIconsConfigConfig;", "", "Lcom/ybsdk/rconfig/configs/ProductImages;", "cardIcons", "<init>", "(Lcom/ybsdk/rconfig/configs/ProductImages;)V", "component1", "()Lcom/ybsdk/rconfig/configs/ProductImages;", "copy", "(Lcom/ybsdk/rconfig/configs/ProductImages;)Lcom/ybsdk/rconfig/configs/ProductCardIconsConfigConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/rconfig/configs/ProductImages;", "getCardIcons", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ProductCardIconsConfigConfig {

    @Json(name = "card_icons")
    private final ProductImages cardIcons;

    public /* synthetic */ ProductCardIconsConfigConfig(ProductImages productImages, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productImages);
    }

    public static /* synthetic */ ProductCardIconsConfigConfig copy$default(ProductCardIconsConfigConfig productCardIconsConfigConfig, ProductImages productImages, int i, Object obj) {
        if ((i & 1) != 0) {
            productImages = productCardIconsConfigConfig.cardIcons;
        }
        return productCardIconsConfigConfig.copy(productImages);
    }

    /* renamed from: component1, reason: from getter */
    public final ProductImages getCardIcons() {
        return this.cardIcons;
    }

    public final ProductCardIconsConfigConfig copy(ProductImages cardIcons) {
        return new ProductCardIconsConfigConfig(cardIcons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductCardIconsConfigConfig) && jl40.l(this.cardIcons, ((ProductCardIconsConfigConfig) other).cardIcons);
    }

    public final ProductImages getCardIcons() {
        return this.cardIcons;
    }

    public int hashCode() {
        ProductImages productImages = this.cardIcons;
        if (productImages == null) {
            return 0;
        }
        return productImages.hashCode();
    }

    public String toString() {
        return "ProductCardIconsConfigConfig(cardIcons=" + this.cardIcons + Extension.C_BRAKE;
    }

    public ProductCardIconsConfigConfig(ProductImages productImages) {
        this.cardIcons = productImages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCardIconsConfigConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
