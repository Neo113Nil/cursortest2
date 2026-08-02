package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import defpackage.jl40;
import defpackage.ny61;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 $2\u00020\u0001:\u0001$B?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "", "Lcom/yandex/mobile/ads/common/AdType;", "adType", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "bannerAdSize", "Lcom/yandex/mobile/ads/common/AdTargeting;", "targeting", "", "", "parameters", "<init>", "(Lcom/yandex/mobile/ads/common/AdType;Lcom/yandex/mobile/ads/banner/BannerAdSize;Lcom/yandex/mobile/ads/common/AdTargeting;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Lcom/yandex/mobile/ads/common/AdType;", "getAdType", "()Lcom/yandex/mobile/ads/common/AdType;", "c", "Lcom/yandex/mobile/ads/banner/BannerAdSize;", "getBannerAdSize", "()Lcom/yandex/mobile/ads/banner/BannerAdSize;", "d", "Lcom/yandex/mobile/ads/common/AdTargeting;", "getTargeting", "()Lcom/yandex/mobile/ads/common/AdTargeting;", "e", "Ljava/util/Map;", "getParameters", "()Ljava/util/Map;", "a", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BidderTokenRequest {

    /* renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    private final AdType adType;

    /* renamed from: c, reason: from kotlin metadata */
    private final BannerAdSize bannerAdSize;

    /* renamed from: d, reason: from kotlin metadata */
    private final AdTargeting targeting;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map parameters;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/ads/common/BidderTokenRequest$a;", "", "Lcom/yandex/mobile/ads/common/AdTargeting;", "targeting", "", "", "parameters", "Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "nativeAd", "(Lcom/yandex/mobile/ads/common/AdTargeting;Ljava/util/Map;)Lcom/yandex/mobile/ads/common/BidderTokenRequest;", "native", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.yandex.mobile.ads.common.BidderTokenRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BidderTokenRequest nativeAd$default(Companion companion, AdTargeting adTargeting, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                adTargeting = null;
            }
            if ((i & 2) != 0) {
                map = b.f();
            }
            return companion.nativeAd(adTargeting, map);
        }

        public final BidderTokenRequest nativeAd(AdTargeting targeting, Map<String, String> parameters) {
            return new BidderTokenRequest(AdType.NATIVE, null, targeting, parameters);
        }
    }

    public BidderTokenRequest(AdType adType, BannerAdSize bannerAdSize, AdTargeting adTargeting, Map<String, String> map) {
        this.adType = adType;
        this.bannerAdSize = bannerAdSize;
        this.targeting = adTargeting;
        this.parameters = map;
        if (adType == AdType.BANNER && bannerAdSize == null) {
            ny61.g("bannerAdSize is required for Banner configuration");
            throw null;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !BidderTokenRequest.class.equals(other.getClass())) {
            return false;
        }
        BidderTokenRequest bidderTokenRequest = (BidderTokenRequest) other;
        return this.adType == bidderTokenRequest.adType && jl40.l(this.bannerAdSize, bidderTokenRequest.bannerAdSize) && jl40.l(this.targeting, bidderTokenRequest.targeting) && jl40.l(this.parameters, bidderTokenRequest.parameters);
    }

    public final AdType getAdType() {
        return this.adType;
    }

    public final BannerAdSize getBannerAdSize() {
        return this.bannerAdSize;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public int hashCode() {
        int hashCode = this.adType.hashCode() * 31;
        BannerAdSize bannerAdSize = this.bannerAdSize;
        int hashCode2 = (hashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0)) * 31;
        AdTargeting adTargeting = this.targeting;
        return this.parameters.hashCode() + ((hashCode2 + (adTargeting != null ? adTargeting.hashCode() : 0)) * 31);
    }
}
