package xsna;

import com.vk.catalog.mvi.section.screen.impl.di.CatalogSectionScreenComponentImpl;
import com.vk.channels.impl.list.onboarding.di.ChannelsOnboardingDiComponent;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingComponentImpl;
import com.vk.im.engine.di.event.ImRxEventObserverComponentImpl;
import com.vk.im.engine.reporters.performance.events.VkmSuccessRateEventBuilder;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.registration.funnels.di.SakAnalyticsComponentImpl;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.stereo.stub.create.di.VoipStereoCreateRoomComponentStub;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.fragments.friends.di.FriendsListComponentImpl;
import com.vkontakte.android.push.PushComponentImpl;
import kotlin.collections.EmptySet;
import xsna.asu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jbw implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ jbw(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new ImRxEventObserverComponentImpl.a();
            case 1:
                return new tiw();
            case 2:
                return pdv0.a;
            case 3:
                return EmptySet.b;
            case 4:
                return new CatalogSectionScreenComponentImpl.a();
            case 5:
                b0g b0gVar = b0g.a;
                return Integer.valueOf(b0g.b() ? 8 : 4);
            case 6:
                return new ih0();
            case 7:
                qcy<Object>[] qcyVarArr = PushComponentImpl.b;
                return new uev0(null);
            case 8:
                qcy<Object>[] qcyVarArr2 = SakAnalyticsComponentImpl.f;
                return new go10();
            case 9:
                return new OnlineBookingComponentImpl.a();
            case 10:
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_VIDEO_PRELOADER_PART;
                storiesFeatures.getClass();
                if (com.vk.toggle.b.A.a(storiesFeatures)) {
                    return new x8m0();
                }
                return null;
            case 11:
                return new w2n0(VkmSuccessRateEventBuilder.EventName.PINNED_MSG_OPEN);
            case 12:
                VKApplication.a aVar = VKApplication.c;
                return m7m.e();
            case 13:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_DYNAMIC_POLL;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                return new FriendsListComponentImpl.a();
            case 15:
                return new OnboardingScreensComponentImpl.a();
            case 16:
                return new ChannelsOnboardingDiComponent.a(new fz5());
            case 17:
                asu0.a.getClass();
                if (((Boolean) asu0.H.getValue()).booleanValue()) {
                    return asu0.n();
                }
                return asu0.E((asu0.a) asu0.G(asu0.l.a, asu0.o).invoke(), "vk-im_folder-thread-");
            default:
                return new VoipStereoCreateRoomComponentStub.a();
        }
    }

    public /* synthetic */ jbw(VKApplication vKApplication) {
        this.b = 12;
    }
}
