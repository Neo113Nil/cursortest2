package com.yandex.mobile.ads.common;

import com.yandex.mobile.ads.banner.BannerAdSize;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.epx;
import xsna.jgp;
import xsna.ozl;
import xsna.zcl;

/* loaded from: classes8.dex */
public abstract class BidderTokenRequestConfiguration {
    public static final b Companion = new b();
    private final AdapterIdentity a;
    private final Map b;

    public static final class AppOpenAd extends BidderTokenRequestConfiguration {
        private final AdapterIdentity c;
        private final Map d;

        public AppOpenAd(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.c = adapterIdentity;
            this.d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppOpenAd)) {
                return false;
            }
            AppOpenAd appOpenAd = (AppOpenAd) obj;
            return epx.f(this.c, appOpenAd.c) && epx.f(this.d, appOpenAd.d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "AppOpenAd(adapterIdentity=" + this.c + ", parameters=" + this.d + ")";
        }
    }

    public static final class Banner extends BidderTokenRequestConfiguration {
        private final AdapterIdentity c;
        private final BannerAdSize d;
        private final Map e;

        public Banner(AdapterIdentity adapterIdentity, BannerAdSize bannerAdSize, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.c = adapterIdentity;
            this.d = bannerAdSize;
            this.e = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return epx.f(this.c, banner.c) && epx.f(this.d, banner.d) && epx.f(this.e, banner.e);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public BannerAdSize getBannerAdSize() {
            return this.d;
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.e;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            BannerAdSize bannerAdSize = this.d;
            return this.e.hashCode() + ((hashCode + (bannerAdSize == null ? 0 : bannerAdSize.hashCode())) * 31);
        }

        public String toString() {
            return "Banner(adapterIdentity=" + this.c + ", bannerAdSize=" + this.d + ", parameters=" + this.e + ")";
        }
    }

    @ozl
    public static final class Builder {
        private static final AdapterIdentity e = new AdapterIdentity("unknown", "0.0.0");
        private final AdType a;
        private AdapterIdentity b;
        private BannerAdSize c;
        private Map d = jgp.b;

        public Builder(AdType adType) {
            this.a = adType;
        }

        public final BidderTokenRequestConfiguration build() {
            AdapterIdentity adapterIdentity = this.b;
            if (adapterIdentity == null) {
                adapterIdentity = e;
            }
            switch (a.a[this.a.ordinal()]) {
                case 1:
                    return new Banner(adapterIdentity, this.c, this.d);
                case 2:
                    return new Interstitial(adapterIdentity, this.d);
                case 3:
                    return new Rewarded(adapterIdentity, this.d);
                case 4:
                    return new Native(adapterIdentity, this.d);
                case 5:
                    return new AppOpenAd(adapterIdentity, this.d);
                case 6:
                    return new Interstitial(adapterIdentity, this.d);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final Builder setBannerAdSize(BannerAdSize bannerAdSize) {
            this.c = bannerAdSize;
            return this;
        }

        public final Builder setParameters(Map<String, String> map) {
            this.d = map;
            return this;
        }
    }

    public static final class Interstitial extends BidderTokenRequestConfiguration {
        private final AdapterIdentity c;
        private final Map d;

        public Interstitial(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.c = adapterIdentity;
            this.d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interstitial)) {
                return false;
            }
            Interstitial interstitial = (Interstitial) obj;
            return epx.f(this.c, interstitial.c) && epx.f(this.d, interstitial.d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Interstitial(adapterIdentity=" + this.c + ", parameters=" + this.d + ")";
        }
    }

    public static final class Native extends BidderTokenRequestConfiguration {
        private final AdapterIdentity c;
        private final Map d;

        public Native(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.c = adapterIdentity;
            this.d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Native)) {
                return false;
            }
            Native r5 = (Native) obj;
            return epx.f(this.c, r5.c) && epx.f(this.d, r5.d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Native(adapterIdentity=" + this.c + ", parameters=" + this.d + ")";
        }
    }

    public static final class Rewarded extends BidderTokenRequestConfiguration {
        private final AdapterIdentity c;
        private final Map d;

        public Rewarded(AdapterIdentity adapterIdentity, Map<String, String> map) {
            super(adapterIdentity, map, null);
            this.c = adapterIdentity;
            this.d = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rewarded)) {
                return false;
            }
            Rewarded rewarded = (Rewarded) obj;
            return epx.f(this.c, rewarded.c) && epx.f(this.d, rewarded.d);
        }

        @Override // com.yandex.mobile.ads.common.BidderTokenRequestConfiguration
        public Map<String, String> getParameters() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public String toString() {
            return "Rewarded(adapterIdentity=" + this.c + ", parameters=" + this.d + ")";
        }
    }

    public /* synthetic */ BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map, zcl zclVar) {
        this(adapterIdentity, map);
    }

    public BannerAdSize getBannerAdSize() {
        return null;
    }

    public abstract Map<String, String> getParameters();

    private BidderTokenRequestConfiguration(AdapterIdentity adapterIdentity, Map map) {
        this.a = adapterIdentity;
        this.b = map;
    }
}
