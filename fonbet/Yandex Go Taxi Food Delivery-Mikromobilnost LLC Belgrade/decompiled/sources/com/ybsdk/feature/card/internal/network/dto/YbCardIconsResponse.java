package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/YbCardIconsResponse;", "", "activeCardImage", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "multiCardImage", "disabledCardImage", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getActiveCardImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getMultiCardImage", "getDisabledCardImage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class YbCardIconsResponse {
    private final Themes<String> activeCardImage;
    private final Themes<String> disabledCardImage;
    private final Themes<String> multiCardImage;

    public YbCardIconsResponse(@Json(name = "active") Themes<String> themes, @Json(name = "multi") Themes<String> themes2, @Json(name = "disabled") Themes<String> themes3) {
        this.activeCardImage = themes;
        this.multiCardImage = themes2;
        this.disabledCardImage = themes3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YbCardIconsResponse copy$default(YbCardIconsResponse ybCardIconsResponse, Themes themes, Themes themes2, Themes themes3, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = ybCardIconsResponse.activeCardImage;
        }
        if ((i & 2) != 0) {
            themes2 = ybCardIconsResponse.multiCardImage;
        }
        if ((i & 4) != 0) {
            themes3 = ybCardIconsResponse.disabledCardImage;
        }
        return ybCardIconsResponse.copy(themes, themes2, themes3);
    }

    public final Themes<String> component1() {
        return this.activeCardImage;
    }

    public final Themes<String> component2() {
        return this.multiCardImage;
    }

    public final Themes<String> component3() {
        return this.disabledCardImage;
    }

    public final YbCardIconsResponse copy(@Json(name = "active") Themes<String> activeCardImage, @Json(name = "multi") Themes<String> multiCardImage, @Json(name = "disabled") Themes<String> disabledCardImage) {
        return new YbCardIconsResponse(activeCardImage, multiCardImage, disabledCardImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YbCardIconsResponse)) {
            return false;
        }
        YbCardIconsResponse ybCardIconsResponse = (YbCardIconsResponse) other;
        return jl40.l(this.activeCardImage, ybCardIconsResponse.activeCardImage) && jl40.l(this.multiCardImage, ybCardIconsResponse.multiCardImage) && jl40.l(this.disabledCardImage, ybCardIconsResponse.disabledCardImage);
    }

    public final Themes<String> getActiveCardImage() {
        return this.activeCardImage;
    }

    public final Themes<String> getDisabledCardImage() {
        return this.disabledCardImage;
    }

    public final Themes<String> getMultiCardImage() {
        return this.multiCardImage;
    }

    public int hashCode() {
        return this.disabledCardImage.hashCode() + nnm.c(this.multiCardImage, this.activeCardImage.hashCode() * 31, 31);
    }

    public String toString() {
        Themes<String> themes = this.activeCardImage;
        Themes<String> themes2 = this.multiCardImage;
        Themes<String> themes3 = this.disabledCardImage;
        StringBuilder sb = new StringBuilder("YbCardIconsResponse(activeCardImage=");
        sb.append(themes);
        sb.append(", multiCardImage=");
        sb.append(themes2);
        sb.append(", disabledCardImage=");
        return smw0.l(sb, themes3, Extension.C_BRAKE);
    }
}
