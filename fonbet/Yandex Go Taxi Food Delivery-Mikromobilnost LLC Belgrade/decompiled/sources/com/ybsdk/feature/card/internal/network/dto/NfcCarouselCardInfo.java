package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/NfcCarouselCardInfo;", "", "plusCashback", "", "banner", "Lcom/ybsdk/feature/card/internal/network/dto/NfcTokenizationBannerInfo;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/card/internal/network/dto/NfcTokenizationBannerInfo;)V", "getPlusCashback", "()Ljava/lang/String;", "getBanner", "()Lcom/ybsdk/feature/card/internal/network/dto/NfcTokenizationBannerInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NfcCarouselCardInfo {
    private final NfcTokenizationBannerInfo banner;
    private final String plusCashback;

    public NfcCarouselCardInfo(@Json(name = "plus_cashback") String str, @Json(name = "banner") NfcTokenizationBannerInfo nfcTokenizationBannerInfo) {
        this.plusCashback = str;
        this.banner = nfcTokenizationBannerInfo;
    }

    public static /* synthetic */ NfcCarouselCardInfo copy$default(NfcCarouselCardInfo nfcCarouselCardInfo, String str, NfcTokenizationBannerInfo nfcTokenizationBannerInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nfcCarouselCardInfo.plusCashback;
        }
        if ((i & 2) != 0) {
            nfcTokenizationBannerInfo = nfcCarouselCardInfo.banner;
        }
        return nfcCarouselCardInfo.copy(str, nfcTokenizationBannerInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlusCashback() {
        return this.plusCashback;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcTokenizationBannerInfo getBanner() {
        return this.banner;
    }

    public final NfcCarouselCardInfo copy(@Json(name = "plus_cashback") String plusCashback, @Json(name = "banner") NfcTokenizationBannerInfo banner) {
        return new NfcCarouselCardInfo(plusCashback, banner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcCarouselCardInfo)) {
            return false;
        }
        NfcCarouselCardInfo nfcCarouselCardInfo = (NfcCarouselCardInfo) other;
        return jl40.l(this.plusCashback, nfcCarouselCardInfo.plusCashback) && jl40.l(this.banner, nfcCarouselCardInfo.banner);
    }

    public final NfcTokenizationBannerInfo getBanner() {
        return this.banner;
    }

    public final String getPlusCashback() {
        return this.plusCashback;
    }

    public int hashCode() {
        String str = this.plusCashback;
        return this.banner.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "NfcCarouselCardInfo(plusCashback=" + this.plusCashback + ", banner=" + this.banner + Extension.C_BRAKE;
    }
}
