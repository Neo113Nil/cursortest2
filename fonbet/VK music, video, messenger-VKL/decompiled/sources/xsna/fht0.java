package xsna;

import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import com.vk.video.ui.slider.impl.SliderInteractiveVideoVh;
import com.vk.video.ui.slider.impl.VideoSliderAutoPlayHolder;
import kotlin.Lazy;

/* compiled from: VideoSliderItemFactoryImpl.kt */
/* loaded from: classes7.dex */
public final class fht0 implements eht0 {
    public final Object a;
    public final Object b;

    public fht0(Lazy<? extends VideoShareComponent> lazy, Lazy<? extends DonutVideoComponent> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.eht0
    public final VideoSliderAutoPlayHolder a(String str) {
        return new VideoSliderAutoPlayHolder(this.a, this.b, str);
    }

    @Override // xsna.eht0
    public final SliderInteractiveVideoVh b(b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider) {
        return new SliderInteractiveVideoVh(b5aVar, searchStatInfoProvider);
    }
}
