package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/CarouselCardDivkitBackdropV2;", "", "paddingBottom", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "<init>", "(DLcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;)V", "getPaddingBottom", "()D", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivKitDataV2Dto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselCardDivkitBackdropV2 {
    private final DivKitDataV2Dto divkitData;
    private final double paddingBottom;

    public CarouselCardDivkitBackdropV2(@Json(name = "padding_bottom") double d, @Json(name = "divkit_data") DivKitDataV2Dto divKitDataV2Dto) {
        this.paddingBottom = d;
        this.divkitData = divKitDataV2Dto;
    }

    public static /* synthetic */ CarouselCardDivkitBackdropV2 copy$default(CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2, double d, DivKitDataV2Dto divKitDataV2Dto, int i, Object obj) {
        if ((i & 1) != 0) {
            d = carouselCardDivkitBackdropV2.paddingBottom;
        }
        if ((i & 2) != 0) {
            divKitDataV2Dto = carouselCardDivkitBackdropV2.divkitData;
        }
        return carouselCardDivkitBackdropV2.copy(d, divKitDataV2Dto);
    }

    /* renamed from: component1, reason: from getter */
    public final double getPaddingBottom() {
        return this.paddingBottom;
    }

    /* renamed from: component2, reason: from getter */
    public final DivKitDataV2Dto getDivkitData() {
        return this.divkitData;
    }

    public final CarouselCardDivkitBackdropV2 copy(@Json(name = "padding_bottom") double paddingBottom, @Json(name = "divkit_data") DivKitDataV2Dto divkitData) {
        return new CarouselCardDivkitBackdropV2(paddingBottom, divkitData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselCardDivkitBackdropV2)) {
            return false;
        }
        CarouselCardDivkitBackdropV2 carouselCardDivkitBackdropV2 = (CarouselCardDivkitBackdropV2) other;
        return Double.compare(this.paddingBottom, carouselCardDivkitBackdropV2.paddingBottom) == 0 && jl40.l(this.divkitData, carouselCardDivkitBackdropV2.divkitData);
    }

    public final DivKitDataV2Dto getDivkitData() {
        return this.divkitData;
    }

    public final double getPaddingBottom() {
        return this.paddingBottom;
    }

    public int hashCode() {
        return this.divkitData.hashCode() + (Double.hashCode(this.paddingBottom) * 31);
    }

    public String toString() {
        return "CarouselCardDivkitBackdropV2(paddingBottom=" + this.paddingBottom + ", divkitData=" + this.divkitData + Extension.C_BRAKE;
    }
}
