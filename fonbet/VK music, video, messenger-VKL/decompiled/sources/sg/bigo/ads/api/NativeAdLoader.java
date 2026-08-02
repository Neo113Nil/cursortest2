package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.O6;
import java.util.Map;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.api.core.g;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.controller.loader.AbstractAdLoader;

/* loaded from: classes9.dex */
public class NativeAdLoader extends AbstractAdLoader<NativeAd, NativeAdRequest> {

    public static class Builder implements AdLoader.Builder<NativeAd, Builder, NativeAdLoader> {
        private AdLoadListener<NativeAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public NativeAdLoader build() {
            return new NativeAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @NonNull
        public Builder withAdLoadListener(@Nullable AdLoadListener<NativeAd> adLoadListener) {
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

    public NativeAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.controller.loader.AbstractAdLoader
    @Nullable
    public final /* synthetic */ NativeAd a(g gVar) {
        Map<String, String> map;
        if (gVar.a.y() != 1) {
            return (NativeAd) super.a(gVar);
        }
        sg.bigo.ads.y.b a = sg.bigo.ads.y.a.a(gVar);
        if (a != null) {
            sg.bigo.ads.api.core.b bVar = (sg.bigo.ads.cp.a) a.f();
            if ((bVar instanceof sg.bigo.ads.cj.b) && bVar.am() && (map = ((sg.bigo.ads.cj.b) bVar).y) != null && !r.a((Object) O6.K0) && !r.a((Object) "1") && !map.containsKey(O6.K0)) {
                map.put(O6.K0, "1");
            }
        }
        return a;
    }
}
