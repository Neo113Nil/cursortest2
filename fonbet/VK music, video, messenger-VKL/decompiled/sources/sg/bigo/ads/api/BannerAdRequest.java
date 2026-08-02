package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.yup;

/* loaded from: classes9.dex */
public class BannerAdRequest extends b<BannerAdRequest> {

    @NonNull
    public final List<AdSize> h;

    public static class Builder extends c<Builder, BannerAdRequest> {
        private List<AdSize> mAdSizes;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.c
        public BannerAdRequest createAdRequest() {
            return new BannerAdRequest(this.mSlotId, this.mAdSizes, this.mServerBidPayload);
        }

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }
    }

    public BannerAdRequest(String str, List<AdSize> list, String str2) {
        super(str, str2);
        this.h = new ArrayList();
        if (list != null) {
            for (AdSize adSize : list) {
                if (adSize != null) {
                    this.h.add(adSize);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final /* synthetic */ BannerAdRequest a() {
        BannerAdRequest bannerAdRequest = new BannerAdRequest(d(), new ArrayList(this.h), this.a);
        bannerAdRequest.a(this.g.a);
        bannerAdRequest.b = this.b;
        bannerAdRequest.f = this.f;
        return bannerAdRequest;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final sg.bigo.ads.api.core.c b() {
        sg.bigo.ads.api.core.c b = super.b();
        if (b != null) {
            return b;
        }
        if (this.h.isEmpty()) {
            return new sg.bigo.ads.api.core.c(1001, yup.PERMISSION_NOT_DECLARED, "Ad sizes cannot be empty.");
        }
        return null;
    }

    @Override // sg.bigo.ads.api.b
    public int c() {
        return 2;
    }

    @Override // sg.bigo.ads.api.b
    public final Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("ad_size", sg.bigo.ads.ad.banner.a.a(this.h));
        return hashMap;
    }
}
