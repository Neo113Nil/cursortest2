package xsna;

import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import com.vk.voip.ui.permissions.ScreencastPermissionFragment;
import java.lang.annotation.Annotation;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fog0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ fog0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        switch (this.b) {
            case 0:
                return rhs.e();
            case 1:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 2:
                return new rsl0();
            case 3:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_PHOTO;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 4:
                return "handleUpload: nothing to upload";
            case 5:
                int i = VideoCatalogSearchRootVh.S;
                VideoFeatures videoFeatures = VideoFeatures.LAZY_SEARCH_VIEW;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 6:
                return s3q0.a;
            case 7:
                return new s290();
            case 8:
                return new tub0(fpf0.a(VkCounter.CounterAppearance.class), new Annotation[0]);
            case 9:
                dhw0 L = com.vk.voip.ui.c.b.L();
                if (L == null) {
                    return new VoipActionsFeatureState.l(false, false);
                }
                Set<CallMemberId> set = L.h;
                boolean b = com.vk.voip.ui.actions.feature.b.b();
                boolean z2 = set.size() >= 3;
                if (!(set.size() == 1) && b) {
                    z = true;
                }
                return new VoipActionsFeatureState.l(z, z2);
            default:
                return new ScreencastPermissionFragment();
        }
    }
}
