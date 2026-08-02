package xsna;

import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ufs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ufs0(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        VideoDiscoveryRecommendationsRepository.a aVar = (VideoDiscoveryRecommendationsRepository.a) obj;
        c3t c3tVar = aVar.a;
        ArrayList arrayList = (ArrayList) c3tVar.b;
        int i = c3tVar.a;
        int size = arrayList.size() + this.b;
        Integer valueOf = Integer.valueOf(size);
        if (size >= i) {
            valueOf = null;
        }
        return new VideoDiscoveryCatalogRepository$Section(this.c, this.d, valueOf != null ? valueOf.toString() : null, arrayList, aVar.c, aVar.d, aVar.b, 16);
    }
}
