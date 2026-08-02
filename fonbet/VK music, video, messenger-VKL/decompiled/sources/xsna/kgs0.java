package xsna;

import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import com.vk.video.ui.discovery.recommendations.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class kgs0 implements izs {
    public final /* synthetic */ VideoDiscoveryRecommendationsSourceArgs b;
    public final /* synthetic */ int c;

    public /* synthetic */ kgs0(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, int i) {
        this.b = videoDiscoveryRecommendationsSourceArgs;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoDiscoveryRecommendationsRepository.a aVar = (VideoDiscoveryRecommendationsRepository.a) obj;
        return new b.a(this.b, aVar.a, aVar.d, aVar.b, this.c, aVar.c);
    }
}
