package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ae.h;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes9.dex */
public class RewardVideoAdLoader extends AbstractAdLoader<RewardVideoAd, RewardVideoAdRequest> {

    public static class Builder implements AdLoader.Builder<RewardVideoAd, Builder, RewardVideoAdLoader> {
        private AdLoadListener<RewardVideoAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public RewardVideoAdLoader build() {
            return new RewardVideoAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<RewardVideoAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public RewardVideoAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ RewardVideoAd a(g gVar) {
        if (gVar.a.y() != 4) {
            return (RewardVideoAd) super.a(gVar);
        }
        int x = gVar.a.x();
        if (x == 1 || x == 2) {
            return new h(gVar);
        }
        if (x != 3) {
            return null;
        }
        return new sg.bigo.ads.ae.b(gVar);
    }
}
