package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/CardSkinLayerResponse;", "", "image", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getImage", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardSkinLayerResponse {
    private final Themes<String> image;

    public CardSkinLayerResponse(@Json(name = "themed_image") Themes<String> themes) {
        this.image = themes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardSkinLayerResponse copy$default(CardSkinLayerResponse cardSkinLayerResponse, Themes themes, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = cardSkinLayerResponse.image;
        }
        return cardSkinLayerResponse.copy(themes);
    }

    public final Themes<String> component1() {
        return this.image;
    }

    public final CardSkinLayerResponse copy(@Json(name = "themed_image") Themes<String> image) {
        return new CardSkinLayerResponse(image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardSkinLayerResponse) && jl40.l(this.image, ((CardSkinLayerResponse) other).image);
    }

    public final Themes<String> getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    public String toString() {
        return "CardSkinLayerResponse(image=" + this.image + Extension.C_BRAKE;
    }
}
