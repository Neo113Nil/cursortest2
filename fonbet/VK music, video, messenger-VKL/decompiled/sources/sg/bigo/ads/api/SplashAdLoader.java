package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes9.dex */
public class SplashAdLoader extends AbstractAdLoader<SplashAd, SplashAdRequest> {

    public static class Builder implements AdLoader.Builder<SplashAd, Builder, SplashAdLoader> {
        private AdLoadListener<SplashAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public SplashAdLoader build() {
            return new SplashAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<SplashAd> adLoadListener) {
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

    public SplashAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ SplashAd a(g gVar) {
        if (gVar.a.y() != 12) {
            return (SplashAd) super.a(gVar);
        }
        o q = gVar.a.d().q();
        o e = gVar.a.e();
        sg.bigo.ads.y.b a = sg.bigo.ads.y.a.a(gVar);
        if (a == null) {
            return null;
        }
        return new sg.bigo.ads.ad.splash.b(a, gVar, q, e);
    }
}
