package xsna;

import android.content.Context;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton$Left$Main;
import com.vk.profile.user.impl.di.UserProfileComponentImpl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.impl.di.StoryViewerComponentImpl;
import com.vk.toggle.b;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.upload.impl.videoviewer.presentation.fragment.VideoViewerFragmentInternalComponent;
import com.vkontakte.android.R;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class e1m0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ e1m0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        switch (this.b) {
            case 0:
                return ((StoriesComponent) ((k7m) m7m.f(f1m0.b)).a(fpf0.a(StoriesComponent.class))).r2();
            case 1:
                qcy<Object>[] qcyVarArr = StoryViewerComponentImpl.s;
                StoriesFeatures storiesFeatures = StoriesFeatures.NEW_PRELOADER;
                storiesFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(storiesFeatures));
            case 2:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AVATAR_LIVE_BADGE;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 3:
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_SPORT_TOPSHELF_SUBSCRIBE;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 4:
                qcy<Object>[] qcyVarArr2 = UserProfileComponentImpl.m;
                return new rh80();
            case 5:
                return Float.valueOf(x5r0.a(6, 1));
            case 6:
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return Integer.valueOf(context.getColor(R.color.vk_blue_200_muted));
            case 7:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i = com.vk.toggle.b.A.i(StoriesFeatures.VERTICALIZATION);
                return Long.valueOf((i == null || (g = i.g()) == null) ? 5000L : g.optLong("default_delay_ms"));
            case 8:
                return new jwx(2, 30);
            case 9:
                return Boolean.valueOf(fxc0.B().J().Y0());
            case 10:
                return Boolean.valueOf(fxc0.B().J().t0());
            case 11:
                VideoFeatures videoFeatures3 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                videoFeatures3.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures3));
            case 12:
                VideoViewerFragmentInternalComponent.a aVar = VideoViewerFragmentInternalComponent.e;
                return new yrt0(new ngj0());
            case 13:
                return VkCell.Middle.d.b.Companion.serializer();
            case 14:
                return VkCellSkeleton$Left$Main.Size.Companion.serializer();
            default:
                return new pco(0);
        }
    }
}
