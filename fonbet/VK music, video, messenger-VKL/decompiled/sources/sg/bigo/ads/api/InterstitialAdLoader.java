package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.interstitial.j;
import sg.bigo.ads.ad.interstitial.k;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes9.dex */
public class InterstitialAdLoader extends AbstractAdLoader<InterstitialAd, InterstitialAdRequest> {

    public static class Builder implements AdLoader.Builder<InterstitialAd, Builder, InterstitialAdLoader> {
        private AdLoadListener<InterstitialAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public InterstitialAdLoader build() {
            return new InterstitialAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<InterstitialAd> adLoadListener) {
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

    public InterstitialAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.api.InterstitialAd] */
    /* JADX WARN: Type inference failed for: r6v2, types: [sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.api.InterstitialAd] */
    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ InterstitialAd a(g gVar) {
        if (gVar.a.y() != 3 && gVar.a.y() != 20) {
            return (InterstitialAd) super.a(gVar);
        }
        int x = gVar.a.x();
        if (x == 1 || x == 2) {
            if (j.a == null) {
                j.a = (k.a) sg.bigo.ads.bl.a.a("sg.bigo.ads.api.INAdCreator", k.a.class);
            }
            k.a<?> aVar = j.a;
            if (aVar == null) {
                return null;
            }
            return aVar.getAdInstance(gVar);
        }
        if (x != 3) {
            return null;
        }
        if (j.b == null) {
            j.b = (k.a) sg.bigo.ads.bl.a.a("sg.bigo.ads.api.IBAdCreator", k.a.class);
        }
        k.a<?> aVar2 = j.b;
        if (aVar2 == null) {
            return null;
        }
        return aVar2.getAdInstance(gVar);
    }
}
