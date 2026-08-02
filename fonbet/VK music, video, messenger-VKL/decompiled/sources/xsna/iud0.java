package xsna;

import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.services.core.di.ServiceProvider;
import com.vk.log.L;
import com.vk.toggle.features.SearchFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class iud0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ iud0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        AdRepository initialize$lambda$220$lambda$67;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return new kof0();
            case 2:
                initialize$lambda$220$lambda$67 = ServiceProvider.initialize$lambda$220$lambda$67();
                return initialize$lambda$220$lambda$67;
            case 3:
                if (!L.a()) {
                    cvk.u(R.string.settings_upload_debug_disabled, false);
                }
                return s3q0.a;
            case 4:
                return new ucg0();
            case 5:
                x19.O(xgx0.a, "Resume bannerAd failed: cannot create banner view");
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                return androidx.compose.runtime.k.b(Boolean.FALSE);
            case 8:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_VIDEO_HISTORY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 9:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_FIRST_SCREEN_VISIBLE_IMAGES_METRIC;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 10:
                qcy<Object>[] qcyVarArr = VideoGrowthComponentImpl.k;
                return new ios0();
            case 11:
                return new ist0();
            case 12:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_RECOM_UI_FIX;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            default:
                return tlo0.Companion.serializer();
        }
    }
}
