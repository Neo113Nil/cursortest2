package xsna;

import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.profile.community.details.api.di.CommunityDetailsComponent;
import com.vk.story.api.di.StoriesComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yef implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ yef(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((MediaPipelineComponent) this.c.a(fpf0.a(MediaPipelineComponent.class))).Gd();
            case 1:
                return ((StoriesComponent) this.c.a(fpf0.a(StoriesComponent.class))).eb();
            case 2:
                return (CommunityDetailsComponent) this.c.a(fpf0.a(CommunityDetailsComponent.class));
            case 3:
                return (MarketShopConditionsComponent) this.c.mo408a(fpf0.a(MarketShopConditionsComponent.class));
            default:
                return (ClipEditComponent) this.c.a(fpf0.a(ClipEditComponent.class));
        }
    }
}
