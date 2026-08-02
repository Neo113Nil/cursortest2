package com.ybsdk.feature.qr.payments.internal.network.v2.dto.common;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/common/PageImageHeaderDto;", "", "titleImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "cornerImage", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getTitleImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getCornerImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageImageHeaderDto {
    private final Themes<String> cornerImage;
    private final Themes<String> titleImage;

    public PageImageHeaderDto(@Json(name = "title_image") Themes<String> themes, @Json(name = "corner_image") Themes<String> themes2) {
        this.titleImage = themes;
        this.cornerImage = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageImageHeaderDto copy$default(PageImageHeaderDto pageImageHeaderDto, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = pageImageHeaderDto.titleImage;
        }
        if ((i & 2) != 0) {
            themes2 = pageImageHeaderDto.cornerImage;
        }
        return pageImageHeaderDto.copy(themes, themes2);
    }

    public final Themes<String> component1() {
        return this.titleImage;
    }

    public final Themes<String> component2() {
        return this.cornerImage;
    }

    public final PageImageHeaderDto copy(@Json(name = "title_image") Themes<String> titleImage, @Json(name = "corner_image") Themes<String> cornerImage) {
        return new PageImageHeaderDto(titleImage, cornerImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageImageHeaderDto)) {
            return false;
        }
        PageImageHeaderDto pageImageHeaderDto = (PageImageHeaderDto) other;
        return jl40.l(this.titleImage, pageImageHeaderDto.titleImage) && jl40.l(this.cornerImage, pageImageHeaderDto.cornerImage);
    }

    public final Themes<String> getCornerImage() {
        return this.cornerImage;
    }

    public final Themes<String> getTitleImage() {
        return this.titleImage;
    }

    public int hashCode() {
        int hashCode = this.titleImage.hashCode() * 31;
        Themes<String> themes = this.cornerImage;
        return hashCode + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        return "PageImageHeaderDto(titleImage=" + this.titleImage + ", cornerImage=" + this.cornerImage + Extension.C_BRAKE;
    }
}
