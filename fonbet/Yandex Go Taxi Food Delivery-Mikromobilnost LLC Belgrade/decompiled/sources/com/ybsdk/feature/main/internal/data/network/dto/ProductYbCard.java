package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/ProductYbCard;", "", "visible", "", "<init>", "(Z)V", "getVisible", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductYbCard {
    private final boolean visible;

    public ProductYbCard(@Json(name = "visible") boolean z) {
        this.visible = z;
    }

    public static /* synthetic */ ProductYbCard copy$default(ProductYbCard productYbCard, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productYbCard.visible;
        }
        return productYbCard.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    public final ProductYbCard copy(@Json(name = "visible") boolean visible) {
        return new ProductYbCard(visible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProductYbCard) && this.visible == ((ProductYbCard) other).visible;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.visible);
    }

    public String toString() {
        return nzs.b("ProductYbCard(visible=", Extension.C_BRAKE, this.visible);
    }
}
