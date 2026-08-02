package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes9.dex */
public class IconAdsLoader extends AbstractAdLoader<IconAds, IconAdsRequest> {

    public static class a implements AdLoader.Builder<IconAds, a, IconAdsLoader> {
        public AdLoadListener<IconAds> a;
        private String b;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public final /* bridge */ /* synthetic */ a withAdLoadListener(@Nullable AdLoadListener<IconAds> adLoadListener) {
            this.a = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public final /* bridge */ /* synthetic */ a withExt(String str) {
            this.b = str;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IconAdsLoader build() {
            return new IconAdsLoader(this);
        }
    }

    public IconAdsLoader(a aVar) {
        super(aVar.a, aVar.b);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    public final /* synthetic */ IconAds a(@NonNull b bVar, g[] gVarArr) {
        return new sg.bigo.ads.e.a(bVar, gVarArr);
    }
}
