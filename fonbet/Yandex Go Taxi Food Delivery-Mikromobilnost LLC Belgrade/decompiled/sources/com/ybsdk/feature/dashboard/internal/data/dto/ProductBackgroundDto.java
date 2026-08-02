package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.GradientDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.common.data.network.dto.cache.ThemedDataEntryDescriptorDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/ProductBackgroundDto;", "", "color", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/cache/ThemedDataEntryDescriptorDto;", "gradient", "Lcom/ybsdk/core/common/data/network/dto/GradientDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/core/common/data/network/dto/cache/ThemedDataEntryDescriptorDto;Lcom/ybsdk/core/common/data/network/dto/GradientDto;)V", "getColor", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/cache/ThemedDataEntryDescriptorDto;", "getGradient", "()Lcom/ybsdk/core/common/data/network/dto/GradientDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductBackgroundDto {
    private final ThemedParameter<String> color;
    private final GradientDto gradient;
    private final ThemedDataEntryDescriptorDto image;

    public ProductBackgroundDto(@Json(name = "color") ThemedParameter<String> themedParameter, @Json(name = "image") ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto, @Json(name = "gradient") GradientDto gradientDto) {
        this.color = themedParameter;
        this.image = themedDataEntryDescriptorDto;
        this.gradient = gradientDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductBackgroundDto copy$default(ProductBackgroundDto productBackgroundDto, ThemedParameter themedParameter, ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto, GradientDto gradientDto, int i, Object obj) {
        if ((i & 1) != 0) {
            themedParameter = productBackgroundDto.color;
        }
        if ((i & 2) != 0) {
            themedDataEntryDescriptorDto = productBackgroundDto.image;
        }
        if ((i & 4) != 0) {
            gradientDto = productBackgroundDto.gradient;
        }
        return productBackgroundDto.copy(themedParameter, themedDataEntryDescriptorDto, gradientDto);
    }

    public final ThemedParameter<String> component1() {
        return this.color;
    }

    /* renamed from: component2, reason: from getter */
    public final ThemedDataEntryDescriptorDto getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final GradientDto getGradient() {
        return this.gradient;
    }

    public final ProductBackgroundDto copy(@Json(name = "color") ThemedParameter<String> color, @Json(name = "image") ThemedDataEntryDescriptorDto image, @Json(name = "gradient") GradientDto gradient) {
        return new ProductBackgroundDto(color, image, gradient);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductBackgroundDto)) {
            return false;
        }
        ProductBackgroundDto productBackgroundDto = (ProductBackgroundDto) other;
        return jl40.l(this.color, productBackgroundDto.color) && jl40.l(this.image, productBackgroundDto.image) && jl40.l(this.gradient, productBackgroundDto.gradient);
    }

    public final ThemedParameter<String> getColor() {
        return this.color;
    }

    public final GradientDto getGradient() {
        return this.gradient;
    }

    public final ThemedDataEntryDescriptorDto getImage() {
        return this.image;
    }

    public int hashCode() {
        int hashCode = this.color.hashCode() * 31;
        ThemedDataEntryDescriptorDto themedDataEntryDescriptorDto = this.image;
        int hashCode2 = (hashCode + (themedDataEntryDescriptorDto == null ? 0 : themedDataEntryDescriptorDto.hashCode())) * 31;
        GradientDto gradientDto = this.gradient;
        return hashCode2 + (gradientDto != null ? gradientDto.hashCode() : 0);
    }

    public String toString() {
        return "ProductBackgroundDto(color=" + this.color + ", image=" + this.image + ", gradient=" + this.gradient + Extension.C_BRAKE;
    }
}
