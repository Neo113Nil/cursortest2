package xsna;

import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.api.di.VkVideoPromoComponent;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tus0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ tus0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoGrowthComponent) videoMinimizableDiscoveryFragment.ko().f.getValue()).Z7().show(((VkVideoPromoComponent) videoMinimizableDiscoveryFragment.ko().D.getValue()).Ka().d().f);
                return s3q0.a;
            default:
                int i3 = VideoMinimizableDiscoveryFragment.p1;
                return ((MarketComponent) videoMinimizableDiscoveryFragment.ko().t.getValue()).Ob();
        }
    }
}
