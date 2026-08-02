package xsna;

import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.emailactualization.impl.di.EmailActualizationComponentImpl;
import com.vk.games.di.GamesCatalogComponentImpl;
import com.vk.music.bottomsheets.settings.di.MixSettingsComponentImpl;
import com.vk.newsfeed.impl.di.NewsfeedRouterComponentImpl;
import com.vk.profile.community.chats.impl.di.CommunityChatsComponentImpl;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.VKApplication;
import xsna.nu70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bb3 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bb3(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new nvq();
            case 1:
                return new ClipsViewersSdkComponentImpl.a();
            case 2:
                qcy<Object>[] qcyVarArr = CommunityChatsComponentImpl.b;
                return new kvg();
            case 3:
                qcy<Object>[] qcyVarArr2 = EmailActualizationComponentImpl.c;
                return new xbp();
            case 4:
                qcy<Object>[] qcyVarArr3 = GamesCatalogComponentImpl.s;
                return new rct();
            case 5:
                rsr rsrVar = oz50.k;
                rsr rsrVar2 = oz50.k;
                if (rsrVar2 == null) {
                    rsrVar2 = null;
                }
                rsrVar2.getClass();
                return FragmentWrapperActivity.class;
            case 6:
                return new tdw();
            case 7:
                int i = nu70.b;
                return nu70.a.a();
            case 8:
                return new MixSettingsComponentImpl.a();
            case 9:
                FeedFeatures feedFeatures = FeedFeatures.REDESIGN_TEXT_CHIP;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 10:
                return new llq0();
            case 11:
                VKApplication.a aVar = VKApplication.c;
                return Integer.valueOf(com.vk.toggle.d.m().a);
            case 12:
                VideoFeatures videoFeatures = VideoFeatures.CHANNEL_EMBEDDED_VIDEOS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                return new NewsfeedRouterComponentImpl.a();
            default:
                OKVoipEngine oKVoipEngine = com.vk.voip.ui.c.r;
                com.vk.voip.ui.c.b.getClass();
                return new d8j(oKVoipEngine, com.vk.voip.ui.c.j0());
        }
    }
}
