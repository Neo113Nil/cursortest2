package xsna;

import android.content.Context;
import com.vk.clips.upload.vk.impl.di.ClipsUploadVkComponentImpl;
import com.vk.ecomm.reviews.impl.di.ReviewsComponentImpl;
import com.vk.feed.blacklist.impl.di.BlacklistComponentImpl;
import com.vk.im.sync.impl.di.ImSynchronizationHelpersComponentImpl;
import com.vk.libvideo.impl.di.AutoPlayDelegateComponentImpl;
import com.vk.music.bottomsheets.settings.di.MixSettingsComponentImpl;
import com.vk.music.di.MusicCatalogSectionIdProviderComponentImpl;
import com.vk.oauth.di.OAuthComponentImpl;
import com.vk.profile.community.impl.di.CommunityComponentImpl;
import com.vk.registration.funnels.RegistrationElementsTracker;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.feedback_gestures.GestureFeedback;
import com.vk.voip.ui.c;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.task.di.components.navigation.VkAppRouterComponentImpl;
import xsna.o360;
import xsna.pzv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class sq6 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ sq6(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new i1t0(bo.h(), 0);
            case 1:
                qcy<Object>[] qcyVarArr = BlacklistComponentImpl.c;
                return new fe7(new ofy0(4));
            case 2:
                qcy<Object>[] qcyVarArr2 = ClipsUploadVkComponentImpl.h;
                return new zlf();
            case 3:
                return new CommunityComponentImpl.a();
            case 4:
                return new StoriesComponentImpl.a();
            case 5:
                bpn0 bpn0Var = o360.e;
                return o360.a.a();
            case 6:
                pzv.a aVar = pzv.x0;
                return Boolean.FALSE;
            case 7:
                return ply.a();
            case 8:
                return e43.l("messages", "community_channels");
            case 9:
                return new ImSynchronizationHelpersComponentImpl.a();
            case 10:
                qcy<Object>[] qcyVarArr3 = MixSettingsComponentImpl.c;
                return new v4v0();
            case 11:
                qcy<Object>[] qcyVarArr4 = OAuthComponentImpl.c;
                return new fnr0();
            case 12:
                if (frf0.b != null) {
                    frf0.c = null;
                }
                RegistrationElementsTracker registrationElementsTracker = RegistrationElementsTracker.a;
                RegistrationElementsTracker.b.clear();
                frf0.a.b.clear();
                return s3q0.a;
            case 13:
                l03 l03Var = wmi0.h;
                (l03Var != null ? l03Var : null).getClass();
                return asu0.a.c();
            case 14:
                return new ReviewsComponentImpl.a();
            case 15:
                mgn0 mgn0Var = dgn0.a;
                return (mgn0Var != null ? mgn0Var : null).d;
            case 16:
                VKApplication.a aVar2 = VKApplication.c;
                asu0.a.getClass();
                return asu0.n();
            case 17:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_PUSH_TO_COMMENTS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 18:
                return new MusicCatalogSectionIdProviderComponentImpl.a();
            case 19:
                return new VkAppRouterComponentImpl.a();
            case 20:
                return new AutoPlayDelegateComponentImpl.a();
            case 21:
                return new t13();
            case 22:
                Context context = e43.a;
                return new whe0(context != null ? context : null);
            case 23:
                com.vk.voip.ui.c.p.getClass();
                Context context2 = e43.a;
                return new wot(com.vk.voip.ui.c.r, com.vk.voip.ui.c.k0, com.vk.voip.ui.c.Y, new su9(com.vk.voip.ui.c.X, (izs) new c.g(GestureFeedback.Companion)), q6x.u(context2 != null ? context2 : null), new jzm0(13));
            default:
                return new hjt();
        }
    }
}
