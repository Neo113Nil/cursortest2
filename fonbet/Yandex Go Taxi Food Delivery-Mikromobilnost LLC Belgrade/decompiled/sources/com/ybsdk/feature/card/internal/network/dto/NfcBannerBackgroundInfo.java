package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.Themes;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/NfcBannerBackgroundInfo;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "backgroundImage", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Themes;Lcom/ybsdk/core/common/data/network/dto/Themes;)V", "getBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/Themes;", "getBackgroundImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcBannerBackgroundInfo {
    private final Themes<String> backgroundColor;
    private final Themes<String> backgroundImage;

    public NfcBannerBackgroundInfo(@Json(name = "color") Themes<String> themes, @Json(name = "image") Themes<String> themes2) {
        this.backgroundColor = themes;
        this.backgroundImage = themes2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NfcBannerBackgroundInfo copy$default(NfcBannerBackgroundInfo nfcBannerBackgroundInfo, Themes themes, Themes themes2, int i, Object obj) {
        if ((i & 1) != 0) {
            themes = nfcBannerBackgroundInfo.backgroundColor;
        }
        if ((i & 2) != 0) {
            themes2 = nfcBannerBackgroundInfo.backgroundImage;
        }
        return nfcBannerBackgroundInfo.copy(themes, themes2);
    }

    public final Themes<String> component1() {
        return this.backgroundColor;
    }

    public final Themes<String> component2() {
        return this.backgroundImage;
    }

    public final NfcBannerBackgroundInfo copy(@Json(name = "color") Themes<String> backgroundColor, @Json(name = "image") Themes<String> backgroundImage) {
        return new NfcBannerBackgroundInfo(backgroundColor, backgroundImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcBannerBackgroundInfo)) {
            return false;
        }
        NfcBannerBackgroundInfo nfcBannerBackgroundInfo = (NfcBannerBackgroundInfo) other;
        return jl40.l(this.backgroundColor, nfcBannerBackgroundInfo.backgroundColor) && jl40.l(this.backgroundImage, nfcBannerBackgroundInfo.backgroundImage);
    }

    public final Themes<String> getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Themes<String> getBackgroundImage() {
        return this.backgroundImage;
    }

    public int hashCode() {
        int hashCode = this.backgroundColor.hashCode() * 31;
        Themes<String> themes = this.backgroundImage;
        return hashCode + (themes == null ? 0 : themes.hashCode());
    }

    public String toString() {
        return "NfcBannerBackgroundInfo(backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + Extension.C_BRAKE;
    }
}
