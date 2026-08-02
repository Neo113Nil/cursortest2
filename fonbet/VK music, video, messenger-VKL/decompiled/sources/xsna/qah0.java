package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.feed.design.view.newsfeed.ads_carousel.VkFeedOverlayProductCarousel;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.sharing.im_engine_impl.SharingImEngineActivity;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.video.profile.di.VideoProfileComponentImpl;
import com.vk.video.profile.presentation.VideoProfileWrapperFragment;
import com.vk.writebar.a;
import one.video.transform.TransformController;
import one.video.view.TransformOneVideoPlayerView;
import xsna.b78;
import xsna.m5x0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qah0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qah0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                rah0 rah0Var = (rah0) this.c;
                boolean z = !rah0Var.k;
                rah0Var.k = z;
                rah0Var.f.onNext(Boolean.valueOf(z));
                rah0Var.b.e(z);
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                SharingImEngineActivity sharingImEngineActivity = (SharingImEngineActivity) this.c;
                int i2 = SharingImEngineActivity.q0;
                break;
            case 4:
                break;
            case 5:
                SpeedView speedView = (SpeedView) this.c;
                int i3 = SpeedView.B;
                break;
            case 6:
                StickersDrawingViewGroup stickersDrawingViewGroup = (StickersDrawingViewGroup) this.c;
                int i4 = StickersDrawingViewGroup.j0;
                stickersDrawingViewGroup.invalidate();
                break;
            case 7:
                sgl0 sgl0Var = (sgl0) this.c;
                StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO ");
                sb.append(sgl0Var.a);
                bpn0 bpn0Var = sgl0Var.b;
                sb.append(rl3.Z((Enum[]) bpn0Var.getValue(), null, "(", ")", new l140(16), 25));
                sb.append("VALUES");
                sb.append(rl3.Z((Enum[]) bpn0Var.getValue(), null, "(", ")", new rgl0(i), 25));
                break;
            case 8:
                StoryEditorExtDepsComponentImpl storyEditorExtDepsComponentImpl = (StoryEditorExtDepsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = StoryEditorExtDepsComponentImpl.r;
                break;
            case 9:
                z3m0 z3m0Var = (z3m0) this.c;
                o1l0 o1l0Var = z3m0Var.f;
                if (o1l0Var != null) {
                    ((kdl0) o1l0Var).a(z3m0Var);
                }
                break;
            case 10:
                TransformOneVideoPlayerView transformOneVideoPlayerView = (TransformOneVideoPlayerView) this.c;
                int i5 = TransformOneVideoPlayerView.l;
                TransformController transformController = new TransformController(transformOneVideoPlayerView.getTransformConsumer());
                transformController.j(transformOneVideoPlayerView);
                break;
            case 11:
                break;
            case 12:
                UserProfileFragment userProfileFragment = (UserProfileFragment) this.c;
                int i6 = UserProfileFragment.p0;
                break;
            case 13:
                qyr0 qyr0Var = (qyr0) this.c;
                qcy<Object>[] qcyVarArr2 = qyr0.m1;
                break;
            case 14:
                break;
            case 15:
                VideoEmbedFragment videoEmbedFragment = (VideoEmbedFragment) this.c;
                int i7 = VideoEmbedFragment.q0;
                break;
            case 16:
                break;
            case 17:
                ((VideoOfflineFragment) this.c).S0.invoke();
                break;
            case 18:
                VideoProfileComponentImpl videoProfileComponentImpl = (VideoProfileComponentImpl) this.c;
                break;
            case 19:
                VideoProfileWrapperFragment videoProfileWrapperFragment = (VideoProfileWrapperFragment) this.c;
                int i8 = VideoProfileWrapperFragment.O;
                FragmentActivity activity = videoProfileWrapperFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 20:
                VideoView videoView = (VideoView) this.c;
                break;
            case 21:
                break;
            case 22:
                ((b78.b) this.c).a().invoke(sx40.c.b);
                break;
            case 23:
                break;
            case 24:
                gqu0 gqu0Var = (gqu0) this.c;
                break;
            case 25:
                VkFeedOverlayProductCarousel vkFeedOverlayProductCarousel = (VkFeedOverlayProductCarousel) this.c;
                int i9 = VkFeedOverlayProductCarousel.A;
                break;
            case 26:
                ((v5x0) this.c).C(m5x0.e.b);
                break;
            case 27:
                ((xkx0) this.c).C0();
                break;
            default:
                com.vk.writebar.g gVar = (com.vk.writebar.g) this.c;
                com.vk.writebar.a aVar = gVar.o;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.f(true);
                com.vk.writebar.a aVar2 = gVar.o;
                (aVar2 != null ? aVar2 : null).g();
                ((a.d) gVar.q.getValue()).a();
                break;
        }
        return s3q0.a;
    }
}
